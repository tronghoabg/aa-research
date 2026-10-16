package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class ify {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private ify() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + String.valueOf(bitmap) + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()));
    }

    public static int b(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = ifx.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static int c(Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static Handler d() {
        if (c == null) {
            synchronized (ify.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void f() {
        if (!a.Z()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void g(Runnable runnable) {
        d().post(runnable);
    }

    public static boolean h() {
        return !a.Z();
    }

    public static boolean i(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean j(int i, int i2) {
        return i(i) && i(i2);
    }

    public static void k(String str, String str2, Bitmap bitmap, int i, int i2) {
        int i3 = i * i2;
        int iB = b(bitmap.getConfig()) * i3;
        int width = bitmap.getWidth() * bitmap.getHeight() * b(bitmap.getConfig());
        int iA = a(bitmap) - width;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        int width2 = bitmap.getWidth() * bitmap.getHeight();
        String str3 = width2 > i3 ? "upscaled" : width2 < i3 ? "downscaled" : "no scaling";
        String strBq = str2 == null ? "" : a.bq(str2, " (Strategy: ", ")");
        String strBn = iA > 0 ? a.bn(iA, " [Pooled: +", " bytes buffer overhead]") : "";
        Log.d("GlideMemoryTracking", str + " [Device: " + Build.DEVICE + "]: Decoded bitmap [ID: " + iIdentityHashCode + "] " + str3 + strBq + " from [" + i + "x" + i2 + "] (" + iB + " bytes) to [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + width + " bytes). True cost: " + (width - iB) + " bytes" + strBn);
    }
}
