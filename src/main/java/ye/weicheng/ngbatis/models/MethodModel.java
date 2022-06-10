// Copyright 2022-present Weicheng Ye. All rights reserved.
// Use of this source code is governed by a MIT-style license that can be
// found in the LICENSE file.
package ye.weicheng.ngbatis.models;

import java.lang.reflect.Method;

/**
 * XXXDao.java 中的单个方法信息，以及 xml 中 子标签下的文本数据酷操作脚本 CQL
 *
 * @author yeweicheng
 * <br>Now is history!
 */
public class MethodModel {

    // ---------------- info in xml start ---------------------
    private String id;

    private String text; // cql

    private Class parameterType;

    private Class resultType;

    private Method method;

    // ---------------- info in interface start ---------------------
    private String signature;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Class getParameterType() {
        return parameterType;
    }

    public void setParameterType(Class parameterType) {
        this.parameterType = parameterType;
    }

    public Class getResultType() {
        return resultType;
    }

    public void setResultType(Class resultType) {
        this.resultType = resultType;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
