package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zju extends defpackage.adrq {
    public final java.util.concurrent.Executor a;
    public final java.util.Set b;
    public final java.util.Deque c;
    public int d;
    public defpackage.zjt e;
    public boolean f;
    public final defpackage.zjs g;
    public boolean h;
    public defpackage.adrq i;
    public defpackage.adrq j;
    private final defpackage.adjx k;
    private final defpackage.adng l;
    private final defpackage.ygw m;
    private final java.util.LinkedHashMap n;
    private final java.util.Set o;
    private final java.util.Queue p;
    private final defpackage.adjw q;
    private final java.util.Queue r;
    private int s;
    private defpackage.adnd t;

    public zju(defpackage.adjx adjxVar, defpackage.adng adngVar, defpackage.adjw adjwVar, defpackage.ygw ygwVar) {
        super(null);
        this.b = defpackage.ysr.u();
        this.n = new java.util.LinkedHashMap();
        this.o = defpackage.ysr.u();
        this.f = false;
        this.h = false;
        this.k = adjxVar;
        this.l = adngVar;
        this.q = adjwVar;
        this.m = ygwVar;
        this.c = new java.util.ArrayDeque();
        this.r = new java.util.ArrayDeque();
        this.p = new java.util.ArrayDeque();
        this.e = new defpackage.zjt(((defpackage.ymx) ygwVar).c, 1, 0, 0);
        java.util.concurrent.Executor executor = adjwVar.c;
        defpackage.zjs zjsVar = new defpackage.zjs(executor == null ? defpackage.zgt.INSTANCE : executor);
        this.g = zjsVar;
        this.a = new defpackage.phz(this, new defpackage.zie(zjsVar), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aR(defpackage.zjr zjrVar, int i, int i2) {
        zjrVar.a.getClass();
        while (i < i2) {
            defpackage.ygw ygwVar = (defpackage.ygw) this.m.get(i);
            if (ygwVar.size() > 0) {
                ((defpackage.zjo) ygwVar.get(0)).e();
                throw null;
            }
            i++;
        }
        zjrVar.c = i2;
        if (zjrVar.b.isEmpty()) {
            while (true) {
                java.util.Deque deque = this.c;
                if (deque.isEmpty()) {
                    break;
                }
                defpackage.zjr zjrVar2 = (defpackage.zjr) deque.peek();
                if (!zjrVar2.b.isEmpty() || zjrVar2.c != zjrVar2.d.e.a) {
                    break;
                }
                java.lang.Object obj = ((defpackage.zjr) deque.poll()).a;
                if (this.e.e == 4) {
                    this.i.n(obj);
                } else {
                    this.p.add(obj);
                }
            }
            k();
        }
    }

    private final void aS() {
        defpackage.zjt zjtVar;
        defpackage.zjt zjtVar2 = this.e;
        int i = zjtVar2.e;
        defpackage.ysr.bk(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            zjtVar = new defpackage.zjt(zjtVar2.a, 4, zjtVar2.b, zjtVar2.c);
        } else {
            if (i == 1) {
                boolean z = zjtVar2.d;
            }
            int i2 = zjtVar2.b;
            int i3 = i2 + 1;
            int i4 = zjtVar2.a;
            int i5 = zjtVar2.c;
            zjtVar = i3 < i4 ? new defpackage.zjt(i4, 1, i3, i5) : new defpackage.zjt(i4, 3, i2, i5);
        }
        this.e = zjtVar;
        int i6 = zjtVar.e - 1;
        if (i6 == 0) {
            o(this.t);
            return;
        }
        if (i6 != 2) {
            l();
            return;
        }
        defpackage.adrq adrqVarD = this.k.d(this.l, this.q);
        this.i = adrqVarD;
        adrqVarD.b(this.j, this.t);
        int i7 = this.d;
        if (i7 > 0) {
            this.i.m(i7);
        }
        java.util.Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.i.n(it.next());
        }
        if (this.f && this.c.isEmpty()) {
            this.i.j();
        }
        aS();
    }

    private static final defpackage.zps aT(defpackage.adjw adjwVar, defpackage.adnd adndVar, java.lang.String str) {
        adndVar.getClass();
        str.getClass();
        return new defpackage.zps(adjwVar, adndVar, str);
    }

    @Override // defpackage.adrq
    public final void b(defpackage.adrq adrqVar, defpackage.adnd adndVar) {
        this.j = new defpackage.zjq(this, new defpackage.zka(new defpackage.zjw(adrqVar, this.m, this.o)));
        this.t = adndVar;
        this.a.execute(defpackage.xvx.c(new defpackage.wla(this, adndVar, 9)));
    }

    @Override // defpackage.adrq
    public final void i(java.lang.String str, java.lang.Throwable th) {
        this.a.execute(defpackage.xvx.c(new defpackage.unw(this, str, th, 10)));
    }

    @Override // defpackage.adrq
    public final void j() {
        this.a.execute(defpackage.xvx.c(new defpackage.xgr(this, 3)));
    }

    public final void k() {
        if (this.f) {
            defpackage.zjr zjrVar = (defpackage.zjr) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && zjrVar == null) {
                    this.i.j();
                    return;
                }
                return;
            }
            if (zjrVar == null || (zjrVar.b.isEmpty() && zjrVar.c == zjrVar.d.e.c + 1)) {
                aS();
            }
        }
    }

    public final void l() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (defpackage.zjr zjrVar : this.c) {
                aR(zjrVar, zjrVar.c, this.e.a);
            }
            return;
        }
        for (defpackage.zjr zjrVar2 : this.c) {
            int i2 = zjrVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                aR(zjrVar2, i2, i3 + 1);
            }
        }
    }

    @Override // defpackage.adrq
    public final void m(int i) {
        byte[] bArr;
        synchronized (this.r) {
            this.s += i;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.Queue queue = this.r;
        synchronized (queue) {
            bArr = null;
            if (!queue.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    java.lang.Object objPoll = queue.poll();
                    if (objPoll != null) {
                        arrayDeque.add(objPoll);
                        this.s--;
                    }
                }
                boolean zIsEmpty = queue.isEmpty();
                java.util.Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.j.g(it.next());
                }
                if (zIsEmpty) {
                    this.j.a(defpackage.ador.b, null);
                }
            }
        }
        this.a.execute(defpackage.xvx.c(new defpackage.rhh(this, i, 18, bArr)));
    }

    @Override // defpackage.adrq
    public final void n(java.lang.Object obj) {
        this.a.execute(defpackage.xvx.c(new defpackage.wla(this, obj, 10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(defpackage.adnd adndVar) {
        java.lang.String strA = this.k.a();
        defpackage.adjw adjwVar = this.q;
        defpackage.zps zpsVarAT = aT(adjwVar, adndVar, strA);
        defpackage.ygw ygwVar = (defpackage.ygw) this.m.get(this.e.b);
        if (ygwVar.size() <= 0) {
            if (this.n.isEmpty()) {
                aS();
            }
        } else {
            defpackage.zjo zjoVar = (defpackage.zjo) ygwVar.get(0);
            if (adjwVar != zpsVarAT.b) {
                aT(adjwVar, (defpackage.adnd) zpsVarAT.d, (java.lang.String) zpsVarAT.c);
            }
            zjoVar.d();
            throw null;
        }
    }
}
