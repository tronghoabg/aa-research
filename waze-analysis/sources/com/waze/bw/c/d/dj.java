package com.waze.bw.c.d;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dj {

    /* renamed from: a, reason: collision with root package name */
    private final String f18096a;

    public dj(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f18096a = str;
    }

    public final String a() {
        return this.f18096a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj) && h.g.b.x.n(this.f18096a, ((dj) obj).f18096a);
    }

    public final int hashCode() {
        return this.f18096a.hashCode();
    }

    public final String toString() {
        return "WazeUIVenueData(name=" + this.f18096a + ")";
    }
}
