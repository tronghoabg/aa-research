package com.applovin.shadow.okio;

import R8.v;
import com.vungle.ads.internal.protos.Sdk;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import pd.f;
import tf.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0016\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u0019\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a;\u0010\u001d\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"", "", "beginIndex", "endIndex", "", "size", "(Ljava/lang/String;II)J", "utf8Size", "codePoint", "", "isIsoControl", "(I)Z", "", "byte", "isUtf8Continuation", "(B)Z", "Lkotlin/Function1;", "Lef/C;", "yield", "processUtf8Bytes", "(Ljava/lang/String;IILtf/l;)V", "", "processUtf8CodePoints", "([BIILtf/l;)V", "", "processUtf16Chars", "process2Utf8Bytes", "([BIILtf/l;)I", "process3Utf8Bytes", "process4Utf8Bytes", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", "C", "REPLACEMENT_CODE_POINT", "I", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i5) {
        if (i5 < 0 || i5 >= 32) {
            return 127 <= i5 && i5 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b5) {
        return (b5 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i5, int i10, @NotNull l yield) {
        AbstractC3340k.e(bArr, "<this>");
        AbstractC3340k.e(yield, "yield");
        int i11 = i5 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i10 <= i11) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b5 = bArr[i5];
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i12 = (b10 ^ 3968) ^ (b5 << 6);
        if (i12 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i12));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i5, int i10, @NotNull l yield) {
        AbstractC3340k.e(bArr, "<this>");
        AbstractC3340k.e(yield, "yield");
        int i11 = i5 + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i10 <= i11) {
            yield.invoke(numValueOf);
            int i12 = i5 + 1;
            return (i10 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
        }
        byte b5 = bArr[i5];
        byte b10 = bArr[i5 + 1];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = bArr[i11];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i13 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b5 << 12);
        if (i13 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i13 || i13 >= 57344) {
            yield.invoke(Integer.valueOf(i13));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i5, int i10, @NotNull l yield) {
        AbstractC3340k.e(bArr, "<this>");
        AbstractC3340k.e(yield, "yield");
        int i11 = i5 + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i10 <= i11) {
            yield.invoke(numValueOf);
            int i12 = i5 + 1;
            if (i10 <= i12 || (bArr[i12] & 192) != 128) {
                return 1;
            }
            int i13 = i5 + 2;
            return (i10 <= i13 || (bArr[i13] & 192) != 128) ? 2 : 3;
        }
        byte b5 = bArr[i5];
        byte b10 = bArr[i5 + 1];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = bArr[i5 + 2];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b12 = bArr[i11];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i14 = (((b12 ^ 3678080) ^ (b11 << 6)) ^ (b10 << 12)) ^ (b5 << 18);
        if (i14 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i14 && i14 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i14 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i14));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r11, int r12, int r13, @org.jetbrains.annotations.NotNull tf.l r14) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Utf8.processUtf16Chars(byte[], int, int, tf.l):void");
    }

    public static final void processUtf8Bytes(@NotNull String str, int i5, int i10, @NotNull l yield) {
        int i11;
        char cCharAt;
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(yield, "yield");
        while (i5 < i10) {
            char cCharAt2 = str.charAt(i5);
            if (AbstractC3340k.g(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i5++;
                while (i5 < i10 && AbstractC3340k.g(str.charAt(i5), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i5)));
                    i5++;
                }
            } else {
                if (AbstractC3340k.g(cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (AbstractC3340k.g(cCharAt2, 56319) > 0 || i10 <= (i11 = i5 + 1) || 56320 > (cCharAt = str.charAt(i11)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = (str.charAt(i11) + (cCharAt2 << '\n')) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i5 += 2;
                }
                i5++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r11, int r12, int r13, @org.jetbrains.annotations.NotNull tf.l r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Utf8.processUtf8CodePoints(byte[], int, int, tf.l):void");
    }

    public static final long size(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return size(str, i5, i10);
    }

    public static final long size(@NotNull String str, int i5) {
        AbstractC3340k.e(str, "<this>");
        return size$default(str, i5, 0, 2, null);
    }

    public static final long size(@NotNull String str, int i5, int i10) {
        int i11;
        AbstractC3340k.e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "beginIndex < 0: ").toString());
        }
        if (i10 >= i5) {
            if (i10 > str.length()) {
                StringBuilder sbL = f.l(i10, "endIndex > string.length: ", " > ");
                sbL.append(str.length());
                throw new IllegalArgumentException(sbL.toString().toString());
            }
            long j8 = 0;
            while (i5 < i10) {
                char cCharAt = str.charAt(i5);
                if (cCharAt < 128) {
                    j8++;
                } else {
                    if (cCharAt < 2048) {
                        i11 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i11 = 3;
                    } else {
                        int i12 = i5 + 1;
                        char cCharAt2 = i12 < i10 ? str.charAt(i12) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j8++;
                            i5 = i12;
                        } else {
                            j8 += 4;
                            i5 += 2;
                        }
                    }
                    j8 += i11;
                }
                i5++;
            }
            return j8;
        }
        throw new IllegalArgumentException(v.e(i10, i5, "endIndex < beginIndex: ", " < ").toString());
    }
}
