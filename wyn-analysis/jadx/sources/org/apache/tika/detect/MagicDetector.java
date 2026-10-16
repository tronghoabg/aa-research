package org.apache.tika.detect;

import N0.a;
import Va.M6;
import com.applovin.shadow.okio.Segment;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: classes5.dex */
public class MagicDetector implements Detector {
    private final boolean isRegex;
    private final boolean isStringIgnoreCase;
    private final int length;
    private final byte[] mask;
    private final int offsetRangeBegin;
    private final int offsetRangeEnd;
    private final byte[] pattern;
    private final int patternLength;
    private final MediaType type;

    public MagicDetector(MediaType mediaType, byte[] bArr) {
        this(mediaType, bArr, 0);
    }

    private static byte[] decodeString(String str, String str2) {
        int i5 = 0;
        if (str.startsWith("0x")) {
            int length = (str.length() - 2) / 2;
            byte[] bArr = new byte[length];
            while (i5 < length) {
                int i10 = i5 * 2;
                bArr[i5] = (byte) Integer.parseInt(str.substring(i10 + 2, i10 + 4), 16);
                i5++;
            }
            return bArr;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i11 = 0;
        while (i11 < str.length()) {
            if (str.charAt(i11) == '\\') {
                int i12 = i11 + 1;
                if (str.charAt(i12) == '\\') {
                    charArrayWriter.write(92);
                } else if (str.charAt(i12) == 'x') {
                    charArrayWriter.write(Integer.parseInt(str.substring(i11 + 2, i11 + 4), 16));
                    i11 += 3;
                } else if (str.charAt(i12) == 'r') {
                    charArrayWriter.write(13);
                } else if (str.charAt(i12) == 'n') {
                    charArrayWriter.write(10);
                } else {
                    int i13 = i12;
                    while (i13 < i11 + 4 && i13 < str.length() && Character.isDigit(str.charAt(i13))) {
                        i13++;
                    }
                    charArrayWriter.write(Short.decode("0" + str.substring(i12, i13)).byteValue());
                    i11 = i13 + (-1);
                }
                i11 = i12;
            } else {
                charArrayWriter.write(str.charAt(i11));
            }
            i11++;
        }
        char[] charArray = charArrayWriter.toCharArray();
        if ("unicodeLE".equals(str2)) {
            byte[] bArr2 = new byte[charArray.length * 2];
            while (i5 < charArray.length) {
                int i14 = i5 * 2;
                char c10 = charArray[i5];
                bArr2[i14] = (byte) (c10 & 255);
                bArr2[i14 + 1] = (byte) (c10 >> '\b');
                i5++;
            }
            return bArr2;
        }
        if (!"unicodeBE".equals(str2)) {
            int length2 = charArray.length;
            byte[] bArr3 = new byte[length2];
            while (i5 < length2) {
                bArr3[i5] = (byte) charArray[i5];
                i5++;
            }
            return bArr3;
        }
        byte[] bArr4 = new byte[charArray.length * 2];
        while (i5 < charArray.length) {
            int i15 = i5 * 2;
            char c11 = charArray[i5];
            bArr4[i15] = (byte) (c11 >> '\b');
            bArr4[i15 + 1] = (byte) (c11 & 255);
            i5++;
        }
        return bArr4;
    }

    private static byte[] decodeValue(String str, String str2) throws NumberFormatException {
        String strSubstring;
        int i5;
        char c10;
        if (str == null || str2 == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            strSubstring = str.substring(2);
            i5 = 16;
        } else {
            strSubstring = str;
            i5 = 8;
        }
        char c11 = 65535;
        switch (str2.hashCode()) {
            case -1211485747:
                c10 = 0;
                if (str2.equals("host16")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1211485689:
                c10 = 0;
                if (str2.equals("host32")) {
                    c11 = 1;
                    break;
                }
                break;
            case -944685088:
                c10 = 0;
                if (str2.equals("unicodeBE")) {
                    c11 = 2;
                    break;
                }
                break;
            case -944684778:
                c10 = 0;
                if (str2.equals("unicodeLE")) {
                    c11 = 3;
                    break;
                }
                break;
            case -891985903:
                c10 = 0;
                if (str2.equals("string")) {
                    c11 = 4;
                    break;
                }
                break;
            case -548372781:
                c10 = 0;
                if (str2.equals("stringignorecase")) {
                    c11 = 5;
                    break;
                }
                break;
            case 3039496:
                c10 = 0;
                if (str2.equals("byte")) {
                    c11 = 6;
                    break;
                }
                break;
            case 93733669:
                c10 = 0;
                if (str2.equals("big16")) {
                    c11 = 7;
                    break;
                }
                break;
            case 93733727:
                c10 = 0;
                if (str2.equals("big32")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 108392519:
                c10 = 0;
                if (str2.equals("regex")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1374987163:
                c10 = 0;
                if (str2.equals("little16")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1374987221:
                c10 = 0;
                if (str2.equals("little32")) {
                    c11 = 11;
                    break;
                }
                break;
            default:
                c10 = 0;
                break;
        }
        switch (c11) {
            case 0:
            case '\n':
                int i10 = Integer.parseInt(strSubstring, i5);
                byte[] bArr = new byte[2];
                bArr[c10] = (byte) (i10 & 255);
                bArr[1] = (byte) (i10 >> 8);
                return bArr;
            case 1:
            case 11:
                long j8 = Long.parseLong(strSubstring, i5);
                byte[] bArr2 = new byte[4];
                bArr2[c10] = (byte) (j8 & 255);
                bArr2[1] = (byte) ((j8 & 65280) >> 8);
                bArr2[2] = (byte) ((j8 & 16711680) >> 16);
                bArr2[3] = (byte) ((j8 & (-16777216)) >> 24);
                return bArr2;
            case 2:
            case 3:
            case 4:
            case '\t':
                return decodeString(str, str2);
            case 5:
                return decodeString(str.toLowerCase(Locale.ROOT), str2);
            case 6:
                return strSubstring.getBytes(StandardCharsets.UTF_8);
            case 7:
                int i11 = Integer.parseInt(strSubstring, i5);
                byte[] bArr3 = new byte[2];
                bArr3[c10] = (byte) (i11 >> 8);
                bArr3[1] = (byte) (i11 & 255);
                return bArr3;
            case '\b':
                long j10 = Long.parseLong(strSubstring, i5);
                byte[] bArr4 = new byte[4];
                bArr4[c10] = (byte) ((j10 & (-16777216)) >> 24);
                bArr4[1] = (byte) ((j10 & 16711680) >> 16);
                bArr4[2] = (byte) ((j10 & 65280) >> 8);
                bArr4[3] = (byte) (j10 & 255);
                return bArr4;
            default:
                return null;
        }
    }

    public static MagicDetector parse(MediaType mediaType, String str, String str2, String str3, String str4) throws NumberFormatException {
        int i5;
        int i10;
        int i11 = 0;
        if (str2 == null) {
            i5 = i11;
            i10 = i5;
        } else {
            int iIndexOf = str2.indexOf(58);
            if (iIndexOf == -1) {
                i11 = Integer.parseInt(str2);
                i5 = i11;
                i10 = i5;
            } else {
                int i12 = Integer.parseInt(str2.substring(0, iIndexOf));
                i10 = Integer.parseInt(str2.substring(iIndexOf + 1));
                i5 = i12;
            }
        }
        return new MagicDetector(mediaType, decodeValue(str3, str), str4 != null ? decodeValue(str4, str) : null, str.equals("regex"), str.equals("stringignorecase"), i5, i10);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.offsetRangeEnd + this.length);
        int i5 = 0;
        while (true) {
            try {
                int i10 = this.offsetRangeBegin;
                if (i5 >= i10) {
                    int i11 = (this.offsetRangeEnd - i10) + this.length;
                    byte[] bArr = new byte[i11];
                    int i12 = inputStream.read(bArr);
                    if (i12 > 0) {
                        i5 += i12;
                    }
                    while (i12 != -1 && i5 < this.offsetRangeEnd + this.length) {
                        int i13 = i5 - this.offsetRangeBegin;
                        i12 = inputStream.read(bArr, i13, i11 - i13);
                        if (i12 > 0) {
                            i5 += i12;
                        }
                    }
                    if (this.isRegex) {
                        Matcher matcher = Pattern.compile(new String(this.pattern, StandardCharsets.UTF_8), this.isStringIgnoreCase ? 2 : 0).matcher(StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(bArr)));
                        for (int i14 = 0; i14 <= this.offsetRangeEnd - this.offsetRangeBegin; i14++) {
                            matcher.region(i14, this.length + i14);
                            if (matcher.lookingAt()) {
                                return this.type;
                            }
                        }
                    } else {
                        if (i5 < this.offsetRangeBegin + this.length) {
                            return MediaType.OCTET_STREAM;
                        }
                        for (int i15 = 0; i15 <= this.offsetRangeEnd - this.offsetRangeBegin; i15++) {
                            boolean z2 = true;
                            for (int i16 = 0; z2 && i16 < this.length; i16++) {
                                int lowerCase = bArr[i15 + i16] & this.mask[i16];
                                if (this.isStringIgnoreCase) {
                                    lowerCase = Character.toLowerCase(lowerCase);
                                }
                                z2 = lowerCase == this.pattern[i16];
                            }
                            if (z2) {
                                return this.type;
                            }
                        }
                    }
                    return MediaType.OCTET_STREAM;
                }
                long jSkip = inputStream.skip(i10 - i5);
                if (jSkip > 0) {
                    i5 = (int) (i5 + jSkip);
                } else {
                    if (inputStream.read() == -1) {
                        return MediaType.OCTET_STREAM;
                    }
                    i5++;
                }
            } finally {
                inputStream.reset();
            }
        }
    }

    public int getLength() {
        return this.patternLength;
    }

    public String toString() {
        MediaType mediaType = this.type;
        byte[] bArr = this.pattern;
        int length = bArr.length;
        String string = Arrays.toString(bArr);
        String string2 = Arrays.toString(this.mask);
        StringBuilder sb2 = new StringBuilder("Magic Detection for ");
        sb2.append(mediaType);
        sb2.append(" looking for ");
        sb2.append(length);
        sb2.append(" bytes = ");
        return M6.t(sb2, string, " mask = ", string2);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, int i5) {
        this(mediaType, bArr, null, i5, i5);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, int i5, int i10) {
        this(mediaType, bArr, bArr2, false, i5, i10);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z2, int i5, int i10) {
        this(mediaType, bArr, bArr2, z2, false, i5, i10);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z2, boolean z10, int i5, int i10) {
        if (mediaType == null) {
            throw new IllegalArgumentException("Matching media type is null");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Magic match pattern is null");
        }
        if (i5 >= 0 && i10 >= i5) {
            this.type = mediaType;
            this.isRegex = z2;
            this.isStringIgnoreCase = z10;
            int iMax = Math.max(bArr.length, bArr2 != null ? bArr2.length : 0);
            this.patternLength = iMax;
            if (z2) {
                this.length = Segment.SIZE;
            } else {
                this.length = iMax;
            }
            this.mask = new byte[iMax];
            this.pattern = new byte[iMax];
            for (int i11 = 0; i11 < this.patternLength; i11++) {
                if (bArr2 != null && i11 < bArr2.length) {
                    this.mask[i11] = bArr2[i11];
                } else {
                    this.mask[i11] = -1;
                }
                if (i11 < bArr.length) {
                    this.pattern[i11] = (byte) (bArr[i11] & this.mask[i11]);
                } else {
                    this.pattern[i11] = 0;
                }
            }
            this.offsetRangeBegin = i5;
            this.offsetRangeEnd = i10;
            return;
        }
        throw new IllegalArgumentException(a.e("Invalid offset range: [", i5, ",", i10, "]"));
    }
}
