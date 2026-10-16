package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class adm extends com.google.v.dm<adp, adm> implements adq {
    /* synthetic */ adm(byte[] bArr) {
        super(adp.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((adp) this.instance).addAllAvailableClickOptions(iterable);
    }

    public final void b(cb cbVar) {
        copyOnWrite();
        ((adp) this.instance).setAlertCardSource(cbVar);
    }

    public final void c(xi xiVar) {
        copyOnWrite();
        ((adp) this.instance).setFteCardSource(xiVar);
    }

    public final void d(adn adnVar) {
        copyOnWrite();
        ((adp) this.instance).setInsightCardState(adnVar);
    }

    public final void e(anz anzVar) {
        copyOnWrite();
        ((adp) this.instance).setNotificationCardSource(anzVar);
    }

    public final void f(bab babVar) {
        copyOnWrite();
        ((adp) this.instance).setSegmentCardSource(babVar);
    }

    public final void g(bgm bgmVar) {
        copyOnWrite();
        ((adp) this.instance).setStreetCardSource(bgmVar);
    }

    private adm() {
        throw null;
    }
}
