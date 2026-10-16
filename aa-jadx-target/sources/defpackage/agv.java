package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agv implements defpackage.aeq {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public agv(defpackage.aep aepVar, float f, float f2, int i) {
        this.a = i;
        int iB = aepVar.b();
        defpackage.afh[] afhVarArr = new defpackage.afh[iB];
        for (int i2 = 0; i2 < iB; i2++) {
            afhVarArr[i2] = new defpackage.afh(f, f2, aepVar.a(i2));
        }
        this.b = afhVarArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afe, java.lang.Object] */
    @Override // defpackage.aeq
    public final /* synthetic */ defpackage.afe a(int i) {
        int i2 = this.a;
        ?? r1 = this.b;
        return i2 != 0 ? ((defpackage.afh[]) r1)[i] : r1;
    }

    public agv(float f, float f2, int i) {
        this.a = i;
        this.b = new defpackage.afh(f, f2, 0.01f);
    }
}
