package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class kb extends com.google.v.dm<kc, kb> implements com.google.v.fj {
    /* synthetic */ kb(byte[] bArr) {
        super(kc.DEFAULT_INSTANCE);
    }

    public final void a(i.b.p.c cVar) {
        copyOnWrite();
        ((kc) this.instance).setAccessTokenType(cVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((kc) this.instance).setCommunity(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((kc) this.instance).setToken(str);
    }

    private kb() {
        throw null;
    }
}
