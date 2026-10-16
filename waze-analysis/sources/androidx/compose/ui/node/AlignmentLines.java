package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.media3.muxer.MuxerUtil;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AlignmentLines {
    public static final int $stable = 8;
    private final Map<AlignmentLine, Integer> alignmentLineMap;
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAlignmentLine(AlignmentLine alignmentLine, int i2, NodeCoordinator nodeCoordinator) {
        long jMo9903calculatePositionInParentR5De75A;
        float f2 = i2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        loop0: while (true) {
            jMo9903calculatePositionInParentR5De75A = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo9903calculatePositionInParentR5De75A = mo9903calculatePositionInParentR5De75A(nodeCoordinator, jMo9903calculatePositionInParentR5De75A);
                nodeCoordinator = nodeCoordinator.getWrappedBy$ui();
                if (nodeCoordinator == null) {
                    x.g();
                }
                if (x.n(nodeCoordinator, this.alignmentLinesOwner.getInnerCoordinator())) {
                    break loop0;
                }
            } while (!getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine));
            float positionFor = getPositionFor(nodeCoordinator, alignmentLine);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(positionFor);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(positionFor);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        }
        float fIntBitsToFloat = alignmentLine instanceof HorizontalAlignmentLine ? Float.intBitsToFloat((int) (jMo9903calculatePositionInParentR5De75A & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : Float.intBitsToFloat((int) (jMo9903calculatePositionInParentR5De75A >> 32));
        Map<AlignmentLine, Integer> map = this.alignmentLineMap;
        int iRound = Math.round(fIntBitsToFloat);
        if (map.containsKey(alignmentLine)) {
            iRound = AlignmentLineKt.merge(alignmentLine, ((Number) r.h(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    /* renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    protected abstract long mo9903calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j2);

    protected abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator);

    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui() {
        return this.dirty;
    }

    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    protected abstract int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean getPreviousUsedDuringParentLayout$ui() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui() {
        recalculateQueryOwner();
        return this.queryOwner != null;
    }

    public final boolean getUsedByModifierLayout$ui() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui() {
        return this.usedDuringParentMeasurement;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.requestMeasure();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new AnonymousClass1());
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        boolean queried$ui = getQueried$ui();
        AlignmentLinesOwner alignmentLinesOwner = this.alignmentLinesOwner;
        if (!queried$ui) {
            AlignmentLinesOwner parentAlignmentLinesOwner = alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().queryOwner;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.queryOwner;
                if (alignmentLinesOwner2 == null || alignmentLinesOwner2.getAlignmentLines().getQueried$ui()) {
                    return;
                }
                AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                    alignmentLines2.recalculateQueryOwner();
                }
                AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                alignmentLinesOwner = null;
                if (parentAlignmentLinesOwner3 != null && (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) != null) {
                    alignmentLinesOwner = alignmentLines.queryOwner;
                }
            }
        }
        this.queryOwner = alignmentLinesOwner;
    }

    public final void reset$ui() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui(boolean z) {
        this.dirty = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void setUsedByModifierLayout$ui(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void setUsedByModifierMeasurement$ui(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void setUsedDuringParentLayout$ui(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void setUsedDuringParentMeasurement$ui(boolean z) {
        this.usedDuringParentMeasurement = z;
    }

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, o oVar) {
        this(alignmentLinesOwner);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.AlignmentLines$recalculate$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<AlignmentLinesOwner, ab> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
            if (alignmentLinesOwner.getPlaceOrder() == Integer.MAX_VALUE) {
                return;
            }
            if (alignmentLinesOwner.getAlignmentLines().getDirty$ui()) {
                alignmentLinesOwner.layoutChildren();
            }
            Map map = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
            AlignmentLines alignmentLines = AlignmentLines.this;
            for (Map.Entry entry : map.entrySet()) {
                alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
            }
            NodeCoordinator wrappedBy$ui = alignmentLinesOwner.getInnerCoordinator().getWrappedBy$ui();
            if (wrappedBy$ui == null) {
                x.g();
            }
            while (!x.n(wrappedBy$ui, AlignmentLines.this.getAlignmentLinesOwner().getInnerCoordinator())) {
                Set<AlignmentLine> setKeySet = AlignmentLines.this.getAlignmentLinesMap(wrappedBy$ui).keySet();
                AlignmentLines alignmentLines2 = AlignmentLines.this;
                for (AlignmentLine alignmentLine : setKeySet) {
                    alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui, alignmentLine), wrappedBy$ui);
                }
                wrappedBy$ui = wrappedBy$ui.getWrappedBy$ui();
                if (wrappedBy$ui == null) {
                    x.g();
                }
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(AlignmentLinesOwner alignmentLinesOwner) {
            invoke2(alignmentLinesOwner);
            return ab.f48028a;
        }
    }
}
