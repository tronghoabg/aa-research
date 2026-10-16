package com.waze.tide;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final u f40970a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40971b;

    public w(u uVar, boolean z) {
        h.g.b.x.f(uVar, "locationPermission");
        this.f40970a = uVar;
        this.f40971b = z;
    }

    public final u a() {
        return this.f40970a;
    }

    public final boolean b() {
        return this.f40971b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f40970a == wVar.f40970a && this.f40971b == wVar.f40971b;
    }

    public final int hashCode() {
        return (this.f40970a.hashCode() * 31) + a.a.a(this.f40971b);
    }

    public final String toString() {
        return "TidePermissionsData(locationPermission=" + this.f40970a + ", bluetoothPermission=" + this.f40971b + ")";
    }
}
