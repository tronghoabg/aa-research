package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.waze.R;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.c.k;
import h.g.a.p;
import h.g.a.t;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkManagerImplExtKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ WorkManagerImpl $this_close;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WorkManagerImpl workManagerImpl, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$this_close = workManagerImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$this_close, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                h hVar = this.$this_close.getWorkManagerScope().getCoroutineContext().get(br.f51766a);
                x.c(hVar);
                this.label = 1;
                if (o.b((br) hVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public static final void close(WorkManagerImpl workManagerImpl) {
        x.f(workManagerImpl, "<this>");
        aj.t(k.f48060a, new AnonymousClass1(workManagerImpl, null));
        workManagerImpl.getWorkDatabase().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        List listB = i.b();
        Scheduler schedulerCreateBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        x.e(schedulerCreateBestAvailableBackgroundScheduler, "createBestAvailableBackgroundScheduler(...)");
        listB.add(schedulerCreateBestAvailableBackgroundScheduler);
        if (configuration.isGreedySchedulerEnabled()) {
            listB.add(new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor));
        }
        return i.a(listB);
    }

    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return createWorkManager$default(context, configuration, taskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, t<? super Context, ? super Configuration, ? super TaskExecutor, ? super WorkDatabase, ? super Trackers, ? super Processor, ? extends List<? extends Scheduler>> tVar) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "workTaskExecutor");
        x.f(workDatabase, "workDatabase");
        x.f(trackers, "trackers");
        x.f(processor, "processor");
        x.f(tVar, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, taskExecutor, workDatabase, tVar.invoke(context, configuration, taskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, t tVar, int i2, Object obj) {
        Trackers trackers2;
        if ((i2 & 4) != 0) {
            taskExecutor = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        }
        TaskExecutor taskExecutor2 = taskExecutor;
        if ((i2 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            x.e(applicationContext, "getApplicationContext(...)");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
            workDatabase = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        }
        if ((i2 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            x.e(applicationContext2, "getApplicationContext(...)");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        if ((i2 & 32) != 0) {
            processor = new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase);
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase, trackers2, processor, (i2 & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : tVar);
    }

    public static final t<Context, Configuration, TaskExecutor, WorkDatabase, Trackers, Processor, List<Scheduler>> schedulers(final Scheduler... schedulerArr) {
        x.f(schedulerArr, "schedulers");
        return new t() { // from class: androidx.work.impl.WorkManagerImplExtKt$$ExternalSyntheticLambda0
            @Override // h.g.a.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return WorkManagerImplExtKt.schedulers$lambda$0(schedulerArr, (Context) obj, (Configuration) obj2, (TaskExecutor) obj3, (WorkDatabase) obj4, (Trackers) obj5, (Processor) obj6);
            }
        };
    }

    static final List schedulers$lambda$0(Scheduler[] schedulerArr, Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        x.f(context, "<unused var>");
        x.f(configuration, "<unused var>");
        x.f(taskExecutor, "<unused var>");
        x.f(workDatabase, "<unused var>");
        x.f(trackers, "<unused var>");
        x.f(processor, "<unused var>");
        return h.a.c.X(schedulerArr);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, taskExecutor, null, null, null, null, 120, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "workTaskExecutor");
        x.f(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "workTaskExecutor");
        x.f(workDatabase, "workDatabase");
        x.f(trackers, "trackers");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        x.f(taskExecutor, "workTaskExecutor");
        x.f(workDatabase, "workDatabase");
        x.f(trackers, "trackers");
        x.f(processor, "processor");
        return createWorkManager$default(context, configuration, taskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }
}
