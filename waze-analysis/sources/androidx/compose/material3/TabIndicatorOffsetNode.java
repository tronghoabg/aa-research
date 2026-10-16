package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import java.util.List;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private FiniteAnimationSpec<Dp> animationSpec;
    private boolean followContentSize;
    private Dp initialOffset;
    private Dp initialWidth;
    private Animatable<Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<Dp, AnimationVector1D> widthAnimatable;

    public TabIndicatorOffsetNode(State<? extends List<TabPosition>> state, int i2, boolean z, FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i2;
        this.followContentSize = z;
        this.animationSpec = finiteAnimationSpec;
    }

    static final ab measure_3p2s80s$lambda$3(Placeable placeable, float f2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo2121roundToPx0680j_4(f2), 0, 0.0f, 4, null);
        return ab.f48028a;
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new l() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        boolean z = this.followContentSize;
        State<? extends List<TabPosition>> state = this.tabPositionsState;
        float fM5707getContentWidthD9Ej5fM = z ? state.getValue().get(this.selectedTabIndex).m5707getContentWidthD9Ej5fM() : state.getValue().get(this.selectedTabIndex).m5710getWidthD9Ej5fM();
        Dp dp = this.initialWidth;
        if (dp != null) {
            Animatable<Dp, AnimationVector1D> animatable = this.widthAnimatable;
            if (animatable == null) {
                animatable = new Animatable<>(dp, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.widthAnimatable = animatable;
            }
            if (!Dp.m11169equalsimpl0(fM5707getContentWidthD9Ej5fM, animatable.getTargetValue().m11178unboximpl())) {
                aj.z(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, fM5707getContentWidthD9Ej5fM, this, null), 3);
            }
        } else {
            this.initialWidth = Dp.m11162boximpl(fM5707getContentWidthD9Ej5fM);
        }
        final float fM5708getLeftD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m5708getLeftD9Ej5fM();
        Dp dp2 = this.initialOffset;
        if (dp2 != null) {
            Animatable<Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                Animatable<Dp, AnimationVector1D> animatable3 = new Animatable<>(dp2, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.offsetAnimatable = animatable3;
                animatable2 = animatable3;
            }
            if (!Dp.m11169equalsimpl0(fM5708getLeftD9Ej5fM, animatable2.getTargetValue().m11178unboximpl())) {
                aj.z(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, fM5708getLeftD9Ej5fM, this, null), 3);
            }
        } else {
            this.initialOffset = Dp.m11162boximpl(fM5708getLeftD9Ej5fM);
        }
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        Animatable<Dp, AnimationVector1D> animatable4 = this.offsetAnimatable;
        if (layoutDirection != layoutDirection2) {
            if (animatable4 != null) {
                fM5708getLeftD9Ej5fM = animatable4.getValue().m11178unboximpl();
            }
            fM5708getLeftD9Ej5fM = -fM5708getLeftD9Ej5fM;
        } else if (animatable4 != null) {
            fM5708getLeftD9Ej5fM = animatable4.getValue().m11178unboximpl();
        }
        Animatable<Dp, AnimationVector1D> animatable5 = this.widthAnimatable;
        if (animatable5 != null) {
            fM5707getContentWidthD9Ej5fM = animatable5.getValue().m11178unboximpl();
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, measureScope.mo2121roundToPx0680j_4(fM5707getContentWidthD9Ej5fM), measureScope.mo2121roundToPx0680j_4(fM5707getContentWidthD9Ej5fM), 0, 0, 12, null));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TabIndicatorOffsetNode.measure_3p2s80s$lambda$3(placeableMo9741measureBRTryo0, fM5708getLeftD9Ej5fM, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setFollowContentSize(boolean z) {
        this.followContentSize = z;
    }

    public final void setSelectedTabIndex(int i2) {
        this.selectedTabIndex = i2;
    }

    public final void setTabPositionsState(State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }
}
