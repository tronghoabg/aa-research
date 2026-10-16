package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import h.a.ac;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableReaderKt {
    public static final List<ComposeStackTraceFrame> buildTrace(SlotTableReader slotTableReader) {
        return (slotTableReader.isClosed() || slotTableReader.isEmpty()) ? ac.f47967a : SlotTableAddresSpaceKt.buildTrace(slotTableReader.getTable().getAddressSpace(), slotTableReader.getParentGroup(), Integer.valueOf(slotTableReader.getSlotIndex()), new ReaderTraceBuilder(slotTableReader));
    }

    public static final List<ComposeStackTraceFrame> traceForGroup(SlotTableReader slotTableReader, int i2, Object obj) {
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotTableReader);
        SlotTableAddressSpace addressSpace = slotTableReader.getTable().getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i3 = i2;
        while (i3 > 0) {
            readerTraceBuilder.processEdge(slotTableReader.groupKey(i3), slotTableReader.groupObjectKey(i3), addressSpace.sourceInformationOf(i3), obj);
            obj = addressSpace.anchorOfAddress(i3);
            i3 = groups[i3 + 2];
        }
        if (i3 == 0) {
            ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
        }
        return readerTraceBuilder.trace();
    }
}
