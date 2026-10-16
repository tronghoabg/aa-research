package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import h.a.ac;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeStackTraceBuilderKt {
    public static final List<ComposeStackTraceFrame> buildTrace(SlotWriter slotWriter, Object obj, int i2, Integer num) {
        int iGroupKey;
        if (slotWriter.getClosed() || slotWriter.getSize$runtime() == 0) {
            return ac.f47967a;
        }
        WriterTraceBuilder writerTraceBuilder = new WriterTraceBuilder(slotWriter);
        int iIntValue = num != null ? num.intValue() : slotWriter.getParent() < 0 ? slotWriter.parent(i2) : slotWriter.getParent();
        if (obj == null) {
            obj = Integer.valueOf(slotWriter.groupSlotIndex(i2));
        }
        if (slotWriter.isValid(i2)) {
            iGroupKey = slotWriter.groupKey(i2);
        } else {
            int iParent = iIntValue >= 0 ? slotWriter.parent(iIntValue) : iIntValue;
            iGroupKey = slotWriter.groupKey(iIntValue);
            int i3 = iIntValue;
            iIntValue = iParent;
            i2 = i3;
        }
        while (i2 >= 0) {
            writerTraceBuilder.processEdge(iGroupKey, slotWriter.hasObjectKey(i2) ? slotWriter.groupObjectKey(i2) : Composer.Companion.getEmpty(), slotWriter.sourceInformationOf$runtime(i2), obj);
            obj = slotWriter.anchor(i2);
            if (iIntValue >= 0) {
                int iParent2 = slotWriter.parent(iIntValue);
                iGroupKey = slotWriter.groupKey(iIntValue);
                int i4 = iIntValue;
                iIntValue = iParent2;
                i2 = i4;
            } else {
                i2 = iIntValue;
            }
        }
        return writerTraceBuilder.trace();
    }

    public static /* synthetic */ List buildTrace$default(SlotWriter slotWriter, Object obj, int i2, Integer num, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i2 = slotWriter.getCurrentGroup();
        }
        if (1 == (i3 & 1)) {
            obj = null;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        return buildTrace(slotWriter, obj, i2, num);
    }

    public static final ObjectLocation findLocation(SlotTable slotTable, l<Object, Boolean> lVar) {
        ObjectLocation objectLocation;
        ObjectLocation objectLocation2;
        SlotReader slotReaderOpenReader = slotTable.openReader();
        int i2 = 0;
        loop0: while (true) {
            try {
                objectLocation = null;
                if (i2 >= slotTable.getGroupsSize()) {
                    break;
                }
                if (slotReaderOpenReader.isNode(i2) && lVar.invoke(slotReaderOpenReader.node(i2)).booleanValue()) {
                    objectLocation2 = new ObjectLocation(i2, null);
                    break;
                }
                int iSlotSize = slotReaderOpenReader.slotSize(i2);
                for (int i3 = 0; i3 < iSlotSize; i3++) {
                    if (lVar.invoke(slotReaderOpenReader.groupGet(i2, i3)).booleanValue()) {
                        objectLocation2 = new ObjectLocation(i2, Integer.valueOf(i3));
                        break loop0;
                    }
                }
                i2++;
            } finally {
                slotReaderOpenReader.close();
            }
        }
        objectLocation = objectLocation2;
        return objectLocation;
    }

    public static final Integer findSubcompositionContextGroup(SlotTable slotTable, CompositionContext compositionContext) {
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            return findSubcompositionContextGroup$lambda$0$scanGroup(slotReaderOpenReader, compositionContext, 0, slotReaderOpenReader.getSize());
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final Integer findSubcompositionContextGroup$lambda$0$scanGroup(SlotReader slotReader, CompositionContext compositionContext, int i2, int i3) {
        Integer numFindSubcompositionContextGroup$lambda$0$scanGroup;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int iGroupSize = slotReader.groupSize(i2) + i2;
            if (slotReader.hasMark(i2) && slotReader.groupKey(i2) == 206 && x.n(slotReader.groupObjectKey(i2), ComposerKt.getReference())) {
                Object objGroupGet = slotReader.groupGet(i2, 0);
                RememberObserverHolder rememberObserverHolder = objGroupGet instanceof RememberObserverHolder ? (RememberObserverHolder) objGroupGet : null;
                Object wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                GapComposer.CompositionContextHolder compositionContextHolder = wrapped instanceof GapComposer.CompositionContextHolder ? (GapComposer.CompositionContextHolder) wrapped : null;
                if (compositionContextHolder != null && x.n(compositionContextHolder.getRef(), compositionContext)) {
                    return Integer.valueOf(i2);
                }
            }
            if (slotReader.containsMark(i2) && (numFindSubcompositionContextGroup$lambda$0$scanGroup = findSubcompositionContextGroup$lambda$0$scanGroup(slotReader, compositionContext, i2 + 1, iGroupSize)) != null) {
                return Integer.valueOf(numFindSubcompositionContextGroup$lambda$0$scanGroup.intValue());
            }
            i2 = iGroupSize;
        }
    }

    public static final List<ComposeStackTraceFrame> traceForGroup(SlotReader slotReader, int i2, Object obj) {
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int iParent = slotReader.parent(i2);
        GapAnchor gapAnchorAnchor = slotReader.anchor(i2);
        while (i2 >= 0) {
            readerTraceBuilder.processEdge(slotReader.groupKey(i2), slotReader.hasObjectKey(i2) ? slotReader.groupObjectKey(i2) : Composer.Companion.getEmpty(), slotReader.getTable$runtime().sourceInformationOf(i2), obj);
            if (iParent >= 0) {
                GapAnchor gapAnchor = gapAnchorAnchor;
                gapAnchorAnchor = slotReader.anchor(iParent);
                i2 = iParent;
                iParent = slotReader.parent(iParent);
                obj = gapAnchor;
            } else {
                i2 = iParent;
                obj = gapAnchorAnchor;
            }
        }
        return readerTraceBuilder.trace();
    }

    public static final List<ComposeStackTraceFrame> buildTrace(SlotReader slotReader) {
        Object empty;
        if (!slotReader.getClosed() && slotReader.getSize() != 0) {
            ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
            int parent = slotReader.getParent();
            Object objValueOf = Integer.valueOf(slotReader.getSlot());
            while (parent >= 0) {
                if (slotReader.hasObjectKey(parent)) {
                    empty = slotReader.groupObjectKey(parent);
                } else {
                    empty = Composer.Companion.getEmpty();
                }
                readerTraceBuilder.processEdge(slotReader.groupKey(parent), empty, slotReader.getTable$runtime().sourceInformationOf(parent), objValueOf);
                objValueOf = slotReader.anchor(parent);
                parent = slotReader.parent(parent);
            }
            return readerTraceBuilder.trace();
        }
        return ac.f47967a;
    }
}
