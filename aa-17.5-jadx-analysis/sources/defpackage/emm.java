package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class emm implements elv {
    public static final eml a = new emb();
    public static final eml b = new emc();
    public static final eml c = new emd();
    public static final eml d = new eme();
    public static final eml e = new emf();
    public static final eml f = new emg();
    public static final eml g = new emh();
    public static final eml h = new elz();
    public float i;
    float j;
    boolean k;
    final Object l;
    final emn m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public final ArrayList r;
    private long s;
    private final ArrayList t;

    public emm(Object obj, emn emnVar) {
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.s = 0L;
        this.r = new ArrayList();
        this.t = new ArrayList();
        this.l = obj;
        this.m = emnVar;
        float f2 = 0.1f;
        if (emnVar != e && emnVar != f && emnVar != g) {
            if (emnVar == h) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (emnVar != c && emnVar != d) {
                    f2 = 1.0f;
                }
            }
        }
        this.q = f2;
    }

    private static void k(ArrayList arrayList) {
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

    @Override // defpackage.elv
    public final void a(long j) {
        long j2 = this.s;
        if (j2 == 0) {
            this.s = j;
            d(this.j);
            return;
        }
        long j3 = j - j2;
        this.s = j;
        float f2 = ely.a().e;
        boolean zF = f(f2 == BitmapDescriptorFactory.HUE_RED ? 2147483647L : (long) (j3 / f2));
        float fMin = Math.min(this.j, this.o);
        this.j = fMin;
        float fMax = Math.max(fMin, this.p);
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
        ely elyVarA = ely.a();
        elyVarA.a.remove(this);
        ArrayList arrayList = elyVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            elyVarA.d = true;
        }
        this.s = 0L;
        this.k = false;
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                k(arrayList2);
                return;
            } else {
                if (arrayList2.get(i) != null) {
                    ((emj) arrayList2.get(i)).a(this, z, this.j);
                }
                i++;
            }
        }
    }

    final void d(float f2) {
        this.m.b(this.l, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                k(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((emk) arrayList.get(i)).l(this.j);
                }
                i++;
            }
        }
    }

    public void e() {
        throw null;
    }

    public abstract boolean f(long j);

    public final void g(emj emjVar) {
        ArrayList arrayList = this.r;
        if (arrayList.contains(emjVar)) {
            return;
        }
        arrayList.add(emjVar);
    }

    public final void h(emk emkVar) {
        if (this.n) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.t;
        if (arrayList.contains(emkVar)) {
            return;
        }
        arrayList.add(emkVar);
    }

    public final void i(float f2) {
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.q = f2;
    }

    public final void j(float f2) {
        this.j = f2;
        this.k = true;
    }

    public emm(emo emoVar) {
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.s = 0L;
        this.r = new ArrayList();
        this.t = new ArrayList();
        this.l = null;
        this.m = new ema(emoVar);
        this.q = 1.0f;
    }
}
