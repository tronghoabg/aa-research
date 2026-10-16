package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dqh {
    public static final java.lang.Integer a = 0;
    public boolean b = true;
    public final java.util.HashMap c;
    public final java.util.HashMap d;
    public final java.util.HashMap e;
    public final defpackage.dpx f;
    public final java.util.ArrayList g;
    public final java.util.ArrayList h;
    public boolean i;
    public final defpackage.dlo j;
    public long k;
    public defpackage.ajnd l;
    private int m;

    public dqh(defpackage.dlo dloVar) {
        java.util.HashMap map = new java.util.HashMap();
        this.c = map;
        this.d = new java.util.HashMap();
        this.e = new java.util.HashMap();
        defpackage.dpx dpxVar = new defpackage.dpx(this);
        this.f = dpxVar;
        this.m = 0;
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.i = true;
        java.lang.Integer num = a;
        dpxVar.a = num;
        map.put(num, dpxVar);
        this.j = dloVar;
        this.k = defpackage.dln.d(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        this.l = new defpackage.ajnd(this);
    }

    public final int a(java.lang.Object obj) {
        return java.lang.Math.round(((java.lang.Float) obj).floatValue());
    }

    public final defpackage.dpx b(java.lang.Object obj) {
        java.util.HashMap map = this.c;
        defpackage.dqe dqeVar = (defpackage.dqe) map.get(obj);
        java.lang.Object obj2 = dqeVar;
        if (dqeVar == null) {
            defpackage.dpx dpxVar = new defpackage.dpx(this);
            map.put(obj, dpxVar);
            dpxVar.a = obj;
            obj2 = dpxVar;
        }
        if (obj2 instanceof defpackage.dpx) {
            return (defpackage.dpx) obj2;
        }
        return null;
    }

    public final defpackage.dqp c() {
        return (defpackage.dqp) h(1);
    }

    public final defpackage.dqq d() {
        return (defpackage.dqq) h(2);
    }

    public final void e(java.lang.Object obj) {
        this.g.add(obj);
        this.i = true;
    }

    public final boolean f() {
        return !this.b;
    }

    public final void g(java.lang.Object obj, int i) {
        defpackage.dpx dpxVarB = b(obj);
        defpackage.dql dqlVar = dpxVarB.c;
        if (dqlVar == null || !(dqlVar instanceof defpackage.dqo)) {
            defpackage.dqo dqoVar = new defpackage.dqo(this);
            dqoVar.b = i;
            dqoVar.f = obj;
            dpxVarB.g(dqoVar);
        }
    }

    public final defpackage.dqd h(int i) {
        int i2 = this.m;
        this.m = i2 + 1;
        java.lang.String str = "__HELPER_KEY_" + i2 + "__";
        java.util.HashMap map = this.d;
        defpackage.dqd dqdVar = (defpackage.dqd) map.get(str);
        if (dqdVar != null) {
            return dqdVar;
        }
        defpackage.dqd dqqVar = i + (-1) != 0 ? new defpackage.dqq(this) : new defpackage.dqp(this);
        dqqVar.a = str;
        map.put(str, dqqVar);
        return dqqVar;
    }
}
