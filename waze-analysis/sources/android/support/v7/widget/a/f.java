package android.support.v7.widget.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f998a = new e(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f999b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    private int f1000c = -1;

    public static int b(int i2, int i3) {
        int i4;
        int i5 = i2 & 789516;
        if (i5 == 0) {
            return i2;
        }
        int i6 = i2 & (~i5);
        if (i3 == 0) {
            i4 = i5 << 2;
        } else {
            int i7 = i5 + i5;
            i6 |= (-789517) & i7;
            i4 = (i7 & 789516) << 2;
        }
        return i6 | i4;
    }

    public final int a(int i2, int i3) {
        int i4;
        int i5 = i2 & 3158064;
        if (i5 == 0) {
            return i2;
        }
        int i6 = i2 & (~i5);
        if (i3 == 0) {
            i4 = i5 >> 2;
        } else {
            int i7 = i5 >> 1;
            i6 |= (-3158065) & i7;
            i4 = (3158064 & i7) >> 2;
        }
        return i4 | i6;
    }

    public void c(fe feVar, int i2) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public abstract int e();

    public final int f(RecyclerView recyclerView, int i2, int i3, long j2) {
        int dimensionPixelSize = this.f1000c;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.f1000c = dimensionPixelSize;
        }
        int iSignum = (int) (((int) (((int) Math.signum(i3)) * dimensionPixelSize * f999b.getInterpolation(Math.min(1.0f, Math.abs(i3) / i2)))) * f998a.getInterpolation(j2 <= 2000 ? j2 / 2000.0f : 1.0f));
        return iSignum == 0 ? i3 > 0 ? 1 : -1 : iSignum;
    }

    public abstract void g(fe feVar, fe feVar2);

    final int h(RecyclerView recyclerView) {
        return a(e(), recyclerView.getLayoutDirection());
    }

    public final void i(RecyclerView recyclerView, fe feVar, float f2, float f3, boolean z) {
        View view = feVar.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(ViewCompat.getElevation(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float elevation = ViewCompat.getElevation(childAt);
                    if (elevation > f4) {
                        f4 = elevation;
                    }
                }
            }
            ViewCompat.setElevation(view, f4 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
