package com.waze.car_lib.p;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f20516a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20517b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20518c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20519d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20520e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f20521f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20522g;

    public a(int i2, String str, Integer num, String str2, int i3, Integer num2, boolean z) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f20516a = i2;
        this.f20517b = str;
        this.f20518c = num;
        this.f20519d = str2;
        this.f20520e = i3;
        this.f20521f = num2;
        this.f20522g = z;
    }

    public final int a() {
        return this.f20520e;
    }

    public final int b() {
        return this.f20516a;
    }

    public final Integer c() {
        return this.f20521f;
    }

    public final Integer d() {
        return this.f20518c;
    }

    public final String e() {
        return this.f20517b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20516a == aVar.f20516a && h.g.b.x.n(this.f20517b, aVar.f20517b) && h.g.b.x.n(this.f20518c, aVar.f20518c) && h.g.b.x.n(this.f20519d, aVar.f20519d) && this.f20520e == aVar.f20520e && h.g.b.x.n(this.f20521f, aVar.f20521f) && this.f20522g == aVar.f20522g;
    }

    public final String f() {
        return this.f20519d;
    }

    public final boolean g() {
        return this.f20522g;
    }

    public final int hashCode() {
        int iHashCode = (this.f20516a * 31) + this.f20517b.hashCode();
        Integer num = this.f20518c;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f20519d;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f20520e) * 31;
        Integer num2 = this.f20521f;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + a.a.a(this.f20522g);
    }

    public final String toString() {
        return "EVConnector(icon=" + this.f20516a + ", name=" + this.f20517b + ", speedKw=" + this.f20518c + ", speedTier=" + this.f20519d + ", count=" + this.f20520e + ", availableCount=" + this.f20521f + ", isCompatible=" + this.f20522g + ")";
    }
}
