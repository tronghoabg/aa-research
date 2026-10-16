package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class xzr extends yel implements Serializable {
    private static final long serialVersionUID = 1;
    final xzv b;
    final xzv c;
    final xww d;
    final xww e;
    final long f;
    final long g;
    final long h;
    final int i;
    final xyi j;
    final xyr k;
    transient xyk l;
    final xyo m;
    final xyn n;

    public xzr(yan yanVar) {
        xzv xzvVar = yanVar.j;
        xzv xzvVar2 = yanVar.k;
        xww xwwVar = yanVar.h;
        xww xwwVar2 = yanVar.i;
        long j = yanVar.n;
        long j2 = yanVar.m;
        long j3 = yanVar.l;
        xyo xyoVar = yanVar.v;
        int i = yanVar.g;
        xyn xynVar = yanVar.w;
        xyi xyiVar = yanVar.p;
        xyr xyrVar = yanVar.r;
        this.b = xzvVar;
        this.c = xzvVar2;
        this.d = xwwVar;
        this.e = xwwVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.m = xyoVar;
        this.i = i;
        this.n = xynVar;
        this.j = (xyiVar == xyi.d || xyiVar == xyp.b) ? null : xyiVar;
        this.k = xyrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.l = c().a();
    }

    private Object readResolve() {
        return this.l;
    }

    final xyp c() {
        xyp xypVar = new xyp();
        xypVar.f(this.b);
        xzv xzvVar = xypVar.h;
        woy.ad(xzvVar == null, "Value strength was already set to %s", xzvVar);
        xzv xzvVar2 = this.c;
        xzvVar2.getClass();
        xypVar.h = xzvVar2;
        xww xwwVar = xypVar.k;
        woy.ad(xwwVar == null, "key equivalence was already set to %s", xwwVar);
        xww xwwVar2 = this.d;
        xwwVar2.getClass();
        xypVar.k = xwwVar2;
        xww xwwVar3 = xypVar.l;
        woy.ad(xwwVar3 == null, "value equivalence was already set to %s", xwwVar3);
        xww xwwVar4 = this.e;
        xwwVar4.getClass();
        xypVar.l = xwwVar4;
        int i = xypVar.d;
        woy.ab(i == -1, "concurrency level was already set to %s", i);
        int i2 = this.i;
        woy.N(i2 > 0);
        xypVar.d = i2;
        woy.Z(xypVar.p == null);
        xyn xynVar = this.n;
        xynVar.getClass();
        xypVar.p = xynVar;
        xypVar.c = false;
        long j = this.f;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = xypVar.i;
            woy.ac(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
            xypVar.i = j;
        }
        long j3 = this.g;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = xypVar.j;
            woy.ac(j4 == -1, "expireAfterAccess was already set to %s ns", j4);
            xypVar.j = j3;
        }
        xyo xyoVar = this.m;
        if (xyoVar != xyo.a) {
            woy.Z(xypVar.o == null);
            if (xypVar.c) {
                long j5 = xypVar.e;
                woy.ac(j5 == -1, "weigher can not be combined with maximum size (%s provided)", j5);
            }
            xyoVar.getClass();
            xypVar.o = xyoVar;
            long j6 = this.h;
            if (j6 != -1) {
                long j7 = xypVar.f;
                woy.ac(j7 == -1, "maximum weight was already set to %s", j7);
                long j8 = xypVar.e;
                woy.ac(j8 == -1, "maximum size was already set to %s", j8);
                xypVar.f = j6;
            }
        } else {
            long j9 = this.h;
            if (j9 != -1) {
                xypVar.e(j9);
            }
        }
        xyi xyiVar = this.j;
        if (xyiVar != null) {
            woy.Z(xypVar.m == null);
            xypVar.m = xyiVar;
        }
        return xypVar;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.l;
    }
}
