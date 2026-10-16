package android.support.v7.view;

import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    ViewPropertyAnimatorListener f707b;

    /* renamed from: d, reason: collision with root package name */
    private Interpolator f709d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f710e;

    /* renamed from: c, reason: collision with root package name */
    private long f708c = -1;

    /* renamed from: f, reason: collision with root package name */
    private final ViewPropertyAnimatorListenerAdapter f711f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f706a = new ArrayList();

    public final void a() {
        if (this.f710e) {
            ArrayList arrayList = this.f706a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ViewPropertyAnimatorCompat) arrayList.get(i2)).cancel();
            }
            this.f710e = false;
        }
    }

    final void b() {
        this.f710e = false;
    }

    public final void c() {
        if (this.f710e) {
            return;
        }
        ArrayList arrayList = this.f706a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) arrayList.get(i2);
            long j2 = this.f708c;
            if (j2 >= 0) {
                viewPropertyAnimatorCompat.setDuration(j2);
            }
            Interpolator interpolator = this.f709d;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(interpolator);
            }
            if (this.f707b != null) {
                viewPropertyAnimatorCompat.setListener(this.f711f);
            }
            viewPropertyAnimatorCompat.start();
        }
        this.f710e = true;
    }

    public final void d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (this.f710e) {
            return;
        }
        this.f706a.add(viewPropertyAnimatorCompat);
    }

    public final void e(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        ArrayList arrayList = this.f706a;
        arrayList.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        arrayList.add(viewPropertyAnimatorCompat2);
    }

    public final void f() {
        if (this.f710e) {
            return;
        }
        this.f708c = 250L;
    }

    public final void g(Interpolator interpolator) {
        if (this.f710e) {
            return;
        }
        this.f709d = interpolator;
    }

    public final void h(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (this.f710e) {
            return;
        }
        this.f707b = viewPropertyAnimatorListener;
    }
}
