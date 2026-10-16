package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ulh implements ulp {
    private final /* synthetic */ int a;
    private final Object b;

    public ulh(aasr aasrVar, acdj acdjVar, int i) {
        this.a = i;
        this.b = (true != aasrVar.m ? "!1b0" : "!1b1").concat(true != acdjVar.b ? "!2b0" : "!2b1");
    }

    @Override // defpackage.ulp
    public final boolean a(List list, ulq ulqVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, xyc] */
    @Override // defpackage.ulp
    public final void b(tzy tzyVar, abnr abnrVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                Object obj = this.b;
                if (obj == null) {
                    return;
                }
                abgm abgmVar = ((abgj) abnrVar.b).e;
                if (abgmVar == null) {
                    abgmVar = abgm.a;
                }
                abnp abnpVarK = abgmVar.K();
                abnr abnrVar2 = (abnr) abha.a.n();
                abnrVar2.t();
                abha abhaVar = (abha) abnrVar2.b;
                abhaVar.c = 26;
                abhaVar.b |= 1;
                abnp abnpVarN = abgz.a.n();
                abnpVarN.t();
                abgz abgzVar = (abgz) abnpVarN.b;
                abgzVar.b = 1 | abgzVar.b;
                abgzVar.c = "styles";
                abnpVarN.t();
                abgz abgzVar2 = (abgz) abnpVarN.b;
                abgzVar2.b |= 2;
                abgzVar2.d = (String) obj;
                abnrVar2.t();
                abha abhaVar2 = (abha) abnrVar2.b;
                abgz abgzVar3 = (abgz) abnpVarN.q();
                abgzVar3.getClass();
                abhaVar2.b();
                abhaVar2.d.add(abgzVar3);
                abnpVarK.t();
                abgm abgmVar2 = (abgm) abnpVarK.b;
                abha abhaVar3 = (abha) abnrVar2.q();
                abhaVar3.getClass();
                abgmVar2.b();
                abgmVar2.e.add(abhaVar3);
                abgm abgmVar3 = (abgm) abnpVarK.q();
                abnrVar.t();
                abgj abgjVar = (abgj) abnrVar.b;
                abgmVar3.getClass();
                abgjVar.e = abgmVar3;
                abgjVar.b |= 2;
                return;
            case 1:
                abnp abnpVarN2 = aazy.a.n();
                abnpVarN2.t();
                aazy aazyVar = (aazy) abnpVarN2.b;
                aazyVar.b |= 1;
                aazyVar.c = true;
                Boolean bool = ((ukr) this.b).g;
                abnpVarN2.t();
                aazy aazyVar2 = (aazy) abnpVarN2.b;
                aazyVar2.b |= 2;
                aazyVar2.d = false;
                aazy aazyVar3 = (aazy) abnpVarN2.q();
                abnr abnrVar3 = (abnr) abab.a.n();
                abnrVar3.bc(aazy.e, aazyVar3);
                abnrVar.bg((abab) abnrVar3.q());
                return;
            case 2:
                if (((Boolean) this.b.gu()).booleanValue()) {
                    abhb abhbVar = ((abgj) abnrVar.b).h;
                    if (abhbVar == null) {
                        abhbVar = abhb.a;
                    }
                    abnp abnpVarK2 = abhbVar.K();
                    abnpVarK2.t();
                    abhb abhbVar2 = (abhb) abnpVarK2.b;
                    abhbVar2.b |= 1073741824;
                    abhbVar2.c = true;
                    abnrVar.t();
                    abgj abgjVar2 = (abgj) abnrVar.b;
                    abhb abhbVar3 = (abhb) abnpVarK2.q();
                    abhbVar3.getClass();
                    abgjVar2.h = abhbVar3;
                    abgjVar2.b |= 32;
                    return;
                }
                return;
            case 3:
                abgj abgjVar3 = ((ukr) this.b).l;
                return;
            case 4:
                acjg acjgVar = ((ukr) this.b).j;
                return;
            case 5:
                ygr ygrVar = ((ukr) this.b).q;
                if (ygrVar.isEmpty()) {
                    return;
                }
                abnp abnpVarN3 = aaid.a.n();
                yno it = ygrVar.iterator();
                while (it.hasNext()) {
                    toc tocVar = (toc) it.next();
                    abnp abnpVarN4 = zkk.a.n();
                    long j = tocVar.b;
                    abnpVarN4.t();
                    zkk zkkVar = (zkk) abnpVarN4.b;
                    zkkVar.b |= 1;
                    zkkVar.c = j;
                    long j2 = tocVar.c;
                    abnpVarN4.t();
                    zkk zkkVar2 = (zkk) abnpVarN4.b;
                    zkkVar2.b |= 2;
                    zkkVar2.d = j2;
                    zkk zkkVar3 = (zkk) abnpVarN4.q();
                    abnpVarN3.t();
                    aaid aaidVar = (aaid) abnpVarN3.b;
                    zkkVar3.getClass();
                    aboh abohVar = aaidVar.b;
                    if (!abohVar.c()) {
                        aaidVar.b = abnv.I(abohVar);
                    }
                    aaidVar.b.add(zkkVar3);
                }
                abnr abnrVar4 = (abnr) abab.a.n();
                abnrVar4.bc(aaid.c, (aaid) abnpVarN3.q());
                abnrVar.bg((abab) abnrVar4.q());
                return;
            case 6:
                break;
            default:
                ablq ablqVar = ((ukr) this.b).p;
                return;
        }
        while (true) {
            if (i < ((abgj) abnrVar.b).d.size()) {
                int iJ = aclh.j(abnrVar.be(i).c);
                if (iJ == 0 || iJ != 3 || !abnrVar.be(i).d.equals("svv")) {
                    i++;
                }
            } else {
                i = -1;
            }
        }
        if (i == -1) {
            return;
        }
        abgd abgdVarBe = abnrVar.be(i);
        Iterator<E> it2 = abgdVarBe.f.iterator();
        while (it2.hasNext()) {
            if (((abgc) it2.next()).c.equals("svl")) {
                return;
            }
        }
        abnr abnrVar5 = (abnr) abgdVarBe.K();
        abnp abnpVarN5 = abgc.a.n();
        abnpVarN5.t();
        abgc abgcVar = (abgc) abnpVarN5.b;
        abgcVar.b = 1 | abgcVar.b;
        abgcVar.c = "svl";
        Object obj2 = this.b;
        abnpVarN5.t();
        abgc abgcVar2 = (abgc) abnpVarN5.b;
        abgcVar2.b |= 2;
        abgcVar2.d = (String) obj2;
        abnrVar5.bk(abnpVarN5);
        abnrVar.bh(i, (abgd) abnrVar5.q());
    }

    public ulh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public ulh(ukr ukrVar, int i) {
        this.a = i;
        this.b = ukrVar.m;
    }
}
