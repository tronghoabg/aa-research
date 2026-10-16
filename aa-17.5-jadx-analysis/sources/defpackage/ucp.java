package defpackage;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ucp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/LabelPicker");
    private final aezk i;
    private final uvg j;
    private final SparseArray b = new SparseArray();
    private final Map c = new HashMap();
    private boolean g = false;
    private final Map h = new WeakHashMap();
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private final Set f = new HashSet();

    public ucp(uvg uvgVar, aezk aezkVar) {
        this.j = uvgVar;
        this.i = aezkVar;
    }

    private static int d(ubq ubqVar) {
        if ((ubqVar.a().b & 2097152) != 0) {
            return ubqVar.a().v;
        }
        return 0;
    }

    private static int e(ubf ubfVar) {
        if (!(ubfVar instanceof ubq)) {
            return ubfVar.v().a();
        }
        ubq ubqVar = (ubq) ubfVar;
        if (ubqVar instanceof ubr) {
            return 0;
        }
        return ubqVar.v().a() + d(ubqVar);
    }

    public final synchronized void a(ubf ubfVar) {
        if (this.g) {
            return;
        }
        ubfVar.w(32);
        int iE = e(ubfVar);
        SparseArray sparseArray = this.b;
        uco ucoVar = (uco) sparseArray.get(iE);
        if (ucoVar == null) {
            this.i.a();
            if (ubfVar instanceof ubq) {
                ucoVar = new uco(((ubq) ubfVar).v(), new ute(d(r2), 0L, 0L, 0L));
            } else {
                ucoVar = new uco(ubfVar.v(), ute.a);
            }
            sparseArray.put(iE, ucoVar);
        }
        umq umqVar = (umq) ucoVar.b();
        umqVar.l(ubfVar);
        this.c.put(ubfVar, umqVar);
        tqs tqsVarD = ubfVar.d();
        if (tqsVarD == null) {
            udx udxVarU = ubfVar.u();
            Map map = this.h;
            abcs abcsVar = ((uat) udxVarU).a;
            WeakReference weakReference = (WeakReference) map.get(abcsVar);
            tqs ucnVar = weakReference == null ? null : (ucn) weakReference.get();
            if (ucnVar == null) {
                ucnVar = new ucn(udxVarU);
                map.put(abcsVar, new WeakReference(ucnVar));
            }
            tqsVarD = ucnVar;
        }
        if (!(tqsVarD instanceof tyy)) {
            ((ynz) ((ynz) a.a(uys.a).p(new IllegalStateException(String.format("%s implements %s but not %s.", tqsVarD.getClass().getName(), tpv.class.getName(), tyu.class.getName())))).ai((char) 9245)).s();
        }
        this.j.d(umqVar, tqsVarD);
    }

    public final synchronized void b() {
        Set set = this.d;
        Set set2 = this.e;
        Set set3 = this.f;
        Map map = this.c;
        Iterator it = yeb.b(set, set2, set3, map.keySet()).iterator();
        while (it.hasNext()) {
            ((ubf) it.next()).x(32);
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            this.j.i((uth) it2.next());
        }
        map.clear();
        set.clear();
        set2.clear();
        set3.clear();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i < sparseArray.size()) {
                ((uco) sparseArray.valueAt(i)).d();
                i++;
            } else {
                sparseArray.clear();
                this.g = true;
            }
        }
    }

    public final synchronized void c(ubf ubfVar) {
        if (this.g) {
            return;
        }
        umq umqVar = (umq) this.c.remove(ubfVar);
        if (umqVar != null) {
            this.j.i(umqVar);
            umqVar.k();
            uco ucoVar = (uco) this.b.get(e(ubfVar));
            if (ucoVar != null) {
                ucoVar.g(umqVar);
            }
        }
        ubfVar.x(32);
    }
}
