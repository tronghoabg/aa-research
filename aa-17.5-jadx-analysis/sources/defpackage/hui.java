package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public interface hui {
    public static final Charset a = Charset.forName(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
