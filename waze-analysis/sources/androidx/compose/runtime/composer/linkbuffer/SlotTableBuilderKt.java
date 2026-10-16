package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import h.a.ac;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableBuilderKt {
    public static final List<ComposeStackTraceFrame> buildTrace(SlotTableBuilder slotTableBuilder) {
        return (slotTableBuilder.isClosed() || slotTableBuilder.isEmpty()) ? ac.f47967a : SlotTableAddresSpaceKt.buildTrace(slotTableBuilder.getTable().getAddressSpace(), slotTableBuilder.getParentGroup(), Integer.valueOf(slotTableBuilder.getSlotIndex()), new BuilderTraceBuilder(slotTableBuilder));
    }

    public static final boolean contains(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    private static final int lastSiblingOf(int i2, SlotTableAddressSpace slotTableAddressSpace) {
        int i3 = -1;
        if (i2 == -1) {
            return -1;
        }
        int[] groups = slotTableAddressSpace.getGroups();
        while (i2 >= 0) {
            i3 = i2;
            i2 = groups[i2 + 1];
        }
        return i3;
    }
}
