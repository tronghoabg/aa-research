package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* loaded from: classes3.dex */
public final class uqi implements tqj {
    public final qau b;
    private final ackk c;
    private final Random e;
    public final pzu a = pzu.a;
    private volatile tqk d = ucv.a;

    public uqi(qau qauVar, ackk ackkVar) {
        Random random = new Random();
        this.e = random;
        qauVar.getClass();
        this.b = qauVar;
        this.c = ackkVar;
        yob yobVar = qaa.a;
        ywb ywbVar = ywb.a;
        abnp abnpVarN = ywbVar.n();
        pzy pzyVarA = pzz.a();
        abwo abwoVar = abws.a;
        zbe zbeVar = zbe.a;
        abnp abnpVarN2 = zbeVar.n();
        abnpVarN2.t();
        zbe zbeVar2 = (zbe) abnpVarN2.b;
        zbeVar2.c = 1;
        zbeVar2.b |= 1;
        lxr.I((zbe) abnpVarN2.q(), abnpVarN);
        lxr.H(pzyVarA, abwoVar, abnpVarN);
        abnp abnpVarN3 = ywbVar.n();
        pzy pzyVarA2 = pzz.a();
        abnp abnpVarN4 = zbeVar.n();
        abnpVarN4.t();
        zbe zbeVar3 = (zbe) abnpVarN4.b;
        zbeVar3.c = 2;
        zbeVar3.b |= 1;
        lxr.I((zbe) abnpVarN4.q(), abnpVarN3);
        lxr.H(pzyVarA2, abwoVar, abnpVarN3);
        random.nextInt(1073741824);
        qar qarVar = (qar) qauVar.b.gu();
        new pzt(qag.a(qaf.c(qarVar.f, qarVar.a())), new pzs(1), xxh.h(5600), xvy.a);
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        new HashMap();
        new HashMap();
        new HashSet();
        zak.a.n();
    }

    public final /* synthetic */ uqh b(udx udxVar, abdl abdlVar, toc tocVar, boolean z) {
        abnh abnhVar = abdn.u;
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnhVar.d);
        if (((abdt) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b) {
            return null;
        }
        uat uatVar = (uat) udxVar;
        boolean z2 = uatVar.O;
        ackk ackkVar = this.c;
        if (ackkVar != null && ((uaj) ackkVar.a()).b()) {
            abdlVar = uqw.e(abdlVar);
        }
        return new uqh(uatVar.a, udxVar.Q(), abdlVar, z, z2, tocVar);
    }

    @Override // defpackage.tqj
    public final void a(tqk tqkVar) {
    }
}
