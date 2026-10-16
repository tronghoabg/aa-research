package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class koo extends rla {
    public static final yph a = yph.c("GH.FailureInjection");
    public static final rky b = new koi();
    public Handler e;
    HandlerThread f;
    public Handler g;
    HandlerThread h;
    private final List j = new ArrayList();
    public final Set c = new HashSet();
    private final Map k = new EnumMap(pbd.class);
    private final Map l = new EnumMap(pbd.class);
    private final Map m = new HashMap();
    private final Map n = new HashMap();
    private final Map o = new HashMap();
    public final ycc d = new yey();

    public static synchronized zgp a(Context context, Executor executor) {
        return o(context, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[PHI: r0
  0x0074: PHI (r0v2 pat) = (r0v1 pat), (r0v18 pat) binds: [B:5:0x0033, B:17:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(defpackage.par r9, defpackage.rkz r10, j$.util.Optional r11, defpackage.rky r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koo.p(par, rkz, j$.util.Optional, rky):java.lang.Object");
    }

    private final void q(pba pbaVar) {
        kom komVarB = kom.b(pbaVar);
        if (l(pbaVar)) {
            if (((pbaVar.e == 8 ? (pax) pbaVar.f : pax.a).b & 1) != 0) {
                abnf abnfVar = (pbaVar.e == 8 ? (pax) pbaVar.f : pax.a).e;
                if (abnfVar == null) {
                    abnfVar = abnf.a;
                }
                this.e.postDelayed(new jda(this, komVarB, abnfVar, 10), komVarB, abqs.a(abnfVar));
            }
        }
    }

    @Override // defpackage.rla
    public final Object b(par parVar, rkz rkzVar) throws Throwable {
        return p(parVar, rkzVar, Optional.empty(), b);
    }

    @Override // defpackage.rla
    public final Object c(par parVar, rkz rkzVar, Handler handler, rky rkyVar) throws Throwable {
        return p(parVar, rkzVar, Optional.of(handler), rkyVar);
    }

    @Override // defpackage.rla
    public final synchronized void d(pba pbaVar) {
        int i = pbaVar.c;
        boolean z = false;
        int i2 = 2;
        if (i == 11) {
            pav pavVar = (pav) pbaVar.d;
            par parVarB = par.b(pavVar.d);
            if (parVarB == null) {
                parVarB = par.CALL_SITE_UNSET;
            }
            if (parVarB == par.CALL_SITE_UNSET) {
                throw new IllegalArgumentException("FailureInjection must have a call_site set.");
            }
            int i3 = pavVar.b;
            if (i3 == 2) {
                pat patVarB = pat.b(((Integer) pavVar.c).intValue());
                if (patVarB == null) {
                    patVarB = pat.NOT_INJECTED;
                }
                if (patVarB == pat.NOT_INJECTED) {
                    throw new IllegalArgumentException("Do not set FailureType.NOT_INJECTED.");
                }
                yfy yfyVar = paq.a;
                int i4 = yfq.d;
                if (!((List) yfyVar.getOrDefault(parVarB, yls.a)).contains(patVarB)) {
                    throw new IllegalArgumentException(String.format("CallSite %s can not be used with failure type %s", parVarB.name(), patVarB.name()));
                }
            } else if (i3 == 3 && ((pas) pavVar.c).b.size() == 0) {
                throw new IllegalArgumentException("Must specify at least one delay.");
            }
            pau pauVar = (pbaVar.c == 11 ? (pav) pbaVar.d : pav.a).e;
            if (pauVar == null) {
                pauVar = pau.a;
            }
            Iterator<E> it = pauVar.b.iterator();
            while (it.hasNext()) {
                if (abqs.f((abnf) it.next())) {
                    throw new IllegalArgumentException("Post-injection action delay shouldn't be negative.");
                }
            }
        } else if (i == 12) {
            pbd pbdVarB = pbd.b(((Integer) pbaVar.d).intValue());
            if (pbdVarB == null) {
                pbdVarB = pbd.STATIC_INJECTION_UNSET;
            }
            if (pbdVarB == pbd.STATIC_INJECTION_UNSET) {
                throw new IllegalArgumentException("Must not set StaticInjection.STATIC_INJECTION_UNSET.");
            }
            if (pbaVar.e == 9) {
                throw new IllegalArgumentException("CallActivationParameters cannot be used with StaticInjection.");
            }
        }
        int i5 = pbaVar.e;
        if (i5 != 0) {
            switch (i5) {
                case 8:
                    z = 9;
                    break;
                case 9:
                    z = 10;
                    break;
                case 10:
                    z = 11;
                    break;
            }
        } else {
            z = true;
        }
        if (!z) {
            throw null;
        }
        if (z) {
            throw new IllegalArgumentException("FailureInjection must have activation parameters set.");
        }
        if (((i5 == 8 ? (pax) pbaVar.f : pax.a).b & 1) != 0) {
            abnf abnfVar = (pbaVar.e == 8 ? (pax) pbaVar.f : pax.a).e;
            if (abnfVar == null) {
                abnfVar = abnf.a;
            }
            abqs.g(abnfVar);
            if (abqs.f(abnfVar) || abnfVar.equals(abqs.a)) {
                throw new IllegalArgumentException("The timeout must be a positive number, if set.");
            }
        }
        if ((pbaVar.b & 1) != 0 && pbaVar.g <= 0) {
            throw new IllegalArgumentException("The max activation count must be a positive number, if set.");
        }
        int i6 = pbaVar.e;
        if (i6 == 10) {
            if ((i6 == 10 ? (paz) pbaVar.f : paz.a).b.size() == 0) {
                throw new IllegalArgumentException("The intervals must have at least one element.");
            }
        }
        kom komVarB = kom.b(pbaVar);
        ((ype) ((ype) a.f()).ai((char) 3272)).y("Adding failure injection: %s", pbaVar);
        List list = this.j;
        if (Collection.EL.stream(list).anyMatch(new koh(komVarB, i2))) {
            throw new IllegalArgumentException("Injection already exists: ".concat(String.valueOf(String.valueOf(komVarB))));
        }
        list.add(pbaVar);
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("failure-injection-manager");
            this.f = handlerThread;
            handlerThread.start();
            this.e = new Handler(this.f.getLooper());
        }
        if (this.g == null) {
            HandlerThread handlerThread2 = new HandlerThread("failure-injection-manager-post-injection-action");
            this.h = handlerThread2;
            handlerThread2.start();
            this.g = new Handler(this.h.getLooper());
        }
        int i7 = pbaVar.e;
        if (i7 == 8) {
            if ((i7 == 8 ? (pax) pbaVar.f : pax.a).c.size() == 0) {
                q(pbaVar);
                return;
            }
        }
        if (pbaVar.e == 10) {
            j(pbaVar);
        }
    }

    @Override // defpackage.rla
    public final synchronized void e(pbd pbdVar, rkw rkwVar) {
        ((ype) ((ype) a.f()).ai((char) 3273)).y("Adding injection activated callback for injection: %s", pbdVar.name());
        ((List) Map.EL.computeIfAbsent(this.k, pbdVar, new koj(2))).add(rkwVar);
        if (this.c.contains(kom.c(pbdVar))) {
            rkwVar.a();
        }
    }

    @Override // defpackage.rla
    public final synchronized void f(pbd pbdVar, rkx rkxVar) {
        ((ype) ((ype) a.f()).ai((char) 3274)).y("Adding injection deactivated callback for injection: %s", pbdVar.name());
        ((List) Map.EL.computeIfAbsent(this.l, pbdVar, new koj(0))).add(rkxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(kom komVar, String str) {
        pbd pbdVarB;
        Set set = this.c;
        if (set.contains(komVar)) {
            ((ype) ((ype) a.f()).ai(3275)).M("Deactivating injection: %s, reason: %s", komVar, str);
            pba pbaVar = (pba) Collection.EL.stream(this.j).filter(new ghp(komVar, 20)).findFirst().get();
            int i = pbaVar.c;
            if (i == 12) {
                java.util.Map map = this.l;
                if (i != 12 || (pbdVarB = pbd.b(((Integer) pbaVar.d).intValue())) == null) {
                    pbdVarB = pbd.STATIC_INJECTION_UNSET;
                }
                Iterable$EL.forEach(yfq.o((java.util.Collection) Map.EL.getOrDefault(map, pbdVarB, new ArrayList())), new iwu(9));
            }
        }
        java.util.Map map2 = this.o;
        if (map2.containsKey(komVar)) {
            ((kol) map2.get(komVar)).a();
        }
        ycc yccVar = this.d;
        if (yccVar.containsKey(komVar)) {
            ((kon) yccVar.get(komVar)).d.set(false);
        }
        this.e.removeCallbacksAndMessages(komVar);
        set.remove(komVar);
    }

    @Override // defpackage.rla
    public final void h(par parVar) throws Throwable {
        b(parVar, new sgl(1));
    }

    @Override // defpackage.rla
    public final synchronized void i() {
        ((ype) ((ype) a.f()).ai((char) 3276)).u("Resetting failure injections");
        Set set = this.c;
        Iterable$EL.forEach(ygr.n(set), new kok(this, 0));
        woy.aa(set.isEmpty(), "activeInjections should be cleared by deactivateInjection");
        this.j.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.d.clear();
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f.quit();
            this.e = null;
            this.f = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(pba pbaVar) {
        java.util.Map map = this.m;
        kom komVarB = kom.b(pbaVar);
        int iIntValue = ((Integer) Map.EL.getOrDefault(map, komVarB, 0)).intValue();
        pay payVar = (pay) (pbaVar.e == 10 ? (paz) pbaVar.f : paz.a).b.get(iIntValue % (pbaVar.e == 10 ? (paz) pbaVar.f : paz.a).b.size());
        Handler handler = this.e;
        xx xxVar = new xx(this, pbaVar, komVarB, payVar, 13);
        abnf abnfVar = payVar.b;
        if (abnfVar == null) {
            abnfVar = abnf.a;
        }
        handler.postDelayed(xxVar, komVarB, abqs.a(abnfVar));
    }

    @Override // defpackage.rla
    public final synchronized void k(yxi yxiVar) {
        yxiVar.name();
        abnp abnpVarN = pbc.a.n();
        abnpVarN.t();
        pbc pbcVar = (pbc) abnpVarN.b;
        pbcVar.c = Integer.valueOf(yxiVar.pC);
        pbcVar.b = 2;
        pbc pbcVar2 = (pbc) abnpVarN.q();
        for (pba pbaVar : this.j) {
            if (pbaVar.e == 8) {
                Iterator<E> it = ((pax) pbaVar.f).c.iterator();
                while (it.hasNext()) {
                    if (((pbc) it.next()).equals(pbcVar2)) {
                        q(pbaVar);
                    }
                }
                for (pbc pbcVar3 : (pbaVar.e == 8 ? (pax) pbaVar.f : pax.a).d) {
                    if (pbcVar3.equals(pbcVar2)) {
                        g(kom.b(pbaVar), String.format(Locale.US, "exit stage %s", pbcVar3));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(defpackage.pba r12) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koo.l(pba):boolean");
    }
}
