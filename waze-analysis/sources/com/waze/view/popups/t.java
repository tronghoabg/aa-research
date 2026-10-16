package com.waze.view.popups;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.car_lib.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected final View f45348a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f45349b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45350c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45351d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45352e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f45353f;

    /* renamed from: g, reason: collision with root package name */
    private Long f45354g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f45355h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f45356i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f45357j;

    /* renamed from: k, reason: collision with root package name */
    private final u f45358k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45359l;
    private s m;

    public t(Context context) {
        super(context, null, 0);
        this.f45351d = false;
        this.f45352e = false;
        this.f45355h = new Path();
        this.f45356i = new Paint();
        this.f45358k = new u();
        this.f45359l = true;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.nav_list_menu_tooltip, (ViewGroup) null);
        this.f45348a = viewInflate;
        this.f45349b = (TextView) viewInflate.findViewById(R.id.lblNavListTooltip);
        addView(viewInflate, -2, -2);
        viewInflate.findViewById(R.id.tooltipActionTouchArea).setOnClickListener(new com.waze.settings.g(this, 12));
        viewInflate.findViewById(R.id.btnCloseTooltipTouchArea).setOnClickListener(new com.waze.settings.g(this, 13));
        Paint paint = new Paint(1);
        this.f45356i = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f45356i.setColor(ContextCompat.getColor(getContext(), R.color.primary));
        setElevation(getResources().getDimension(R.dimen.card_elevation_2));
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        setVisibility(8);
        this.f45352e = false;
        this.f45350c = false;
    }

    private final boolean l() {
        return this.f45350c || this.f45351d;
    }

    public final void c(int i2, int i3, int i4, int i5, int i6, DisplayMetrics displayMetrics) {
        u uVar = this.f45358k;
        int i7 = uVar.f45360a;
        int i8 = uVar.f45361b;
        boolean z = true;
        int iR = 0;
        if (!this.f45353f && i3 + i5 + i7 < i4) {
            z = false;
        }
        int i9 = z ? (i3 - i7) - i5 : i3 + i7;
        if (i6 < displayMetrics.widthPixels && i6 < i2) {
            iR = (i2 - (i6 - com.waze.shared_infra.i.h.r(20))) + i8;
            if (iR + i6 > displayMetrics.widthPixels) {
                iR = displayMetrics.widthPixels - i6;
            }
        }
        setTranslationY(i9);
        setTranslationX(iR);
        float f2 = i2 - iR;
        setPivotX(f2);
        setPivotY(z ? i5 : 0.0f);
        Path path = this.f45355h;
        path.reset();
        float f3 = uVar.f45364e;
        int i10 = i5 - uVar.f45365f;
        float f4 = uVar.f45362c;
        int i11 = i6 - uVar.f45363d;
        float f5 = displayMetrics.density * 12.0f;
        float f6 = displayMetrics.density * 12.0f;
        float f7 = displayMetrics.density * 24.0f;
        float f8 = i10;
        float f9 = f8 - f7;
        path.moveTo(f4, f9);
        float f10 = f3 + f7;
        path.lineTo(f4, f10);
        float f11 = f4 + f7;
        path.arcTo(new RectF(f4, f3, f11, f10), 180.0f, 90.0f);
        if (!z) {
            path.lineTo(f2 - f6, f3);
            path.lineTo(f2, f3 - f5);
            path.lineTo(f2 + f6, f3);
        }
        float f12 = i11;
        float f13 = f12 - f7;
        path.lineTo(f13, f3);
        RectF rectF = new RectF(f13, f3, f12, f10);
        path.arcTo(rectF, 270.0f, 90.0f);
        path.lineTo(f12, f9);
        rectF.set(f13, f9, f12, f8);
        path.arcTo(rectF, 0.0f, 90.0f);
        if (z) {
            path.lineTo(f2 + f6, f8);
            path.lineTo(f2, f5 + f8);
            path.lineTo(f2 - f6, f8);
        }
        path.lineTo(f11, f8);
        rectF.set(f4, f9, f11, f8);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.lineTo(f4, f9);
        setOutlineProvider(new p(this, f4, f3, f12, f8, f7));
        if (this.f45357j != z) {
            invalidate();
            this.f45357j = z;
        }
    }

    public final void d() {
        if (l()) {
            return;
        }
        s sVar = this.m;
        if (sVar != null) {
            sVar.a();
            this.m = null;
        }
        this.f45350c = true;
        com.waze.view.anim.g.d(this).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(com.waze.view.anim.g.a(new be(this, 6)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f45359l) {
            return false;
        }
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        d();
        return false;
    }

    public final void e() {
        this.f45356i.setColor(ContextCompat.getColor(getContext(), R.color.alarming));
    }

    public final void f() {
        if (l()) {
            return;
        }
        this.f45351d = true;
        setAlpha(0.0f);
        setScaleX(0.0f);
        setScaleY(0.0f);
        com.waze.view.anim.g.f(this, 300L, com.waze.sharedui.views.k.f39251b).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(new q(this)).start();
        Long l2 = this.f45354g;
        if (l2 != null) {
            l2.longValue();
            s sVar = new s(this);
            this.m = sVar;
            this.f45354g.longValue();
            postDelayed(sVar, 5000L);
        }
    }

    public final boolean g() {
        return this.f45352e;
    }

    public final void j(String str, Long l2) {
        this.f45349b.setText(str == null ? null : Html.fromHtml(str));
        this.f45354g = l2;
        this.f45353f = true;
        this.f45359l = false;
        k();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f45355h, this.f45356i);
    }
}
