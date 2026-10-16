package j$.net;

import androidx.compose.foundation.style.StylePropertiesKt;
import j$.util.Objects;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class URLEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final BitSet f49689a = new BitSet(256);

    static {
        for (int i2 = 97; i2 <= 122; i2++) {
            f49689a.set(i2);
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            f49689a.set(i3);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f49689a.set(i4);
        }
        BitSet bitSet = f49689a;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        if (System.getSecurityManager() == null) {
            System.getProperty("file.encoding");
        }
    }

    public static String a(String str, Charset charset) {
        int i2;
        char cCharAt;
        Objects.requireNonNull(charset, "charset");
        StringBuilder sb = new StringBuilder(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i3 = 0;
        boolean z = false;
        while (i3 < str.length()) {
            char cCharAt2 = str.charAt(i3);
            BitSet bitSet = f49689a;
            if (bitSet.get(cCharAt2)) {
                if (cCharAt2 == ' ') {
                    cCharAt2 = '+';
                    z = true;
                }
                sb.append(cCharAt2);
                i3++;
            } else {
                do {
                    charArrayWriter.write(cCharAt2);
                    if (cCharAt2 >= 55296 && cCharAt2 <= 56319 && (i2 = i3 + 1) < str.length() && (cCharAt = str.charAt(i2)) >= 56320 && cCharAt <= 57343) {
                        charArrayWriter.write(cCharAt);
                        i3 = i2;
                    }
                    i3++;
                    if (i3 >= str.length()) {
                        break;
                    }
                    cCharAt2 = str.charAt(i3);
                } while (!bitSet.get(cCharAt2));
                charArrayWriter.flush();
                byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(charset);
                for (int i4 = 0; i4 < bytes.length; i4++) {
                    sb.append('%');
                    char cForDigit = Character.forDigit((bytes[i4] >> 4) & 15, 16);
                    if (Character.isLetter(cForDigit)) {
                        cForDigit = (char) (cForDigit - ' ');
                    }
                    sb.append(cForDigit);
                    char cForDigit2 = Character.forDigit(bytes[i4] & StylePropertiesKt.RightId, 16);
                    if (Character.isLetter(cForDigit2)) {
                        cForDigit2 = (char) (cForDigit2 - ' ');
                    }
                    sb.append(cForDigit2);
                }
                charArrayWriter.reset();
                z = true;
            }
        }
        return z ? sb.toString() : str;
    }

    public static String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            throw new NullPointerException("charsetName");
        }
        try {
            return a(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }
}
