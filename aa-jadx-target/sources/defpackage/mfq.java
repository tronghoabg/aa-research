package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mfq {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PreflightDriveStatus");
    final defpackage.qsy b = new defpackage.qsy() { // from class: mfp
        @Override // defpackage.qsy
        public final void d(int i, long j, float[] fArr, byte[] bArr) {
            if (i != 11) {
                return;
            }
            defpackage.mfq mfqVar = this.a;
            mfqVar.c = (bArr[0] & 8) == 0;
            mfqVar.d++;
            ((defpackage.yqj) defpackage.mfq.a.l().ai((char) 4848)).y("Updated isPhoneConfigAllowed to %b", java.lang.Boolean.valueOf(mfqVar.c));
        }
    };
    public boolean c;
    int d;
    public defpackage.rpe e;

    final void a() {
        ((defpackage.yqj) a.l().ai((char) 4851)).u("tearDown");
        defpackage.rpe rpeVar = this.e;
        if (rpeVar != null) {
            defpackage.qsy qsyVar = this.b;
            android.util.SparseArray sparseArray = rpeVar.c;
            synchronized (sparseArray) {
                if (rpeVar.c(qsyVar, 11)) {
                    sparseArray.remove(11);
                }
            }
            this.e = null;
        }
    }
}
