package com.waze.bw.c.d.a;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba implements cc {

    /* renamed from: a, reason: collision with root package name */
    private final String f17902a;

    public ba(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f17902a = str;
    }

    public final String a() {
        return this.f17902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && h.g.b.x.n(this.f17902a, ((ba) obj).f17902a);
    }

    public final int hashCode() {
        return this.f17902a.hashCode();
    }

    public final String toString() {
        return "UpcomingPlannedDriveSaveClicked(name=" + this.f17902a + ")";
    }
}
