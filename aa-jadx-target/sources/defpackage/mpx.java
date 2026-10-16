package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mpx implements defpackage.mpz {
    private final defpackage.rkf a;

    public mpx(defpackage.rkf rkfVar) {
        this.a = rkfVar;
    }

    @Override // defpackage.mpz
    public final android.content.ComponentName a() {
        defpackage.rkf rkfVar = this.a;
        int iOrdinal = rkfVar.ordinal();
        if (iOrdinal == 1) {
            return defpackage.mpy.b;
        }
        if (iOrdinal == 2) {
            return defpackage.mpy.c;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.mpy.a.g()).ai((char) 5170)).y("Auxiliary display does not support fallback component for content type: %s", rkfVar);
        return null;
    }

    @Override // defpackage.mpz
    public final android.content.Intent b(defpackage.qsh qshVar) {
        return new android.content.Intent();
    }

    @Override // defpackage.mpz
    public final /* synthetic */ defpackage.ygw c() {
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }
}
