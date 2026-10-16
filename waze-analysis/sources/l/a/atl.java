package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atl extends com.google.v.dm<atm, atl> implements com.google.v.fj {
    /* synthetic */ atl(byte[] bArr) {
        super(atm.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((atm) this.instance).setAvoidFerriesShown(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((atm) this.instance).setAvoidTollsShown(z);
    }

    public final void c(atk atkVar) {
        copyOnWrite();
        ((atm) this.instance).setContext(atkVar);
    }

    private atl() {
        throw null;
    }
}
