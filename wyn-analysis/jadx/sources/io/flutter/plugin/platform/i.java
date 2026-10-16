package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import kc.C3289a;

/* loaded from: classes5.dex */
public final class i extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f37098a;

    /* renamed from: b, reason: collision with root package name */
    public int f37099b;

    /* renamed from: c, reason: collision with root package name */
    public int f37100c;

    /* renamed from: d, reason: collision with root package name */
    public int f37101d;

    /* renamed from: e, reason: collision with root package name */
    public C3289a f37102e;

    /* renamed from: f, reason: collision with root package name */
    public g f37103f;

    /* renamed from: g, reason: collision with root package name */
    public h f37104g;

    public i(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar = this.f37103f;
        if (gVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = gVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f37103f.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f37104g;
    }

    public int getRenderTargetHeight() {
        g gVar = this.f37103f;
        if (gVar != null) {
            return gVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        g gVar = this.f37103f;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37102e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i5 = this.f37100c;
            this.f37098a = i5;
            int i10 = this.f37101d;
            this.f37099b = i10;
            matrix.postTranslate(i5, i10);
        } else if (action != 2) {
            matrix.postTranslate(this.f37100c, this.f37101d);
        } else {
            matrix.postTranslate(this.f37098a, this.f37099b);
            this.f37098a = this.f37100c;
            this.f37099b = this.f37101d;
        }
        this.f37102e.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f37100c = layoutParams.leftMargin;
        this.f37101d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        h hVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (hVar = this.f37104g) != null) {
            this.f37104g = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(hVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f37104g == null) {
            h hVar2 = new h(this, onFocusChangeListener);
            this.f37104g = hVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(hVar2);
        }
    }

    public void setTouchProcessor(C3289a c3289a) {
        this.f37102e = c3289a;
    }
}
