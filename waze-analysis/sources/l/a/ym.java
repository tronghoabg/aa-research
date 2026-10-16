package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ym extends com.google.v.dm<yn, ym> implements com.google.v.fj {
    /* synthetic */ ym(byte[] bArr) {
        super(yn.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((yn) this.instance).setBody(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((yn) this.instance).setCallToAction(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((yn) this.instance).setClickUrl(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((yn) this.instance).setHeadline(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((yn) this.instance).setThumbnailUrl(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((yn) this.instance).setVisibleUrl(str);
    }

    private ym() {
        throw null;
    }
}
