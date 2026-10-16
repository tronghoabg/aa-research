package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aza implements defpackage.affc {
    private final /* synthetic */ int e;
    public static final defpackage.aza d = new defpackage.aza(3);
    public static final defpackage.aza c = new defpackage.aza(2);
    public static final defpackage.aza b = new defpackage.aza(1);
    public static final defpackage.aza a = new defpackage.aza(0);

    public aza(int i) {
        this.e = i;
    }

    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        int i = this.e;
        if (i == 0) {
            ((java.lang.Number) obj).intValue();
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                float[] fArr = ((defpackage.ckq) obj).a;
                return defpackage.afbk.a;
            }
            float[] fArr2 = ((defpackage.ckq) obj).a;
            return defpackage.afbk.a;
        }
        long j = ((defpackage.ckd) obj).a;
        float[] fArr3 = defpackage.clr.a;
        long jE = defpackage.ckd.e(j, defpackage.clr.x);
        return new defpackage.aeo(defpackage.ckd.a(jE), defpackage.ckd.d(jE), defpackage.ckd.c(jE), defpackage.ckd.b(jE));
    }
}
