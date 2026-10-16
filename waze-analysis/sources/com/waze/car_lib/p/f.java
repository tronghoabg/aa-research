package com.waze.car_lib.p;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20799a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20800b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20801c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f20802d;

    public f(boolean z, boolean z2, String str, h.g.a.l lVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(lVar, "checkedChangedListener");
        this.f20799a = z;
        this.f20800b = z2;
        this.f20801c = str;
        this.f20802d = lVar;
    }

    public final String a() {
        return this.f20801c;
    }

    public final h.g.a.l b() {
        return this.f20802d;
    }

    public final boolean c() {
        return this.f20799a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f20799a == fVar.f20799a && this.f20800b == fVar.f20800b && h.g.b.x.n(this.f20801c, fVar.f20801c) && h.g.b.x.n(this.f20802d, fVar.f20802d);
    }

    public final int hashCode() {
        return (((((a.a.a(this.f20799a) * 31) + a.a.a(this.f20800b)) * 31) + this.f20801c.hashCode()) * 31) + this.f20802d.hashCode();
    }

    public final String toString() {
        return "Item(isActive=" + this.f20799a + ", isLocal=" + this.f20800b + ", name=" + this.f20801c + ", checkedChangedListener=" + this.f20802d + ")";
    }
}
