package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.d.m.a.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class Processor implements ForegroundProcessor {
    private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Map<String, WorkerWrapper> mForegroundWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();
    private Map<String, Set<StartStopToken>> mWorkRuns = new HashMap();

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
    }

    private WorkerWrapper cleanUpWorkerUnsafe(String str) {
        WorkerWrapper workerWrapperRemove = this.mForegroundWorkMap.remove(str);
        boolean z = workerWrapperRemove != null;
        if (!z) {
            workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
        }
        this.mWorkRuns.remove(str);
        if (z) {
            stopForegroundService();
        }
        return workerWrapperRemove;
    }

    private WorkerWrapper getWorkerWrapperUnsafe(String str) {
        WorkerWrapper workerWrapper = this.mForegroundWorkMap.get(str);
        return workerWrapper == null ? this.mEnqueuedWorkMap.get(str) : workerWrapper;
    }

    private static boolean interrupt(String str, WorkerWrapper workerWrapper, int i2) {
        if (workerWrapper == null) {
            Logger.get().debug(TAG, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
            return false;
        }
        workerWrapper.interrupt(i2);
        Logger.get().debug(TAG, "WorkerWrapper interrupted for " + str + " (" + workerWrapper.getWorkSpec().workerClassName + "), reason: " + i2);
        return true;
    }

    private void onExecuted(WorkerWrapper workerWrapper, boolean z) {
        WorkGenerationalId workGenerationalId;
        ArrayList arrayList;
        synchronized (this.mLock) {
            workGenerationalId = workerWrapper.getWorkGenerationalId();
            String workSpecId = workGenerationalId.getWorkSpecId();
            if (getWorkerWrapperUnsafe(workSpecId) == workerWrapper) {
                cleanUpWorkerUnsafe(workSpecId);
            }
            Logger.get().debug(TAG, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z);
            arrayList = new ArrayList(this.mOuterListeners);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ExecutionListener) arrayList.get(i2)).onExecuted(workGenerationalId, z);
        }
    }

    private void runOnExecuted(final WorkGenerationalId workGenerationalId, final boolean z) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m13465lambda$runOnExecuted$2$androidxworkimplProcessor(workGenerationalId, z);
            }
        });
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            if (this.mForegroundWorkMap.isEmpty()) {
                try {
                    this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                } catch (Throwable th) {
                    Logger.get().error(TAG, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.mForegroundLock;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.mForegroundLock = null;
                }
            }
        }
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public WorkSpec getRunningWorkSpec(String str) {
        synchronized (this.mLock) {
            WorkerWrapper workerWrapperUnsafe = getWorkerWrapperUnsafe(str);
            if (workerWrapperUnsafe == null) {
                return null;
            }
            return workerWrapperUnsafe.getWorkSpec();
        }
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.mLock) {
            z = true;
            if (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) {
                z = false;
            }
        }
        return z;
    }

    public boolean isCancelled(String str) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCancelledIds.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(String str) {
        boolean z;
        synchronized (this.mLock) {
            z = getWorkerWrapperUnsafe(str) != null;
        }
        return z;
    }

    /* renamed from: lambda$runOnExecuted$2$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ void m13465lambda$runOnExecuted$2$androidxworkimplProcessor(WorkGenerationalId workGenerationalId, boolean z) {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mOuterListeners);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ExecutionListener) arrayList.get(i2)).onExecuted(workGenerationalId, z);
        }
    }

    /* renamed from: lambda$startWork$0$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ WorkSpec m13466lambda$startWork$0$androidxworkimplProcessor(ArrayList arrayList, String str) {
        arrayList.addAll(this.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return this.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$startWork$1$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ void m13467lambda$startWork$1$androidxworkimplProcessor(bm bmVar, WorkerWrapper workerWrapper) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) bmVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        onExecuted(workerWrapper, zBooleanValue);
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            Logger.get().info(TAG, "Moving WorkSpec (" + str + ") to the foreground");
            WorkerWrapper workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
            if (workerWrapperRemove != null) {
                if (this.mForegroundLock == null) {
                    PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                    this.mForegroundLock = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.acquire();
                }
                this.mForegroundWorkMap.put(str, workerWrapperRemove);
                ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, workerWrapperRemove.getWorkGenerationalId(), foregroundInfo));
            }
        }
    }

    public boolean startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkGenerationalId id = startStopToken.getId();
        final String workSpecId = id.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m13466lambda$startWork$0$androidxworkimplProcessor(arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            Logger logger = Logger.get();
            String str = TAG;
            Objects.toString(id);
            logger.warning(str, "Didn't find WorkSpec for id ".concat(String.valueOf(id)));
            runOnExecuted(id, false);
            return false;
        }
        synchronized (this.mLock) {
            if (isEnqueued(workSpecId)) {
                Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                    set.add(startStopToken);
                    Logger.get().debug(TAG, "Work " + id + " is already enqueued for processing");
                } else {
                    runOnExecuted(id, false);
                }
            } else {
                if (workSpec.getGeneration() == id.getGeneration()) {
                    WorkerWrapper.Builder builder = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList);
                    builder.withRuntimeExtras(runtimeExtras);
                    final WorkerWrapper workerWrapperBuild = builder.build();
                    final bm<Boolean> bmVarLaunch = workerWrapperBuild.launch();
                    bmVarLaunch.addListener(new Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m13467lambda$startWork$1$androidxworkimplProcessor(bmVarLaunch, workerWrapperBuild);
                        }
                    }, this.mWorkTaskExecutor.getMainThreadExecutor());
                    this.mEnqueuedWorkMap.put(workSpecId, workerWrapperBuild);
                    HashSet hashSet = new HashSet();
                    hashSet.add(startStopToken);
                    this.mWorkRuns.put(workSpecId, hashSet);
                    Logger.get().debug(TAG, getClass().getSimpleName() + ": processing " + id);
                    return true;
                }
                runOnExecuted(id, false);
            }
            return false;
        }
    }

    public boolean stopAndCancelWork(String str, int i2) {
        WorkerWrapper workerWrapperCleanUpWorkerUnsafe;
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Processor cancelling " + str);
            this.mCancelledIds.add(str);
            workerWrapperCleanUpWorkerUnsafe = cleanUpWorkerUnsafe(str);
        }
        return interrupt(str, workerWrapperCleanUpWorkerUnsafe, i2);
    }

    public boolean stopForegroundWork(StartStopToken startStopToken, int i2) {
        WorkerWrapper workerWrapperCleanUpWorkerUnsafe;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            workerWrapperCleanUpWorkerUnsafe = cleanUpWorkerUnsafe(workSpecId);
        }
        return interrupt(workSpecId, workerWrapperCleanUpWorkerUnsafe, i2);
    }

    public boolean stopWork(StartStopToken startStopToken, int i2) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            if (this.mForegroundWorkMap.get(workSpecId) == null) {
                Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                if (set != null && set.contains(startStopToken)) {
                    return interrupt(workSpecId, cleanUpWorkerUnsafe(workSpecId), i2);
                }
                return false;
            }
            Logger.get().debug(TAG, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
            return false;
        }
    }

    public boolean startWork(StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }
}
