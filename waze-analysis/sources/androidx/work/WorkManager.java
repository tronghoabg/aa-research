package androidx.work;

import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.d.m.a.bm;
import h.a.i;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class WorkManager {
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class UpdateResult {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ UpdateResult[] $VALUES;
        public static final UpdateResult NOT_APPLIED = new UpdateResult("NOT_APPLIED", 0);
        public static final UpdateResult APPLIED_IMMEDIATELY = new UpdateResult("APPLIED_IMMEDIATELY", 1);
        public static final UpdateResult APPLIED_FOR_NEXT_RUN = new UpdateResult("APPLIED_FOR_NEXT_RUN", 2);

        private static final /* synthetic */ UpdateResult[] $values() {
            return new UpdateResult[]{NOT_APPLIED, APPLIED_IMMEDIATELY, APPLIED_FOR_NEXT_RUN};
        }

        static {
            UpdateResult[] updateResultArr$values = $values();
            $VALUES = updateResultArr$values;
            $ENTRIES = b.a(updateResultArr$values);
        }

        private UpdateResult(String str, int i2) {
        }

        public static a<UpdateResult> getEntries() {
            return $ENTRIES;
        }

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) $VALUES.clone();
        }
    }

    public static WorkManager getInstance() {
        return Companion.getInstance();
    }

    public static void initialize(Context context, Configuration configuration) {
        Companion.initialize(context, configuration);
    }

    public static boolean isInitialized() {
        return Companion.isInitialized();
    }

    public final WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        x.f(str, "uniqueWorkName");
        x.f(existingWorkPolicy, "existingWorkPolicy");
        x.f(oneTimeWorkRequest, "request");
        return beginUniqueWork(str, existingWorkPolicy, i.d(oneTimeWorkRequest));
    }

    public abstract WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public final WorkContinuation beginWith(OneTimeWorkRequest oneTimeWorkRequest) {
        x.f(oneTimeWorkRequest, "request");
        return beginWith(i.d(oneTimeWorkRequest));
    }

    public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> list);

    public abstract Operation cancelAllWork();

    public abstract Operation cancelAllWorkByTag(String str);

    public abstract Operation cancelUniqueWork(String str);

    public abstract Operation cancelWorkById(UUID uuid);

    public abstract PendingIntent createCancelPendingIntent(UUID uuid);

    public final Operation enqueue(WorkRequest workRequest) {
        x.f(workRequest, "request");
        return enqueue(i.d(workRequest));
    }

    public abstract Operation enqueue(List<? extends WorkRequest> list);

    public abstract Operation enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    public Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        x.f(str, "uniqueWorkName");
        x.f(existingWorkPolicy, "existingWorkPolicy");
        x.f(oneTimeWorkRequest, "request");
        return enqueueUniqueWork(str, existingWorkPolicy, i.d(oneTimeWorkRequest));
    }

    public abstract Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public abstract Configuration getConfiguration();

    public abstract bm<Long> getLastCancelAllTimeMillis();

    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    public abstract bm<WorkInfo> getWorkInfoById(UUID uuid);

    public abstract k<WorkInfo> getWorkInfoByIdFlow(UUID uuid);

    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID uuid);

    public abstract bm<List<WorkInfo>> getWorkInfos(WorkQuery workQuery);

    public abstract bm<List<WorkInfo>> getWorkInfosByTag(String str);

    public abstract k<List<WorkInfo>> getWorkInfosByTagFlow(String str);

    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String str);

    public abstract k<List<WorkInfo>> getWorkInfosFlow(WorkQuery workQuery);

    public abstract bm<List<WorkInfo>> getWorkInfosForUniqueWork(String str);

    public abstract k<List<WorkInfo>> getWorkInfosForUniqueWorkFlow(String str);

    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String str);

    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery workQuery);

    public abstract Operation pruneWork();

    public abstract bm<UpdateResult> updateWork(WorkRequest workRequest);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public WorkManager getInstance() {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }

        public void initialize(Context context, Configuration configuration) {
            x.f(context, "context");
            x.f(configuration, "configuration");
            WorkManagerImpl.initialize(context, configuration);
        }

        public boolean isInitialized() {
            return WorkManagerImpl.isInitialized();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public WorkManager getInstance(Context context) {
            x.f(context, "context");
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
            x.e(workManagerImpl, "getInstance(...)");
            return workManagerImpl;
        }
    }

    public static WorkManager getInstance(Context context) {
        return Companion.getInstance(context);
    }
}
