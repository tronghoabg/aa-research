package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyq {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/gmm/systems/paintfe/PaintfeClientPropertiesProviderImpl");
    public final android.util.DisplayMetrics b;
    public final defpackage.aclm c;
    public final defpackage.aclm d;
    public final defpackage.aclm e;
    public final android.content.Context f;
    public volatile java.lang.Boolean g = null;
    public final int h;

    public pyq(android.content.Context context, android.util.DisplayMetrics displayMetrics, defpackage.aclm aclmVar, defpackage.aclm aclmVar2, defpackage.aclm aclmVar3) {
        this.f = context;
        this.b = displayMetrics;
        this.c = aclmVar;
        this.d = aclmVar2;
        this.e = aclmVar3;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getClass();
        activityManager.getMemoryInfo(memoryInfo);
        android.content.res.Resources resources = context.getResources();
        resources.getClass();
        android.util.DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
        displayMetrics2.getClass();
        int iMax = (int) java.lang.Math.max(displayMetrics2.xdpi, displayMetrics2.ydpi);
        long j = memoryInfo.totalMem;
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = 4;
        if ((j < 8589934592L || i < 31 || iMax < 371) && (j < 6442450944L || i < 33 || iMax < 371)) {
            i2 = 3;
            if ((j < 6442450944L || (i >= 33 && iMax >= 371)) && (j <= 2147483648L || i < 31)) {
                i2 = 2;
                if (j > 2147483648L && i >= 31) {
                    i2 = 1;
                }
            }
        }
        this.h = i2;
    }
}
