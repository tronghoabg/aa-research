package com.applovin.impl;

/* renamed from: com.applovin.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1624a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20876a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20877b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20878c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20879d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20880e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20881f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20882g;

    public C1624a0(String str, int i5) {
        this.f20880e = str;
        this.f20881f = i5;
        String[] strArrSplit = str.split(",");
        boolean z2 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f20882g = z2;
        if (z2) {
            this.f20876a = a(strArrSplit[0]);
            this.f20877b = a(strArrSplit[1]);
            this.f20878c = a(strArrSplit[2]);
            this.f20879d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f20876a = "";
        this.f20877b = "";
        this.f20878c = "";
        this.f20879d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof C1624a0;
    }

    public String b() {
        return this.f20876a;
    }

    public String c() {
        return this.f20877b;
    }

    public String d() {
        return this.f20880e;
    }

    public String e() {
        return this.f20878c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1624a0)) {
            return false;
        }
        C1624a0 c1624a0 = (C1624a0) obj;
        if (!c1624a0.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = c1624a0.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = c1624a0.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = c1624a0.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = c1624a0.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f20881f;
    }

    public boolean g() {
        return this.f20876a.equals("applovin.com");
    }

    public boolean h() {
        return this.f20882g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public String a() {
        return this.f20879d;
    }

    public boolean a(C1624a0 c1624a0) {
        if (!c1624a0.b().equals(this.f20876a) || !c1624a0.c().equals(this.f20877b) || !c1624a0.e().equals(this.f20878c)) {
            return false;
        }
        if (c1624a0.a().equals("")) {
            return true;
        }
        return c1624a0.a().equals(this.f20879d);
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public C1624a0(String str) {
        this(str, -1);
    }
}
