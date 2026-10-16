package com.waze.car_lib.i.c;

import com.waze.navigate.gi;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    private final gi f20112a;

    public k(gi giVar) {
        h.g.b.x.f(giVar, "traffic");
        this.f20112a = giVar;
    }

    public final gi a() {
        return this.f20112a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f20112a, ((k) obj).f20112a);
    }

    public final int hashCode() {
        return this.f20112a.hashCode();
    }

    public final String toString() {
        return "Traffic(traffic=" + this.f20112a + ")";
    }
}
