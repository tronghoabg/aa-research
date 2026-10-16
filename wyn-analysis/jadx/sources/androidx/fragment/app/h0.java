package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h0 extends androidx.lifecycle.b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a2.k f18451h = new a2.k();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18455e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18452b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18453c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18454d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f18456f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18457g = false;

    public h0(boolean z2) {
        this.f18455e = z2;
    }

    @Override // androidx.lifecycle.b0
    public final void b() {
        if (e0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f18456f = true;
    }

    public final void c(F f10) {
        if (this.f18457g) {
            if (e0.J(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.f18452b;
        if (map.containsKey(f10.mWho)) {
            return;
        }
        map.put(f10.mWho, f10);
        if (e0.J(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + f10);
        }
    }

    public final void d(F f10, boolean z2) {
        if (e0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + f10);
        }
        f(f10.mWho, z2);
    }

    public final void e(String str, boolean z2) {
        if (e0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f18452b.equals(h0Var.f18452b) && this.f18453c.equals(h0Var.f18453c) && this.f18454d.equals(h0Var.f18454d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z2) {
        HashMap map = this.f18453c;
        h0 h0Var = (h0) map.get(str);
        if (h0Var != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(h0Var.f18453c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h0Var.e((String) it.next(), true);
                }
            }
            h0Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f18454d;
        androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) map2.get(str);
        if (e0Var != null) {
            e0Var.a();
            map2.remove(str);
        }
    }

    public final void g(F f10) {
        if (this.f18457g) {
            if (e0.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f18452b.remove(f10.mWho) == null || !e0.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + f10);
        }
    }

    public final int hashCode() {
        return this.f18454d.hashCode() + ((this.f18453c.hashCode() + (this.f18452b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f18452b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f18453c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f18454d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
