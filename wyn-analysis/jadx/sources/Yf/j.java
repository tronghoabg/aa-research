package Yf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f16861a;

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f16862b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f16863c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16864d;

    /* renamed from: e, reason: collision with root package name */
    public char f16865e;

    public j(InputStream inputStream, Charset charset) {
        byte[] bArr;
        AbstractC3340k.e(charset, "charset");
        this.f16861a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        AbstractC3340k.d(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f16862b = charsetDecoderOnUnmappableCharacter;
        C1299e c1299e = C1299e.f16854c;
        synchronized (c1299e) {
            ff.l lVar = (ff.l) c1299e.f16855a;
            bArr = null;
            byte[] bArr2 = (byte[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (bArr2 != null) {
                c1299e.f16856b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        AbstractC3340k.d(byteBufferWrap, "wrap(...)");
        this.f16863c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.j.a(char[], int, int):int");
    }
}
