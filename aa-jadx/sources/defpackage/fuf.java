package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fuf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
        try {
            iArr[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[2];
        try {
            iArr2[0] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[1] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        a = iArr2;
    }
}
