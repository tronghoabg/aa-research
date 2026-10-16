package com.waze.trip_overview.views.trip_details_container;

import android.view.View;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends com.google.android.material.bottomsheet.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ StopDragBottomSheetBehavior f41560a;

    /* renamed from: b, reason: collision with root package name */
    private int f41561b = 3;

    public f(StopDragBottomSheetBehavior stopDragBottomSheetBehavior) {
        this.f41560a = stopDragBottomSheetBehavior;
    }

    static final void c(StopDragBottomSheetBehavior stopDragBottomSheetBehavior, f fVar) {
        stopDragBottomSheetBehavior.x(fVar.f41561b);
        fVar.f41560a.R(fVar.f41561b == 3 ? 1.0f : 0.0f);
        fVar.f41561b = fVar.f41561b == 3 ? 4 : 3;
    }

    @Override // com.google.android.material.bottomsheet.f
    public final void a(View view, float f2) {
        x.f(view, "bottomSheet");
        final StopDragBottomSheetBehavior stopDragBottomSheetBehavior = this.f41560a;
        if (f2 < stopDragBottomSheetBehavior.Q() || f2 == 1.0f) {
            stopDragBottomSheetBehavior.s(true);
        } else if (stopDragBottomSheetBehavior.L()) {
            stopDragBottomSheetBehavior.s(false);
            stopDragBottomSheetBehavior.S(true);
            view.post(new Runnable() { // from class: com.waze.trip_overview.views.trip_details_container.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.c(stopDragBottomSheetBehavior, this);
                }
            });
        }
        if (f2 <= 0.0f || f2 >= 1.0f) {
            stopDragBottomSheetBehavior.s(true);
            stopDragBottomSheetBehavior.S(false);
        }
    }

    @Override // com.google.android.material.bottomsheet.f
    public final void b(View view) {
        x.f(view, "bottomSheet");
    }
}
