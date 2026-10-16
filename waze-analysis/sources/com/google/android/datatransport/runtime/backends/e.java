package com.google.android.datatransport.runtime.backends;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long f4162a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4163b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4164c;

    e(int i2, long j2, String str) {
        this.f4164c = i2;
        this.f4162a = j2;
        this.f4163b = str;
    }

    public static e a() {
        return new e(3, -1L, null);
    }

    public static e b() {
        return new e(4, -1L, null);
    }

    public static e c(long j2, String str) {
        return new e(1, j2, str);
    }

    public static e d() {
        return new e(2, -1L, null);
    }

    public final long e() {
        return this.f4162a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f4164c == eVar.f4164c && this.f4162a == eVar.f4162a && ((str = this.f4163b) != null ? str.equals(eVar.f4163b) : eVar.f4163b == null)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f4163b;
    }

    public final int g() {
        return this.f4164c;
    }

    public final int hashCode() {
        int i2 = this.f4164c;
        a.a.L(i2);
        String str = this.f4163b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f4162a;
        return ((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ iHashCode;
    }

    public final String toString() {
        int i2 = this.f4164c;
        return "BackendResponse{status=" + (i2 != 1 ? i2 != 2 ? i2 != 3 ? "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK") + ", nextRequestWaitMillis=" + this.f4162a + ", updatedPseudonymousId=" + this.f4163b + "}";
    }

    public e() {
        throw null;
    }
}
