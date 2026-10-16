package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bv extends defpackage.ers {
    public static final defpackage.erw a = new defpackage.bu();
    public final boolean e;
    public final java.util.HashMap b = new java.util.HashMap();
    public final java.util.HashMap c = new java.util.HashMap();
    public final java.util.HashMap d = new java.util.HashMap();
    public boolean f = false;
    public boolean g = false;

    public bv(boolean z) {
        this.e = z;
    }

    private final void h(java.lang.String str, boolean z) {
        java.util.HashMap map = this.c;
        defpackage.bv bvVar = (defpackage.bv) map.get(str);
        if (bvVar != null) {
            if (z) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(bvVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bvVar.c((java.lang.String) arrayList.get(i), true);
                }
            }
            bvVar.d();
            map.remove(str);
        }
        java.util.HashMap map2 = this.d;
        defpackage.erz erzVar = (defpackage.erz) map2.get(str);
        if (erzVar != null) {
            erzVar.a();
            map2.remove(str);
        }
    }

    public final void a(android.support.v4.app.Fragment fragment) {
        if (this.g) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        java.util.HashMap map = this.b;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (defpackage.bt.ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(java.lang.String.valueOf(fragment)));
        }
    }

    final void b(android.support.v4.app.Fragment fragment, boolean z) {
        if (defpackage.bt.ac(3)) {
            java.util.Objects.toString(fragment);
            android.util.Log.d("FragmentManager", "Clearing non-config state for ".concat(java.lang.String.valueOf(fragment)));
        }
        h(fragment.mWho, z);
    }

    final void c(java.lang.String str, boolean z) {
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(java.lang.String.valueOf(str)));
        }
        h(str, z);
    }

    @Override // defpackage.ers
    protected final void d() {
        if (defpackage.bt.ac(3)) {
            toString();
            android.util.Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f = true;
    }

    public final void e(android.support.v4.app.Fragment fragment) {
        if (this.g) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(fragment.mWho) == null || !defpackage.bt.ac(2)) {
                return;
            }
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(java.lang.String.valueOf(fragment)));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.bv bvVar = (defpackage.bv) obj;
            if (this.b.equals(bvVar.b) && this.c.equals(bvVar.c) && this.d.equals(bvVar.d)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(android.support.v4.app.Fragment fragment) {
        if (this.b.containsKey(fragment.mWho) && this.e) {
            return this.f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((java.lang.String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((java.lang.String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
