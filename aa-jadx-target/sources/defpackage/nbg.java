package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class nbg extends defpackage.ers {
    public static final defpackage.afar d = defpackage.afga.cA(new defpackage.mus(14));
    private final defpackage.eqs a;
    private final defpackage.eqp b;
    private final sk c;
    public final defpackage.eqp e;
    public final defpackage.eqp f;
    public final defpackage.eqp g;
    public final defpackage.eqp i;
    public final defpackage.eqp j;

    public nbg() {
        defpackage.eqp eqpVarA = defpackage.lhe.b().a(defpackage.mqg.MEDIA);
        eqpVarA.getClass();
        this.e = defpackage.tcu.B(eqpVarA, new defpackage.nao(8));
        defpackage.eqs eqsVar = new defpackage.eqs(null);
        this.a = eqsVar;
        this.f = defpackage.tcu.r(eqsVar, (j$.time.Duration) d.a());
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(8000L);
        durationOfMillis.getClass();
        defpackage.eqp eqpVarR = defpackage.tcu.r(eqsVar, durationOfMillis);
        this.b = eqpVarR;
        defpackage.eqp eqpVarAN = defpackage.sqs.aN(new defpackage.mzv(this, 16));
        defpackage.eqr eqrVar = new defpackage.eqr();
        defpackage.afgq afgqVar = new defpackage.afgq();
        afgqVar.a = true;
        eqrVar.r(eqpVarAN, new defpackage.mel(new defpackage.nam(eqrVar, afgqVar, 3), 14));
        this.g = eqrVar;
        defpackage.eqs eqsVar2 = ((defpackage.kzh) defpackage.ebo.n().k()).f;
        eqsVar2.getClass();
        this.i = defpackage.tcu.a(eqsVar2, defpackage.tcu.v(defpackage.kpu.c().i(), new defpackage.opb(3, 15)));
        defpackage.eqp eqpVarA2 = defpackage.ebo.n().a();
        eqpVarA2.getClass();
        defpackage.eqp eqpVarF = defpackage.ebo.n().f();
        eqpVarF.getClass();
        defpackage.eqp eqpVarA3 = defpackage.tcu.a(defpackage.tcu.a(eqpVarA2, defpackage.tcu.x(eqpVarF)), defpackage.tcu.x(eqpVarR));
        defpackage.eqr eqrVar2 = new defpackage.eqr();
        defpackage.afgq afgqVar2 = new defpackage.afgq();
        afgqVar2.a = true;
        eqrVar2.r(eqpVarA3, new defpackage.mel(new defpackage.nam(eqrVar2, afgqVar2, 4), 14));
        this.j = eqrVar2;
        this.c = new sk((byte[]) null);
    }

    public final void b(java.util.List list) {
        java.util.List listJ = afsg.j(afsg.q(afsg.l(afsg.q(defpackage.afga.bg(list), new defpackage.nao(10)), defpackage.muy.h), new defpackage.nao(11)));
        if (listJ.isEmpty()) {
            return;
        }
        sk skVar = this.c;
        if (defpackage.afga.f(listJ, skVar.a)) {
            return;
        }
        skVar.a = listJ;
        defpackage.kxc kxcVarN = defpackage.ebo.n();
        defpackage.abor aborVarN = osx.a.n();
        aborVarN.getClass();
        defpackage.otn.A(2, aborVarN);
        aborVarN.t();
        osx osxVar = aborVarN.b;
        osxVar.e = 4;
        osxVar.b = 4 | osxVar.b;
        defpackage.otn.B(aborVarN);
        defpackage.otn.z(listJ, aborVarN);
        kxcVarN.w(defpackage.otn.y(aborVarN));
    }

    public final void c(lqa lqaVar, defpackage.eqg eqgVar) {
        eqgVar.getClass();
        defpackage.mwr.a(defpackage.zbd.gD, lqaVar.a());
        lqc.a();
        lqc.b(lqaVar.d(), eqgVar);
    }

    public final void e(android.content.Context context, java.util.List list) {
        context.getClass();
        defpackage.abor aborVarN = tbf.a.n();
        aborVarN.getClass();
        defpackage.tan.e(aborVarN);
        java.util.ArrayList<java.lang.CharSequence> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.CharSequence charSequenceF = ((lqa) it.next()).f(context);
            if (charSequenceF != null) {
                arrayList.add(charSequenceF);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(arrayList, 10));
        for (java.lang.CharSequence charSequence : arrayList) {
            defpackage.abor aborVarN2 = osw.a.n();
            aborVarN2.getClass();
            defpackage.abor aborVarN3 = otg.a.n();
            aborVarN3.getClass();
            defpackage.abor aborVarN4 = oth.a.n();
            aborVarN4.getClass();
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVarN4.b.b);
            listUnmodifiableList.getClass();
            new abrl(listUnmodifiableList);
            java.lang.String string = charSequence.toString();
            string.getClass();
            aborVarN4.t();
            oth othVar = aborVarN4.b;
            defpackage.abpj abpjVar = othVar.b;
            if (!abpjVar.c()) {
                othVar.b = defpackage.abox.I(abpjVar);
            }
            othVar.b.add(string);
            oth othVarQ = aborVarN4.q();
            othVarQ.getClass();
            aborVarN3.t();
            otg otgVar = aborVarN3.b;
            otgVar.f = othVarQ;
            otgVar.b |= 8;
            otg otgVarQ = aborVarN3.q();
            otgVarQ.getClass();
            aborVarN2.t();
            osw oswVar = aborVarN2.b;
            oswVar.e = otgVarQ;
            oswVar.b |= 4;
            osw oswVarQ = aborVarN2.q();
            oswVarQ.getClass();
            arrayList2.add(oswVarQ);
        }
        defpackage.tan.d(arrayList2, aborVarN);
        tbf tbfVarC = defpackage.tan.c(aborVarN);
        defpackage.kxc kxcVarN = defpackage.ebo.n();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("DISPLAYED_MEDIA_RECS_ON_SIDECARD", tbfVarC.h());
        kxcVarN.G(9, bundle);
        defpackage.mwr.a(defpackage.zbd.l, null);
    }

    public final void f() {
        this.a.m(new defpackage.gkc((defpackage.xzo) defpackage.ojm.a().b));
    }
}
