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

package org.openhistoricalmap.edtfparser;

import java.util.*;
import org.openhistoricalmap.OHMDateAPI.*;

/**
 *
 * @author rwelty
 */
public class DateTimeSpecification implements OHMDateSpec {

    private SpecType specType;
    private DateType dateType;
    
    private ArrayList<OHMDateTime> dates = new ArrayList<OHMDateTime>();

    /**
     * @return the dates
     */
    public ArrayList<OHMDateTime> getDates() {
        return dates;
    }

    /**
     * @param dates the dates to set
     */
    public void setDates(ArrayList<OHMDateTime> dates) {
        this.dates = dates;
    }

    /**
     * @return the specType
     */
    public SpecType getSpecType() {
        return specType;
    }

    /**
     * @param specType the specType to set
     */
    public void setSpecType(SpecType specType) {
        this.specType = specType;
    }

    /**
     * @return the dateType
     */
    public DateType getDateType() {
        return dateType;
    }

    /**
     * @param dateType the dateType to set
     */
    public void setDateType(DateType dateType) {
        this.dateType = dateType;
    }
}
