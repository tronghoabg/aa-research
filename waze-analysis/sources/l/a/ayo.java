package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayo extends com.google.v.dm<ayp, ayo> implements com.google.v.fj {
    /* synthetic */ ayo(byte[] bArr) {
        super(ayp.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ayp) this.instance).addAllFilterFields(iterable);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((ayp) this.instance).setErrorCode(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((ayp) this.instance).setQueryCharactersCount(j2);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((ayp) this.instance).setSearchAgain(z);
    }

    public final void e(String str) {
        copyOnWrite();
        ((ayp) this.instance).setSearchId(str);
    }

    private ayo() {
        throw null;
    }
}
