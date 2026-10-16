package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class adr extends com.google.v.dm<ads, adr> implements com.google.v.fj {
    /* synthetic */ adr(byte[] bArr) {
        super(ads.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ads) this.instance).addAllFromInsightState(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((ads) this.instance).addAllToInsightState(iterable);
    }

    private adr() {
        throw null;
    }
}
