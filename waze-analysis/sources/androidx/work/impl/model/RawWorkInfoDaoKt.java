package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RawWorkInfoDaoKt {
    public static final k<List<WorkInfo>> getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, ab abVar, SupportSQLiteQuery supportSQLiteQuery) {
        x.f(rawWorkInfoDao, "<this>");
        x.f(abVar, "dispatcher");
        x.f(supportSQLiteQuery, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(supportSQLiteQuery), abVar);
    }
}
