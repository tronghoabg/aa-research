package com.waze.ui.k;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f42429a;

    public e(String str) {
        x.f(str, "value");
        this.f42429a = str;
    }

    public final String a() {
        return this.f42429a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && x.n(this.f42429a, ((e) obj).f42429a);
    }

    public final int hashCode() {
        return this.f42429a.hashCode();
    }

    public final String toString() {
        return "LicensePlateChanged(value=" + this.f42429a + ")";
    }
}
