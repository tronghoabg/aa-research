package com.waze.main_screen.p.b.a.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f27112a;

    public i(String str) {
        x.f(str, "text");
        this.f27112a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && x.n(this.f27112a, ((i) obj).f27112a);
    }

    public final int hashCode() {
        return this.f27112a.hashCode();
    }

    public final String toString() {
        return "Hov(text=" + this.f27112a + ")";
    }
}
