package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class hzk implements hzh {
    private final List a;
    private final dzk b;

    public hzk(List list, dzk dzkVar) {
        this.a = list;
        this.b = dzkVar;
    }

    @Override // defpackage.hzh
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((hzh) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [hui] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.hzh
    public final ncp b(Object obj, int i, int i2, hum humVar) {
        ncp ncpVarB;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r5 = 0;
        while (i3 < size) {
            hzh hzhVar = (hzh) list.get(i3);
            if (hzhVar.a(obj) && (ncpVarB = hzhVar.b(obj, i, i2, humVar)) != null) {
                arrayList.add(ncpVarB.a);
                r5 = ncpVarB.c;
            }
            i3++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new ncp((hui) r5, new hzj(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
