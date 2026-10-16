package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aya extends com.google.v.dm<ayb, aya> implements com.google.v.fj {
    /* synthetic */ aya(byte[] bArr) {
        super(ayb.DEFAULT_INSTANCE);
    }

    public final void a(ayn aynVar) {
        copyOnWrite();
        ((ayb) this.instance).setCategoricalGroupSearchName(aynVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ayb) this.instance).setCategoricalSearchName(str);
    }

    private aya() {
        throw null;
    }
}
