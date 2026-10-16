package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ejn {
    public static final Charset a = Charset.forName(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int i = eis.i;
        eiq eiqVar = new eiq(bArr);
        try {
            int i2 = eiqVar.c;
            if (i2 < 0) {
                throw new ejp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i2 > eiqVar.d) {
                throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            eiqVar.d = i2;
            int i3 = eiqVar.a + eiqVar.b;
            eiqVar.a = i3;
            if (i3 <= i2) {
                eiqVar.b = 0;
                return;
            }
            int i4 = i3 - i2;
            eiqVar.b = i4;
            eiqVar.a = i3 - i4;
        } catch (ejp e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void a(Object obj) {
        obj.getClass();
    }

    static int b(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }
}
