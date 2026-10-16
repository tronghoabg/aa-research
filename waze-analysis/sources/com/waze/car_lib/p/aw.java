package com.waze.car_lib.p;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw extends com.waze.o.ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f20600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(String str) {
        super(null, null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f20600a = str;
    }

    public final String a() {
        return this.f20600a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && h.g.b.x.n(this.f20600a, ((aw) obj).f20600a);
    }

    public final int hashCode() {
        return this.f20600a.hashCode();
    }

    public final String toString() {
        return "Named(name=" + this.f20600a + ")";
    }
}
