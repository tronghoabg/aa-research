package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OperationArgContainerKt {
    public static final long getLong(OperationArgContainer operationArgContainer, int i2, int i3) {
        return (operationArgContainer.getInt(i2) << 32) | (operationArgContainer.getInt(i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
