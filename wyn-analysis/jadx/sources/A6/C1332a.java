package a6;

import A6.h;
import W5.e;
import ic.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.AbstractC3198g;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1332a extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17378d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f17379b = AbstractC3198g.f39301c.newDecoder();

    /* renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f17380c = AbstractC3198g.f39300b.newDecoder();

    @Override // ic.d
    public final W5.c r(e eVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f17380c;
        CharsetDecoder charsetDecoder2 = this.f17379b;
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
            return new W5.c(new C1334c(null, null, bArr));
        }
        Matcher matcher = f17378d.matcher(string);
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
        return new W5.c(new C1334c(str, str2, bArr));
    }
}
