package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Dp> animationSpec;
    private final boolean followContentSize;
    private final int selectedTabIndex;
    private final State<List<TabPosition>> tabPositionsState;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(State<? extends List<TabPosition>> state, int i2, boolean z, FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i2;
        this.followContentSize = z;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier, State state, int i2, boolean z, FiniteAnimationSpec finiteAnimationSpec, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            state = tabIndicatorModifier.tabPositionsState;
        }
        if ((i3 & 2) != 0) {
            i2 = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i3 & 4) != 0) {
            z = tabIndicatorModifier.followContentSize;
        }
        if ((i3 & 8) != 0) {
            finiteAnimationSpec = tabIndicatorModifier.animationSpec;
        }
        return tabIndicatorModifier.copy(state, i2, z, finiteAnimationSpec);
    }

    public final State<List<TabPosition>> component1() {
        return this.tabPositionsState;
    }

    public final int component2() {
        return this.selectedTabIndex;
    }

    public final boolean component3() {
        return this.followContentSize;
    }

    public final FiniteAnimationSpec<Dp> component4() {
        return this.animationSpec;
    }

    public final TabIndicatorModifier copy(State<? extends List<TabPosition>> state, int i2, boolean z, FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        return new TabIndicatorModifier(state, i2, z, finiteAnimationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TabIndicatorOffsetNode create() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize, this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return x.n(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize && x.n(this.animationSpec, tabIndicatorModifier.animationSpec);
    }

    public final FiniteAnimationSpec<Dp> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.tabPositionsState.hashCode() * 31;
        FiniteAnimationSpec<Dp> finiteAnimationSpec = this.animationSpec;
        return ((((iHashCode + this.selectedTabIndex) * 31) + TabIndicatorModifier$$ExternalSyntheticBackport0.m(this.followContentSize)) * 31) + finiteAnimationSpec.hashCode();
    }

    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.tabPositionsState + ", selectedTabIndex=" + this.selectedTabIndex + ", followContentSize=" + this.followContentSize + ", animationSpec=" + this.animationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TabIndicatorOffsetNode tabIndicatorOffsetNode) {
        tabIndicatorOffsetNode.setTabPositionsState(this.tabPositionsState);
        tabIndicatorOffsetNode.setSelectedTabIndex(this.selectedTabIndex);
        tabIndicatorOffsetNode.setFollowContentSize(this.followContentSize);
        tabIndicatorOffsetNode.setAnimationSpec(this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
