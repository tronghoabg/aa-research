package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fd extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f31348a;

    /* JADX WARN: Illegal instructions before constructor call */
    public fd(int i2) {
        byte[] bArr = null;
        super(bArr, bArr);
        this.f31348a = i2;
    }

    public final int a() {
        return this.f31348a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd) && this.f31348a == ((fd) obj).f31348a;
    }

    public final int hashCode() {
        return this.f31348a;
    }

    public final String toString() {
        return "OpeningSoon(minutes=" + this.f31348a + ")";
    }
}
