package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab extends cu {

    /* renamed from: b, reason: collision with root package name */
    private final String f9291b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9292c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9293d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9294e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9295f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9296g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9297h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9298i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9299j;

    /* renamed from: k, reason: collision with root package name */
    private final ct f9300k;

    /* renamed from: l, reason: collision with root package name */
    private final bi f9301l;
    private final be m;

    /* synthetic */ ab(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, ct ctVar, bi biVar, be beVar) {
        this.f9291b = str;
        this.f9292c = str2;
        this.f9293d = i2;
        this.f9294e = str3;
        this.f9295f = str4;
        this.f9296g = str5;
        this.f9297h = str6;
        this.f9298i = str7;
        this.f9299j = str8;
        this.f9300k = ctVar;
        this.f9301l = biVar;
        this.m = beVar;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final int a() {
        return this.f9293d;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final be b() {
        return this.m;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    protected final bf c() {
        return new bf(this);
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final bi d() {
        return this.f9301l;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final ct e() {
        return this.f9300k;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        ct ctVar;
        bi biVar;
        be beVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cu) {
            cu cuVar = (cu) obj;
            if (this.f9291b.equals(cuVar.m()) && this.f9292c.equals(cuVar.k()) && this.f9293d == cuVar.a() && this.f9294e.equals(cuVar.l()) && ((str = this.f9295f) != null ? str.equals(cuVar.j()) : cuVar.j() == null) && ((str2 = this.f9296g) != null ? str2.equals(cuVar.i()) : cuVar.i() == null) && ((str3 = this.f9297h) != null ? str3.equals(cuVar.f()) : cuVar.f() == null) && this.f9298i.equals(cuVar.g()) && this.f9299j.equals(cuVar.h()) && ((ctVar = this.f9300k) != null ? ctVar.equals(cuVar.e()) : cuVar.e() == null) && ((biVar = this.f9301l) != null ? biVar.equals(cuVar.d()) : cuVar.d() == null) && ((beVar = this.m) != null ? beVar.equals(cuVar.b()) : cuVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String f() {
        return this.f9297h;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String g() {
        return this.f9298i;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String h() {
        return this.f9299j;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f9291b.hashCode() ^ 1000003) * 1000003) ^ this.f9292c.hashCode()) * 1000003) ^ this.f9293d) * 1000003) ^ this.f9294e.hashCode();
        String str = this.f9295f;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9296g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9297h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f9298i.hashCode()) * 1000003) ^ this.f9299j.hashCode()) * 1000003;
        ct ctVar = this.f9300k;
        int iHashCode5 = (iHashCode4 ^ (ctVar == null ? 0 : ctVar.hashCode())) * 1000003;
        bi biVar = this.f9301l;
        int iHashCode6 = (iHashCode5 ^ (biVar == null ? 0 : biVar.hashCode())) * 1000003;
        be beVar = this.m;
        return iHashCode6 ^ (beVar != null ? beVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String i() {
        return this.f9296g;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String j() {
        return this.f9295f;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String k() {
        return this.f9292c;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String l() {
        return this.f9294e;
    }

    @Override // com.google.firebase.crashlytics.a.e.cu
    public final String m() {
        return this.f9291b;
    }

    public final String toString() {
        be beVar = this.m;
        bi biVar = this.f9301l;
        return "CrashlyticsReport{sdkVersion=" + this.f9291b + ", gmpAppId=" + this.f9292c + ", platform=" + this.f9293d + ", installationUuid=" + this.f9294e + ", firebaseInstallationId=" + this.f9295f + ", firebaseAuthenticationToken=" + this.f9296g + ", appQualitySessionId=" + this.f9297h + ", buildVersion=" + this.f9298i + ", displayVersion=" + this.f9299j + ", session=" + String.valueOf(this.f9300k) + ", ndkPayload=" + String.valueOf(biVar) + ", appExitInfo=" + String.valueOf(beVar) + "}";
    }
}
