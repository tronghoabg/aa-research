package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asd extends com.google.v.dm<ase, asd> implements com.google.v.fj {
    /* synthetic */ asd(byte[] bArr) {
        super(ase.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ase) this.instance).setId(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ase) this.instance).setImageUrl(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ase) this.instance).setText(str);
    }

    private asd() {
        throw null;
    }
}
