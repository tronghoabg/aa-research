package com.bumptech.glide.g;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.foundation.style.StylePropertiesKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2918a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f2919b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f2920c = new char[64];

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f2921d;

    private r() {
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

    public static int b(int i2, int i3, Bitmap.Config config) {
        return i2 * i3 * c(config);
    }

    public static int c(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = q.f2917a[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                return i2 != 4 ? 4 : 8;
            }
        }
        return i3;
    }

    public static int d(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int e(Object obj, int i2) {
        return d(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static String f(byte[] bArr) {
        String str;
        char[] cArr = f2920c;
        synchronized (cArr) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b2 = bArr[i2];
                int i3 = i2 + i2;
                char[] cArr2 = f2919b;
                cArr[i3] = cArr2[(b2 & 255) >>> 4];
                cArr[i3 + 1] = cArr2[b2 & StylePropertiesKt.RightId];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static List g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void h() {
        if (!m()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void i(Runnable runnable) {
        q().post(runnable);
    }

    public static void j(Runnable runnable) {
        q().removeCallbacks(runnable);
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean l() {
        return !m();
    }

    public static boolean m() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean n(int i2) {
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    public static boolean o(int i2, int i3) {
        return n(i2) && n(i3);
    }

    public static void p(String str, String str2, Bitmap bitmap, int i2, int i3) {
        String str3;
        int iB = b(i2, i3, bitmap.getConfig());
        int iB2 = b(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        int i4 = iB2 - iB;
        int iA = a(bitmap) - iB2;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        int width = bitmap.getWidth() * bitmap.getHeight();
        int i5 = i2 * i3;
        String str4 = width > i5 ? "upscaled" : width < i5 ? "downscaled" : "no scaling";
        String str5 = "";
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = " (Strategy: " + str2 + ")";
        }
        if (iA > 0) {
            str5 = " [Pooled: +" + iA + " bytes buffer overhead]";
        }
        Log.d("GlideMemoryTracking", str + " [Device: " + Build.DEVICE + "]: Decoded bitmap [ID: " + iIdentityHashCode + "] " + str4 + str3 + " from [" + i2 + "x" + i3 + "] (" + iB + " bytes) to [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + iB2 + " bytes). True cost: " + i4 + " bytes" + str5);
    }

    private static Handler q() {
        if (f2921d == null) {
            synchronized (r.class) {
                if (f2921d == null) {
                    f2921d = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f2921d;
    }
}
