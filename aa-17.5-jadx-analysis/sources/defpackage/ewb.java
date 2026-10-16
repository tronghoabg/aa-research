package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@evo(a = "dialog")
/* loaded from: classes.dex */
public final class ewb extends evp<ewa> {
    private final Context e;
    private final bt f;
    public final Set b = new LinkedHashSet();
    public final ny d = new ny(this, 5, null);
    public final Map c = new LinkedHashMap();

    public ewb(Context context, bt btVar) {
        this.e = context;
        this.f = btVar;
    }

    private final ao l(euq euqVar) {
        euz euzVar = euqVar.a;
        euzVar.getClass();
        ewa ewaVar = (ewa) euzVar;
        String strJ = ewaVar.j();
        if (strJ.charAt(0) == '.') {
            strJ = String.valueOf(this.e.getPackageName()).concat(strJ);
        }
        Fragment fragmentA = this.f.i().a(this.e.getClassLoader(), strJ);
        fragmentA.getClass();
        if (ao.class.isAssignableFrom(fragmentA.getClass())) {
            ao aoVar = (ao) fragmentA;
            aoVar.setArguments(euqVar.a());
            aoVar.getLifecycle().c(this.d);
            this.c.put(euqVar.c, aoVar);
            return aoVar;
        }
        throw new IllegalArgumentException("Dialog destination " + ewaVar.j() + " is not an instance of DialogFragment");
    }

    @Override // defpackage.evp
    public final /* synthetic */ euz a() {
        return new ewa(this);
    }

    @Override // defpackage.evp
    public final void d(List list, eve eveVar) {
        bt btVar = this.f;
        if (btVar.af()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            euq euqVar = (euq) it.next();
            l(euqVar).e(btVar, euqVar.c);
            euq euqVar2 = (euq) woy.bL((List) f().d.b());
            boolean zCn = woy.cn((Iterable) f().e.b(), euqVar2);
            f().h(euqVar);
            if (euqVar2 != null && !zCn) {
                f().c(euqVar2);
            }
        }
    }

    @Override // defpackage.evp
    public final void g(evr evrVar) {
        ept lifecycle;
        super.g(evrVar);
        for (euq euqVar : (List) evrVar.d.b()) {
            bt btVar = this.f;
            String str = euqVar.c;
            ao aoVar = (ao) btVar.f(str);
            if (aoVar == null || (lifecycle = aoVar.getLifecycle()) == null) {
                this.b.add(str);
            } else {
                lifecycle.c(this.d);
            }
        }
        this.f.n(new bw() { // from class: evz
            @Override // defpackage.bw
            public final void p(Fragment fragment) {
                ewb ewbVar = this.a;
                Set set = ewbVar.b;
                String tag = fragment.getTag();
                affz.h(set);
                if (set.remove(tag)) {
                    fragment.getLifecycle().c(ewbVar.d);
                }
                Map map = ewbVar.c;
                String tag2 = fragment.getTag();
                affz.i(map);
                map.remove(tag2);
            }
        });
    }

    @Override // defpackage.evp
    public final void h(euq euqVar) {
        euqVar.getClass();
        bt btVar = this.f;
        if (btVar.af()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        Map map = this.c;
        String str = euqVar.c;
        ao aoVar = (ao) map.get(str);
        if (aoVar == null) {
            Fragment fragmentF = btVar.f(str);
            aoVar = fragmentF instanceof ao ? (ao) fragmentF : null;
        }
        if (aoVar != null) {
            aoVar.getLifecycle().d(this.d);
            aoVar.c();
        }
        l(euqVar).e(btVar, str);
        evr evrVarF = f();
        List list = (List) evrVarF.d.b();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            euq euqVar2 = (euq) listIterator.previous();
            if (affa.f(euqVar2.c, str)) {
                ajab ajabVar = evrVarF.g;
                ajabVar.d(woy.aT(woy.aT((Set) ajabVar.b(), euqVar2), euqVar));
                evrVarF.f(euqVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.evp
    public final void j(euq euqVar, boolean z) {
        bt btVar = this.f;
        if (btVar.af()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) f().d.b();
        int iIndexOf = list.indexOf(euqVar);
        Iterator it = woy.ca(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentF = btVar.f(((euq) it.next()).c);
            if (fragmentF != null) {
                ((ao) fragmentF).c();
            }
        }
        k(iIndexOf, euqVar, z);
    }

    public final void k(int i, euq euqVar, boolean z) {
        euq euqVar2 = (euq) woy.bI((List) f().d.b(), i - 1);
        boolean zCn = woy.cn((Iterable) f().e.b(), euqVar2);
        f().g(euqVar, z);
        if (euqVar2 == null || zCn) {
            return;
        }
        f().c(euqVar2);
    }
}
