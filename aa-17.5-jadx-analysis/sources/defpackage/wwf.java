package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class wwf extends LinearLayout {
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwf(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    private final void e(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.C == 0 || (tabLayout.l.getBounds().left == -1 && tabLayout.l.getBounds().right == -1)) {
            View childAt = getChildAt(i);
            Drawable drawable = tabLayout.l;
            RectF rectFE = wox.e(tabLayout, childAt);
            drawable.setBounds((int) rectFE.left, drawable.getBounds().top, (int) rectFE.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void a() {
        e(this.b.a());
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.l.getBounds();
        tabLayout.l.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = this.b;
            Drawable drawable = tabLayout.l;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.l.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = this.b;
            tabLayout2.D.f(tabLayout2, view, view2, f, tabLayout2.l);
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z, int i, int i2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        tabLayout.a = i;
        wwe wweVar = new wwe(this, childAt, childAt2, 0);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(wweVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.z);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimator.addUpdateListener(wweVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.b;
        int iHeight = tabLayout.l.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.l.getIntrinsicHeight();
        }
        int i = tabLayout.t;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            int height2 = getHeight() - iHeight;
            iHeight = (getHeight() + iHeight) / 2;
            height = height2 / 2;
        }
        if (tabLayout.l.getBounds().width() > 0) {
            Rect bounds = tabLayout.l.getBounds();
            tabLayout.l.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.l.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, this.b.a(), -1);
            return;
        }
        TabLayout tabLayout = this.b;
        int iA = tabLayout.a;
        if (iA == -1) {
            iA = tabLayout.a();
            tabLayout.a = iA;
        }
        e(iA);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.b;
        if (tabLayout.r == 1 || tabLayout.u == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax > 0) {
                int iE = (int) woy.E(getContext(), 16);
                if (iMax * childCount <= getMeasuredWidth() - (iE + iE)) {
                    boolean z = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                            layoutParams.width = iMax;
                            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    tabLayout.r = 0;
                    tabLayout.n(false);
                }
                super.onMeasure(i, i2);
            }
        }
    }
}
