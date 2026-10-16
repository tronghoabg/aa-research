package com.waze.settings.a.a.a;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f36701a;

    /* renamed from: b, reason: collision with root package name */
    private final List f36702b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36703c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36704d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36705e;

    public e(d dVar, List list, String str, boolean z, boolean z2) {
        x.f(list, "cars");
        x.f(str, "selectedCarId");
        this.f36701a = dVar;
        this.f36702b = list;
        this.f36703c = str;
        this.f36704d = z;
        this.f36705e = z2;
    }

    public static /* synthetic */ e f(e eVar, d dVar, List list, String str, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            dVar = eVar.f36701a;
        }
        d dVar2 = dVar;
        if ((i2 & 2) != 0) {
            list = eVar.f36702b;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            str = eVar.f36703c;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z = eVar.f36704d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = eVar.f36705e;
        }
        x.f(list2, "cars");
        x.f(str2, "selectedCarId");
        return new e(dVar2, list2, str2, z3, z2);
    }

    public final d a() {
        return this.f36701a;
    }

    public final String b() {
        return this.f36703c;
    }

    public final List c() {
        return this.f36702b;
    }

    public final boolean d() {
        return this.f36704d;
    }

    public final boolean e() {
        return this.f36705e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f36701a, eVar.f36701a) && x.n(this.f36702b, eVar.f36702b) && x.n(this.f36703c, eVar.f36703c) && this.f36704d == eVar.f36704d && this.f36705e == eVar.f36705e;
    }

    public final int hashCode() {
        d dVar = this.f36701a;
        return ((((((((dVar == null ? 0 : dVar.hashCode()) * 31) + this.f36702b.hashCode()) * 31) + this.f36703c.hashCode()) * 31) + a.a.a(this.f36704d)) * 31) + a.a.a(this.f36705e);
    }

    public final String toString() {
        return "CarsSettingsDomainState(errorMessage=" + this.f36701a + ", cars=" + this.f36702b + ", selectedCarId=" + this.f36703c + ", carApplied=" + this.f36704d + ", loading=" + this.f36705e + ")";
    }
}
