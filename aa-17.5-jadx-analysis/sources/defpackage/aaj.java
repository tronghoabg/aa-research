package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public final class aaj {
    public long[] a = aao.a;
    public Object[] b = aaz.c;
    public long[] c = aas.a;
    public int d = Alert.DURATION_SHOW_INDEFINITELY;
    public int e = Alert.DURATION_SHOW_INDEFINITELY;
    public int f;
    public int g;
    private int h;

    public aaj(int i) {
        l(i);
    }

    private final int i(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = this.f;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i5;
            long j4 = i5 & 127;
            long j5 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j6 = (72340172838076673L * j4) ^ j5;
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                int i14 = i4;
                if (affa.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i14;
            }
            int i15 = i4;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iJ = j(i6);
                if (this.h != 0 || ((this.a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) == 254) {
                    j = j4;
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i16 = this.f;
                    j3 = 128;
                    if (i16 <= 8 || Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE) > 0) {
                        j = j4;
                        i2 = i6;
                        j2 = 255;
                        i = 1;
                        int i17 = 0;
                        int iB = aao.b(this.f);
                        long[] jArr4 = this.a;
                        Object[] objArr = this.b;
                        long[] jArr5 = this.c;
                        int i18 = this.f;
                        int[] iArr = new int[i18];
                        l(iB);
                        long[] jArr6 = this.a;
                        Object[] objArr2 = this.b;
                        long[] jArr7 = this.c;
                        int i19 = this.f;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr4[i20 >> 3] >> ((i20 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr[i20];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i17) * i15;
                                int iJ2 = j((iHashCode2 ^ (iHashCode2 << 16)) >>> 7);
                                int i21 = iJ2 >> 3;
                                int i22 = (iJ2 & 7) << 3;
                                jArr = jArr6;
                                jArr2 = jArr4;
                                long j8 = ((r13 & 127) << i22) | (jArr6[i21] & (~(255 << i22)));
                                jArr[i21] = j8;
                                jArr[(((iJ2 - 7) & i19) + (i19 & 7)) >> 3] = j8;
                                objArr2[iJ2] = obj2;
                                jArr7[iJ2] = jArr5[i20];
                                iArr[i20] = iJ2;
                            } else {
                                jArr = jArr6;
                                jArr2 = jArr4;
                            }
                            i20++;
                            jArr6 = jArr;
                            jArr4 = jArr2;
                            i17 = 0;
                        }
                        long[] jArr8 = this.c;
                        int length = jArr8.length;
                        for (int i23 = 0; i23 < length; i23++) {
                            long j9 = jArr8[i23];
                            jArr8[i23] = (((j9 & (-4611686018427387904L)) | (((int) ((j9 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r5])) << 31) | (((int) (j9 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r8]);
                        }
                        int i24 = this.d;
                        if (i24 != Integer.MAX_VALUE) {
                            this.d = iArr[i24];
                        }
                        int i25 = this.e;
                        if (i25 != Integer.MAX_VALUE) {
                            this.e = iArr[i25];
                        }
                    } else {
                        long[] jArr9 = this.a;
                        if (jArr9 == null) {
                            j = j4;
                            i3 = i6;
                            j2 = 255;
                            i = 1;
                            iJ = j(i3);
                        } else {
                            int i26 = this.f;
                            Object[] objArr3 = this.b;
                            long[] jArr10 = this.c;
                            long[] jArr11 = new long[i26];
                            j2 = 255;
                            Arrays.fill(jArr11, 0, i26, 9223372034707292159L);
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                long j10 = jArr9[i28] & (-9187201950435737472L);
                                jArr9[i28] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i28++;
                                i12 = i12;
                            }
                            i = i12;
                            int iCM = woy.cM(jArr9);
                            int i29 = iCM - 1;
                            jArr9[i29] = (jArr9[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr9[iCM] = jArr9[0];
                            int i30 = 0;
                            while (i30 != i26) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j11 = (jArr9[i31] >> i32) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj3 = objArr3[i30];
                                    int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i15;
                                    int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i34 = i33 & 127;
                                    int i35 = i33 >>> 7;
                                    int iJ3 = j(i35);
                                    int i36 = i35 & i26;
                                    int i37 = i6;
                                    long j12 = i34;
                                    if (((iJ3 - i36) & i26) / 8 == ((i30 - i36) & i26) / 8) {
                                        int i38 = i30 + 1;
                                        jArr9[i31] = (j12 << i32) | (jArr9[i31] & (~(255 << i32)));
                                        if (jArr11[i30] == 9223372034707292159L) {
                                            long j13 = i30;
                                            jArr11[i30] = j13 | (j13 << 32);
                                        }
                                        jArr9[jArr9.length - 1] = jArr9[0];
                                        i30 = i38;
                                        i6 = i37;
                                    } else {
                                        long j14 = i30;
                                        long j15 = j4;
                                        long j16 = iJ3;
                                        int i39 = iJ3 >> 3;
                                        long j17 = jArr9[i39];
                                        int i40 = (iJ3 & 7) << 3;
                                        long j18 = j12 << i40;
                                        long j19 = j17 & (~(255 << i40));
                                        if (((j17 >> i40) & 255) == 128) {
                                            long j20 = j14 << 32;
                                            long j21 = ~(255 << i32);
                                            jArr9[i39] = j18 | j19;
                                            jArr9[i31] = (j21 & jArr9[i31]) | (128 << i32);
                                            objArr3[iJ3] = objArr3[i30];
                                            objArr3[i30] = null;
                                            jArr10[iJ3] = jArr10[i30];
                                            jArr10[i30] = 4611686018427387903L;
                                            int i41 = (int) ((jArr11[i30] >> 32) & 4294967295L);
                                            if (i41 != Integer.MAX_VALUE) {
                                                jArr11[i41] = (jArr11[i41] & (-4294967296L)) | j16;
                                                jArr11[i30] = (jArr11[i30] & 4294967295L) | (-4294967296L);
                                            } else {
                                                jArr11[i30] = j16 | 9223372032559808512L;
                                            }
                                            jArr11[iJ3] = j20 | 2147483647L;
                                        } else {
                                            long j22 = j16 << 32;
                                            jArr9[i39] = j18 | j19;
                                            Object obj4 = objArr3[iJ3];
                                            objArr3[iJ3] = objArr3[i30];
                                            objArr3[i30] = obj4;
                                            long j23 = jArr10[iJ3];
                                            jArr10[iJ3] = jArr10[i30];
                                            jArr10[i30] = j23;
                                            int i42 = (int) ((jArr11[i30] >> 32) & 4294967295L);
                                            if (i42 != Integer.MAX_VALUE) {
                                                jArr11[i42] = (jArr11[i42] & (-4294967296L)) | j16;
                                                jArr11[i30] = j22 | (jArr11[i30] & 4294967295L);
                                            } else {
                                                jArr11[i30] = j22 | j16;
                                                i42 = i30;
                                            }
                                            jArr11[iJ3] = (i42 << 32) | j14;
                                            i30--;
                                        }
                                        jArr9[jArr9.length - 1] = jArr9[0];
                                        i30++;
                                        i6 = i37;
                                        j4 = j15;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            j = j4;
                            i2 = i6;
                            k();
                            long[] jArr12 = this.c;
                            int length2 = jArr12.length;
                            for (int i43 = 0; i43 < length2; i43++) {
                                long j24 = jArr12[i43];
                                jArr12[i43] = (((j24 & (-4611686018427387904L)) | (((int) ((j24 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr11[r6] & 4294967295L))) << 31) | (((int) (j24 & 2147483647L)) == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : (int) (jArr11[r8] & 4294967295L));
                            }
                            int i44 = this.d;
                            if (i44 != Integer.MAX_VALUE) {
                                this.d = (int) (jArr11[i44] & 4294967295L);
                            }
                            int i45 = this.e;
                            if (i45 != Integer.MAX_VALUE) {
                                this.e = (int) (jArr11[i45] & 4294967295L);
                            }
                        }
                    }
                    i3 = i2;
                    iJ = j(i3);
                }
                this.g++;
                int i46 = this.h;
                long[] jArr13 = this.a;
                int i47 = iJ >> 3;
                long j25 = jArr13[i47];
                int i48 = (iJ & 7) << 3;
                if (((j25 >> i48) & j2) != j3) {
                    i = 0;
                }
                this.h = i46 - i;
                int i49 = this.f;
                long j26 = (j25 & (~(j2 << i48))) | (j << i48);
                jArr13[i47] = j26;
                jArr13[(((iJ - 7) & i49) + (i49 & 7)) >> 3] = j26;
                return iJ;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i13;
            i4 = i15;
        }
    }

    private final int j(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void k() {
        this.h = aao.a(this.f) - this.g;
    }

    private final void l(int i) {
        int iMax;
        long[] jArr;
        int i2;
        int i3;
        Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            long[] jArr3 = aao.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.f = iMax;
        if (iMax == 0) {
            jArr = aao.a;
            i2 = 0;
        } else {
            int i4 = (iMax + 15) >> 3;
            long[] jArr4 = new long[i4];
            Arrays.fill(jArr4, 0, i4, -9187201950435737472L);
            jArr = jArr4;
            i2 = iMax;
        }
        this.a = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((7 & i2) << 3);
        jArr[i5] = (jArr[i5] & (~j)) | j;
        k();
        if (iMax == 0) {
            objArr = aaz.c;
            i3 = 0;
        } else {
            i3 = iMax;
            objArr = new Object[iMax];
        }
        this.b = objArr;
        if (i3 == 0) {
            jArr2 = aas.a;
        } else {
            jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.f
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r5 & 7
            int r10 = r5 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r3
            r10 = 0
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4e:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6e
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.b
            r14 = r14[r9]
            boolean r14 = defpackage.affa.f(r14, r1)
            if (r14 == 0) goto L69
            if (r9 < 0) goto L7e
            return r13
        L69:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4e
        L6e:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L7e
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaj.a(java.lang.Object):boolean");
    }

    public final boolean b() {
        return this.g == 0;
    }

    public final void c() {
        this.g = 0;
        if (this.a != aao.a) {
            woy.du(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        woy.cE(this.b, null, 0, this.f);
        woy.du(this.c, 4611686018427387903L);
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = Alert.DURATION_SHOW_INDEFINITELY;
        k();
    }

    public final void d(Object obj) {
        int i = i(obj);
        this.b[i] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[i] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & i) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = i;
        if (this.e == Integer.MAX_VALUE) {
            this.e = i;
        }
    }

    public final void e(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.f;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | i6;
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (i5 << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aaj)) {
            return false;
        }
        aaj aajVar = (aaj) obj;
        if (aajVar.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128 && !aajVar.a(objArr[(i << 3) + i3])) {
                                return false;
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean f(Object obj) {
        int i = this.g;
        int i2 = i(obj);
        this.b[i2] = obj;
        long[] jArr = this.c;
        int i3 = this.d;
        jArr[i2] = (i3 & 2147483647L) | 4611686016279904256L;
        if (i3 != Integer.MAX_VALUE) {
            jArr[i3] = ((2147483647L & i2) << 31) | (jArr[i3] & (-4611686016279904257L));
        }
        this.d = i2;
        if (this.e == Integer.MAX_VALUE) {
            this.e = i2;
        }
        return this.g != i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.f
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r5 & 7
            int r10 = r5 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r3
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4d:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6b
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.b
            r14 = r14[r9]
            boolean r14 = defpackage.affa.f(r14, r1)
            if (r14 == 0) goto L66
            goto L75
        L66:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4d
        L6b:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L80
            r9 = -1
        L75:
            if (r9 < 0) goto L79
            r2 = r13
            goto L7a
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L7f
            r0.e(r9)
        L7f:
            return r2
        L80:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaj.g(java.lang.Object):boolean");
    }

    public final boolean h(Collection collection) {
        int i;
        collection.getClass();
        Object[] objArr = this.b;
        int i2 = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!woy.cn(collection, objArr[i6])) {
                                e(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.g;
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = (~(i2 - length)) >>> 31;
                    int i4 = 0;
                    while (true) {
                        i = 8 - i3;
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!affa.f(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        int i = 0;
        aai aaiVar = new aai(this, i);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i2 = this.e;
        while (true) {
            if (i2 == Integer.MAX_VALUE) {
                break;
            }
            long j = jArr[i2] >> 31;
            Object obj = objArr[i2];
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) aaiVar.invoke(obj));
            i++;
            i2 = (int) (j & 2147483647L);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public aaj() {
    }
}
