package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class czu implements java.util.concurrent.Executor {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ czu(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((android.view.View) this.a).postOnAnimation(runnable);
                return;
            case 1:
                defpackage.czz czzVarN = ((defpackage.czz) this.a).N();
                if (czzVarN != null) {
                    czzVarN.n(new defpackage.ehx((java.lang.Object) runnable, 1, (byte[]) null));
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((android.os.Handler) ((ajer) this.a).b).post(runnable);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i = pdc.e;
                ((android.os.Handler) this.a).post(runnable);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((peg) this.a).d(runnable);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case 9:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case 10:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case 11:
                ((android.os.Handler) this.a).post(runnable);
                return;
            case 12:
                ((android.os.Handler) this.a).post(runnable);
                return;
            default:
                java.util.concurrent.ExecutorService executorService = ztd.a;
                if (!((android.os.Handler) this.a).post(runnable)) {
                    throw new java.lang.RuntimeException("Operation could not be posted on handler. Looper may be exiting.");
                }
                return;
        }
    }

    public czu(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
