package com.waze.closure.c;

import com.waze.map.b.ec;
import h.g.b.x;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final List f22460a;

    /* renamed from: b, reason: collision with root package name */
    private final ec f22461b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f22462c;

    public d(List list, ec ecVar, Integer num) {
        x.f(list, "closures");
        x.f(ecVar, "viewport");
        this.f22460a = list;
        this.f22461b = ecVar;
        this.f22462c = num;
    }

    public static /* synthetic */ d d(d dVar, List list, ec ecVar, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            list = dVar.f22460a;
        }
        if ((i2 & 2) != 0) {
            ecVar = dVar.f22461b;
        }
        if ((i2 & 4) != 0) {
            num = dVar.f22462c;
        }
        x.f(list, "closures");
        x.f(ecVar, "viewport");
        return new d(list, ecVar, num);
    }

    public final ec a() {
        return this.f22461b;
    }

    public final Integer b() {
        return this.f22462c;
    }

    public final List c() {
        return this.f22460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f22460a, dVar.f22460a) && x.n(this.f22461b, dVar.f22461b) && x.n(this.f22462c, dVar.f22462c);
    }

    public final int hashCode() {
        int iHashCode = (this.f22460a.hashCode() * 31) + this.f22461b.hashCode();
        Integer num = this.f22462c;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "State(closures=" + this.f22460a + ", viewport=" + this.f22461b + ", selectedIndex=" + this.f22462c + ")";
    }
}
