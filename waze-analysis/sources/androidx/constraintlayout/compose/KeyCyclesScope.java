package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.constraintlayout.core.parser.CLNumber;
import h.ab;
import h.g.a.l;
import java.util.Arrays;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class KeyCyclesScope extends BaseKeyFramesScope {
    public static final int $stable = 8;

    public KeyCyclesScope(ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        super((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length), null);
    }

    public final void frame(int i2, l<? super KeyCycleScope, ab> lVar) {
        KeyCycleScope keyCycleScope = new KeyCycleScope();
        lVar.invoke(keyCycleScope);
        getFramesContainer$constraintlayout_compose().add(new CLNumber(i2));
        keyCycleScope.addToContainer$constraintlayout_compose(getKeyFramePropsObject$constraintlayout_compose());
    }
}
