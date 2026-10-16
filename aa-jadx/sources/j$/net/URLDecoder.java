package j$.net;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class URLDecoder {
    static {
        java.util.BitSet bitSet = j$.net.URLEncoder.a;
    }

    public static boolean a(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    public static java.lang.String decode(java.lang.String str, java.nio.charset.Charset charset) {
        j$.util.Objects.a(charset, "Charset");
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length > 500 ? length / 2 : length);
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                if (bArr == null) {
                    try {
                        bArr = new byte[(length - i) / 3];
                    } catch (java.lang.NumberFormatException e) {
                        throw new java.lang.IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - " + e.getMessage());
                    }
                }
                int i2 = 0;
                while (true) {
                    int i3 = i + 2;
                    if (i3 >= length || cCharAt != '%') {
                        break;
                    }
                    int i4 = i + 1;
                    if (!a(str.charAt(i4)) || !a(str.charAt(i3))) {
                        throw new java.lang.IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + str.substring(i, i + 3));
                    }
                    int i5 = i + 3;
                    int i6 = java.lang.Integer.parseInt(str.subSequence(i4, i5).toString(), 16);
                    if (i6 < 0) {
                        throw new java.lang.IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value : " + str.substring(i, i5));
                    }
                    int i7 = i2 + 1;
                    bArr[i2] = (byte) i6;
                    if (i5 < length) {
                        cCharAt = str.charAt(i5);
                    }
                    i2 = i7;
                    i = i5;
                }
                if (i < length && cCharAt == '%') {
                    throw new java.lang.IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
                }
                sb.append(new java.lang.String(bArr, 0, i2, charset));
            } else if (cCharAt != '+') {
                sb.append(cCharAt);
                i++;
            } else {
                sb.append(' ');
                i++;
            }
            z = true;
        }
        return z ? sb.toString() : str;
    }

    public static java.lang.String decode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        if (!str2.isEmpty()) {
            try {
                return decode(str, java.nio.charset.Charset.forName(str2));
            } catch (java.nio.charset.IllegalCharsetNameException | java.nio.charset.UnsupportedCharsetException unused) {
                throw new java.io.UnsupportedEncodingException(str2);
            }
        }
        throw new java.io.UnsupportedEncodingException("URLDecoder: empty string enc parameter");
    }
}
