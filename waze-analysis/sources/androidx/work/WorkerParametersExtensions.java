package androidx.work;

import android.content.ComponentName;
import androidx.work.Data;
import androidx.work.impl.utils.EnqueueUtilsKt;
import h.g.b.x;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkerParametersExtensions {
    public static final Data buildDelegatedRemoteRequestData(String str, ComponentName componentName, Data data) {
        x.f(str, "delegatedWorkerName");
        x.f(componentName, "componentName");
        x.f(data, "inputData");
        Data.Builder builder = new Data.Builder();
        builder.putAll(data);
        builder.putString(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, componentName.getPackageName());
        builder.putString(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, componentName.getClassName());
        builder.putString(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, str);
        return builder.build();
    }

    public static final boolean isRemoteWorkRequest(Data data) {
        x.f(data, "<this>");
        return data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, String.class);
    }

    public static final WorkerParameters usingRemoteService(WorkerParameters workerParameters, String str, ComponentName componentName) {
        x.f(workerParameters, "<this>");
        x.f(str, "workerClassName");
        x.f(componentName, "componentName");
        UUID id = workerParameters.getId();
        Data inputData = workerParameters.getInputData();
        x.e(inputData, "getInputData(...)");
        return new WorkerParameters(id, buildDelegatedRemoteRequestData(str, componentName, inputData), workerParameters.getTags(), workerParameters.getRuntimeExtras(), workerParameters.getRunAttemptCount(), workerParameters.getGeneration(), workerParameters.getBackgroundExecutor(), workerParameters.getWorkerContext(), workerParameters.getTaskExecutor(), workerParameters.getWorkerFactory(), workerParameters.getProgressUpdater(), workerParameters.getForegroundUpdater());
    }

    public static final boolean isRemoteWorkRequest(WorkerParameters workerParameters) {
        x.f(workerParameters, "<this>");
        Data inputData = workerParameters.getInputData();
        x.e(inputData, "getInputData(...)");
        return isRemoteWorkRequest(inputData);
    }

    public static final /* synthetic */ <T extends ListenableWorker> WorkerParameters usingRemoteService(WorkerParameters workerParameters, ComponentName componentName) {
        x.f(workerParameters, "<this>");
        x.f(componentName, "componentName");
        x.i();
        String name = ListenableWorker.class.getName();
        x.e(name, "getName(...)");
        return usingRemoteService(workerParameters, name, componentName);
    }
}
