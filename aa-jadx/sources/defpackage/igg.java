package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class igg {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    private static volatile android.os.Handler c;

    private igg() {
    }

    public static int a(android.graphics.Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (java.lang.NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new java.lang.IllegalStateException("Cannot obtain size for recycled Bitmap: " + java.lang.String.valueOf(bitmap) + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + java.lang.String.valueOf(bitmap.getConfig()));
    }

    public static int b(android.graphics.Bitmap.Config config) {
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        int i = defpackage.igf.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static int c(java.lang.Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static android.os.Handler d() {
        if (c == null) {
            synchronized (defpackage.igg.class) {
                if (c == null) {
                    c = new android.os.Handler(android.os.Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static java.util.List e(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void f() {
        if (!defpackage.a.Y()) {
            throw new java.lang.IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void g(java.lang.Runnable runnable) {
        d().post(runnable);
    }

    public static boolean h() {
        return !defpackage.a.Y();
    }

    public static boolean i(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean j(int i, int i2) {
        return i(i) && i(i2);
    }

    public static void k(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, int i, int i2) {
        java.lang.String str3;
        int i3 = i * i2;
        int iB = b(bitmap.getConfig()) * i3;
        int width = bitmap.getWidth() * bitmap.getHeight() * b(bitmap.getConfig());
        int iA = a(bitmap) - width;
        int iIdentityHashCode = java.lang.System.identityHashCode(bitmap);
        int width2 = bitmap.getWidth() * bitmap.getHeight();
        if (width2 > i3) {
            str3 = "upscaled";
        } else {
            str3 = width2 < i3 ? "downscaled" : "no scaling";
        }
        java.lang.String strBp = str2 == null ? "" : defpackage.a.bp(str2, " (Strategy: ", ")");
        java.lang.String strBm = iA > 0 ? defpackage.a.bm(iA, " [Pooled: +", " bytes buffer overhead]") : "";
        android.util.Log.d("GlideMemoryTracking", str + " [Device: " + android.os.Build.DEVICE + "]: Decoded bitmap [ID: " + iIdentityHashCode + "] " + str3 + strBp + " from [" + i + "x" + i2 + "] (" + iB + " bytes) to [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + width + " bytes). True cost: " + (width - iB) + " bytes" + strBm);
    }
}
