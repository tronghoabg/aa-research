package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ahfd {
    public static final ajnb a(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((ahfw.a(str.charAt(i2)) << 4) + ahfw.a(str.charAt(i2 + 1)));
        }
        return new ajnb(bArr);
    }

    public static final ajnb b(String str) {
        str.getClass();
        ajnb ajnbVar = new ajnb(ahfp.c(str));
        ajnbVar.d = str;
        return ajnbVar;
    }

    public static final ajnb c(byte... bArr) {
        bArr.getClass();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return new ajnb(bArrCopyOf);
    }

    public static final int d(ajnb ajnbVar, int i) {
        return i == -1234567890 ? ajnbVar.c() : i;
    }

    public static final String e(byte b) {
        char[] cArr = ajoh.a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static final String f(int i) {
        if (i == 0) {
            return CloudRecognizerProtocolStrings.DBG_VALUE;
        }
        char[] cArr = ajoh.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.bn(i2, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        throw new IllegalArgumentException(a.bn(i2, "startIndex: ", " > endIndex: 8"));
    }

    public static final ahfj findKotlinClass(ahfc ahfcVar, agzj agzjVar, ahlc ahlcVar) {
        ahfcVar.getClass();
        agzjVar.getClass();
        ahlcVar.getClass();
        ahfb ahfbVarFindKotlinClassOrContent = ahfcVar.findKotlinClassOrContent(agzjVar, ahlcVar);
        if (ahfbVarFindKotlinClassOrContent != null) {
            return ahfbVarFindKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }

    public static final void g(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean h(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final ahfj findKotlinClass(ahfc ahfcVar, ahnd ahndVar, ahlc ahlcVar) {
        ahfcVar.getClass();
        ahndVar.getClass();
        ahlcVar.getClass();
        ahfb ahfbVarFindKotlinClassOrContent = ahfcVar.findKotlinClassOrContent(ahndVar, ahlcVar);
        if (ahfbVarFindKotlinClassOrContent != null) {
            return ahfbVarFindKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }
}
