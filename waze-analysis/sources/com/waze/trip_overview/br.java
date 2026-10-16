package com.waze.trip_overview;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class br implements bs {

    /* renamed from: a, reason: collision with root package name */
    private final List f41112a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41113b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41114c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f41115d;

    public br(List list, int i2, boolean z, boolean z2) {
        h.g.b.x.f(list, "options");
        this.f41112a = list;
        this.f41113b = i2;
        this.f41114c = z;
        this.f41115d = z2;
    }

    public final int a() {
        return this.f41113b;
    }

    public final List b() {
        return this.f41112a;
    }

    public final boolean c() {
        return this.f41114c;
    }

    public final boolean d() {
        return this.f41115d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        return h.g.b.x.n(this.f41112a, brVar.f41112a) && this.f41113b == brVar.f41113b && this.f41114c == brVar.f41114c && this.f41115d == brVar.f41115d;
    }

    public final int hashCode() {
        int iHashCode = this.f41112a.hashCode() * 31;
        boolean z = this.f41115d;
        return ((((iHashCode + this.f41113b) * 31) + a.a.a(this.f41114c)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "Enabled(options=" + this.f41112a + ", selectedOptionIndex=" + this.f41113b + ", interactionEnabled=" + this.f41114c + ", showTooltip=" + this.f41115d + ")";
    }
}
