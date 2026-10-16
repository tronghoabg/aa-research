package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bh extends com.google.v.dm<bi, bh> implements com.google.v.fj {
    /* synthetic */ bh(byte[] bArr) {
        super(bi.DEFAULT_INSTANCE);
    }

    public final void a(ba baVar) {
        copyOnWrite();
        ((bi) this.instance).setContext(baVar);
    }

    public final void b(zh zhVar) {
        copyOnWrite();
        ((bi) this.instance).setGoogleAdInformation(zhVar);
    }

    public final void c() {
        copyOnWrite();
        ((bi) this.instance).setIsAd(true);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bi) this.instance).setPhotosCount(j2);
    }

    public final void e(bjz bjzVar) {
        copyOnWrite();
        ((bi) this.instance).setTriggeringPlatform(bjzVar);
    }

    public final void f(String str) {
        copyOnWrite();
        ((bi) this.instance).setVenueId(str);
    }

    private bh() {
        throw null;
    }
}
