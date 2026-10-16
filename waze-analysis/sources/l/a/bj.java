package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bj extends com.google.v.dm<bm, bj> implements com.google.v.fj {
    /* synthetic */ bj(byte[] bArr) {
        super(bm.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bm) this.instance).setBookParkingShown(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bm) this.instance).setHasMoreParkingLots(z);
    }

    public final void c(bk bkVar) {
        copyOnWrite();
        ((bm) this.instance).setParkingNotSuggestedReason(bkVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((bm) this.instance).setParkingPricesShown(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((bm) this.instance).setParkingSuggested(z);
    }

    public final void f(String str) {
        copyOnWrite();
        ((bm) this.instance).setParkingVenueId(str);
    }

    public final void g(bl blVar) {
        copyOnWrite();
        ((bm) this.instance).setShownAtTop(blVar);
    }

    public final void h(String str) {
        copyOnWrite();
        ((bm) this.instance).setVenueId(str);
    }

    private bj() {
        throw null;
    }
}
