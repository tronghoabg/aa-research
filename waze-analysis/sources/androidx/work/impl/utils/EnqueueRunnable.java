package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.ScheduleEventListener;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import h.ab;
import h.c.e;
import h.g.a.q;
import h.g.b.u;
import h.g.b.x;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EnqueueRunnable {
    public static final EnqueueRunnable INSTANCE = new EnqueueRunnable();
    private static final String TAG;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("EnqueueRunnable");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    private EnqueueRunnable() {
    }

    private final boolean addToDatabase(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        x.e(workManagerImpl, "getWorkManagerImpl(...)");
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        x.e(workDatabase, "getWorkDatabase(...)");
        workDatabase.beginTransaction();
        try {
            Configuration configuration = workManagerImpl.getConfiguration();
            x.e(configuration, "<get-configuration>(...)");
            EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabase, configuration, workContinuationImpl);
            boolean zProcessContinuation = processContinuation(workContinuationImpl);
            workDatabase.setTransactionSuccessful();
            return zProcessContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public static final void enqueue(WorkContinuationImpl workContinuationImpl) {
        x.f(workContinuationImpl, "workContinuation");
        if (workContinuationImpl.hasCycles()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + workContinuationImpl + ")");
        }
        EnqueueRunnable enqueueRunnable = INSTANCE;
        if (enqueueRunnable.addToDatabase(workContinuationImpl)) {
            enqueueRunnable.scheduleWorkInBackground(workContinuationImpl);
        }
    }

    private final boolean enqueueContinuation(WorkContinuationImpl workContinuationImpl) {
        Set<String> setPrerequisitesFor = WorkContinuationImpl.prerequisitesFor(workContinuationImpl);
        x.e(setPrerequisitesFor, "prerequisitesFor(...)");
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        x.e(workManagerImpl, "getWorkManagerImpl(...)");
        List<? extends WorkRequest> work = workContinuationImpl.getWork();
        x.e(work, "getWork(...)");
        String[] strArr = (String[]) setPrerequisitesFor.toArray(new String[0]);
        String name = workContinuationImpl.getName();
        ExistingWorkPolicy existingWorkPolicy = workContinuationImpl.getExistingWorkPolicy();
        x.e(existingWorkPolicy, "getExistingWorkPolicy(...)");
        boolean zEnqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workManagerImpl, work, strArr, name, existingWorkPolicy);
        workContinuationImpl.markEnqueued();
        return zEnqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r46, java.util.List<? extends androidx.work.WorkRequest> r47, java.lang.String[] r48, java.lang.String r49, androidx.work.ExistingWorkPolicy r50) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.EnqueueRunnable.enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private final boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean zProcessContinuation = false;
        if (parents != null) {
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (workContinuationImpl2.isEnqueued()) {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl2.getIds()) + ")");
                } else {
                    x.c(workContinuationImpl2);
                    zProcessContinuation |= processContinuation(workContinuationImpl2);
                }
            }
        }
        return enqueueContinuation(workContinuationImpl) | zProcessContinuation;
    }

    private final void scheduleWorkInBackground(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        x.e(workManagerImpl, "getWorkManagerImpl(...)");
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.EnqueueRunnable$enqueueWorkWithPrerequisites$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(3, ScheduleEventListener.class, "onCancelled", "onCancelled(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h.g.a.q
        public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return scheduleEventListener.onCancelled(workInfo, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.EnqueueRunnable$enqueueWorkWithPrerequisites$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(3, ScheduleEventListener.class, "onEnqueued", "onEnqueued(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h.g.a.q
        public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return scheduleEventListener.onEnqueued(workInfo, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.EnqueueRunnable$enqueueWorkWithPrerequisites$4, reason: invalid class name */
    final /* synthetic */ class AnonymousClass4 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(3, ScheduleEventListener.class, "onUnblocked", "onUnblocked(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h.g.a.q
        public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return scheduleEventListener.onUnblocked(workInfo, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.EnqueueRunnable$enqueueWorkWithPrerequisites$5, reason: invalid class name */
    final /* synthetic */ class AnonymousClass5 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(3, ScheduleEventListener.class, "onPrerequisiteFailed", "onPrerequisiteFailed(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h.g.a.q
        public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return scheduleEventListener.onPrerequisiteFailed(workInfo, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.EnqueueRunnable$enqueueWorkWithPrerequisites$6, reason: invalid class name */
    final /* synthetic */ class AnonymousClass6 extends u implements q<ScheduleEventListener, WorkInfo, e<? super ab>, Object> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(3, ScheduleEventListener.class, "onCancelled", "onCancelled(Landroidx/work/WorkInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h.g.a.q
        public final Object invoke(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return scheduleEventListener.onCancelled(workInfo, eVar);
        }
    }
}
