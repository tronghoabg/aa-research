package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    private final ClipData clipData;
    private final int flags;
    private final Object localState;

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i2, int i3, o oVar) {
        this(clipData, (i3 & 2) != 0 ? null : obj, (i3 & 4) != 0 ? 0 : i2);
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Object getLocalState() {
        return this.localState;
    }

    public DragAndDropTransferData(ClipData clipData, Object obj, int i2) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i2;
    }
}
