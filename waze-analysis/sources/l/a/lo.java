package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lo extends com.google.v.dm<lq, lo> implements com.google.v.fj {
    /* synthetic */ lo(byte[] bArr) {
        super(lq.DEFAULT_INSTANCE);
    }

    public final void a(oy oyVar) {
        copyOnWrite();
        ((lq) this.instance).setCopilotAssetsDownloadFinished(oyVar);
    }

    public final void b(pa paVar) {
        copyOnWrite();
        ((lq) this.instance).setCopilotAssetsDownloadInitiated(paVar);
    }

    public final void c(ajo ajoVar) {
        copyOnWrite();
        ((lq) this.instance).setMarketplaceFtePopupClicked(ajoVar);
    }

    public final void d(ajq ajqVar) {
        copyOnWrite();
        ((lq) this.instance).setMarketplaceFtePopupShown(ajqVar);
    }

    public final void e(ajt ajtVar) {
        copyOnWrite();
        ((lq) this.instance).setMarketplaceHeaderClicked(ajtVar);
    }

    public final void f(ajv ajvVar) {
        copyOnWrite();
        ((lq) this.instance).setMarketplaceHeaderShown(ajvVar);
    }

    private lo() {
        throw null;
    }
}
