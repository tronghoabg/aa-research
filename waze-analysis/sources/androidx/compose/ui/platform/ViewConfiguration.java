package androidx.compose.ui.platform;

import androidx.compose.ui.unit.DpKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ViewConfiguration {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.ViewConfiguration$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static float $default$getHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return 16.0f;
        }

        public static float $default$getHandwritingSlop(ViewConfiguration viewConfiguration) {
            return 2.0f;
        }

        public static float $default$getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            return Float.MAX_VALUE;
        }

        public static float $default$getMinimumFlingVelocity(ViewConfiguration viewConfiguration) {
            return 0.0f;
        }

        /* renamed from: $default$getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m10291$default$getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            return DpKt.m11186DpSizeYgX7TsA(48.0f, 48.0f);
        }

        public static /* synthetic */ float access$getHandwritingGestureLineMargin$jd(ViewConfiguration viewConfiguration) {
            return 16.0f;
        }

        public static /* synthetic */ float access$getHandwritingSlop$jd(ViewConfiguration viewConfiguration) {
            return 2.0f;
        }

        public static /* synthetic */ float access$getMaximumFlingVelocity$jd(ViewConfiguration viewConfiguration) {
            return Float.MAX_VALUE;
        }

        public static /* synthetic */ float access$getMinimumFlingVelocity$jd(ViewConfiguration viewConfiguration) {
            return 0.0f;
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class DefaultImpls {
        @Deprecated
        public static float getHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return 16.0f;
        }

        @Deprecated
        public static float getHandwritingSlop(ViewConfiguration viewConfiguration) {
            return 2.0f;
        }

        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            return Float.MAX_VALUE;
        }

        @Deprecated
        public static float getMinimumFlingVelocity(ViewConfiguration viewConfiguration) {
            return 0.0f;
        }

        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m10293getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            return CC.m10291$default$getMinimumTouchTargetSizeMYxV2XQ(viewConfiguration);
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    float getHandwritingGestureLineMargin();

    float getHandwritingSlop();

    long getLongPressTimeoutMillis();

    float getMaximumFlingVelocity();

    float getMinimumFlingVelocity();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    long mo9982getMinimumTouchTargetSizeMYxV2XQ();

    float getTouchSlop();
}
