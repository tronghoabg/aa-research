package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes2.dex */
final class bq implements bo {
    final /* synthetic */ bt a;

    public bq(bt btVar) {
        this.a = btVar;
    }

    @Override // defpackage.bo
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zAg;
        int i;
        bt btVar = this.a;
        if (bt.ac(2)) {
            ArrayList arrayList5 = btVar.a;
            Objects.toString(arrayList5);
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList5.toString()));
        }
        int i2 = 0;
        if (btVar.c.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAg = false;
        } else {
            btVar.e = (w) btVar.c.get(r7.size() - 1);
            ArrayList arrayList6 = btVar.e.e;
            int size = arrayList6.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = ((cb) arrayList6.get(i3)).b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAg = btVar.ag(arrayList3, arrayList4, null, -1, 0);
        }
        if (!btVar.j.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(bt.ai((w) arrayList3.get(i4)));
            }
            ArrayList arrayList7 = btVar.j;
            int size3 = arrayList7.size();
            while (i2 < size3) {
                glf glfVar = (glf) arrayList7.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        glfVar.e((Fragment) it.next(), zBooleanValue);
                    }
                }
                i2 = i;
            }
        }
        return zAg;
    }
}
