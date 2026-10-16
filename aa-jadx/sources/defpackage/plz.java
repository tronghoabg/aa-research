package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class plz implements defpackage.pma {
    public static volatile defpackage.plr a;
    private static final defpackage.ypg c = defpackage.ypg.c("com/google/android/apps/gmm/shared/cache/ObjectPool");
    protected int b;
    private final java.util.List d;
    private final defpackage.plr e;
    private final defpackage.vlu f;
    private boolean g;
    private final defpackage.ply h;
    private final defpackage.plo i;

    public plz(int i, defpackage.plr plrVar, defpackage.ply plyVar, java.lang.String str) {
        this.d = new java.util.ArrayList();
        this.g = false;
        this.b = i;
        this.h = plyVar;
        if (plrVar != null) {
            this.e = plrVar;
        } else {
            this.e = a;
        }
        if (str.isEmpty()) {
            this.f = defpackage.vlu.d(null, plyVar);
        } else {
            this.f = defpackage.vlu.a(defpackage.vlu.a(defpackage.vlu.d(null, plyVar), new defpackage.vlu(": ")), new defpackage.vlu(str));
        }
        defpackage.erh erhVar = plrVar == null ? null : plrVar.b;
        if (erhVar == null || !plyVar.n) {
            this.i = null;
        } else {
            this.i = new defpackage.plo(erhVar, defpackage.pns.a, defpackage.pns.b);
        }
    }

    @Override // defpackage.pma
    public final synchronized java.lang.String a() {
        return "size: " + this.d.size();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized java.lang.Object b() {
        java.util.List list;
        int size;
        list = this.d;
        size = list.size();
        defpackage.plo ploVar = this.i;
        if (ploVar != null && this.h.n) {
            if (size != 0) {
                ploVar.a();
            } else {
                ploVar.b();
            }
        }
        return size == 0 ? c() : list.remove(size - 1);
    }

    protected abstract java.lang.Object c();

    public final synchronized void d() {
        f(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    protected final synchronized void e(java.util.List list, java.lang.Object obj) {
        defpackage.plr plrVar;
        if (!this.g && (plrVar = this.e) != null) {
            plrVar.c(this, this.f);
            this.g = true;
        }
        list.add(obj);
    }

    @Override // defpackage.pma
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized void f(float f) {
        h(this.d, f);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized void g(java.lang.Object obj) {
        java.util.List list = this.d;
        if (list.size() >= this.b) {
            ((defpackage.ype) ((defpackage.ype) c.d()).ai(6797)).D("Pool is full (max size: %d); dispose %s", this.b, obj);
        } else {
            e(list, obj);
        }
    }

    protected final synchronized void h(java.util.List list, float f) {
        int size = list.size();
        int i = (int) (size * f);
        if (size > i) {
            ((defpackage.ype) ((defpackage.ype) c.f()).ai(6798)).S("Trimming %s's current size %d to %g, or %d", this.f, java.lang.Integer.valueOf(size), java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i));
        }
        while (list.size() > i) {
            list.remove(list.size() - 1);
        }
        if (this.g && this.d.isEmpty()) {
            defpackage.plr plrVar = this.e;
            if (plrVar != null) {
                plrVar.e(this);
            }
            this.g = false;
        }
    }

    public final synchronized java.lang.String toString() {
        return "ObjectPool[name: " + this.f.a + "; " + this.d.size() + "/" + this.b + "]";
    }

    public plz(int i, java.lang.String str) {
        this(i, null, defpackage.ply.OTHER, str);
    }
}
