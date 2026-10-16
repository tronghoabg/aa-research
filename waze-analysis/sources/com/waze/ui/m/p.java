package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final List f43023a;

    public p(List list) {
        h.g.b.x.f(list, "methods");
        this.f43023a = list;
    }

    public final List a() {
        return this.f43023a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && h.g.b.x.n(this.f43023a, ((p) obj).f43023a);
    }

    public final int hashCode() {
        return this.f43023a.hashCode();
    }

    public final String toString() {
        return "EVPaymentMethodsUIModel(methods=" + this.f43023a + ")";
    }
}
