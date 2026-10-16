package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.media3.muxer.MuxerUtil;
import e.c.d.a;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        float x = dragAndDropEvent.getDragEvent$ui().getX();
        float y = dragAndDropEvent.getDragEvent$ui().getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final Set<String> mimeTypes(DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui().getClipDescription();
        if (clipDescription == null) {
            return a.p();
        }
        Set setN = a.n(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i2 = 0; i2 < mimeTypeCount; i2++) {
            setN.add(clipDescription.getMimeType(i2));
        }
        return a.l(setN);
    }

    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui();
    }
}
