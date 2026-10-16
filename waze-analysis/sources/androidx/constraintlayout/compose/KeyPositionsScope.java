package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.ab;
import h.g.a.l;
import h.g.b.ad;
import h.i.a;
import h.l.r;
import java.util.Arrays;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class KeyPositionsScope extends BaseKeyFramesScope {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(KeyPositionsScope.class, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType()Landroidx/constraintlayout/compose/RelativePosition;", 0)};
    public static final int $stable = 8;
    private final a type$delegate;

    public KeyPositionsScope(ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        super((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length), null);
        this.type$delegate = BaseKeyFramesScope.addNameOnPropertyChange$constraintlayout_compose$default(this, RelativePosition.Companion.getDelta(), null, 2, null);
    }

    public final void frame(int i2, l<? super KeyPositionScope, ab> lVar) {
        KeyPositionScope keyPositionScope = new KeyPositionScope();
        lVar.invoke(keyPositionScope);
        getFramesContainer$constraintlayout_compose().add(new CLNumber(i2));
        keyPositionScope.addToContainer$constraintlayout_compose(getKeyFramePropsObject$constraintlayout_compose());
    }

    public final RelativePosition getType() {
        return (RelativePosition) this.type$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setType(RelativePosition relativePosition) {
        this.type$delegate.setValue(this, $$delegatedProperties[0], relativePosition);
    }
}
