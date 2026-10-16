package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ SwipeableState $this_PreUpPostDownNestedScrollConnection;

    SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState swipeableState) {
        this.$this_PreUpPostDownNestedScrollConnection = swipeableState;
    }

    private final float toFloat(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    private final long toOffset(float f2) {
        return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2297onPostFlingRZ2iAVY(long r10, long r12, h.c.e<? super androidx.compose.ui.unit.Velocity> r14) {
        /*
            r9 = this;
            boolean r10 = r14 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r10 == 0) goto L13
            r10 = r14
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r10 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r10
            int r11 = r10.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r11 & r0
            if (r1 == 0) goto L13
            int r11 = r11 - r0
            r10.label = r11
            goto L18
        L13:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r10 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r10.<init>(r9, r14)
        L18:
            java.lang.Object r11 = r10.result
            h.c.a.a r14 = h.c.a.a.f48038a
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r12 = r10.J$0
            e.b.c.b(r11)
            goto L61
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            e.b.c.b(r11)
            androidx.compose.material.SwipeableState r11 = r9.$this_PreUpPostDownNestedScrollConnection
            float r0 = androidx.compose.ui.unit.Velocity.m11406getXimpl(r12)
            float r2 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r12)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r3 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r5 = (long) r0
            r0 = 32
            long r2 = r3 << r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r2 = r2 | r5
            float r9 = r9.toFloat(r2)
            r10.J$0 = r12
            r10.label = r1
            java.lang.Object r9 = r11.performFling(r9, r10)
            if (r9 == r14) goto L66
        L61:
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.ui.unit.Velocity.m11397boximpl(r12)
            return r9
        L66:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI()) ? toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(toFloat(j3))) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2299onPreFlingQWom1Mo(long r11, h.c.e<? super androidx.compose.ui.unit.Velocity> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r11 = r0.J$0
            e.b.c.b(r13)
            goto L87
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            e.b.c.b(r13)
            float r13 = androidx.compose.ui.unit.Velocity.m11406getXimpl(r11)
            float r2 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r11)
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r4 = (long) r13
            int r13 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r13
            r13 = 32
            long r4 = r4 << r13
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            long r4 = r4 | r6
            float r13 = r10.toFloat(r4)
            r2 = 0
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 >= 0) goto L81
            androidx.compose.material.SwipeableState r2 = r10.$this_PreUpPostDownNestedScrollConnection
            androidx.compose.runtime.State r2 = r2.getOffset()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.material.SwipeableState r4 = r10.$this_PreUpPostDownNestedScrollConnection
            float r4 = r4.getMinBound$material()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L81
            androidx.compose.material.SwipeableState r10 = r10.$this_PreUpPostDownNestedScrollConnection
            r0.J$0 = r11
            r0.label = r3
            java.lang.Object r10 = r10.performFling(r13, r0)
            if (r10 == r1) goto L80
            goto L87
        L80:
            return r1
        L81:
            androidx.compose.ui.unit.Velocity$Companion r10 = androidx.compose.ui.unit.Velocity.Companion
            long r11 = r10.m11417getZero9UxMQ8M()
        L87:
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.m11397boximpl(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        float f2 = toFloat(j2);
        return (f2 >= 0.0f || !NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI())) ? Offset.Companion.m7996getZeroF1C5BW0() : toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(f2));
    }
}
