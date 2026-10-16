package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ce {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f241a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f242b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f243c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private by f244d;

    ce() {
    }

    final void A(by byVar) {
        this.f244d = byVar;
    }

    final boolean B(String str) {
        return this.f242b.get(str) != null;
    }

    final int a(ar arVar) {
        View view;
        View view2;
        ViewGroup viewGroup = arVar.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = this.f241a;
        int iIndexOf = arrayList.indexOf(arVar);
        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
            ar arVar2 = (ar) arrayList.get(i2);
            if (arVar2.mContainer == viewGroup && (view2 = arVar2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return -1;
            }
            ar arVar3 = (ar) arrayList.get(iIndexOf);
            if (arVar3.mContainer == viewGroup && (view = arVar3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    final Bundle b(String str) {
        return (Bundle) this.f243c.get(str);
    }

    final Bundle c(String str, Bundle bundle) {
        HashMap map = this.f243c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    final ar d(String str) {
        cd cdVar = (cd) this.f242b.get(str);
        if (cdVar != null) {
            return cdVar.c();
        }
        return null;
    }

    final ar e(int i2) {
        ArrayList arrayList = this.f241a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (cd cdVar : this.f242b.values()) {
                    if (cdVar != null) {
                        ar arVarC = cdVar.c();
                        if (arVarC.mFragmentId == i2) {
                            return arVarC;
                        }
                    }
                }
                return null;
            }
            ar arVar = (ar) arrayList.get(size);
            if (arVar != null && arVar.mFragmentId == i2) {
                return arVar;
            }
        }
    }

    final ar f(String str) {
        if (str != null) {
            ArrayList arrayList = this.f241a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ar arVar = (ar) arrayList.get(size);
                if (arVar != null && str.equals(arVar.mTag)) {
                    return arVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (cd cdVar : this.f242b.values()) {
            if (cdVar != null) {
                ar arVarC = cdVar.c();
                if (str.equals(arVarC.mTag)) {
                    return arVarC;
                }
            }
        }
        return null;
    }

    final ar g(String str) {
        ar arVarFindFragmentByWho;
        for (cd cdVar : this.f242b.values()) {
            if (cdVar != null && (arVarFindFragmentByWho = cdVar.c().findFragmentByWho(str)) != null) {
                return arVarFindFragmentByWho;
            }
        }
        return null;
    }

    final by h() {
        return this.f244d;
    }

    final cd i(String str) {
        return (cd) this.f242b.get(str);
    }

    final ArrayList j() {
        HashMap map = this.f242b;
        ArrayList arrayList = new ArrayList(map.size());
        for (cd cdVar : map.values()) {
            if (cdVar != null) {
                ar arVarC = cdVar.c();
                c(arVarC.mWho, cdVar.a());
                arrayList.add(arVarC.mWho);
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "Saved state of " + arVarC + ": " + arVarC.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    final ArrayList k() {
        ArrayList arrayList = this.f241a;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ar arVar = (ar) it.next();
                arrayList2.add(arVar.mWho);
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + arVar.mWho + "): " + arVar);
                }
            }
            return arrayList2;
        }
    }

    final HashMap l() {
        return this.f243c;
    }

    final List m() {
        ArrayList arrayList = new ArrayList();
        for (cd cdVar : this.f242b.values()) {
            if (cdVar != null) {
                arrayList.add(cdVar);
            }
        }
        return arrayList;
    }

    final List n() {
        ArrayList arrayList = new ArrayList();
        for (cd cdVar : this.f242b.values()) {
            if (cdVar != null) {
                arrayList.add(cdVar.c());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List o() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f241a;
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void p(ar arVar) {
        ArrayList arrayList = this.f241a;
        if (arrayList.contains(arVar)) {
            Objects.toString(arVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(arVar)));
        }
        synchronized (arrayList) {
            arrayList.add(arVar);
        }
        arVar.mAdded = true;
    }

    final void q() {
        this.f242b.values().removeAll(Collections.singleton(null));
    }

    final void r(int i2) {
        for (cd cdVar : this.f242b.values()) {
            if (cdVar != null) {
                cdVar.j(i2);
            }
        }
    }

    final void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        HashMap map = this.f242b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (cd cdVar : map.values()) {
                printWriter.print(str);
                if (cdVar != null) {
                    String strValueOf = String.valueOf(str);
                    ar arVarC = cdVar.c();
                    printWriter.println(arVarC);
                    arVarC.dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.f241a;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                ar arVar = (ar) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(arVar.toString());
            }
        }
    }

    final void t(cd cdVar) {
        ar arVarC = cdVar.c();
        if (B(arVarC.mWho)) {
            return;
        }
        this.f242b.put(arVarC.mWho, cdVar);
        if (arVarC.mRetainInstanceChangedWhileDetached) {
            boolean z = arVarC.mRetainInstance;
            by byVar = this.f244d;
            if (z) {
                byVar.f(arVarC);
            } else {
                byVar.i(arVarC);
            }
            arVarC.mRetainInstanceChangedWhileDetached = false;
        }
        if (bv.aM(2)) {
            Objects.toString(arVarC);
            Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(arVarC)));
        }
    }

    final void u(cd cdVar) {
        ar arVarC = cdVar.c();
        if (arVarC.mRetainInstance) {
            this.f244d.i(arVarC);
        }
        HashMap map = this.f242b;
        if (map.get(arVarC.mWho) == cdVar && ((cd) map.put(arVarC.mWho, null)) != null && bv.aM(2)) {
            Objects.toString(arVarC);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(arVarC)));
        }
    }

    final void v() {
        ArrayList arrayList = this.f241a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cd cdVar = (cd) this.f242b.get(((ar) arrayList.get(i2)).mWho);
            if (cdVar != null) {
                cdVar.g();
            }
        }
        for (cd cdVar2 : this.f242b.values()) {
            if (cdVar2 != null) {
                cdVar2.g();
                ar arVarC = cdVar2.c();
                if (arVarC.mRemoving && !arVarC.isInBackStack()) {
                    if (arVarC.mBeingSaved && !this.f243c.containsKey(arVarC.mWho)) {
                        c(arVarC.mWho, cdVar2.a());
                    }
                    u(cdVar2);
                }
            }
        }
    }

    final void w(ar arVar) {
        ArrayList arrayList = this.f241a;
        synchronized (arrayList) {
            arrayList.remove(arVar);
        }
        arVar.mAdded = false;
    }

    final void x() {
        this.f242b.clear();
    }

    final void y(List list) {
        this.f241a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ar arVarD = d(str);
                if (arVarD == null) {
                    throw new IllegalStateException(k.g(str, "No instantiated fragment for (", ")"));
                }
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + arVarD);
                }
                p(arVarD);
            }
        }
    }

    final void z(HashMap map) {
        HashMap map2 = this.f243c;
        map2.clear();
        map2.putAll(map);
    }
}
