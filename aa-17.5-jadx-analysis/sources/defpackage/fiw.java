package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class fiw implements fiv {
    private final /* synthetic */ int d;
    public static final fiw c = new fiw(2);
    public static final fiw b = new fiw(1);
    public static final fiw a = new fiw(0);

    private fiw(int i) {
        this.d = i;
    }

    @Override // defpackage.fiv
    public final fii a(Context context, fit fitVar) {
        int i = this.d;
        if (i == 0) {
            WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            bounds.getClass();
            return new fii(bounds, windowManager.getCurrentWindowMetrics().getDensity());
        }
        if (i == 1) {
            WindowManager windowManager2 = (WindowManager) context.getSystemService(WindowManager.class);
            float f = context.getResources().getDisplayMetrics().density;
            Rect bounds2 = windowManager2.getCurrentWindowMetrics().getBounds();
            bounds2.getClass();
            return new fii(bounds2, f);
        }
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                baseContext.getClass();
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            activity.getClass();
            int i2 = fip.a;
            return new fii(new fih((Build.VERSION.SDK_INT >= 30 ? fis.b : Build.VERSION.SDK_INT >= 29 ? fir.b : fiq.b).a(activity)), fitVar.a(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new fii(new Rect(0, 0, point.x, point.y), fitVar.a(context));
    }
}
