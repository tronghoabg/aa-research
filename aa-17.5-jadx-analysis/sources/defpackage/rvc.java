package defpackage;

import javax.net.ssl.SSLEngineResult;

/* loaded from: classes2.dex */
final /* synthetic */ class rvc {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SSLEngineResult.Status.values().length];
        b = iArr;
        try {
            iArr[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[SSLEngineResult.Status.OK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
        a = iArr2;
        try {
            iArr2[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
