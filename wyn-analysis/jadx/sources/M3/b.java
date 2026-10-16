package M3;

import A.e0;
import J3.r;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7460a = r.f("Alarms");

    public static void a(Context context, S3.j jVar, int i5) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f7461e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.e(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i5, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        r.d().a(f7460a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i5 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, S3.j jVar, long j8) {
        S3.i iVarR = workDatabase.r();
        S3.g gVarC = iVarR.c(jVar);
        if (gVarC != null) {
            int i5 = gVarC.f10959c;
            a(context, jVar, i5);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f7461e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.e(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i5, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j8, service);
                return;
            }
            return;
        }
        Object objM = workDatabase.m(new G8.c(new e0(workDatabase), 5));
        AbstractC3340k.d(objM, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objM).intValue();
        iVarR.d(new S3.g(jVar.f10965a, jVar.f10966b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f7461e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.e(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j8, service2);
        }
    }
}
