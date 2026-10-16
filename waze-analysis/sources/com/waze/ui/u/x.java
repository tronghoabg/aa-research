package com.waze.ui.u;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends z {

    /* renamed from: a, reason: collision with root package name */
    private final String f43478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f43478a = str;
    }

    public final String a() {
        return this.f43478a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f43478a, ((x) obj).f43478a);
    }

    public final int hashCode() {
        return this.f43478a.hashCode();
    }

    public final String toString() {
        return "Named(name=" + this.f43478a + ")";
    }
}
