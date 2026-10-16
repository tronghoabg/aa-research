package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseVerticalAnchorable implements VerticalAnchorable {
    public static final int $stable = 8;
    private final String anchorName;
    private final CLObject containerObject;

    public BaseVerticalAnchorable(CLObject cLObject, int i2) {
        this.containerObject = cLObject;
        this.anchorName = AnchorFunctions.INSTANCE.verticalAnchorIndexToAnchorName(i2);
    }

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo11427linkToVpY3zN4(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f2, float f3) {
        String strVerticalAnchorIndexToAnchorName = AnchorFunctions.INSTANCE.verticalAnchorIndexToAnchorName(verticalAnchor.getIndex$constraintlayout_compose());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(verticalAnchor.getId$constraintlayout_compose().toString()));
        cLArray.add(CLString.from(strVerticalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(f2));
        cLArray.add(new CLNumber(f3));
        this.containerObject.put(this.anchorName, cLArray);
    }
}
