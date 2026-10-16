package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aza extends com.google.v.dm<azb, aza> implements com.google.v.fj {
    /* synthetic */ aza(byte[] bArr) {
        super(azb.DEFAULT_INSTANCE);
    }

    public final void a(ayz ayzVar) {
        copyOnWrite();
        ((azb) this.instance).setAction(ayzVar);
    }

    public final void b(ayn aynVar) {
        copyOnWrite();
        ((azb) this.instance).setCategory(aynVar);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((azb) this.instance).setCategoryIndex(j2);
    }

    public final void d(px pxVar) {
        copyOnWrite();
        ((azb) this.instance).setClickedCard(pxVar);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((azb) this.instance).setDestinationCardIndex(j2);
    }

    public final void f(bjz bjzVar) {
        copyOnWrite();
        ((azb) this.instance).setTriggeringPlatform(bjzVar);
    }

    public final void g() {
        copyOnWrite();
        ((azb) this.instance).setFeaturedCategory(true);
    }

    private aza() {
        throw null;
    }
}
