package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class jce {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[javax.net.ssl.SSLEngineResult.Status.values().length];
        b = iArr;
        try {
            iArr[javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            b[javax.net.ssl.SSLEngineResult.Status.OK.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            b[javax.net.ssl.SSLEngineResult.Status.CLOSED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[javax.net.ssl.SSLEngineResult.HandshakeStatus.values().length];
        a = iArr2;
        try {
            iArr2[javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            a[javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            a[javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            a[javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
    }
}
