package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {
    public static final int $stable = 8;
    private final String anchorName;
    private final CLObject containerObject;

    public BaseHorizontalAnchorable(CLObject cLObject, int i2) {
        this.containerObject = cLObject;
        this.anchorName = AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(i2);
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo11426linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f2, float f3) {
        String strHorizontalAnchorIndexToAnchorName = AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(horizontalAnchor.getIndex$constraintlayout_compose());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(horizontalAnchor.getId$constraintlayout_compose().toString()));
        cLArray.add(CLString.from(strHorizontalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(f2));
        cLArray.add(new CLNumber(f3));
        this.containerObject.put(this.anchorName, cLArray);
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo11425linkToVpY3zN4(ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f2, float f3) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(baselineAnchor.getId$constraintlayout_compose().toString()));
        cLArray.add(CLString.from("baseline"));
        cLArray.add(new CLNumber(f2));
        cLArray.add(new CLNumber(f3));
        this.containerObject.put(this.anchorName, cLArray);
    }
}
