package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class be extends com.google.v.dm<bg, be> implements com.google.v.fj {
    /* synthetic */ be(byte[] bArr) {
        super(bg.DEFAULT_INSTANCE);
    }

    public final void a(at atVar) {
        copyOnWrite();
        ((bg) this.instance).setAccessTokenType(atVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bg) this.instance).setCommunity(str);
    }

    public final void c(bc bcVar) {
        copyOnWrite();
        ((bg) this.instance).setInitialNotificationsPreferences(bcVar.build());
    }

    public final void d(bf bfVar) {
        copyOnWrite();
        ((bg) this.instance).setMode(bfVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bg) this.instance).setToken(str);
    }

    public final void f() {
        copyOnWrite();
        ((bg) this.instance).setUidEnabled(true);
    }

    private be() {
        throw null;
    }
}
