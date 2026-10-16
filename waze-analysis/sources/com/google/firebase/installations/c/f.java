package com.google.firebase.installations.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f10029a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10030b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10031c;

    /* synthetic */ f(String str, long j2, int i2) {
        this.f10029a = str;
        this.f10030b = j2;
        this.f10031c = i2;
    }

    public static e a() {
        e eVar = new e();
        eVar.d(0L);
        return eVar;
    }

    public final long b() {
        return this.f10030b;
    }

    public final String c() {
        return this.f10029a;
    }

    public final int d() {
        return this.f10031c;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f10029a;
            if (str != null ? str.equals(fVar.f10029a) : fVar.f10029a == null) {
                if (this.f10030b == fVar.f10030b && ((i2 = this.f10031c) != 0 ? i2 == fVar.f10031c : fVar.f10031c == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10029a;
        int i2 = 0;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f10030b;
        int i3 = this.f10031c;
        if (i3 != 0) {
            a.a.L(i3);
            i2 = i3;
        }
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ i2;
    }

    public final String toString() {
        int i2 = this.f10031c;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        long j2 = this.f10030b;
        return "TokenResult{token=" + this.f10029a + ", tokenExpirationTimestamp=" + j2 + ", responseCode=" + str + "}";
    }

    public f() {
        throw null;
    }
}
