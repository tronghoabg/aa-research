package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ehg {
    public final aium a;
    public java.util.List b;
    final /* synthetic */ defpackage.egk c;
    private final ajey d;
    private final defpackage.afdo e;

    public ehg(defpackage.egk egkVar, java.util.List list, defpackage.afdo afdoVar) {
        afdoVar.getClass();
        this.c = egkVar;
        this.d = new ajey();
        this.a = new aium();
        this.e = afdoVar;
        this.b = defpackage.afga.aZ(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.ehf ehfVar;
        ajey ajeyVar;
        ajey ajeyVar2;
        if (afdkVar instanceof defpackage.ehf) {
            ehfVar = (defpackage.ehf) afdkVar;
            int i = ehfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehfVar.c = i - Integer.MIN_VALUE;
            } else {
                ehfVar = new defpackage.ehf(this, afdkVar);
            }
        } else {
            ehfVar = new defpackage.ehf(this, afdkVar);
        }
        java.lang.Object obj = ehfVar.a;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i2 = ehfVar.c;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                if (this.a.x()) {
                    return defpackage.afbk.a;
                }
                ajeyVar = this.d;
                ehfVar.d = ajeyVar;
                ehfVar.c = 1;
                if (ajeyVar.b(ehfVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ajeyVar2 = ehfVar.d;
                try {
                    defpackage.afga.cz(obj);
                    this.a.O(defpackage.afbk.a);
                    ajeyVar2.d();
                    return defpackage.afbk.a;
                } catch (java.lang.Throwable th) {
                    th = th;
                    ajeyVar2.d();
                    throw th;
                }
            }
            ajey ajeyVar3 = ehfVar.d;
            defpackage.afga.cz(obj);
            ajeyVar = ajeyVar3;
            if (this.a.x()) {
                defpackage.afbk afbkVar = defpackage.afbk.a;
                ajeyVar.d();
                return afbkVar;
            }
            ehfVar.d = ajeyVar;
            ehfVar.c = 2;
            if (b(ehfVar) != obj2) {
                ajeyVar2 = ajeyVar;
                this.a.O(defpackage.afbk.a);
                ajeyVar2.d();
                return defpackage.afbk.a;
            }
            return obj2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            ajeyVar2 = ajeyVar;
            ajeyVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    protected final java.lang.Object b(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.efi efiVar;
        if (afdkVar instanceof defpackage.efi) {
            efiVar = (defpackage.efi) afdkVar;
            int i = efiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                efiVar.b = i - Integer.MIN_VALUE;
            } else {
                efiVar = new defpackage.efi(this, afdkVar);
            }
        } else {
            efiVar = new defpackage.efi(this, afdkVar);
        }
        java.lang.Object obj = efiVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = efiVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.afga.cz(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj);
            }
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        efiVar.b = 1;
        obj = null;
        defpackage.afdo afdoVar = this.e;
        defpackage.bqo bqoVar = new defpackage.bqo(this.c, (defpackage.fdm) obj, this, (defpackage.afdk) null, 2);
        efiVar.b = 2;
        if (ahoc.a(afdoVar, bqoVar, efiVar) == afdrVar) {
            return afdrVar;
        }
        return defpackage.afbk.a;
    }
}
