package com.waze.bw.c.d.a;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bm implements ce {

    /* renamed from: a, reason: collision with root package name */
    private final String f17914a;

    public bm(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f17914a = str;
    }

    public final String a() {
        return this.f17914a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm) && h.g.b.x.n(this.f17914a, ((bm) obj).f17914a);
    }

    public final int hashCode() {
        return this.f17914a.hashCode();
    }

    public final String toString() {
        return "UpcomingVerifiedCalendarEventSaveClicked(name=" + this.f17914a + ")";
    }
}
