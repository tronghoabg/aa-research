package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f20988a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20989b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20990c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f20991d;

    /* renamed from: e, reason: collision with root package name */
    private long f20992e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f20993f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20994g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f20995h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f20996i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, y4 y4Var, Context context, OnClickListener onClickListener) {
        this.f20988a = ((Long) kVar.a(y4.f23806h0)).longValue();
        this.f20989b = ((Integer) kVar.a(y4.f23815i0)).intValue();
        this.f20990c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(y4.f23848m0)).intValue());
        this.f20991d = ClickRecognitionState.values()[((Integer) kVar.a(y4Var)).intValue()];
        this.f20995h = context;
        this.f20996i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f20996i.onClick(view, motionEvent);
        this.f20994g = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f20994g && this.f20991d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f20994g && this.f20991d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f20991d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20992e;
                float fA = a(this.f20993f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f20994g) {
                    long j8 = this.f20988a;
                    if ((j8 < 0 || jElapsedRealtime < j8) && ((i5 = this.f20989b) < 0 || fA < i5)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f20991d != ClickRecognitionState.ACTION_DOWN) {
            this.f20992e = SystemClock.elapsedRealtime();
            this.f20993f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f20994g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f11 * f11) + (f10 * f10)));
    }

    private float a(float f10) {
        return f10 / this.f20995h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f20990c <= 0) {
            return true;
        }
        Point pointB = AbstractC1654o0.b(this.f20995h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i5 = this.f20990c;
        float f10 = i5;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i5)) && rawY <= ((float) (pointB.y - i5));
    }
}
