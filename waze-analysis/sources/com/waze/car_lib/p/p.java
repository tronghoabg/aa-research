package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends com.waze.n.ac {

    /* renamed from: a, reason: collision with root package name */
    private final String f20813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20814b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20815c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20816d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20817e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20818f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20819g;

    /* renamed from: h, reason: collision with root package name */
    private final co f20820h;

    /* renamed from: i, reason: collision with root package name */
    private final String f20821i;

    public /* synthetic */ p(String str, String str2, int i2, int i3, String str3, String str4, String str5, co coVar, int i4) {
        this(str, str2, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? 1 : i3, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? null : str5, (i4 & 128) != 0 ? null : coVar, (String) null);
    }

    public static /* synthetic */ p j(p pVar, String str, co coVar, String str2) {
        String str3 = pVar.f20813a;
        String str4 = pVar.f20814b;
        int i2 = pVar.f20815c;
        int i3 = pVar.f20816d;
        String str5 = pVar.f20818f;
        String str6 = pVar.f20819g;
        h.g.b.x.f(str3, "hint");
        h.g.b.x.f(str4, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        return new p(str3, str4, i2, i3, str, str5, str6, coVar, str2);
    }

    public final int a() {
        return this.f20815c;
    }

    public final int b() {
        return this.f20816d;
    }

    public final co c() {
        return this.f20820h;
    }

    public final String d() {
        return this.f20818f;
    }

    public final String e() {
        return this.f20817e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.g.b.x.n(this.f20813a, pVar.f20813a) && h.g.b.x.n(this.f20814b, pVar.f20814b) && this.f20815c == pVar.f20815c && this.f20816d == pVar.f20816d && h.g.b.x.n(this.f20817e, pVar.f20817e) && h.g.b.x.n(this.f20818f, pVar.f20818f) && h.g.b.x.n(this.f20819g, pVar.f20819g) && h.g.b.x.n(this.f20820h, pVar.f20820h) && h.g.b.x.n(this.f20821i, pVar.f20821i);
    }

    public final String f() {
        return this.f20821i;
    }

    public final String g() {
        return this.f20813a;
    }

    public final String h() {
        return this.f20819g;
    }

    public final int hashCode() {
        int iHashCode = (this.f20813a.hashCode() * 31) + this.f20814b.hashCode();
        String str = this.f20817e;
        int iHashCode2 = ((((((iHashCode * 31) + this.f20815c) * 31) + this.f20816d) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20818f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20819g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        co coVar = this.f20820h;
        int iHashCode5 = (iHashCode4 + (coVar == null ? 0 : coVar.hashCode())) * 31;
        String str4 = this.f20821i;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f20814b;
    }

    public final String toString() {
        return "Loaded(hint=" + this.f20813a + ", title=" + this.f20814b + ", inputType=" + this.f20815c + ", keyboardType=" + this.f20816d + ", defaultValue=" + this.f20817e + ", additionalText=" + this.f20818f + ", instructions=" + this.f20819g + ", action=" + this.f20820h + ", errorMessage=" + this.f20821i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String str, String str2, int i2, int i3, String str3, String str4, String str5, co coVar, String str6) {
        h.g.b.x.f(str, "hint");
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        byte[] bArr = null;
        super(bArr, bArr);
        this.f20813a = str;
        this.f20814b = str2;
        this.f20815c = i2;
        this.f20816d = i3;
        this.f20817e = str3;
        this.f20818f = str4;
        this.f20819g = str5;
        this.f20820h = coVar;
        this.f20821i = str6;
    }
}
