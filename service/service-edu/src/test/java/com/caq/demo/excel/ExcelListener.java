package com.caq.demo.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public class ExcelListener extends AnalysisEventListener<DemoData> {
    @Override
    public void invoke(DemoData data, AnalysisContext context) {
        System.out.println("******" + data);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头" + headMap);
    }

    //读取完成之后
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
