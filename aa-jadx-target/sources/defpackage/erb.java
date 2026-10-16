package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class erb extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.affg d;
    final /* synthetic */ ajey e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erb(ajey ajeyVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.e = ajeyVar;
        this.d = affgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.erb(this.e, this.d, afdkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [affg] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        ajey ajeyVar;
        defpackage.affg affgVar;
        java.lang.Object obj2;
        ?? r1;
        java.lang.Throwable th;
        java.lang.Object obj3;
        java.lang.Object obj4;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.c;
        try {
            if (i == 0) {
                defpackage.afga.cz(obj);
                ajeyVar = this.e;
                affgVar = this.d;
                this.a = ajeyVar;
                this.b = affgVar;
                this.c = 1;
                if (ajeyVar.b(this) != afdrVar) {
                }
                r1 = affgVar;
                obj2 = ajeyVar;
                return afdrVar;
            }
            if (i != 1) {
                obj3 = this.a;
                try {
                    defpackage.afga.cz(obj);
                    obj4 = obj3;
                    ((ajey) obj4).d();
                    return defpackage.afbk.a;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((ajey) obj3).d();
                    throw th;
                }
            }
            java.lang.Object obj5 = this.b;
            java.lang.Object obj6 = this.a;
            defpackage.afga.cz(obj);
            obj2 = obj6;
            r1 = obj5;
            r1 = affgVar;
            obj2 = ajeyVar;
            defpackage.eps epsVar = new defpackage.eps((defpackage.affg) r1, (defpackage.afdk) null, 2, (byte[]) null);
            this.a = obj2;
            this.b = null;
            this.c = 2;
            if (ahoi.a(epsVar, this) != afdrVar) {
                obj4 = obj2;
                ((ajey) obj4).d();
                return defpackage.afbk.a;
            }
            r1 = affgVar;
            obj2 = ajeyVar;
            return afdrVar;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj7 = obj2;
            th = th3;
            obj3 = obj7;
            ((ajey) obj3).d();
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.erb) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
