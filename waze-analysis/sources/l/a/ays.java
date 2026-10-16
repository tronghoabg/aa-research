package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ays extends com.google.v.dm<ayt, ays> implements com.google.v.fj {
    /* synthetic */ ays(byte[] bArr) {
        super(ayt.DEFAULT_INSTANCE);
    }

    public final void a(ayn aynVar) {
        copyOnWrite();
        ((ayt) this.instance).setCategoricalGroupSearchName(aynVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ayt) this.instance).setCategoricalSearchName(str);
    }

    public final void c(ayu ayuVar) {
        copyOnWrite();
        ((ayt) this.instance).setFilterField(ayuVar);
    }

    public final void d(azy azyVar) {
        copyOnWrite();
        ((ayt) this.instance).setSearchType(azyVar);
    }

    public final void e(azs azsVar) {
        copyOnWrite();
        ((ayt) this.instance).setSource(azsVar);
    }

    private ays() {
        throw null;
    }
}
