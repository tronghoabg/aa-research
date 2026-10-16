package androidx.work.impl.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WorkTagDao {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.model.WorkTagDao$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$insertTags(WorkTagDao workTagDao, String str, Set set) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(set, "tags");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                workTagDao.insert(new WorkTag((String) it.next(), str));
            }
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void insertTags(WorkTagDao workTagDao, String str, Set<String> set) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(set, "tags");
            CC.$default$insertTags(workTagDao, str, set);
        }
    }

    void deleteByWorkSpecId(String str);

    List<String> getTagsForWorkSpecId(String str);

    List<String> getWorkSpecIdsWithTag(String str);

    void insert(WorkTag workTag);

    void insertTags(String str, Set<String> set);
}
