package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final float minFlingVelocity;
    private final NestedScrollingChildHelper nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view, float f2) {
        this.view = view;
        this.minFlingVelocity = f2;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void stopNestedScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e<? super Velocity> eVar) {
        stopNestedScrolls();
        return Velocity.m11397boximpl(Velocity.Companion.m11417getZero9UxMQ8M());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m10279getScrollAxesk4lQ0M(j3), NestedScrollInteropConnectionKt.m10282toViewTypeGyEprt8(i2))) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        c.ay(this.consumedScrollCache, 0, 0, 6);
        int iComposeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j3 >> 32)));
        int iComposeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        this.nestedScrollChildHelper.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))), iComposeToViewOffset, iComposeToViewOffset2, null, NestedScrollInteropConnectionKt.m10282toViewTypeGyEprt8(i2), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m10281toOffsetmoWRBKg(iComposeToViewOffset, iComposeToViewOffset2, this.consumedScrollCache, j3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo2299onPreFlingQWom1Mo(long j2, e<? super Velocity> eVar) {
        if (!this.nestedScrollChildHelper.dispatchNestedPreFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m11406getXimpl(j2)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m11407getYimpl(j2))) && !this.nestedScrollChildHelper.dispatchNestedFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m11406getXimpl(j2)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m11407getYimpl(j2)), true)) {
            j2 = Velocity.Companion.m11417getZero9UxMQ8M();
        }
        return Velocity.m11397boximpl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m10279getScrollAxesk4lQ0M(j2), NestedScrollInteropConnectionKt.m10282toViewTypeGyEprt8(i2))) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        c.ay(this.consumedScrollCache, 0, 0, 6);
        int iComposeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 >> 32)));
        int iComposeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)));
        this.nestedScrollChildHelper.dispatchNestedPreScroll(iComposeToViewOffset, iComposeToViewOffset2, this.consumedScrollCache, null, NestedScrollInteropConnectionKt.m10282toViewTypeGyEprt8(i2));
        return NestedScrollInteropConnectionKt.m10281toOffsetmoWRBKg(iComposeToViewOffset, iComposeToViewOffset2, this.consumedScrollCache, j2);
    }
}
