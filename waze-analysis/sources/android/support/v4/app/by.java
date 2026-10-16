package android.support.v4.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class by extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewModelProvider.Factory f215a = new bx();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f219e;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f216b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f217c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f218d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f220f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f221g = false;

    by(boolean z) {
        this.f219e = z;
    }

    static by c(ViewModelStore viewModelStore) {
        return (by) new ViewModelProvider(viewModelStore, f215a).get(by.class);
    }

    private final void m(String str, boolean z) {
        HashMap map = this.f217c;
        by byVar = (by) map.get(str);
        if (byVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(byVar.f217c.keySet());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byVar.h((String) arrayList.get(i2), true);
                }
            }
            byVar.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f218d;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            map2.remove(str);
        }
    }

    final ar a(String str) {
        return (ar) this.f216b.get(str);
    }

    final by b(ar arVar) {
        HashMap map = this.f217c;
        by byVar = (by) map.get(arVar.mWho);
        if (byVar != null) {
            return byVar;
        }
        by byVar2 = new by(this.f219e);
        map.put(arVar.mWho, byVar2);
        return byVar2;
    }

    final ViewModelStore d(ar arVar) {
        HashMap map = this.f218d;
        ViewModelStore viewModelStore = (ViewModelStore) map.get(arVar.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        map.put(arVar.mWho, viewModelStore2);
        return viewModelStore2;
    }

    final Collection e() {
        return new ArrayList(this.f216b.values());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            by byVar = (by) obj;
            if (this.f216b.equals(byVar.f216b) && this.f217c.equals(byVar.f217c) && this.f218d.equals(byVar.f218d)) {
                return true;
            }
        }
        return false;
    }

    final void f(ar arVar) {
        if (this.f221g) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.f216b;
        if (map.containsKey(arVar.mWho)) {
            return;
        }
        map.put(arVar.mWho, arVar);
        if (bv.aM(2)) {
            Objects.toString(arVar);
            Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(String.valueOf(arVar)));
        }
    }

    final void g(ar arVar, boolean z) {
        if (bv.aM(3)) {
            Objects.toString(arVar);
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(arVar)));
        }
        m(arVar.mWho, z);
    }

    final void h(String str, boolean z) {
        if (bv.aM(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(String.valueOf(str)));
        }
        m(str, z);
    }

    public final int hashCode() {
        return (((this.f216b.hashCode() * 31) + this.f217c.hashCode()) * 31) + this.f218d.hashCode();
    }

    final void i(ar arVar) {
        if (this.f221g) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f216b.remove(arVar.mWho) == null || !bv.aM(2)) {
                return;
            }
            Objects.toString(arVar);
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(arVar)));
        }
    }

    final void j(boolean z) {
        this.f221g = z;
    }

    final boolean k() {
        return this.f220f;
    }

    final boolean l(ar arVar) {
        if (this.f216b.containsKey(arVar.mWho) && this.f219e) {
            return this.f220f;
        }
        return true;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        if (bv.aM(3)) {
            toString();
            Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f220f = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f216b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f217c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f218d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
