package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfo {
    public int a;
    public java.lang.Long b;
    public boolean c;
    public defpackage.cok d;
    public defpackage.cok e;

    public final void a() {
        this.c = true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [cok] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final void b(defpackage.dkd dkdVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        this.c = false;
        defpackage.cok cokVar = this.d;
        if (defpackage.afga.f(dkdVar, cokVar != null ? cokVar.a : null)) {
            return;
        }
        java.lang.String strA = dkdVar.a();
        defpackage.cok cokVar2 = this.d;
        boolean zF = defpackage.afga.f(strA, (cokVar2 == null || (obj2 = cokVar2.a) == null) ? null : ((defpackage.dkd) obj2).a());
        defpackage.cok cokVar3 = this.d;
        if (zF) {
            if (cokVar3 != null) {
                cokVar3.a = dkdVar;
                return;
            }
            return;
        }
        this.d = new defpackage.cok(cokVar3, dkdVar);
        this.e = null;
        int length = this.a + dkdVar.a().length();
        this.a = length;
        if (length > 100000) {
            ?? r3 = this.d;
            if ((r3 != 0 ? r3.b : null) != null) {
                while (true) {
                    if (r3 == 0) {
                        obj = null;
                    } else {
                        java.lang.Object obj3 = ((defpackage.cok) r3).b;
                        if (obj3 != null) {
                            obj = ((defpackage.cok) obj3).b;
                        } else {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        break;
                    } else {
                        r3 = ((defpackage.cok) r3).b;
                    }
                }
                if (r3 != 0) {
                    ((defpackage.cok) r3).b = null;
                }
            }
        }
    }
}
