package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.composer.GroupSourceInformation;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilder;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BuilderTraceBuilder extends ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final SlotTableBuilder builder;

    public BuilderTraceBuilder(SlotTableBuilder slotTableBuilder) {
        this.builder = slotTableBuilder;
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public int groupKeyOf(Anchor anchor) {
        return this.builder.groupKey(LinkAnchorKt.asLinkAnchor(anchor).getAddress());
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public GroupSourceInformation sourceInformationOf(Anchor anchor) {
        return this.builder.getTable().getAddressSpace().sourceInformationOf(LinkAnchorKt.asLinkAnchor(anchor).getAddress());
    }
}
