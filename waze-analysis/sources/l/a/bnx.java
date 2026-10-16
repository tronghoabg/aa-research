package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnx extends com.google.v.dm<boc, bnx> implements com.google.v.fj {
    /* synthetic */ bnx(byte[] bArr) {
        super(boc.DEFAULT_INSTANCE);
    }

    public final void a(bny bnyVar) {
        copyOnWrite();
        ((boc) this.instance).setLevel(bnyVar);
    }

    public final void b(bnz bnzVar) {
        copyOnWrite();
        ((boc) this.instance).setMode(bnzVar);
    }

    public final void c(boa boaVar) {
        copyOnWrite();
        ((boc) this.instance).setSubtype(boaVar);
    }

    public final void d(bob bobVar) {
        copyOnWrite();
        ((boc) this.instance).setType(bobVar);
    }

    private bnx() {
        throw null;
    }
}
