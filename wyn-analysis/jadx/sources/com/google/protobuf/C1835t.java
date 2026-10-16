package com.google.protobuf;

import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1835t implements InterfaceC1824p {
    public static String c(ByteBuffer byteBuffer, int i5, int i10) throws InvalidProtocolBufferException {
        if ((i5 | i10 | ((byteBuffer.limit() - i5) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i5), Integer.valueOf(i10)));
        }
        int i11 = i5 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i5 < i11) {
            byte b5 = byteBuffer.get(i5);
            if (b5 < 0) {
                break;
            }
            i5++;
            cArr[i12] = (char) b5;
            i12++;
        }
        int i13 = i12;
        while (i5 < i11) {
            int i14 = i5 + 1;
            byte b10 = byteBuffer.get(i5);
            if (b10 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b10;
                while (i14 < i11) {
                    byte b11 = byteBuffer.get(i14);
                    if (b11 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i15] = (char) b11;
                    i15++;
                }
                i13 = i15;
                i5 = i14;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i5 += 2;
                K1.b(b10, byteBuffer.get(i14), cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i16 = i5 + 2;
                i5 += 3;
                K1.c(b10, byteBuffer.get(i14), byteBuffer.get(i16), cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b12 = byteBuffer.get(i14);
                int i17 = i5 + 3;
                byte b13 = byteBuffer.get(i5 + 2);
                i5 += 4;
                K1.a(b10, b12, b13, byteBuffer.get(i17), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static void d(String str, ByteBuffer byteBuffer) {
        int i5;
        int length = str.length();
        int iPosition = byteBuffer.position();
        int i10 = 0;
        while (i10 < length) {
            try {
                char cCharAt = str.charAt(i10);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i10, (byte) cCharAt);
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i10 == length) {
            byteBuffer.position(iPosition + i10);
            return;
        }
        iPosition += i10;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i11 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i11;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i11;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char cCharAt3 = str.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i13 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i5 = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i13;
                                    i10 = i12;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                                try {
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i10 = i12;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i10 = i12;
                                    iPosition = i5;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new e2(i10, length);
                }
                int i14 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE));
                iPosition += 2;
                byteBuffer.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i10++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public static int h(int i5, int i10, ByteBuffer byteBuffer, int i11) {
        byte b5;
        int i12;
        byte b10;
        int i13;
        int i14 = i10;
        if (i5 != 0) {
            if (i14 >= i11) {
                return i5;
            }
            byte b11 = (byte) i5;
            if (b11 < -32) {
                if (b11 < -62) {
                    return -1;
                }
                int i15 = i14 + 1;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
                i14 = i15;
            } else if (b11 < -16) {
                byte b12 = (byte) (~(i5 >> 8));
                if (b12 == 0) {
                    i13 = i14 + 1;
                    b10 = byteBuffer.get(i14);
                    if (i13 >= i11) {
                        return f2.g(b11, b10);
                    }
                } else {
                    b10 = b12;
                    i13 = i14;
                }
                if (b10 > -65) {
                    return -1;
                }
                if (b11 == -32 && b10 < -96) {
                    return -1;
                }
                if (b11 == -19 && b10 >= -96) {
                    return -1;
                }
                i14 = i13 + 1;
                if (byteBuffer.get(i13) > -65) {
                    return -1;
                }
            } else {
                byte b13 = (byte) (~(i5 >> 8));
                if (b13 == 0) {
                    i12 = i14 + 1;
                    b13 = byteBuffer.get(i14);
                    if (i12 >= i11) {
                        return f2.g(b11, b13);
                    }
                    b5 = 0;
                } else {
                    b5 = (byte) (i5 >> 16);
                    i12 = i14;
                }
                if (b5 == 0) {
                    int i16 = i12 + 1;
                    byte b14 = byteBuffer.get(i12);
                    if (i16 >= i11) {
                        return f2.h(b11, b13, b14);
                    }
                    b5 = b14;
                    i12 = i16;
                }
                if (b13 > -65) {
                    return -1;
                }
                if ((((b13 + 112) + (b11 << 28)) >> 30) != 0 || b5 > -65) {
                    return -1;
                }
                i14 = i12 + 1;
                if (byteBuffer.get(i12) > -65) {
                    return -1;
                }
            }
        }
        C1835t c1835t = f2.f27676a;
        int i17 = i11 - 7;
        int i18 = i14;
        while (i18 < i17 && (byteBuffer.getLong(i18) & (-9187201950435737472L)) == 0) {
            i18 += 8;
        }
        int i19 = (i18 - i14) + i14;
        while (i19 < i11) {
            int i20 = i19 + 1;
            byte b15 = byteBuffer.get(i19);
            if (b15 >= 0) {
                i19 = i20;
            } else if (b15 < -32) {
                if (i20 >= i11) {
                    return b15;
                }
                if (b15 < -62 || byteBuffer.get(i20) > -65) {
                    return -1;
                }
                i19 += 2;
            } else if (b15 < -16) {
                if (i20 >= i11 - 1) {
                    return f2.b(b15, i20, byteBuffer, i11 - i20);
                }
                int i21 = i19 + 2;
                byte b16 = byteBuffer.get(i20);
                if (b16 > -65) {
                    return -1;
                }
                if (b15 == -32 && b16 < -96) {
                    return -1;
                }
                if ((b15 == -19 && b16 >= -96) || byteBuffer.get(i21) > -65) {
                    return -1;
                }
                i19 += 3;
            } else {
                if (i20 >= i11 - 2) {
                    return f2.b(b15, i20, byteBuffer, i11 - i20);
                }
                int i22 = i19 + 2;
                byte b17 = byteBuffer.get(i20);
                if (b17 > -65) {
                    return -1;
                }
                if ((((b17 + 112) + (b15 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i23 = i19 + 3;
                if (byteBuffer.get(i22) > -65) {
                    return -1;
                }
                i19 += 4;
                if (byteBuffer.get(i23) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC1824p
    public byte[] a(int i5, int i10, byte[] bArr) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return bArr2;
    }

    public String b(int i5, int i10, byte[] bArr) throws InvalidProtocolBufferException {
        if ((i5 | i10 | ((bArr.length - i5) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i10)));
        }
        int i11 = i5 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i5 < i11) {
            byte b5 = bArr[i5];
            if (b5 < 0) {
                break;
            }
            i5++;
            cArr[i12] = (char) b5;
            i12++;
        }
        int i13 = i12;
        while (i5 < i11) {
            int i14 = i5 + 1;
            byte b10 = bArr[i5];
            if (b10 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b10;
                while (i14 < i11) {
                    byte b11 = bArr[i14];
                    if (b11 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i15] = (char) b11;
                    i15++;
                }
                i13 = i15;
                i5 = i14;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i5 += 2;
                K1.b(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i16 = i5 + 2;
                i5 += 3;
                K1.c(b10, bArr[i14], bArr[i16], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b12 = bArr[i14];
                int i17 = i5 + 3;
                byte b13 = bArr[i5 + 2];
                i5 += 4;
                K1.a(b10, b12, b13, bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public boolean e(byte[] bArr, int i5, int i10) {
        return g(0, bArr, i5, i10) == 0;
    }

    public int f(int i5, int i10, ByteBuffer byteBuffer, int i11) {
        if (!byteBuffer.hasArray()) {
            return byteBuffer.isDirect() ? h(i5, i10, byteBuffer, i11) : h(i5, i10, byteBuffer, i11);
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        return g(i5, byteBuffer.array(), i10 + iArrayOffset, iArrayOffset + i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        if (r13[r14] > (-65)) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1835t.g(int, byte[], int, int):int");
    }
}
