package com.applovin.impl;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    private String f22474a;

    /* renamed from: b, reason: collision with root package name */
    private String f22475b;

    /* renamed from: c, reason: collision with root package name */
    private int f22476c;

    /* renamed from: d, reason: collision with root package name */
    private int f22477d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f22478a;

        /* renamed from: b, reason: collision with root package name */
        private String f22479b;

        /* renamed from: c, reason: collision with root package name */
        private int f22480c;

        /* renamed from: d, reason: collision with root package name */
        private int f22481d;

        public p2 a() {
            return new p2(this.f22478a, this.f22479b, this.f22480c, this.f22481d);
        }

        public a b(int i5) {
            this.f22480c = i5;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=");
            sb2.append(this.f22478a);
            sb2.append(", signature=");
            sb2.append(this.f22479b);
            sb2.append(", responseCode=");
            sb2.append(this.f22480c);
            sb2.append(", nonce=");
            return AbstractC0279p0.j(this.f22481d, ")", sb2);
        }

        public a a(int i5) {
            this.f22481d = i5;
            return this;
        }

        public a b(String str) {
            this.f22478a = str;
            return this;
        }

        public a a(String str) {
            this.f22479b = str;
            return this;
        }
    }

    public p2(String str, String str2, int i5, int i10) {
        this.f22474a = str;
        this.f22475b = str2;
        this.f22476c = i5;
        this.f22477d = i10;
    }

    public boolean a(Object obj) {
        return obj instanceof p2;
    }

    public int b() {
        return this.f22477d;
    }

    public int c() {
        return this.f22476c;
    }

    public String d() {
        return this.f22475b;
    }

    public String e() {
        return this.f22474a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = p2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = p2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iB = b() + ((c() + 59) * 59);
        String strE = e();
        int iHashCode = (iB * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        return (iHashCode * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
