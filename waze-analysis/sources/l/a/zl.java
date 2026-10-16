package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zl extends com.google.v.dm<zn, zl> implements com.google.v.fj {
    /* synthetic */ zl(byte[] bArr) {
        super(zn.DEFAULT_INSTANCE);
    }

    public final void a(zm zmVar) {
        copyOnWrite();
        ((zn) this.instance).setFailureReason(zmVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((zn) this.instance).setSuccess(z);
    }

    private zl() {
        throw null;
    }
}
