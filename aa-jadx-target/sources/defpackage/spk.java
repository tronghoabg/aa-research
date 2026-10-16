package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class spk implements defpackage.smb {
    final /* synthetic */ defpackage.smc a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public spk(defpackage.rkq rkqVar, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.a = basePendingResult;
        this.b = rkqVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.smb
    public final void a(com.google.android.gms.common.api.Status status) {
        if (this.c != 0) {
            ((defpackage.rkq) this.b).a.remove(this.a);
        } else if (status.c()) {
            this.a.c(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
            ((defpackage.lhe) this.b).f(null);
        } else {
            ((defpackage.lhe) this.b).e(defpackage.sqs.aC(status));
        }
    }

    public spk(defpackage.smc smcVar, defpackage.lhe lheVar, int i) {
        this.c = i;
        this.a = smcVar;
        this.b = lheVar;
    }
}
