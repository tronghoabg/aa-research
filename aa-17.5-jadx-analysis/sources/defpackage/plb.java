package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public class plb implements plg {
    private static final yob b = yob.c("com/google/android/apps/gmm/shared/cache/LRUCache");
    protected int a;
    private final pkx c;
    private aesu d = new aesu(null);
    private aesj e = new aesj(null);
    private int f;
    private vky g;
    private final pkz h;
    private pku i;

    public plb(int i, pkz pkzVar, pkx pkxVar, vky vkyVar) {
        erb erbVar;
        this.a = i;
        this.c = pkxVar;
        if (pkzVar == null) {
            pkzVar = pkz.OTHER;
            this.h = pkzVar;
        } else {
            this.h = pkzVar;
        }
        vky vkyVarD = vky.d(null, pkzVar);
        this.g = vkyVarD;
        if (vkyVar != null) {
            vky vkyVarA = vky.a(vkyVarD, new vky(": "));
            this.g = vkyVarA;
            this.g = vky.a(vkyVarA, vkyVar);
        }
        if (pkxVar != null && pkzVar.E && (erbVar = pkxVar.b) != null) {
            this.i = new pku(erbVar, pmw.c, pmw.d);
        }
        if (pkxVar != null) {
            pkxVar.c(this, this.g);
        }
    }

    private final synchronized Object t(Object obj) {
        Object objRemove;
        objRemove = this.d.remove(obj);
        if (objRemove != null) {
            this.f -= this.e.b(obj);
            o(obj, objRemove);
        }
        return objRemove;
    }

    @Override // defpackage.plg
    public final String a() {
        return "numItems: " + c() + " measuredSize: " + b();
    }

    public final synchronized int b() {
        return this.f;
    }

    public final synchronized int c() {
        return this.d.k;
    }

    public int d(Object obj) {
        return 1;
    }

    public final pla e() {
        return new pla(this.d);
    }

    @Override // defpackage.plg
    @ResultIgnorabilityUnspecified
    public final synchronized void f(float f) {
        float f2 = 0.5f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            try {
                ((ynz) b.a(uys.a).ai(6765)).y("fraction %f < 0", Float.valueOf(f));
                f = 0.5f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f > 1.0f) {
            ((ynz) b.a(uys.a).ai(6764)).y("fraction %f > 1", Float.valueOf(f));
        } else {
            f2 = f;
        }
        int iB = b();
        int i = (int) (iB * f2);
        if (iB > 0) {
            ((ynz) ((ynz) b.d()).ai(6763)).S("Trimming %s's current size %d to %g, or %d", this.g, Integer.valueOf(iB), Float.valueOf(f2), Integer.valueOf(i));
        }
        r(i);
        aesu aesuVar = this.d;
        aesuVar.t(aesuVar.k);
        aesj aesjVar = this.e;
        aesjVar.v(aesjVar.h);
    }

    @ResultIgnorabilityUnspecified
    public final synchronized Object g(Object obj) {
        Object obj2;
        obj2 = this.d.get(obj);
        m(obj2);
        p(obj, obj2);
        return obj2;
    }

    @ResultIgnorabilityUnspecified
    public synchronized Object h(Object obj) {
        Object obj2;
        aesu aesuVar = this.d;
        obj2 = null;
        if (obj != null) {
            Object[] objArr = aesuVar.a;
            int iHashCode = obj.hashCode() * (-1640531527);
            int i = (iHashCode ^ (iHashCode >>> 16)) & aesuVar.c;
            Object obj3 = objArr[i];
            if (obj3 != null) {
                if (!obj.equals(obj3)) {
                    while (true) {
                        i = (i + 1) & aesuVar.c;
                        Object obj4 = objArr[i];
                        if (obj4 == null) {
                            break;
                        }
                        if (obj.equals(obj4)) {
                            aesuVar.n(i);
                            obj2 = aesuVar.b[i];
                            break;
                        }
                    }
                } else {
                    aesuVar.n(i);
                    obj2 = aesuVar.b[i];
                }
            }
        } else if (aesuVar.d) {
            aesuVar.n(aesuVar.h);
            obj2 = aesuVar.b[aesuVar.h];
        }
        m(obj2);
        p(obj, obj2);
        return obj2;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized Object i(Object obj) {
        return t(obj);
    }

    public final synchronized Collection j() {
        return new ArrayList(this.d.values());
    }

    public final synchronized void k(int i) {
        this.a = i;
    }

    public synchronized void l() {
        r(0);
    }

    public final synchronized void m(Object obj) {
        pku pkuVar = this.i;
        if (pkuVar != null) {
            if (obj != null) {
                pkuVar.a();
            } else {
                pkuVar.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x00eb, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001a, B:9:0x0020, B:10:0x0036, B:12:0x003b, B:14:0x003f, B:35:0x00d0, B:37:0x00de, B:38:0x00e1, B:15:0x004c, B:27:0x008a, B:29:0x0096, B:31:0x00bd, B:33:0x00c6, B:30:0x00a1, B:16:0x0051, B:18:0x0065, B:20:0x006b, B:21:0x0073, B:23:0x007b, B:25:0x0081), top: B:44:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: all -> 0x00eb, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001a, B:9:0x0020, B:10:0x0036, B:12:0x003b, B:14:0x003f, B:35:0x00d0, B:37:0x00de, B:38:0x00e1, B:15:0x004c, B:27:0x008a, B:29:0x0096, B:31:0x00bd, B:33:0x00c6, B:30:0x00a1, B:16:0x0051, B:18:0x0065, B:20:0x006b, B:21:0x0073, B:23:0x007b, B:25:0x0081), top: B:44:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6 A[Catch: all -> 0x00eb, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001a, B:9:0x0020, B:10:0x0036, B:12:0x003b, B:14:0x003f, B:35:0x00d0, B:37:0x00de, B:38:0x00e1, B:15:0x004c, B:27:0x008a, B:29:0x0096, B:31:0x00bd, B:33:0x00c6, B:30:0x00a1, B:16:0x0051, B:18:0x0065, B:20:0x006b, B:21:0x0073, B:23:0x007b, B:25:0x0081), top: B:44:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void n(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plb.n(java.lang.Object, java.lang.Object):void");
    }

    public final synchronized void r(int i) {
        if (i != 0) {
            while (!this.d.isEmpty() && this.f > i) {
                i(this.d.firstKey());
            }
            return;
        }
        this.e = new aesj(null);
        if (!this.d.isEmpty()) {
            aeui aeuiVarH = this.d.d().d();
            while (aeuiVarH.hasNext()) {
                aetg aetgVarB = ((aesp) aeuiVarH).next();
                o(aetgVarB.getKey(), aetgVarB.getValue());
                aetgVarB.getKey();
                aetgVarB.getValue();
                aetgVarB.getKey();
                aetgVarB.getValue();
            }
        }
        this.d = new aesu(null);
        this.f = 0;
    }

    public final synchronized boolean s() {
        return this.d.isEmpty();
    }

    protected void o(Object obj, Object obj2) {
    }

    protected void p(Object obj, Object obj2) {
    }

    protected void q(Object obj, Object obj2) {
    }
}
