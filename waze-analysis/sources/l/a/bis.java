package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bis extends com.google.v.dm<biu, bis> implements com.google.v.fj {
    /* synthetic */ bis(byte[] bArr) {
        super(biu.DEFAULT_INSTANCE);
    }

    public final void a(double d2) {
        copyOnWrite();
        ((biu) this.instance).setTollPrice(d2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((biu) this.instance).setTollPriceCurrency(str);
    }

    private bis() {
        throw null;
    }
}
