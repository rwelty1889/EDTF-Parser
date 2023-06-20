/*
BSD 2-Clause License

Copyright (c) 2023, Richard Welty

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 */
package org.openhistoricalmap.edtfparser;

import java.time.*;
import org.openhistoricalmap.OHMDateAPI.OHMDateTime;


/**
 * Container for a EDTF Date/Time for Level 0 or 1,
 * with extra Julian date features.
 * 
 * @author rwelty
 */
public class DateTime implements OHMDateTime {

    private LocalTime time;
    private LocalDate date;
    private ZoneOffset offset;
    
    /* this should be set up as a mask in anticipation of L2 */
    private Integer yearUnspecified = 0;
    private Integer monthUnspecified = 0;
    private Integer dayUnspecified = 0;
    final public Integer onesMask = 1;
    final public Integer tensMask = 2;
    final public Integer hundredsMask = 4;    
    
    private Boolean approximate = false;
    private Boolean uncertain = false;
    
    /**
     *
     * @param date
     * @param time
     */
    public DateTime( LocalDate date, LocalTime time ){
        this.time = time;
        this.date = date;
    }
    
    public DateTime(){
    }

    /**
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the offset
     */
    public ZoneOffset getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(ZoneOffset offset) {
        this.offset = offset;
    }

    /**
     * @return the yearUnspecified
     */
    public Integer getYearUnspecified() {
        return yearUnspecified;
    }

    /**
     * @param yearUnspecified the yearUnspecified to set
     */
    public void setYearUnspecified(Integer yearUnspecified) {
        this.yearUnspecified = yearUnspecified;
    }

    /**
     * @return the monthUnspecified
     */
    public Integer getMonthUnspecified() {
        return monthUnspecified;
    }

    /**
     * @param monthUnspecified the monthUnspecified to set
     */
    public void setMonthUnspecified(Integer monthUnspecified) {
        this.monthUnspecified = monthUnspecified;
    }

    /**
     * @return the dayUnspecified
     */
    public Integer getDayUnspecified() {
        return dayUnspecified;
    }

    /**
     * @param dayUnspecified the dayUnspecified to set
     */
    public void setDayUnspecified(Integer dayUnspecified) {
        this.dayUnspecified = dayUnspecified;
    }

    public Boolean isApproximate(){
        return approximate;
    }
    
    public Boolean isUncertain(){
        return uncertain;
    }

    public void setApproximate( Boolean a){
        approximate = a;
    }

    public void setUncertain( Boolean u){
        uncertain = u;
    }
}
