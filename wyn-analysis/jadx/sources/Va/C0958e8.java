package Va;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.e8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0958e8 extends AbstractC1104pb implements Q6 {

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f14123W = {-514055054, 986805583, 118192177, 2139654145, 2062548679, 190415070, -518954687, 438003559, -2098248804, 1542630599, 1863072784, -288092209, 1081576945, 529164221, 473022761, 1727075667, -1927367909, 983953927};

    /* renamed from: X, reason: collision with root package name */
    public static final byte[] f14124X = {27, -27, 35, -51, 15, -2, 27, -37, 7, -2, 8, -15, 3, 12, 30, -49, 15, -14, -11, -9, 37, -26, 7, -2, 8, -15, 3, 12, 30, -49, 15, -14, 27, -41, 13, -14, 10, -11, 2, 13, -17, 18, 35, -51, 15, -14, 27, -41, 13, -14, 10, -11, 2, 13, -17, 18, 35, -51, 15, -2, 27, -28, -17, 13, -11, 19, -4, -13, 47, -49, 15, -14, 27, -39, -5, 6, -3, 43, -45, 15, -2, 27, -43, 1, 14, -16, 4, 12, 19, -34, 15, -2, 27, -39, -3, 47, -48, 15, -2, 2, -6, -9, 34, -20, -5, 39, -50, 15, -2, 22, -11, 9, -13, 0, -3, 50, -33, -5, 39, -50, 15, -14, 22, -11, 9, -13, 0, -3, 50, -33, -5, 39, -50, 15, -2, -1, -4, 41, -37, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: Y, reason: collision with root package name */
    public static int f14125Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    public static int f14126Z = 1;

    /* renamed from: K, reason: collision with root package name */
    public String f14127K;
    public String L;

    /* renamed from: M, reason: collision with root package name */
    public String f14128M;

    /* renamed from: N, reason: collision with root package name */
    public String f14129N;

    /* renamed from: O, reason: collision with root package name */
    public String f14130O;

    /* renamed from: P, reason: collision with root package name */
    public String f14131P;

    /* renamed from: Q, reason: collision with root package name */
    public String f14132Q;

    /* renamed from: R, reason: collision with root package name */
    public String f14133R;

    /* renamed from: S, reason: collision with root package name */
    public String f14134S;

    /* renamed from: T, reason: collision with root package name */
    public String f14135T;

    /* renamed from: U, reason: collision with root package name */
    public String f14136U;

    /* renamed from: V, reason: collision with root package name */
    public String f14137V;

    public static String s0(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14123W.clone();
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

    public static String t0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 70;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14124X[(-1816622011) + i11] + 70);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1816622013) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1673015664);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14124X;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04dc A[PHI: r4
  0x04dc: PHI (r4v5 ??) = 
  (r4v0 int)
  (r4v7 int)
  (r4v9 int)
  (r4v11 int)
  (r4v13 int)
  (r4v16 int)
  (r4v19 int)
  (r4v21 int)
  (r4v25 int)
  (r4v29 int)
  (r4v32 int)
  (r4v34 int)
  (r4v37 int)
  (r4v39 int)
  (r4v42 int)
  (r4v44 int)
  (r4v47 int)
  (r4v50 int)
  (r4v52 int)
  (r4v54 int)
  (r4v56 int)
  (r4v59 int)
  (r4v62 int)
  (r4v66 int)
  (r4v70 int)
  (r4v102 int)
 binds: [B:5:0x0049, B:93:0x04d7, B:90:0x049e, B:87:0x047a, B:84:0x045b, B:82:0x0440, B:74:0x03f8, B:69:0x03b8, B:66:0x039d, B:63:0x0363, B:60:0x032d, B:57:0x0306, B:54:0x02ca, B:51:0x0293, B:48:0x0276, B:45:0x023e, B:42:0x0206, B:39:0x01d3, B:36:0x01b4, B:33:0x0197, B:30:0x0178, B:27:0x0144, B:20:0x0110, B:17:0x00eb, B:14:0x00b5, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r37, java.lang.String r38, java.util.ArrayList r39, Va.Ra r40, Va.C1203x8 r41) {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0958e8.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    public final JSONObject q0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(AbstractC1141sa.f14586F, this.f14127K);
            jSONObject.putOpt(AbstractC1141sa.f14587G, this.L);
            jSONObject.putOpt(AbstractC1141sa.f14583C, this.f14128M);
            jSONObject.putOpt(AbstractC1141sa.f14582B, this.f14130O);
            jSONObject.putOpt(AbstractC1141sa.f14584D, this.f14131P);
            jSONObject.putOpt(AbstractC1141sa.f14585E, this.f14132Q);
            jSONObject.putOpt(AbstractC1141sa.f14588H, this.f14133R);
            jSONObject.putOpt(AbstractC1141sa.f14589I, this.f14134S);
            jSONObject.putOpt(AbstractC1141sa.f14590J, this.f14135T);
            f14126Z = (f14125Y + 59) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final String r0() {
        int i5 = (f14126Z + 1) % 128;
        f14125Y = i5;
        String str = this.f14131P;
        f14126Z = (i5 + 1) % 128;
        return str;
    }
}
