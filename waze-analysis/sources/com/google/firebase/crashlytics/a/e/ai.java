package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends bl {

    /* renamed from: a, reason: collision with root package name */
    private final String f9332a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9333b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9334c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9335d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9336e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9337f;

    /* synthetic */ ai(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f9332a = str;
        this.f9333b = str2;
        this.f9334c = str3;
        this.f9335d = str4;
        this.f9336e = str5;
        this.f9337f = str6;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final String a() {
        return this.f9336e;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final String b() {
        return this.f9337f;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final String c() {
        return this.f9334c;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final String d() {
        return this.f9332a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final String e() {
        return this.f9335d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bl) {
            bl blVar = (bl) obj;
            if (this.f9332a.equals(blVar.d()) && this.f9333b.equals(blVar.f()) && ((str = this.f9334c) != null ? str.equals(blVar.c()) : blVar.c() == null)) {
                blVar.g();
                String str2 = this.f9335d;
                if (str2 != null ? str2.equals(blVar.e()) : blVar.e() == null) {
                    String str3 = this.f9336e;
                    if (str3 != null ? str3.equals(blVar.a()) : blVar.a() == null) {
                        String str4 = this.f9337f;
                        if (str4 != null ? str4.equals(blVar.b()) : blVar.b() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final String f() {
        return this.f9333b;
    }

    @Override // com.google.firebase.crashlytics.a.e.bl
    public final void g() {
    }

    public final int hashCode() {
        int iHashCode = ((this.f9332a.hashCode() ^ 1000003) * 1000003) ^ this.f9333b.hashCode();
        String str = this.f9334c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = iHashCode * 1000003;
        String str2 = this.f9335d;
        int iHashCode3 = (((i2 ^ iHashCode2) * (-721379959)) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9336e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f9337f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Application{identifier=" + this.f9332a + ", version=" + this.f9333b + ", displayVersion=" + this.f9334c + ", organization=null, installationUuid=" + this.f9335d + ", developmentPlatform=" + this.f9336e + ", developmentPlatformVersion=" + this.f9337f + "}";
    }
}
