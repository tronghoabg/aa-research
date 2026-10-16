package android.support.v7.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    OverScroller f1469a;

    /* renamed from: b, reason: collision with root package name */
    Interpolator f1470b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecyclerView f1471c;

    /* renamed from: d, reason: collision with root package name */
    private int f1472d;

    /* renamed from: e, reason: collision with root package name */
    private int f1473e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1474f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1475g;

    fd(RecyclerView recyclerView) {
        this.f1471c = recyclerView;
        Interpolator interpolator = RecyclerView.f935b;
        this.f1470b = interpolator;
        this.f1474f = false;
        this.f1475g = false;
        this.f1469a = new OverScroller(recyclerView.getContext(), interpolator);
    }

    private final void e() {
        RecyclerView recyclerView = this.f1471c;
        recyclerView.removeCallbacks(this);
        ViewCompat.postOnAnimation(recyclerView, this);
    }

    public final void a(int i2, int i3) {
        RecyclerView recyclerView = this.f1471c;
        recyclerView.an(2);
        this.f1473e = 0;
        this.f1472d = 0;
        Interpolator interpolator = this.f1470b;
        Interpolator interpolator2 = RecyclerView.f935b;
        if (interpolator != interpolator2) {
            this.f1470b = interpolator2;
            this.f1469a = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f1469a.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    final void b() {
        if (this.f1474f) {
            this.f1475g = true;
        } else {
            e();
        }
    }

    public final void c(int i2, int i3, int i4, Interpolator interpolator) {
        if (i4 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = this.f1471c;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (true != z) {
                iAbs = iAbs2;
            }
            i4 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i5 = i4;
        if (interpolator == null) {
            interpolator = RecyclerView.f935b;
        }
        if (this.f1470b != interpolator) {
            this.f1470b = interpolator;
            this.f1469a = new OverScroller(this.f1471c.getContext(), interpolator);
        }
        this.f1473e = 0;
        this.f1472d = 0;
        this.f1471c.an(2);
        this.f1469a.startScroll(0, 0, i2, i3, i5);
        b();
    }

    public final void d() {
        this.f1471c.removeCallbacks(this);
        this.f1469a.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fd.run():void");
    }
}
