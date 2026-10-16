package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bz {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public bv d;

    final Bundle a(String str, Bundle bundle) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    final Fragment b(String str) {
        by byVar = (by) this.b.get(str);
        if (byVar != null) {
            return byVar.a;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (by byVar : this.b.values()) {
            if (byVar != null && (fragmentFindFragmentByWho = byVar.a.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final by d(String str) {
        return (by) this.b.get(str);
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (by byVar : this.b.values()) {
            if (byVar != null) {
                arrayList.add(byVar);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList = new ArrayList();
        for (by byVar : this.b.values()) {
            if (byVar != null) {
                arrayList.add(byVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List g() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void h(Fragment fragment) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(fragment)) {
            Objects.toString(fragment);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
        }
        synchronized (arrayList) {
            arrayList.add(fragment);
        }
        fragment.mAdded = true;
    }

    final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void j(by byVar) {
        Fragment fragment = byVar.a;
        if (m(fragment.mWho)) {
            return;
        }
        this.b.put(fragment.mWho, byVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            bv bvVar = this.d;
            if (z) {
                bvVar.a(fragment);
            } else {
                bvVar.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (bt.ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(fragment)));
        }
    }

    final void k(by byVar) {
        Fragment fragment = byVar.a;
        if (fragment.mRetainInstance) {
            this.d.e(fragment);
        }
        HashMap map = this.b;
        if (map.get(fragment.mWho) == byVar && ((by) map.put(fragment.mWho, null)) != null && bt.ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(fragment)));
        }
    }

    final void l(Fragment fragment) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(fragment);
        }
        fragment.mAdded = false;
    }

    final boolean m(String str) {
        return this.b.get(str) != null;
    }
}
