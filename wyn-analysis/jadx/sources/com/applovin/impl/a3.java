package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* loaded from: classes.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20923a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f20924b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20925c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f20926d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f20927e;

    /* renamed from: f, reason: collision with root package name */
    private final C1639h f20928f;

    public a3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, C1639h c1639h) {
        this.f20923a = str;
        this.f20924b = maxAdFormat;
        this.f20925c = map;
        this.f20926d = map2;
        this.f20927e = map3;
        this.f20928f = c1639h;
    }

    public boolean a(Object obj) {
        return obj instanceof a3;
    }

    public String b() {
        return this.f20923a;
    }

    public Map c() {
        return this.f20927e;
    }

    public Map d() {
        return this.f20926d;
    }

    public Map e() {
        return this.f20925c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (!a3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = a3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = a3Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = a3Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = a3Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = a3Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        C1639h c1639hF = f();
        C1639h c1639hF2 = a3Var.f();
        return c1639hF != null ? c1639hF.equals(c1639hF2) : c1639hF2 == null;
    }

    public C1639h f() {
        return this.f20928f;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        int iHashCode2 = ((iHashCode + 59) * 59) + (maxAdFormatA == null ? 43 : maxAdFormatA.hashCode());
        Map mapE = e();
        int iHashCode3 = (iHashCode2 * 59) + (mapE == null ? 43 : mapE.hashCode());
        Map mapD = d();
        int iHashCode4 = (iHashCode3 * 59) + (mapD == null ? 43 : mapD.hashCode());
        Map mapC = c();
        int iHashCode5 = (iHashCode4 * 59) + (mapC == null ? 43 : mapC.hashCode());
        C1639h c1639hF = f();
        return (iHashCode5 * 59) + (c1639hF != null ? c1639hF.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public MaxAdFormat a() {
        return this.f20924b;
    }
}
