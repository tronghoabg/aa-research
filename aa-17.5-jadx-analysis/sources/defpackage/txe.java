package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class txe {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/LabelsImpl");
    public final typ b;
    public final txc c;
    public final Map d;
    public ucm e;
    public final tvw f;
    public final twx g;
    public final twz h;
    public volatile ueu i;
    public ujk j;
    public final roa k = new roa();
    public final qsb l;
    public final qsb m;
    public final gjv n;
    public final ykd o;
    private final Set p;
    private final AtomicBoolean q;

    public txe(typ typVar, ykd ykdVar, Map map, tvw tvwVar, gjv gjvVar) {
        twz twzVar = new twz(this);
        this.h = twzVar;
        new AtomicLong(0L);
        this.i = ueu.a;
        this.j = ujk.a;
        this.q = new AtomicBoolean(false);
        this.b = typVar;
        this.n = gjvVar;
        txc txcVar = new txc();
        this.c = txcVar;
        this.l = new qsb((byte[]) null);
        this.m = new qsb((byte[]) null, (byte[]) null);
        this.p = new HashSet();
        this.o = ykdVar;
        this.d = map;
        this.f = tvwVar;
        twx twxVar = new twx();
        this.g = twxVar;
        typVar.d(twxVar);
        txcVar.f(twzVar.g);
    }

    public static boolean h(abcs abcsVar, ykd ykdVar, int i) {
        if (abcsVar == null) {
            return false;
        }
        if (((tyb) ykdVar.a).j().c) {
            return true;
        }
        yob yobVar = typ.a;
        if (i == 2) {
            return false;
        }
        abnh abnhVar = abcz.c;
        abcsVar.j(abnhVar);
        if (abcsVar.w.m(abnhVar.d)) {
            return false;
        }
        if ((abcsVar.b & 1) != 0) {
            abco abcoVar = abcsVar.c;
            if (abcoVar == null) {
                abcoVar = abco.a;
            }
            if (j(abcoVar)) {
                return false;
            }
        }
        if ((2 & abcsVar.b) != 0) {
            abco abcoVar2 = abcsVar.d;
            if (abcoVar2 == null) {
                abcoVar2 = abco.a;
            }
            if (j(abcoVar2)) {
                return false;
            }
        }
        return true;
    }

    private static tyu i(tpv tpvVar) {
        woy.Z(tpvVar instanceof tyu);
        return (tyu) tpvVar;
    }

    private static boolean j(abco abcoVar) {
        abnh abnhVar = abcz.d;
        abcoVar.j(abnhVar);
        if (abcoVar.w.m(abnhVar.d)) {
            return true;
        }
        for (abcn abcnVar : abcoVar.c) {
            abnh abnhVar2 = abcz.e;
            abcnVar.j(abnhVar2);
            if (abcnVar.w.m(abnhVar2.d)) {
                return true;
            }
        }
        return false;
    }

    public final twi a(abcs abcsVar) {
        return this.k.d(abcsVar);
    }

    public final void b(xxj xxjVar) {
        boolean zB;
        txc txcVar = this.c;
        synchronized (txcVar) {
            zB = txcVar.b.b(xxjVar);
        }
        if (zB) {
            txcVar.g();
        }
    }

    public final void c(tpv tpvVar) {
        tyu tyuVarI = i(tpvVar);
        d(tyuVarI);
        tyuVarI.v();
        this.k.f((abcs) tpvVar.j());
        if (tyuVarI instanceof twi) {
            this.m.i((twi) tyuVarI);
        }
        if (tyuVarI instanceof tvu) {
            synchronized (this.c) {
                throw null;
            }
        }
    }

    public final void d(tpv tpvVar) {
        boolean zRemove;
        tyu tyuVarI = i(tpvVar);
        synchronized (this) {
            zRemove = this.p.remove(tyuVarI);
        }
        if (zRemove) {
            tyuVarI.w();
        }
    }

    public final void e(tsm tsmVar) {
        if (this.q.get() && tsmVar.ordinal() == 0) {
            ((ynz) ((ynz) tsm.c.a(uys.a).q(ypd.SMALL)).ai((char) 9135)).u("Unported legacy label creation; crashing app.");
        }
    }

    public final void f(xxj xxjVar) {
        boolean zC;
        txc txcVar = this.c;
        synchronized (txcVar) {
            zC = txcVar.b.c(xxjVar);
        }
        if (zC) {
            txcVar.g();
        }
    }

    public final void g(tpv tpvVar) {
        boolean zAdd;
        tyu tyuVarI = i(tpvVar);
        synchronized (this) {
            zAdd = this.p.add(tyuVarI);
        }
        if (zAdd) {
            tyuVarI.x();
        }
    }
}
