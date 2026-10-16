package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 extends ExposedDropdownMenuBoxScopeImpl {
    final /* synthetic */ MutableState<Boolean> $alwaysFocusable;
    final /* synthetic */ MutableState<ExposedDropdownMenuAnchorType> $anchorTypeState;
    final /* synthetic */ MutableIntState $anchorWidth$delegate;
    final /* synthetic */ String $collapsedDescription;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $expandedDescription;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ MutableIntState $menuMaxHeight$delegate;
    final /* synthetic */ l<Boolean, ab> $onExpandedChange;
    final /* synthetic */ String $toggleDescription;

    /* JADX WARN: Multi-variable type inference failed */
    ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(FocusRequester focusRequester, boolean z, MutableState<Boolean> mutableState, String str, String str2, String str3, SoftwareKeyboardController softwareKeyboardController, MutableState<ExposedDropdownMenuAnchorType> mutableState2, l<? super Boolean, ab> lVar, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.$focusRequester = focusRequester;
        this.$expanded = z;
        this.$alwaysFocusable = mutableState;
        this.$expandedDescription = str;
        this.$collapsedDescription = str2;
        this.$toggleDescription = str3;
        this.$keyboardController = softwareKeyboardController;
        this.$anchorTypeState = mutableState2;
        this.$onExpandedChange = lVar;
        this.$anchorWidth$delegate = mutableIntState;
        this.$menuMaxHeight$delegate = mutableIntState2;
    }

    static final MeasureResult exposedDropdownSize$lambda$2(boolean z, MutableIntState mutableIntState, MutableIntState mutableIntState2, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int iM11124constrainWidthK40F9xA = ConstraintsKt.m11124constrainWidthK40F9xA(constraints.m11113unboximpl(), ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$5(mutableIntState));
        int iM11123constrainHeightK40F9xA = ConstraintsKt.m11123constrainHeightK40F9xA(constraints.m11113unboximpl(), ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$8(mutableIntState2));
        int iM11109getMinWidthimpl = z ? iM11124constrainWidthK40F9xA : Constraints.m11109getMinWidthimpl(constraints.m11113unboximpl());
        if (!z) {
            iM11124constrainWidthK40F9xA = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl());
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(constraints.m11113unboximpl(), iM11109getMinWidthimpl, iM11124constrainWidthK40F9xA, 0, iM11123constrainHeightK40F9xA, 4, null));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$2$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab exposedDropdownSize$lambda$2$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab menuAnchor_2Hz36ac$lambda$0(String str, MutableState mutableState) {
        if (ExposedDropdownMenuKt.m4829hasGreaterOrEqualPriorityThanvVDBVkM(str, ((ExposedDropdownMenuAnchorType) mutableState.getValue()).m4807unboximpl())) {
            mutableState.setValue(ExposedDropdownMenuAnchorType.m4801boximpl(str));
        }
        return ab.f48028a;
    }

    static final ab menuAnchor_2Hz36ac$lambda$1(MutableState mutableState, String str, l lVar, boolean z) {
        mutableState.setValue(ExposedDropdownMenuAnchorType.m4801boximpl(str));
        lVar.invoke(Boolean.valueOf(!z));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    public Modifier exposedDropdownSize(Modifier modifier, final boolean z) {
        final MutableIntState mutableIntState = this.$anchorWidth$delegate;
        final MutableIntState mutableIntState2 = this.$menuMaxHeight$delegate;
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$2(z, mutableIntState, mutableIntState2, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    public boolean getAlwaysFocusable$material3() {
        return this.$alwaysFocusable.getValue().booleanValue();
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    /* renamed from: getAnchorType-oYjWRB4$material3 */
    public String mo4814getAnchorTypeoYjWRB4$material3() {
        return this.$anchorTypeState.getValue().m4807unboximpl();
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    /* renamed from: menuAnchor-2Hz36ac */
    public Modifier mo4815menuAnchor2Hz36ac(Modifier modifier, final String str, boolean z) {
        Modifier.Companion companionM4828expandable32CpT8;
        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifier, this.$focusRequester);
        final MutableState<ExposedDropdownMenuAnchorType> mutableState = this.$anchorTypeState;
        Modifier modifierThen = modifierFocusRequester.then(new ExposedDropdownMenuAnchorElement(new a() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$0(str, mutableState);
            }
        }));
        if (z) {
            Modifier.Companion companion = Modifier.Companion;
            final boolean z2 = this.$expanded;
            final MutableState<ExposedDropdownMenuAnchorType> mutableState2 = this.$anchorTypeState;
            final l<Boolean, ab> lVar = this.$onExpandedChange;
            companionM4828expandable32CpT8 = ExposedDropdownMenuKt.m4828expandable32CpT8(companion, z2, new a() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$1(mutableState2, str, lVar, z2);
                }
            }, str, this.$alwaysFocusable, this.$expandedDescription, this.$collapsedDescription, this.$toggleDescription, this.$keyboardController);
        } else {
            companionM4828expandable32CpT8 = Modifier.Companion;
        }
        return modifierThen.then(companionM4828expandable32CpT8);
    }
}
