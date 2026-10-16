package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import h.g.b.o;
import h.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final Selection previousSelection;
    private final Comparator<Long> selectableIdOrderingComparator;
    private final MutableLongIntMap selectableIdToInfoListIndex;
    private int startSlot;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j2;
        this.previousHandlePosition = j3;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = LongIntMapKt.mutableLongIntMapOf();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    private final int updateSlot(int i2, Direction direction, Direction direction2) {
        if (i2 != -1) {
            return i2;
        }
        Direction directionResolve2dDirection = SelectionLayoutKt.resolve2dDirection(direction, direction2);
        Direction direction3 = Direction.BEFORE;
        int iOrdinal = directionResolve2dDirection.ordinal();
        if (iOrdinal == 0) {
            return this.currentSlot - 1;
        }
        if (iOrdinal == 1) {
            return this.currentSlot;
        }
        if (iOrdinal == 2) {
            return -1;
        }
        throw new i();
    }

    public final SelectableInfo appendInfo(long j2, int i2, Direction direction, Direction direction2, int i3, Direction direction3, Direction direction4, int i4, TextLayoutResult textLayoutResult) {
        int i5 = this.currentSlot + 2;
        this.currentSlot = i5;
        SelectableInfo selectableInfo = new SelectableInfo(j2, i5, i2, i3, i4, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, direction, direction2);
        this.endSlot = updateSlot(this.endSlot, direction3, direction4);
        this.selectableIdToInfoListIndex.set(j2, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    public final SelectionLayout build() {
        int i2 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            SelectableInfo selectableInfo = (SelectableInfo) h.a.i.X(this.infoList);
            int i3 = this.startSlot;
            int i4 = i3 == -1 ? i2 : i3;
            int i5 = this.endSlot;
            return new SingleSelectionLayout(this.isStartHandle, i4, i5 != -1 ? i5 : i2, this.previousSelection, selectableInfo);
        }
        MutableLongIntMap mutableLongIntMap = this.selectableIdToInfoListIndex;
        List<SelectableInfo> list = this.infoList;
        MutableLongIntMap mutableLongIntMap2 = mutableLongIntMap;
        int i6 = this.startSlot;
        int i7 = i6 == -1 ? i2 : i6;
        int i8 = this.endSlot;
        return new MultiSelectionLayout(mutableLongIntMap2, list, i7, i8 != -1 ? i8 : i2, this.isStartHandle, this.previousSelection);
    }

    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m3872getCurrentPositionF1C5BW0() {
        return this.currentPosition;
    }

    /* renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m3873getPreviousHandlePositionF1C5BW0() {
        return this.previousHandlePosition;
    }

    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final boolean isStartHandle() {
        return this.isStartHandle;
    }

    public /* synthetic */ SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z, Selection selection, Comparator comparator, o oVar) {
        this(j2, j3, layoutCoordinates, z, selection, comparator);
    }
}
