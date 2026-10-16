package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18496a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18497b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18498c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public h0 f18499d;

    public final void a(F f10) {
        if (this.f18496a.contains(f10)) {
            throw new IllegalStateException("Fragment already added: " + f10);
        }
        synchronized (this.f18496a) {
            this.f18496a.add(f10);
        }
        f10.mAdded = true;
    }

    public final F b(String str) {
        l0 l0Var = (l0) this.f18497b.get(str);
        if (l0Var != null) {
            return l0Var.f18480c;
        }
        return null;
    }

    public final F c(String str) {
        F fFindFragmentByWho;
        for (l0 l0Var : this.f18497b.values()) {
            if (l0Var != null && (fFindFragmentByWho = l0Var.f18480c.findFragmentByWho(str)) != null) {
                return fFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (l0 l0Var : this.f18497b.values()) {
            if (l0Var != null) {
                arrayList.add(l0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (l0 l0Var : this.f18497b.values()) {
            if (l0Var != null) {
                arrayList.add(l0Var.f18480c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f18496a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f18496a) {
            arrayList = new ArrayList(this.f18496a);
        }
        return arrayList;
    }

    public final void g(l0 l0Var) {
        F f10 = l0Var.f18480c;
        String str = f10.mWho;
        HashMap map = this.f18497b;
        if (map.get(str) != null) {
            return;
        }
        map.put(f10.mWho, l0Var);
        if (f10.mRetainInstanceChangedWhileDetached) {
            if (f10.mRetainInstance) {
                this.f18499d.c(f10);
            } else {
                this.f18499d.g(f10);
            }
            f10.mRetainInstanceChangedWhileDetached = false;
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + f10);
        }
    }

    public final void h(l0 l0Var) {
        F f10 = l0Var.f18480c;
        if (f10.mRetainInstance) {
            this.f18499d.g(f10);
        }
        HashMap map = this.f18497b;
        if (map.get(f10.mWho) == l0Var && ((l0) map.put(f10.mWho, null)) != null && e0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + f10);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.f18498c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
