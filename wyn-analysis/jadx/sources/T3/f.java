package T3;

import U8.v0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f11411e = J3.r.f("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f11412f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f11413a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.q f11414b;

    /* renamed from: c, reason: collision with root package name */
    public final xa.d f11415c;

    /* renamed from: d, reason: collision with root package name */
    public int f11416d = 0;

    public f(Context context, K3.q qVar) {
        this.f11413a = context.getApplicationContext();
        this.f11414b = qVar;
        this.f11415c = qVar.f6507g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i5 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i5);
        long jCurrentTimeMillis = System.currentTimeMillis() + f11412f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.f.a():void");
    }

    public final boolean b() {
        J3.b bVar = this.f11414b.f6502b;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f11411e;
        if (zIsEmpty) {
            J3.r.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = l.a(this.f11413a, bVar);
        J3.r.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f11411e;
        K3.q qVar = this.f11414b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    v0.V(this.f11413a);
                    J3.r.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e7) {
                        int i5 = this.f11416d + 1;
                        this.f11416d = i5;
                        if (i5 >= 3) {
                            J3.r.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                            qVar.f6502b.getClass();
                            throw illegalStateException;
                        }
                        long j8 = i5 * 300;
                        String str2 = "Retrying after " + j8;
                        if (J3.r.d().f5584a <= 3) {
                            Log.d(str, str2, e7);
                        }
                        try {
                            Thread.sleep(this.f11416d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    J3.r.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    qVar.f6502b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            qVar.e();
        }
    }
}
