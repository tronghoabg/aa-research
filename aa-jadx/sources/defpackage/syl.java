package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class syl extends defpackage.sym {
    public syl(java.lang.Integer num) {
        super("gms:feedback_client:feedback_options_max_data_size", num);
    }

    @Override // defpackage.sym
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        int iIntValue;
        android.content.ContentResolver contentResolver = defpackage.sym.a;
        java.lang.Integer num = (java.lang.Integer) this.c;
        int iIntValue2 = num.intValue();
        defpackage.syf syfVar = defpackage.syd.a;
        defpackage.syj syjVar = (defpackage.syj) syfVar;
        syjVar.f(contentResolver);
        syjVar.d(contentResolver);
        syjVar.e.lock();
        java.lang.String str = this.b;
        try {
            java.lang.Object obj = ((defpackage.syj) syfVar).i;
            java.lang.Integer numValueOf = (java.lang.Integer) ((defpackage.syj) syfVar).c(((defpackage.syj) syfVar).g, str, num, defpackage.syj.b);
            syjVar.e.unlock();
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                java.lang.String strB = syjVar.b(contentResolver, str);
                if (strB != null) {
                    try {
                        int i = java.lang.Integer.parseInt(strB);
                        numValueOf = java.lang.Integer.valueOf(i);
                        iIntValue2 = i;
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                syjVar.e(obj, syjVar.g, str, numValueOf, defpackage.syj.b);
                iIntValue = iIntValue2;
            }
            return java.lang.Integer.valueOf(iIntValue);
        } catch (java.lang.Throwable th) {
            syjVar.e.unlock();
            throw th;
        }
    }
}
