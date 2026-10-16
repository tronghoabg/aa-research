package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fa extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f31344a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31345b;

    public fa(int i2, String str) {
        super(null, null);
        this.f31344a = i2;
        this.f31345b = str;
    }

    public final int a() {
        return this.f31344a;
    }

    public final String b() {
        return this.f31345b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.f31344a == faVar.f31344a && h.g.b.x.n(this.f31345b, faVar.f31345b);
    }

    public final int hashCode() {
        String str = this.f31345b;
        return (this.f31344a * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ClosingSoon(minutes=" + this.f31344a + ", time=" + this.f31345b + ")";
    }
}
