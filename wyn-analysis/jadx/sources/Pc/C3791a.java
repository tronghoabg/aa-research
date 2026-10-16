package pc;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.h;
import java.util.Iterator;
import kc.C3289a;

/* renamed from: pc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3791a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f43454a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43455b;

    /* renamed from: c, reason: collision with root package name */
    public int f43456c;

    /* renamed from: d, reason: collision with root package name */
    public int f43457d;

    /* renamed from: e, reason: collision with root package name */
    public int f43458e;

    /* renamed from: f, reason: collision with root package name */
    public int f43459f;

    /* renamed from: g, reason: collision with root package name */
    public final C3289a f43460g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f43461h;

    /* renamed from: i, reason: collision with root package name */
    public h f43462i;

    public C3791a(Activity activity, float f10, C3289a c3289a) {
        super(activity, null);
        this.f43455b = f10;
        this.f43460g = c3289a;
        this.f43461h = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f43454a.getFinalMatrix());
        float f10 = this.f43455b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f43456c, -this.f43457d);
        return matrix;
    }

    public final void a() {
        h hVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (hVar = this.f43462i) == null) {
            return;
        }
        this.f43462i = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(hVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f43454a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f43456c, -this.f43457d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f43454a.getFinalOpacity() * 255.0f);
        Paint paint = this.f43461h;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f43454a.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3289a c3289a = this.f43460g;
        if (c3289a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i5 = this.f43456c;
            this.f43458e = i5;
            int i10 = this.f43457d;
            this.f43459f = i10;
            matrix.postTranslate(i5, i10);
        } else if (action != 2) {
            matrix.postTranslate(this.f43456c, this.f43457d);
        } else {
            matrix.postTranslate(this.f43458e, this.f43459f);
            this.f43458e = this.f43456c;
            this.f43459f = this.f43457d;
        }
        c3289a.d(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f43462i == null) {
            h hVar = new h(onFocusChangeListener, this);
            this.f43462i = hVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(hVar);
        }
    }
}
