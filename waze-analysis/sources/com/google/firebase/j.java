package com.google.firebase;

import android.os.SystemClock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final long f10048a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10049b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10050c;

    j(long j2, long j3, long j4) {
        this.f10048a = j2;
        this.f10049b = j3;
        this.f10050c = j4;
    }

    public static j a() {
        return new j(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public final long b() {
        return this.f10049b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f10048a == jVar.f10048a && this.f10049b == jVar.f10049b && this.f10050c == jVar.f10050c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f10050c;
        long j3 = this.f10048a;
        int i2 = (int) (j3 ^ (j3 >>> 32));
        long j4 = this.f10049b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((i2 ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f10048a + ", elapsedRealtime=" + this.f10049b + ", uptimeMillis=" + this.f10050c + "}";
    }

    public j() {
        throw null;
    }
}
