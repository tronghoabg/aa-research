package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SearchInfo<Animation extends ComposeAnimation, Clock extends ComposeAnimationClock<?, ?>> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.tooling.animation.search.SearchInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$attach(SearchInfo searchInfo) {
        }

        public static void $default$detach(SearchInfo searchInfo) {
        }
    }

    void attach();

    Animation createAnimation();

    Clock createClock(Animation animation, ClockInfo clockInfo);

    void detach();

    Object getAnimationObject();

    Object getInitialState();

    String getLabel();

    Object getTargetState();

    void setInitialStateToCurrentAnimationValue();

    void setTargetStateToCurrentAnimationValue();
}
