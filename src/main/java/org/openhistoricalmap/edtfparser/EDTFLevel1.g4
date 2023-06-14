/*
 * Copyright 2021 Richard Welty
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

grammar EDTFLevel1;

DIGIT : [0-9] ;

/* j: is for compatibility with potential OSM legacy cases */
Julian : 'j:' | 'jl:' | 'julian:' ;
Gregorian : 'gr:' | 'gregorian:' ;
JulianDay: 'jd:' ;

Year : '-'? DIGIT DIGIT DIGIT DIGIT
     | 'Y' '-'? DIGIT DIGIT DIGIT DIGIT DIGIT+
     ;

YearPartial : '-'? DIGIT DIGIT DIGIT 'X'
            | '-'? DIGIT DIGIT 'XX'
            | '-'? DIGIT 'XXX'
            ;

/* impose month/day/season interpretation in action of parser rule */
TwoDigit : DIGIT DIGIT ;
TwoDigitPartial : DIGIT 'X' ;


date : Year '-' TwoDigit '-' (TwoDigit | TwoDigitPartial )
     | Year '-' ( TwoDigit | TwoDigitPartial )
     | Year
     | YearPartial
     ;

qualifiedDate : date '?'
              | date '~'
              | date '%'
              ;

time : 'T' TwoDigit (':' TwoDigit (':' TwoDigit)?)? ;

dateTime : qualifiedDate
         | date time?
         ;

/* starting non terminal */
/* return will be a list of exactly one date/time, or of a pair of
 two date/times or one date/time and one null. a pair indicates an
 interval and a null indicates open end on either side. */

dateOrInterval :
               | dateTime '/' dateTime
               | dateTime '/' | dateTime '/..'
               | dateTime
               | '/' dateTime | '../' dateTime
               ;

gregorianDate : dateOrInterval
              | Gregorian ' '* dateOrInterval
              ;

julianDate : Julian ' '* DIGIT DIGIT DIGIT DIGIT DIGIT ;

julianDay : JulianDay ' '* '-'? DIGIT+;

dateSpecification : gregorianDate
                  | julianDate
                  | julianDay
                  ;
