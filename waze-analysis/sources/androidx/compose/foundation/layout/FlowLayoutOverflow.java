package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import h.ab;
import h.d.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;
    private final l<FlowLayoutOverflowState, p<Composer, Integer, ab>> collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final l<FlowLayoutOverflowState, p<Composer, Integer, ab>> seeMoreGetter;
    private final OverflowType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class OverflowType {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ OverflowType[] $VALUES;
        public static final OverflowType Visible = new OverflowType("Visible", 0);
        public static final OverflowType Clip = new OverflowType("Clip", 1);
        public static final OverflowType ExpandIndicator = new OverflowType("ExpandIndicator", 2);
        public static final OverflowType ExpandOrCollapseIndicator = new OverflowType("ExpandOrCollapseIndicator", 3);

        private static final /* synthetic */ OverflowType[] $values() {
            return new OverflowType[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
        }

        static {
            OverflowType[] overflowTypeArr$values = $values();
            $VALUES = overflowTypeArr$values;
            $ENTRIES = b.a(overflowTypeArr$values);
        }

        private OverflowType(String str, int i2) {
        }

        public static h.d.a<OverflowType> getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, l lVar, l lVar2, int i4, o oVar) {
        this(overflowType, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : lVar, (i4 & 16) != 0 ? null : lVar2, null);
    }

    public final void addOverflowComposables$foundation_layout(FlowLayoutOverflowState flowLayoutOverflowState, List<p<Composer, Integer, ab>> list) {
        l<FlowLayoutOverflowState, p<Composer, Integer, ab>> lVar = this.seeMoreGetter;
        p<Composer, Integer, ab> pVarInvoke = lVar != null ? lVar.invoke(flowLayoutOverflowState) : null;
        l<FlowLayoutOverflowState, p<Composer, Integer, ab>> lVar2 = this.collapseGetter;
        p<Composer, Integer, ab> pVarInvoke2 = lVar2 != null ? lVar2.invoke(flowLayoutOverflowState) : null;
        OverflowType overflowType = this.type;
        OverflowType overflowType2 = OverflowType.Visible;
        int iOrdinal = overflowType.ordinal();
        if (iOrdinal == 2) {
            if (pVarInvoke != null) {
                list.add(pVarInvoke);
            }
        } else {
            if (iOrdinal != 3) {
                return;
            }
            if (pVarInvoke != null) {
                list.add(pVarInvoke);
            }
            if (pVarInvoke2 != null) {
                list.add(pVarInvoke2);
            }
        }
    }

    public final FlowLayoutOverflowState createOverflowState$foundation_layout() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    public final OverflowType getType$foundation_layout() {
        return this.type;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, l lVar, l lVar2, o oVar) {
        this(overflowType, i2, i3, lVar, lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i2;
        this.minCrossAxisSizeToShowCollapse = i3;
        this.seeMoreGetter = lVar;
        this.collapseGetter = lVar2;
    }
}
