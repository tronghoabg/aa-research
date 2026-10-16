package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bdr implements aizk {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public bdr(defpackage.afgt afgtVar, defpackage.afgt afgtVar2, defpackage.afgt afgtVar3, defpackage.ajs ajsVar, int i) {
        this.e = i;
        this.b = afgtVar;
        this.d = afgtVar2;
        this.c = afgtVar3;
        this.a = ajsVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Type inference failed for: r5v6, types: [cwu, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.afgt afgtVar;
        int i;
        if (this.e == 0) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                defpackage.beg begVar = (defpackage.beg) this.a;
                if (begVar.q()) {
                    java.lang.Object obj4 = this.b;
                    defpackage.blw blwVar = (defpackage.blw) this.c;
                    defpackage.asq.am((defpackage.fbl) obj4, begVar, blwVar.f(), (defpackage.djl) this.d, blwVar.b);
                } else {
                    defpackage.asq.ai((defpackage.beg) this.a);
                }
            } else {
                defpackage.asq.ai((defpackage.beg) this.a);
            }
            return defpackage.afbk.a;
        }
        defpackage.asi asiVar = (defpackage.asi) obj;
        boolean z = true;
        if (asiVar instanceof defpackage.asn) {
            ((defpackage.afgt) this.b).a++;
        } else {
            if ((asiVar instanceof defpackage.aso) || (asiVar instanceof defpackage.asm)) {
                obj2 = this.b;
            } else {
                if (asiVar instanceof defpackage.asf) {
                    obj3 = this.d;
                } else if (asiVar instanceof defpackage.asg) {
                    obj2 = this.d;
                } else if (asiVar instanceof defpackage.asd) {
                    obj3 = this.c;
                } else if (asiVar instanceof defpackage.ase) {
                    obj2 = this.c;
                }
                afgtVar = (defpackage.afgt) obj3;
                i = afgtVar.a + 1;
                afgtVar.a = i;
            }
            afgtVar = (defpackage.afgt) obj2;
            i = afgtVar.a - 1;
            afgtVar.a = i;
        }
        boolean z2 = false;
        boolean z3 = ((defpackage.afgt) this.b).a > 0;
        boolean z4 = ((defpackage.afgt) this.d).a > 0;
        boolean z5 = ((defpackage.afgt) this.c).a > 0;
        ?? r5 = this.a;
        defpackage.ajs ajsVar = (defpackage.ajs) r5;
        if (ajsVar.b != z3) {
            ajsVar.b = z3;
            z2 = true;
        }
        if (ajsVar.c != z4) {
            ajsVar.c = z4;
        } else {
            z = z2;
        }
        if (ajsVar.d == z5) {
            if (z) {
            }
            return defpackage.afbk.a;
        }
        ajsVar.d = z5;
        defpackage.dai.G(r5);
        return defpackage.afbk.a;
    }

    public bdr(defpackage.beg begVar, defpackage.fbl fblVar, defpackage.blw blwVar, defpackage.djl djlVar, int i) {
        this.e = i;
        this.a = begVar;
        this.b = fblVar;
        this.c = blwVar;
        this.d = djlVar;
    }
}
