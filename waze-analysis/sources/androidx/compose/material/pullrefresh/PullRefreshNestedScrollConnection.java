package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;
    private final l<Float, Float> onPull;
    private final p<Float, e<? super Float>, Object> onRelease;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(l<? super Float, Float> lVar, p<? super Float, ? super e<? super Float>, ? extends Object> pVar, boolean z) {
        this.onPull = lVar;
        this.onRelease = pVar;
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e eVar) {
        return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!this.enabled) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI())) {
            int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (Float.intBitsToFloat(i3) > 0.0f) {
                float fFloatValue = this.onPull.invoke(Float.valueOf(Float.intBitsToFloat(i3))).floatValue();
                return (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fFloatValue)) | (Float.floatToRawIntBits(0.0f) << 32);
            }
        }
        return Offset.Companion.m7996getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2299onPreFlingQWom1Mo(long r5, h.c.e<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            float r4 = r0.F$0
            e.b.c.b(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r7)
            h.g.a.p<java.lang.Float, h.c.e<? super java.lang.Float>, java.lang.Object> r4 = r4.onRelease
            float r5 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r5 = 0
            r0.F$0 = r5
            r0.label = r3
            java.lang.Object r7 = r4.invoke(r6, r0)
            if (r7 == r1) goto L5a
            r4 = r5
        L4b:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            long r4 = androidx.compose.ui.unit.VelocityKt.Velocity(r4, r5)
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m11397boximpl(r4)
            return r4
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        if (!this.enabled) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI())) {
            int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (Float.intBitsToFloat(i3) < 0.0f) {
                float fFloatValue = this.onPull.invoke(Float.valueOf(Float.intBitsToFloat(i3))).floatValue();
                return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fFloatValue) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }
        }
        return Offset.Companion.m7996getZeroF1C5BW0();
    }
}
