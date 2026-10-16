package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class egu extends defpackage.afee implements defpackage.affc {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.ego e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egu(defpackage.ego egoVar, java.lang.Object obj, defpackage.afdk afdkVar) {
        super(1, afdkVar);
        this.e = egoVar;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Exception {
        ?? r1;
        java.lang.Throwable th;
        java.lang.Object obj2;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    defpackage.afga.cz(obj);
                    r1 = r1;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        defpackage.afga.n(r1, th);
                        throw th3;
                    }
                }
            } else {
                defpackage.afga.cz(obj);
                defpackage.ego egoVar = this.e;
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(egoVar.a);
                java.lang.Object obj3 = this.d;
                try {
                    defpackage.ehh ehhVar = egoVar.b;
                    defpackage.eht ehtVar = new defpackage.eht(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    if (ehhVar.c(obj3, ehtVar) == afdrVar) {
                        return afdrVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (java.lang.Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((java.io.FileOutputStream) obj2).getFD().sync();
            defpackage.afga.n(r1, null);
            return defpackage.afbk.a;
        } catch (java.lang.Exception e) {
            if (e instanceof java.io.FileNotFoundException) {
                throw dti.d(this.e.a.getParent(), e);
            }
            throw e;
        }
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return new defpackage.egu(this.e, this.d, (defpackage.afdk) obj).hf(defpackage.afbk.a);
    }
}
