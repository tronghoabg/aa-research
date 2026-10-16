package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class hxy {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[android.graphics.Bitmap.Config.values().length];
        a = iArr;
        try {
            iArr[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
