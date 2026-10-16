package androidx.work;

import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.multiprocess.RemoteWorkManager;
import h.c.j;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Configuration {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final Clock clock;
    private final int contentUriTriggerWorkersLimit;
    private final String defaultProcessName;
    private final boolean enableGreedyScheduler;
    private final boolean enableRepresentativeJobs;
    private final ExecutionEventListener executionEventListener;
    private final Executor executor;
    private final Consumer<Throwable> initializationExceptionHandler;
    private final InputMergerFactory inputMergerFactory;
    private final boolean isMarkingJobsAsImportantWhileForeground;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;
    private final long remoteSessionTimeoutMillis;
    private final RunnableScheduler runnableScheduler;
    private final ScheduleEventListener scheduleEventListener;
    private final Consumer<Throwable> schedulingExceptionHandler;
    private final Executor taskExecutor;
    private final Tracer tracer;
    private final j workerCoroutineContext;
    private final Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
    private final WorkerFactory workerFactory;
    private final Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

    /* compiled from: WazeSource */
    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(Builder builder) {
        x.f(builder, "builder");
        ab workerContext$work_runtime = builder.getWorkerContext$work_runtime();
        Executor executor$work_runtime = builder.getExecutor$work_runtime();
        if (executor$work_runtime == null) {
            executor$work_runtime = workerContext$work_runtime != null ? ConfigurationKt.asExecutor(workerContext$work_runtime) : null;
            if (executor$work_runtime == null) {
                executor$work_runtime = ConfigurationKt.createDefaultExecutor(false);
            }
        }
        this.executor = executor$work_runtime;
        this.workerCoroutineContext = workerContext$work_runtime == null ? builder.getExecutor$work_runtime() != null ? bo.f(executor$work_runtime) : av.a() : workerContext$work_runtime;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor$work_runtime() == null;
        Executor taskExecutor$work_runtime = builder.getTaskExecutor$work_runtime();
        this.taskExecutor = taskExecutor$work_runtime == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor$work_runtime;
        SystemClock clock$work_runtime = builder.getClock$work_runtime();
        this.clock = clock$work_runtime == null ? new SystemClock() : clock$work_runtime;
        DefaultWorkerFactory workerFactory$work_runtime = builder.getWorkerFactory$work_runtime();
        this.workerFactory = workerFactory$work_runtime == null ? DefaultWorkerFactory.INSTANCE : workerFactory$work_runtime;
        NoOpInputMergerFactory inputMergerFactory$work_runtime = builder.getInputMergerFactory$work_runtime();
        this.inputMergerFactory = inputMergerFactory$work_runtime == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory$work_runtime;
        DefaultRunnableScheduler runnableScheduler$work_runtime = builder.getRunnableScheduler$work_runtime();
        this.runnableScheduler = runnableScheduler$work_runtime == null ? new DefaultRunnableScheduler() : runnableScheduler$work_runtime;
        this.minimumLoggingLevel = builder.getLoggingLevel$work_runtime();
        this.minJobSchedulerId = builder.getMinJobSchedulerId$work_runtime();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId$work_runtime();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit$work_runtime();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime();
        this.workerInitializationExceptionHandler = builder.getWorkerInitializationExceptionHandler$work_runtime();
        this.workerExecutionExceptionHandler = builder.getWorkerExecutionExceptionHandler$work_runtime();
        this.defaultProcessName = builder.getDefaultProcessName$work_runtime();
        this.remoteSessionTimeoutMillis = builder.getRemoteSessionTimeoutMillis$work_runtime();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit$work_runtime();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground$work_runtime();
        this.executionEventListener = builder.getExecutionEventListener$work_runtime();
        this.scheduleEventListener = builder.getScheduleEventListener$work_runtime();
        Tracer tracer$work_runtime = builder.getTracer$work_runtime();
        this.tracer = tracer$work_runtime == null ? ConfigurationKt.createDefaultTracer() : tracer$work_runtime;
        this.enableRepresentativeJobs = builder.getEnableRepresentativeJobs$work_runtime();
        this.enableGreedyScheduler = builder.getEnableGreedyScheduler$work_runtime();
    }

    private static /* synthetic */ void getExecutionEventListener$annotations() {
    }

    private static /* synthetic */ void getScheduleEventListener$annotations() {
    }

    private static /* synthetic */ void isMarkingJobsAsImportantWhileForeground$annotations() {
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    public final ExecutionEventListener getExecutionEventListener() {
        return this.executionEventListener;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    public final long getRemoteSessionTimeoutMillis() {
        return this.remoteSessionTimeoutMillis;
    }

    public final RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final ScheduleEventListener getScheduleEventListener() {
        return this.scheduleEventListener;
    }

    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    public final Tracer getTracer() {
        return this.tracer;
    }

    public final j getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler() {
        return this.workerExecutionExceptionHandler;
    }

    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler() {
        return this.workerInitializationExceptionHandler;
    }

    public final boolean isGreedySchedulerEnabled() {
        return this.enableGreedyScheduler;
    }

    public final boolean isMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }

    public final boolean isRepresentativeJobsEnabled() {
        return this.enableRepresentativeJobs;
    }

    public final boolean isUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Clock clock;
        private int contentUriTriggerWorkersLimit;
        private String defaultProcessName;
        private boolean enableGreedyScheduler;
        private boolean enableRepresentativeJobs;
        private ExecutionEventListener executionEventListener;
        private Executor executor;
        private Consumer<Throwable> initializationExceptionHandler;
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private boolean markJobsAsImportantWhileForeground;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;
        private long remoteSessionTimeoutMillis;
        private RunnableScheduler runnableScheduler;
        private ScheduleEventListener scheduleEventListener;
        private Consumer<Throwable> schedulingExceptionHandler;
        private Executor taskExecutor;
        private Tracer tracer;
        private j workerContext;
        private Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        private WorkerFactory workerFactory;
        private Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler;

        public Builder(Configuration configuration) {
            x.f(configuration, "configuration");
            this.remoteSessionTimeoutMillis = 600000L;
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
            this.enableGreedyScheduler = true;
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.workerInitializationExceptionHandler = configuration.getWorkerInitializationExceptionHandler();
            this.workerExecutionExceptionHandler = configuration.getWorkerExecutionExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
            this.remoteSessionTimeoutMillis = configuration.getRemoteSessionTimeoutMillis();
            this.contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            this.markJobsAsImportantWhileForeground = configuration.isMarkingJobsAsImportantWhileForeground;
            this.executionEventListener = configuration.executionEventListener;
            this.scheduleEventListener = configuration.scheduleEventListener;
            this.tracer = configuration.getTracer();
            this.enableRepresentativeJobs = configuration.isRepresentativeJobsEnabled();
            this.enableGreedyScheduler = configuration.isGreedySchedulerEnabled();
        }

        public final Configuration build() {
            return new Configuration(this);
        }

        public final Clock getClock$work_runtime() {
            return this.clock;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime() {
            return this.contentUriTriggerWorkersLimit;
        }

        public final String getDefaultProcessName$work_runtime() {
            return this.defaultProcessName;
        }

        public final boolean getEnableGreedyScheduler$work_runtime() {
            return this.enableGreedyScheduler;
        }

        public final boolean getEnableRepresentativeJobs$work_runtime() {
            return this.enableRepresentativeJobs;
        }

        public final ExecutionEventListener getExecutionEventListener$work_runtime() {
            return this.executionEventListener;
        }

        public final Executor getExecutor$work_runtime() {
            return this.executor;
        }

        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime() {
            return this.initializationExceptionHandler;
        }

        public final InputMergerFactory getInputMergerFactory$work_runtime() {
            return this.inputMergerFactory;
        }

        public final int getLoggingLevel$work_runtime() {
            return this.loggingLevel;
        }

        public final boolean getMarkJobsAsImportantWhileForeground$work_runtime() {
            return this.markJobsAsImportantWhileForeground;
        }

        public final int getMaxJobSchedulerId$work_runtime() {
            return this.maxJobSchedulerId;
        }

        public final int getMaxSchedulerLimit$work_runtime() {
            return this.maxSchedulerLimit;
        }

        public final int getMinJobSchedulerId$work_runtime() {
            return this.minJobSchedulerId;
        }

        public final long getRemoteSessionTimeoutMillis$work_runtime() {
            return this.remoteSessionTimeoutMillis;
        }

        public final RunnableScheduler getRunnableScheduler$work_runtime() {
            return this.runnableScheduler;
        }

        public final ScheduleEventListener getScheduleEventListener$work_runtime() {
            return this.scheduleEventListener;
        }

        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime() {
            return this.schedulingExceptionHandler;
        }

        public final Executor getTaskExecutor$work_runtime() {
            return this.taskExecutor;
        }

        public final Tracer getTracer$work_runtime() {
            return this.tracer;
        }

        public final j getWorkerContext$work_runtime() {
            return this.workerContext;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerExecutionExceptionHandler$work_runtime() {
            return this.workerExecutionExceptionHandler;
        }

        public final WorkerFactory getWorkerFactory$work_runtime() {
            return this.workerFactory;
        }

        public final Consumer<WorkerExceptionInfo> getWorkerInitializationExceptionHandler$work_runtime() {
            return this.workerInitializationExceptionHandler;
        }

        public final Builder setClock(Clock clock) {
            x.f(clock, "clock");
            this.clock = clock;
            return this;
        }

        public final void setClock$work_runtime(Clock clock) {
            this.clock = clock;
        }

        public final Builder setContentUriTriggerWorkersLimit(int i2) {
            this.contentUriTriggerWorkersLimit = Math.max(i2, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime(int i2) {
            this.contentUriTriggerWorkersLimit = i2;
        }

        public final Builder setDefaultProcessName(String str) {
            x.f(str, "processName");
            this.defaultProcessName = str;
            return this;
        }

        public final void setDefaultProcessName$work_runtime(String str) {
            this.defaultProcessName = str;
        }

        public final void setEnableGreedyScheduler$work_runtime(boolean z) {
            this.enableGreedyScheduler = z;
        }

        public final void setEnableRepresentativeJobs$work_runtime(boolean z) {
            this.enableRepresentativeJobs = z;
        }

        public final Builder setExecutionEventListener(ExecutionEventListener executionEventListener) {
            x.f(executionEventListener, "listener");
            this.executionEventListener = executionEventListener;
            return this;
        }

        public final void setExecutionEventListener$work_runtime(ExecutionEventListener executionEventListener) {
            this.executionEventListener = executionEventListener;
        }

        public final Builder setExecutor(Executor executor) {
            x.f(executor, "executor");
            this.executor = executor;
            return this;
        }

        public final void setExecutor$work_runtime(Executor executor) {
            this.executor = executor;
        }

        public final Builder setGreedySchedulerEnabled(boolean z) {
            this.enableGreedyScheduler = z;
            return this;
        }

        public final Builder setInitializationExceptionHandler(Consumer<Throwable> consumer) {
            x.f(consumer, "exceptionHandler");
            this.initializationExceptionHandler = consumer;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime(Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        public final Builder setInputMergerFactory(InputMergerFactory inputMergerFactory) {
            x.f(inputMergerFactory, "inputMergerFactory");
            this.inputMergerFactory = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime(InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        public final Builder setJobSchedulerJobIdRange(int i2, int i3) {
            if (i3 - i2 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.minJobSchedulerId = i2;
            this.maxJobSchedulerId = i3;
            return this;
        }

        public final void setLoggingLevel$work_runtime(int i2) {
            this.loggingLevel = i2;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
        }

        public final Builder setMarkingJobsAsImportantWhileForeground(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
            return this;
        }

        public final void setMaxJobSchedulerId$work_runtime(int i2) {
            this.maxJobSchedulerId = i2;
        }

        public final Builder setMaxSchedulerLimit(int i2) {
            if (i2 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.maxSchedulerLimit = Math.min(i2, 50);
            return this;
        }

        public final void setMaxSchedulerLimit$work_runtime(int i2) {
            this.maxSchedulerLimit = i2;
        }

        public final void setMinJobSchedulerId$work_runtime(int i2) {
            this.minJobSchedulerId = i2;
        }

        public final Builder setMinimumLoggingLevel(int i2) {
            this.loggingLevel = i2;
            return this;
        }

        public final Builder setRemoteSessionTimeoutMillis(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("The remote session timeout must not be negative.");
            }
            this.remoteSessionTimeoutMillis = n.l(j2, RemoteWorkManager.MAX_SESSION_TIMEOUT_MILLIS);
            return this;
        }

        public final void setRemoteSessionTimeoutMillis$work_runtime(long j2) {
            this.remoteSessionTimeoutMillis = j2;
        }

        public final Builder setRepresentativeJobsEnabled(boolean z) {
            this.enableRepresentativeJobs = z;
            return this;
        }

        public final Builder setRunnableScheduler(RunnableScheduler runnableScheduler) {
            x.f(runnableScheduler, "runnableScheduler");
            this.runnableScheduler = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime(RunnableScheduler runnableScheduler) {
            this.runnableScheduler = runnableScheduler;
        }

        public final Builder setScheduleEventListener(ScheduleEventListener scheduleEventListener) {
            x.f(scheduleEventListener, "listener");
            this.scheduleEventListener = scheduleEventListener;
            return this;
        }

        public final void setScheduleEventListener$work_runtime(ScheduleEventListener scheduleEventListener) {
            this.scheduleEventListener = scheduleEventListener;
        }

        public final Builder setSchedulingExceptionHandler(Consumer<Throwable> consumer) {
            x.f(consumer, "schedulingExceptionHandler");
            this.schedulingExceptionHandler = consumer;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime(Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        public final Builder setTaskExecutor(Executor executor) {
            x.f(executor, "taskExecutor");
            this.taskExecutor = executor;
            return this;
        }

        public final void setTaskExecutor$work_runtime(Executor executor) {
            this.taskExecutor = executor;
        }

        public final Builder setTracer(Tracer tracer) {
            x.f(tracer, "tracer");
            this.tracer = tracer;
            return this;
        }

        public final void setTracer$work_runtime(Tracer tracer) {
            this.tracer = tracer;
        }

        public final void setWorkerContext$work_runtime(j jVar) {
            this.workerContext = jVar;
        }

        public final Builder setWorkerCoroutineContext(j jVar) {
            x.f(jVar, "context");
            this.workerContext = jVar;
            return this;
        }

        public final Builder setWorkerExecutionExceptionHandler(Consumer<WorkerExceptionInfo> consumer) {
            x.f(consumer, "workerExceptionHandler");
            this.workerExecutionExceptionHandler = consumer;
            return this;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime(Consumer<WorkerExceptionInfo> consumer) {
            this.workerExecutionExceptionHandler = consumer;
        }

        public final Builder setWorkerFactory(WorkerFactory workerFactory) {
            x.f(workerFactory, "workerFactory");
            this.workerFactory = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime(WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        public final Builder setWorkerInitializationExceptionHandler(Consumer<WorkerExceptionInfo> consumer) {
            x.f(consumer, "workerExceptionHandler");
            this.workerInitializationExceptionHandler = consumer;
            return this;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime(Consumer<WorkerExceptionInfo> consumer) {
            this.workerInitializationExceptionHandler = consumer;
        }

        public Builder() {
            this.remoteSessionTimeoutMillis = 600000L;
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
            this.enableGreedyScheduler = true;
        }
    }
}
