package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.composer.GroupSourceInformation;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ReaderTraceBuilder extends ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final SlotReader reader;

    public ReaderTraceBuilder(SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public int groupKeyOf(Anchor anchor) {
        return this.reader.groupKey(this.reader.getTable$runtime().anchorIndex(GapAnchorKt.asGapAnchor(anchor)));
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public GroupSourceInformation sourceInformationOf(Anchor anchor) {
        SlotReader slotReader = this.reader;
        return slotReader.getTable$runtime().sourceInformationOf(slotReader.getTable$runtime().anchorIndex(GapAnchorKt.asGapAnchor(anchor)));
    }
}
