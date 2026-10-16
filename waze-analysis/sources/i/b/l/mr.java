package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mr extends com.google.v.dm<mw, mr> implements mx {
    /* synthetic */ mr(byte[] bArr) {
        super(mw.DEFAULT_INSTANCE);
    }

    public final void a(mu muVar) {
        copyOnWrite();
        ((mw) this.instance).addFutureRouteConstraints(muVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((mw) this.instance).setCalculateRealtimeRoute(z);
    }

    public final void c(oi oiVar) {
        copyOnWrite();
        ((mw) this.instance).setDestination(oiVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((mw) this.instance).setIdentifier(str);
    }

    public final void e(or orVar) {
        copyOnWrite();
        ((mw) this.instance).setSource(orVar);
    }

    private mr() {
        throw null;
    }
}
