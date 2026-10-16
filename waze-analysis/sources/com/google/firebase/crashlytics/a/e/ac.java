package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac extends be {

    /* renamed from: a, reason: collision with root package name */
    private final int f9302a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9303b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9304c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9305d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9306e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9307f;

    /* renamed from: g, reason: collision with root package name */
    private final long f9308g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9309h;

    /* renamed from: i, reason: collision with root package name */
    private final List f9310i;

    /* synthetic */ ac(int i2, String str, int i3, int i4, long j2, long j3, long j4, String str2, List list) {
        this.f9302a = i2;
        this.f9303b = str;
        this.f9304c = i3;
        this.f9305d = i4;
        this.f9306e = j2;
        this.f9307f = j3;
        this.f9308g = j4;
        this.f9309h = str2;
        this.f9310i = list;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final int a() {
        return this.f9305d;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final int b() {
        return this.f9302a;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final int c() {
        return this.f9304c;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final long d() {
        return this.f9306e;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final long e() {
        return this.f9307f;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof be) {
            be beVar = (be) obj;
            if (this.f9302a == beVar.b() && this.f9303b.equals(beVar.g()) && this.f9304c == beVar.c() && this.f9305d == beVar.a() && this.f9306e == beVar.d() && this.f9307f == beVar.e() && this.f9308g == beVar.f() && ((str = this.f9309h) != null ? str.equals(beVar.h()) : beVar.h() == null) && ((list = this.f9310i) != null ? list.equals(beVar.i()) : beVar.i() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final long f() {
        return this.f9308g;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final String g() {
        return this.f9303b;
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final String h() {
        return this.f9309h;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9302a ^ 1000003) * 1000003) ^ this.f9303b.hashCode();
        String str = this.f9309h;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = this.f9304c;
        long j2 = this.f9306e;
        int i3 = this.f9305d;
        long j3 = this.f9307f;
        long j4 = this.f9308g;
        int i4 = ((((((((((((iHashCode * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ iHashCode2) * 1000003;
        List list = this.f9310i;
        return i4 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.a.e.be
    public final List i() {
        return this.f9310i;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f9302a + ", processName=" + this.f9303b + ", reasonCode=" + this.f9304c + ", importance=" + this.f9305d + ", pss=" + this.f9306e + ", rss=" + this.f9307f + ", timestamp=" + this.f9308g + ", traceFile=" + this.f9309h + ", buildIdMappingForArch=" + String.valueOf(this.f9310i) + "}";
    }
}
