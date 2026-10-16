package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class btu implements aizk {
    final /* synthetic */ defpackage.btw a;
    final /* synthetic */ aiuw b;

    public btu(defpackage.btw btwVar, aiuw aiuwVar) {
        this.a = btwVar;
        this.b = aiuwVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        float f;
        defpackage.ags agsVar;
        defpackage.asi asiVar = (defpackage.asi) obj;
        if (asiVar instanceof defpackage.asp) {
            defpackage.btw btwVar = this.a;
            if (btwVar.f) {
                btwVar.h((defpackage.asp) asiVar);
            } else {
                btwVar.k.p(asiVar);
            }
        }
        defpackage.btw btwVar2 = this.a;
        boolean z = asiVar instanceof defpackage.asf;
        boolean zJ = btwVar2.j();
        if (z) {
            btwVar2.h.add(asiVar);
        } else if (asiVar instanceof defpackage.asg) {
            btwVar2.h.remove(((defpackage.asg) asiVar).a);
        } else if (asiVar instanceof defpackage.asd) {
            btwVar2.h.add(asiVar);
            btwVar2.i(true);
        } else if (asiVar instanceof defpackage.ase) {
            java.util.List list = btwVar2.h;
            list.remove(((defpackage.ase) asiVar).a);
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    btwVar2.i(false);
                    break;
                }
                if (((defpackage.asi) list.get(i)) instanceof defpackage.asd) {
                    break;
                }
                i++;
            }
        } else if (asiVar instanceof defpackage.asb) {
            btwVar2.h.add(asiVar);
        } else {
            if (!(asiVar instanceof defpackage.asc)) {
                if (asiVar instanceof defpackage.asa) {
                    btwVar2.h.remove(((defpackage.asa) asiVar).a);
                }
                return defpackage.afbk.a;
            }
            btwVar2.h.remove(((defpackage.asc) asiVar).a);
        }
        defpackage.asi asiVar2 = (defpackage.asi) defpackage.afga.aF(btwVar2.h);
        java.lang.Object objInvoke = btwVar2.c.invoke();
        if (!defpackage.afga.f(btwVar2.i, asiVar2)) {
            if (asiVar2 != null) {
                boolean z2 = asiVar2 instanceof defpackage.asf;
                if (z2) {
                    f = ((bue) objInvoke).a.a;
                } else if (asiVar2 instanceof defpackage.asd) {
                    bua buaVar = ((bue) objInvoke).d;
                    if (buaVar instanceof bua) {
                        f = buaVar.a;
                    } else {
                        f = 0.0f;
                    }
                } else if (asiVar2 instanceof defpackage.asb) {
                    f = ((bue) objInvoke).b.a;
                } else {
                    f = 0.0f;
                }
                defpackage.ags agsVar2 = defpackage.btr.a;
                if (z2) {
                    agsVar = defpackage.btr.a;
                } else if ((asiVar2 instanceof defpackage.asd) || (asiVar2 instanceof defpackage.asb)) {
                    defpackage.ags agsVar3 = new defpackage.ags(45, defpackage.afc.d, 2);
                    agsVar = agsVar3;
                } else {
                    agsVar = defpackage.btr.a;
                }
                ahoc.d(this.b, (defpackage.afdo) null, 0, new bts(btwVar2, f, agsVar, (defpackage.afdk) null), 3);
            } else {
                defpackage.asi asiVar3 = btwVar2.i;
                boolean z3 = asiVar3 instanceof defpackage.asf;
                defpackage.ags agsVar4 = defpackage.btr.a;
                defpackage.ags agsVar5 = (z3 || (asiVar3 instanceof defpackage.asd) || !(asiVar3 instanceof defpackage.asb)) ? defpackage.btr.a : new defpackage.ags(150, defpackage.afc.d, 2);
                ahoc.d(this.b, (defpackage.afdo) null, 0, new defpackage.bnx(btwVar2, agsVar5, (defpackage.afdk) null, 14), 3);
            }
            bue bueVar = (bue) objInvoke;
            if (!(bueVar.d instanceof bty)) {
                ahoc.d(this.b, (defpackage.afdo) null, 0, new defpackage.btt(btwVar2, (defpackage.afdk) null, 0), 3);
            } else if (zJ != btwVar2.j()) {
                ahoc.d(this.b, (defpackage.afdo) null, 0, new fax(btwVar2, asiVar2 instanceof defpackage.asd, bueVar, (defpackage.afdk) null, 1), 3);
            }
            btwVar2.i = asiVar2;
        }
        return defpackage.afbk.a;
    }
}
