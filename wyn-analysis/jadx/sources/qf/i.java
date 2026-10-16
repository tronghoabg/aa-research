package qf;

import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class i extends Fe.b {
    public static String W(File file) throws IOException {
        Charset charset = Bf.a.f1670a;
        AbstractC3340k.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strC = Fe.c.C(inputStreamReader);
            inputStreamReader.close();
            return strC;
        } finally {
        }
    }

    public static File X(File file, String str) {
        int length;
        int iV0;
        File file2 = new File(str);
        String path = file2.getPath();
        AbstractC3340k.d(path, "getPath(...)");
        char c10 = File.separatorChar;
        int iV02 = Bf.k.v0(path, c10, 0, 4);
        if (iV02 != 0) {
            length = (iV02 <= 0 || path.charAt(iV02 + (-1)) != ':') ? (iV02 == -1 && Bf.k.q0(path, ':')) ? path.length() : 0 : iV02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c10 || (iV0 = Bf.k.v0(path, c10, 2, 4)) < 0) {
            length = 1;
        } else {
            int iV03 = Bf.k.v0(path, c10, iV0 + 1, 4);
            length = iV03 >= 0 ? iV03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        AbstractC3340k.d(string, "toString(...)");
        if ((string.length() == 0) || Bf.k.q0(string, c10)) {
            return new File(string + file2);
        }
        return new File(string + c10 + file2);
    }

    public static void Y(File file, String str, Charset charset) {
        AbstractC3340k.e(file, "<this>");
        AbstractC3340k.e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Z(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void Z(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        AbstractC3340k.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            AbstractC3340k.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(Segment.SIZE);
        AbstractC3340k.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Segment.SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        AbstractC3340k.d(byteBufferAllocate, "allocate(...)");
        int i5 = 0;
        int i10 = 0;
        while (i5 < str.length()) {
            int iMin = Math.min(8192 - i10, str.length() - i5);
            int i11 = i5 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC3340k.d(cArrArray, "array(...)");
            str.getChars(i5, i11, cArrArray, i10);
            charBufferAllocate.limit(iMin + i10);
            i10 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i11 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i10 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i5 = i11;
        }
    }
}
