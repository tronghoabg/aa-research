package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[java.util.concurrent.TimeUnit.values().length];
        a = iArr;
        try {
            iArr[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            a[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
