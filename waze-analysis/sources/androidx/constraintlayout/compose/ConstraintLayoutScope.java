package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import java.util.ArrayList;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int ChildrenStartIndex;
    private int childId;
    private final ArrayList<ConstrainedLayoutReference> childrenRefs;
    private boolean isAnimateChanges;
    private ConstrainedLayoutReferences referencesObject;

    /* compiled from: WazeSource */
    final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {
        private final l<ConstrainScope, ab> constrainBlock;
        private final ConstrainedLayoutReference ref;

        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(ConstrainedLayoutReference constrainedLayoutReference, l<? super ConstrainScope, ab> lVar) {
            super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1(constrainedLayoutReference, lVar) : InspectableValueKt.getNoInspectorInfo());
            this.ref = constrainedLayoutReference;
            this.constrainBlock = lVar;
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
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return this.constrainBlock == (constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, p pVar) {
            return Modifier.Element.CC.$default$foldIn(this, obj, pVar);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, p pVar) {
            return Modifier.Element.CC.$default$foldOut(this, obj, pVar);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public ConstraintLayoutParentData modifyParentData(Density density, Object obj) {
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return Modifier.CC.$default$then(this, modifier);
        }
    }

    /* compiled from: WazeSource */
    public final class ConstrainedLayoutReferences {
        public ConstrainedLayoutReferences() {
        }

        public final ConstrainedLayoutReference component1() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component10() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component11() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component12() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component13() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component14() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component15() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component16() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component2() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component3() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component4() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component5() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component6() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component7() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component8() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstrainedLayoutReference component9() {
            return ConstraintLayoutScope.this.createRef();
        }
    }

    public ConstraintLayoutScope() {
        super(null);
        this.childId = this.ChildrenStartIndex;
        this.childrenRefs = new ArrayList<>();
    }

    public static /* synthetic */ void isAnimateChanges$annotations() {
    }

    public final Modifier constrainAs(Modifier modifier, ConstrainedLayoutReference constrainedLayoutReference, l<? super ConstrainScope, ab> lVar) {
        if (this.isAnimateChanges) {
            lVar.invoke(new ConstrainScope(constrainedLayoutReference.getId$constraintlayout_compose(), asCLContainer$constraintlayout_compose(constrainedLayoutReference)));
        }
        return modifier.then(new ConstrainAsModifier(constrainedLayoutReference, lVar));
    }

    public final ConstrainedLayoutReference createRef() {
        ArrayList<ConstrainedLayoutReference> arrayList = this.childrenRefs;
        int i2 = this.childId;
        this.childId = i2 + 1;
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) i.S(arrayList, i2);
        if (constrainedLayoutReference != null) {
            return constrainedLayoutReference;
        }
        ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.childId));
        this.childrenRefs.add(constrainedLayoutReference2);
        return constrainedLayoutReference2;
    }

    public final ConstrainedLayoutReferences createRefs() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.referencesObject;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences();
        this.referencesObject = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    public final boolean isAnimateChanges() {
        return this.isAnimateChanges;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void reset() {
        super.reset();
        this.childId = this.ChildrenStartIndex;
    }

    public final void setAnimateChanges(boolean z) {
        this.isAnimateChanges = z;
    }
}
