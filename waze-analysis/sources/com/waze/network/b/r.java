package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f32093a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(byte[] bArr) {
        super(null, null);
        h.g.b.x.f("timeout", "message");
        this.f32093a = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_1;
        this.f32094b = "timeout";
    }

    public final String a() {
        return this.f32094b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        int i2 = rVar.f32093a;
        return h.g.b.x.n(this.f32094b, rVar.f32094b);
    }

    public final int hashCode() {
        return this.f32094b.hashCode() + 6882;
    }

    public final String toString() {
        return "Interrupted(errorCode=222, message=" + this.f32094b + ")";
    }

    public r() {
        this(null);
    }
}
