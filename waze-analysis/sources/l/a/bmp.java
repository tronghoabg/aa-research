package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmp extends com.google.v.dm<bmq, bmp> implements com.google.v.fj {
    /* synthetic */ bmp(byte[] bArr) {
        super(bmq.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((bmq) this.instance).setCampaignName(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bmq) this.instance).setUcommId(str);
    }

    private bmp() {
        throw null;
    }
}
