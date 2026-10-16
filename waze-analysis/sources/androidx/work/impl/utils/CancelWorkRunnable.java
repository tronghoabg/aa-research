package androidx.work.impl.utils;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.ScheduleEventListener;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDaoKt;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDaoKt;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.q;
import h.g.b.u;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CancelWorkRunnable {
    private static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        x.e(workDatabase, "getWorkDatabase(...)");
        List<String> workToCancel = getWorkToCancel(workDatabase, str);
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        Iterator<String> it = workToCancel.iterator();
        while (it.hasNext()) {
            workSpecDao.setCancelledState(it.next());
        }
        Processor processor = workManagerImpl.getProcessor();
        x.e(processor, "getProcessor(...)");
        processor.stopAndCancelWork(str, 1);
        Iterator<Scheduler> it2 = workManagerImpl.getSchedulers().iterator();
        while (it2.hasNext()) {
            it2.next().cancel(str);
        }
        ScheduleEventListener scheduleEventListener = workManagerImpl.getConfiguration().getScheduleEventListener();
        if (scheduleEventListener != null) {
            TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
            x.e(workTaskExecutor, "getWorkTaskExecutor(...)");
            ListenerEventDispatchKt.dispatchEvents(scheduleEventListener, workTaskExecutor, WorkSpecDaoKt.getWorkInfos(workSpecDao, workToCancel), AnonymousClass1.INSTANCE);
        }
    }

    public static final Operation forAll(final WorkManagerImpl workManagerImpl) {
        x.f(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new a() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return CancelWorkRunnable.forAll$lambda$0(workManagerImpl);
            }
        });
    }

    static final ab forAll$lambda$0(final WorkManagerImpl workManagerImpl) {
        final WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        x.e(workDatabase, "getWorkDatabase(...)");
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.forAll$lambda$0$0(workDatabase, workManagerImpl);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forAll$lambda$0$0(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
        Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
        while (it.hasNext()) {
            cancel(workManagerImpl, it.next());
        }
        new PreferenceUtils(workDatabase).setLastCancelAllTimeMillis(workManagerImpl.getConfiguration().getClock().currentTimeMillis());
    }

    public static final Operation forId(final UUID uuid, final WorkManagerImpl workManagerImpl) {
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new a() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                return CancelWorkRunnable.forId$lambda$0(workManagerImpl, uuid);
            }
        });
    }

    static final ab forId$lambda$0(final WorkManagerImpl workManagerImpl, final UUID uuid) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        x.e(workDatabase, "getWorkDatabase(...)");
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.forId$lambda$0$0(workManagerImpl, uuid);
            }
        });
        reschedulePendingWorkers(workManagerImpl);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forId$lambda$0$0(WorkManagerImpl workManagerImpl, UUID uuid) {
        String string = uuid.toString();
        x.e(string, "toString(...)");
        cancel(workManagerImpl, string);
    }

    public static final Operation forName(final String str, final WorkManagerImpl workManagerImpl) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        a aVar = new a() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return CancelWorkRunnable.forName$lambda$0(str, workManagerImpl);
            }
        };
        return OperationKt.launchOperation(tracer, "CancelWorkByName_".concat(String.valueOf(str)), serialTaskExecutor, aVar);
    }

    static final ab forName$lambda$0(String str, WorkManagerImpl workManagerImpl) {
        forNameInline(str, workManagerImpl);
        reschedulePendingWorkers(workManagerImpl);
        return ab.f48028a;
    }

    public static final void forNameInline(final String str, final WorkManagerImpl workManagerImpl) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        x.e(workDatabase, "getWorkDatabase(...)");
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.forNameInline$lambda$0(workDatabase, str, workManagerImpl);
            }
        });
    }

    static final void forNameInline$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
        while (it.hasNext()) {
            cancel(workManagerImpl, it.next());
        }
    }

    public static final Operation forTag(final String str, final WorkManagerImpl workManagerImpl) {
        x.f(str, "tag");
        x.f(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        x.e(serialTaskExecutor, "getSerialTaskExecutor(...)");
        a aVar = new a() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return CancelWorkRunnable.forTag$lambda$0(workManagerImpl, str);
            }
        };
        return OperationKt.launchOperation(tracer, "CancelWorkByTag_".concat(String.valueOf(str)), serialTaskExecutor, aVar);
    }

    static final ab forTag$lambda$0(final WorkManagerImpl workManagerImpl, final String str) {
        final WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        x.e(workDatabase, "getWorkDatabase(...)");
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.forTag$lambda$0$0(workDatabase, str, workManagerImpl);
            }
        });
        reschedulePendingWorkers(workManagerImpl);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forTag$lambda$0$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
        while (it.hasNext()) {
            cancel(workManagerImpl, it.next());
        }
    }

    private static final List<String> getWorkToCancel(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        List listL = i.l(str);
        listL.addAll(DependencyDaoKt.getAllDependentWork(dependencyDao, str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (workSpecDao.getState((String) obj) != null ? !r2.isFinished() : false) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$cancel$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, ScheduleEventListener.class, "onCancelled", "onCancelled(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h.g.a.q
        public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return scheduleEventListener.onCancelled(workInfo, eVar);
        }
    }
}
