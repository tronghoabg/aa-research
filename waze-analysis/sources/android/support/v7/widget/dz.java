package android.support.v7.widget;

import androidx.core.view.DifferentialMotionFlingTarget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dz implements DifferentialMotionFlingTarget {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f1382a;

    dz(RecyclerView recyclerView) {
        this.f1382a = recyclerView;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public final float getScaledScrollFactor() {
        float f2;
        RecyclerView recyclerView = this.f1382a;
        if (recyclerView.n.af()) {
            f2 = recyclerView.A;
        } else {
            if (!recyclerView.n.ae()) {
                return 0.0f;
            }
            f2 = recyclerView.z;
        }
        return -f2;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public final boolean startDifferentialMotionFling(float f2) {
        int i2;
        int i3;
        RecyclerView recyclerView = this.f1382a;
        int i4 = 0;
        if (recyclerView.n.af()) {
            i3 = (int) f2;
            i2 = 0;
        } else if (recyclerView.n.ae()) {
            i2 = (int) f2;
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = i2;
        } else if (i3 == 0) {
            return false;
        }
        recyclerView.ar();
        return recyclerView.at(i4, i3);
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public final void stopDifferentialMotionFling() {
        this.f1382a.ar();
    }
}
