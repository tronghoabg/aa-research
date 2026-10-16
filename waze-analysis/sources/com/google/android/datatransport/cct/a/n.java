package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f4036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4037b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4038c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4039d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4040e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4041f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4042g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4043h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4044i;

    /* renamed from: j, reason: collision with root package name */
    private final String f4045j;

    /* renamed from: k, reason: collision with root package name */
    private final String f4046k;

    /* renamed from: l, reason: collision with root package name */
    private final String f4047l;

    /* synthetic */ n(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f4036a = num;
        this.f4037b = str;
        this.f4038c = str2;
        this.f4039d = str3;
        this.f4040e = str4;
        this.f4041f = str5;
        this.f4042g = str6;
        this.f4043h = str7;
        this.f4044i = str8;
        this.f4045j = str9;
        this.f4046k = str10;
        this.f4047l = str11;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final Integer a() {
        return this.f4036a;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String b() {
        return this.f4047l;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String c() {
        return this.f4045j;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String d() {
        return this.f4039d;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String e() {
        return this.f4043h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            Integer num = this.f4036a;
            if (num != null ? num.equals(bVar.a()) : bVar.a() == null) {
                String str = this.f4037b;
                if (str != null ? str.equals(bVar.j()) : bVar.j() == null) {
                    String str2 = this.f4038c;
                    if (str2 != null ? str2.equals(bVar.f()) : bVar.f() == null) {
                        String str3 = this.f4039d;
                        if (str3 != null ? str3.equals(bVar.d()) : bVar.d() == null) {
                            String str4 = this.f4040e;
                            if (str4 != null ? str4.equals(bVar.l()) : bVar.l() == null) {
                                String str5 = this.f4041f;
                                if (str5 != null ? str5.equals(bVar.k()) : bVar.k() == null) {
                                    String str6 = this.f4042g;
                                    if (str6 != null ? str6.equals(bVar.h()) : bVar.h() == null) {
                                        String str7 = this.f4043h;
                                        if (str7 != null ? str7.equals(bVar.e()) : bVar.e() == null) {
                                            String str8 = this.f4044i;
                                            if (str8 != null ? str8.equals(bVar.g()) : bVar.g() == null) {
                                                String str9 = this.f4045j;
                                                if (str9 != null ? str9.equals(bVar.c()) : bVar.c() == null) {
                                                    String str10 = this.f4046k;
                                                    if (str10 != null ? str10.equals(bVar.i()) : bVar.i() == null) {
                                                        String str11 = this.f4047l;
                                                        if (str11 != null ? str11.equals(bVar.b()) : bVar.b() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String f() {
        return this.f4038c;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String g() {
        return this.f4044i;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String h() {
        return this.f4042g;
    }

    public final int hashCode() {
        Integer num = this.f4036a;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.f4037b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = iHashCode ^ 1000003;
        String str2 = this.f4038c;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4039d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f4040e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f4041f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f4042g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f4043h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f4044i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f4045j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f4046k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f4047l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String i() {
        return this.f4046k;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String j() {
        return this.f4037b;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String k() {
        return this.f4041f;
    }

    @Override // com.google.android.datatransport.cct.a.b
    public final String l() {
        return this.f4040e;
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f4036a + ", model=" + this.f4037b + ", hardware=" + this.f4038c + ", device=" + this.f4039d + ", product=" + this.f4040e + ", osBuild=" + this.f4041f + ", manufacturer=" + this.f4042g + ", fingerprint=" + this.f4043h + ", locale=" + this.f4044i + ", country=" + this.f4045j + ", mccMnc=" + this.f4046k + ", applicationBuild=" + this.f4047l + "}";
    }
}
