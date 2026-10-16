package com.waze.sharedui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f39260a;

    /* renamed from: b, reason: collision with root package name */
    protected final PopupWindow f39261b;

    /* renamed from: c, reason: collision with root package name */
    protected final View f39262c;

    /* renamed from: d, reason: collision with root package name */
    protected final FrameLayout f39263d;

    /* renamed from: e, reason: collision with root package name */
    protected final float f39264e;

    /* renamed from: f, reason: collision with root package name */
    private final View f39265f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39266g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f39267h;

    /* renamed from: i, reason: collision with root package name */
    private int f39268i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f39269j = -1;

    /* renamed from: k, reason: collision with root package name */
    private com.waze.shared_infra.s.d f39270k = null;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f39271l;

    public p(Context context, String str) {
        this.f39260a = context;
        this.f39264e = context.getResources().getDisplayMetrics().density;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39263d = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        layoutInflater.inflate(R.layout.tiny_tooltip, frameLayout);
        View childAt = frameLayout.getChildAt(0);
        this.f39262c = childAt;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 51;
        childAt.setLayoutParams(layoutParams);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f39261b = popupWindow;
        popupWindow.setTouchable(true);
        popupWindow.setBackgroundDrawable(null);
        popupWindow.setWindowLayoutMode(-1, -1);
        popupWindow.setContentView(frameLayout);
        popupWindow.setElevation(0.0f);
        this.f39265f = childAt;
        Paint paint = new Paint(1);
        this.f39267h = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(ContextCompat.getColor(context, R.color.surface_default));
        popupWindow.setTouchable(false);
        popupWindow.setFocusable(false);
        popupWindow.setOutsideTouchable(false);
        TextView textView = (TextView) childAt.findViewById(R.id.tinyTooltipText);
        this.f39271l = textView;
        textView.setText(str);
    }

    private final void i() {
        com.waze.shared_infra.s.d dVar = this.f39270k;
        if (dVar != null) {
            dVar.a();
            this.f39270k = null;
        }
    }

    private final void j(View view) {
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        int i5;
        float f4;
        View view2 = this.f39265f;
        view2.setBackground(null);
        view2.setPadding(0, 0, 0, 0);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i6 = iArr[1];
        int height = i6 + view.getHeight();
        int width = iArr[0] + (view.getWidth() / 2);
        Context context = this.f39260a;
        int i7 = context.getResources().getDisplayMetrics().widthPixels;
        float f5 = context.getResources().getDisplayMetrics().heightPixels;
        float f6 = this.f39264e;
        View view3 = this.f39262c;
        view3.measure(View.MeasureSpec.makeMeasureSpec((int) (i7 - (60.0f * f6)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int) (f5 - (50.0f * f6)), Integer.MIN_VALUE));
        int measuredHeight = view3.getMeasuredHeight();
        float f7 = 5.0f * f6;
        int i8 = (i6 - measuredHeight) + ((int) f7);
        int measuredWidth = view3.getMeasuredWidth();
        boolean z = i8 > 0;
        this.f39266g = z;
        int i9 = ((int) (70.0f * f6)) + measuredHeight;
        float f8 = 20.0f * f6;
        int i10 = measuredWidth + (measuredHeight / 2) + ((int) (f8 + f8));
        int i11 = i10 / 2;
        int i12 = width + i11;
        int i13 = width - i11;
        int i14 = (i13 < 0 || i12 > i7) ? (i13 < 0 || (i2 = i7 - i10) < 0) ? 0 : i2 : i13;
        int i15 = width - i14;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getContext().getResources().getDisplayMetrics(), i10, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        path.reset();
        if (i8 > 0) {
            f2 = f7;
            i3 = 15;
        } else {
            f2 = f7;
            i3 = 25;
        }
        boolean z2 = z;
        float f9 = i9;
        if (i8 > 0) {
            f3 = f9;
            i4 = 35;
        } else {
            f3 = f9;
            i4 = 25;
        }
        float f10 = i10;
        float f11 = i3 * f6;
        float f12 = f3 - (i4 * f6);
        float f13 = f12 - f11;
        float f14 = f13 + f2;
        path.moveTo(f14, f11);
        float f15 = 6.0f * f6;
        float f16 = 8.0f * f6;
        if (z2) {
            i5 = height;
            f4 = f6;
        } else {
            float f17 = i15;
            i5 = height;
            f4 = f6;
            path.lineTo(f17 - f15, f11);
            path.lineTo(f17, f11 - f16);
            path.lineTo(f17 + f15, f11);
        }
        float f18 = (f10 - f13) - f2;
        path.lineTo(f18, f11);
        RectF rectF = new RectF(f18, f11, f18 + f13, f12);
        path.arcTo(rectF, 270.0f, 180.0f);
        if (z2) {
            float f19 = i15;
            path.lineTo(f19 - f15, f12);
            path.lineTo(f19, f12 + f16);
            path.lineTo(f19 + f15, f12);
        }
        path.lineTo(15.0f * f4, f12);
        rectF.set(f14 - f13, f11, f14, f12);
        path.arcTo(rectF, 90.0f, 180.0f);
        canvas.drawPath(path, this.f39267h);
        view2.setBackground(new BitmapDrawable(view2.getContext().getResources(), bitmapCreateBitmap));
        view2.setElevation(view2.getResources().getDimension(R.dimen.card_elevation_2));
        view2.setOutlineProvider(new n(this, path, f14, f13, f11, f18, f12));
        int i16 = measuredHeight / 4;
        boolean z3 = this.f39266g;
        int i17 = true != z3 ? 35 : 25;
        int i18 = true == z3 ? 45 : 35;
        int i19 = (int) (i16 + f8);
        view2.setPadding(i19, (int) (i17 * f4), i19, (int) (f4 * i18));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
        layoutParams.leftMargin = i14;
        layoutParams.topMargin = this.f39266g ? i6 - (i9 - ((int) (f4 * 4.0f))) : i5;
    }

    public final void a(boolean z) {
        Animation animationLoadAnimation;
        i();
        if (!z) {
            this.f39261b.dismiss();
            return;
        }
        int i2 = this.f39269j;
        if (i2 < 0) {
            animationLoadAnimation = new AlphaAnimation(1.0f, 0.0f);
            animationLoadAnimation.setDuration(1000L);
        } else {
            animationLoadAnimation = i2 > 0 ? AnimationUtils.loadAnimation(this.f39262c.getContext(), this.f39269j) : null;
        }
        if (animationLoadAnimation == null) {
            this.f39261b.dismiss();
        } else {
            animationLoadAnimation.setAnimationListener(new o(this));
            this.f39262c.startAnimation(animationLoadAnimation);
        }
    }

    public final void b(View view) {
        if (view == null) {
            return;
        }
        j(view);
    }

    public final void c(int i2) {
        this.f39267h.setColor(i2);
    }

    public final void d(View view) {
        i();
        if (view == null) {
            return;
        }
        if (!ViewCompat.isLaidOut(view)) {
            this.f39270k = com.waze.ad.a.j.c(view, new com.google.firebase.messaging.m(this, view, 7));
            return;
        }
        j(view);
        this.f39261b.showAtLocation(view, 0, 0, 0);
        int i2 = this.f39268i;
        if (i2 < 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            this.f39262c.startAnimation(alphaAnimation);
        } else if (i2 > 0) {
            View view2 = this.f39262c;
            view2.startAnimation(AnimationUtils.loadAnimation(view2.getContext(), this.f39268i));
        }
    }

    public final void e(String str) {
        this.f39271l.setText(str);
    }

    public final void f(int i2) {
        this.f39271l.setTextColor(i2);
    }

    public final void g(float f2) {
        this.f39271l.setTextSize(0, f2);
    }

    public final void h() {
        this.f39268i = R.anim.contact_tooltip_show;
        this.f39269j = R.anim.contact_tooltip_hide;
    }
}
