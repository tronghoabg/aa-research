package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bkq implements defpackage.bjx {
    private final /* synthetic */ int c;
    public static final defpackage.bkq b = new defpackage.bkq(1);
    public static final defpackage.bkq a = new defpackage.bkq(0);

    public bkq(int i) {
        this.c = i;
    }

    @Override // defpackage.bjx
    public final long a(defpackage.bkl bklVar, int i) {
        if (this.c == 0) {
            return bklVar.d.k(i);
        }
        java.lang.String strB = bklVar.b();
        long jG = defpackage.dax.g(defpackage.asq.ab(strB, i), defpackage.asq.aa(strB, i));
        long j = defpackage.dgc.a;
        return jG;
    }
}
