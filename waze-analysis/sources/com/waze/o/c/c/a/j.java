package com.waze.o.c.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    private final int f32836a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32837b;

    public j(int i2, String str) {
        x.f(str, "description");
        this.f32836a = i2;
        this.f32837b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f32836a == jVar.f32836a && x.n(this.f32837b, jVar.f32837b);
    }

    public final int hashCode() {
        return (this.f32836a * 31) + this.f32837b.hashCode();
    }

    public final String toString() {
        return "Error(code=" + this.f32836a + ", description=" + this.f32837b + ")";
    }
}
