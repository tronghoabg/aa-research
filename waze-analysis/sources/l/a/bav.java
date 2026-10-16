package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bav extends com.google.v.dm<baw, bav> implements com.google.v.fj {
    /* synthetic */ bav(byte[] bArr) {
        super(baw.DEFAULT_INSTANCE);
    }

    public final void a(bas basVar) {
        copyOnWrite();
        ((baw) this.instance).setGenericResponseData(basVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((baw) this.instance).setLoggedIn(z);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((baw) this.instance).setRoutesCount(j2);
    }

    public final void d(awx awxVar) {
        copyOnWrite();
        ((baw) this.instance).setUseCase(awxVar);
    }

    private bav() {
        throw null;
    }
}
