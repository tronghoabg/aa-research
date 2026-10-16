package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class esj implements defpackage.erw {
    private final defpackage.fbl[] a;

    public esj(defpackage.fbl... fblVarArr) {
        fblVarArr.getClass();
        this.a = fblVarArr;
    }

    @Override // defpackage.erw
    public final /* synthetic */ defpackage.ers a(java.lang.Class cls) {
        throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [affc, java.lang.Object] */
    @Override // defpackage.erw
    public final defpackage.ers b(java.lang.Class cls, defpackage.esi esiVar) {
        defpackage.fbl fblVar;
        defpackage.afie orCreateKotlinClass = defpackage.afgw.a.getOrCreateKotlinClass(cls);
        defpackage.fbl[] fblVarArr = this.a;
        defpackage.fbl[] fblVarArr2 = (defpackage.fbl[]) java.util.Arrays.copyOf(fblVarArr, fblVarArr.length);
        orCreateKotlinClass.getClass();
        fblVarArr2.getClass();
        int i = 0;
        while (true) {
            if (i >= fblVarArr2.length) {
                fblVar = null;
                break;
            }
            fblVar = fblVarArr2[i];
            if (defpackage.afga.f(fblVar.a, orCreateKotlinClass)) {
                break;
            }
            i++;
        }
        defpackage.ers ersVar = fblVar != null ? (defpackage.ers) fblVar.b.invoke(esiVar) : null;
        if (ersVar != null) {
            return ersVar;
        }
        throw new java.lang.IllegalArgumentException("No initializer set for given class ".concat(java.lang.String.valueOf(orCreateKotlinClass.getQualifiedName())));
    }

    @Override // defpackage.erw
    public final /* synthetic */ defpackage.ers c(defpackage.afie afieVar, defpackage.esi esiVar) {
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        jClass.getClass();
        return b(jClass, esiVar);
    }
}
