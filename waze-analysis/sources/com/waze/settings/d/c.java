package com.waze.settings.d;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f37004a;

    /* renamed from: b, reason: collision with root package name */
    private b f37005b;

    public c(List list, b bVar) {
        x.f(list, "gasOptions");
        this.f37004a = list;
        this.f37005b = bVar;
    }

    public final b a() {
        return this.f37005b;
    }

    public final List b() {
        return this.f37004a;
    }

    public final void c(b bVar) {
        this.f37005b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f37004a, cVar.f37004a) && x.n(this.f37005b, cVar.f37005b);
    }

    public final int hashCode() {
        int iHashCode = this.f37004a.hashCode() * 31;
        b bVar = this.f37005b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "GasSettingData(gasOptions=" + this.f37004a + ", selectedSetting=" + this.f37005b + ")";
    }
}
