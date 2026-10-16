package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18864a;

    /* renamed from: b, reason: collision with root package name */
    public int f18865b;

    /* renamed from: c, reason: collision with root package name */
    public int f18866c;

    /* renamed from: d, reason: collision with root package name */
    public int f18867d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f18868e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18869f;

    /* renamed from: g, reason: collision with root package name */
    public int f18870g;

    public final void a(RecyclerView recyclerView) {
        int i5 = this.f18867d;
        if (i5 >= 0) {
            this.f18867d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i5);
            this.f18869f = false;
            return;
        }
        if (!this.f18869f) {
            this.f18870g = 0;
            return;
        }
        Interpolator interpolator = this.f18868e;
        if (interpolator != null && this.f18866c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f18866c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.mViewFlinger.b(this.f18864a, this.f18865b, interpolator, i10);
        int i11 = this.f18870g + 1;
        this.f18870g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f18869f = false;
    }

    public final void b(int i5, int i10, Interpolator interpolator, int i11) {
        this.f18864a = i5;
        this.f18865b = i10;
        this.f18866c = i11;
        this.f18868e = interpolator;
        this.f18869f = true;
    }
}
