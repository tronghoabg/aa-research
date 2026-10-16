package com.waze.view.c;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import com.waze.R;
import com.waze.design_components.button.timer.b;
import com.waze.search.v2.o;
import com.waze.settings.tree.d.g;
import com.waze.settings.tree.d.p;
import com.waze.settings.tree.views.j;
import com.waze.sharedui.views.WazeTextView;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f45023a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45024b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45025c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45026d;

    /* renamed from: e, reason: collision with root package name */
    private final View f45027e;

    /* renamed from: f, reason: collision with root package name */
    private int f45028f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f45029g;

    /* renamed from: h, reason: collision with root package name */
    private ValueAnimator f45030h;

    /* renamed from: i, reason: collision with root package name */
    private j f45031i;

    public a(Context context) throws Resources.NotFoundException {
        super(context);
        this.f45023a = ContextCompat.getColor(getContext(), R.color.content_p2);
        this.f45024b = getResources().getColor(R.color.primary_variant);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.slide_selector_bubble_margin);
        this.f45025c = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.slide_selector_option_width);
        this.f45026d = dimensionPixelSize2;
        this.f45028f = -1;
        LayoutInflater.from(getContext()).inflate(R.layout.waze_slide_selector_view, this);
        View viewFindViewById = findViewById(R.id.slide_selector_bubble);
        this.f45027e = viewFindViewById;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.slide_selector_options_container);
        this.f45029g = viewGroup;
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.width = dimensionPixelSize2 - (dimensionPixelSize + dimensionPixelSize);
        viewFindViewById.setLayoutParams(layoutParams);
        h(0);
        setVisibility(viewGroup.getChildCount() == 0 ? 8 : 0);
    }

    private final int e(int i2) {
        return MathUtils.clamp(i2, 0, this.f45029g.getChildCount() - 1);
    }

    private final int f(float f2) {
        return e(Math.round(f2 / this.f45026d));
    }

    private final void g() {
        ValueAnimator valueAnimator = this.f45030h;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f45030h.cancel();
    }

    private final void h(int i2) {
        int iE = e(i2);
        int i3 = 0;
        while (true) {
            ViewGroup viewGroup = this.f45029g;
            if (i3 >= viewGroup.getChildCount()) {
                return;
            }
            ((TextView) viewGroup.getChildAt(i3)).setTextColor(i3 == iE ? this.f45024b : this.f45023a);
            i3++;
        }
    }

    private final void i(float f2, boolean z) {
        float fClamp = MathUtils.clamp(f2, 0.0f, (this.f45029g.getChildCount() - 1) * this.f45026d);
        if (z) {
            g();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f45027e.getTranslationX(), fClamp);
            this.f45030h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.0f));
            this.f45030h.addUpdateListener(new b(this, 4));
            this.f45030h.setDuration(200L);
            this.f45030h.start();
        } else {
            this.f45027e.setTranslationX(fClamp);
        }
        h(f(fClamp));
    }

    public final void b(int i2, boolean z) {
        int iE = e(i2);
        i(e(iE) * this.f45026d, z);
        if (this.f45028f == iE) {
            return;
        }
        this.f45028f = iE;
        j jVar = this.f45031i;
        if (jVar != null) {
            p pVar = jVar.f37624a;
            String strB = pVar.d().b();
            pVar.d().c(jVar.f37625b, ((g) pVar.f().get(iE)).s(), strB);
            o.i(pVar, jVar.f37626c, strB, ((g) pVar.f().get(iE)).s());
        }
    }

    public final void c(List list) {
        ViewGroup viewGroup = this.f45029g;
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            WazeTextView wazeTextView = new WazeTextView(getContext());
            wazeTextView.setText(str);
            wazeTextView.setTextAppearance(getContext(), R.style.slide_selector_option);
            wazeTextView.setSingleLine();
            wazeTextView.setGravity(17);
            wazeTextView.setLayoutParams(new LinearLayout.LayoutParams(this.f45026d, -1));
            viewGroup.addView(wazeTextView);
        }
        setVisibility(viewGroup.getChildCount() == 0 ? 8 : 0);
    }

    public final void d(j jVar) {
        this.f45031i = jVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX() - (this.f45026d / 2.0f);
        int action = motionEvent.getAction();
        if (action == 0) {
            i(x, true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                g();
                i(x, false);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        b(f(x), true);
        return true;
    }
}
