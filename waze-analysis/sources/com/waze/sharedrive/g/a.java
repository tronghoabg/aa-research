package com.waze.sharedrive.g;

import com.waze.jni.protos.navigate.NavigationItem;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationItem f38598a;

    public a(NavigationItem navigationItem) {
        h.g.b.x.f(navigationItem, "navigationInstructionItem");
        this.f38598a = navigationItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && h.g.b.x.n(this.f38598a, ((a) obj).f38598a);
    }

    public final int hashCode() {
        return this.f38598a.hashCode();
    }

    public final String toString() {
        return "CenterOnNavigationInstruction(navigationInstructionItem=" + this.f38598a + ")";
    }
}
