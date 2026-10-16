package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajw extends com.google.v.dm<ajx, ajw> implements com.google.v.fj {
    /* synthetic */ ajw(byte[] bArr) {
        super(ajx.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ajx) this.instance).setAction(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ajx) this.instance).setText(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ajx) this.instance).setTitle(str);
    }

    private ajw() {
        throw null;
    }
}
