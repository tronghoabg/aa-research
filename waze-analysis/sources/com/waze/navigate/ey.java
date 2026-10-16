package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ey extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f31339a;

    public ey(String str) {
        super(null, null);
        this.f31339a = str;
    }

    public final String a() {
        return this.f31339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey) && h.g.b.x.n(this.f31339a, ((ey) obj).f31339a);
    }

    public final int hashCode() {
        String str = this.f31339a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Closed(openTime=" + this.f31339a + ")";
    }
}
