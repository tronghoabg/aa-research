package com.waze.z.a.b;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    private final ab f45791a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45792b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f45793c;

    public x(ab abVar, ScrollState scrollState, int i2) {
        this.f45792b = i2;
        h.g.b.x.f(abVar, "bottomSheetState");
        h.g.b.x.f(scrollState, "scrollState");
        this.f45791a = abVar;
        this.f45793c = scrollState;
    }

    private static final long a(float f2) {
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, h.c.e eVar) {
        return this.f45792b != 0 ? NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar) : NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        int i3 = this.f45792b;
        ab abVar = this.f45791a;
        if (i3 == 0) {
            return a(abVar.d().dispatchRawDelta(Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
        }
        try {
            float fDispatchRawDelta = abVar.d().dispatchRawDelta(Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fDispatchRawDelta) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        } catch (IllegalArgumentException unused) {
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        if (r0.settle(r1, r2) != r4) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2299onPreFlingQWom1Mo(long r17, h.c.e r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.b.x.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        if (this.f45792b == 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            return fIntBitsToFloat < 0.0f ? a(this.f45791a.d().dispatchRawDelta(fIntBitsToFloat)) : Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) < 0.0f) {
            try {
                return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f45791a.d().dispatchRawDelta(r6)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            } catch (IllegalArgumentException unused) {
            }
        }
        return Offset.Companion.m7996getZeroF1C5BW0();
    }

    public x(ab abVar, LazyListState lazyListState, int i2) {
        this.f45792b = i2;
        h.g.b.x.f(abVar, "bottomSheetState");
        h.g.b.x.f(lazyListState, "lazyListState");
        this.f45791a = abVar;
        this.f45793c = lazyListState;
    }
}
