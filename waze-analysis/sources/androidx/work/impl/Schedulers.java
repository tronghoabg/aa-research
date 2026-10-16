package androidx.work.impl;

import android.content.Context;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class Schedulers {
    private static final String TAG = Logger.tagWithPrefix("Schedulers");

    private Schedulers() {
    }

    private static void cancelWorkSpecsForLimitedSlots(List<WorkSpec> list, List<Scheduler> list2) {
        for (Scheduler scheduler : list2) {
            if (scheduler.hasLimitedSchedulingSlots()) {
                Iterator<WorkSpec> it = list.iterator();
                while (it.hasNext()) {
                    scheduler.cancel(it.next().id);
                }
            }
        }
    }

    static Scheduler createBestAvailableBackgroundScheduler(Context context, WorkDatabase workDatabase, Configuration configuration) {
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workDatabase, configuration);
        PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
        Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService");
        return systemJobScheduler;
    }

    private static Set<WorkSpec> getRepresentativeJobsPrioritizedWorkToSchedule(List<WorkSpec> list, int i2) {
        if (list.size() <= i2) {
            return new HashSet(list);
        }
        HashSet hashSet = new HashSet(i2);
        ArrayList arrayList = new ArrayList(i2);
        Collections.sort(list, new Comparator() { // from class: androidx.work.impl.Schedulers$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((WorkSpec) obj).calculateNextRunTime(), ((WorkSpec) obj2).calculateNextRunTime());
            }
        });
        HashSet hashSet2 = new HashSet(i2);
        Iterator<WorkSpec> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                WorkSpec next = it.next();
                if (hashSet2.contains(next.constraints)) {
                    arrayList.add(next);
                } else {
                    hashSet.add(next);
                    hashSet2.add(next.constraints);
                }
                if (hashSet.size() == i2) {
                    break;
                }
            } else if (!arrayList.isEmpty()) {
                hashSet.addAll(arrayList.subList(0, i2 - hashSet.size()));
            }
        }
        return hashSet;
    }

    static /* synthetic */ void lambda$registerRescheduling$0(WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, List list, Configuration configuration) {
        if (workDatabase.workSpecDao().isWorkSpecScheduled(workGenerationalId.getWorkSpecId())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).cancel(workGenerationalId.getWorkSpecId());
        }
        schedule(configuration, workDatabase, list);
    }

    private static void markScheduled(WorkSpecDao workSpecDao, Clock clock, List<WorkSpec> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Iterator<WorkSpec> it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(it.next().id, jCurrentTimeMillis);
            }
        }
    }

    public static void registerRescheduling(final List<Scheduler> list, Processor processor, final Executor executor, final WorkDatabase workDatabase, final Configuration configuration) {
        processor.addExecutionListener(new ExecutionListener() { // from class: androidx.work.impl.Schedulers$$ExternalSyntheticLambda1
            @Override // androidx.work.impl.ExecutionListener
            public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
                executor.execute(new Runnable() { // from class: androidx.work.impl.Schedulers$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Schedulers.lambda$registerRescheduling$0(workDatabase, workGenerationalId, list, configuration);
                    }
                });
            }
        });
    }

    public static void schedule(Configuration configuration, WorkDatabase workDatabase, List<Scheduler> list) {
        List<WorkSpec> arrayList;
        if (list == null || list.isEmpty()) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        ArrayList arrayList2 = new ArrayList();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> eligibleWorkForSchedulingWithContentUris = workSpecDao.getEligibleWorkForSchedulingWithContentUris();
            markScheduled(workSpecDao, configuration.getClock(), eligibleWorkForSchedulingWithContentUris);
            List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (configuration.isRepresentativeJobsEnabled()) {
                Set<WorkSpec> representativeJobsPrioritizedWorkToSchedule = getRepresentativeJobsPrioritizedWorkToSchedule(workSpecDao.getAllUnblockedWork(), configuration.getMaxSchedulerLimit());
                for (WorkSpec workSpec : workSpecDao.getScheduledWork()) {
                    if (representativeJobsPrioritizedWorkToSchedule.contains(workSpec)) {
                        representativeJobsPrioritizedWorkToSchedule.remove(workSpec);
                    } else {
                        arrayList2.add(workSpec);
                        workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                    }
                }
                arrayList = new ArrayList(representativeJobsPrioritizedWorkToSchedule);
            } else {
                arrayList = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            }
            markScheduled(workSpecDao, configuration.getClock(), arrayList);
            if (eligibleWorkForSchedulingWithContentUris != null) {
                arrayList.addAll(eligibleWorkForSchedulingWithContentUris);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (configuration.isRepresentativeJobsEnabled()) {
                cancelWorkSpecsForLimitedSlots(arrayList2, list);
            }
            scheduleWorkSpecs(arrayList, list, true);
            scheduleWorkSpecs(allEligibleWorkSpecsForScheduling, list, false);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    private static void scheduleWorkSpecs(List<WorkSpec> list, List<Scheduler> list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        WorkSpec[] workSpecArr = (WorkSpec[]) list.toArray(new WorkSpec[list.size()]);
        for (Scheduler scheduler : list2) {
            if (scheduler.hasLimitedSchedulingSlots() == z) {
                scheduler.schedule(workSpecArr);
            }
        }
    }
}
