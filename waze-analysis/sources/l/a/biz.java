package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class biz extends com.google.v.dm<bjb, biz> implements com.google.v.fj {
    /* synthetic */ biz(byte[] bArr) {
        super(bjb.DEFAULT_INSTANCE);
    }

    public final void a(biy biyVar) {
        copyOnWrite();
        ((bjb) this.instance).setActionSource(biyVar);
    }

    public final void b(bja bjaVar) {
        copyOnWrite();
        ((bjb) this.instance).setPopupId(bjaVar);
    }

    public final void c(double d2) {
        copyOnWrite();
        ((bjb) this.instance).setTollPrice(d2);
    }

    public final void d(String str) {
        copyOnWrite();
        ((bjb) this.instance).setTollPriceCurrency(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bjb) this.instance).setTollRoadNames(str);
    }

    private biz() {
        throw null;
    }
}
