package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pew implements defpackage.tma {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pew(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.tma
    public final void a() {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.peu) obj).c().release();
        } else {
            ((android.os.PowerManager.WakeLock) ((defpackage.pfs) obj).e.get()).release();
        }
    }
}
