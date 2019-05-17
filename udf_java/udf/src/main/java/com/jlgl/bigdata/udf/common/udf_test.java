package com.jlgl.bigdata.udf.common;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public class udf_test extends UDF {
    public  int evaluate(Text votetools){
        String s=votetools.toString();
        int length=s.trim().length();
        return  length;
    }

    public static void main(String[] args){
        Text text=new Text("2323");
        System.out.println(new udf_test().evaluate(text));
    }
}


