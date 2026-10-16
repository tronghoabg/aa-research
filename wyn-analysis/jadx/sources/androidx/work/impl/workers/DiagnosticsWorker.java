package androidx.work.impl.workers;

import Fe.e;
import J3.d;
import J3.h;
import J3.p;
import J3.r;
import K3.q;
import S3.i;
import S3.l;
import S3.s;
import U8.v0;
import W3.b;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k3.C3185q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final p doWork() throws Throwable {
        C3185q c3185q;
        i iVar;
        l lVar;
        s sVar;
        WorkDatabase workDatabase = q.c(getApplicationContext()).f6503c;
        AbstractC3340k.d(workDatabase, "workManager.workDatabase");
        S3.q qVarU = workDatabase.u();
        l lVarS = workDatabase.s();
        s sVarV = workDatabase.v();
        i iVarR = workDatabase.r();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        qVarU.getClass();
        C3185q c3185qD = C3185q.d(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c3185qD.G(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVarU.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iK = v0.K(cursorL, "id");
            int iK2 = v0.K(cursorL, "state");
            int iK3 = v0.K(cursorL, "worker_class_name");
            int iK4 = v0.K(cursorL, "input_merger_class_name");
            int iK5 = v0.K(cursorL, "input");
            int iK6 = v0.K(cursorL, "output");
            int iK7 = v0.K(cursorL, "initial_delay");
            int iK8 = v0.K(cursorL, "interval_duration");
            int iK9 = v0.K(cursorL, "flex_duration");
            int iK10 = v0.K(cursorL, "run_attempt_count");
            int iK11 = v0.K(cursorL, "backoff_policy");
            c3185q = c3185qD;
            try {
                int iK12 = v0.K(cursorL, "backoff_delay_duration");
                int iK13 = v0.K(cursorL, "last_enqueue_time");
                int iK14 = v0.K(cursorL, "minimum_retention_duration");
                int iK15 = v0.K(cursorL, "schedule_requested_at");
                int iK16 = v0.K(cursorL, "run_in_foreground");
                int iK17 = v0.K(cursorL, "out_of_quota_policy");
                int iK18 = v0.K(cursorL, "period_count");
                int iK19 = v0.K(cursorL, "generation");
                int iK20 = v0.K(cursorL, "required_network_type");
                int iK21 = v0.K(cursorL, "requires_charging");
                int iK22 = v0.K(cursorL, "requires_device_idle");
                int iK23 = v0.K(cursorL, "requires_battery_not_low");
                int iK24 = v0.K(cursorL, "requires_storage_not_low");
                int iK25 = v0.K(cursorL, "trigger_content_update_delay");
                int iK26 = v0.K(cursorL, "trigger_max_content_delay");
                int iK27 = v0.K(cursorL, "content_uri_triggers");
                int i5 = iK14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iK) ? null : cursorL.getString(iK);
                    int iM = e.M(cursorL.getInt(iK2));
                    String string2 = cursorL.isNull(iK3) ? null : cursorL.getString(iK3);
                    String string3 = cursorL.isNull(iK4) ? null : cursorL.getString(iK4);
                    h hVarA = h.a(cursorL.isNull(iK5) ? null : cursorL.getBlob(iK5));
                    h hVarA2 = h.a(cursorL.isNull(iK6) ? null : cursorL.getBlob(iK6));
                    long j8 = cursorL.getLong(iK7);
                    long j10 = cursorL.getLong(iK8);
                    long j11 = cursorL.getLong(iK9);
                    int i10 = cursorL.getInt(iK10);
                    int iJ = e.J(cursorL.getInt(iK11));
                    long j12 = cursorL.getLong(iK12);
                    long j13 = cursorL.getLong(iK13);
                    int i11 = i5;
                    long j14 = cursorL.getLong(i11);
                    int i12 = iK13;
                    int i13 = iK15;
                    long j15 = cursorL.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z2 = cursorL.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    int iL = e.L(cursorL.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorL.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorL.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    int iK28 = e.K(cursorL.getInt(i20));
                    iK20 = i20;
                    int i21 = iK21;
                    boolean z10 = cursorL.getInt(i21) != 0;
                    iK21 = i21;
                    int i22 = iK22;
                    boolean z11 = cursorL.getInt(i22) != 0;
                    iK22 = i22;
                    int i23 = iK23;
                    boolean z12 = cursorL.getInt(i23) != 0;
                    iK23 = i23;
                    int i24 = iK24;
                    boolean z13 = cursorL.getInt(i24) != 0;
                    iK24 = i24;
                    int i25 = iK25;
                    long j16 = cursorL.getLong(i25);
                    iK25 = i25;
                    int i26 = iK26;
                    long j17 = cursorL.getLong(i26);
                    iK26 = i26;
                    int i27 = iK27;
                    if (!cursorL.isNull(i27)) {
                        blob = cursorL.getBlob(i27);
                    }
                    iK27 = i27;
                    arrayList.add(new S3.p(string, iM, string2, string3, hVarA, hVarA2, j8, j10, j11, new d(iK28, z10, z11, z12, z13, j16, j17, e.m(blob)), i10, iJ, j12, j13, j14, j15, z2, iL, i17, i19));
                    iK13 = i12;
                    i5 = i11;
                }
                cursorL.close();
                c3185q.h();
                ArrayList arrayListC = qVarU.c();
                ArrayList arrayListA = qVarU.a();
                if (arrayList.isEmpty()) {
                    iVar = iVarR;
                    lVar = lVarS;
                    sVar = sVarV;
                } else {
                    r rVarD = r.d();
                    String str = b.f15147a;
                    rVarD.e(str, "Recently completed work:\n\n");
                    iVar = iVarR;
                    lVar = lVarS;
                    sVar = sVarV;
                    r.d().e(str, b.a(lVar, sVar, iVar, arrayList));
                }
                if (!arrayListC.isEmpty()) {
                    r rVarD2 = r.d();
                    String str2 = b.f15147a;
                    rVarD2.e(str2, "Running work:\n\n");
                    r.d().e(str2, b.a(lVar, sVar, iVar, arrayListC));
                }
                if (!arrayListA.isEmpty()) {
                    r rVarD3 = r.d();
                    String str3 = b.f15147a;
                    rVarD3.e(str3, "Enqueued work:\n\n");
                    r.d().e(str3, b.a(lVar, sVar, iVar, arrayListA));
                }
                return p.a();
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                c3185q.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c3185q = c3185qD;
        }
    }
}
