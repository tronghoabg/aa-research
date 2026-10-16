package Va;

/* renamed from: Va.da, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0947da extends D7 implements Q6 {

    /* renamed from: R, reason: collision with root package name */
    public static int f14112R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static int f14113S = 1;

    /* renamed from: U, reason: collision with root package name */
    public static int f14115U = 0;

    /* renamed from: V, reason: collision with root package name */
    public static int f14116V = 1;

    /* renamed from: N, reason: collision with root package name */
    public final /* synthetic */ int f14117N;

    /* renamed from: O, reason: collision with root package name */
    public AbstractC0934ca f14118O;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f14110P = {-76, 71, 97, -107, 89, -83, -73, -75, 103, -94, 77, -80, -64, 55, -56, 51, -20, 25, -56, 49, 55, -27, 11, -19, -19, 15, -41, 50, -1, 5, -27, -23, 24, -25, 25, -31, 17, -58, 13, -28, -25, 44, 62, -39, 37, -35, 33, -39, -41, 14, -55, 9, -51, 41, -35, 61, -48, -34, 7, -6, 6, -5, -78, 75, -72, 70, -74, 72, 78, 76, 108, -83, -75, 74, -79, 110, 52, -113, -58, 52, -57, 60, -53, 126, -120, -36, 62, -58, 32, -64, 125, -127, -52, 53, -58, 56, -56, 54, 48, 50, 18, -45, -53, 52, -49, 16, 21, -118, -54, 54, -58, -52, 33, -51, -34, 32, 118, -120, -54, 48, 50, -62, 100, -99, 48, -50, 51, 30, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: Q, reason: collision with root package name */
    public static final char[] f14111Q = {'s', 'e', 'a', 'r', 'c', 'h', 'F', 'o', 'E', 'x', 't', 'T', 'y', 'p', 'd', 'M', 'i', 'f', 'I', 'n', 'l', 'u', 'g', 'b', '\''};

    /* renamed from: T, reason: collision with root package name */
    public static final int[] f14114T = {-1532905385, 1546617307, -692346687, -1939764016, -790908291, -1028789114, 1161895575, 909109975, -711138579, 1399174031, -1252861551, 965207937, -1400968576, 1186291046, 2069002847, -205284554, 1265233165, -387780918};

    public /* synthetic */ C0947da(int i5) {
        this.f14117N = i5;
    }

    public static String B(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14114T.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String c1(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 111;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14110P[1377972141 + i11] + 111);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1377972139)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 609678762);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14110P;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static String d1(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14111Q;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String e1(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-5967968094001886661L));
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[PHI: r15 r20
  0x006b: PHI (r15v7 int) = (r15v51 int), (r15v29 int) binds: [B:12:0x0069, B:50:0x0226] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r20v6 int) = (r20v5 int), (r20v7 int) binds: [B:12:0x0069, B:50:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022d A[PHI: r15 r20
  0x022d: PHI (r15v28 int) = 
  (r15v38 int)
  (r15v31 int)
  (r15v39 int)
  (r15v40 int)
  (r15v33 int)
  (r15v41 int)
  (r15v42 int)
  (r15v35 int)
  (r15v37 int)
  (r15v2 int)
 binds: [B:12:0x0069, B:48:0x021b, B:45:0x01f5, B:42:0x01ba, B:39:0x017b, B:32:0x0147, B:28:0x0103, B:24:0x00c2, B:21:0x009f, B:6:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x022d: PHI (r20v16 int) = 
  (r20v5 int)
  (r20v7 int)
  (r20v8 int)
  (r20v9 int)
  (r20v10 int)
  (r20v11 int)
  (r20v12 int)
  (r20v13 int)
  (r20v14 int)
  (r20v17 int)
 binds: [B:12:0x0069, B:48:0x021b, B:45:0x01f5, B:42:0x01ba, B:39:0x017b, B:32:0x0147, B:28:0x0103, B:24:0x00c2, B:21:0x009f, B:6:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023c A[Catch: Exception -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:56:0x023c, B:11:0x005d, B:20:0x007e, B:23:0x00a3, B:27:0x00d4, B:31:0x0115, B:38:0x0160, B:41:0x0181, B:44:0x01bf, B:47:0x01fa), top: B:105:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0281 A[Catch: Exception -> 0x027e, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0291 A[Catch: Exception -> 0x027e, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b2 A[Catch: Exception -> 0x027e, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02dc A[Catch: Exception -> 0x027e, TRY_LEAVE, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0320 A[Catch: Exception -> 0x027e, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0330 A[Catch: Exception -> 0x027e, TRY_LEAVE, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0365 A[Catch: Exception -> 0x027e, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0382 A[Catch: Exception -> 0x027e, TRY_LEAVE, TryCatch #1 {Exception -> 0x027e, blocks: (B:58:0x0272, B:61:0x0281, B:63:0x028e, B:65:0x0291, B:67:0x029e, B:70:0x02ad, B:71:0x02ae, B:72:0x02b1, B:73:0x02b2, B:75:0x02c9, B:77:0x02d6, B:78:0x02db, B:79:0x02dc, B:83:0x02f9, B:84:0x02ff, B:87:0x030d, B:85:0x0304, B:89:0x0320, B:91:0x0330, B:95:0x034a, B:97:0x0365, B:99:0x0382), top: B:107:0x0239 }] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f1(Va.C1214y7 r23, java.lang.String r24, java.util.ArrayList r25, Va.Ra r26, Va.C1203x8 r27) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0947da.f1(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    public void Z0(int i5) {
        int i10 = (f14112R + 119) % 128;
        f14113S = i10;
        C0960ea c0960ea = (C0960ea) this.f14118O;
        c0960ea.f14071M = i5 | c0960ea.f14071M;
        f14112R = (i10 + 47) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r19, java.lang.String r20, java.util.ArrayList r21, Va.Ra r22, Va.C1203x8 r23) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0947da.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    public void a1(Class cls) {
        int i5 = f14113S;
        f14112R = (i5 + 1) % 128;
        ((C0960ea) this.f14118O).f14140O = cls;
        int i10 = i5 + 25;
        f14112R = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void b1(int i5) {
        int i10 = f14112R + 99;
        f14113S = i10 % 128;
        int i11 = i10 % 2;
        C0960ea c0960ea = (C0960ea) this.f14118O;
        c0960ea.f14072N = i5 | c0960ea.f14072N;
    }
}
