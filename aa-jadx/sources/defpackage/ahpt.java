package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahpt {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER;

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = java.nio.ByteBuffer.wrap(bArr);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return defpackage.ahrc.isValidUtf8(bArr);
    }

    public static java.lang.String toStringUtf8(byte[] bArr) {
        try {
            return new java.lang.String(bArr, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }
}
