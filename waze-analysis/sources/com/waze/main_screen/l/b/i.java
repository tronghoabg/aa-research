package com.waze.main_screen.l.b;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26618a;

    /* renamed from: b, reason: collision with root package name */
    private final List f26619b;

    /* renamed from: c, reason: collision with root package name */
    private final List f26620c;

    public i(boolean z, List list, List list2) {
        x.f(list, "instructions");
        x.f(list2, "routeAlerts");
        this.f26618a = z;
        this.f26619b = list;
        this.f26620c = list2;
    }

    public static /* synthetic */ i d(i iVar, List list, List list2, int i2) {
        boolean z = (i2 & 1) != 0 ? iVar.f26618a : false;
        if ((i2 & 2) != 0) {
            list = iVar.f26619b;
        }
        if ((i2 & 4) != 0) {
            list2 = iVar.f26620c;
        }
        x.f(list, "instructions");
        x.f(list2, "routeAlerts");
        return new i(z, list, list2);
    }

    public final List a() {
        return this.f26619b;
    }

    public final List b() {
        return this.f26620c;
    }

    public final boolean c() {
        return this.f26618a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26618a == iVar.f26618a && x.n(this.f26619b, iVar.f26619b) && x.n(this.f26620c, iVar.f26620c);
    }

    public final int hashCode() {
        return (((a.a.a(this.f26618a) * 31) + this.f26619b.hashCode()) * 31) + this.f26620c.hashCode();
    }

    public final String toString() {
        return "State(drivingOnLeft=" + this.f26618a + ", instructions=" + this.f26619b + ", routeAlerts=" + this.f26620c + ")";
    }
}
