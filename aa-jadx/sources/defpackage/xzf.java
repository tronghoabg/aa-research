package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class xzf {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[java.util.concurrent.TimeUnit.values().length];
        a = iArr;
        try {
            iArr[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            a[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
