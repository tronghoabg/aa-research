package androidx.camera.video;

import android.content.Context;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import h.c.e;
import h.c.g;
import h.c.h;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PendingRecording {
    private final Context applicationContext;
    private Consumer<VideoRecordEvent> eventListener;
    private boolean isAudioEnabled;
    private boolean isAudioInitialMuted;
    private boolean isPersistent;
    private Executor listenerExecutor;
    private final OutputOptions outputOptions;
    private final Recorder recorder;

    public PendingRecording(Context context, Recorder recorder, OutputOptions outputOptions) {
        x.f(context, "context");
        x.f(recorder, "recorder");
        x.f(outputOptions, "outputOptions");
        this.recorder = recorder;
        this.outputOptions = outputOptions;
        Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
        x.e(persistentApplicationContext, "getPersistentApplicationContext(...)");
        this.applicationContext = persistentApplicationContext;
    }

    public static /* synthetic */ PendingRecording withAudioEnabled$default(PendingRecording pendingRecording, boolean z, int i2, Object obj) {
        pendingRecording.withAudioEnabled(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
        return pendingRecording;
    }

    public final PendingRecording asPersistentRecording() {
        this.isPersistent = true;
        return this;
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final Consumer<VideoRecordEvent> getEventListener() {
        return this.eventListener;
    }

    public final Executor getListenerExecutor() {
        return this.listenerExecutor;
    }

    public final OutputOptions getOutputOptions() {
        return this.outputOptions;
    }

    public final Recorder getRecorder() {
        return this.recorder;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isAudioInitialMuted() {
        return this.isAudioInitialMuted;
    }

    public final boolean isPersistent() {
        return this.isPersistent;
    }

    public final Object start(Consumer<VideoRecordEvent> consumer, e<? super Recording> eVar) {
        Executor executorDirectExecutor;
        h hVar = eVar.getContext().get(g.f48059a);
        ab abVar = hVar instanceof ab ? (ab) hVar : null;
        if (abVar != null) {
            executorDirectExecutor = bo.e(abVar);
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            x.e(executorDirectExecutor, "directExecutor(...)");
        }
        return start(executorDirectExecutor, consumer);
    }

    public final PendingRecording withAudioEnabled(boolean z) {
        if (PermissionChecker.checkSelfPermission(this.applicationContext, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        Preconditions.checkState(this.recorder.isAudioSupported(), "The Recorder this recording is associated to doesn't support audio.");
        this.isAudioEnabled = true;
        this.isAudioInitialMuted = z;
        return this;
    }

    public final PendingRecording withAudioEnabled() {
        withAudioEnabled$default(this, false, 1, null);
        return this;
    }

    public final Recording start(Executor executor, Consumer<VideoRecordEvent> consumer) {
        x.f(executor, "listenerExecutor");
        x.f(consumer, "listener");
        Preconditions.checkNotNull(executor, "Listener Executor can't be null.");
        Preconditions.checkNotNull(consumer, "Event listener can't be null");
        this.listenerExecutor = executor;
        this.eventListener = consumer;
        Recording recordingStart = this.recorder.start(this);
        x.e(recordingStart, "start(...)");
        return recordingStart;
    }
}
