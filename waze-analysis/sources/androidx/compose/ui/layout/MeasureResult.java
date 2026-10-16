package androidx.compose.ui.layout;

import h.ab;
import h.g.a.l;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MeasureResult {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.MeasureResult$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static l $default$getRulers(MeasureResult measureResult) {
            return null;
        }
    }

    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    l<RulerScope, ab> getRulers();

    int getWidth();

    void placeChildren();
}
