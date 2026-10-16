package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class a extends com.google.v.dm<d, a> implements com.google.v.fj {
    /* synthetic */ a(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(yl ylVar) {
        copyOnWrite();
        ((d) this.instance).setAction(ylVar);
    }

    public final void b(b bVar) {
        copyOnWrite();
        ((d) this.instance).setButton(bVar);
    }

    public final void c(c cVar) {
        copyOnWrite();
        ((d) this.instance).setEmailInfo(cVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((d) this.instance).setHasGoogleEmail(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((d) this.instance).setRegistered(z);
    }

    private a() {
        throw null;
    }
}
