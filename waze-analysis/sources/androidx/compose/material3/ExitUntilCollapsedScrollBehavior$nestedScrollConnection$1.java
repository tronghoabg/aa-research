package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitUntilCollapsedScrollBehavior this$0;

    ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.this$0 = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2297onPostFlingRZ2iAVY(long r6, long r8, h.c.e<? super androidx.compose.ui.unit.Velocity> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r5, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r10.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            long r5 = r10.J$0
            e.b.c.b(r0)
            goto L7d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            long r8 = r10.J$0
            e.b.c.b(r0)
            goto L5a
        L3b:
            e.b.c.b(r0)
            float r0 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r8)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L50
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r0 = r5.this$0
            androidx.compose.material3.TopAppBarState r0 = r0.getState()
            r0.setContentOffset(r2)
        L50:
            r10.J$0 = r8
            r10.label = r4
            java.lang.Object r0 = androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m9443$default$onPostFlingRZ2iAVY(r5, r6, r8, r10)
            if (r0 == r1) goto L8c
        L5a:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r6 = r0.m11415unboximpl()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r5 = r5.this$0
            androidx.compose.material3.TopAppBarState r0 = r5.getState()
            float r8 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r8)
            androidx.compose.animation.core.DecayAnimationSpec r9 = r5.getFlingAnimationSpec()
            androidx.compose.animation.core.AnimationSpec r5 = r5.getSnapAnimationSpec()
            r10.J$0 = r6
            r10.label = r3
            java.lang.Object r0 = androidx.compose.material3.AppBarKt.access$settleAppBar(r0, r8, r9, r5, r10)
            if (r0 == r1) goto L8c
            r5 = r6
        L7d:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.m11415unboximpl()
            long r5 = androidx.compose.ui.unit.Velocity.m11410plusAH228Gc(r5, r7)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m11397boximpl(r5)
            return r5
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        float contentOffset = state.getContentOffset();
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        state.setContentOffset(contentOffset + Float.intBitsToFloat(i3));
        int i4 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (Float.intBitsToFloat(i4) < 0.0f || Float.intBitsToFloat(i3) < 0.0f) {
            float heightOffset = this.this$0.getState().getHeightOffset();
            ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = this.this$0;
            exitUntilCollapsedScrollBehavior.getState().setHeightOffset(exitUntilCollapsedScrollBehavior.getState().getHeightOffset() + Float.intBitsToFloat(i3));
            float heightOffset2 = this.this$0.getState().getHeightOffset() - heightOffset;
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(heightOffset2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        if (Float.intBitsToFloat(i4) <= 0.0f) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        float heightOffset3 = this.this$0.getState().getHeightOffset();
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior2 = this.this$0;
        exitUntilCollapsedScrollBehavior2.getState().setHeightOffset(exitUntilCollapsedScrollBehavior2.getState().getHeightOffset() + Float.intBitsToFloat(i4));
        float heightOffset4 = this.this$0.getState().getHeightOffset() - heightOffset3;
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(heightOffset4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
        return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        if (this.this$0.getCanScroll().invoke().booleanValue()) {
            int i3 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
            if (Float.intBitsToFloat(i3) <= 0.0f) {
                float heightOffset = this.this$0.getState().getHeightOffset();
                ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = this.this$0;
                exitUntilCollapsedScrollBehavior.getState().setHeightOffset(exitUntilCollapsedScrollBehavior.getState().getHeightOffset() + Float.intBitsToFloat(i3));
                return heightOffset == this.this$0.getState().getHeightOffset() ? Offset.Companion.m7996getZeroF1C5BW0() : Offset.m7974copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null);
            }
        }
        return Offset.Companion.m7996getZeroF1C5BW0();
    }
}
