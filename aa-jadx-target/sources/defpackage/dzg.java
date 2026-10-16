package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dzg {
    public dzg() {
    }

    public static boolean a() {
        int i = dzh.a;
        return android.os.Build.VERSION.SDK_INT <= dwx.a;
    }

    public static defpackage.eqb b(defpackage.epy epyVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.eqb eqbVar;
        aiwq aiwqVar;
        epyVar.getClass();
        do {
            atomicReference = (java.util.concurrent.atomic.AtomicReference) epyVar.a.a;
            defpackage.eqb eqbVar2 = (defpackage.eqb) atomicReference.get();
            if (eqbVar2 != null) {
                return eqbVar2;
            }
            aixg aixgVar = new aixg((aiwg) null);
            aiut aiutVar = aivl.a;
            aiwqVar = ajdt.a;
            eqbVar = new defpackage.eqb(epyVar, defpackage.afga.v(aixgVar, aiwqVar.i()));
        } while (!defpackage.a.o(atomicReference, eqbVar));
        ahoc.d(eqbVar, aiwqVar.i(), 0, new defpackage.dxw(eqbVar, (defpackage.afdk) null, 4), 2);
        return eqbVar;
    }

    public static defpackage.eqp c(aizj aizjVar, defpackage.afdo afdoVar, long j) {
        aizjVar.getClass();
        defpackage.eqp eqpVarB = defpackage.duu.b(afdoVar, j, new defpackage.eps(aizjVar, (defpackage.afdk) null, 0));
        if (aizjVar instanceof ajay) {
            if (defpackage.pn.bn().bo()) {
                eqpVarB.m(((ajay) aizjVar).b());
                return eqpVarB;
            }
            eqpVarB.j(((ajay) aizjVar).b());
        }
        return eqpVarB;
    }

    public static aizj d(defpackage.eqp eqpVar) {
        eqpVar.getClass();
        return aigs.b(new aizc(new defpackage.dnf(eqpVar, (defpackage.afdk) null, 4)), -1);
    }

    public static /* synthetic */ defpackage.eqp e(aizj aizjVar, j$.time.Duration duration) {
        defpackage.afdp afdpVar = defpackage.afdp.a;
        aizjVar.getClass();
        duration.getClass();
        return c(aizjVar, afdpVar, duration.toMillis());
    }

    public dzg(byte[] bArr) {
    }
}
