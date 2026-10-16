package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class nr {
    private int a = -1;

    public static int a(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static final int g(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static final void h(RecyclerView recyclerView, mo moVar, float f, float f2, boolean z) {
        View view = moVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int[] iArr = ebm.a;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = BitmapDescriptorFactory.HUE_RED;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    final int b(RecyclerView recyclerView, mo moVar) {
        return g(e(moVar), recyclerView.getLayoutDirection());
    }

    public void c(RecyclerView recyclerView, mo moVar) {
        throw null;
    }

    public final boolean d(RecyclerView recyclerView, mo moVar) {
        return (b(recyclerView, moVar) & 16711680) != 0;
    }

    public abstract int e(mo moVar);

    public final int f(RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.a;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.a = dimensionPixelSize;
        }
        int iAbs = Math.abs(i2);
        int iSignum = (int) Math.signum(i2);
        float fMin = Math.min(1.0f, iAbs / i) - 1.0f;
        float f = j > 2000 ? 1.0f : j / 2000.0f;
        int i3 = (int) (((int) (iSignum * dimensionPixelSize * ((fMin * fMin * fMin * fMin * fMin) + 1.0f))) * f * f * f * f * f);
        return i3 == 0 ? i2 > 0 ? 1 : -1 : i3;
    }
}
