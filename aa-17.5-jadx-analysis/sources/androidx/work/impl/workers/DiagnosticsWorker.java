package androidx.work.impl.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.dsu;
import defpackage.dsy;
import defpackage.fjc;
import defpackage.fjm;
import defpackage.fjo;
import defpackage.flo;
import defpackage.fnu;
import defpackage.fnz;
import defpackage.foe;
import defpackage.fon;
import defpackage.fpm;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final dsu c() {
        flo floVarB = flo.b(this.a);
        WorkDatabase workDatabase = floVarB.d;
        workDatabase.getClass();
        foe foeVarX = workDatabase.x();
        fnz fnzVarV = workDatabase.v();
        fon fonVarY = workDatabase.y();
        fnu fnuVarU = workDatabase.u();
        dsy dsyVar = floVarB.c.g;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        List listF = foeVarX.f(jCurrentTimeMillis - 86400000);
        List listG = foeVarX.g();
        List listQ = foeVarX.q();
        if (!listF.isEmpty()) {
            fjo.a();
            String str = fpm.a;
            Log.i(str, "Recently completed work:\n\n");
            fjo.a();
            Log.i(str, fpm.a(fnzVarV, fonVarY, fnuVarU, listF));
        }
        if (!listG.isEmpty()) {
            fjo.a();
            String str2 = fpm.a;
            Log.i(str2, "Running work:\n\n");
            fjo.a();
            Log.i(str2, fpm.a(fnzVarV, fonVarY, fnuVarU, listG));
        }
        if (!listQ.isEmpty()) {
            fjo.a();
            String str3 = fpm.a;
            Log.i(str3, "Enqueued work:\n\n");
            fjo.a();
            Log.i(str3, fpm.a(fnzVarV, fonVarY, fnuVarU, listQ));
        }
        return new fjm(fjc.a);
    }
}
