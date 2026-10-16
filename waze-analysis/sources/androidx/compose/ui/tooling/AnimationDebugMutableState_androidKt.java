package androidx.compose.ui.tooling;

import androidx.compose.runtime.MutableState;
import h.g.a.a;
import h.g.a.l;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimationDebugMutableState_androidKt {
    public static final <T> MutableState<T> animationDebugMutableStateOf(T t, l<? super T, ? extends MutableState<T>> lVar, a<? extends Set<? extends T>> aVar, String str) {
        return IsAnimationPreviewEnabled_androidKt.isAnimationPreviewEnabled() ? new AnimationDebugMutableState(lVar.invoke(t), aVar, str) : lVar.invoke(t);
    }
}
