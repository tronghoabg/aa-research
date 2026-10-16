package defpackage;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityService$TakeScreenshotCallback;
import android.graphics.Rect;
import com.carstream.tech.core.gofa.GofaTap;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t4 implements AccessibilityService$TakeScreenshotCallback {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ GofaTap d;

    public t4(GofaTap gofaTap, Rect rect, Rect rect2, boolean z) {
        this.d = gofaTap;
        this.a = rect;
        this.b = rect2;
        this.c = z;
    }

    public final void onFailure(int i) {
        this.d.shotInFlight = false;
    }

    public final void onSuccess(AccessibilityService.ScreenshotResult screenshotResult) {
        try {
            this.d.handleShot(screenshotResult, this.a, this.b, this.c);
        } finally {
            try {
            } finally {
            }
        }
    }
}
