package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.DerivedConstraintSet;
import androidx.constraintlayout.core.parser.CLObject;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DslConstraintSet implements DerivedConstraintSet {
    public static final int $stable = 0;
    private final l<ConstraintSetScope, ab> description;
    private final ConstraintSet extendFrom;
    private final ConstraintSetScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public DslConstraintSet(l<? super ConstraintSetScope, ab> lVar, ConstraintSet constraintSet) {
        ConstraintSetScope constraintSetScope;
        this.description = lVar;
        CLObject containerObject = null;
        DslConstraintSet dslConstraintSet = constraintSet instanceof DslConstraintSet ? (DslConstraintSet) constraintSet : null;
        if (dslConstraintSet != null && (constraintSetScope = dslConstraintSet.scope) != null) {
            containerObject = constraintSetScope.getContainerObject();
        }
        ConstraintSetScope constraintSetScope2 = new ConstraintSetScope(containerObject);
        lVar.invoke(constraintSetScope2);
        this.scope = constraintSetScope2;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ void applyTo(State state, List list) {
        DerivedConstraintSet.CC.$default$applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(State state) {
        this.scope.applyTo(state);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DslConstraintSet) {
            return x.n(this.scope, ((DslConstraintSet) obj).scope);
        }
        return false;
    }

    public final l<ConstraintSetScope, ab> getDescription() {
        return this.description;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    public final ConstraintSetScope getScope$constraintlayout_compose() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ boolean isDirty(List list) {
        return true;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public ConstraintSet override(String str, float f2) {
        return this;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ void applyTo(androidx.constraintlayout.core.state.Transition transition, int i2) {
    }

    public /* synthetic */ DslConstraintSet(l lVar, ConstraintSet constraintSet, int i2, o oVar) {
        this(lVar, (i2 & 2) != 0 ? null : constraintSet);
    }
}
