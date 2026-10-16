package com.waze;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CalendarUpdateWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.g.b.x.f(context, "context");
        h.g.b.x.f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        Context applicationContext = getApplicationContext();
        if (NativeManager.isAppStarted()) {
            if (NativeManager.getInstance().calendarAccessEnabled(applicationContext)) {
                NativeManager.getInstance().setCalendarEventsDirty(true);
                NativeManager.getInstance().updateCalendarEvents();
            } else {
                CalendarChangeReceiver.a(applicationContext, false);
            }
        } else if (OfflineNativeManager.getInstance().accessToCalendarAllowed(applicationContext)) {
            OfflineNativeManager.getInstance().updateCalendarEvents(applicationContext);
        } else {
            CalendarChangeReceiver.a(applicationContext, false);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        h.g.b.x.e(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
