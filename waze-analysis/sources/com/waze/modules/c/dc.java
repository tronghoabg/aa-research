package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    private final String f30046a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30047b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30048c;

    /* renamed from: d, reason: collision with root package name */
    private final List f30049d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30050e;

    public dc(String str, boolean z, List list, String str2) {
        h.g.b.x.f(str, "vehicleType");
        h.g.b.x.f(list, "permits");
        this.f30046a = str;
        this.f30047b = z;
        this.f30048c = true;
        this.f30049d = list;
        this.f30050e = str2;
    }

    public final String a() {
        return this.f30050e;
    }

    public final String b() {
        return this.f30046a;
    }

    public final List c() {
        return this.f30049d;
    }

    public final boolean d() {
        return this.f30047b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        if (!h.g.b.x.n(this.f30046a, dcVar.f30046a) || this.f30047b != dcVar.f30047b) {
            return false;
        }
        boolean z = dcVar.f30048c;
        return h.g.b.x.n(this.f30049d, dcVar.f30049d) && h.g.b.x.n(this.f30050e, dcVar.f30050e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f30046a.hashCode() * 31) + a.a.a(this.f30047b)) * 31) + a.a.a(true)) * 31) + this.f30049d.hashCode();
        String str = this.f30050e;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Parameters(vehicleType=" + this.f30046a + ", hasEVData=" + this.f30047b + ", hasS2Compression=true, permits=" + this.f30049d + ", licensePlateSuffix=" + this.f30050e + ")";
    }
}
