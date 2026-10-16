package com.waze.ui.w;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f43730a;

    /* renamed from: b, reason: collision with root package name */
    private final ScrollState f43731b;

    public g(c cVar, ScrollState scrollState) {
        h.g.b.x.f(cVar, "swipeableState");
        h.g.b.x.f(scrollState, "scrollState");
        this.f43730a = cVar;
        this.f43731b = scrollState;
    }

    private static final long a(float f2) {
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, h.c.e eVar) {
        return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        c cVar = this.f43730a;
        return a(cVar.b().dispatchRawDelta(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2299onPreFlingQWom1Mo(long r12, h.c.e<? super androidx.compose.ui.unit.Velocity> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.waze.ui.w.d
            if (r0 == 0) goto L13
            r0 = r14
            com.waze.ui.w.d r0 = (com.waze.ui.w.d) r0
            int r1 = r0.f43722d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43722d = r1
            goto L18
        L13:
            com.waze.ui.w.d r0 = new com.waze.ui.w.d
            r0.<init>(r11, r14)
        L18:
            r4 = r0
            java.lang.Object r14 = r4.f43720b
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f43722d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r12 = r4.f43719a
            e.b.c.b(r14)
            r1 = r12
            goto L61
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            e.b.c.b(r14)
            androidx.compose.foundation.ScrollState r14 = r11.f43731b
            int r14 = r14.getValue()
            if (r14 != 0) goto L6f
            com.waze.ui.w.c r11 = r11.f43730a
            androidx.compose.foundation.gestures.AnchoredDraggableState r1 = r11.b()
            androidx.compose.foundation.gestures.FlingBehavior r6 = r11.c()
            com.waze.ui.w.f r5 = new com.waze.ui.w.f
            r10 = 0
            r8 = r12
            r7 = r1
            r5.<init>(r6, r7, r8, r10)
            r3 = r5
            h.g.a.q r3 = (h.g.a.q) r3
            r4.f43719a = r8
            r4.f43722d = r2
            r5 = 1
            r6 = 0
            r2 = 0
            java.lang.Object r11 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6)
            if (r11 == r0) goto L6e
            r1 = r8
        L61:
            r5 = 2
            r6 = 0
            r3 = 0
            r4 = 0
            long r11 = androidx.compose.ui.unit.Velocity.m11402copyOhffZ5M$default(r1, r3, r4, r5, r6)
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m11397boximpl(r11)
            return r11
        L6e:
            return r0
        L6f:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
            long r11 = r11.m11417getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m11397boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.w.g.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return fIntBitsToFloat < 0.0f ? a(this.f43730a.b().dispatchRawDelta(fIntBitsToFloat)) : Offset.Companion.m7996getZeroF1C5BW0();
    }
}
