package com.waze.main_screen.l.a;

import com.waze.jni.protos.navigate.NavigationItem;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationItem f26589a;

    public a(NavigationItem navigationItem) {
        x.f(navigationItem, "navigationItemProto");
        this.f26589a = navigationItem;
    }

    public final NavigationItem a() {
        return this.f26589a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f26589a, ((a) obj).f26589a);
    }

    public final int hashCode() {
        return this.f26589a.hashCode();
    }

    public final String toString() {
        return "NavigationInstruction(navigationItemProto=" + this.f26589a + ")";
    }
}
