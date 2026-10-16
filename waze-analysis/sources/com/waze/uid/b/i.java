package com.waze.uid.b;

import com.waze.uid.c.bb;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static int f44154a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final n f44155b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f44156c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44157d;

    /* renamed from: e, reason: collision with root package name */
    private final bb f44158e;

    public i(bb bbVar, n nVar, Set set) {
        h.g.b.x.f(set, "warnings");
        this.f44158e = bbVar;
        this.f44155b = nVar;
        this.f44156c = set;
        int i2 = f44154a;
        f44154a = i2 + 1;
        this.f44157d = i2;
    }

    public static /* synthetic */ i g(i iVar, bb bbVar, n nVar, int i2) {
        if ((i2 & 1) != 0) {
            bbVar = iVar.f44158e;
        }
        if ((i2 & 2) != 0) {
            nVar = iVar.f44155b;
        }
        Set set = iVar.f44156c;
        h.g.b.x.f(set, "warnings");
        return new i(bbVar, nVar, set);
    }

    public final int a() {
        return this.f44157d;
    }

    public final i b(n nVar) {
        return g(this, null, nVar, 5);
    }

    public final n c() {
        return this.f44155b;
    }

    public final Set d() {
        return this.f44156c;
    }

    public final i e(bb bbVar) {
        return g(this, bbVar, null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f44158e, iVar.f44158e) && h.g.b.x.n(this.f44155b, iVar.f44155b) && h.g.b.x.n(this.f44156c, iVar.f44156c);
    }

    public final bb f() {
        return this.f44158e;
    }

    public final int hashCode() {
        bb bbVar = this.f44158e;
        int iHashCode = bbVar == null ? 0 : bbVar.hashCode();
        n nVar = this.f44155b;
        return (((iHashCode * 31) + (nVar != null ? nVar.hashCode() : 0)) * 31) + this.f44156c.hashCode();
    }

    public final String toString() {
        return "ControllerState(uiData=" + this.f44158e + ", loader=" + this.f44155b + ", warnings=" + this.f44156c + ")";
    }

    public i() {
        this(null, 7);
    }

    public /* synthetic */ i(bb bbVar, int i2) {
        this(1 == (i2 & 1) ? null : bbVar, null, e.c.d.a.p());
    }
}
