package com.waze.car_lib.p;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final String f20614a;

    public bd(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f20614a = str;
    }

    public final String a() {
        return this.f20614a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd) && h.g.b.x.n(this.f20614a, ((bd) obj).f20614a);
    }

    public final int hashCode() {
        return this.f20614a.hashCode();
    }

    public final String toString() {
        return "WazeUIVenueData(name=" + this.f20614a + ")";
    }
}
