package defpackage;

/* loaded from: classes.dex */
public final class ago implements aej {
    private final /* synthetic */ int a;
    private final Object b;

    public ago(aei aeiVar, float f, float f2, int i) {
        this.a = i;
        int iB = aeiVar.b();
        afa[] afaVarArr = new afa[iB];
        for (int i2 = 0; i2 < iB; i2++) {
            afaVarArr[i2] = new afa(f, f2, aeiVar.a(i2));
        }
        this.b = afaVarArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aex, java.lang.Object] */
    @Override // defpackage.aej
    public final /* synthetic */ aex a(int i) {
        int i2 = this.a;
        ?? r1 = this.b;
        return i2 != 0 ? ((afa[]) r1)[i] : r1;
    }

    public ago(float f, float f2, int i) {
        this.a = i;
        this.b = new afa(f, f2, 0.01f);
    }
}
