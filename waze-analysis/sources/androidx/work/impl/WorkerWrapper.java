package androidx.work.impl;

import android.content.Context;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ExecutionEventListener;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.ScheduleEventListener;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDaoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDaoKt;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ListenerEventDispatchKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.am;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.s;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkerWrapper {
    private final Context appContext;
    private final ListenableWorker builderWorker;
    private final Clock clock;
    private final Configuration configuration;
    private final DependencyDao dependencyDao;
    private List<String> failedDependents;
    private final ForegroundProcessor foregroundProcessor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private boolean startedWork;
    private final List<String> tags;
    private List<String> unblockedDependents;
    private final WorkDatabase workDatabase;
    private final String workDescription;
    private final WorkSpec workSpec;
    private final WorkSpecDao workSpecDao;
    private final String workSpecId;
    private final TaskExecutor workTaskExecutor;
    private final s workerJob;

    /* compiled from: WazeSource */
    public final class Builder {
        private final Context appContext;
        private final Configuration configuration;
        private final ForegroundProcessor foregroundProcessor;
        private WorkerParameters.RuntimeExtras runtimeExtras;
        private final List<String> tags;
        private final WorkDatabase workDatabase;
        private final WorkSpec workSpec;
        private final TaskExecutor workTaskExecutor;
        private ListenableWorker worker;

        public Builder(Context context, Configuration configuration, TaskExecutor taskExecutor, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List<String> list) {
            x.f(context, "context");
            x.f(configuration, "configuration");
            x.f(taskExecutor, "workTaskExecutor");
            x.f(foregroundProcessor, "foregroundProcessor");
            x.f(workDatabase, "workDatabase");
            x.f(workSpec, "workSpec");
            x.f(list, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = taskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = list;
            Context applicationContext = context.getApplicationContext();
            x.e(applicationContext, "getApplicationContext(...)");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.RuntimeExtras();
        }

        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final ForegroundProcessor getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        public final WorkerParameters.RuntimeExtras getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final TaskExecutor getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        public final ListenableWorker getWorker() {
            return this.worker;
        }

        public final void setRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            x.f(runtimeExtras, "<set-?>");
            this.runtimeExtras = runtimeExtras;
        }

        public final void setWorker(ListenableWorker listenableWorker) {
            this.worker = listenableWorker;
        }

        public final Builder withRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }

        public final Builder withWorker(ListenableWorker listenableWorker) {
            x.f(listenableWorker, "worker");
            this.worker = listenableWorker;
            return this;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.WorkerWrapper$launch$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super Boolean>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        static final void invokeSuspend$lambda$1(Resolution resolution, am amVar, WorkerWrapper workerWrapper, ExecutionEventListener executionEventListener) {
            if (resolution instanceof Resolution.Finished) {
                Resolution.Finished finished = (Resolution.Finished) resolution;
                amVar.f48101a = workerWrapper.onWorkFinished(finished.getResult());
                if (executionEventListener != null) {
                    TaskExecutor taskExecutor = workerWrapper.workTaskExecutor;
                    ListenableWorker.Result result = finished.getResult();
                    WorkInfo workInfo = WorkSpecDaoKt.getWorkInfo(workerWrapper.workSpecDao, workerWrapper.workSpecId);
                    x.c(workInfo);
                    ListenerEventDispatchKt.dispatchEvent(executionEventListener, taskExecutor, result, workInfo, WorkerWrapper$launch$1$1$1.INSTANCE);
                }
            } else {
                boolean zResetWorkerStatus = false;
                if (resolution instanceof Resolution.Failed) {
                    WorkerWrapper.access$onWorkFailed(workerWrapper, new ListenableWorker.Result.Failure());
                    amVar.f48101a = false;
                    if (executionEventListener != null) {
                        TaskExecutor taskExecutor2 = workerWrapper.workTaskExecutor;
                        Throwable throwable = ((Resolution.Failed) resolution).getThrowable();
                        WorkInfo workInfo2 = WorkSpecDaoKt.getWorkInfo(workerWrapper.workSpecDao, workerWrapper.workSpecId);
                        x.c(workInfo2);
                        ListenerEventDispatchKt.dispatchEvent(executionEventListener, taskExecutor2, throwable, workInfo2, WorkerWrapper$launch$1$1$2.INSTANCE);
                    }
                } else if (resolution instanceof Resolution.Stopped) {
                    Resolution.Stopped stopped = (Resolution.Stopped) resolution;
                    amVar.f48101a = workerWrapper.resetWorkerStatus(stopped.getReason());
                    if (executionEventListener != null) {
                        TaskExecutor taskExecutor3 = workerWrapper.workTaskExecutor;
                        Integer numValueOf = Integer.valueOf(stopped.getReason());
                        WorkInfo workInfo3 = WorkSpecDaoKt.getWorkInfo(workerWrapper.workSpecDao, workerWrapper.workSpecId);
                        x.c(workInfo3);
                        ListenerEventDispatchKt.dispatchEvent(executionEventListener, taskExecutor3, numValueOf, workInfo3, WorkerWrapper$launch$1$1$3.INSTANCE);
                    }
                } else {
                    if (!(resolution instanceof Resolution.WorkerWrapperFailure)) {
                        throw new i();
                    }
                    if (((Resolution.WorkerWrapperFailure) resolution).getRecoverable()) {
                        zResetWorkerStatus = workerWrapper.resetWorkerStatus(-256);
                    } else {
                        WorkerWrapper.access$onWorkFailed(workerWrapper, new ListenableWorker.Result.Failure());
                    }
                    amVar.f48101a = zResetWorkerStatus;
                }
            }
            ScheduleEventListener scheduleEventListener = workerWrapper.configuration.getScheduleEventListener();
            if (scheduleEventListener != null) {
                ListenerEventDispatchKt.dispatchEvents(scheduleEventListener, workerWrapper.workTaskExecutor, WorkSpecDaoKt.getWorkInfos(workerWrapper.workSpecDao, workerWrapper.unblockedDependents), WorkerWrapper$launch$1$1$4.INSTANCE);
            }
            if (scheduleEventListener != null) {
                ListenerEventDispatchKt.dispatchEvents(scheduleEventListener, workerWrapper.workTaskExecutor, WorkSpecDaoKt.getWorkInfos(workerWrapper.workSpecDao, workerWrapper.failedDependents), WorkerWrapper$launch$1$1$5.INSTANCE);
            }
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return WorkerWrapper.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Boolean> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            final Resolution.WorkerWrapperFailure workerWrapperFailure;
            a aVar = a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    obj = aj.v(WorkerWrapper.this.workerJob, new WorkerWrapper$launch$1$resolution$1(WorkerWrapper.this, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                workerWrapperFailure = (Resolution) obj;
            } catch (WorkerStoppedException e2) {
                workerWrapperFailure = new Resolution.Stopped(e2.getReason());
            } catch (CancellationException e3) {
                workerWrapperFailure = new Resolution.Failed(e3);
            } catch (Throwable th) {
                Logger.get().error(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                workerWrapperFailure = new Resolution.WorkerWrapperFailure(false);
            }
            final ExecutionEventListener executionEventListener = WorkerWrapper.this.startedWork ? WorkerWrapper.this.configuration.getExecutionEventListener() : null;
            final am amVar = new am();
            final WorkerWrapper workerWrapper = WorkerWrapper.this;
            workerWrapper.workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.WorkerWrapper$launch$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    WorkerWrapper.AnonymousClass1.invokeSuspend$lambda$1(workerWrapperFailure, amVar, workerWrapper, executionEventListener);
                }
            });
            return Boolean.valueOf(amVar.f48101a);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.WorkerWrapper$runWorker$1, reason: invalid class name and case insensitive filesystem */
    final class C04811 extends h.c.b.a.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04811(e<? super C04811> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkerWrapper.this.runWorker(this);
        }
    }

    public WorkerWrapper(Builder builder) {
        x.f(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.tags = tags;
        this.workDescription = createWorkDescription(tags);
        this.workerJob = o.i();
        this.unblockedDependents = new ArrayList();
        this.failedDependents = new ArrayList();
    }

    public static final /* synthetic */ boolean access$onWorkFailed(WorkerWrapper workerWrapper, ListenableWorker.Result result) {
        workerWrapper.onWorkFailed(result);
        return false;
    }

    private final String createWorkDescription(List<String> list) throws IOException {
        return "Work [ id=" + this.workSpecId + ", class=" + this.workSpec.workerClassName + ", tags={ " + h.a.i.aM(list, ",", null, null, 0, null, 62) + " } ]";
    }

    private final boolean handleResult(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            String strValueOf = String.valueOf(this.workDescription);
            Logger.get().info(WorkerWrapperKt.TAG, "Worker result SUCCESS for ".concat(strValueOf));
            if (this.workSpec.isPeriodic()) {
                resetPeriodic();
                return false;
            }
            setSucceeded(result);
            return false;
        }
        boolean z = result instanceof ListenableWorker.Result.Retry;
        String str = this.workDescription;
        if (z) {
            String strValueOf2 = String.valueOf(str);
            Logger.get().info(WorkerWrapperKt.TAG, "Worker result RETRY for ".concat(strValueOf2));
            reschedule(-256);
            return true;
        }
        String strValueOf3 = String.valueOf(str);
        Logger.get().info(WorkerWrapperKt.TAG, "Worker result FAILURE for ".concat(strValueOf3));
        if (this.workSpec.isPeriodic()) {
            resetPeriodic();
            return false;
        }
        if (result == null) {
            result = new ListenableWorker.Result.Failure();
        }
        setFailed(result);
        return false;
    }

    private final void iterativelyFailWorkAndDependents(String str) {
        List<String> listL = h.a.i.l(str);
        listL.addAll(DependencyDaoKt.getAllDependentWork(this.dependencyDao, str));
        for (String str2 : listL) {
            if (this.workSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str2);
                if (!x.n(str2, str)) {
                    this.failedDependents.add(str2);
                }
            }
        }
    }

    private final boolean onWorkFailed(ListenableWorker.Result result) {
        String strValueOf = String.valueOf(this.workDescription);
        Logger.get().info(WorkerWrapperKt.TAG, "Worker result FAILURE for ".concat(strValueOf));
        if (this.workSpec.isPeriodic()) {
            resetPeriodic();
            return false;
        }
        setFailed(result);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onWorkFinished(ListenableWorker.Result result) {
        WorkDatabase workDatabase = this.workDatabase;
        WorkSpecDao workSpecDao = this.workSpecDao;
        String str = this.workSpecId;
        WorkInfo.State state = workSpecDao.getState(str);
        workDatabase.workProgressDao().delete(str);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(result);
        }
        if (state.isFinished()) {
            return false;
        }
        reschedule(WorkInfo.STOP_REASON_UNKNOWN);
        return true;
    }

    private final boolean reschedule(int i2) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        this.workSpecDao.setStopReason(this.workSpecId, i2);
        return true;
    }

    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resetWorkerStatus(int i2) {
        if (x.n(this.workSpec.getBackOffOnSystemInterruptions(), true)) {
            WorkSpec workSpec = this.workSpec;
            String str = WorkerWrapperKt.TAG;
            Logger.get().debug(str, "Worker " + workSpec.workerClassName + " was interrupted. Backing off.");
            reschedule(i2);
            return true;
        }
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            String str2 = this.workSpecId;
            String str3 = WorkerWrapperKt.TAG;
            Logger.get().debug(str3, "Status for " + str2 + " is " + state + " ; not doing any work");
            return false;
        }
        String str4 = this.workSpecId;
        String str5 = WorkerWrapperKt.TAG;
        Logger.get().debug(str5, "Status for " + str4 + " is " + state + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, i2);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(h.c.e<? super androidx.work.impl.WorkerWrapper.Resolution> r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.runWorker(h.c.e):java.lang.Object");
    }

    static final Boolean runWorker$lambda$0(WorkerWrapper workerWrapper) {
        if (workerWrapper.workSpec.state != WorkInfo.State.ENQUEUED) {
            Logger.get().debug(WorkerWrapperKt.TAG, String.valueOf(workerWrapper.workSpec.workerClassName).concat(" is not in ENQUEUED state. Nothing more to do"));
            return true;
        }
        if ((!workerWrapper.workSpec.isPeriodic() && !workerWrapper.workSpec.isBackedOff()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.calculateNextRunTime()) {
            return false;
        }
        Logger.get().debug(WorkerWrapperKt.TAG, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
        return true;
    }

    static final ab runWorker$lambda$3(ListenableWorker listenableWorker, boolean z, String str, WorkerWrapper workerWrapper, Throwable th) {
        if (th instanceof WorkerStoppedException) {
            listenableWorker.stop(((WorkerStoppedException) th).getReason());
        }
        if (z && str != null) {
            workerWrapper.configuration.getTracer().endAsyncSection(str, workerWrapper.workSpec.hashCode());
        }
        return ab.f48028a;
    }

    private final boolean setSucceeded(ListenableWorker.Result result) {
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        x.d(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data outputData = ((ListenableWorker.Result.Success) result).getOutputData();
        x.e(outputData, "getOutputData(...)");
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        DependencyDao dependencyDao = this.dependencyDao;
        String str = this.workSpecId;
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str2 : dependencyDao.getDependentWorkIds(str)) {
            if (this.workSpecDao.getState(str2) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(str2)) {
                String strValueOf = String.valueOf(str2);
                Logger.get().info(WorkerWrapperKt.TAG, "Setting status to enqueued for ".concat(strValueOf));
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, str2);
                this.workSpecDao.setLastEnqueueTime(str2, jCurrentTimeMillis);
                this.unblockedDependents.add(str2);
            }
        }
        return false;
    }

    private final boolean trySetRunning() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper.trySetRunning$lambda$0(this.f$0);
            }
        });
        x.e(objRunInTransaction, "runInTransaction(...)");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    static final Boolean trySetRunning$lambda$0(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, -256);
            ExecutionEventListener executionEventListener = workerWrapper.configuration.getExecutionEventListener();
            if (executionEventListener != null) {
                TaskExecutor taskExecutor = workerWrapper.workTaskExecutor;
                WorkInfo workInfo = WorkSpecDaoKt.getWorkInfo(workerWrapper.workSpecDao, workerWrapper.workSpecId);
                x.c(workInfo);
                ListenerEventDispatchKt.dispatchEvent(executionEventListener, taskExecutor, workInfo, WorkerWrapper$trySetRunning$1$1.INSTANCE);
            }
            z = true;
            workerWrapper.startedWork = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final void interrupt(int i2) {
        this.workerJob.s(new WorkerStoppedException(i2));
    }

    public final bm<Boolean> launch() {
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.getTaskCoroutineDispatcher().plus(o.i()), null, new AnonymousClass1(null), 2, null);
    }

    public final boolean setFailed(ListenableWorker.Result result) {
        x.f(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
        x.e(outputData, "getOutputData(...)");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }

    /* compiled from: WazeSource */
    abstract class Resolution {

        /* compiled from: WazeSource */
        public final class Failed extends Resolution {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable th) {
                super(null);
                x.f(th, "throwable");
                this.throwable = th;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: WazeSource */
        public final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result) {
                super(null);
                x.f(result, "result");
                this.result = result;
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }

        private Resolution() {
        }

        public /* synthetic */ Resolution(o oVar) {
            this();
        }

        /* compiled from: WazeSource */
        public final class Stopped extends Resolution {
            private final int reason;

            public /* synthetic */ Stopped(int i2, int i3, o oVar) {
                this(1 == (i3 & 1) ? -256 : i2);
            }

            public final int getReason() {
                return this.reason;
            }

            public Stopped(int i2) {
                super(null);
                this.reason = i2;
            }

            public Stopped() {
                this(0, 1, null);
            }
        }

        /* compiled from: WazeSource */
        public final class WorkerWrapperFailure extends Resolution {
            private final boolean recoverable;

            public /* synthetic */ WorkerWrapperFailure(boolean z, int i2, o oVar) {
                this(1 == ((z ? 1 : 0) | (i2 & 1)));
            }

            public final boolean getRecoverable() {
                return this.recoverable;
            }

            public WorkerWrapperFailure(boolean z) {
                super(null);
                this.recoverable = z;
            }

            public WorkerWrapperFailure() {
                this(false, 1, null);
            }
        }
    }
}
