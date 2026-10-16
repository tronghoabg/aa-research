package com.waze.navigate.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final i f30931a;

    public c(i iVar) {
        x.f(iVar, "dest");
        this.f30931a = iVar;
    }

    public final i a() {
        return this.f30931a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f30931a, ((c) obj).f30931a);
    }

    public final int hashCode() {
        return this.f30931a.hashCode();
    }

    public final String toString() {
        return "Navigate(dest=" + this.f30931a + ")";
    }
}
