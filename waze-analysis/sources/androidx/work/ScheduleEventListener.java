package androidx.work;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ScheduleEventListener {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.ScheduleEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object onCancelled$suspendImpl(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return ab.f48028a;
        }

        public static /* synthetic */ Object onEnqueued$suspendImpl(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return ab.f48028a;
        }

        public static /* synthetic */ Object onPrerequisiteFailed$suspendImpl(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return ab.f48028a;
        }

        public static /* synthetic */ Object onUnblocked$suspendImpl(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, e<? super ab> eVar) {
            return ab.f48028a;
        }

        public static /* synthetic */ Object onUpdated$suspendImpl(ScheduleEventListener scheduleEventListener, WorkInfo workInfo, WorkInfo workInfo2, e<? super ab> eVar) {
            return ab.f48028a;
        }
    }

    Object onCancelled(WorkInfo workInfo, e<? super ab> eVar);

    Object onEnqueued(WorkInfo workInfo, e<? super ab> eVar);

    Object onPrerequisiteFailed(WorkInfo workInfo, e<? super ab> eVar);

    Object onUnblocked(WorkInfo workInfo, e<? super ab> eVar);

    Object onUpdated(WorkInfo workInfo, WorkInfo workInfo2, e<? super ab> eVar);
}
