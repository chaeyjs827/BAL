package com.java.basic.sldt.code0411;

import java.awt.print.PrinterAbortException;

/**
 * @author seongnamfc
 * @package com.java.basic.sldt.code0411
 * @file MarketProgram
 * @description
 * @date 2022/04/11
 */
public class MarketProgram {

        private ParamDto paramDto;

//        public MarketProgram(ParamDto paramDto) {
//                this.paramDto = paramDto;
//        }

        public void call(ParamDto paramDto) {
                this.paramDto = paramDto;
        }

        public void getRequest() {
                System.out.println(this.paramDto);
        }


}
