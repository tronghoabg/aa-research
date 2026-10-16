package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af extends com.waze.ac.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f15853a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(String str) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f15853a = str;
    }

    public final String C() {
        return this.f15853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af) && h.g.b.x.n(this.f15853a, ((af) obj).f15853a);
    }

    public final int hashCode() {
        return this.f15853a.hashCode();
    }

    public final String toString() {
        return "Named(name=" + this.f15853a + ")";
    }
}
