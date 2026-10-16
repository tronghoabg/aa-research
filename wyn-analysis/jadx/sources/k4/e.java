package k4;

import A.AbstractC0213f;
import E5.Q;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import ff.o;
import i4.C2844a;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import p7.AbstractC3772b;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f39264a;

    /* renamed from: b, reason: collision with root package name */
    public static final Headers f39265b;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap.Config unused = Bitmap.Config.RGBA_F16;
        } else {
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        }
        f39264a = i5 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f39265b = new Headers.Builder().d();
    }

    public static final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || Bf.k.y0(str)) {
            return null;
        }
        String strS0 = Bf.k.S0(Bf.k.S0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(Bf.k.N0('.', Bf.k.N0('/', strS0, strS0), ""));
    }

    public static final boolean c(Uri uri) {
        return AbstractC3340k.a(uri.getScheme(), "file") && AbstractC3340k.a((String) o.s0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(AbstractC3772b abstractC3772b, int i5) {
        if (abstractC3772b instanceof C2844a) {
            return ((C2844a) abstractC3772b).f36782e;
        }
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return Integer.MIN_VALUE;
        }
        if (iF == 1) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        throw new Q((byte) 0, 9);
    }
}
