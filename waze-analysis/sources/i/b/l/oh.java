package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class oh extends com.google.v.dm<oi, oh> implements oj {
    /* synthetic */ oh(byte[] bArr) {
        super(oi.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((oi) this.instance).setId(i2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((oi) this.instance).setRoutingContext(str);
    }

    public final void c(oq oqVar) {
        copyOnWrite();
        ((oi) this.instance).setToLoc(oqVar.build());
    }

    public final void d(or orVar) {
        copyOnWrite();
        ((oi) this.instance).setToLoc(orVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((oi) this.instance).setVenueId(str);
    }

    private oh() {
        throw null;
    }
}
