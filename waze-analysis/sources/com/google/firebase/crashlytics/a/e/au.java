package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class au extends ch {

    /* renamed from: a, reason: collision with root package name */
    private final Double f9389a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9390b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9391c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9392d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9393e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9394f;

    /* synthetic */ au(Double d2, int i2, boolean z, int i3, long j2, long j3) {
        this.f9389a = d2;
        this.f9390b = i2;
        this.f9391c = z;
        this.f9392d = i3;
        this.f9393e = j2;
        this.f9394f = j3;
    }

    @Override // com.google.firebase.crashlytics.a.e.ch
    public final int a() {
        return this.f9390b;
    }

    @Override // com.google.firebase.crashlytics.a.e.ch
    public final int b() {
        return this.f9392d;
    }

    @Override // com.google.firebase.crashlytics.a.e.ch
    public final long c() {
        return this.f9394f;
    }

    @Override // com.google.firebase.crashlytics.a.e.ch
    public final long d() {
        return this.f9393e;
    }

    @Override // com.google.firebase.crashlytics.a.e.ch
    public final Double e() {
        return this.f9389a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ch) {
            ch chVar = (ch) obj;
            Double d2 = this.f9389a;
            if (d2 != null ? d2.equals(chVar.e()) : chVar.e() == null) {
                if (this.f9390b == chVar.a() && this.f9391c == chVar.f() && this.f9392d == chVar.b() && this.f9393e == chVar.d() && this.f9394f == chVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.ch
    public final boolean f() {
        return this.f9391c;
    }

    public final int hashCode() {
        Double d2 = this.f9389a;
        int iHashCode = d2 == null ? 0 : d2.hashCode();
        int i2 = (((((iHashCode ^ 1000003) * 1000003) ^ this.f9390b) * 1000003) ^ (true != this.f9391c ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS)) * 1000003;
        int i3 = this.f9392d;
        long j2 = this.f9393e;
        long j3 = this.f9394f;
        return ((((i2 ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f9389a + ", batteryVelocity=" + this.f9390b + ", proximityOn=" + this.f9391c + ", orientation=" + this.f9392d + ", ramUsed=" + this.f9393e + ", diskUsed=" + this.f9394f + "}";
    }
}
