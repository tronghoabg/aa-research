package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.d.m.a.bm;
import h.g.a.a;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WorkForegroundUpdater implements ForegroundUpdater {
    private static final String TAG = Logger.tagWithPrefix("WMFgUpdater");
    final ForegroundProcessor mForegroundProcessor;
    private final TaskExecutor mTaskExecutor;
    final WorkSpecDao mWorkSpecDao;

    public WorkForegroundUpdater(WorkDatabase workDatabase, ForegroundProcessor foregroundProcessor, TaskExecutor taskExecutor) {
        this.mForegroundProcessor = foregroundProcessor;
        this.mTaskExecutor = taskExecutor;
        this.mWorkSpecDao = workDatabase.workSpecDao();
    }

    /* renamed from: lambda$setForegroundAsync$0$androidx-work-impl-utils-WorkForegroundUpdater, reason: not valid java name */
    /* synthetic */ Void m13475xc9facc48(UUID uuid, ForegroundInfo foregroundInfo, Context context) {
        WorkSpecDao workSpecDao = this.mWorkSpecDao;
        String string = uuid.toString();
        WorkSpec workSpec = workSpecDao.getWorkSpec(string);
        if (workSpec == null || workSpec.state.isFinished()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        this.mForegroundProcessor.startForeground(string, foregroundInfo);
        context.startService(SystemForegroundDispatcher.createNotifyIntent(context, WorkSpecKt.generationalId(workSpec), foregroundInfo));
        return null;
    }

    @Override // androidx.work.ForegroundUpdater
    public bm<Void> setForegroundAsync(final Context context, final UUID uuid, final ForegroundInfo foregroundInfo) {
        return ListenableFutureKt.executeAsync(this.mTaskExecutor.getSerialTaskExecutor(), "setForegroundAsync", new a() { // from class: androidx.work.impl.utils.WorkForegroundUpdater$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.m13475xc9facc48(uuid, foregroundInfo, context);
            }
        });
    }
}
