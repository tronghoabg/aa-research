package com.waze.settings.d;

import com.waze.settings.tree.d.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final g f37001a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37002b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37003c;

    public b(g gVar, int i2, int i3) {
        x.f(gVar, "settingOption");
        this.f37001a = gVar;
        this.f37002b = i2;
        this.f37003c = i3;
    }

    public final int a() {
        return this.f37003c;
    }

    public final int b() {
        return this.f37002b;
    }

    public final g c() {
        return this.f37001a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f37001a, bVar.f37001a) && this.f37002b == bVar.f37002b && this.f37003c == bVar.f37003c;
    }

    public final int hashCode() {
        return (((this.f37001a.hashCode() * 31) + this.f37002b) * 31) + this.f37003c;
    }

    public final String toString() {
        return "GasSettingItem(settingOption=" + this.f37001a + ", viewIcon=" + this.f37002b + ", configNTVIndex=" + this.f37003c + ")";
    }
}
