package com.waze.view.popups;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f45360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45363d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45364e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45365f;

    public u() {
        int iR = com.waze.shared_infra.i.h.r(16);
        int iR2 = com.waze.shared_infra.i.h.r(24);
        int iR3 = com.waze.shared_infra.i.h.r(8);
        int iR4 = com.waze.shared_infra.i.h.r(8);
        int iR5 = com.waze.shared_infra.i.h.r(16);
        int iR6 = com.waze.shared_infra.i.h.r(16);
        this.f45360a = iR;
        this.f45361b = iR2;
        this.f45362c = iR3;
        this.f45363d = iR4;
        this.f45364e = iR5;
        this.f45365f = iR6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f45360a == uVar.f45360a && this.f45361b == uVar.f45361b && this.f45362c == uVar.f45362c && this.f45363d == uVar.f45363d && this.f45364e == uVar.f45364e && this.f45365f == uVar.f45365f;
    }

    public final int hashCode() {
        return (((((((((this.f45360a * 31) + this.f45361b) * 31) + this.f45362c) * 31) + this.f45363d) * 31) + this.f45364e) * 31) + this.f45365f;
    }

    public final String toString() {
        return "UserTooltipViewDimensions(yPadding=" + this.f45360a + ", arrowWidth=" + this.f45361b + ", marginLeft=" + this.f45362c + ", marginRight=" + this.f45363d + ", marginTop=" + this.f45364e + ", marginBottom=" + this.f45365f + ")";
    }
}
