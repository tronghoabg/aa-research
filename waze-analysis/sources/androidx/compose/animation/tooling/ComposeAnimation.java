package androidx.compose.animation.tooling;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ComposeAnimation {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.tooling.ComposeAnimation$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$getLabel(ComposeAnimation composeAnimation) {
            return null;
        }

        public static Set $default$getStates(ComposeAnimation composeAnimation) {
            throw new UnsupportedOperationException("Only available when getType() is TRANSITION_ANIMATION");
        }

        public static /* synthetic */ String access$getLabel$jd(ComposeAnimation composeAnimation) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static String getLabel(ComposeAnimation composeAnimation) {
            return null;
        }

        @Deprecated
        public static Set<Object> getStates(ComposeAnimation composeAnimation) {
            return CC.$default$getStates(composeAnimation);
        }
    }

    Object getAnimationObject();

    String getLabel();

    Set<Object> getStates();

    ComposeAnimationType getType();
}
