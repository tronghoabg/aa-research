package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ConstraintLayoutTag extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {
    private final String constraintLayoutId;
    private final String constraintLayoutTag;

    public ConstraintLayoutTag(String str, String str2, l<? super InspectorInfo, ab> lVar) {
        super(lVar);
        this.constraintLayoutTag = str;
        this.constraintLayoutId = str2;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(l lVar) {
        return Modifier.Element.CC.$default$all(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(l lVar) {
        return Modifier.Element.CC.$default$any(this, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ConstraintLayoutTag constraintLayoutTag = obj instanceof ConstraintLayoutTag ? (ConstraintLayoutTag) obj : null;
        if (constraintLayoutTag == null) {
            return false;
        }
        return x.n(getConstraintLayoutTag(), constraintLayoutTag.getConstraintLayoutTag());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, p pVar) {
        return Modifier.Element.CC.$default$foldIn(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, p pVar) {
        return Modifier.Element.CC.$default$foldOut(this, obj, pVar);
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public String getConstraintLayoutId() {
        return this.constraintLayoutId;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public String getConstraintLayoutTag() {
        return this.constraintLayoutTag;
    }

    public int hashCode() {
        return getConstraintLayoutTag().hashCode();
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public String toString() {
        return "ConstraintLayoutTag(id=" + getConstraintLayoutTag() + ')';
    }
}
