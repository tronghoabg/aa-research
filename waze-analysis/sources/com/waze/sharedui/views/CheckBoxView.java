package com.waze.sharedui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.waze.R;
import com.waze.search.h.ay;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class CheckBoxView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    ay f39124a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f39125b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f39126c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f39127d;

    /* renamed from: e, reason: collision with root package name */
    private int f39128e;

    public CheckBoxView(Context context) {
        super(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f39125b = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.checkbox, this);
        h();
    }

    private final void h() {
        this.f39126c = (ImageView) findViewById(R.id.checkbox_bg_on);
        this.f39127d = (ImageView) findViewById(R.id.checkbox_v);
    }

    private final void i(int i2) {
        this.f39127d.clearAnimation();
        this.f39126c.clearAnimation();
        int i3 = i2 - 1;
        ImageView imageView = this.f39127d;
        if (i3 != 0) {
            imageView.setVisibility(4);
            this.f39126c.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f39126c.setVisibility(0);
        }
    }

    public final void c(boolean z) {
        int i2 = true != z ? 2 : 1;
        int i3 = this.f39128e;
        if (i3 == i2) {
            i(i3);
        } else {
            this.f39128e = i2;
            i(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.waze.sharedui.views.w, java.lang.Object] */
    public final void d() {
        AlphaAnimation alphaAnimation;
        int i2 = true != e() ? 1 : 2;
        this.f39128e = i2;
        int i3 = i2 - 1;
        if (i3 != 0) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setStartOffset(60L);
        } else {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setStartOffset(0L);
        }
        alphaAnimation.setDuration(90L);
        alphaAnimation.setFillAfter(true);
        this.f39126c.setVisibility(0);
        alphaAnimation.setAnimationListener(new f(this));
        this.f39126c.startAnimation(alphaAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        this.f39127d.setVisibility(0);
        if (i3 != 0) {
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setStartOffset(0L);
        } else {
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.setStartOffset(90L);
        }
        animationSet.setDuration(60L);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setAnimationListener(new e(this));
        this.f39127d.startAnimation(animationSet);
        ay ayVar = this.f39124a;
        if (ayVar != null) {
            ayVar.f35803a.a(e());
        }
    }

    public final boolean e() {
        return this.f39128e == 1;
    }

    public final void g(ay ayVar) {
        this.f39124a = ayVar;
    }

    public CheckBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f39125b = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.checkbox, this);
        h();
    }
}
