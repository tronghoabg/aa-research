package com.waze.copilot.presentation;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.g.t f23151a;

    /* renamed from: b, reason: collision with root package name */
    private final q f23152b;

    /* renamed from: c, reason: collision with root package name */
    private final p f23153c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23154d;

    /* renamed from: e, reason: collision with root package name */
    private final s f23155e;

    public r(com.waze.ui.g.t tVar, q qVar, p pVar, String str, s sVar) {
        x.f(tVar, "headerState");
        x.f(str, "webViewUrl");
        x.f(sVar, "pageStatus");
        this.f23151a = tVar;
        this.f23152b = qVar;
        this.f23153c = pVar;
        this.f23154d = str;
        this.f23155e = sVar;
    }

    public static /* synthetic */ r f(r rVar, com.waze.ui.g.t tVar, q qVar, p pVar, String str, s sVar, int i2) {
        if ((i2 & 1) != 0) {
            tVar = rVar.f23151a;
        }
        com.waze.ui.g.t tVar2 = tVar;
        if ((i2 & 2) != 0) {
            qVar = rVar.f23152b;
        }
        q qVar2 = qVar;
        if ((i2 & 4) != 0) {
            pVar = rVar.f23153c;
        }
        p pVar2 = pVar;
        if ((i2 & 8) != 0) {
            str = rVar.f23154d;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            sVar = rVar.f23155e;
        }
        s sVar2 = sVar;
        x.f(tVar2, "headerState");
        x.f(str2, "webViewUrl");
        x.f(sVar2, "pageStatus");
        return new r(tVar2, qVar2, pVar2, str2, sVar2);
    }

    public final p a() {
        return this.f23153c;
    }

    public final q b() {
        return this.f23152b;
    }

    public final s c() {
        return this.f23155e;
    }

    public final com.waze.ui.g.t d() {
        return this.f23151a;
    }

    public final String e() {
        return this.f23154d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return x.n(this.f23151a, rVar.f23151a) && x.n(this.f23152b, rVar.f23152b) && x.n(this.f23153c, rVar.f23153c) && x.n(this.f23154d, rVar.f23154d) && this.f23155e == rVar.f23155e;
    }

    public final int hashCode() {
        int iHashCode = this.f23151a.hashCode() * 31;
        q qVar = this.f23152b;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        p pVar = this.f23153c;
        return ((((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.f23154d.hashCode()) * 31) + this.f23155e.hashCode();
    }

    public final String toString() {
        return "MarketplaceUiState(headerState=" + this.f23151a + ", snackBarState=" + this.f23152b + ", dialogState=" + this.f23153c + ", webViewUrl=" + this.f23154d + ", pageStatus=" + this.f23155e + ")";
    }
}
