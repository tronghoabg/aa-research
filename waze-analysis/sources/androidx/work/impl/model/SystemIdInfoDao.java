package androidx.work.impl.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SystemIdInfoDao {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.model.SystemIdInfoDao$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static SystemIdInfo $default$getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            x.f(workGenerationalId, TtmlNode.ATTR_ID);
            return systemIdInfoDao.getSystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration());
        }

        public static void $default$removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            x.f(workGenerationalId, TtmlNode.ATTR_ID);
            systemIdInfoDao.removeSystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration());
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            x.f(workGenerationalId, TtmlNode.ATTR_ID);
            return CC.$default$getSystemIdInfo(systemIdInfoDao, workGenerationalId);
        }

        @Deprecated
        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            x.f(workGenerationalId, TtmlNode.ATTR_ID);
            CC.$default$removeSystemIdInfo(systemIdInfoDao, workGenerationalId);
        }
    }

    SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId);

    SystemIdInfo getSystemIdInfo(String str, int i2);

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(WorkGenerationalId workGenerationalId);

    void removeSystemIdInfo(String str);

    void removeSystemIdInfo(String str, int i2);
}
