package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayw extends com.google.v.dm<ayy, ayw> implements com.google.v.fj {
    /* synthetic */ ayw(byte[] bArr) {
        super(ayy.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((ayy) this.instance).setQueryCharactersCount(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ayy) this.instance).setReferrer(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ayy) this.instance).setSearchId(str);
    }

    private ayw() {
        throw null;
    }
}
