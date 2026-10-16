package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.car.app.model.Alert;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class ftw {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    public static final ajhv c = ahdw.k(new erb((byte[]) null, (short[]) null));

    public static final File a(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        cacheDir.getClass();
        return cacheDir;
    }

    public static final String b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        return (String) woy.bH(pathSegments);
    }

    public static final String c(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || afyh.v(str)) {
            return null;
        }
        String strS = afyh.s(str, '#', str);
        String strS2 = afyh.s(strS, '?', strS);
        return mimeTypeMap.getMimeTypeFromExtension(afyh.p(afyh.p(strS2, '/', strS2), '.', ""));
    }

    public static final boolean d(Uri uri) {
        return affa.f(uri.getScheme(), "file") && affa.f(b(uri), "android_asset");
    }

    public static final boolean e(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean f(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof fhu);
    }

    public static final int g(a aVar, int i) {
        if (aVar instanceof fti) {
            return ((fti) aVar).a;
        }
        int i2 = ftv.a[i - 1];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        throw new aezs();
    }
}
