package com.waze.ui.b;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    private final a f42068a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyListState f42069b;

    public i(a aVar, LazyListState lazyListState) {
        h.g.b.x.f(aVar, "layoutState");
        h.g.b.x.f(lazyListState, "lazyListState");
        this.f42068a = aVar;
        this.f42069b = lazyListState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2297onPostFlingRZ2iAVY(long r7, long r9, h.c.e<? super androidx.compose.ui.unit.Velocity> r11) {
        /*
            r6 = this;
            boolean r7 = r11 instanceof com.waze.ui.b.g
            if (r7 == 0) goto L13
            r7 = r11
            com.waze.ui.b.g r7 = (com.waze.ui.b.g) r7
            int r8 = r7.f42063d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r8 & r0
            if (r1 == 0) goto L13
            int r8 = r8 - r0
            r7.f42063d = r8
            goto L18
        L13:
            com.waze.ui.b.g r7 = new com.waze.ui.b.g
            r7.<init>(r6, r11)
        L18:
            java.lang.Object r8 = r7.f42061b
            h.c.a.a r11 = h.c.a.a.f48038a
            int r0 = r7.f42063d
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            long r9 = r7.f42060a
            e.b.c.b(r8)
        L28:
            r0 = r9
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            e.b.c.b(r8)
            com.waze.ui.b.a r6 = r6.f42068a
            androidx.compose.material.SwipeableState r6 = r6.b()
            float r8 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r9)
            r7.f42060a = r9
            r7.f42063d = r1
            java.lang.Object r6 = r6.performFling(r8, r7)
            if (r6 == r11) goto L57
            goto L28
        L4a:
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 0
            long r6 = androidx.compose.ui.unit.Velocity.m11402copyOhffZ5M$default(r0, r2, r3, r4, r5)
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m11397boximpl(r6)
            return r6
        L57:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.b.i.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        float fPerformDrag = this.f42068a.b().performDrag(Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        return (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fPerformDrag)) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2299onPreFlingQWom1Mo(long r9, h.c.e<? super androidx.compose.ui.unit.Velocity> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.waze.ui.b.h
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.ui.b.h r0 = (com.waze.ui.b.h) r0
            int r1 = r0.f42067d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42067d = r1
            goto L18
        L13:
            com.waze.ui.b.h r0 = new com.waze.ui.b.h
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f42065b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f42067d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            long r9 = r0.f42064a
            e.b.c.b(r11)
        L28:
            r2 = r9
            goto L58
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            e.b.c.b(r11)
            androidx.compose.foundation.lazy.LazyListState r11 = r8.f42069b
            int r2 = r11.getFirstVisibleItemIndex()
            if (r2 != 0) goto L62
            int r11 = r11.getFirstVisibleItemScrollOffset()
            if (r11 != 0) goto L62
            com.waze.ui.b.a r8 = r8.f42068a
            androidx.compose.material.SwipeableState r8 = r8.b()
            float r11 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r9)
            r0.f42064a = r9
            r0.f42067d = r3
            java.lang.Object r8 = r8.performFling(r11, r0)
            if (r8 == r1) goto L61
            goto L28
        L58:
            r6 = 2
            r7 = 0
            r4 = 0
            r5 = 0
            long r8 = androidx.compose.ui.unit.Velocity.m11402copyOhffZ5M$default(r2, r4, r5, r6, r7)
            goto L68
        L61:
            return r1
        L62:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m11417getZero9UxMQ8M()
        L68:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.m11397boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.b.i.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (fIntBitsToFloat >= 0.0f) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        float fPerformDrag = this.f42068a.b().performDrag(fIntBitsToFloat);
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fPerformDrag) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
