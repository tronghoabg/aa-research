package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anx extends com.google.v.dm<anz, anx> implements com.google.v.fj {
    /* synthetic */ anx(byte[] bArr) {
        super(anz.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((anz) this.instance).setNotificationId(str);
    }

    public final void b(any anyVar) {
        copyOnWrite();
        ((anz) this.instance).setNotificationType(anyVar);
    }

    private anx() {
        throw null;
    }
}
