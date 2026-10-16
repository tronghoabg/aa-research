package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FloatingToolbarScrollBehavior extends NestedScrollConnection {
    Modifier floatingScrollBehavior(Modifier modifier);

    /* renamed from: getExitDirection-8LIK8-E */
    int mo4800getExitDirection8LIK8E();

    DecayAnimationSpec<Float> getFlingAnimationSpec();

    AnimationSpec<Float> getSnapAnimationSpec();

    FloatingToolbarState getState();
}
