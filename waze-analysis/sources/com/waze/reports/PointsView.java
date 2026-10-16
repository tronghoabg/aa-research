package com.waze.reports;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class PointsView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f33555a;

    /* renamed from: b, reason: collision with root package name */
    private final View f33556b;

    /* renamed from: c, reason: collision with root package name */
    private final View f33557c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f33558d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33559e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33560f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33561g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33562h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f33563i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33564j;

    public PointsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33559e = true;
        this.f33560f = true;
        this.f33561g = false;
        this.f33562h = true;
        this.f33563i = false;
        this.f33564j = false;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PointsView);
        this.f33563i = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.f33564j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PointsView_ignoreFirst, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f33563i) {
            layoutInflaterFrom.inflate(R.layout.points_marker_triangle, this);
        } else {
            layoutInflaterFrom.inflate(R.layout.points_marker, this);
        }
        this.f33557c = findViewById(R.id.pointsBg);
        this.f33555a = findViewById(R.id.pointsCheck);
        this.f33556b = findViewById(R.id.pointsMustFill);
        this.f33558d = (TextView) findViewById(R.id.pointsBadge);
    }

    private final Animation g(boolean z) {
        AlphaAnimation alphaAnimation;
        int i2 = 0;
        boolean z2 = true;
        if (this.f33563i) {
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                animationSet.setInterpolator(new OvershootInterpolator());
                i2 = 1;
            } else {
                animationSet.setInterpolator(new AnticipateInterpolator());
            }
            animationSet.setDuration(200L);
            animationSet.setFillAfter(true);
            animationSet.addAnimation(i2 != 0 ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f));
            animationSet.addAnimation(new ScaleAnimation(1 != i2 ? 1.0f : 0.0f, 1 != i2 ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f));
            return animationSet;
        }
        boolean z3 = this.f33561g;
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet2.setDuration(200L);
        animationSet2.setFillAfter(true);
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            z2 = false;
        }
        animationSet2.addAnimation(alphaAnimation);
        int i3 = 180;
        if (z2) {
            if (z3) {
                i2 = 180;
                i3 = 0;
            } else {
                i3 = 0;
                i2 = -180;
            }
        } else if (z3) {
            i3 = -180;
        }
        animationSet2.addAnimation(new RotateAnimation(i2, i3, 1, 0.5f, 1, 0.5f));
        return animationSet2;
    }

    public final void a(int i2) {
        b(i2, false);
    }

    public final void b(int i2, boolean z) {
        if (z || i2 <= 0) {
            this.f33559e = false;
            this.f33558d.setVisibility(8);
        } else {
            this.f33558d.setText("+" + i2);
        }
    }

    public final void c(boolean z) {
        this.f33561g = z;
        f(!z, true);
    }

    public final boolean d() {
        return this.f33560f;
    }

    public final boolean e() {
        if (this.f33564j) {
            this.f33564j = false;
            f(!this.f33561g, true);
        }
        return this.f33561g;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.PointsView.f(boolean, boolean):void");
    }
}
