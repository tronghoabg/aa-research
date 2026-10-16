package com.waze.ev;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f23696a;

    public g(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f23696a = str;
    }

    public final String a() {
        return this.f23696a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f23696a, ((g) obj).f23696a);
    }

    public final int hashCode() {
        return this.f23696a.hashCode();
    }

    public final String toString() {
        return "EVNetwork(name=" + this.f23696a + ")";
    }
}
