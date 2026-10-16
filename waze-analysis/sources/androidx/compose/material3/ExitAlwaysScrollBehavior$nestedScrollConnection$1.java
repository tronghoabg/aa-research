package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitAlwaysScrollBehavior this$0;

    ExitAlwaysScrollBehavior$nestedScrollConnection$1(ExitAlwaysScrollBehavior exitAlwaysScrollBehavior) {
        this.this$0 = exitAlwaysScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2297onPostFlingRZ2iAVY(long r7, long r9, h.c.e<? super androidx.compose.ui.unit.Velocity> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r6, r11)
        L18:
            r11 = r0
            java.lang.Object r0 = r11.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r11.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r6 = r11.J$0
            e.b.c.b(r0)
            goto La5
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            long r9 = r11.J$0
            e.b.c.b(r0)
            goto L82
        L3c:
            e.b.c.b(r0)
            float r0 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r9)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L78
            androidx.compose.material3.ExitAlwaysScrollBehavior r0 = r6.this$0
            androidx.compose.material3.BottomAppBarState r0 = r0.getState()
            float r0 = r0.getHeightOffset()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L57
            goto L6f
        L57:
            androidx.compose.material3.ExitAlwaysScrollBehavior r0 = r6.this$0
            androidx.compose.material3.BottomAppBarState r0 = r0.getState()
            float r0 = r0.getHeightOffset()
            androidx.compose.material3.ExitAlwaysScrollBehavior r5 = r6.this$0
            androidx.compose.material3.BottomAppBarState r5 = r5.getState()
            float r5 = r5.getHeightOffsetLimit()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L78
        L6f:
            androidx.compose.material3.ExitAlwaysScrollBehavior r0 = r6.this$0
            androidx.compose.material3.BottomAppBarState r0 = r0.getState()
            r0.setContentOffset(r2)
        L78:
            r11.J$0 = r9
            r11.label = r4
            java.lang.Object r0 = androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m9443$default$onPostFlingRZ2iAVY(r6, r7, r9, r11)
            if (r0 == r1) goto Lb4
        L82:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.m11415unboximpl()
            androidx.compose.material3.ExitAlwaysScrollBehavior r6 = r6.this$0
            androidx.compose.material3.BottomAppBarState r0 = r6.getState()
            float r9 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r9)
            androidx.compose.animation.core.DecayAnimationSpec r10 = r6.getFlingAnimationSpec()
            androidx.compose.animation.core.AnimationSpec r6 = r6.getSnapAnimationSpec()
            r11.J$0 = r7
            r11.label = r3
            java.lang.Object r0 = androidx.compose.material3.AppBarKt.access$settleAppBarBottom(r0, r9, r10, r6, r11)
            if (r0 == r1) goto Lb4
            r6 = r7
        La5:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r8 = r0.m11415unboximpl()
            long r6 = androidx.compose.ui.unit.Velocity.m11410plusAH228Gc(r6, r8)
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m11397boximpl(r6)
            return r6
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        BottomAppBarState state = this.this$0.getState();
        float contentOffset = state.getContentOffset();
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        state.setContentOffset(contentOffset + Float.intBitsToFloat(i3));
        ExitAlwaysScrollBehavior exitAlwaysScrollBehavior = this.this$0;
        exitAlwaysScrollBehavior.getState().setHeightOffset(exitAlwaysScrollBehavior.getState().getHeightOffset() + Float.intBitsToFloat(i3));
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
}
