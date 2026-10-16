package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {
    Object awaitPointerEvent(PointerEventPass pointerEventPass, e<? super PointerEvent> eVar);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo9478getExtendedTouchPaddingNHjbRc();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo9479getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    <T> Object withTimeout(long j2, p<? super AwaitPointerEventScope, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar);

    <T> Object withTimeoutOrNull(long j2, p<? super AwaitPointerEventScope, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.AwaitPointerEventScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m9480$default$getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return Size.Companion.m8058getZeroNHjbRc();
        }

        public static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
            }
            if ((i2 & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, eVar);
        }

        public static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j2, p<? super AwaitPointerEventScope, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
            return pVar.invoke(awaitPointerEventScope, eVar);
        }

        public static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j2, p<? super AwaitPointerEventScope, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
            return pVar.invoke(awaitPointerEventScope, eVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m9494getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return CC.m9480$default$getExtendedTouchPaddingNHjbRc(awaitPointerEventScope);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m9495roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(awaitPointerEventScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m9496roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(awaitPointerEventScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m9497toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(awaitPointerEventScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9498toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(awaitPointerEventScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m9500toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(awaitPointerEventScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m9501toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(awaitPointerEventScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m9502toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(awaitPointerEventScope, f2);
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return Density.CC.$default$toRect(awaitPointerEventScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m9503toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(awaitPointerEventScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m9504toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(awaitPointerEventScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9505toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(awaitPointerEventScope, f2);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j2, p<? super AwaitPointerEventScope, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
            return CC.withTimeout$suspendImpl(awaitPointerEventScope, j2, pVar, eVar);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j2, p<? super AwaitPointerEventScope, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
            return CC.withTimeoutOrNull$suspendImpl(awaitPointerEventScope, j2, pVar, eVar);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9499toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) awaitPointerEventScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9506toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) awaitPointerEventScope, i2);
        }
    }
}
