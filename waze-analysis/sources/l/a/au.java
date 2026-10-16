package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class au extends com.google.v.dm<av, au> implements com.google.v.fj {
    /* synthetic */ au(byte[] bArr) {
        super(av.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((av) this.instance).setIsNewAddress(z);
    }

    public final void b(String str) {
        copyOnWrite();
        ((av) this.instance).setVenueId(str);
    }

    private au() {
        throw null;
    }
}
