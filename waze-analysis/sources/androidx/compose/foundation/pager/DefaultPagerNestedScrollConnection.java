package androidx.compose.foundation.pager;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;
import h.k.n;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    private final Orientation orientation;
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m3023mainAxisk4lQ0M(long j2) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j2 >> 32) : (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    private final float m3024toFloatk4lQ0M(long j2) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j2 >> 32) : (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m3025consumeOnOrientationQWom1Mo(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m11402copyOhffZ5M$default(j2, 0.0f, 0.0f, 2, null) : Velocity.m11402copyOhffZ5M$default(j2, 0.0f, 0.0f, 1, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final PagerState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e<? super Velocity> eVar) {
        return Velocity.m11397boximpl(m3025consumeOnOrientationQWom1Mo(j3, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9475getSideEffectWNlRxjI()) || m3023mainAxisk4lQ0M(j3) == 0.0f) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
        return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        if (!NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI()) || Math.abs(this.state.getCurrentPageOffsetFraction()) <= 1.0E-6d || Math.abs(m3024toFloatk4lQ0M(j2)) <= 0.0f) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        PagerState pagerState = this.state;
        PagerLayoutInfo layoutInfo = pagerState.getLayoutInfo();
        float currentPageOffsetFraction = pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSize$foundation();
        int pageSize = layoutInfo.getPageSize() + layoutInfo.getPageSpacing();
        float f2 = -Math.signum(this.state.getCurrentPageOffsetFraction());
        float currentPageOffsetFraction2 = this.state.getCurrentPageOffsetFraction();
        float fM3024toFloatk4lQ0M = m3024toFloatk4lQ0M(j2);
        float f3 = (pageSize * f2) + currentPageOffsetFraction;
        float f4 = currentPageOffsetFraction2 > 0.0f ? currentPageOffsetFraction : f3;
        if (currentPageOffsetFraction2 > 0.0f) {
            currentPageOffsetFraction = f3;
        }
        float fG = n.g(fM3024toFloatk4lQ0M, currentPageOffsetFraction, f4);
        float fDispatchRawDelta = (this.orientation == Orientation.Horizontal && layoutInfo.getReverseLayout() && ComposeFoundationFlags.isReverseLayoutNestedScrollConnectionInPagerFixEnabled) ? this.state.dispatchRawDelta(fG) : -this.state.dispatchRawDelta(-fG);
        float fIntBitsToFloat = this.orientation == Orientation.Horizontal ? fDispatchRawDelta : Float.intBitsToFloat((int) (j2 >> 32));
        if (this.orientation != Orientation.Vertical) {
            fDispatchRawDelta = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        return Offset.m7973copydBAh8RU(j2, fIntBitsToFloat, fDispatchRawDelta);
    }
}
