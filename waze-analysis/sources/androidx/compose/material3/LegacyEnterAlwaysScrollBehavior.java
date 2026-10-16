package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LegacyEnterAlwaysScrollBehavior implements TopAppBarScrollBehavior {
    private final a<Boolean> canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final boolean reverseLayout;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public /* synthetic */ LegacyEnterAlwaysScrollBehavior(TopAppBarState topAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, a aVar, boolean z, int i2, o oVar) {
        this(topAppBarState, animationSpec, decayAnimationSpec, (i2 & 8) != 0 ? new a() { // from class: androidx.compose.material3.LegacyEnterAlwaysScrollBehavior$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return true;
            }
        } : aVar, ((i2 & 16) == 0) & z);
    }

    static final boolean _init_$lambda$0() {
        return true;
    }

    public final a<Boolean> getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public LegacyEnterAlwaysScrollBehavior(TopAppBarState topAppBarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, a<Boolean> aVar, boolean z) {
        this.state = topAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = aVar;
        this.reverseLayout = z;
        this.nestedScrollConnection = new LegacyEnterAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }
}
