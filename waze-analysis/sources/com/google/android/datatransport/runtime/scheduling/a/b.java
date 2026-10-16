package com.google.android.datatransport.runtime.scheduling.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    static final b f4241a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4242b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4243c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4244d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4245e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4246f;

    static {
        a aVar = new a();
        aVar.f();
        aVar.d();
        aVar.b();
        aVar.c();
        aVar.e();
        f4241a = aVar.a();
    }

    /* synthetic */ b(long j2, int i2, int i3, long j3, int i4) {
        this.f4242b = j2;
        this.f4243c = i2;
        this.f4244d = i3;
        this.f4245e = j3;
        this.f4246f = i4;
    }

    final int a() {
        return this.f4244d;
    }

    final int b() {
        return this.f4243c;
    }

    final int c() {
        return this.f4246f;
    }

    final long d() {
        return this.f4245e;
    }

    final long e() {
        return this.f4242b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4242b == bVar.f4242b && this.f4243c == bVar.f4243c && this.f4244d == bVar.f4244d && this.f4245e == bVar.f4245e && this.f4246f == bVar.f4246f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4246f ^ ((((((((((int) this.f4242b) ^ 1000003) * 1000003) ^ this.f4243c) * 1000003) ^ this.f4244d) * 1000003) ^ ((int) this.f4245e)) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f4242b + ", loadBatchSize=" + this.f4243c + ", criticalSectionEnterTimeoutMs=" + this.f4244d + ", eventCleanUpAge=" + this.f4245e + ", maxBlobByteSizePerRow=" + this.f4246f + "}";
    }

    b() {
        throw null;
    }
}
