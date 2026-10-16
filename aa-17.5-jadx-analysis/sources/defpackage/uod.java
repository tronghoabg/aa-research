package defpackage;

import android.content.res.Resources;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class uod {
    private static final yob o = yob.c("com/google/android/libraries/geo/mapcore/internal/store/TileStoreFactory");
    private final aasr A;
    private final acdj B;
    private final tsn C;
    private final ulf D;
    private final ykd E;
    public final Map a;
    public final pkx b;
    public final aezk c;
    public final tmb d;
    public final zgt e;
    public final zgt f;
    public final xyc g;
    public final pnh h;
    public final List i;
    public final HashSet j;
    public final uaj k;
    public final gjv l;
    public final gjv m;
    public final erb n;
    private final Map p;
    private final AtomicInteger q;
    private final Map r;
    private final tpa s;
    private final uoi t;
    private final Resources u;
    private final ackk v;
    private final ackk w;
    private final ackk x;
    private final Runnable y;
    private final xyc z;

    public uod(Resources resources, tpa tpaVar, uoi uoiVar, Map map, ackk ackkVar, pkx pkxVar, erb erbVar, aezk aezkVar, tsn tsnVar, Runnable runnable, gjv gjvVar, tmb tmbVar, zgt zgtVar, zgt zgtVar2, xyc xycVar, xyc xycVar2, ackk ackkVar2, ackk ackkVar3, ykd ykdVar, aasr aasrVar, acdj acdjVar, pnh pnhVar, uaj uajVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(abgl.values().length);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(abgl.values().length);
        this.q = new AtomicInteger(0);
        this.D = new ulf(4);
        this.i = new ArrayList();
        this.j = new HashSet();
        this.u = resources;
        this.s = tpaVar;
        this.m = new gjv((tpd) tpaVar);
        this.t = uoiVar;
        this.v = ackkVar;
        this.b = pkxVar;
        this.n = erbVar;
        this.c = aezkVar;
        this.C = tsnVar;
        this.y = runnable;
        this.l = gjvVar;
        this.d = tmbVar;
        this.e = zgtVar;
        this.f = zgtVar2;
        this.w = ackkVar2;
        this.x = ackkVar3;
        this.E = ykdVar;
        this.A = aasrVar;
        this.B = acdjVar;
        this.z = xycVar;
        this.g = xycVar2;
        this.a = concurrentHashMap;
        this.p = concurrentHashMap2;
        this.h = pnhVar;
        this.r = map;
        this.k = uajVar;
    }

    public static int e(xyc xycVar, pnh pnhVar) {
        acdv acdvVar = pnhVar.a;
        return acdvVar.O ? acdvVar.N : wub.as((((Integer) xycVar.gu()).intValue() >> 3) * 16, 32, 128);
    }

    private final ulo f(abgl abglVar, ukr ukrVar, yfq yfqVar, zgt zgtVar) {
        tpa tpaVar = this.s;
        abgk abgkVarC = tpaVar.c(abglVar);
        uxc uxcVar = (abgkVarC.b & 4) != 0 ? new uxc(abgkVarC.e) : null;
        if (uxcVar == null) {
            uxcVar = new uxc(8);
        }
        pyh pyhVar = (pyh) this.w.a();
        pwr pwrVar = (pwr) this.v.a();
        aezk aezkVar = this.c;
        return new ulo(pyhVar, zgtVar, pwrVar, new qsb(uxcVar, new rjr(aezkVar, this.C, ukrVar), yfqVar, this.x), uzw.a, this.n, aezkVar, tpaVar);
    }

    private static uoo g(tox toxVar, pkx pkxVar, xyc xycVar, pnh pnhVar) {
        return new uot(pkxVar, toxVar, 1, e(xycVar, pnhVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v22 unb, still in use, count: 2, list:
          (r1v22 unb) from 0x02ab: MOVE (r26v2 unb) = (r1v22 unb) (LINE:684)
          (r1v22 unb) from 0x02a0: MOVE (r26v4 unb) = (r1v22 unb) (LINE:673)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final defpackage.uor a(defpackage.tox r24, defpackage.ukr r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uod.a(tox, ukr, boolean):uor");
    }

    public final synchronized Object b(tox toxVar) {
        Map map = this.p;
        Object obj = map.get(toxVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = new Object();
        map.put(toxVar, obj2);
        return obj2;
    }

    public final void c(tox toxVar, uor uorVar) {
        this.b.c(uorVar, vky.d(null, toxVar.c));
        this.a.put(toxVar, uorVar);
    }

    public final synchronized void d(int i) {
        this.q.set(i);
        for (tox toxVar : this.p.keySet()) {
            abgl abglVar = toxVar.c;
            if (abglVar == null || this.s.v(abglVar)) {
                synchronized (b(toxVar)) {
                    uor uorVar = (uor) this.a.get(toxVar);
                    if (uorVar instanceof unb) {
                        ((unb) uorVar).g = i;
                    }
                }
            }
        }
    }
}
