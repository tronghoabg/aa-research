package H9;

import B9.h;
import D9.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public abstract class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f4984a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4985b;

    /* renamed from: c, reason: collision with root package name */
    public final DisplayMetrics f4986c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4987d;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4987d = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f1645a, 0, 0);
        try {
            this.f4984a = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            this.f4985b = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f4986c = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static int d(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public static void f(View view, int i5, int i10, int i11, int i12) {
        e.c("\tleft, right", i5, i11);
        e.c("\ttop, bottom", i10, i12);
        view.layout(i5, i10, i11, i12);
    }

    public final int a(int i5) {
        if (getMaxHeightPct() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e.a("Height: restrict by spec");
            return View.MeasureSpec.getSize(i5);
        }
        e.a("Height: restrict by pct");
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4) * 4;
    }

    public final int b(int i5) {
        if (getMaxWidthPct() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e.a("Width: restrict by spec");
            return View.MeasureSpec.getSize(i5);
        }
        e.a("Width: restrict by pct");
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4) * 4;
    }

    public final View c(int i5) {
        View viewFindViewById = findViewById(i5);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(AbstractC3256n.g(i5, "No such child: "));
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f4986c;
    }

    public float getMaxHeightPct() {
        return this.f4985b;
    }

    public float getMaxWidthPct() {
        return this.f4984a;
    }

    public List<View> getVisibleChildren() {
        return this.f4987d;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i5, int i10, int i11, int i12) {
        e.c("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i5, i10, i11, i12);
        e.c("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        e.a("============ BEGIN LAYOUT ============");
        e.a("onLayout: l: " + i5 + ", t: " + i10 + ", r: " + i11 + ", b: " + i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        e.a("============ BEGIN MEASURE ============");
        e.c("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        ArrayList arrayList = this.f4987d;
        arrayList.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            } else {
                e.b("Skipping GONE child", i11);
            }
        }
    }
}
