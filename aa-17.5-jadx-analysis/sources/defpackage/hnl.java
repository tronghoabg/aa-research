package defpackage;

import android.service.personalcontext.insight.ContextInsight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hnl extends hnj {
    public hnl(hnm hnmVar) {
        super(hnmVar);
    }

    @Override // defpackage.hnj
    public final Collection a() {
        Iterable originHints;
        List listB = b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            ContextInsight contextInsight = ((hqe) it.next()).a;
            if (contextInsight == null || (originHints = contextInsight.getOriginHints()) == null) {
                originHints = afbg.a;
            }
            woy.cq(arrayList, originHints);
        }
        return woy.cl(arrayList);
    }

    public abstract List b();
}
