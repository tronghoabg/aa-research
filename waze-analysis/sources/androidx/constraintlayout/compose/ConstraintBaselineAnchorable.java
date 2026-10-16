package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ConstraintBaselineAnchorable implements BaselineAnchorable {
    private final CLObject containerObject;

    public ConstraintBaselineAnchorable(CLObject cLObject) {
        this.containerObject = cLObject;
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public void mo11429linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f2, float f3) {
        String strHorizontalAnchorIndexToAnchorName = AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(horizontalAnchor.getIndex$constraintlayout_compose());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(horizontalAnchor.getId$constraintlayout_compose().toString()));
        cLArray.add(CLString.from(strHorizontalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(f2));
        cLArray.add(new CLNumber(f3));
        this.containerObject.put("baseline", cLArray);
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public void mo11428linkToVpY3zN4(ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f2, float f3) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(baselineAnchor.getId$constraintlayout_compose().toString()));
        cLArray.add(CLString.from("baseline"));
        cLArray.add(new CLNumber(f2));
        cLArray.add(new CLNumber(f3));
        this.containerObject.put("baseline", cLArray);
    }
}
