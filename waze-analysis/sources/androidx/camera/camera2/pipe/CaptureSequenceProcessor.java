package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.Request;
import h.ab;
import h.c.e;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CaptureSequenceProcessor<TCaptureRequest, TCaptureSequence extends CaptureSequence<? extends TCaptureRequest>> {
    void abortCaptures();

    TCaptureSequence build(boolean z, List<Request> list, Map<?, ? extends Object> map, Map<?, ? extends Object> map2, Map<?, ? extends Object> map3, CaptureSequence.CaptureSequenceListener captureSequenceListener, List<? extends Request.Listener> list2);

    Object shutdown(e<? super ab> eVar);

    void stopRepeating();

    Integer submit(TCaptureSequence tcapturesequence);
}
