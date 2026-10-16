package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adto implements defpackage.adtq {
    private final /* synthetic */ int a;

    public adto(int i) {
        this.a = i;
    }

    @Override // defpackage.adtr
    public final /* synthetic */ int a(defpackage.adyk adykVar, int i, java.lang.Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            adykVar.k(i);
            return 0;
        }
        if (i3 != 1) {
            adykVar.j((byte[]) obj, i2, i);
            return i2 + i;
        }
        return adykVar.e();
    }
}
