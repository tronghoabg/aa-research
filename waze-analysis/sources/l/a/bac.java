package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bac extends com.google.v.dm<bad, bac> implements com.google.v.fj {
    /* synthetic */ bac(byte[] bArr) {
        super(bad.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bad) this.instance).setForward(z);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bad) this.instance).setFromNode(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((bad) this.instance).setToNode(j2);
    }

    private bac() {
        throw null;
    }
}
