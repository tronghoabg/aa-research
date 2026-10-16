package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import com.google.d.m.a.bm;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class RemoteWorkManager {
    public static final long DEFAULT_SESSION_TIMEOUT_MILLIS = 600000;
    public static final long MAX_SESSION_TIMEOUT_MILLIS = 1200000;

    protected RemoteWorkManager() {
    }

    public static RemoteWorkManager getInstance(Context context) {
        RemoteWorkManager remoteWorkManager = WorkManagerImpl.getInstance(context).getRemoteWorkManager();
        if (remoteWorkManager != null) {
            return remoteWorkManager;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    public final RemoteWorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public final RemoteWorkContinuation beginWith(OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation beginWith(List<OneTimeWorkRequest> list);

    public abstract bm<Void> cancelAllWork();

    public abstract bm<Void> cancelAllWorkByTag(String str);

    public abstract bm<Void> cancelUniqueWork(String str);

    public abstract bm<Void> cancelWorkById(UUID uuid);

    public abstract bm<Void> enqueue(WorkContinuation workContinuation);

    public abstract bm<Void> enqueue(WorkRequest workRequest);

    public abstract bm<Void> enqueue(List<WorkRequest> list);

    public abstract bm<Void> enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    public final bm<Void> enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract bm<Void> enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public abstract bm<List<WorkInfo>> getWorkInfos(WorkQuery workQuery);

    public abstract bm<Void> setForegroundAsync(String str, ForegroundInfo foregroundInfo);

    public abstract bm<Void> setProgress(UUID uuid, Data data);
}
