package F2;

import A6.h;
import N1.B;
import ic.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3810d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f3811b = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f3812c = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // ic.d
    public final B p(B2.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f3812c;
        CharsetDecoder charsetDecoder2 = this.f3811b;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new B(new c(null, null, bArr));
        }
        Matcher matcher = f3810d.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strO = h.O(strGroup);
                strO.getClass();
                if (strO.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strO.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new B(new c(str, str2, bArr));
    }
}
