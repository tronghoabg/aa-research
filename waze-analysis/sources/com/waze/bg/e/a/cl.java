package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cl extends com.google.v.dm<cx, cl> implements com.google.v.fj {
    /* synthetic */ cl(byte[] bArr) {
        super(cx.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((cx) this.instance).setCityName(str);
    }

    public final void b(cq cqVar) {
        copyOnWrite();
        ((cx) this.instance).setFavoriteInfo(cqVar);
    }

    public final void c(eh ehVar) {
        copyOnWrite();
        ((cx) this.instance).setLocation(ehVar.build());
    }

    public final void d(ei eiVar) {
        copyOnWrite();
        ((cx) this.instance).setLocation(eiVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((cx) this.instance).setRoutingContext(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((cx) this.instance).setStreetName(str);
    }

    public final void g(ct ctVar) {
        copyOnWrite();
        ((cx) this.instance).setVenueInfo(ctVar.build());
    }

    public final void h(cu cuVar) {
        copyOnWrite();
        ((cx) this.instance).setVenueInfo(cuVar);
    }

    private cl() {
        throw null;
    }
}
