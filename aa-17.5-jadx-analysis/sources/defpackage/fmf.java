package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class fmf implements fko {
    public static final String a = fjo.b("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final fme d;
    private final WorkDatabase e;

    public fmf(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerA = fmd.a(context);
        fme fmeVar = new fme(context);
        this.b = context;
        this.c = jobSchedulerA;
        this.d = fmeVar;
        this.e = workDatabase;
    }

    public static fny a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new fny(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = fmd.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            fjo.a();
            Log.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.fko
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.b;
        JobScheduler jobScheduler = this.c;
        List<JobInfo> listE = e(context, jobScheduler);
        if (listE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listE) {
                fny fnyVarA = a(jobInfo);
                if (fnyVarA != null && str.equals(fnyVarA.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            fjo.a().c(a, a.bA(iIntValue, str, "Cancelling work ID ", ", Job ID "));
            f(jobScheduler, iIntValue);
        }
        this.e.u().d(str);
    }

    @Override // defpackage.fko
    public final void c(fod... fodVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.e;
        gjv gjvVar = new gjv(workDatabase, (byte[]) null);
        for (fod fodVar : fodVarArr) {
            workDatabase.k();
            try {
                foe foeVarX = workDatabase.x();
                String str = fodVar.a;
                fod fodVarC = foeVarX.c(str);
                if (fodVarC == null) {
                    fjo.a();
                    Log.w(a, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.n();
                } else if (fodVarC.b != fju.a) {
                    fjo.a();
                    Log.w(a, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.n();
                } else {
                    fny fnyVarL = dtb.l(fodVar);
                    fnt fntVarA = workDatabase.u().a(fnyVarL);
                    if (fntVarA != null) {
                        iIntValue = fntVarA.c;
                    } else {
                        Object objE = ((ezc) gjvVar.a).e(new flt(gjvVar, 3));
                        objE.getClass();
                        iIntValue = ((Number) objE).intValue();
                    }
                    if (fntVarA == null) {
                        workDatabase.u().c(new fnt(fnyVarL.a, fnyVarL.b, iIntValue));
                    }
                    g(fodVar, iIntValue);
                    workDatabase.n();
                }
                workDatabase.l();
            } catch (Throwable th) {
                this.e.l();
                throw th;
            }
        }
    }

    @Override // defpackage.fko
    public final boolean d() {
        return true;
    }

    public final void g(fod fodVar, int i) throws IOException {
        int i2;
        String str;
        fja fjaVar = fodVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = fodVar.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", fodVar.r);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", fodVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.d.b).setRequiresCharging(fjaVar.c);
        boolean z = fjaVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = fjaVar.a();
        if (networkRequestA != null) {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        } else {
            int i3 = fjaVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 == 1) {
                    i2 = 1;
                } else if (i4 != 2) {
                    i2 = 3;
                    if (i4 != 3) {
                        i2 = 4;
                        if (i4 != 4) {
                            fjo fjoVarA = fjo.a();
                            String str3 = fme.a;
                            Objects.toString(dsu.h(i3));
                            fjoVarA.c(str3, "API version too low. Cannot convert network type value ".concat(dsu.h(i3)));
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z) {
            extras.setBackoffCriteria(fodVar.l, fodVar.x == 2 ? 0 : 1);
        }
        long jMax = Math.max(fodVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!fodVar.p) {
            extras.setImportantWhileForeground(true);
        }
        if (fjaVar.b()) {
            for (fiz fizVar : fjaVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(fizVar.a, fizVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(fjaVar.g);
            extras.setTriggerContentMaxDelay(fjaVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(fjaVar.e);
        extras.setRequiresStorageNotLow(fjaVar.f);
        int i5 = fodVar.k;
        if (Build.VERSION.SDK_INT >= 31 && fodVar.p && i5 <= 0 && jMax <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = fodVar.v) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        fjo fjoVarA2 = fjo.a();
        String str4 = a;
        fjoVarA2.c(str4, "Scheduling work ID " + str2 + " (" + fodVar.c + "), Job ID " + i);
        try {
            if (this.c.schedule(jobInfoBuild) == 0) {
                fjo.a();
                Log.w(str4, "Unable to schedule work ID " + str2);
                if (fodVar.p && fodVar.y == 1) {
                    fodVar.p = false;
                    fjo.a().c(str4, String.format("Scheduling a non-expedited job (work ID %s)", str2));
                    g(fodVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.b;
            WorkDatabase workDatabase = this.e;
            int i6 = fmd.a;
            int size = workDatabase.x().h().size();
            String strCu = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler jobSchedulerA = fmd.a(context);
                List listB = fmd.b(jobSchedulerA);
                if (listB != null) {
                    List listE = e(context, jobSchedulerA);
                    int size2 = listE != null ? listB.size() - listE.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List listE2 = e(context, (JobScheduler) systemService);
                    int size3 = listE2 != null ? listE2.size() : 0;
                    strCu = woy.cu(woy.da(new String[]{listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                List listE3 = e(context, fmd.a(context));
                if (listE3 != null) {
                    strCu = listE3.size() + " jobs from WorkManager";
                }
            }
            String str6 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + strCu + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            fjo.a();
            Log.e(a, str6);
            throw new IllegalStateException(str6, e);
        } catch (Throwable th) {
            fjo.a();
            String str7 = a;
            Objects.toString(fodVar);
            Log.e(str7, "Unable to schedule ".concat(String.valueOf(fodVar)), th);
        }
    }
}
