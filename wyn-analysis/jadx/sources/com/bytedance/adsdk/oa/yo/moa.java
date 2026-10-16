package com.bytedance.adsdk.oa.yo;

import N0.a;
import com.bytedance.adsdk.oa.yo.oa.ab;
import java.util.List;

/* loaded from: classes.dex */
public class moa {
    private final String ivm;
    private final String lw;
    private final double moa;

    /* renamed from: oa, reason: collision with root package name */
    private final char f24610oa;
    private final List<ab> uef;
    private final double yo;

    public moa(List<ab> list, char c10, double d3, double d5, String str, String str2) {
        this.uef = list;
        this.f24610oa = c10;
        this.yo = d3;
        this.moa = d5;
        this.lw = str;
        this.ivm = str2;
    }

    public static int uef(char c10, String str, String str2) {
        return str2.hashCode() + a.c(c10 * 31, 31, str);
    }

    public int hashCode() {
        return uef(this.f24610oa, this.ivm, this.lw);
    }

    public double oa() {
        return this.moa;
    }

    public List<ab> uef() {
        return this.uef;
    }
}
