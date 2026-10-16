package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dct implements defpackage.eqe {
    final /* synthetic */ aiuw a;
    final /* synthetic */ defpackage.bxf b;
    final /* synthetic */ defpackage.bxt c;
    final /* synthetic */ defpackage.afgv d;

    public dct(aiuw aiuwVar, defpackage.bxf bxfVar, defpackage.bxt bxtVar, defpackage.afgv afgvVar) {
        this.a = aiuwVar;
        this.b = bxfVar;
        this.c = bxtVar;
        this.d = afgvVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        aiuf aiufVarA = null;
        switch (epwVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                ahoc.d(this.a, (defpackage.afdo) null, 4, new defpackage.dcs(this.d, this.c, eqgVar, this, null), 1);
                return;
            case 1:
                defpackage.bxf bxfVar = this.b;
                if (bxfVar != null) {
                    bxfVar.c();
                }
                defpackage.bxt bxtVar = this.c;
                synchronized (bxtVar.c) {
                    if (bxtVar.i) {
                        bxtVar.i = false;
                        aiufVarA = bxtVar.A();
                    }
                    break;
                }
                if (aiufVarA != null) {
                    aiufVarA.w(defpackage.afbk.a);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.c.D();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.c.B();
                return;
            default:
                throw new defpackage.afas();
        }
    }
}
