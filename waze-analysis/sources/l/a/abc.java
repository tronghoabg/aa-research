package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abc extends com.google.v.dm<abe, abc> implements com.google.v.fj {
    /* synthetic */ abc(byte[] bArr) {
        super(abe.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((abe) this.instance).setAlternativeRouteUuid(str);
    }

    public final void b(abd abdVar) {
        copyOnWrite();
        ((abe) this.instance).setGuidanceSource(abdVar);
    }

    private abc() {
        throw null;
    }
}
