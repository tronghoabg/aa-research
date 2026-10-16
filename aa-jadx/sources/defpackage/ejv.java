package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ejv {
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
    public static final byte[] b;

    static {
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        int i = defpackage.eja.i;
        defpackage.eiy eiyVar = new defpackage.eiy(bArr);
        try {
            int i2 = eiyVar.c;
            if (i2 < 0) {
                throw new defpackage.ejx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i2 > eiyVar.d) {
                throw new defpackage.ejx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            eiyVar.d = i2;
            int i3 = eiyVar.a + eiyVar.b;
            eiyVar.a = i3;
            if (i3 <= i2) {
                eiyVar.b = 0;
                return;
            }
            int i4 = i3 - i2;
            eiyVar.b = i4;
            eiyVar.a = i3 - i4;
        } catch (defpackage.ejx e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    static void a(java.lang.Object obj) {
        obj.getClass();
    }

    static int b(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }
}
