package l.a;

/* compiled from: WazeSource */
/* renamed from: l.a.if, reason: invalid class name */
/* loaded from: classes9.dex */
public final class Cif extends com.google.v.dm<ig, Cif> implements com.google.v.fj {
    /* synthetic */ Cif(byte[] bArr) {
        super(ig.DEFAULT_INSTANCE);
    }

    public final void a(ie ieVar) {
        copyOnWrite();
        ((ig) this.instance).setAction(ieVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((ig) this.instance).setDontShowAgain(z);
    }

    public final void c(in inVar) {
        copyOnWrite();
        ((ig) this.instance).setRequestTrigger(inVar);
    }

    private Cif() {
        throw null;
    }
}
