package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f33087a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33088b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33089c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33090d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33091e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33092f;

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        h.g.b.x.f(str, "houseNumber");
        h.g.b.x.f(str2, "street");
        h.g.b.x.f(str3, "city");
        h.g.b.x.f(str4, "state");
        h.g.b.x.f(str5, "country");
        h.g.b.x.f(str6, "zip");
        this.f33087a = str;
        this.f33088b = str2;
        this.f33089c = str3;
        this.f33090d = str4;
        this.f33091e = str5;
        this.f33092f = str6;
    }

    public final String a() {
        return this.f33089c;
    }

    public final String b() {
        return this.f33091e;
    }

    public final String c() {
        return this.f33087a;
    }

    public final String d() {
        return this.f33090d;
    }

    public final String e() {
        return this.f33088b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f33087a, aVar.f33087a) && h.g.b.x.n(this.f33088b, aVar.f33088b) && h.g.b.x.n(this.f33089c, aVar.f33089c) && h.g.b.x.n(this.f33090d, aVar.f33090d) && h.g.b.x.n(this.f33091e, aVar.f33091e) && h.g.b.x.n(this.f33092f, aVar.f33092f);
    }

    public final String f() {
        return this.f33092f;
    }

    public final int hashCode() {
        return (((((((((this.f33087a.hashCode() * 31) + this.f33088b.hashCode()) * 31) + this.f33089c.hashCode()) * 31) + this.f33090d.hashCode()) * 31) + this.f33091e.hashCode()) * 31) + this.f33092f.hashCode();
    }

    public final String toString() {
        return "Address(houseNumber=" + this.f33087a + ", street=" + this.f33088b + ", city=" + this.f33089c + ", state=" + this.f33090d + ", country=" + this.f33091e + ", zip=" + this.f33092f + ")";
    }
}
