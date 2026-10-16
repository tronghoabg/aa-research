package kc;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes5.dex */
public final class n extends SurfaceView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39502a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39503b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f39504c;

    /* renamed from: d, reason: collision with root package name */
    public final c f39505d;

    public n(Context context, boolean z2) {
        super(context, null);
        this.f39502a = false;
        this.f39503b = false;
        id.a aVar = new id.a(this, 1);
        this.f39505d = new c(this, 1);
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(aVar);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        io.flutter.embedding.engine.renderer.k kVar2 = this.f39504c;
        if (kVar2 != null) {
            kVar2.g();
            this.f39504c.f37008a.removeIsDisplayingFlutterUiListener(this.f39505d);
        }
        this.f39504c = kVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f39504c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.k kVar = this.f39504c;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
        }
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f39504c.f37008a.removeIsDisplayingFlutterUiListener(this.f39505d);
        this.f39504c = null;
    }

    public final void c() {
        if (this.f39504c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.k kVar = this.f39504c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f39503b;
        if (!z2) {
            kVar.g();
        }
        kVar.f37010c = surface;
        FlutterJNI flutterJNI = kVar.f37008a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i5 = iArr[0];
        region.op(i5, iArr[1], (getRight() + i5) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f39504c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f39504c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f39503b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        io.flutter.embedding.engine.renderer.k kVar = this.f39504c;
        if (kVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = kVar.f37008a;
        c cVar = this.f39505d;
        flutterJNI.addIsDisplayingFlutterUiListener(cVar);
        if (kVar.f37011d) {
            cVar.e();
        }
        if (this.f39502a) {
            c();
        }
        this.f39503b = false;
    }
}
