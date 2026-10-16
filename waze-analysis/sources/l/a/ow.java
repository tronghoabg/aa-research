package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ow extends com.google.v.dm<oy, ow> implements com.google.v.fj {
    /* synthetic */ ow(byte[] bArr) {
        super(oy.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((oy) this.instance).setCampaignId(j2);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((oy) this.instance).setCarDownloaded(z);
    }

    public final void c(ox oxVar) {
        copyOnWrite();
        ((oy) this.instance).setFailureReason(oxVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((oy) this.instance).setMoodDownloaded(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((oy) this.instance).setSuccess(z);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((oy) this.instance).setVoiceDownloaded(z);
    }

    private ow() {
        throw null;
    }
}
