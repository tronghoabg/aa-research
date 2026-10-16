package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpe extends com.google.v.dm<bpg, bpe> implements com.google.v.fj {
    /* synthetic */ bpe(byte[] bArr) {
        super(bpg.DEFAULT_INSTANCE);
    }

    public final void a(ahw ahwVar) {
        copyOnWrite();
        ((bpg) this.instance).setMapCarChanged(ahwVar);
    }

    public final void b(akx akxVar) {
        copyOnWrite();
        ((bpg) this.instance).setMyWazeItemClicked(akxVar);
    }

    public final void c(ala alaVar) {
        copyOnWrite();
        ((bpg) this.instance).setMyWazeShown(alaVar);
    }

    public final void d(bbj bbjVar) {
        copyOnWrite();
        ((bpg) this.instance).setSetCommuteMenuShown(bbjVar);
    }

    public final void e(bqc bqcVar) {
        copyOnWrite();
        ((bpg) this.instance).setVoiceChanged(bqcVar);
    }

    private bpe() {
        throw null;
    }
}
