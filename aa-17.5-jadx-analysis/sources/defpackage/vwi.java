package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vwi {
    public vwi(wci wciVar, Executor executor, ackk ackkVar, aezk aezkVar) {
        wciVar.d(executor, ackkVar, aezkVar);
    }

    public static yfq a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new uzr(7));
            int i = yfq.d;
            return (yfq) map.collect(ycm.a);
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((vpi) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new uzr(7));
            int i2 = yfq.d;
            return (yfq) map2.collect(ycm.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = yfq.d;
        yfl yflVar = new yfl(4);
        int size = arrayList.size();
        long jA2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            vpi vpiVar = (vpi) arrayList.get(i5);
            i4++;
            jA2 += vpiVar.a();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            yflVar.i(vpiVar.b());
        }
        return yflVar.g();
    }
}
