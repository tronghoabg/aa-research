package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azc extends com.google.v.dm<aze, azc> implements com.google.v.fj {
    /* synthetic */ azc(byte[] bArr) {
        super(aze.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((aze) this.instance).setCategoriesShown(z);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((aze) this.instance).setListCardsCount(j2);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((aze) this.instance).setPortrait(z);
    }

    public final void d(bjz bjzVar) {
        copyOnWrite();
        ((aze) this.instance).setTriggeringPlatform(bjzVar);
    }

    private azc() {
        throw null;
    }
}
