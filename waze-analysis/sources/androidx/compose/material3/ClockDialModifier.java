package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final AnimationSpec<Float> animationSpec;
    private final boolean autoSwitchToMinute;
    private final int selection;
    private final AnalogTimePickerState state;

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec<Float> animationSpec) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.selection = i2;
        this.animationSpec = animationSpec;
    }

    private final AnalogTimePickerState component1() {
        return this.state;
    }

    private final boolean component2() {
        return this.autoSwitchToMinute;
    }

    /* renamed from: component3-yecRtBI, reason: not valid java name */
    private final int m4528component3yecRtBI() {
        return this.selection;
    }

    private final AnimationSpec<Float> component4() {
        return this.animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-JwYzU44$default, reason: not valid java name */
    public static /* synthetic */ ClockDialModifier m4529copyJwYzU44$default(ClockDialModifier clockDialModifier, AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec animationSpec, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            analogTimePickerState = clockDialModifier.state;
        }
        if ((i3 & 2) != 0) {
            z = clockDialModifier.autoSwitchToMinute;
        }
        if ((i3 & 4) != 0) {
            i2 = clockDialModifier.selection;
        }
        if ((i3 & 8) != 0) {
            animationSpec = clockDialModifier.animationSpec;
        }
        return clockDialModifier.m4530copyJwYzU44(analogTimePickerState, z, i2, animationSpec);
    }

    /* renamed from: copy-JwYzU44, reason: not valid java name */
    public final ClockDialModifier m4530copyJwYzU44(AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec<Float> animationSpec) {
        return new ClockDialModifier(analogTimePickerState, z, i2, animationSpec, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClockDialNode create() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return x.n(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && TimePickerSelectionMode.m5901equalsimpl0(this.selection, clockDialModifier.selection) && x.n(this.animationSpec, clockDialModifier.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.state.hashCode() * 31) + ClockDialModifier$$ExternalSyntheticBackport0.m(this.autoSwitchToMinute)) * 31) + this.selection) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) TimePickerSelectionMode.m5903toStringimpl(this.selection)) + ", animationSpec=" + this.animationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClockDialNode clockDialNode) {
        clockDialNode.m4534updateNodeJwYzU44(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec);
    }

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z, int i2, AnimationSpec animationSpec, o oVar) {
        this(analogTimePickerState, z, i2, animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
