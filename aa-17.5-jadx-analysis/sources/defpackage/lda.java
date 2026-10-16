package defpackage;

import j$.time.Instant;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lda {
    public static final lcz a = new lcz();
    public static final yph b = yph.c("GH.CsatRunner");
    public static final afgl c = new lcj(woy.df(new mkh[]{mkh.b, mkh.a}), 4);
    public final lcy d;
    public final afgs e;

    public /* synthetic */ lda(byte[] bArr) {
        lcy lcyVar = (lcy) lcy.c.getValue(lcy.a, lcw.a[0]);
        afgr afgrVar = afgs.a;
        afgrVar.getClass();
        this.d = lcyVar;
        this.e = afgrVar;
    }

    public static final lda a() {
        return a.a();
    }

    public final void b(lbt lbtVar) {
        lbtVar.getClass();
        b.l().y("Survey %s: display resource not available", lbtVar.name());
        lnm.M(lbtVar, yzy.FJ);
    }

    public final void c(final lbt lbtVar, ldf ldfVar) {
        lbtVar.getClass();
        b.l().M("Survey %s: user response was %s", lbtVar.name(), ldfVar.a().sn);
        lnm.M(lbtVar, ldfVar.a());
        if ((ldfVar instanceof ldc) || (ldfVar instanceof ldb)) {
            lcy lcyVar = this.d;
            if (acpo.c()) {
                lcy.a(lcyVar.e.E(new dzh() { // from class: lcu
                    @Override // defpackage.dzh
                    public final Object a(Object obj) {
                        lbt lbtVar2;
                        abqw abqwVar = (abqw) obj;
                        abqwVar.getClass();
                        Instant instantNow = Instant.now();
                        instantNow.getClass();
                        abpt abptVarQ = abzi.q(instantNow);
                        abnp abnpVarK = abqwVar.K();
                        abnpVarK.getClass();
                        abzi.p(abptVarQ, abnpVarK);
                        Iterator<E> it = abzi.m(abnpVarK).iterator();
                        int i = 0;
                        while (true) {
                            lbtVar2 = lbtVar;
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            yzz yzzVarB = yzz.b(((abqx) it.next()).c);
                            if (yzzVarB == null) {
                                yzzVarB = yzz.UNKNOWN_CONTEXT;
                            }
                            if (yzzVarB == lbtVar2.c()) {
                                break;
                            }
                            i++;
                        }
                        if (i >= 0) {
                            abzi.m(abnpVarK);
                            abnp abnpVarK2 = ((abqx) abzi.m(abnpVarK).get(i)).K();
                            abnpVarK2.getClass();
                            abzi.l(abptVarQ, abnpVarK2);
                            abnpVarK.ah(i, abzi.j(abnpVarK2));
                        } else {
                            abzi.m(abnpVarK);
                            abnp abnpVarN = abqx.a.n();
                            abnpVarN.getClass();
                            abzi.k(lbtVar2.c(), abnpVarN);
                            abzi.l(abptVarQ, abnpVarN);
                            abnpVarK.ag(abzi.j(abnpVarN));
                        }
                        return abzi.n(abnpVarK);
                    }
                }));
            } else {
                lcy.a(lcyVar.d.a(new ikk(new kut(lbtVar, 13), 12), zfq.a));
            }
        }
    }

    public lda() {
        this(null);
    }
}
