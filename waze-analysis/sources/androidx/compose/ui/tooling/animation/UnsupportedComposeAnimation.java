package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class UnsupportedComposeAnimation implements ComposeAnimation {
    private static boolean apiAvailable;
    private final Object animationObject;
    private final String label;
    private final Set<Integer> states;
    private final ComposeAnimationType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (x.n(composeAnimationTypeArrValues[i2].name(), "UNSUPPORTED")) {
                z = true;
                break;
            }
            i2++;
        }
        apiAvailable = z;
    }

    private UnsupportedComposeAnimation(String str) {
        this.label = str;
        this.type = ComposeAnimationType.UNSUPPORTED;
        this.animationObject = 0;
        this.states = a.p();
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Object getAnimationObject() {
        return this.animationObject;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public String getLabel() {
        return this.label;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Set<Integer> getStates() {
        return this.states;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public ComposeAnimationType getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final UnsupportedComposeAnimation create(String str) {
            o oVar = null;
            if (getApiAvailable()) {
                return new UnsupportedComposeAnimation(str, oVar);
            }
            return null;
        }

        public final boolean getApiAvailable() {
            return UnsupportedComposeAnimation.apiAvailable;
        }

        public final void testOverrideAvailability(boolean z) {
            UnsupportedComposeAnimation.apiAvailable = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ UnsupportedComposeAnimation(String str, o oVar) {
        this(str);
    }
}
