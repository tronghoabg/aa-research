package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LayoutModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LayoutModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return MeasuringIntrinsics.INSTANCE.maxHeight(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        public static int $default$maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return MeasuringIntrinsics.INSTANCE.maxWidth(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        public static int $default$minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return MeasuringIntrinsics.INSTANCE.minHeight(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        public static int $default$minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return MeasuringIntrinsics.INSTANCE.minWidth(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier layoutModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(layoutModifier, lVar);
        }

        @Deprecated
        public static boolean any(LayoutModifier layoutModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(layoutModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier layoutModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(layoutModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier layoutModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(layoutModifier, r, pVar);
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return CC.$default$maxIntrinsicHeight(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return CC.$default$maxIntrinsicWidth(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return CC.$default$minIntrinsicHeight(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return CC.$default$minIntrinsicWidth(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static Modifier then(LayoutModifier layoutModifier, Modifier modifier) {
            return Modifier.CC.$default$then(layoutModifier, modifier);
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    /* renamed from: measure-3p2s80s */
    MeasureResult mo3273measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);
}
