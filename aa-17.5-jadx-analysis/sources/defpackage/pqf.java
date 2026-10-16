package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pqf implements vae {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public pqf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.accounts.Account, java.lang.Object] */
    @Override // defpackage.vae
    public final void a(uzy uzyVar) {
        ?? A;
        int i = this.b;
        int i2 = 1;
        if (i == 0) {
            if (((Boolean) uzyVar.c()).booleanValue()) {
                pqg pqgVar = (pqg) this.a;
                pqe pqeVar = pqgVar.b;
                AtomicBoolean atomicBoolean = pqeVar.t;
                if (atomicBoolean.get()) {
                    return;
                }
                pqgVar.e.p(pyk.at);
                ((ynz) ((ynz) pqg.a.d()).ai((char) 6831)).u("Starting ClientParametersUpdater");
                pqt pqtVar = pqgVar.g;
                pqtVar.getClass();
                ykd ykdVar = new ykd(pqtVar);
                ackk ackkVar = pqgVar.d;
                GmmAccount.SignedOut signedOut = pmp.a;
                Locale localeI = kex.i();
                long j = pqtVar.k;
                synchronized (pqeVar.m) {
                    if (atomicBoolean.getAndSet(true)) {
                        ((ynz) pqe.a.a(uys.a).ai(6828)).u("ClientParametersUpdater start() already called.");
                        return;
                    }
                    ((ynz) ((ynz) pqe.a.f()).ai(6826)).M("start()  account=%s  locale=%s", signedOut, localeI);
                    pqeVar.x = ykdVar;
                    pqeVar.p = signedOut;
                    pqeVar.q = localeI;
                    pqeVar.r = j;
                    pqeVar.s = pqeVar.n.d();
                    pqeVar.d(pqeVar.v == 2 ? 0L : pqeVar.a(j, pqeVar.j), pxy.INITIAL_REFRESH, null, null, null);
                    pqeVar.v = 3;
                    Iterator it = pqeVar.u.iterator();
                    while (it.hasNext()) {
                        ((pqd) it.next()).b();
                    }
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            pqe pqeVar2 = ((ppz) this.a).a;
            Object obj = pqeVar2.m;
            Locale localeI2 = kex.i();
            synchronized (obj) {
                if (pqeVar2.q.getLanguage().equals(localeI2.getLanguage()) && pqeVar2.q.getCountry().equals(localeI2.getCountry())) {
                    ((ynz) ((ynz) pqe.a.d()).ai(6809)).u("Ignoring locale update that did not change the locale language/country");
                    return;
                }
                ((ynz) ((ynz) pqe.a.d()).ai(6808)).y("Updating locale to %s", localeI2);
                pqeVar2.q = localeI2;
                pqeVar2.d(0L, pxy.LOCALE_CHANGE, null, null, null);
                return;
            }
        }
        String strC = null;
        if (i == 2) {
            yfq yfqVar = (yfq) uzyVar.c();
            if (yfqVar != null) {
                Object obj2 = this.a;
                HashMap map = new HashMap();
                woy.Z(map.isEmpty());
                for (pte pteVar : yrm.U(yfqVar)) {
                    if (pteVar != null && (A = pteVar.a()) != 0) {
                        map.put(A, pteVar);
                        strC = A;
                    }
                }
                synchronized (obj2) {
                    ((pvu) obj2).d = map;
                    if (strC != null && !((pvu) obj2).c.f()) {
                        ((ynz) ((ynz) pvu.a.f()).ai(6911)).y("AuthRequirement.auth: setting current account to %s", strC);
                        ((pvu) obj2).c = xxh.h(strC);
                    }
                    if (((pvu) obj2).c.f()) {
                        ((pvu) obj2).f((pte) ((pvu) obj2).d.get(((pvu) obj2).c.b()));
                    }
                }
                return;
            }
            return;
        }
        if (i != 3) {
            tqh tqhVar = (tqh) uzyVar.c();
            if (tqhVar != null) {
                Map map2 = ((aaco) this.a).g;
                if (map2.isEmpty()) {
                    return;
                }
                yfq yfqVarF = yeb.b(tqhVar.b, tqhVar.c, tqhVar.d, tqhVar.e).e(new txa(i2)).c(new aacn()).f();
                int size = yfqVarF.size();
                for (int i3 = 0; i3 < size; i3++) {
                    abdl abdlVar = (abdl) yfqVarF.get(i3);
                    double dNextInt = ThreadLocalRandom.current().nextInt(100);
                    double dA = adeh.a.gu().a();
                    abnh abnhVar = abdn.v;
                    abdlVar.j(abnhVar);
                    abnl abnlVar = abdlVar.w;
                    abnu abnuVar = abnhVar.d;
                    Object objJ = abnlVar.j(abnuVar);
                    if (map2.containsKey(((abdp) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).c)) {
                        abdlVar.j(abnhVar);
                        Object objJ2 = abdlVar.w.j(abnuVar);
                        uxl uxlVar = (uxl) map2.remove(((abdp) (objJ2 == null ? abnhVar.b : abnhVar.c(objJ2))).c);
                        if (dNextInt < dA) {
                            uxlVar.a(0);
                        }
                    }
                }
                return;
            }
            return;
        }
        Object obj3 = this.a;
        try {
            strC = ((txu) obj3).ab.c();
        } catch (IllegalStateException unused) {
            xxh xxhVar = (xxh) uzyVar.c();
            if (xxhVar != null) {
                strC = (String) xxhVar.e();
            }
        }
        if (strC == null) {
            return;
        }
        txu txuVar = (txu) obj3;
        ygr ygrVarA = ((tre) txuVar.O.a()).a();
        synchronized (txuVar.G) {
            ufs ufsVar = ((txu) obj3).H;
            if (ufsVar != null) {
                ufsVar.B(strC, ygrVarA);
            }
        }
        Map map3 = txuVar.y;
        synchronized (map3) {
            Iterator it2 = map3.values().iterator();
            while (it2.hasNext()) {
                ((ufs) it2.next()).B(strC, ygrVarA);
            }
        }
        Map map4 = txuVar.z;
        synchronized (map4) {
            Iterator it3 = map4.values().iterator();
            while (it3.hasNext()) {
                ((ufs) it3.next()).B(strC, ygrVarA);
            }
        }
        Map map5 = txuVar.x;
        synchronized (map5) {
            for (ufj ufjVar : map5.values()) {
                if (ufjVar instanceof ufs) {
                    ((ufs) ufjVar).B(strC, ygrVarA);
                }
            }
        }
        ufs ufsVar2 = txuVar.A;
        if (ufsVar2 != null) {
            ufsVar2.B(strC, ygrVarA);
        }
        ufs ufsVar3 = txuVar.F;
        if (ufsVar3 != null) {
            ufsVar3.B(strC, ygrVarA);
        }
    }

    public /* synthetic */ pqf(ppz ppzVar, int i) {
        this.b = i;
        this.a = ppzVar;
    }
}
