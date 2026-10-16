package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import h.g.b.x;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class IdGenerator {
    private final WorkDatabase workDatabase;

    public IdGenerator(WorkDatabase workDatabase) {
        x.f(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    static final Integer nextJobSchedulerIdWithRange$lambda$0(IdGenerator idGenerator, int i2, int i3) {
        int iNextId = IdGeneratorKt.nextId(idGenerator.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        if (i2 > iNextId || iNextId > i3) {
            IdGeneratorKt.updatePreference(idGenerator.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, i2 + 1);
        } else {
            i2 = iNextId;
        }
        return Integer.valueOf(i2);
    }

    public final int nextAlarmManagerId() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(IdGeneratorKt.nextId(this.f$0.workDatabase, IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY));
            }
        });
        x.e(objRunInTransaction, "runInTransaction(...)");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int nextJobSchedulerIdWithRange(final int i2, final int i3) {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.nextJobSchedulerIdWithRange$lambda$0(this.f$0, i2, i3);
            }
        });
        x.e(objRunInTransaction, "runInTransaction(...)");
        return ((Number) objRunInTransaction).intValue();
    }
}
