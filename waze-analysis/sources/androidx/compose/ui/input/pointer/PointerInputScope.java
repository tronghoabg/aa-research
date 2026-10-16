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
public interface PointerInputScope extends Density {
    <R> Object awaitPointerEventScope(p<? super AwaitPointerEventScope, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    long mo2117getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g */
    long mo2118getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputScope$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m9634$default$getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return Size.Companion.m8058getZeroNHjbRc();
        }

        public static boolean $default$getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return false;
        }

        public static /* synthetic */ boolean access$getInterceptOutOfBoundsChildEvents$jd(PointerInputScope pointerInputScope) {
            return false;
        }

        public static void $default$setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z) {
        }

        public static /* synthetic */ void access$setInterceptOutOfBoundsChildEvents$jd(PointerInputScope pointerInputScope, boolean z) {
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m9648getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return CC.m9634$default$getExtendedTouchPaddingNHjbRc(pointerInputScope);
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return false;
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m9649roundToPxR2X_6o(PointerInputScope pointerInputScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(pointerInputScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m9650roundToPx0680j_4(PointerInputScope pointerInputScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(pointerInputScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m9651toDpGaN1DYA(PointerInputScope pointerInputScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(pointerInputScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9652toDpu2uoSUM(PointerInputScope pointerInputScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(pointerInputScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m9654toDpSizekrfVVM(PointerInputScope pointerInputScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(pointerInputScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m9655toPxR2X_6o(PointerInputScope pointerInputScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(pointerInputScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m9656toPx0680j_4(PointerInputScope pointerInputScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(pointerInputScope, f2);
        }

        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            return Density.CC.$default$toRect(pointerInputScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m9657toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(pointerInputScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m9658toSp0xMU5do(PointerInputScope pointerInputScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(pointerInputScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9659toSpkPz2Gy4(PointerInputScope pointerInputScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(pointerInputScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9653toDpu2uoSUM(PointerInputScope pointerInputScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) pointerInputScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9660toSpkPz2Gy4(PointerInputScope pointerInputScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) pointerInputScope, i2);
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z) {
        }
    }
}
