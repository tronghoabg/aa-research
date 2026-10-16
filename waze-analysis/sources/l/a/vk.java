package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vk extends com.google.v.dm<vl, vk> implements com.google.v.fj {
    /* synthetic */ vk(byte[] bArr) {
        super(vl.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((vl) this.instance).addAllDisplayedSpecialRoutes(iterable);
    }

    public final void b(abl ablVar) {
        copyOnWrite();
        ((vl) this.instance).setHovCardInformation(ablVar);
    }

    public final void c(vj vjVar) {
        copyOnWrite();
        ((vl) this.instance).setNavigationType(vjVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((vl) this.instance).setNd4CAlgoTransparencyLinkShown(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((vl) this.instance).setShareSuggestionEnabled(z);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((vl) this.instance).setStopAdded(z);
    }

    public final void g(String str) {
        copyOnWrite();
        ((vl) this.instance).setVenueId(str);
    }

    private vk() {
        throw null;
    }
}
