package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ajka {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[java.net.Proxy.Type.values().length];
        try {
            iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[java.net.Proxy.Type.HTTP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
