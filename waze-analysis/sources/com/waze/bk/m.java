package com.waze.bk;

import android.view.Surface;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.bi.i {

    /* renamed from: a, reason: collision with root package name */
    private final Surface f16868a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16869b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16870c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Surface surface, int i2, int i3, int i4) {
        super(null);
        x.f(surface, "surface");
        this.f16868a = surface;
        this.f16869b = i2;
        this.f16870c = i3;
        this.f16871d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return x.n(this.f16868a, mVar.f16868a) && this.f16869b == mVar.f16869b && this.f16870c == mVar.f16870c && this.f16871d == mVar.f16871d;
    }

    public final int h() {
        return this.f16871d;
    }

    public final int hashCode() {
        return (((((this.f16868a.hashCode() * 31) + this.f16869b) * 31) + this.f16870c) * 31) + this.f16871d;
    }

    public final int i() {
        return this.f16870c;
    }

    public final int j() {
        return this.f16869b;
    }

    public final Surface k() {
        return this.f16868a;
    }

    public final String toString() {
        return "Created(surface=" + this.f16868a + ", width=" + this.f16869b + ", height=" + this.f16870c + ", dpi=" + this.f16871d + ")";
    }
}
