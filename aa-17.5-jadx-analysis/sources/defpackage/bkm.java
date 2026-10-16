package defpackage;

/* loaded from: classes.dex */
final class bkm implements bjt {
    private final /* synthetic */ int c;
    public static final bkm b = new bkm(1);
    public static final bkm a = new bkm(0);

    public bkm(int i) {
        this.c = i;
    }

    @Override // defpackage.bjt
    public final long a(bkh bkhVar, int i) {
        if (this.c == 0) {
            return bkhVar.d.k(i);
        }
        String strB = bkhVar.b();
        long jT = czz.t(asl.ab(strB, i), asl.aa(strB, i));
        long j = dfv.a;
        return jT;
    }
}
