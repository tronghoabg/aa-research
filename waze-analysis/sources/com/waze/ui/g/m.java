package com.waze.ui.g;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final aa f42346a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42347b;

    /* renamed from: c, reason: collision with root package name */
    private final List f42348c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42349d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f42350e;

    public m(aa aaVar, String str, List list, boolean z, boolean z2) {
        h.g.b.x.f(str, "imageSignature");
        h.g.b.x.f(list, "cars");
        this.f42346a = aaVar;
        this.f42347b = str;
        this.f42348c = list;
        this.f42349d = z;
        this.f42350e = z2;
    }

    public final aa a() {
        return this.f42346a;
    }

    public final String b() {
        return this.f42347b;
    }

    public final List c() {
        return this.f42348c;
    }

    public final boolean d() {
        return this.f42349d;
    }

    public final boolean e() {
        return this.f42350e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f42346a, mVar.f42346a) && h.g.b.x.n(this.f42347b, mVar.f42347b) && h.g.b.x.n(this.f42348c, mVar.f42348c) && this.f42349d == mVar.f42349d && this.f42350e == mVar.f42350e;
    }

    public final int hashCode() {
        aa aaVar = this.f42346a;
        return ((((((((aaVar == null ? 0 : aaVar.hashCode()) * 31) + this.f42347b.hashCode()) * 31) + this.f42348c.hashCode()) * 31) + a.a.a(this.f42349d)) * 31) + a.a.a(this.f42350e);
    }

    public final String toString() {
        return "CarsUiState(errorMessage=" + this.f42346a + ", imageSignature=" + this.f42347b + ", cars=" + this.f42348c + ", closeScreen=" + this.f42349d + ", loading=" + this.f42350e + ")";
    }
}
