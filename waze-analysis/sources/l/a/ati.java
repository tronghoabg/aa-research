package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ati extends com.google.v.dm<atj, ati> implements com.google.v.fj {
    /* synthetic */ ati(byte[] bArr) {
        super(atj.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((atj) this.instance).setAvoidFerriesChangedTo(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((atj) this.instance).setAvoidTollsChangedTo(z);
    }

    public final void c(atk atkVar) {
        copyOnWrite();
        ((atj) this.instance).setContext(atkVar);
    }

    private ati() {
        throw null;
    }
}
