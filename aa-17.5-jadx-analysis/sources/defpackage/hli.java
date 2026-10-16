package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.car.libraries.apphost.view.MicrophoneRecordingView;

/* loaded from: classes2.dex */
public abstract class hli extends FrameLayout {
    public hlo a;
    public ept b;
    public geu c;
    public WindowInsets d;
    public boolean e;
    public final eqn f;
    public final ajju g;
    private epz h;
    private final ViewTreeObserver.OnWindowFocusChangeListener i;
    private final ViewTreeObserver.OnPreDrawListener j;

    protected hli(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new jzh(this, 1);
        this.j = new hlh();
        this.f = new hlg(this, 0);
        this.g = new ajju(context);
    }

    private final void a() {
        geu geuVar = this.c;
        if (geuVar != null) {
            geuVar.B().a(4);
        }
    }

    public static void l(hlo hloVar) {
        gks.c("CarApp.H.Tem", "Stopping presenter: %s", hloVar);
        if (hloVar.getLifecycle().a().a(eps.d)) {
            hloVar.n();
        }
    }

    public static final boolean m(geu geuVar) {
        gsf gsfVar = (gsf) geuVar.l(gsf.class);
        return gsfVar != null && gsfVar.c();
    }

    protected abstract int g();

    protected abstract View h();

    protected abstract ViewGroup i();

    public abstract MicrophoneRecordingView j();

    public void k(WindowInsets windowInsets) {
        this.d = windowInsets;
        hlo hloVar = this.a;
        if (hloVar != null) {
            hloVar.z(windowInsets, g());
        }
    }

    protected abstract uk n();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ept eptVar = this.b;
        if (eptVar != null) {
            qy qyVar = new qy(this, 4);
            this.h = qyVar;
            eptVar.c(qyVar);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnWindowFocusChangeListener(this.i);
        viewTreeObserver.addOnPreDrawListener(this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ept eptVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.removeOnWindowFocusChangeListener(this.i);
        viewTreeObserver.removeOnPreDrawListener(this.j);
        hlo hloVar = this.a;
        if (hloVar != null) {
            l(hloVar);
        }
        epz epzVar = this.h;
        if (epzVar != null && (eptVar = this.b) != null) {
            eptVar.d(epzVar);
            this.h = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        a();
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        a();
        hlo hloVar = this.a;
        if (hloVar == null || !hloVar.i(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    protected hli(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected hli(Context context) {
        this(context, null);
    }
}
