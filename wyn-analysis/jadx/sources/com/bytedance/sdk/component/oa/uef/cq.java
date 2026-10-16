package com.bytedance.sdk.component.oa.uef;

/* loaded from: classes.dex */
public class cq {
    public uef ivm;
    public byte[] lw;
    public String moa;
    public cz yo;

    public enum uef {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public cq() {
    }

    public static cq uef(cz czVar, String str) {
        return new cq(czVar, str, uef.STRING_TYPE);
    }

    public cq(cz czVar, String str, uef uefVar) {
        this.yo = czVar;
        this.moa = str;
        this.ivm = uefVar;
    }

    public static cq uef(cz czVar, byte[] bArr) {
        return new cq(czVar, bArr, uef.BYTE_ARRAY_TYPE);
    }

    public cq(cz czVar, byte[] bArr, uef uefVar) {
        this.yo = czVar;
        this.lw = bArr;
        this.ivm = uefVar;
    }
}
