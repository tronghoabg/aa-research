package androidx.work;

import android.content.Context;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DefaultWorkerFactory extends WorkerFactory {
    public static final DefaultWorkerFactory INSTANCE = new DefaultWorkerFactory();

    private DefaultWorkerFactory() {
    }

    /* renamed from: createWorker, reason: collision with other method in class */
    public Void m13460createWorker(Context context, String str, WorkerParameters workerParameters) {
        x.f(context, "appContext");
        x.f(str, "workerClassName");
        x.f(workerParameters, "workerParameters");
        return null;
    }

    @Override // androidx.work.WorkerFactory
    public /* bridge */ /* synthetic */ ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        m13460createWorker(context, str, workerParameters);
        return null;
    }
}
