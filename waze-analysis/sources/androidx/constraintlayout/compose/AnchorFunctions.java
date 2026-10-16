package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnchorFunctions {
    public static final int $stable = 0;
    public static final AnchorFunctions INSTANCE = new AnchorFunctions();

    private AnchorFunctions() {
    }

    public final String horizontalAnchorIndexToAnchorName(int i2) {
        if (i2 == 0) {
            return "top";
        }
        if (i2 == 1) {
            return "bottom";
        }
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    public final String verticalAnchorIndexToAnchorName(int i2) {
        if (i2 == -2) {
            return TtmlNode.START;
        }
        if (i2 == -1) {
            return TtmlNode.END;
        }
        if (i2 == 0) {
            return TtmlNode.LEFT;
        }
        if (i2 == 1) {
            return TtmlNode.RIGHT;
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return TtmlNode.START;
    }
}
