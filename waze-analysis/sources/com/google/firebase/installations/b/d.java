package com.google.firebase.installations.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f9987a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9988b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9989c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9990d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9991e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9992f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9993g;

    static {
        a().a();
    }

    /* synthetic */ d(String str, int i2, String str2, String str3, long j2, long j3, String str4) {
        this.f9987a = str;
        this.f9993g = i2;
        this.f9988b = str2;
        this.f9989c = str3;
        this.f9990d = j2;
        this.f9991e = j3;
        this.f9992f = str4;
    }

    public static c a() {
        c cVar = new c();
        cVar.h(0L);
        cVar.g(1);
        cVar.c(0L);
        return cVar;
    }

    public final boolean b() {
        return this.f9993g == 5;
    }

    public final boolean c() {
        int i2 = this.f9993g;
        return i2 == 2 || i2 == 1;
    }

    public final boolean d() {
        return this.f9993g == 4;
    }

    public final boolean e() {
        return this.f9993g == 3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f9987a;
            if (str4 != null ? str4.equals(dVar.f9987a) : dVar.f9987a == null) {
                int i2 = this.f9993g;
                int i3 = dVar.f9993g;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == i3 && ((str = this.f9988b) != null ? str.equals(dVar.f9988b) : dVar.f9988b == null) && ((str2 = this.f9989c) != null ? str2.equals(dVar.f9989c) : dVar.f9989c == null) && this.f9990d == dVar.f9990d && this.f9991e == dVar.f9991e && ((str3 = this.f9992f) != null ? str3.equals(dVar.f9992f) : dVar.f9992f == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long f() {
        return this.f9990d;
    }

    public final long g() {
        return this.f9991e;
    }

    public final c h() {
        return new c(this);
    }

    public final int hashCode() {
        String str = this.f9987a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.f9993g;
        a.a.L(i2);
        String str2 = this.f9988b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i3 = ((iHashCode ^ 1000003) * 1000003) ^ i2;
        String str3 = this.f9989c;
        int iHashCode3 = ((((i3 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f9990d;
        int i4 = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f9991e;
        int i5 = (i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f9992f;
        return i5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f9988b;
    }

    public final String j() {
        return this.f9987a;
    }

    public final String k() {
        return this.f9992f;
    }

    public final String l() {
        return this.f9989c;
    }

    public final int m() {
        return this.f9993g;
    }

    public final d n() {
        c cVar = new c(this);
        cVar.e("BAD CONFIG");
        cVar.g(5);
        return cVar.a();
    }

    public final String toString() {
        int i2 = this.f9993g;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f9987a + ", registrationStatus=" + str + ", authToken=" + this.f9988b + ", refreshToken=" + this.f9989c + ", expiresInSecs=" + this.f9990d + ", tokenCreationEpochInSecs=" + this.f9991e + ", fisError=" + this.f9992f + "}";
    }

    public d() {
        throw null;
    }
}
