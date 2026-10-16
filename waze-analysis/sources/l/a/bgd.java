package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgd extends com.google.v.dm<bgf, bgd> implements com.google.v.fj {
    /* synthetic */ bgd(byte[] bArr) {
        super(bgf.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bgf) this.instance).setCalendarCardsCount(j2);
    }

    public final void b(wj wjVar) {
        copyOnWrite();
        ((bgf) this.instance).setFavoritesCarousel(wjVar);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((bgf) this.instance).setListCardsCount(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bgf) this.instance).setPlannedDriveCardsCount(j2);
    }

    public final void e(bge bgeVar) {
        copyOnWrite();
        ((bgf) this.instance).setReason(bgeVar);
    }

    private bgd() {
        throw null;
    }
}
