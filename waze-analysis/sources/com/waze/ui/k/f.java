package com.waze.ui.k;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f42430a;

    public f(String str) {
        x.f(str, "permitId");
        this.f42430a = str;
    }

    public final String a() {
        return this.f42430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && x.n(this.f42430a, ((f) obj).f42430a);
    }

    public final int hashCode() {
        return this.f42430a.hashCode();
    }

    public final String toString() {
        return "PermitSelected(permitId=" + this.f42430a + ")";
    }
}
