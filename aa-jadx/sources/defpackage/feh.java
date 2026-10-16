package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class feh {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
        a = iArr;
        try {
            iArr[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
