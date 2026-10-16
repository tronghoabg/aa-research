package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class csw implements defpackage.cvs {
    private final java.lang.String b;
    private final defpackage.cvs[] c;
    private final defpackage.cuz d;
    private final defpackage.cuz e;

    public csw(java.lang.String str, defpackage.cvs[] cvsVarArr) {
        this.b = str;
        this.c = cvsVarArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(cvsVarArr.length);
        for (defpackage.cvs cvsVar : cvsVarArr) {
            arrayList.add(cvsVar.a());
        }
        defpackage.cuz[] cuzVarArr = (defpackage.cuz[]) arrayList.toArray(new defpackage.cuz[0]);
        this.d = new defpackage.cva((defpackage.cuz[]) java.util.Arrays.copyOf(cuzVarArr, cuzVarArr.length), 1);
        defpackage.cvs[] cvsVarArr2 = this.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(cvsVarArr2.length);
        for (defpackage.cvs cvsVar2 : cvsVarArr2) {
            arrayList2.add(cvsVar2.b());
        }
        defpackage.cuz[] cuzVarArr2 = (defpackage.cuz[]) arrayList2.toArray(new defpackage.cuz[0]);
        this.e = new defpackage.cva((defpackage.cuz[]) java.util.Arrays.copyOf(cuzVarArr2, cuzVarArr2.length), 1);
    }

    @Override // defpackage.cvs
    public final defpackage.cuz a() {
        return this.d;
    }

    @Override // defpackage.cvs
    public final defpackage.cuz b() {
        return this.e;
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
