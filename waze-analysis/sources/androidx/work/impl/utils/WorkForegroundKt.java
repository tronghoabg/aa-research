package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkForegroundKt {
    private static final String TAG;

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.WorkForegroundKt$workForeground$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super Void>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ForegroundUpdater $foregroundUpdater;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ ListenableWorker $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ListenableWorker listenableWorker, WorkSpec workSpec, ForegroundUpdater foregroundUpdater, Context context, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$worker = listenableWorker;
            this.$spec = workSpec;
            this.$foregroundUpdater = foregroundUpdater;
            this.$context = context;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Void> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                bm<ForegroundInfo> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
                x.e(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(foregroundInfoAsync, this.$worker, this);
                if (obj != aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
            WorkSpec workSpec = this.$spec;
            if (foregroundInfo == null) {
                throw new IllegalStateException("Worker was marked important (" + workSpec.workerClassName + ") but did not provide ForegroundInfo");
            }
            Logger.get().debug(WorkForegroundKt.TAG, "Updating notification for ".concat(String.valueOf(workSpec.workerClassName)));
            bm<Void> foregroundAsync = this.$foregroundUpdater.setForegroundAsync(this.$context, this.$worker.getId(), foregroundInfo);
            x.e(foregroundAsync, "setForegroundAsync(...)");
            this.label = 2;
            Object objAwait = ListenableFutureKt.await(foregroundAsync, this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkForegroundRunnable");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    public static final Object workForeground(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, TaskExecutor taskExecutor, e<? super ab> eVar) {
        if (workSpec.expedited && Build.VERSION.SDK_INT < 31) {
            Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
            x.e(mainThreadExecutor, "getMainThreadExecutor(...)");
            Object objV = aj.v(bo.f(mainThreadExecutor), new AnonymousClass2(listenableWorker, workSpec, foregroundUpdater, context, null), eVar);
            if (objV == a.f48038a) {
                return objV;
            }
        }
        return ab.f48028a;
    }
}
