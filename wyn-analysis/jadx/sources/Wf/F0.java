package Wf;

import a.AbstractC1304a;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class F0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final F0 f15543a = new F0();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15544b = new h0("kotlin.uuid.Uuid", Uf.e.f12814x);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String strConcat;
        String uuidString = decoder.w();
        AbstractC3340k.e(uuidString, "uuidString");
        int length = uuidString.length();
        Df.a aVar = Df.a.f2659c;
        int i5 = 0;
        if (length == 32) {
            long j8 = 0;
            while (i5 < 16) {
                long j10 = j8 << 4;
                char cCharAt = uuidString.charAt(i5);
                if ((cCharAt >>> '\b') == 0) {
                    long j11 = Bf.c.f1680b[cCharAt];
                    if (j11 >= 0) {
                        j8 = j10 | j11;
                        i5++;
                    }
                }
                AbstractC1304a.P(i5, uuidString, "a hexadecimal digit");
                throw null;
            }
            long j12 = 0;
            for (int i10 = 16; i10 < 32; i10++) {
                long j13 = j12 << 4;
                char cCharAt2 = uuidString.charAt(i10);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j14 = Bf.c.f1680b[cCharAt2];
                    if (j14 >= 0) {
                        j12 = j13 | j14;
                    }
                }
                AbstractC1304a.P(i10, uuidString, "a hexadecimal digit");
                throw null;
            }
            if (j8 != 0 || j12 != 0) {
                return new Df.a(j8, j12);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    AbstractC3340k.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb2.append(strConcat);
                sb2.append("\" of length ");
                sb2.append(uuidString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long j15 = 0;
            while (i5 < 8) {
                long j16 = j15 << 4;
                char cCharAt3 = uuidString.charAt(i5);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j17 = Bf.c.f1680b[cCharAt3];
                    if (j17 >= 0) {
                        j15 = j16 | j17;
                        i5++;
                    }
                }
                AbstractC1304a.P(i5, uuidString, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(8) != '-') {
                AbstractC1304a.P(8, uuidString, "'-' (hyphen)");
                throw null;
            }
            long j18 = 0;
            for (int i11 = 9; i11 < 13; i11++) {
                long j19 = j18 << 4;
                char cCharAt4 = uuidString.charAt(i11);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j20 = Bf.c.f1680b[cCharAt4];
                    if (j20 >= 0) {
                        j18 = j19 | j20;
                    }
                }
                AbstractC1304a.P(i11, uuidString, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(13) != '-') {
                AbstractC1304a.P(13, uuidString, "'-' (hyphen)");
                throw null;
            }
            long j21 = 0;
            for (int i12 = 14; i12 < 18; i12++) {
                long j22 = j21 << 4;
                char cCharAt5 = uuidString.charAt(i12);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j23 = Bf.c.f1680b[cCharAt5];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                AbstractC1304a.P(i12, uuidString, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(18) != '-') {
                AbstractC1304a.P(18, uuidString, "'-' (hyphen)");
                throw null;
            }
            long j24 = 0;
            for (int i13 = 19; i13 < 23; i13++) {
                long j25 = j24 << 4;
                char cCharAt6 = uuidString.charAt(i13);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j26 = Bf.c.f1680b[cCharAt6];
                    if (j26 >= 0) {
                        j24 = j25 | j26;
                    }
                }
                AbstractC1304a.P(i13, uuidString, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(23) != '-') {
                AbstractC1304a.P(23, uuidString, "'-' (hyphen)");
                throw null;
            }
            long j27 = 0;
            for (int i14 = 24; i14 < 36; i14++) {
                long j28 = j27 << 4;
                char cCharAt7 = uuidString.charAt(i14);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j29 = Bf.c.f1680b[cCharAt7];
                    if (j29 >= 0) {
                        j27 = j28 | j29;
                    }
                }
                AbstractC1304a.P(i14, uuidString, "a hexadecimal digit");
                throw null;
            }
            long j30 = (j15 << 32) | (j18 << 16) | j21;
            long j31 = (j24 << 48) | j27;
            if (j30 != 0 || j31 != 0) {
                return new Df.a(j30, j31);
            }
        }
        return aVar;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15544b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Df.a value = (Df.a) obj;
        AbstractC3340k.e(value, "value");
        encoder.F(value.toString());
    }
}
