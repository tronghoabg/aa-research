package ad;

import U1.C0850u;
import U1.InterfaceC0843m;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* loaded from: classes5.dex */
public final class Y implements io.flutter.plugin.platform.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17554a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17555b;

    public Y(Context context, InterfaceC0843m interfaceC0843m) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f17555b = surfaceView;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 == 28) {
            surfaceView.getHolder().addCallback(new id.a(interfaceC0843m, 0));
            return;
        }
        if (i5 <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        C0850u c0850u = (C0850u) interfaceC0843m;
        c0850u.S0();
        SurfaceHolder holder = surfaceView.getHolder();
        c0850u.S0();
        if (holder == null) {
            c0850u.S0();
            c0850u.C0();
            c0850u.K0(null);
            c0850u.y0(0, 0);
            return;
        }
        c0850u.C0();
        c0850u.f12136Q = true;
        c0850u.f12135P = holder;
        holder.addCallback(c0850u.f12171v);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c0850u.K0(null);
            c0850u.y0(0, 0);
        } else {
            c0850u.K0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            c0850u.y0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private final /* synthetic */ void b(View view) {
    }

    private final /* synthetic */ void c(View view) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    private final /* synthetic */ void h() {
    }

    private final /* synthetic */ void i() {
    }

    @Override // io.flutter.plugin.platform.e
    public final void dispose() {
        switch (this.f17554a) {
            case 0:
                break;
            default:
                ((SurfaceView) this.f17555b).getHolder().getSurface().release();
                break;
        }
    }

    @Override // io.flutter.plugin.platform.e
    public final View getView() {
        switch (this.f17554a) {
            case 0:
                return new View((Context) this.f17555b);
            default:
                return (SurfaceView) this.f17555b;
        }
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onFlutterViewAttached(View view) {
        int i5 = this.f17554a;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onFlutterViewDetached() {
        int i5 = this.f17554a;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onInputConnectionLocked() {
        int i5 = this.f17554a;
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onInputConnectionUnlocked() {
        int i5 = this.f17554a;
    }

    private final void a() {
    }

    public Y(Context context) {
        this.f17555b = context;
    }
}
