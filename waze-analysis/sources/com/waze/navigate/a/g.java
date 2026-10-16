package com.waze.navigate.a;

import com.waze.settings.b.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final l f30941a;

    public g(l lVar) {
        x.f(lVar, "setting");
        this.f30941a = lVar;
    }

    public final l a() {
        return this.f30941a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f30941a, ((g) obj).f30941a);
    }

    public final int hashCode() {
        return this.f30941a.hashCode();
    }

    public final String toString() {
        return "OpenSettings(setting=" + this.f30941a + ")";
    }
}
