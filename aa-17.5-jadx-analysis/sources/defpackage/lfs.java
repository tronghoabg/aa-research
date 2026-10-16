package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class lfs {
    public static final yph a = yph.c("GH.AppIconCache");
    public static final Object b = new Object();
    public static lfs c;
    private final lft d;
    private final LruCache e = new LruCache(24);

    public lfs(lft lftVar) {
        this.d = lftVar;
    }

    public static lfs e(Context context) {
        lfs lfsVar;
        synchronized (b) {
            lfsVar = c;
            if (lfsVar == null) {
                lfsVar = new lfs(new lft(context));
                c = lfsVar;
            }
        }
        return lfsVar;
    }

    public final synchronized Bitmap a(Context context, int i) throws Throwable {
        try {
            try {
                return d(context, i, -1, null, PorterDuff.Mode.SRC_IN);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized Bitmap b(Context context, ComponentName componentName) {
        return c(context, componentName, -1);
    }

    public final synchronized Bitmap c(Context context, ComponentName componentName, int i) {
        return f(context, componentName, i, PorterDuff.Mode.SRC_IN);
    }

    public final synchronized Bitmap d(Context context, int i, int i2, ColorStateList colorStateList, PorterDuff.Mode mode) {
        lfs lfsVarE = e(context);
        LruCache lruCache = lfsVarE.e;
        String strBp = a.bp(i, "r_");
        Bitmap bitmap = (Bitmap) lruCache.get(strBp);
        if (bitmap != null) {
            return bitmap;
        }
        lft lftVar = lfsVarE.d;
        Drawable drawable = context.getDrawable(i);
        drawable.getClass();
        Bitmap bitmapA = lftVar.a(drawable, false, i2, colorStateList, mode, null);
        ((ype) lft.a.l().ai(3890)).R("createAppIcon: Resource id: %d Size: %dx%d.", Integer.valueOf(i), Integer.valueOf(bitmapA.getWidth()), Integer.valueOf(bitmapA.getHeight()));
        lruCache.put(strBp, bitmapA);
        return bitmapA;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002f, B:9:0x0041, B:11:0x0049, B:19:0x0074, B:21:0x0085, B:46:0x010b, B:50:0x0140, B:49:0x0128, B:23:0x0091, B:28:0x00ad, B:31:0x00b6, B:33:0x00bf, B:35:0x00d6, B:37:0x00db, B:38:0x00e7, B:41:0x00f0, B:43:0x00fd, B:12:0x0051, B:14:0x005b, B:16:0x0065, B:17:0x006a), top: B:57:0x0007, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap f(android.content.Context r16, android.content.ComponentName r17, int r18, android.graphics.PorterDuff.Mode r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfs.f(android.content.Context, android.content.ComponentName, int, android.graphics.PorterDuff$Mode):android.graphics.Bitmap");
    }
}
