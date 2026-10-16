package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ey {

    /* renamed from: d, reason: collision with root package name */
    private int f1441d = -1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1443f = false;

    /* renamed from: g, reason: collision with root package name */
    private int f1444g = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f1438a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1439b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1440c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private Interpolator f1442e = null;

    public final void a(int i2) {
        this.f1441d = i2;
    }

    final void b(RecyclerView recyclerView) {
        int i2 = this.f1441d;
        if (i2 >= 0) {
            this.f1441d = -1;
            recyclerView.V(i2);
            this.f1443f = false;
            return;
        }
        if (!this.f1443f) {
            this.f1444g = 0;
            return;
        }
        Interpolator interpolator = this.f1442e;
        if (interpolator != null && this.f1440c <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i3 = this.f1440c;
        if (i3 <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.B.c(this.f1438a, this.f1439b, i3, interpolator);
        int i4 = this.f1444g + 1;
        this.f1444g = i4;
        if (i4 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1443f = false;
    }

    public final void c(int i2, int i3, int i4, Interpolator interpolator) {
        this.f1438a = i2;
        this.f1439b = i3;
        this.f1440c = i4;
        this.f1442e = interpolator;
        this.f1443f = true;
    }

    final boolean d() {
        return this.f1441d >= 0;
    }
}
