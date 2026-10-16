package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bv extends erm {
    public static final erq a = new bu();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public bv(boolean z) {
        this.e = z;
    }

    private final void h(String str, boolean z) {
        HashMap map = this.c;
        bv bvVar = (bv) map.get(str);
        if (bvVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(bvVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bvVar.c((String) arrayList.get(i), true);
                }
            }
            bvVar.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        ert ertVar = (ert) map2.get(str);
        if (ertVar != null) {
            ertVar.a();
            map2.remove(str);
        }
    }

    public final void a(Fragment fragment) {
        if (this.g) {
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.b;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (bt.ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(String.valueOf(fragment)));
        }
    }

    final void b(Fragment fragment, boolean z) {
        if (bt.ac(3)) {
            Objects.toString(fragment);
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(fragment)));
        }
        h(fragment.mWho, z);
    }

    final void c(String str, boolean z) {
        if (bt.ac(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(String.valueOf(str)));
        }
        h(str, z);
    }

    @Override // defpackage.erm
    protected final void d() {
        if (bt.ac(3)) {
            toString();
            Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f = true;
    }

    public final void e(Fragment fragment) {
        if (this.g) {
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(fragment.mWho) == null || !bt.ac(2)) {
                return;
            }
            Objects.toString(fragment);
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(fragment)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bv bvVar = (bv) obj;
            if (this.b.equals(bvVar.b) && this.c.equals(bvVar.c) && this.d.equals(bvVar.d)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(Fragment fragment) {
        if (this.b.containsKey(fragment.mWho) && this.e) {
            return this.f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
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
