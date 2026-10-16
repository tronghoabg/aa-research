package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pk extends com.google.v.dm<pl, pk> implements com.google.v.fj {
    /* synthetic */ pk(byte[] bArr) {
        super(pl.DEFAULT_INSTANCE);
    }

    public final void a(pj pjVar) {
        copyOnWrite();
        ((pl) this.instance).setAction(pjVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((pl) this.instance).setPromptType(str);
    }

    private pk() {
        throw null;
    }
}
