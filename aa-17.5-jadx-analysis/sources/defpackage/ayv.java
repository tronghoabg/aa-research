package defpackage;

/* loaded from: classes.dex */
public final class ayv implements afec {
    private final /* synthetic */ int e;
    public static final ayv d = new ayv(3);
    public static final ayv c = new ayv(2);
    public static final ayv b = new ayv(1);
    public static final ayv a = new ayv(0);

    public ayv(int i) {
        this.e = i;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.e;
        if (i == 0) {
            ((Number) obj).intValue();
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                float[] fArr = ((cki) obj).a;
                return afak.a;
            }
            float[] fArr2 = ((cki) obj).a;
            return afak.a;
        }
        long j = ((cjv) obj).a;
        float[] fArr3 = clj.a;
        long jE = cjv.e(j, clj.x);
        return new aeh(cjv.a(jE), cjv.d(jE), cjv.c(jE), cjv.b(jE));
    }
}
