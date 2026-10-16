package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgv extends com.google.v.dm<bgw, bgv> implements com.google.v.fj {
    /* synthetic */ bgv(byte[] bArr) {
        super(bgw.DEFAULT_INSTANCE);
    }

    public final void a(bgu bguVar) {
        copyOnWrite();
        ((bgw) this.instance).setAction(bguVar);
    }

    public final void b(bgt bgtVar) {
        copyOnWrite();
        ((bgw) this.instance).setButtonCta(bgtVar);
    }

    public final void c(bgs bgsVar) {
        copyOnWrite();
        ((bgw) this.instance).setSuggestionCard(bgsVar);
    }

    public final void d(bhi bhiVar) {
        copyOnWrite();
        ((bgw) this.instance).setTimerBehavior(bhiVar);
    }

    private bgv() {
        throw null;
    }
}
