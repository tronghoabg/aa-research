package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class as extends bz {

    /* renamed from: a, reason: collision with root package name */
    private final long f9380a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9381b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9382c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9383d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9384e;

    /* synthetic */ as(long j2, String str, String str2, long j3, int i2) {
        this.f9380a = j2;
        this.f9381b = str;
        this.f9382c = str2;
        this.f9383d = j3;
        this.f9384e = i2;
    }

    @Override // com.google.firebase.crashlytics.a.e.bz
    public final int a() {
        return this.f9384e;
    }

    @Override // com.google.firebase.crashlytics.a.e.bz
    public final long b() {
        return this.f9383d;
    }

    @Override // com.google.firebase.crashlytics.a.e.bz
    public final long c() {
        return this.f9380a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bz
    public final String d() {
        return this.f9382c;
    }

    @Override // com.google.firebase.crashlytics.a.e.bz
    public final String e() {
        return this.f9381b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bz) {
            bz bzVar = (bz) obj;
            if (this.f9380a == bzVar.c() && this.f9381b.equals(bzVar.e()) && ((str = this.f9382c) != null ? str.equals(bzVar.d()) : bzVar.d() == null) && this.f9383d == bzVar.b() && this.f9384e == bzVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f9380a;
        int iHashCode = ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f9381b.hashCode();
        String str = this.f9382c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f9383d;
        return this.f9384e ^ (((((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "Frame{pc=" + this.f9380a + ", symbol=" + this.f9381b + ", file=" + this.f9382c + ", offset=" + this.f9383d + ", importance=" + this.f9384e + "}";
    }
}
