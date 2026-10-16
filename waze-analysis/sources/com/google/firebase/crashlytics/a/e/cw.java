package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    private final int f9552a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9553b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9554c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9555d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9556e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9557f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9558g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9559h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9560i;

    cw(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.f9552a = i2;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f9553b = str;
        this.f9554c = i3;
        this.f9555d = j2;
        this.f9556e = j3;
        this.f9557f = z;
        this.f9558g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f9559h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f9560i = str3;
    }

    public static cw a(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        return new cw(i2, str, i3, j2, j3, z, i4, str2, str3);
    }

    public final int b() {
        return this.f9552a;
    }

    public final int c() {
        return this.f9554c;
    }

    public final int d() {
        return this.f9558g;
    }

    public final long e() {
        return this.f9556e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cw) {
            cw cwVar = (cw) obj;
            if (this.f9552a == cwVar.f9552a && this.f9553b.equals(cwVar.f9553b) && this.f9554c == cwVar.f9554c && this.f9555d == cwVar.f9555d && this.f9556e == cwVar.f9556e && this.f9557f == cwVar.f9557f && this.f9558g == cwVar.f9558g && this.f9559h.equals(cwVar.f9559h) && this.f9560i.equals(cwVar.f9560i)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f9555d;
    }

    public final String g() {
        return this.f9559h;
    }

    public final String h() {
        return this.f9553b;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9552a ^ 1000003) * 1000003) ^ this.f9553b.hashCode();
        int i2 = true != this.f9557f ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
        long j2 = this.f9555d;
        int i3 = this.f9554c;
        long j3 = this.f9556e;
        return this.f9560i.hashCode() ^ (((((((((((((iHashCode * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ i2) * 1000003) ^ this.f9558g) * 1000003) ^ this.f9559h.hashCode()) * 1000003);
    }

    public final String i() {
        return this.f9560i;
    }

    public final boolean j() {
        return this.f9557f;
    }

    public final String toString() {
        return "DeviceData{arch=" + this.f9552a + ", model=" + this.f9553b + ", availableProcessors=" + this.f9554c + ", totalRam=" + this.f9555d + ", diskSpace=" + this.f9556e + ", isEmulator=" + this.f9557f + ", state=" + this.f9558g + ", manufacturer=" + this.f9559h + ", modelClass=" + this.f9560i + "}";
    }

    public cw() {
        throw null;
    }
}
