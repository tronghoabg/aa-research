package w6;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC4369c {

    /* renamed from: c, reason: collision with root package name */
    public final j f47367c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f47369e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f47365a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f47366b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f47368d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f47370f = 3.1415927f;

    public l(Context context, j jVar) {
        this.f47367c = jVar;
        this.f47369e = new GestureDetector(context, this);
    }

    @Override // w6.InterfaceC4369c
    public final void a(float[] fArr, float f10) {
        this.f47370f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f47365a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x5 = (motionEvent2.getX() - this.f47365a.x) / this.f47368d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f47365a;
        float f12 = (y10 - pointF.y) / this.f47368d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d3 = this.f47370f;
        float fCos = (float) Math.cos(d3);
        float fSin = (float) Math.sin(d3);
        PointF pointF2 = this.f47366b;
        pointF2.x -= (fCos * x5) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x5) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f47367c;
        PointF pointF3 = this.f47366b;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.f47351g = f14;
            Matrix.setRotateM(jVar.f47349e, 0, -f14, (float) Math.cos(jVar.f47352h), (float) Math.sin(jVar.f47352h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix.setRotateM(jVar.f47350f, 0, -pointF3.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f47367c.k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f47369e.onTouchEvent(motionEvent);
    }
}
