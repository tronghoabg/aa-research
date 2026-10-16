package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ef extends com.google.v.dm<eh, ef> implements com.google.v.fj {
    /* synthetic */ ef(byte[] bArr) {
        super(eh.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((eh) this.instance).addAllAlternativeRoutes(iterable);
    }

    public final void b(eg egVar) {
        copyOnWrite();
        ((eh) this.instance).setReason(egVar);
    }

    private ef() {
        throw null;
    }
}
