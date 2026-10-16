package com.bytedance.sdk.openadsdk.core.dz.yo;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class uef {
    public static final Set<String> uef = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.uef.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: oa, reason: collision with root package name */
    public static Set<String> f25607oa = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.dz.yo.uef.2
        {
            add("application/x-javascript");
        }
    };

    public enum oa {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.dz.yo.uef$uef, reason: collision with other inner class name */
    public enum EnumC0097uef {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public static Point uef(Context context, int i5, int i10, oa oaVar) {
        if (context == null) {
            context = sy.uef();
        }
        Point point = new Point(i5, i10);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iOa = af.oa(context, i5);
        int iOa2 = af.oa(context, i10);
        if (iOa > width || iOa2 > height) {
            Point point2 = new Point();
            if (oa.HTML_RESOURCE == oaVar) {
                point2.x = Math.min(width, iOa);
                point2.y = Math.min(height, iOa2);
            } else {
                float f10 = iOa;
                float f11 = f10 / width;
                float f12 = iOa2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i11 = point2.x;
            if (i11 >= 0 && point2.y >= 0) {
                point2.x = af.yo(context, i11);
                point2.y = af.yo(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
