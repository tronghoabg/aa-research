package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private boolean enabled;
    private final ScrollLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollLogic scrollLogic, boolean z) {
        this.scrollingLogic = scrollLogic;
        this.enabled = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ScrollLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2297onPostFlingRZ2iAVY(long r3, long r5, h.c.e<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            h.c.a.a r7 = h.c.a.a.f48038a
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            long r2 = r3.J$0
            e.b.c.b(r4)
            r5 = r2
            goto L54
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L32:
            e.b.c.b(r4)
            boolean r4 = r2.enabled
            if (r4 == 0) goto L60
            androidx.compose.foundation.gestures.ScrollLogic r4 = r2.scrollingLogic
            boolean r4 = r4.isFlinging()
            if (r4 == 0) goto L48
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r2 = r2.m11417getZero9UxMQ8M()
            goto L5a
        L48:
            androidx.compose.foundation.gestures.ScrollLogic r2 = r2.scrollingLogic
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r2.mo2286doFlingAnimationQWom1Mo(r5, r3)
            if (r4 == r7) goto L5f
        L54:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r2 = r4.m11415unboximpl()
        L5a:
            long r2 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r5, r2)
            goto L66
        L5f:
            return r7
        L60:
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r2 = r2.m11417getZero9UxMQ8M()
        L66:
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m11397boximpl(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return this.enabled ? this.scrollingLogic.mo2287performRawScrollMKHz9U(j3) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
        return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public /* synthetic */ long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        return NestedScrollConnection.CC.m9446$default$onPreScrollOzD1aCk(this, j2, i2);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }
}
