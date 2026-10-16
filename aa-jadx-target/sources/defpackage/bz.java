package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bz {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final java.util.HashMap b = new java.util.HashMap();
    public final java.util.HashMap c = new java.util.HashMap();
    public defpackage.bv d;

    final android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        java.util.HashMap map = this.c;
        return bundle != null ? (android.os.Bundle) map.put(str, bundle) : (android.os.Bundle) map.remove(str);
    }

    final android.support.v4.app.Fragment b(java.lang.String str) {
        defpackage.by byVar = (defpackage.by) this.b.get(str);
        if (byVar != null) {
            return byVar.a;
        }
        return null;
    }

    public final android.support.v4.app.Fragment c(java.lang.String str) {
        android.support.v4.app.Fragment fragmentFindFragmentByWho;
        for (defpackage.by byVar : this.b.values()) {
            if (byVar != null && (fragmentFindFragmentByWho = byVar.a.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final defpackage.by d(java.lang.String str) {
        return (defpackage.by) this.b.get(str);
    }

    final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.by byVar : this.b.values()) {
            if (byVar != null) {
                arrayList.add(byVar);
            }
        }
        return arrayList;
    }

    final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.by byVar : this.b.values()) {
            if (byVar != null) {
                arrayList.add(byVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final java.util.List g() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            return java.util.Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new java.util.ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void h(android.support.v4.app.Fragment fragment) {
        java.util.ArrayList arrayList = this.a;
        if (arrayList.contains(fragment)) {
            java.util.Objects.toString(fragment);
            throw new java.lang.IllegalStateException("Fragment already added: ".concat(java.lang.String.valueOf(fragment)));
        }
        synchronized (arrayList) {
            arrayList.add(fragment);
        }
        fragment.mAdded = true;
    }

    final void i() {
        this.b.values().removeAll(java.util.Collections.singleton(null));
    }

    final void j(defpackage.by byVar) {
        android.support.v4.app.Fragment fragment = byVar.a;
        if (m(fragment.mWho)) {
            return;
        }
        this.b.put(fragment.mWho, byVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            defpackage.bv bvVar = this.d;
            if (z) {
                bvVar.a(fragment);
            } else {
                bvVar.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (defpackage.bt.ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "Added fragment to active set ".concat(java.lang.String.valueOf(fragment)));
        }
    }

    final void k(defpackage.by byVar) {
        android.support.v4.app.Fragment fragment = byVar.a;
        if (fragment.mRetainInstance) {
            this.d.e(fragment);
        }
        java.util.HashMap map = this.b;
        if (map.get(fragment.mWho) == byVar && ((defpackage.by) map.put(fragment.mWho, null)) != null && defpackage.bt.ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "Removed fragment from active set ".concat(java.lang.String.valueOf(fragment)));
        }
    }

    final void l(android.support.v4.app.Fragment fragment) {
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(fragment);
        }
        fragment.mAdded = false;
    }

    final boolean m(java.lang.String str) {
        return this.b.get(str) != null;
    }
}
