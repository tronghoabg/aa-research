package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CombinedAlignment implements Alignment {
    private final Alignment.Horizontal horizontal;
    private final Alignment.Vertical vertical;

    public CombinedAlignment(Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo7648alignKFBX0sM(long j2, long j3, LayoutDirection layoutDirection) {
        long jAlign = this.horizontal.align((int) (j2 >> 32), (int) (j3 >> 32), layoutDirection);
        long j4 = j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        return (this.vertical.align((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (int) j4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jAlign << 32);
    }
}
