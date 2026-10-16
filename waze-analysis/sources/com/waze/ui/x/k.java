package com.waze.ui.x;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    private final j f43821a;

    public k(j jVar) {
        x.f(jVar, "trigger");
        this.f43821a = jVar;
    }

    public final j a() {
        return this.f43821a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f43821a == ((k) obj).f43821a;
    }

    public final int hashCode() {
        return this.f43821a.hashCode();
    }

    public final String toString() {
        return "BottomSheetClosing(trigger=" + this.f43821a + ")";
    }
}
