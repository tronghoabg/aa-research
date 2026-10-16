package com.waze.search.v2;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f36170a = new b(Dp.m11162boximpl(0.0f), Dp.m11162boximpl(0.0f));

    /* renamed from: b, reason: collision with root package name */
    private static final b f36171b = new b(com.waze.design_components.a.d.f23295a, com.waze.design_components.a.d.f23295a);

    /* renamed from: c, reason: collision with root package name */
    private final Object f36172c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f36173d;

    public b(Object obj, Object obj2) {
        this.f36172c = obj;
        this.f36173d = obj2;
    }

    public static /* synthetic */ b g(b bVar, Object obj, Object obj2, int i2) {
        if ((i2 & 1) != 0) {
            obj = bVar.f36172c;
        }
        if ((i2 & 2) != 0) {
            obj2 = bVar.f36173d;
        }
        return new b(obj, obj2);
    }

    public final b c(boolean z, Object obj) {
        return z ? g(this, null, obj, 1) : g(this, obj, null, 2);
    }

    public final Object d(boolean z) {
        return z ? this.f36173d : this.f36172c;
    }

    public final Object e() {
        return this.f36173d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f36172c, bVar.f36172c) && h.g.b.x.n(this.f36173d, bVar.f36173d);
    }

    public final Object f() {
        return this.f36172c;
    }

    public final int hashCode() {
        Object obj = this.f36172c;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f36173d;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "DualSheetValue(search=" + this.f36172c + ", lpp=" + this.f36173d + ")";
    }
}
