package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProcessCameraProviderExtKt {
    public static final Object awaitInstance(ProcessCameraProvider.Companion companion, Context context, e<? super ProcessCameraProvider> eVar) {
        return ListenableFutureKt.await(companion.getInstance(context), eVar);
    }
}
