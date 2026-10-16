package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azw extends com.google.v.dm<azx, azw> implements com.google.v.fj {
    /* synthetic */ azw(byte[] bArr) {
        super(azx.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((azx) this.instance).addAllFilterFields(iterable);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((azx) this.instance).setAlgoTransparencyLinkShown(z);
    }

    public final void c(ayn aynVar) {
        copyOnWrite();
        ((azx) this.instance).setCategoricalGroupSearchName(aynVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((azx) this.instance).setCategoricalSearchName(str);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((azx) this.instance).setLatencyMs(j2);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((azx) this.instance).setQueryCharactersCount(j2);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((azx) this.instance).setResultsCount(j2);
    }

    public final void h(boolean z) {
        copyOnWrite();
        ((azx) this.instance).setSearchAgain(z);
    }

    public final void i(String str) {
        copyOnWrite();
        ((azx) this.instance).setSearchId(str);
    }

    public final void j(boolean z) {
        copyOnWrite();
        ((azx) this.instance).setSkipSearchResultsScreen(z);
    }

    public final void k(azs azsVar) {
        copyOnWrite();
        ((azx) this.instance).setSource(azsVar);
    }

    public final void l(bjz bjzVar) {
        copyOnWrite();
        ((azx) this.instance).setTriggeringPlatform(bjzVar);
    }

    public final void m(azy azyVar) {
        copyOnWrite();
        ((azx) this.instance).setType(azyVar);
    }

    private azw() {
        throw null;
    }
}
