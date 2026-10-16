package defpackage;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class id {
    public static id h;
    public static String i;
    public final Context a;
    public gd b;
    public AppWidgetHostView c;
    public WindowManager d;
    public Resources e;
    public int f = -1;
    public final HashMap g = new HashMap();

    public id(Context context) {
        this.a = context.getApplicationContext();
    }

    public static synchronized void b(ContextWrapper contextWrapper) {
        try {
            String strG = xc.g(contextWrapper, "vietmapSource", "widget");
            if (!strG.equals(i)) {
                if (i != null) {
                    w7.e();
                }
                i = strG;
            }
            w7.k = !"frida".equals(strG);
            dc.a(contextWrapper);
            boolean zEquals = "widget".equals(strG);
            int i2 = contextWrapper.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h("vietmapWidgetId"), -1);
            if (!zEquals || i2 < 0) {
                id idVar = h;
                if (idVar != null) {
                    idVar.f();
                }
            } else {
                if (h == null) {
                    h = new id(contextWrapper);
                }
                h.e(i2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        Bitmap bitmap2;
        int width;
        int height;
        try {
            width = bitmap.getWidth();
            try {
                height = bitmap.getHeight();
                try {
                    if (width <= 0 || height <= 0) {
                        return width + "x" + height;
                    }
                    int i2 = 1;
                    while ((((width + i2) - 1) / i2) * (((height + i2) - 1) / i2) > PlaybackStateCompat.ACTION_PREPARE) {
                        try {
                            i2++;
                        } catch (Throwable unused) {
                            bitmap2 = bitmap;
                            try {
                                Bitmap bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
                                if (bitmapCopy != null && bitmapCopy != bitmap2) {
                                    return d(bitmapCopy);
                                }
                            } catch (Throwable unused2) {
                            }
                            return width + "x" + height;
                        }
                    }
                    int[] iArr = new int[width];
                    long j = -3750763034362895579L;
                    for (int i3 = 0; i3 < height; i3 += i2) {
                        bitmap.getPixels(iArr, 0, width, 0, i3, width, 1);
                        for (int i4 = 0; i4 < width; i4 += i2) {
                            j = 1099511628211L * ((iArr[i4] & 4294967295L) ^ j);
                        }
                    }
                    return width + "x" + height + ":" + Long.toHexString(j);
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
                bitmap2 = bitmap;
                height = 0;
            }
        } catch (Throwable unused5) {
            bitmap2 = bitmap;
            width = 0;
            height = 0;
        }
    }

    public final void a(ArrayList arrayList, Bitmap bitmap, String str) {
        int iRound;
        if (bitmap == null) {
            return;
        }
        String strReplace = str.trim().toLowerCase(Locale.US).replace(" ", "");
        if (strReplace.isEmpty()) {
            iRound = 0;
        } else {
            try {
                iRound = strReplace.endsWith("km") ? Math.round(Float.parseFloat(strReplace.substring(0, strReplace.length() - 2)) * 1000.0f) : strReplace.endsWith("m") ? Math.round(Float.parseFloat(strReplace.substring(0, strReplace.length() - 1))) : Math.round(Float.parseFloat(strReplace.replaceAll("[^0-9.]", "")));
            } catch (Exception unused) {
            }
        }
        if (iRound <= 0) {
            return;
        }
        u7 u7Var = new u7();
        String strD = d(bitmap);
        u7Var.d = strD;
        HashMap map = this.g;
        Bitmap bitmap2 = (Bitmap) map.get(strD);
        if (bitmap2 == null || bitmap2.isRecycled()) {
            try {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            } catch (Throwable unused2) {
            }
            if (map.size() >= 8) {
                map.clear();
            }
            map.put(strD, bitmap);
            bitmap2 = bitmap;
        }
        u7Var.c = bitmap2;
        u7Var.b = iRound;
        u7Var.a = null;
        arrayList.add(u7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r4, java.util.HashMap r5, java.util.HashMap r6) {
        /*
            r3 = this;
            int r0 = r4.getId()
            r1 = -1
            if (r0 != r1) goto La
            java.lang.String r0 = "(no-id)"
            goto L26
        La:
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r1.getResourceEntryName(r0)     // Catch: java.lang.Throwable -> L13
            goto L26
        L13:
            android.content.res.Resources r1 = r3.e
            if (r1 == 0) goto L1c
            java.lang.String r0 = r1.getResourceEntryName(r0)     // Catch: java.lang.Throwable -> L1c
            goto L26
        L1c:
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = "id:"
            java.lang.String r0 = defpackage.ad.g(r1, r0)
        L26:
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto L39
            r1 = r4
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r5.put(r0, r1)
            goto L59
        L39:
            boolean r1 = r4 instanceof android.widget.ImageView
            if (r1 == 0) goto L59
            int r1 = r4.getVisibility()
            if (r1 != 0) goto L59
            r1 = r4
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            boolean r2 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L59
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L59
            r6.put(r0, r1)
        L59:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L70
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0 = 0
        L60:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L70
            android.view.View r1 = r4.getChildAt(r0)
            r3.c(r1, r5, r6)
            int r0 = r0 + 1
            goto L60
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id.c(android.view.View, java.util.HashMap, java.util.HashMap):void");
    }

    public final void e(int i2) {
        Context context = this.a;
        if (this.b == null || this.f != i2) {
            f();
            try {
                this.f = i2;
                try {
                    this.e = context.getPackageManager().getResourcesForApplication("vn.vietmap.live");
                } catch (Exception unused) {
                    this.e = null;
                }
                this.d = (WindowManager) context.getSystemService("window");
                gd gdVar = new gd(this, context);
                this.b = gdVar;
                gdVar.startListening();
                this.c = this.b.createView(context, i2, AppWidgetManager.getInstance(context).getAppWidgetInfo(i2));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 2, 2038, 56, -3);
                layoutParams.gravity = 8388659;
                try {
                    this.d.addView(this.c, layoutParams);
                } catch (Throwable th) {
                    String.valueOf(th);
                }
            } catch (Throwable th2) {
                String.valueOf(th2);
            }
        }
    }

    public final void f() {
        WindowManager windowManager;
        try {
            AppWidgetHostView appWidgetHostView = this.c;
            if (appWidgetHostView != null && (windowManager = this.d) != null) {
                windowManager.removeView(appWidgetHostView);
            }
        } catch (Throwable unused) {
        }
        try {
            gd gdVar = this.b;
            if (gdVar != null) {
                gdVar.stopListening();
            }
        } catch (Throwable unused2) {
        }
        this.c = null;
        this.b = null;
        this.f = -1;
        w7.i = false;
    }
}
