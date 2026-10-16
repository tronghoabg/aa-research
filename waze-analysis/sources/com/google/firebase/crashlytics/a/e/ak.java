package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak extends bo {

    /* renamed from: a, reason: collision with root package name */
    private final int f9338a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9339b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9340c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9341d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9342e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9343f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9344g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9345h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9346i;

    /* synthetic */ ak(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.f9338a = i2;
        this.f9339b = str;
        this.f9340c = i3;
        this.f9341d = j2;
        this.f9342e = j3;
        this.f9343f = z;
        this.f9344g = i4;
        this.f9345h = str2;
        this.f9346i = str3;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final int a() {
        return this.f9338a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final int b() {
        return this.f9340c;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final int c() {
        return this.f9344g;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final long d() {
        return this.f9342e;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final long e() {
        return this.f9341d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bo) {
            bo boVar = (bo) obj;
            if (this.f9338a == boVar.a() && this.f9339b.equals(boVar.g()) && this.f9340c == boVar.b() && this.f9341d == boVar.e() && this.f9342e == boVar.d() && this.f9343f == boVar.i() && this.f9344g == boVar.c() && this.f9345h.equals(boVar.f()) && this.f9346i.equals(boVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final String f() {
        return this.f9345h;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final String g() {
        return this.f9339b;
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final String h() {
        return this.f9346i;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9338a ^ 1000003) * 1000003) ^ this.f9339b.hashCode();
        int i2 = true != this.f9343f ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
        long j2 = this.f9341d;
        int i3 = this.f9340c;
        long j3 = this.f9342e;
        return this.f9346i.hashCode() ^ (((((((((((((iHashCode * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ i2) * 1000003) ^ this.f9344g) * 1000003) ^ this.f9345h.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.a.e.bo
    public final boolean i() {
        return this.f9343f;
    }

    public final String toString() {
        return "Device{arch=" + this.f9338a + ", model=" + this.f9339b + ", cores=" + this.f9340c + ", ram=" + this.f9341d + ", diskSpace=" + this.f9342e + ", simulator=" + this.f9343f + ", state=" + this.f9344g + ", manufacturer=" + this.f9345h + ", modelClass=" + this.f9346i + "}";
    }
}
