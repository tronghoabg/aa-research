package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f2) {
        double d2 = f2;
        return (float) (f2 >= 0.0f ? Math.ceil(d2) : Math.floor(d2));
    }

    public static final int composeToViewOffset(float f2) {
        return -extractIntegerPixels(f2);
    }

    private static final int extractIntegerPixels(float f2) {
        return a.b(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m10279getScrollAxesk4lQ0M(long j2) {
        float fAbs = Math.abs(Float.intBitsToFloat((int) (j2 >> 32)));
        float fAbs2 = Math.abs(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        int i2 = fAbs >= 0.5f ? 1 : 0;
        return fAbs2 >= 0.5f ? i2 | 2 : i2;
    }

    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i2, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:278)");
        }
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        boolean zChanged = composer.changed(view) | composer.changed(viewConfiguration);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view, viewConfiguration.getMinimumFlingVelocity());
            composer.updateRememberedValue(objRememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i2) {
        return -i2;
    }

    /* renamed from: scrollAxes-sF-c-tU, reason: not valid java name */
    private static final int m10280scrollAxessFctU(long j2, float f2) {
        float fAbs = Math.abs(Velocity.m11406getXimpl(j2));
        float fAbs2 = Math.abs(Velocity.m11407getYimpl(j2));
        int i2 = fAbs >= f2 ? 1 : 0;
        return fAbs2 >= f2 ? i2 | 2 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-moWRBKg, reason: not valid java name */
    public static final long m10281toOffsetmoWRBKg(int i2, int i3, int[] iArr, long j2) {
        int i4 = (int) (j2 >> 32);
        float fIntBitsToFloat = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat(i4) - reverseAxis(i2);
        int i5 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat2 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat(i5) - reverseAxis(i3);
        return (Float.floatToRawIntBits(Float.intBitsToFloat(i4) >= 0.0f ? n.f(reverseAxis(iArr[0]) + fIntBitsToFloat, Float.intBitsToFloat(i4)) : n.e(reverseAxis(iArr[0]) + fIntBitsToFloat, Float.intBitsToFloat(i4))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i5) >= 0.0f ? n.f(reverseAxis(iArr[1]) + fIntBitsToFloat2, Float.intBitsToFloat(i5)) : n.e(reverseAxis(iArr[1]) + fIntBitsToFloat2, Float.intBitsToFloat(i5))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m10282toViewTypeGyEprt8(int i2) {
        return NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI()) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f2) {
        return -f2;
    }
}
