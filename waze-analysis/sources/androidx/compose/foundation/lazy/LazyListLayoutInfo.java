package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyListLayoutInfo {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyListLayoutInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getAfterContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        public static int $default$getBeforeContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        public static int $default$getMainAxisItemSpacing(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        public static Orientation $default$getOrientation(LazyListLayoutInfo lazyListLayoutInfo) {
            return Orientation.Vertical;
        }

        public static boolean $default$getReverseLayout(LazyListLayoutInfo lazyListLayoutInfo) {
            return false;
        }

        /* renamed from: $default$getViewportSize-YbymL2g, reason: not valid java name */
        public static long m2880$default$getViewportSizeYbymL2g(LazyListLayoutInfo lazyListLayoutInfo) {
            return IntSize.Companion.m11344getZeroYbymL2g();
        }

        public static /* synthetic */ int access$getAfterContentPadding$jd(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        public static /* synthetic */ int access$getBeforeContentPadding$jd(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        public static /* synthetic */ int access$getMainAxisItemSpacing$jd(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        public static /* synthetic */ boolean access$getReverseLayout$jd(LazyListLayoutInfo lazyListLayoutInfo) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        @Deprecated
        public static int getBeforeContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        @Deprecated
        public static int getMainAxisItemSpacing(LazyListLayoutInfo lazyListLayoutInfo) {
            return 0;
        }

        @Deprecated
        public static Orientation getOrientation(LazyListLayoutInfo lazyListLayoutInfo) {
            return CC.$default$getOrientation(lazyListLayoutInfo);
        }

        @Deprecated
        public static boolean getReverseLayout(LazyListLayoutInfo lazyListLayoutInfo) {
            return false;
        }

        @Deprecated
        /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m2882getViewportSizeYbymL2g(LazyListLayoutInfo lazyListLayoutInfo) {
            return CC.m2880$default$getViewportSizeYbymL2g(lazyListLayoutInfo);
        }
    }

    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo2879getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyListItemInfo> getVisibleItemsInfo();
}
