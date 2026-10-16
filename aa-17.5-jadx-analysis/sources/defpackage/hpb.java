package defpackage;

import android.os.Bundle;
import android.service.personalcontext.insight.ContextInsight;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hpb extends hnk {
    @Override // defpackage.hnk
    public final hnl a(Bundle bundle, List list) {
        Object next;
        int[] intArray = bundle.getIntArray("spans");
        intArray.getClass();
        List<aezu> listCi = woy.ci(list, woy.dd(intArray));
        ArrayList arrayList = new ArrayList(woy.bp(listCi, 10));
        for (aezu aezuVar : listCi) {
            ContextInsight contextInsight = (ContextInsight) aezuVar.a;
            int iIntValue = ((Number) aezuVar.b).intValue();
            contextInsight.getClass();
            afao afaoVar = new afao((afar) hqc.e);
            while (true) {
                if (!afaoVar.hasNext()) {
                    next = null;
                    break;
                }
                next = afaoVar.next();
                if (((hqc) next).f == iIntValue) {
                    break;
                }
            }
            hqc hqcVar = (hqc) next;
            hqcVar.getClass();
            arrayList.add(new hqd(contextInsight, hqcVar));
        }
        return new hpc(arrayList);
    }
}
