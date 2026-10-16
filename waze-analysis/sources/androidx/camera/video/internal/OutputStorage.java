package androidx.camera.video.internal;

import androidx.camera.video.OutputOptions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface OutputStorage {

    /* compiled from: WazeSource */
    public interface Factory {
        OutputStorage create(OutputOptions outputOptions);
    }

    long getAvailableBytes();

    OutputOptions getOutputOptions();
}
