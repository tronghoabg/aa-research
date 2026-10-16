package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.graph.GraphLoop;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Result3AStateListener extends GraphLoop.Listener {
    /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
    void mo1171onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata);

    /* renamed from: onRequestSequenceCreated-DThHKJ0, reason: not valid java name */
    void mo1172onRequestSequenceCreatedDThHKJ0(long j2);

    /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
    boolean mo1173onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo);
}
