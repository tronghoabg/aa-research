package android.support.v4.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bt implements br {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f191a;

    bt(bv bvVar) {
        this.f191a = bvVar;
    }

    @Override // android.support.v4.app.br
    public final boolean k(ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        bv bvVar = this.f191a;
        boolean zAR = bvVar.aR(arrayList, arrayList2);
        if (!bvVar.f198d.isEmpty() && arrayList.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                linkedHashSet.addAll(bv.aW((a) arrayList.get(i4)));
            }
            ArrayList arrayList3 = bvVar.f198d;
            int size2 = arrayList3.size();
            while (i3 < size2) {
                bq bqVar = (bq) arrayList3.get(i3);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i2 = i3 + 1;
                    if (it.hasNext()) {
                        bqVar.onBackStackChangeStarted((ar) it.next(), zBooleanValue);
                    }
                }
                i3 = i2;
            }
        }
        return zAR;
    }
}
