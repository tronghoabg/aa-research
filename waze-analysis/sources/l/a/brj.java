package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brj extends com.google.v.dm<brk, brj> implements com.google.v.fj {
    /* synthetic */ brj(byte[] bArr) {
        super(brk.DEFAULT_INSTANCE);
    }

    public final void a(brt brtVar) {
        copyOnWrite();
        ((brk) this.instance).setSelectedAnswer(brtVar);
    }

    public final void b(brz brzVar) {
        copyOnWrite();
        ((brk) this.instance).setWazeAsksInfo(brzVar);
    }

    private brj() {
        throw null;
    }
}
