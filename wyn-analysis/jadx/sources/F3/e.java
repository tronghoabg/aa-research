package F3;

import D3.k;
import D3.l;
import D3.o;
import R8.v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import k1.h0;
import k1.i0;
import k1.j0;
import k1.k0;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class e {
    public static D3.c a(l lVar, FoldingFeature foldingFeature) {
        D3.b bVar;
        D3.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = D3.b.f2293g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = D3.b.f2294h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = D3.b.f2291e;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = D3.b.f2292f;
        }
        Rect bounds = foldingFeature.getBounds();
        AbstractC3340k.d(bounds, "oemFeature.bounds");
        int i5 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        if (i5 > i11) {
            throw new IllegalArgumentException(v.e(i5, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(v.e(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect rectA = lVar.f2317a.a();
        int i13 = i12 - i10;
        if (i13 == 0 && i11 - i5 == 0) {
            return null;
        }
        int i14 = i11 - i5;
        if (i14 != rectA.width() && i13 != rectA.height()) {
            return null;
        }
        if (i14 < rectA.width() && i13 < rectA.height()) {
            return null;
        }
        if (i14 == rectA.width() && i13 == rectA.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        AbstractC3340k.d(bounds2, "oemFeature.bounds");
        return new D3.c(new A3.b(bounds2), bVar, bVar2);
    }

    public static k b(l lVar, WindowLayoutInfo info) {
        D3.c cVarA;
        AbstractC3340k.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        AbstractC3340k.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                AbstractC3340k.d(feature, "feature");
                cVarA = a(lVar, feature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new k(arrayList);
    }

    public static k c(Context context, WindowLayoutInfo info) throws Exception {
        l lVar;
        AbstractC3340k.e(info, "info");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            if (i5 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i10 = o.f2321b;
            return b(o.a((Activity) context), info);
        }
        int i11 = o.f2321b;
        if (i5 < 30) {
            Context baseContext = context;
            while (baseContext instanceof ContextWrapper) {
                boolean z2 = baseContext instanceof Activity;
                if (!z2 && !(baseContext instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                    if (contextWrapper.getBaseContext() != null) {
                        baseContext = contextWrapper.getBaseContext();
                        AbstractC3340k.d(baseContext, "iterator.baseContext");
                    }
                }
                if (z2) {
                    lVar = o.a((Activity) context);
                } else {
                    if (!(baseContext instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    AbstractC3340k.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i12 = Build.VERSION.SDK_INT;
                    v0 v0VarB = (i12 >= 34 ? new k0() : i12 >= 30 ? new j0() : i12 >= 29 ? new i0() : new h0()).b();
                    AbstractC3340k.d(v0VarB, "Builder().build()");
                    lVar = new l(new A3.b(rect), v0VarB);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        v0 v0VarG = v0.g(null, windowManager.getCurrentWindowMetrics().getWindowInsets());
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        AbstractC3340k.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(new A3.b(bounds), v0VarG);
        return b(lVar, info);
    }
}
