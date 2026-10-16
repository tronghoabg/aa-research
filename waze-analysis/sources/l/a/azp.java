package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azp extends com.google.v.dm<azq, azp> implements com.google.v.fj {
    /* synthetic */ azp(byte[] bArr) {
        super(azq.DEFAULT_INSTANCE);
    }

    public final void a(ayn aynVar) {
        copyOnWrite();
        ((azq) this.instance).setCategoricalGroupSearchName(aynVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((azq) this.instance).setCategoricalSearchName(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((azq) this.instance).setSearchId(str);
    }

    public final void d(azy azyVar) {
        copyOnWrite();
        ((azq) this.instance).setSearchType(azyVar);
    }

    public final void e(azr azrVar) {
        copyOnWrite();
        ((azq) this.instance).setSortField(azrVar);
    }

    public final void f(azs azsVar) {
        copyOnWrite();
        ((azq) this.instance).setSource(azsVar);
    }

    private azp() {
        throw null;
    }
}
