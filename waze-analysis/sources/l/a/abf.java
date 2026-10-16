package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abf extends com.google.v.dm<abh, abf> implements com.google.v.fj {
    /* synthetic */ abf(byte[] bArr) {
        super(abh.DEFAULT_INSTANCE);
    }

    public final void a(abe abeVar) {
        copyOnWrite();
        ((abh) this.instance).setGuidanceSourceChanged(abeVar);
    }

    public final void b(bpu bpuVar) {
        copyOnWrite();
        ((abh) this.instance).setVoiceAnnouncementFinished(bpuVar);
    }

    public final void c(bpx bpxVar) {
        copyOnWrite();
        ((abh) this.instance).setVoiceAnnouncementPlayed(bpxVar);
    }

    private abf() {
        throw null;
    }
}
