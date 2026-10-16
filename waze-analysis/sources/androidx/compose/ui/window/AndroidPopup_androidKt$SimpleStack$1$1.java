package androidx.compose.ui.window;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
        }
        if (size == 1) {
            Placeable placeableMo9741measureBRTryo0 = list.get(0).mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new AnonymousClass2(placeableMo9741measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            Placeable placeableMo9741measureBRTryo02 = list.get(i2).mo9741measureBRTryo0(j2);
            iMax = Math.max(iMax, placeableMo9741measureBRTryo02.getWidth());
            iMax2 = Math.max(iMax2, placeableMo9741measureBRTryo02.getHeight());
            arrayList.add(placeableMo9741measureBRTryo02);
        }
        return MeasureScope.CC.layout$default(measureScope, iMax, iMax2, null, new AnonymousClass3(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends y implements l<Placeable.PlacementScope, ab> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends y implements l<Placeable.PlacementScope, ab> {
        final /* synthetic */ Placeable $p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Placeable placeable) {
            super(1);
            this.$p = placeable;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends y implements l<Placeable.PlacementScope, ab> {
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends Placeable> list) {
            super(1);
            this.$placeables = list;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
            int iE = i.e(this.$placeables);
            if (iE < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                Placeable.PlacementScope placementScope2 = placementScope;
                Placeable.PlacementScope.placeRelative$default(placementScope2, this.$placeables.get(i2), 0, 0, 0.0f, 4, null);
                if (i2 == iE) {
                    return;
                }
                i2++;
                placementScope = placementScope2;
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return ab.f48028a;
        }
    }
}
