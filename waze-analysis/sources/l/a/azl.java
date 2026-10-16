package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azl extends com.google.v.dm<azm, azl> implements com.google.v.fj {
    /* synthetic */ azl(byte[] bArr) {
        super(azm.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((azm) this.instance).addAllFilterFields(iterable);
    }

    public final void b(ayn aynVar) {
        copyOnWrite();
        ((azm) this.instance).setCategoricalGroupSearchName(aynVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((azm) this.instance).setCategoricalSearchName(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((azm) this.instance).setSearchId(str);
    }

    public final void e(azy azyVar) {
        copyOnWrite();
        ((azm) this.instance).setSearchType(azyVar);
    }

    public final void f(azs azsVar) {
        copyOnWrite();
        ((azm) this.instance).setSource(azsVar);
    }

    private azl() {
        throw null;
    }
}
