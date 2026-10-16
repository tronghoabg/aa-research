package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class aise {
    public static final Charset a;

    static {
        Charset charsetForName = Charset.forName(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        charsetForName.getClass();
        a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
