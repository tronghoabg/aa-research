package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class emt implements defpackage.emc {
    public static final defpackage.ems a = new defpackage.emi();
    public static final defpackage.ems b = new defpackage.emj();
    public static final defpackage.ems c = new defpackage.emk();
    public static final defpackage.ems d = new defpackage.eml();
    public static final defpackage.ems e = new defpackage.emm();
    public static final defpackage.ems f = new defpackage.emn();
    public static final defpackage.ems g = new defpackage.emo();
    public static final defpackage.ems h = new defpackage.emg();
    public float i;
    float j;
    boolean k;
    final java.lang.Object l;
    final defpackage.emu m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public final java.util.ArrayList r;
    private long s;
    private final java.util.ArrayList t;

    public emt(java.lang.Object obj, defpackage.emu emuVar) {
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.s = 0L;
        this.r = new java.util.ArrayList();
        this.t = new java.util.ArrayList();
        this.l = obj;
        this.m = emuVar;
        float f2 = 0.1f;
        if (emuVar != e && emuVar != f && emuVar != g) {
            if (emuVar == h) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (emuVar != c && emuVar != d) {
                    f2 = 1.0f;
                }
            }
        }
        this.q = f2;
    }

    private static void k(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.emc
    public final void a(long j) {
        long j2 = this.s;
        if (j2 == 0) {
            this.s = j;
            d(this.j);
            return;
        }
        long j3 = j - j2;
        this.s = j;
        float f2 = defpackage.emf.a().e;
        boolean zF = f(f2 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 2147483647L : (long) (j3 / f2));
        float fMin = java.lang.Math.min(this.j, this.o);
        this.j = fMin;
        float fMax = java.lang.Math.max(fMin, this.p);
        this.j = fMax;
        d(fMax);
        if (zF) {
            c(false);
        }
    }

    public void b() {
        throw null;
    }

    public final void c(boolean z) {
        int i = 0;
        this.n = false;
        defpackage.emf emfVarA = defpackage.emf.a();
        emfVarA.a.remove(this);
        java.util.ArrayList arrayList = emfVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            emfVarA.d = true;
        }
        this.s = 0L;
        this.k = false;
        while (true) {
            java.util.ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                k(arrayList2);
                return;
            } else {
                if (arrayList2.get(i) != null) {
                    ((defpackage.emq) arrayList2.get(i)).a(this, z, this.j);
                }
                i++;
            }
        }
    }

    final void d(float f2) {
        this.m.b(this.l, f2);
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                k(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((defpackage.emr) arrayList.get(i)).l(this.j);
                }
                i++;
            }
        }
    }

    public void e() {
        throw null;
    }

    public abstract boolean f(long j);

    public final void g(defpackage.emq emqVar) {
        java.util.ArrayList arrayList = this.r;
        if (arrayList.contains(emqVar)) {
            return;
        }
        arrayList.add(emqVar);
    }

    public final void h(defpackage.emr emrVar) {
        if (this.n) {
            throw new java.lang.UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        java.util.ArrayList arrayList = this.t;
        if (arrayList.contains(emrVar)) {
            return;
        }
        arrayList.add(emrVar);
    }

    public final void i(float f2) {
        if (f2 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new java.lang.IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.q = f2;
    }

    public final void j(float f2) {
        this.j = f2;
        this.k = true;
    }

    public emt(defpackage.xtc xtcVar) {
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.s = 0L;
        this.r = new java.util.ArrayList();
        this.t = new java.util.ArrayList();
        this.l = null;
        this.m = new defpackage.emh(xtcVar);
        this.q = 1.0f;
    }
}
