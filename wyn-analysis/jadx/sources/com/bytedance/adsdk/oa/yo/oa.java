package com.bytedance.adsdk.oa.yo;

import N0.a;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class oa {
    public int bcc;
    public PointF cq;
    public int cz;
    public boolean dj;
    public float ivm;
    public int lw;
    public uef moa;

    /* renamed from: oa, reason: collision with root package name */
    public String f24611oa;
    public String uef;
    public PointF wrv;
    public float xs;
    public float yo;
    public float zjm;

    public enum uef {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public oa(String str, String str2, float f10, uef uefVar, int i5, float f11, float f12, int i10, int i11, float f13, boolean z2, PointF pointF, PointF pointF2) {
        uef(str, str2, f10, uefVar, i5, f11, f12, i10, i11, f13, z2, pointF, pointF2);
    }

    public int hashCode() {
        int iOrdinal = ((this.moa.ordinal() + (((int) (a.c(this.uef.hashCode() * 31, 31, this.f24611oa) + this.yo)) * 31)) * 31) + this.lw;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.ivm);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.bcc;
    }

    public void uef(String str, String str2, float f10, uef uefVar, int i5, float f11, float f12, int i10, int i11, float f13, boolean z2, PointF pointF, PointF pointF2) {
        this.uef = str;
        this.f24611oa = str2;
        this.yo = f10;
        this.moa = uefVar;
        this.lw = i5;
        this.ivm = f11;
        this.xs = f12;
        this.bcc = i10;
        this.cz = i11;
        this.zjm = f13;
        this.dj = z2;
        this.wrv = pointF;
        this.cq = pointF2;
    }

    public oa() {
    }
}
