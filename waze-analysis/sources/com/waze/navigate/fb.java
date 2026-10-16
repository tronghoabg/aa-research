package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fb extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f31346a;

    public fb(String str) {
        super(null, null);
        this.f31346a = str;
    }

    public final String a() {
        return this.f31346a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb) && h.g.b.x.n(this.f31346a, ((fb) obj).f31346a);
    }

    public final int hashCode() {
        String str = this.f31346a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Open(closeTime=" + this.f31346a + ")";
    }
}
