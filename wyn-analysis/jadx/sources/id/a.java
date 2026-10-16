package id;

import A7.B0;
import U1.C0850u;
import U1.InterfaceC0843m;
import android.view.Surface;
import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.k;
import kc.n;

/* loaded from: classes5.dex */
public final class a implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36956b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f36955a = i5;
        this.f36956b = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
        switch (this.f36955a) {
            case 0:
                return;
            default:
                n nVar = (n) this.f36956b;
                k kVar = nVar.f39504c;
                if (kVar == null || nVar.f39503b) {
                    return;
                }
                if (kVar == null) {
                    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                kVar.f37008a.onSurfaceChanged(i10, i11);
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f36955a) {
            case 0:
                Surface surface = surfaceHolder.getSurface();
                Object obj = (InterfaceC0843m) this.f36956b;
                ((C0850u) obj).L0(surface);
                B0 b02 = (B0) obj;
                b02.getClass();
                b02.O(1L, ((C0850u) b02).l0(), false);
                break;
            default:
                n nVar = (n) this.f36956b;
                nVar.f39502a = true;
                if ((nVar.f39504c == null || nVar.f39503b) ? false : true) {
                    nVar.c();
                    break;
                }
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f36955a) {
            case 0:
                ((C0850u) ((InterfaceC0843m) this.f36956b)).L0(null);
                return;
            default:
                n nVar = (n) this.f36956b;
                boolean z2 = false;
                nVar.f39502a = false;
                k kVar = nVar.f39504c;
                if (kVar != null && !nVar.f39503b) {
                    z2 = true;
                }
                if (z2) {
                    if (kVar == null) {
                        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                    }
                    kVar.g();
                    return;
                }
                return;
        }
    }

    private final void a(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
    }
}
