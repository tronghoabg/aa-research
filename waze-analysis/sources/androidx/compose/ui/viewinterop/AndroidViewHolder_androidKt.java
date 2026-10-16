package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidViewHolder_androidKt {
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e eVar) {
            return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public /* synthetic */ long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
            return NestedScrollConnection.CC.m9444$default$onPostScrollDzOQY0M(this, j2, j3, i2);
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
    private static final int Unmeasured = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeOffset(int i2) {
        return -i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeVelocity(float f2) {
        return -f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toNestedScrollSource(int i2) {
        return i2 == 0 ? NestedScrollSource.Companion.m9476getUserInputWNlRxjI() : NestedScrollSource.Companion.m9475getSideEffectWNlRxjI();
    }
}
