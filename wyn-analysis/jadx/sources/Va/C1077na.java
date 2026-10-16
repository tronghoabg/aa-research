package Va;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: Va.na, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1077na extends AbstractC1104pb implements Q6 {

    /* renamed from: P, reason: collision with root package name */
    public static final char[] f14430P = {'g', 6224, 12318, 18633, 24757, 31077, 37195, 43286, 39037, 32850, 43069, 53476, 63660, 57713, 2383, 12548, 22984, 16800, 27241, 37437, 4709, 2642, 8732, 23248, 29367, 27515, 57563, 63724, 53410, 43123, 32777, 39367, 29159, 18849, 8544, 'g', 6224, 12318, 18646, 24762, 31098, 37194, 43282, 49606, 55742, 62071};

    /* renamed from: Q, reason: collision with root package name */
    public static final char[] f14431Q = {'2', 'm', 'p', 'f', '[', 'e', 'l', 'l', 'j', 217, 199, 194, 210, 211, 211, '4', 'g', 'h', 'h', 'e', 'f', 'l', ']', '6', 'l', 'm', 'Y', '[', 'l', 'f', 'j', 'n', 'l', 'n', 'k', 'd', 't', 224, 207, 216, 230, '\'', 'X', 'f', 'g', 'd', 'k', ']', 'W', 'g', 'h', 'h', 'V', '[', 'n', 'n', '\"', '[', 'r', 'p', 'p', 'I', 'K', 'o', 'h', 'j', 'h', 'B', 'B', 'n', 'n', 'd', 'l', 't', 'n', 'k', 'j', 'C', '7', 'X', 'f', 'g', 'd', 'k', ']', 'W', 'g', 'h', 'h', 'V', '[', 'n', 'n', 'F', 'G', 'g', 'j', 'n', 'o', 'm', 'B', 'F', 'i', 'l', 'n', 'k', 'i', 'B', '#', 19};

    /* renamed from: R, reason: collision with root package name */
    public static int f14432R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static int f14433S = 1;

    /* renamed from: K, reason: collision with root package name */
    public Field f14434K;
    public final Collection L;

    /* renamed from: M, reason: collision with root package name */
    public Map f14435M;

    /* renamed from: N, reason: collision with root package name */
    public Object f14436N;

    /* renamed from: O, reason: collision with root package name */
    public C1077na f14437O;

    public C1077na(Collection collection, Object obj, C1077na c1077na) {
        this.L = collection;
        this.f14436N = obj;
        this.f14437O = c1077na;
    }

    public static String Y(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14431Q, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String q0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14430P[i5 + i11] ^ (i11 * (-1931635680400173003L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192 A[PHI: r7
  0x0192: PHI (r7v4 ??) = 
  (r7v48 ??)
  (r7v5 ??)
  (r7v49 ??)
  (r7v50 ??)
  (r7v11 ??)
  (r7v51 ??)
  (r7v52 ??)
  (r7v53 ??)
  (r7v54 ??)
  (r7v55 ??)
  (r7v56 ??)
 binds: [B:5:0x001c, B:46:0x018e, B:43:0x0173, B:40:0x014e, B:37:0x0129, B:31:0x00ff, B:28:0x00d6, B:25:0x00ae, B:22:0x0099, B:16:0x0073, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18, types: [int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r18, java.lang.String r19, java.util.ArrayList r20, Va.Ra r21, Va.C1203x8 r22) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1077na.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(java.lang.Object r3) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r2 = this;
            int r0 = Va.C1077na.f14432R
            int r0 = r0 + 37
            int r1 = r0 % 128
            Va.C1077na.f14433S = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = r2.w0()
            r1 = 15
            int r1 = r1 / 0
            if (r0 == 0) goto L2d
            goto L1d
        L17:
            boolean r0 = r2.w0()
            if (r0 == 0) goto L2d
        L1d:
            int r0 = Va.C1077na.f14433S
            int r0 = r0 + 19
            int r0 = r0 % 128
            Va.C1077na.f14432R = r0
            java.lang.reflect.Field r0 = r2.f14434K     // Catch: java.lang.Exception -> L2d
            java.lang.Object r1 = r2.f14436N     // Catch: java.lang.Exception -> L2d
            r0.set(r1, r3)     // Catch: java.lang.Exception -> L2d
            return
        L2d:
            int r3 = Va.C1077na.f14433S
            int r3 = r3 + 103
            int r0 = r3 % 128
            Va.C1077na.f14432R = r0
            int r3 = r3 % 2
            if (r3 != 0) goto L3a
            return
        L3a:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1077na.r0(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return r3.f14434K.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (u0() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (v0() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        Va.C1077na.f14432R = (Va.C1077na.f14433S + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (w0() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (w0() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0() {
        /*
            r3 = this;
            int r0 = Va.C1077na.f14433S
            int r0 = r0 + 85
            int r1 = r0 % 128
            Va.C1077na.f14432R = r1
            int r0 = r0 % 2
            java.lang.Object r1 = r3.f14436N
            if (r0 == 0) goto L19
            boolean r0 = r3.w0()
            r2 = 66
            int r2 = r2 / 0
            if (r0 == 0) goto L26
            goto L1f
        L19:
            boolean r0 = r3.w0()
            if (r0 == 0) goto L26
        L1f:
            java.lang.reflect.Field r0 = r3.f14434K     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L33
            return r0
        L26:
            boolean r0 = r3.u0()
            if (r0 != 0) goto L35
            boolean r0 = r3.v0()
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            return r0
        L35:
            int r0 = Va.C1077na.f14433S
            int r0 = r0 + 43
            int r0 = r0 % 128
            Va.C1077na.f14432R = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1077na.s0():java.lang.Object");
    }

    public final Field t0() {
        int i5 = (f14433S + 45) % 128;
        f14432R = i5;
        f14433S = (i5 + 105) % 128;
        return this.f14434K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        Va.C1077na.f14433S = (r1 + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u0() {
        /*
            r4 = this;
            int r0 = Va.C1077na.f14433S
            int r0 = r0 + 29
            int r1 = r0 % 128
            Va.C1077na.f14432R = r1
            int r0 = r0 % 2
            r2 = 0
            java.util.Collection r3 = r4.L
            if (r0 == 0) goto L15
            r0 = 98
            int r0 = r0 / r2
            if (r3 == 0) goto L1f
            goto L17
        L15:
            if (r3 == 0) goto L1f
        L17:
            int r1 = r1 + 117
            int r1 = r1 % 128
            Va.C1077na.f14433S = r1
            r0 = 1
            return r0
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1077na.u0():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        Va.C1077na.f14433S = (r1 + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v0() {
        /*
            r4 = this;
            int r0 = Va.C1077na.f14433S
            int r0 = r0 + 93
            int r1 = r0 % 128
            Va.C1077na.f14432R = r1
            int r0 = r0 % 2
            r2 = 0
            java.util.Map r3 = r4.f14435M
            if (r0 == 0) goto L15
            r0 = 87
            int r0 = r0 / r2
            if (r3 == 0) goto L1f
            goto L17
        L15:
            if (r3 == 0) goto L1f
        L17:
            int r1 = r1 + 75
            int r1 = r1 % 128
            Va.C1077na.f14433S = r1
            r0 = 1
            return r0
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1077na.v0():boolean");
    }

    public final boolean w0() {
        int i5 = (f14432R + 19) % 128;
        f14433S = i5;
        if (this.f14434K == null) {
            return false;
        }
        f14432R = (i5 + 41) % 128;
        return true;
    }
}
