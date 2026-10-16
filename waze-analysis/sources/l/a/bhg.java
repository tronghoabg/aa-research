package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhg extends com.google.v.dm<bhh, bhg> implements com.google.v.fj {
    /* synthetic */ bhg(byte[] bArr) {
        super(bhh.DEFAULT_INSTANCE);
    }

    public final void a(bgt bgtVar) {
        copyOnWrite();
        ((bhh) this.instance).setButtonCta(bgtVar);
    }

    public final void b(bgs bgsVar) {
        copyOnWrite();
        ((bhh) this.instance).setSuggestionCard(bgsVar);
    }

    public final void c(bhi bhiVar) {
        copyOnWrite();
        ((bhh) this.instance).setTimerBehavior(bhiVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((bhh) this.instance).setVisible(z);
    }

    private bhg() {
        throw null;
    }
}
