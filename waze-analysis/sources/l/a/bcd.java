package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bcd extends com.google.v.dm<bce, bcd> implements com.google.v.fj {
    /* synthetic */ bcd(byte[] bArr) {
        super(bce.DEFAULT_INSTANCE);
    }

    public final void a(bcc bccVar) {
        copyOnWrite();
        ((bce) this.instance).setAction(bccVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bce) this.instance).setSharePlatformType(str);
    }

    private bcd() {
        throw null;
    }
}
