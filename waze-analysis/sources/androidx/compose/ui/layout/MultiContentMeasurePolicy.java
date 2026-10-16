package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MultiContentMeasurePolicy {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.MultiContentMeasurePolicy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$maxIntrinsicHeight(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = arrayList;
                List list2 = (List) list.get(i3);
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
                }
                arrayList2.add(arrayList3);
            }
            return multiContentMeasurePolicy.mo2625measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
        }

        public static int $default$maxIntrinsicWidth(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = arrayList;
                List list2 = (List) list.get(i3);
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
                }
                arrayList2.add(arrayList3);
            }
            return multiContentMeasurePolicy.mo2625measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
        }

        public static int $default$minIntrinsicHeight(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = arrayList;
                List list2 = (List) list.get(i3);
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
                }
                arrayList2.add(arrayList3);
            }
            return multiContentMeasurePolicy.mo2625measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
        }

        public static int $default$minIntrinsicWidth(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = arrayList;
                List list2 = (List) list.get(i3);
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
                }
                arrayList2.add(arrayList3);
            }
            return multiContentMeasurePolicy.mo2625measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2);

    /* renamed from: measure-3p2s80s */
    MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2);
}
