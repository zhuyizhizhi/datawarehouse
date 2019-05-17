package com.jlgl.bigdata.udf.common;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class udf_transjson extends UDF {
    public  int evaluate(Text votetools){
        String s=votetools.toString();
        String []ss=s.split("},");
        int length=s.trim().length();
        return  length;
    }

    public static void main(String[] args){
       // Text text=new Text("[Document{{_id=B1MC011, typ=songtouch, desc=Lesson 1-1, resource=Document{{_id=B1MC011, typ=video}}}}, Document{{_id=B1MC012, typ=song, desc=Lesson 1-2, resource=Document{{_id=B1MC012, typ=song, tgt=https://jiliguala.com/nougat-page.html?cid=B1MC012}}}}, Document{{_id=B1MC013, typ=word, desc=Lesson 1-3, resource=Document{{_id=B1MC013, typ=word, tgt=https://jiliguala.com/nougat-page.html?cid=B1MC013}}}}, Document{{_id=B1MC014, typ=pronounce, desc=Lesson 1-4, resource=Document{{_id=B1MC014, typ=pronounce}}}}, Document{{_id=B1MC015, typ=interaction, desc=Lesson 1-5, resource=Document{{_id=B1MC015, typ=video}}}}]");
        //System.out.println(new udf_test().evaluate(text));
        String s="[Document{{_id=B1MC011, typ=songtouch, desc=Lesson 1-1, resource=Document{{_id=B1MC011, typ=video}}}}, Document{{_id=B1MC012, typ=song, desc=Lesson 1-2, resource=Document{{_id=B1MC012, typ=song, tgt=https://jiliguala.com/nougat-page.html?cid=B1MC012}}}}, Document{{_id=B1MC013, typ=word, desc=Lesson 1-3, resource=Document{{_id=B1MC013, typ=word, tgt=https://jiliguala.com/nougat-page.html?cid=B1MC013}}}}, Document{{_id=B1MC014, typ=pronounce, desc=Lesson 1-4, resource=Document{{_id=B1MC014, typ=pronounce}}}}, Document{{_id=B1MC015, typ=interaction, desc=Lesson 1-5, resource=Document{{_id=B1MC015, typ=video}}}}]";
       //String s="[Document{{ttl=London Bridge, thmb=https://up.jiliguala.com/b1mc/B1SP01_v3.png}}, Document{{ttl=Ribon Game, thmb=https://up.jiliguala.com/b1mc/RPT1201_v3.png}}]";
        String []ss=s.split("},");
        for(int i=0;i<ss.length;i++){
            System.out.println(ss[i]);
        }
    }
}
