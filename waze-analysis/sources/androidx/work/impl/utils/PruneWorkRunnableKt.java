package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import h.ab;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PruneWorkRunnableKt {
    public static final Operation pruneWork(final WorkDatabase workDatabase, Configuration configuration, TaskExecutor taskExecutor) {
        x.f(workDatabase, "<this>");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "executor");
        Tracer tracer = configuration.getTracer();
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return OperationKt.launchOperation(tracer, "PruneWork", serialTaskExecutor, new a() { // from class: androidx.work.impl.utils.PruneWorkRunnableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return PruneWorkRunnableKt.pruneWork$lambda$0(workDatabase);
            }
        });
    }

    static final ab pruneWork$lambda$0(WorkDatabase workDatabase) {
        workDatabase.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
        return ab.f48028a;
    }
}
