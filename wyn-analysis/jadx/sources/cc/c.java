package cc;

import S3.f;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import flutter.overlay.window.flutter_overlay_window.OverlayService;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class c extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final int f19821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19822b;

    /* renamed from: c, reason: collision with root package name */
    public final WindowManager.LayoutParams f19823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OverlayService f19824d;

    public c(OverlayService overlayService) {
        WindowManager.LayoutParams layoutParams;
        Point point;
        this.f19824d = overlayService;
        layoutParams = (WindowManager.LayoutParams) overlayService.f35443e.getLayoutParams();
        this.f19823c = layoutParams;
        Display defaultDisplay = overlayService.f35442d.getDefaultDisplay();
        point = overlayService.f35451n;
        defaultDisplay.getSize(point);
        this.f19822b = overlayService.f35449l;
        String str = f.f10950i;
        str.getClass();
        switch (str) {
            case "auto":
                int width = overlayService.f35443e.getWidth();
                int height = overlayService.f35443e.getHeight();
                this.f19821a = Math.max(Math.min(layoutParams.x, (point.x - width) / 2), (width - point.x) / 2);
                this.f19822b = Math.max(Math.min(layoutParams.y, (point.y - height) / 2), (height - point.y) / 2);
                break;
            case "left":
                this.f19821a = 0;
                break;
            case "right":
                this.f19821a = point.x - overlayService.f35443e.getWidth();
                break;
            default:
                this.f19821a = layoutParams.x;
                this.f19822b = layoutParams.y;
                break;
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f19824d.f35447i.post(new zb.b(this, 1));
    }
}
