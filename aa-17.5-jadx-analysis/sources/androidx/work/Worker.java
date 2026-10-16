package androidx.work;

import android.content.Context;
import defpackage.dsu;
import defpackage.dsz;
import defpackage.eup;
import defpackage.fjn;
import defpackage.flm;
import defpackage.zgp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/ListenableWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "getForegroundInfoAsync", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Worker extends fjn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.fjn
    public final zgp a() {
        return dsz.l(f(), new eup(8));
    }

    @Override // defpackage.fjn
    public final zgp b() {
        return dsz.l(f(), new flm(this, 1));
    }

    public abstract dsu c();
}
