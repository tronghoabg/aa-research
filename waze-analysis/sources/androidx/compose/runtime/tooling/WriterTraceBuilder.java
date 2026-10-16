package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.composer.GroupSourceInformation;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WriterTraceBuilder extends ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final SlotWriter writer;

    public WriterTraceBuilder(SlotWriter slotWriter) {
        this.writer = slotWriter;
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public int groupKeyOf(Anchor anchor) {
        return this.writer.groupKey(this.writer.anchorIndex(GapAnchorKt.asGapAnchor(anchor)));
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public GroupSourceInformation sourceInformationOf(Anchor anchor) {
        return this.writer.sourceInformationOf$runtime(this.writer.anchorIndex(GapAnchorKt.asGapAnchor(anchor)));
    }
}
