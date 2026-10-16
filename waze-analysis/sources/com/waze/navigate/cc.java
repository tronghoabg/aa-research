package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cc extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f31162a;

    /* JADX WARN: Illegal instructions before constructor call */
    public cc(int i2) {
        byte[] bArr = null;
        super(bArr, bArr);
        this.f31162a = i2;
    }

    public final int a() {
        return this.f31162a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc) && this.f31162a == ((cc) obj).f31162a;
    }

    public final int hashCode() {
        return this.f31162a;
    }

    public final String toString() {
        return "EnforcementZone(percent=" + this.f31162a + ")";
    }
}
