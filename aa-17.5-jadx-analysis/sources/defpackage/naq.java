package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class naq extends erm {
    public static final aezr d = woy.dG(new mto(15));
    private final eqm a;
    private final eqj b;
    private final sf c;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    public final eqj j;

    public naq() {
        eqj eqjVarA = lgx.b().a(mpz.d);
        eqjVarA.getClass();
        this.e = tby.B(eqjVarA, new nag(4));
        eqm eqmVar = new eqm(null);
        this.a = eqmVar;
        this.f = tby.r(eqmVar, (Duration) d.a());
        Duration durationOfMillis = Duration.ofMillis(8000L);
        durationOfMillis.getClass();
        eqj eqjVarR = tby.r(eqmVar, durationOfMillis);
        this.b = eqjVarR;
        int i = 1;
        eqj eqjVarAX = spu.aX(new nar(this, i));
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(eqjVarAX, new med(new mzx(eqlVar, affqVar, 3), 14));
        this.g = eqlVar;
        eqm eqmVar2 = ((kzc) kfl.h().k()).f;
        eqmVar2.getClass();
        this.i = tby.a(eqmVar2, tby.v(lau.c().i(), new tbm(3, i)));
        eqj eqjVarA2 = kfl.h().a();
        eqjVarA2.getClass();
        eqj eqjVarF = kfl.h().f();
        eqjVarF.getClass();
        eqj eqjVarA3 = tby.a(tby.a(eqjVarA2, tby.x(eqjVarF)), tby.x(eqjVarR));
        eql eqlVar2 = new eql();
        affq affqVar2 = new affq();
        affqVar2.a = true;
        eqlVar2.r(eqjVarA3, new med(new mzx(eqlVar2, affqVar2, 4), 14));
        this.j = eqlVar2;
        this.c = new sf((byte[]) null);
    }

    public final void b(List list) {
        List listJ = afrg.j(afrg.q(afrg.l(afrg.q(woy.cm(list), new nag(6)), muo.h), new nag(7)));
        if (listJ.isEmpty()) {
            return;
        }
        sf sfVar = this.c;
        if (affa.f(listJ, sfVar.a)) {
            return;
        }
        sfVar.a = listJ;
        kwv kwvVarH = kfl.h();
        abnp abnpVarN = osa.a.n();
        abnpVarN.getClass();
        osq.y(2, abnpVarN);
        abnpVarN.t();
        osa osaVar = (osa) abnpVarN.b;
        osaVar.e = 4;
        osaVar.b = 4 | osaVar.b;
        osq.z(abnpVarN);
        osq.x(listJ, abnpVarN);
        kwvVarH.w(osq.w(abnpVarN));
    }

    public final void c(lpt lptVar, eqa eqaVar) {
        eqaVar.getClass();
        mwc.a(yzy.gD, lptVar.a());
        lpv.a();
        lpv.b(lptVar.d(), eqaVar);
    }

    public final void e(Context context, List list) {
        context.getClass();
        abnp abnpVarN = tah.a.n();
        abnpVarN.getClass();
        DesugarCollections.unmodifiableList(((tah) abnpVarN.b).b).getClass();
        ArrayList<CharSequence> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequenceF = ((lpt) it.next()).f(context);
            if (charSequenceF != null) {
                arrayList.add(charSequenceF);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        for (CharSequence charSequence : arrayList) {
            abnp abnpVarN2 = orz.a.n();
            abnpVarN2.getClass();
            abnp abnpVarN3 = osj.a.n();
            abnpVarN3.getClass();
            abnp abnpVarN4 = osk.a.n();
            abnpVarN4.getClass();
            DesugarCollections.unmodifiableList(((osk) abnpVarN4.b).b).getClass();
            String string = charSequence.toString();
            string.getClass();
            abnpVarN4.t();
            osk oskVar = (osk) abnpVarN4.b;
            aboh abohVar = oskVar.b;
            if (!abohVar.c()) {
                oskVar.b = abnv.I(abohVar);
            }
            oskVar.b.add(string);
            abnv abnvVarQ = abnpVarN4.q();
            abnvVarQ.getClass();
            abnpVarN3.t();
            osj osjVar = (osj) abnpVarN3.b;
            osjVar.f = (osk) abnvVarQ;
            osjVar.b |= 8;
            abnv abnvVarQ2 = abnpVarN3.q();
            abnvVarQ2.getClass();
            abnpVarN2.t();
            orz orzVar = (orz) abnpVarN2.b;
            orzVar.e = (osj) abnvVarQ2;
            orzVar.b |= 4;
            abnv abnvVarQ3 = abnpVarN2.q();
            abnvVarQ3.getClass();
            arrayList2.add((orz) abnvVarQ3);
        }
        tss.t(arrayList2, abnpVarN);
        tah tahVarS = tss.s(abnpVarN);
        kwv kwvVarH = kfl.h();
        Bundle bundle = new Bundle();
        bundle.putByteArray("DISPLAYED_MEDIA_RECS_ON_SIDECARD", tahVarS.h());
        kwvVarH.G(9, bundle);
        mwc.a(yzy.l, null);
    }

    public final void f() {
        this.a.m(new gjv((xyi) oit.a().b));
    }
}
