package com.waze.ui.aa;

import com.waze.gas.GasNativeManager;
import com.waze.ui.ac.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final n f41716a;

    /* renamed from: b, reason: collision with root package name */
    private final n f41717b;

    /* renamed from: c, reason: collision with root package name */
    private final n f41718c;

    /* renamed from: d, reason: collision with root package name */
    private final n f41719d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f41720e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f41721f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f41722g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f41723h;

    public c(n nVar, n nVar2, n nVar3, n nVar4, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4) {
        x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(nVar2, "subtitle");
        x.f(aVar2, "onCancelActionClicked");
        x.f(aVar3, "onDismissed");
        this.f41716a = nVar;
        this.f41717b = nVar2;
        this.f41718c = nVar3;
        this.f41719d = nVar4;
        this.f41720e = aVar;
        this.f41721f = aVar2;
        this.f41722g = aVar3;
        this.f41723h = aVar4;
    }

    public final n a() {
        return this.f41718c;
    }

    public final n b() {
        return this.f41719d;
    }

    public final n c() {
        return this.f41717b;
    }

    public final n d() {
        return this.f41716a;
    }

    public final h.g.a.a e() {
        return this.f41723h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f41716a, cVar.f41716a) && x.n(this.f41717b, cVar.f41717b) && x.n(this.f41718c, cVar.f41718c) && x.n(this.f41719d, cVar.f41719d) && x.n(this.f41720e, cVar.f41720e) && x.n(this.f41721f, cVar.f41721f) && x.n(this.f41722g, cVar.f41722g) && x.n(this.f41723h, cVar.f41723h);
    }

    public final h.g.a.a f() {
        return this.f41720e;
    }

    public final h.g.a.a g() {
        return this.f41721f;
    }

    public final h.g.a.a h() {
        return this.f41722g;
    }

    public final int hashCode() {
        int iHashCode = (((this.f41716a.hashCode() * 31) + this.f41717b.hashCode()) * 31) + this.f41718c.hashCode();
        n nVar = this.f41719d;
        return (((((((((iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f41720e.hashCode()) * 31) + this.f41721f.hashCode()) * 31) + this.f41722g.hashCode()) * 31) + this.f41723h.hashCode();
    }

    public final String toString() {
        return "TollInfoDialogModel(title=" + this.f41716a + ", subtitle=" + this.f41717b + ", aboutTollPricesLinkText=" + this.f41718c + ", mainButtonText=" + this.f41719d + ", mainActionIntent=" + this.f41720e + ", onCancelActionClicked=" + this.f41721f + ", onDismissed=" + this.f41722g + ", aboutTollPricesActionIntent=" + this.f41723h + ")";
    }
}
