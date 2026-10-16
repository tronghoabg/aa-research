package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {
    private final a<Boolean> canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private final a<Boolean> isScrollingContentAtStart;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public PinnedScrollBehavior(TopAppBarState topAppBarState, a<Boolean> aVar, a<Boolean> aVar2) {
        this.state = topAppBarState;
        this.canScroll = aVar;
        this.isScrollingContentAtStart = aVar2;
        getState().setScrollingContentAtStart$material3(aVar2);
        this.isPinned = true;
        this.nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e<? super Velocity> eVar) {
                if (Velocity.m11407getYimpl(j3) > 0.0f) {
                    this.this$0.getState().setContentOffset(0.0f);
                }
                return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
                if (!this.this$0.getCanScroll().invoke().booleanValue()) {
                    return Offset.Companion.m7996getZeroF1C5BW0();
                }
                TopAppBarState state = this.this$0.getState();
                state.setContentOffset(state.getContentOffset() + Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
                return Offset.Companion.m7996getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
                return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public /* synthetic */ long mo2300onPreScrollOzD1aCk(long j2, int i2) {
                return NestedScrollConnection.CC.m9446$default$onPreScrollOzD1aCk(this, j2, i2);
            }
        };
    }

    static final boolean _init_$lambda$0() {
        return true;
    }

    static final boolean _init_$lambda$1() {
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

    public final a<Boolean> isScrollingContentAtStart() {
        return this.isScrollingContentAtStart;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, a aVar, a aVar2, int i2, o oVar) {
        this(topAppBarState, (i2 & 2) != 0 ? new a() { // from class: androidx.compose.material3.PinnedScrollBehavior$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return true;
            }
        } : aVar, (i2 & 4) != 0 ? new a() { // from class: androidx.compose.material3.PinnedScrollBehavior$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return true;
            }
        } : aVar2);
    }
}
