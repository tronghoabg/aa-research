package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pio extends psk {
    private final int f;

    public pio(int i, Class cls, qsb qsbVar, psb psbVar, Executor executor) {
        super(cls, qsbVar, psbVar, executor);
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [ackk, java.lang.Object] */
    @Override // defpackage.psk
    protected final void a(psm psmVar) {
        ufs ufsVarA;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                qsb qsbVar = (qsb) this.c;
                Object obj = qsbVar.a;
                mla mlaVar = new mla(qsbVar, 17);
                Optional optional = (Optional) obj;
                optional.isPresent();
                ((qsb) mlaVar.a).e(optional.get());
                return;
            }
            if (i == 2) {
                ((tnq) ((qsb) this.c).c.a()).e();
                return;
            }
            if (i != 3) {
                qsb qsbVar2 = (qsb) this.c;
                Optional optional2 = (Optional) qsbVar2.b;
                optional2.isPresent();
                optional2.get();
                if (((Boolean) Optional.ofNullable(false).orElse(false)).booleanValue()) {
                    ((Optional) qsbVar2.d).isPresent();
                    return;
                } else {
                    throw null;
                }
            }
            qsb qsbVar3 = (qsb) this.c;
            Object obj2 = qsbVar3.b;
            mla mlaVar2 = new mla((pnc) psmVar, 16);
            Optional optional3 = (Optional) obj2;
            optional3.isPresent();
            pna pnaVar = ((pnc) mlaVar2.a).a;
            Object obj3 = optional3.get();
            pnaVar.getClass();
            ((uak) obj3).a((abgi) new oya(pnaVar, 7).a());
            ((tnq) qsbVar3.c.a()).g();
            return;
        }
        qsb qsbVar4 = (qsb) this.c;
        Optional optional4 = (Optional) qsbVar4.b;
        optional4.isPresent();
        optional4.get();
        if (((Boolean) Optional.ofNullable(false).orElse(false)).booleanValue()) {
            return;
        }
        tnn tnnVarC = ((tnq) qsbVar4.c.a()).c();
        GmmAccount.SignedOut signedOut = pmp.a;
        txu txuVar = (txu) tnnVarC;
        if (Objects.equals(txuVar.q, signedOut)) {
            return;
        }
        txuVar.q = signedOut;
        if (txuVar.B()) {
            return;
        }
        nzj nzjVar = txuVar.ag;
        yno it = ((yfy) nzjVar.b).keySet().iterator();
        while (it.hasNext()) {
            abgl abglVar = (abgl) it.next();
            if (abglVar == abgl.GMM_BASEMAP_PHOTOS) {
                txuVar.L.get();
            }
            if (nzjVar.f(abglVar)) {
                if (txuVar.q == null) {
                    txuVar.q = signedOut;
                }
                Map map = txuVar.z;
                synchronized (map) {
                    GmmAccount gmmAccount = ((txu) tnnVarC).q;
                    tox toxVarT = ((txu) tnnVarC).G(abglVar) ? ((txu) tnnVarC).an.t(abglVar, ((txu) tnnVarC).q.c) : null;
                    if (nzjVar.e(abglVar)) {
                        toxVarT = ((txu) tnnVarC).an.t(abglVar, "");
                    }
                    if ((map.containsKey(abglVar) || toxVarT != null) && (!map.containsKey(abglVar) || !Objects.equals(((ufs) map.get(abglVar)).c, toxVarT))) {
                        if (toxVarT != null) {
                            ukr ukrVarA = ((txu) tnnVarC).a();
                            synchronized (((txu) tnnVarC).B) {
                                ufsVarA = ((txu) tnnVarC).j.a(toxVarT, ukrVarA, ((txu) tnnVarC).C.a, false);
                            }
                        } else {
                            ufsVarA = null;
                        }
                        if (ufsVarA != null) {
                            if (map.containsKey(abglVar)) {
                                ((txn) ((txu) tnnVarC).J).o((ufj) map.get(abglVar), ufsVarA);
                            } else {
                                ((txu) tnnVarC).J.e(ufsVarA);
                            }
                            map.put(abglVar, ufsVarA);
                        } else if (map.containsKey(abglVar)) {
                            ((txu) tnnVarC).J.f((ufj) map.get(abglVar));
                            map.remove(abglVar);
                        }
                    }
                }
            }
        }
    }
}
