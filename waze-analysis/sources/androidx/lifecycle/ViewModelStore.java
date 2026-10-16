package androidx.lifecycle;

import h.a.i;
import h.a.r;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.m.k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class ViewModelStore {
    private final Map<Object, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Map<Object, ViewModel> map = this.map;
        Map mapR = r.r(map);
        map.clear();
        Iterator it = mapR.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).clear$lifecycle_viewmodel();
        }
    }

    public final ViewModel get(Object obj) {
        return this.map.get(obj);
    }

    public final <T extends ViewModel> T getOrPut(Object obj, a<? extends T> aVar) {
        x.f(aVar, "defaultValue");
        Map<Object, ViewModel> map = this.map;
        ViewModel viewModelInvoke = map.get(obj);
        if (viewModelInvoke == null) {
            viewModelInvoke = aVar.invoke();
            map.put(obj, viewModelInvoke);
        }
        x.d(viewModelInvoke, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelStore.getOrPut");
        return (T) viewModelInvoke;
    }

    public final Set<Object> keys() {
        return i.au(this.map.keySet());
    }

    public final void put(Object obj, ViewModel viewModel) {
        x.f(viewModel, "viewModel");
        ViewModel viewModelPut = this.map.put(obj, viewModel);
        if (viewModelPut != null) {
            viewModelPut.clear$lifecycle_viewmodel();
        }
    }

    public String toString() {
        int i2 = ar.f48106a;
        String strC = new m(getClass()).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        k.y(16);
        String string = Integer.toString(iHashCode, 16);
        x.e(string, "toString(...)");
        return strC + "@" + string + "(keys=" + keys() + ")";
    }
}
