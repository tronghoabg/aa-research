package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aq extends bw {

    /* renamed from: a, reason: collision with root package name */
    private final String f9374a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9375b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9376c;

    /* synthetic */ aq(String str, String str2, long j2) {
        this.f9374a = str;
        this.f9375b = str2;
        this.f9376c = j2;
    }

    @Override // com.google.firebase.crashlytics.a.e.bw
    public final long a() {
        return this.f9376c;
    }

    @Override // com.google.firebase.crashlytics.a.e.bw
    public final String b() {
        return this.f9375b;
    }

    @Override // com.google.firebase.crashlytics.a.e.bw
    public final String c() {
        return this.f9374a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bw) {
            bw bwVar = (bw) obj;
            if (this.f9374a.equals(bwVar.c()) && this.f9375b.equals(bwVar.b()) && this.f9376c == bwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9374a.hashCode() ^ 1000003) * 1000003) ^ this.f9375b.hashCode();
        long j2 = this.f9376c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "Signal{name=" + this.f9374a + ", code=" + this.f9375b + ", address=" + this.f9376c + "}";
    }
}
