package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ubv {
    public final abje a;
    public final ueu b;
    public final abcs c;
    public final udx d;
    public List e;
    public final List f;
    public abfc g;
    public final boolean h;
    public boolean i;
    public uds j;
    private final AtomicInteger k;
    private List l;
    private final AtomicBoolean m;
    private ube n;
    private final List o;
    private final Map p;
    private long q;
    private int r;
    private boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ubv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ubv(defpackage.abje r29, defpackage.ucr r30, defpackage.ueu r31, java.util.List r32, java.util.List r33, int r34, java.util.List r35, java.util.List r36, defpackage.uds r37) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubv.<init>(abje, ucr, ueu, java.util.List, java.util.List, int, java.util.List, java.util.List, uds):void");
    }

    private final synchronized void k() {
        uwk uwkVar;
        woy.aa(this.r == 0, this);
        this.s = true;
        this.i = false;
        for (ubu ubuVar : this.l) {
            if (ubuVar != null && (uwkVar = ubuVar.a) != null) {
                uwkVar.c();
            }
        }
        l();
    }

    private final synchronized void l() {
        uwk uwkVar;
        List<ubu> list = this.e;
        if (list != null) {
            for (ubu ubuVar : list) {
                if (ubuVar != null && (uwkVar = ubuVar.a) != null) {
                    uwkVar.c();
                }
            }
            this.e = null;
        }
    }

    private final boolean m(List list, long j, ubu ubuVar) {
        if (list.isEmpty()) {
            return false;
        }
        uwk uwkVar = ubuVar.a;
        int iA = uwkVar != null ? uwkVar.a() : 1;
        boolean z = false;
        for (int i = 0; i < list.size() && i < iA; i++) {
            abby abbyVar = (abby) list.get(i);
            int i2 = abbyVar.c;
            if (i2 != 0) {
                long j2 = j - this.q;
                ube ubeVar = this.n;
                float fFloor = j2 / i2;
                ube ubeVar2 = ube.d;
                if (ubeVar == ubeVar2) {
                    double d = fFloor;
                    fFloor = (float) (d - Math.floor(d));
                }
                if ((abbyVar.b & 256) != 0) {
                    abam abamVar = abbyVar.k;
                    if (abamVar == null) {
                        abamVar = abam.a;
                    }
                    ubuVar.e[i] = gms.y(abamVar).o(fFloor);
                } else {
                    ubuVar.e[i] = 1.0f;
                }
                if ((abbyVar.b & 8) != 0) {
                    abam abamVar2 = abbyVar.f;
                    if (abamVar2 == null) {
                        abamVar2 = abam.a;
                    }
                    ubuVar.f[i] = gms.y(abamVar2).o(fFloor);
                } else {
                    ubuVar.f[i] = 0.0f;
                }
                if ((abbyVar.b & 16) != 0) {
                    abam abamVar3 = abbyVar.g;
                    if (abamVar3 == null) {
                        abamVar3 = abam.a;
                    }
                    ubuVar.g[i] = gms.y(abamVar3).o(fFloor);
                } else {
                    ubuVar.g[i] = 0.0f;
                }
                float[] fArr = ubuVar.h;
                int i3 = abbyVar.b;
                fArr[i] = (i3 & 2) != 0 ? abbyVar.d : 0.5f;
                ubuVar.i[i] = (i3 & 4) != 0 ? abbyVar.e : 0.5f;
                if ((i3 & 128) != 0) {
                    abam abamVar4 = abbyVar.j;
                    if (abamVar4 == null) {
                        abamVar4 = abam.a;
                    }
                    ubuVar.j[i] = gms.y(abamVar4).o(fFloor);
                } else {
                    ubuVar.j[i] = 0.0f;
                }
                if ((abbyVar.b & 32) != 0) {
                    abam abamVar5 = abbyVar.h;
                    if (abamVar5 == null) {
                        abamVar5 = abam.a;
                    }
                    ubuVar.k[i] = gms.y(abamVar5).o(fFloor);
                } else {
                    ubuVar.k[i] = 1.0f;
                }
                if ((abbyVar.b & 64) != 0) {
                    abam abamVar6 = abbyVar.i;
                    if (abamVar6 == null) {
                        abamVar6 = abam.a;
                    }
                    ubuVar.l[i] = gms.y(abamVar6).o(fFloor);
                } else {
                    ubuVar.l[i] = 1.0f;
                }
                z |= this.n != ubeVar2 && j - this.q < ((long) abbyVar.c);
            }
        }
        return z;
    }

    private final boolean n(abex abexVar, long j, ubu ubuVar) {
        if (abexVar != null && (abexVar.b & 2) != 0) {
            abam abamVar = abexVar.d;
            if (abamVar == null) {
                abamVar = abam.a;
            }
            ubuVar.d = gms.y(abamVar).o((j - this.q) / abexVar.c);
            if (this.n != ube.d && j - this.q < abexVar.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean o(List list, boolean z, long j) {
        abod abodVar;
        abex abexVar;
        aboh abohVar;
        abfc abfcVar = this.g;
        int i = 0;
        if (abfcVar == null) {
            return false;
        }
        abca abcaVar = abfcVar.c;
        if (abcaVar == null) {
            abcaVar = abca.a;
        }
        abod abodVar2 = abcaVar.d;
        long j2 = j - this.q;
        Iterator it = list.iterator();
        boolean zN = false;
        while (it.hasNext()) {
            ubu ubuVar = (ubu) it.next();
            if (ubuVar != null) {
                if ((abfcVar.b & 1) == 0 || !ubuVar.b) {
                    abodVar = abodVar2;
                    if (ubuVar.b) {
                        ubuVar.d = true != z ? 1.0f : 0.0f;
                    }
                } else {
                    if (z) {
                        abca abcaVar2 = abfcVar.c;
                        if (abcaVar2 == null) {
                            abcaVar2 = abca.a;
                        }
                        abohVar = abcaVar2.b;
                    } else {
                        abca abcaVar3 = abfcVar.c;
                        if (abcaVar3 == null) {
                            abcaVar3 = abca.a;
                        }
                        abohVar = abcaVar3.c;
                    }
                    boolean zM = m(abohVar, j, ubuVar);
                    if (!z) {
                        zN |= zM;
                    }
                    int i2 = i;
                    while (true) {
                        float[] fArr = ubuVar.e;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        int iIntValue = abodVar2.size() > i2 ? ((Integer) abodVar2.get(i2)).intValue() : 0;
                        abod abodVar3 = abodVar2;
                        if (!z && j2 < iIntValue) {
                            fArr[i2] = 0.0f;
                        } else if (z && j2 >= iIntValue) {
                            fArr[i2] = 0.0f;
                        }
                        i2++;
                        abodVar2 = abodVar3;
                    }
                    abodVar = abodVar2;
                }
                if ((abfcVar.b & 2) != 0 && !ubuVar.b) {
                    if (z) {
                        abey abeyVar = abfcVar.d;
                        if (abeyVar == null) {
                            abeyVar = abey.a;
                        }
                        abexVar = abeyVar.b;
                        if (abexVar == null) {
                            abexVar = abex.a;
                        }
                    } else {
                        abey abeyVar2 = abfcVar.d;
                        if (abeyVar2 == null) {
                            abeyVar2 = abey.a;
                        }
                        abexVar = abeyVar2.c;
                        if (abexVar == null) {
                            abexVar = abex.a;
                        }
                    }
                    zN |= n(abexVar, j, ubuVar);
                } else if (!ubuVar.b) {
                    ubuVar.d = true != z ? 1.0f : 0.0f;
                }
                abodVar2 = abodVar;
                i = 0;
            }
        }
        return zN;
    }

    public final long a(ube ubeVar) {
        Long l = (Long) this.p.get(ubeVar);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final List b() {
        List list = this.e;
        return (this.g == null || list == null) ? this.l : (List) Stream.CC.concat(Collection.EL.stream(this.l), Collection.EL.stream(list)).collect(Collectors.toCollection(new maf(6)));
    }

    public final synchronized void c(int i) {
        woy.aa((this.r & i) == 0, this);
        this.r = i | this.r;
    }

    final void d(int i, uwk uwkVar) {
        synchronized (this) {
            if (!this.s && this.k.get() != 0) {
                ubu ubuVar = (ubu) this.l.get(i);
                this.l.set(i, new ubu(uwkVar, ubuVar.b, ubuVar.c));
                if (uwkVar == null || uwkVar.a() == 0 || uwkVar.b(0) == null) {
                    this.m.set(true);
                }
                this.k.decrementAndGet();
                return;
            }
            if (uwkVar != null) {
                uwkVar.c();
            }
        }
    }

    public final synchronized void e(int i) {
        woy.aa((this.r & i) != 0, this);
        int i2 = (~i) & this.r;
        this.r = i2;
        if (i2 == 0) {
            k();
        }
    }

    public final void f(long j, ube ubeVar) {
        if (ubeVar != ube.b && this.g != null) {
            this.g = null;
            l();
        }
        this.q = j;
        this.n = ubeVar;
        j(j);
    }

    public final boolean g() {
        return this.k.get() > 0;
    }

    public final boolean h() {
        return this.m.get();
    }

    public final synchronized boolean i() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(long r19) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubv.j(long):int");
    }
}
