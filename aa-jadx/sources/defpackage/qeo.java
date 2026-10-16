package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qeo {
    public final java.lang.Object a = new java.lang.Object();
    public boolean b = false;
    public final java.util.Map c = new java.util.HashMap();
    public final java.util.Set d = new java.util.HashSet();
    private final int e;
    private final defpackage.qej f;

    public qeo(int i, defpackage.qej qejVar) {
        this.e = i;
        this.f = qejVar;
        a();
    }

    public final void a() {
        java.util.HashMap map;
        synchronized (this.a) {
            java.util.Map map2 = this.c;
            if (map2.size() + this.d.size() >= this.e) {
                this.b = true;
                map = new java.util.HashMap(map2);
            } else {
                map = null;
            }
        }
        if (map != null) {
            this.f.a.o(map);
        }
    }

    public final void b(defpackage.qed qedVar) {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            if (!this.c.containsKey(qedVar)) {
                java.util.Set set = this.d;
                if (!set.contains(qedVar)) {
                    set.add(qedVar);
                    a();
                }
            }
        }
    }
}
