package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adpi extends defpackage.adkz {
    public final defpackage.adxc a;
    public final defpackage.adpt b;
    private boolean c;

    public adpi(defpackage.adpe adpeVar, android.content.Context context, defpackage.adrq adrqVar) {
        defpackage.adpt adptVar = new defpackage.adpt();
        adptVar.a = context;
        adptVar.h = adrqVar;
        this.b = adptVar;
        this.a = new defpackage.adxc(adpeVar, adpeVar.c(), adptVar);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        defpackage.ysr.bk(!this.c, "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.c(60L, timeUnit);
    }

    @Override // defpackage.adky, defpackage.admp
    public final defpackage.admn a() {
        defpackage.adxc adxcVar = this.a;
        adxu adxuVar = adxcVar.g;
        adxuVar.getClass();
        defpackage.adpt adptVar = this.b;
        adptVar.b = adxuVar;
        defpackage.adnm adnmVar = defpackage.adpf.a;
        android.content.Context context = adptVar.a;
        if (adxcVar.l == null) {
            adxcVar.l = new java.util.IdentityHashMap();
        }
        java.util.IdentityHashMap identityHashMap = adxcVar.l;
        context.getClass();
        identityHashMap.put(adnmVar, context);
        return super.a();
    }

    @Override // defpackage.adkz, defpackage.adky
    public final defpackage.admp b() {
        return this.a;
    }

    public final void d() {
        this.c = true;
        super.c(1000L, java.util.concurrent.TimeUnit.DAYS);
    }
}
