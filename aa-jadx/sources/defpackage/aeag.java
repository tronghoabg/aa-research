package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeag extends defpackage.adog implements defpackage.adln {
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.aeag.class.getName());
    public static final defpackage.aeak c = new defpackage.aeaa();
    public final defpackage.adxu d;
    public java.util.concurrent.Executor e;
    public final defpackage.advn f;
    public final java.util.List g;
    public final defpackage.adoj[] h;
    public final long i;
    public boolean j;
    public boolean k;
    public defpackage.ador l;
    public boolean m;
    public final defpackage.advo n;
    public boolean p;
    public final defpackage.adkr r;
    public final defpackage.adku s;
    public final defpackage.adlk t;
    public final defpackage.adsx u;
    public final defpackage.adrs v;
    private final defpackage.adlo w;
    private boolean x;
    public final java.lang.Object o = new java.lang.Object();
    public final java.util.Set q = new java.util.HashSet();

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public aeag(defpackage.aeah aeahVar, defpackage.advo advoVar, defpackage.adkr adkrVar) {
        java.util.List listUnmodifiableList;
        defpackage.adxu adxuVar = aeahVar.f;
        adxuVar.getClass();
        this.d = adxuVar;
        defpackage.erh erhVar = aeahVar.q;
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = ((java.util.HashMap) erhVar.a).values().iterator();
        while (it.hasNext()) {
            for (defpackage.aecg aecgVar : ((defpackage.aecg) it.next()).b.values()) {
                map.put(((defpackage.adng) aecgVar.a).b, aecgVar);
            }
        }
        j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(((java.util.HashMap) erhVar.a).values()));
        this.f = new defpackage.advn(j$.util.DesugarCollections.unmodifiableMap(map));
        aeahVar.o.getClass();
        this.n = advoVar;
        synchronized (this.o) {
            listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(defpackage.ygw.q(((defpackage.adpx) advoVar).b));
        }
        this.w = defpackage.adlo.b("Server", java.lang.String.valueOf(listUnmodifiableList));
        adkrVar.getClass();
        this.r = new defpackage.adkr(adkrVar.f, adkrVar.g + 1).l(defpackage.adlr.a, this);
        this.s = aeahVar.g;
        this.g = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(aeahVar.b));
        java.util.List list = aeahVar.c;
        this.h = (defpackage.adoj[]) list.toArray(new defpackage.adoj[list.size()]);
        this.i = aeahVar.h;
        defpackage.adlk adlkVar = aeahVar.m;
        this.t = adlkVar;
        this.u = new defpackage.adsx(defpackage.aeba.a);
        defpackage.adrs adrsVar = aeahVar.p;
        adrsVar.getClass();
        this.v = adrsVar;
        defpackage.adlk.b(adlkVar.c, this);
    }

    public final void a() {
        java.lang.Object obj = this.o;
        synchronized (obj) {
            if (this.k && this.q.isEmpty() && this.p) {
                if (this.x) {
                    throw new java.lang.AssertionError("Server already terminated");
                }
                this.x = true;
                defpackage.adlk adlkVar = this.t;
                defpackage.adlk.c(adlkVar.c, this);
                java.util.concurrent.Executor executor = this.e;
                if (executor != null) {
                    this.d.b(executor);
                    this.e = null;
                }
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        synchronized (this.o) {
            if (!this.k) {
                this.k = true;
                boolean z = this.j;
                if (!z) {
                    this.p = true;
                    a();
                }
                if (z) {
                    this.n.c();
                }
            }
        }
        defpackage.ador adorVarE = defpackage.ador.m.e("Server shutdownNow invoked");
        synchronized (this.o) {
            if (this.l != null) {
                return;
            }
            this.l = adorVarE;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.q);
            boolean z2 = this.m;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.adpy) arrayList.get(i)).f(adorVarE);
                }
            }
        }
    }

    @Override // defpackage.adlu
    public final defpackage.adlo e() {
        return this.w;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.g("logId", this.w.a);
        xymVarBy.b("transportServer", this.n);
        return xymVarBy.toString();
    }
}
