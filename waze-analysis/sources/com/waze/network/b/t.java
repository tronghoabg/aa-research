package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f32097a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(byte[] bArr) {
        super(null, null);
        h.g.b.x.f("no_session", "message");
        this.f32097a = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2;
        this.f32098b = "no_session";
    }

    public final String a() {
        return this.f32098b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i2 = tVar.f32097a;
        return h.g.b.x.n(this.f32098b, tVar.f32098b);
    }

    public final int hashCode() {
        return this.f32098b.hashCode() + 6913;
    }

    public final String toString() {
        return "SessionMissing(errorCode=223, message=" + this.f32098b + ")";
    }

    public t() {
        this(null);
    }
}
