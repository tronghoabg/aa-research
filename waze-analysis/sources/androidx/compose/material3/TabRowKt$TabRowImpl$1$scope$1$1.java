package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import h.a.i;
import h.g.a.q;
import h.g.a.r;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TabRowKt$TabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {
    final /* synthetic */ FiniteAnimationSpec<Dp> $tabIndicatorAnimationSpec;
    private final MutableState<List<TabPosition>> tabPositions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(i.h(), null, 2, null);

    TabRowKt$TabRowImpl$1$scope$1$1(FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.$tabIndicatorAnimationSpec = finiteAnimationSpec;
    }

    static final MeasureResult tabIndicatorLayout$lambda$0(r rVar, TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return (MeasureResult) rVar.invoke(measureScope, measurable, constraints, tabRowKt$TabRowImpl$1$scope$1$1.tabPositions.getValue());
    }

    public final MutableState<List<TabPosition>> getTabPositions() {
        return this.tabPositions;
    }

    @Override // androidx.compose.material3.TabPositionsHolder
    public void setTabPositions(List<TabPosition> list) {
        this.tabPositions.setValue(list);
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier tabIndicatorLayout(Modifier modifier, final r<? super MeasureScope, ? super Measurable, ? super Constraints, ? super List<TabPosition>, ? extends MeasureResult> rVar) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TabRowKt$TabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0(rVar, this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier tabIndicatorOffset(Modifier modifier, int i2, boolean z) {
        return modifier.then(new TabIndicatorModifier(this.tabPositions, i2, z, this.$tabIndicatorAnimationSpec));
    }
}
