package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.search.TransitionSearchInfo;
import e.c.d.a;
import h.a.c;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionComposeAnimation_androidKt {
    public static final TransitionComposeAnimation<?> parse(TransitionSearchInfo transitionSearchInfo) {
        Set setO;
        Object currentState = transitionSearchInfo.getTransition().getCurrentState();
        if (currentState == null) {
            return null;
        }
        Object[] enumConstants = currentState.getClass().getEnumConstants();
        if (enumConstants == null || (setO = c.ad(enumConstants)) == null) {
            setO = a.o(currentState);
        }
        return new TransitionComposeAnimation<>(transitionSearchInfo.getInitialState(), transitionSearchInfo.getTargetState(), transitionSearchInfo.getTransition(), setO, transitionSearchInfo.getLabel());
    }
}
