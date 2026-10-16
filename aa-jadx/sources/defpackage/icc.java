package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icc {
    public static final android.graphics.Paint b;
    public static final java.util.concurrent.locks.Lock c;
    private static final java.util.Set e;
    private static final android.graphics.Paint d = new android.graphics.Paint(6);
    public static final android.graphics.Paint a = new android.graphics.Paint(7);

    static {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        e = hashSet;
        c = hashSet.contains(android.os.Build.MODEL) ? new java.util.concurrent.locks.ReentrantLock() : new defpackage.icb();
        android.graphics.Paint paint = new android.graphics.Paint(7);
        b = paint;
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
    }

    public static android.graphics.Bitmap.Config a(android.graphics.Bitmap bitmap) {
        return android.graphics.Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? android.graphics.Bitmap.Config.RGBA_F16 : android.graphics.Bitmap.Config.ARGB_8888;
    }

    public static android.graphics.Bitmap.Config b(android.graphics.Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : android.graphics.Bitmap.Config.ARGB_8888;
    }

    public static android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float fMin = java.lang.Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int iRound = java.lang.Math.round(bitmap.getWidth() * fMin);
            int iRound2 = java.lang.Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                android.graphics.Bitmap bitmapA = hxnVar.a((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), b(bitmap));
                e(bitmap, bitmapA);
                if (android.util.Log.isLoggable("TransformationUtils", 2)) {
                    android.util.Log.v("TransformationUtils", defpackage.a.bn(i2, i, "request: ", "x"));
                    android.util.Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    android.util.Log.v("TransformationUtils", "toReuse: " + bitmapA.getWidth() + "x" + bitmapA.getHeight());
                    android.util.Log.v("TransformationUtils", defpackage.a.bF(fMin, "minPct:   "));
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setScale(fMin, fMin);
                d(bitmap, bitmapA, matrix);
                if (bitmapA != null && !bitmapA.equals(bitmap) && ((bitmapA.getWidth() != bitmap.getWidth() || bitmapA.getHeight() != bitmap.getHeight()) && android.util.Log.isLoggable("GlideMemoryTracking", 3))) {
                    defpackage.igg.k("TransformationUtils [fitCenter]", null, bitmapA, bitmap.getWidth(), bitmap.getHeight());
                }
                return bitmapA;
            }
            if (android.util.Log.isLoggable("TransformationUtils", 2)) {
                android.util.Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (android.util.Log.isLoggable("TransformationUtils", 2)) {
            android.util.Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static void d(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Matrix matrix) {
        c.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, d);
            canvas.setBitmap(null);
        } finally {
            c.unlock();
        }
    }

    public static void e(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static boolean f(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }
}
