package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class erc implements epy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public erc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [fbg, java.lang.Object] */
    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) throws NoSuchMethodException, SecurityException {
        switch (this.b) {
            case 0:
                if (eprVar != epr.ON_CREATE) {
                    Objects.toString(eprVar);
                    throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(eprVar.toString()));
                }
                eqaVar.getLifecycle().d(this);
                ((ere) ((affv) this.a).a).c();
                return;
            case 1:
                ((ajab) this.a).d(eprVar.a());
                return;
            case 2:
                if (eprVar == epr.ON_START) {
                    this.a.getSavedStateRegistry().d(eqo.class);
                    return;
                }
                return;
            case 3:
                if (eprVar == epr.ON_DESTROY) {
                    Fragment fragment = (Fragment) eqaVar;
                    evp evpVar = (evp) this.a;
                    Object obj = null;
                    for (Object obj2 : (Iterable) evpVar.f().e.b()) {
                        if (affa.f(((euq) obj2).c, fragment.getTag())) {
                            obj = obj2;
                        }
                    }
                    euq euqVar = (euq) obj;
                    if (euqVar != null) {
                        if (ewh.k()) {
                            Log.v("FragmentNavigator", a.bw(eqaVar, euqVar, "Marking transition complete for entry ", " due to fragment ", " lifecycle reaching DESTROYED"));
                        }
                        evpVar.f().c(euqVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                eps epsVarA = eprVar.a();
                ewp ewpVar = (ewp) this.a;
                ewpVar.i = epsVarA;
                if (ewpVar.b != null) {
                    for (euq euqVar2 : woy.ch(ewpVar.e)) {
                        euqVar2.b = eprVar.a();
                        euqVar2.c();
                    }
                    return;
                }
                return;
            case 5:
                if (eprVar == epr.ON_START) {
                    ebf.j().F((rqy) this.a);
                    return;
                }
                return;
            case 6:
                int iOrdinal = eprVar.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 0) {
                    kfl.h().l(((ker) obj3).a);
                    return;
                } else {
                    if (iOrdinal != 5) {
                        return;
                    }
                    kfl.h().s(((ker) obj3).a);
                    return;
                }
            case 7:
                Object obj4 = this.a;
                if (eprVar == epr.ON_START) {
                    Set set = kgv.a().b;
                    set.add(obj4);
                    ((ype) ((ype) kgv.a.f()).ai((char) 3073)).w("addBlockingFragment (new size = %d)", set.size());
                    return;
                }
                if (eprVar == epr.ON_STOP) {
                    Set set2 = kgv.a().b;
                    set2.remove(obj4);
                    ((ype) ((ype) kgv.a.f()).ai((char) 3074)).w("removeBlockingFragment (new size = %d)", set2.size());
                    return;
                }
                return;
            case 8:
                Object obj5 = this.a;
                if (eprVar == epr.ON_START) {
                    lrr.a().b(obj5);
                    return;
                } else {
                    if (eprVar == epr.ON_STOP) {
                        lrr.a().c(obj5);
                        return;
                    }
                    return;
                }
            case 9:
                if (eprVar == epr.ON_PAUSE) {
                    ((llc) this.a).i = -1L;
                    return;
                }
                return;
            case 10:
                ((ynz) thj.h.e().ai(9074)).R("Lifecycle for %s screen (%s) got %s", ((qw) this.a).c, eqaVar, eprVar);
                return;
            default:
                if (eprVar == epr.ON_DESTROY) {
                    eqaVar.getLifecycle().d(this);
                    ((adzg) this.a).b();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ erc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
