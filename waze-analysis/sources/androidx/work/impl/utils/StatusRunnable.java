package androidx.work.impl.utils;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.d.m.a.bm;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class StatusRunnable {
    public static final bm<List<WorkInfo>> forStringIds(WorkDatabase workDatabase, TaskExecutor taskExecutor, final List<String> list) {
        x.f(workDatabase, "<this>");
        x.f(taskExecutor, "executor");
        x.f(list, "ids");
        return loadStatusFuture(workDatabase, taskExecutor, new l() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StatusRunnable.forStringIds$lambda$0(list, (WorkDatabase) obj);
            }
        });
    }

    static final List forStringIds$lambda$0(List list, WorkDatabase workDatabase) {
        x.f(workDatabase, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForIds(list));
        x.e(listApply, "apply(...)");
        return listApply;
    }

    public static final bm<List<WorkInfo>> forTag(WorkDatabase workDatabase, TaskExecutor taskExecutor, final String str) {
        x.f(workDatabase, "<this>");
        x.f(taskExecutor, "executor");
        x.f(str, "tag");
        return loadStatusFuture(workDatabase, taskExecutor, new l() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StatusRunnable.forTag$lambda$0(str, (WorkDatabase) obj);
            }
        });
    }

    static final List forTag$lambda$0(String str, WorkDatabase workDatabase) {
        x.f(workDatabase, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForTag(str));
        x.e(listApply, "apply(...)");
        return listApply;
    }

    public static final bm<WorkInfo> forUUID(WorkDatabase workDatabase, TaskExecutor taskExecutor, final UUID uuid) {
        x.f(workDatabase, "<this>");
        x.f(taskExecutor, "executor");
        x.f(uuid, TtmlNode.ATTR_ID);
        return loadStatusFuture(workDatabase, taskExecutor, new l() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StatusRunnable.forUUID$lambda$0(uuid, (WorkDatabase) obj);
            }
        });
    }

    static final WorkInfo forUUID$lambda$0(UUID uuid, WorkDatabase workDatabase) {
        x.f(workDatabase, "db");
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        String string = uuid.toString();
        x.e(string, "toString(...)");
        WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
        if (workStatusPojoForId != null) {
            return workStatusPojoForId.toWorkInfo();
        }
        return null;
    }

    public static final bm<List<WorkInfo>> forUniqueWork(WorkDatabase workDatabase, TaskExecutor taskExecutor, final String str) {
        x.f(workDatabase, "<this>");
        x.f(taskExecutor, "executor");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return loadStatusFuture(workDatabase, taskExecutor, new l() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StatusRunnable.forUniqueWork$lambda$0(str, (WorkDatabase) obj);
            }
        });
    }

    static final List forUniqueWork$lambda$0(String str, WorkDatabase workDatabase) {
        x.f(workDatabase, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForName(str));
        x.e(listApply, "apply(...)");
        return listApply;
    }

    public static final bm<List<WorkInfo>> forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor taskExecutor, final WorkQuery workQuery) {
        x.f(workDatabase, "<this>");
        x.f(taskExecutor, "executor");
        x.f(workQuery, "querySpec");
        return loadStatusFuture(workDatabase, taskExecutor, new l() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StatusRunnable.forWorkQuerySpec$lambda$0(workQuery, (WorkDatabase) obj);
            }
        });
    }

    static final List forWorkQuerySpec$lambda$0(WorkQuery workQuery, WorkDatabase workDatabase) {
        x.f(workDatabase, "db");
        List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(workQuery)));
        x.e(listApply, "apply(...)");
        return listApply;
    }

    private static final <T> bm<T> loadStatusFuture(final WorkDatabase workDatabase, TaskExecutor taskExecutor, final l<? super WorkDatabase, ? extends T> lVar) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new a() { // from class: androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return lVar.invoke(workDatabase);
            }
        });
    }
}
