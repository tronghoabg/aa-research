package com.google.protobuf;

import com.applovin.shadow.okio.Utf8;

/* loaded from: classes4.dex */
public abstract class K1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I1 f27585a = new I1();

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f27586b = new J1();

    public static void a(byte b5, byte b10, byte b11, byte b12, char[] cArr, int i5) throws InvalidProtocolBufferException {
        if (!e(b10)) {
            if ((((b10 + 112) + (b5 << 28)) >> 30) == 0 && !e(b11) && !e(b12)) {
                int i10 = ((b5 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
                cArr[i5] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i5 + 1] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void b(byte b5, byte b10, char[] cArr, int i5) throws InvalidProtocolBufferException {
        if (b5 < -62 || e(b10)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i5] = (char) (((b5 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
    }

    public static void c(byte b5, byte b10, byte b11, char[] cArr, int i5) throws InvalidProtocolBufferException {
        if (e(b10) || ((b5 == -32 && b10 < -96) || ((b5 == -19 && b10 >= -96) || e(b11)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i5] = (char) (((b5 & 15) << 12) | ((b10 & Utf8.REPLACEMENT_BYTE) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static String d(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i5 = 0; i5 < byteString.size(); i5++) {
            byte bByteAt = byteString.byteAt(i5);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bByteAt);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean e(byte b5) {
        return b5 > -65;
    }
}
