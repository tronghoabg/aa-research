package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameMetadata;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Result3AStateListenerKt {
    public static final l<FrameMetadata, Boolean> toConditionChecker(final Map<CaptureResult.Key<?>, ? extends List<? extends Object>> map) {
        x.f(map, "<this>");
        return new l() { // from class: androidx.camera.camera2.pipe.graph.Result3AStateListenerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Result3AStateListenerKt.toConditionChecker$lambda$0(map, (FrameMetadata) obj));
            }
        };
    }

    static final boolean toConditionChecker$lambda$0(Map map, FrameMetadata frameMetadata) {
        x.f(frameMetadata, "frameMetadata");
        for (Map.Entry entry : map.entrySet()) {
            CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
            if (!i.ax((List) entry.getValue(), frameMetadata.get(key))) {
                return false;
            }
        }
        return true;
    }
}
