package com.waze.av.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f15827a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15828b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15829c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15830d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15831e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f15832f;

    public /* synthetic */ o(String str, String str2, String str3, String str4, String str5, Boolean bool, int i2) {
        this(1 == (i2 & 1) ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : bool);
    }

    public static /* synthetic */ o g(o oVar, String str, String str2, int i2) {
        String str3 = (i2 & 1) != 0 ? oVar.f15827a : null;
        if ((i2 & 2) != 0) {
            str = oVar.f15828b;
        }
        String str4 = str;
        String str5 = (i2 & 4) != 0 ? oVar.f15829c : null;
        String str6 = (i2 & 8) != 0 ? oVar.f15830d : null;
        if ((i2 & 16) != 0) {
            str2 = oVar.f15831e;
        }
        return new o(str3, str4, str5, str6, str2, oVar.f15832f);
    }

    public final Boolean a() {
        return this.f15832f;
    }

    public final String b() {
        return this.f15829c;
    }

    public final String c() {
        return this.f15827a;
    }

    public final String d() {
        return this.f15831e;
    }

    public final String e() {
        return this.f15828b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return x.n(this.f15827a, oVar.f15827a) && x.n(this.f15828b, oVar.f15828b) && x.n(this.f15829c, oVar.f15829c) && x.n(this.f15830d, oVar.f15830d) && x.n(this.f15831e, oVar.f15831e) && x.n(this.f15832f, oVar.f15832f);
    }

    public final String f() {
        return this.f15830d;
    }

    public final int hashCode() {
        String str = this.f15827a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f15828b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f15829c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15830d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15831e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f15832f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "VenueData(id=" + this.f15827a + ", name=" + this.f15828b + ", context=" + this.f15829c + ", routingContext=" + this.f15830d + ", image=" + this.f15831e + ", isResidential=" + this.f15832f + ")";
    }

    public o(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.f15827a = str;
        this.f15828b = str2;
        this.f15829c = str3;
        this.f15830d = str4;
        this.f15831e = str5;
        this.f15832f = bool;
    }

    public o() {
        this(null, null, null, null, null, null, 63);
    }
}
