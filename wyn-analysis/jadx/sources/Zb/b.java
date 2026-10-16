package zb;

import android.view.WindowManager;
import cc.c;
import com.vungle.ads.internal.w2;
import flutter.overlay.window.flutter_overlay_window.OverlayService;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48473b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f48472a = i5;
        this.f48473b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48472a) {
            case 0:
                w2.a((w2) this.f48473b);
                break;
            default:
                c cVar = (c) this.f48473b;
                WindowManager.LayoutParams layoutParams = cVar.f19823c;
                int i5 = layoutParams.x;
                int i10 = cVar.f19821a;
                layoutParams.x = (((i5 - i10) * 2) / 3) + i10;
                int i11 = layoutParams.y;
                int i12 = cVar.f19822b;
                layoutParams.y = (((i11 - i12) * 2) / 3) + i12;
                OverlayService overlayService = cVar.f19824d;
                WindowManager windowManager = overlayService.f35442d;
                if (windowManager != null) {
                    windowManager.updateViewLayout(overlayService.f35443e, layoutParams);
                }
                if (Math.abs(layoutParams.x - i10) < 2 && Math.abs(layoutParams.y - i12) < 2) {
                    cVar.cancel();
                    overlayService.f35452o.cancel();
                    break;
                }
                break;
        }
    }
}
