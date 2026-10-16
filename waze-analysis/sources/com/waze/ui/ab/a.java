package com.waze.ui.ab;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final String f41728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(null);
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f41728a = str;
    }

    public final String a() {
        return this.f41728a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f41728a, ((a) obj).f41728a);
    }

    public final int hashCode() {
        return this.f41728a.hashCode();
    }

    public final String toString() {
        return "Event(name=" + this.f41728a + ")";
    }
}
