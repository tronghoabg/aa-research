package com.waze.main_screen.k.a;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f26506a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26507b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26508c;

    public b(List list, boolean z, boolean z2) {
        x.f(list, "insightCards");
        this.f26506a = list;
        this.f26507b = z;
        this.f26508c = z2;
    }

    public final List a() {
        return this.f26506a;
    }

    public final boolean b() {
        return this.f26507b;
    }

    public final boolean c() {
        return this.f26508c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f26506a, bVar.f26506a) && this.f26507b == bVar.f26507b && this.f26508c == bVar.f26508c;
    }

    public final int hashCode() {
        return (((this.f26506a.hashCode() * 31) + a.a.a(this.f26507b)) * 31) + a.a.a(this.f26508c);
    }

    public final String toString() {
        return "State(insightCards=" + this.f26506a + ", canBeCovered=" + this.f26507b + ", hideable=" + this.f26508c + ")";
    }
}
