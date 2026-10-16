package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dra {
    public final dqo a;
    public final dqo d;
    public dqx f;
    final ArrayList g;
    private final dqw h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public dra(dqo dqoVar) {
        new ArrayList();
        this.f = null;
        this.h = new dqw();
        this.g = new ArrayList();
        this.a = dqoVar;
        this.d = dqoVar;
    }

    private final void e(drj drjVar, int i, ArrayList arrayList) {
        drb drbVar = drjVar.h;
        for (dqz dqzVar : drbVar.j) {
            if (dqzVar instanceof drb) {
                g((drb) dqzVar, i, drjVar.i, arrayList, null);
            } else if (dqzVar instanceof drj) {
                g(((drj) dqzVar).h, i, drjVar.i, arrayList, null);
            }
        }
        for (dqz dqzVar2 : drjVar.i.j) {
            if (dqzVar2 instanceof drb) {
                g((drb) dqzVar2, i, drbVar, arrayList, null);
            } else if (dqzVar2 instanceof drj) {
                g(((drj) dqzVar2).i, i, drbVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (dqz dqzVar3 : ((drh) drjVar).a.j) {
                if (dqzVar3 instanceof drb) {
                    g((drb) dqzVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(dqn dqnVar, int i, int i2, int i3, int i4) {
        dqw dqwVar = this.h;
        dqwVar.i = i;
        dqwVar.j = i3;
        dqwVar.a = i2;
        dqwVar.b = i4;
        this.f.b(dqnVar, dqwVar);
        dqnVar.M(dqwVar.c);
        dqnVar.B(dqwVar.d);
        dqnVar.P = dqwVar.f;
        dqnVar.x(dqwVar.e);
    }

    private final void g(drb drbVar, int i, drb drbVar2, ArrayList arrayList, sn snVar) {
        drj drjVar = drbVar.d;
        if (drjVar.l == null) {
            dqo dqoVar = this.a;
            if (drjVar == dqoVar.o || drjVar == dqoVar.p) {
                return;
            }
            if (snVar == null) {
                snVar = new sn(drjVar);
                arrayList.add(snVar);
            }
            sn snVar2 = snVar;
            drjVar.l = snVar2;
            ((ArrayList) snVar2.a).add(drjVar);
            drb drbVar3 = drjVar.h;
            for (dqz dqzVar : drbVar3.j) {
                if (dqzVar instanceof drb) {
                    g((drb) dqzVar, i, drbVar2, arrayList, snVar2);
                }
            }
            drb drbVar4 = drjVar.i;
            for (dqz dqzVar2 : drbVar4.j) {
                if (dqzVar2 instanceof drb) {
                    g((drb) dqzVar2, i, drbVar2, arrayList, snVar2);
                }
            }
            if (i == 1 && (drjVar instanceof drh)) {
                for (dqz dqzVar3 : ((drh) drjVar).a.j) {
                    if (dqzVar3 instanceof drb) {
                        g((drb) dqzVar3, 1, drbVar2, arrayList, snVar2);
                    }
                }
            }
            Iterator it = drbVar3.k.iterator();
            while (it.hasNext()) {
                g((drb) it.next(), i, drbVar2, arrayList, snVar2);
            }
            Iterator it2 = drbVar4.k.iterator();
            while (it2.hasNext()) {
                g((drb) it2.next(), i, drbVar2, arrayList, snVar2);
            }
            if (i == 1 && (drjVar instanceof drh)) {
                Iterator it3 = ((drh) drjVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((drb) it3.next(), 1, drbVar2, arrayList, snVar2);
                }
            }
        }
    }

    public final int a(dqo dqoVar, int i) {
        ArrayList arrayList;
        long jA;
        dqo dqoVar2 = dqoVar;
        ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            sn snVar = (sn) arrayList2.get(i2);
            Object obj = snVar.b;
            if (!(obj instanceof dqy) ? !(i != 0 ? (obj instanceof drh) : (obj instanceof drg)) : ((dqy) obj).f != i) {
                drb drbVar = i == 0 ? dqoVar2.o.h : dqoVar2.p.h;
                drb drbVar2 = i == 0 ? dqoVar2.o.i : dqoVar2.p.i;
                boolean zContains = ((drj) obj).h.k.contains(drbVar);
                boolean zContains2 = ((drj) snVar.b).i.k.contains(drbVar2);
                long jA2 = ((drj) snVar.b).a();
                if (zContains && zContains2) {
                    long jB = snVar.b(((drj) snVar.b).h, j);
                    long jA3 = snVar.a(((drj) snVar.b).i, j);
                    long j2 = jB - jA2;
                    drj drjVar = (drj) snVar.b;
                    arrayList = arrayList2;
                    long j3 = drjVar.i.e;
                    if (j2 >= (-r5)) {
                        j2 += j3;
                    }
                    long j4 = (-jA3) - jA2;
                    long j5 = drjVar.h.e;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    dqn dqnVar = drjVar.d;
                    float f = i == 0 ? dqnVar.ao : dqnVar.ap;
                    float f2 = 1.0f - f;
                    float f3 = f > BitmapDescriptorFactory.HUE_RED ? (long) ((j6 / f) + (j2 / f2)) : 0L;
                    jA = (j5 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    if (zContains) {
                        jA = Math.max(snVar.b(((drj) snVar.b).h, r0.e), ((drj) snVar.b).h.e + jA2);
                    } else if (zContains2) {
                        jA = Math.max(-snVar.a(((drj) snVar.b).i, r0.e), (-((drj) snVar.b).i.e) + jA2);
                    } else {
                        jA = (r0.h.e + ((drj) snVar.b).a()) - ((drj) snVar.b).i.e;
                    }
                }
            } else {
                jA = j;
                arrayList = arrayList2;
            }
            jMax = Math.max(jMax, jA);
            i2++;
            dqoVar2 = dqoVar;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        dqo dqoVar = this.d;
        dqoVar.o.d();
        dqoVar.p.d();
        arrayList.add(dqoVar.o);
        arrayList.add(dqoVar.p);
        ArrayList arrayList2 = dqoVar.aL;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            dqn dqnVar = (dqn) arrayList2.get(i);
            if (dqnVar instanceof dqr) {
                arrayList.add(new dre(dqnVar));
            } else {
                if (dqnVar.R()) {
                    if (dqnVar.m == null) {
                        dqnVar.m = new dqy(dqnVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dqnVar.m);
                } else {
                    arrayList.add(dqnVar.o);
                }
                if (dqnVar.S()) {
                    if (dqnVar.n == null) {
                        dqnVar.n = new dqy(dqnVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dqnVar.n);
                } else {
                    arrayList.add(dqnVar.p);
                }
                if (dqnVar instanceof dqs) {
                    arrayList.add(new drf(dqnVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((drj) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            drj drjVar = (drj) arrayList.get(i3);
            if (drjVar.d != dqoVar) {
                drjVar.b();
            }
        }
        ArrayList arrayList3 = this.g;
        arrayList3.clear();
        sn.c = 0;
        dqo dqoVar2 = this.a;
        e(dqoVar2.o, 0, arrayList3);
        e(dqoVar2.p, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        dra draVar;
        drc drcVar;
        ArrayList arrayList = this.a.aL;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            dqn dqnVar = (dqn) arrayList.get(i2);
            if (dqnVar.l) {
                draVar = this;
            } else {
                int[] iArr = dqnVar.aA;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = dqnVar.C;
                int i6 = dqnVar.D;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                drc drcVar2 = dqnVar.o.e;
                boolean z3 = drcVar2.i;
                drc drcVar3 = dqnVar.p.e;
                boolean z4 = drcVar3.i;
                if (z3 && z4) {
                    draVar = this;
                    draVar.f(dqnVar, 1, drcVar2.f, 1, drcVar3.f);
                    dqnVar.l = true;
                } else {
                    if (z3 && z2) {
                        this.f(dqnVar, 1, drcVar2.f, 2, drcVar3.f);
                        if (i4 == 3) {
                            dqnVar.p.e.m = dqnVar.h();
                        } else {
                            dqnVar.p.e.c(dqnVar.h());
                            dqnVar.l = true;
                        }
                    } else if (z4 && z) {
                        draVar = this;
                        draVar.f(dqnVar, 2, drcVar2.f, 1, drcVar3.f);
                        if (i == 3) {
                            dqnVar.o.e.m = dqnVar.j();
                        } else {
                            dqnVar.o.e.c(dqnVar.j());
                            dqnVar.l = true;
                        }
                    }
                    draVar = this;
                }
                if (dqnVar.l && (drcVar = dqnVar.p.b) != null) {
                    drcVar.c(dqnVar.al);
                }
            }
            i2++;
            this = draVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dqo r21) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dra.d(dqo):void");
    }
}
