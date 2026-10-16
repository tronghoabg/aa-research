package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqd {
    public static final defpackage.apw a = new defpackage.aqa();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(defpackage.aqp aqpVar, long j, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aqb aqbVar;
        afgs afgsVar;
        defpackage.aqp aqpVar2;
        if (afdkVar instanceof defpackage.aqb) {
            aqbVar = (defpackage.aqb) afdkVar;
            int i = aqbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqbVar.b = i - Integer.MIN_VALUE;
            } else {
                aqbVar = new defpackage.aqb(afdkVar);
            }
        } else {
            aqbVar = new defpackage.aqb(afdkVar);
        }
        java.lang.Object obj = aqbVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aqbVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            afgsVar = new afgs();
            defpackage.akv akvVar = defpackage.akv.a;
            defpackage.aqc aqcVar = new defpackage.aqc(aqpVar, j, afgsVar, null);
            aqbVar.c = aqpVar;
            aqbVar.d = afgsVar;
            aqbVar.b = 1;
            if (aqpVar.i(akvVar, aqcVar, aqbVar) == afdrVar) {
                return afdrVar;
            }
            aqpVar2 = aqpVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgs afgsVar2 = aqbVar.d;
            defpackage.aqp aqpVar3 = aqbVar.c;
            defpackage.afga.cz(obj);
            afgsVar = afgsVar2;
            aqpVar2 = aqpVar3;
        }
        return new defpackage.cji(aqpVar2.f(afgsVar.a));
    }
}
