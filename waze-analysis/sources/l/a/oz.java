package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oz extends com.google.v.dm<pa, oz> implements com.google.v.fj {
    /* synthetic */ oz(byte[] bArr) {
        super(pa.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((pa) this.instance).setCampaignId(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((pa) this.instance).setCarId(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((pa) this.instance).setMoodId(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((pa) this.instance).setVoiceId(str);
    }

    private oz() {
        throw null;
    }
}
