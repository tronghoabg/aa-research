package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class am extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f30995a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30996b;

    /* JADX WARN: Illegal instructions before constructor call */
    public am(int i2, int i3) {
        byte[] bArr = null;
        super(bArr, bArr);
        this.f30995a = i2;
        this.f30996b = i3;
    }

    public final int a() {
        return this.f30996b;
    }

    public final int b() {
        return this.f30995a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f30995a == amVar.f30995a && this.f30996b == amVar.f30996b;
    }

    public final int hashCode() {
        return (this.f30995a * 31) + this.f30996b;
    }

    public final String toString() {
        return "AverageSpeedCamera(percent=" + this.f30995a + ", leftDistanceMeters=" + this.f30996b + ")";
    }
}
