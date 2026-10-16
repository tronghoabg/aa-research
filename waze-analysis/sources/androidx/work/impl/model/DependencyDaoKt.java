package androidx.work.impl.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.i;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DependencyDaoKt {
    public static final List<String> getAllDependentWork(DependencyDao dependencyDao, String str) {
        x.f(dependencyDao, "<this>");
        x.f(str, TtmlNode.ATTR_ID);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listAq = i.aq(dependencyDao.getDependentWorkIds(str));
        while (!listAq.isEmpty()) {
            String str2 = (String) i.w(listAq);
            linkedHashSet.add(str2);
            listAq.addAll(dependencyDao.getDependentWorkIds(str2));
        }
        return i.ao(linkedHashSet);
    }
}
