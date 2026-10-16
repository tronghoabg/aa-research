package Va;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.d8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0945d8 extends AbstractC1104pb implements Q6 {

    /* renamed from: S, reason: collision with root package name */
    public static final char[] f14095S = {'g', 3183, 6240, 9293, 12359, 15431, 18510, 21541, 24629, 27663, 30742, 33794, 36875, 'g', 3183, 6240, 9288, 12353, 15446, 18521, 21545, 24581, 27688, 30728, 33821, 'g', 3183, 6240, 9303, 12363, 15453, 18514, 21523, 24610, 27702, 30743, 2328, 1296, 4383, 11556, 14649, 13609, 16640, 23896, 26973, 25921, 29006, 36195, 39275, 38286, 32054, 28990, 25905, 22796, 19723, 16646, 13580, 10595, 7528, 4477, 1360, 63851, 60752, 57763, 54712, 'a', 3182, 6256, 9293, 12359, 15431, 18510, 21541, 24629, 27663, 30742, 33794, 2428, 1395, 4461, 11594, 14680, 13646, 16710, 23870, 26904, 25909, 28949, 36096, 45895, 48968, 43862, 38781, 33632, 36720, 64345, 59137, 54020, 57112, 51991, 14138, 9010, 12247, 48080, 47071, 41921, 40953, 35824, 34791, 62440, 61336, 56244, 55193, 50105, 'a', 3182, 6256, 9288, 12353, 15446, 18521, 21545, 24581, 27688, 30728, 33821, 's', 3183, 6240, 9307, 12358, 15446, 18559, 21543, 24610, 27710, 30759, 33820, 36893, 40163, 43256, 46335, 49366, 52431, 55520, 58567, 61624, 64695, 's', 3183, 6240, 9293, 12359, 15431, 18510, 21541, 24629, 27663, 30742, 33794, 36907, 40173, 43257, 46308, 49347, 52431, 22566, 21562, 16437, 31746, 26654, 25608, 4103, 3142, 14455, 13411, 8290, 56404, 51288, 50341, 61626, 60582, 16740, 19820, 22883, 25944, 28997, 32085, 2428, 5412, 8481, 11581, 14642, 50463, 53527, 56786, 59872, 62944, 33233, 36298, 39378, 'g', 3183, 6240, 9309, 12378, 15447, 18525, 21554, 24633, 27692, 30721, 33853, 36887, 40183, 43262, 46325, 49349, 52448, 55495, 58577, 61606, 's', 3183, 6240, 9306, 12379, 15426, 'h', 3179, 6247, 9309, 12378, 15447, 18525, 21554, 24633, 27692, 30721, 33831, 36886, 40164, 43235};

    /* renamed from: T, reason: collision with root package name */
    public static final int[] f14096T = {-1635697465, -1503023424, 89810566, -186965304, 417816144, -1506675079, -1790282402, -1603881568, 1317160743, 1342922917, -754054035, -1280370848, 711541477, -315953591, -1771681774, 971297861, -2074151273, 1991288538};

    /* renamed from: U, reason: collision with root package name */
    public static int f14097U = 0;

    /* renamed from: V, reason: collision with root package name */
    public static int f14098V = 1;

    /* renamed from: P, reason: collision with root package name */
    public EnumC0908aa f14103P;

    /* renamed from: Q, reason: collision with root package name */
    public EnumC0908aa f14104Q;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f14099K = new ArrayList();
    public final ArrayList L = new ArrayList();

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f14100M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f14101N = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f14102O = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    public JSONObject f14105R = new JSONObject();

    public static String F0(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14096T.clone();
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

    public static void H0(String str, ArrayList arrayList) {
        if (arrayList != null) {
            f14097U = (f14098V + 31) % 128;
            if (!(!TextUtils.isEmpty(str))) {
                return;
            }
            f14098V = (f14097U + 95) % 128;
            if (arrayList.contains(str)) {
                return;
            }
            arrayList.add(str);
            f14098V = (f14097U + 103) % 128;
        }
    }

    public static void M0(List list, ArrayList arrayList) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i5 = f14098V + 75;
                f14097U = i5 % 128;
                if (i5 % 2 != 0) {
                    H0((String) it.next(), arrayList);
                    int i10 = 91 / 0;
                } else {
                    H0((String) it.next(), arrayList);
                }
                f14097U = (f14098V + 85) % 128;
            }
        }
        f14097U = (f14098V + 15) % 128;
    }

    public static String S0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14095S[i5 + i11] ^ (i11 * 5277713306107710474L)) ^ c10);
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

    public final void A0(String str) throws JSONException {
        f14097U = (f14098V + 61) % 128;
        try {
            this.f14105R.put(AbstractC1141sa.f14632x, str);
            int i5 = f14098V + 59;
            f14097U = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public final EnumC0908aa B0() {
        int i5 = f14098V;
        int i10 = i5 + 115;
        f14097U = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        EnumC0908aa enumC0908aa = this.f14103P;
        f14097U = (i5 + 77) % 128;
        return enumC0908aa;
    }

    public final void C0(String str) throws JSONException {
        int i5 = f14098V + 77;
        f14097U = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                this.f14105R.put(AbstractC1141sa.f14634z, str);
                throw null;
            }
            this.f14105R.put(AbstractC1141sa.f14634z, str);
            int i10 = f14098V + 63;
            f14097U = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public final EnumC0908aa D0() {
        int i5 = f14097U + 81;
        f14098V = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f14104Q;
        }
        throw null;
    }

    public final void E0(String str) throws JSONException {
        f14097U = (f14098V + 29) % 128;
        try {
            this.f14105R.put(AbstractC1141sa.f14633y, str);
            f14097U = (f14098V + 73) % 128;
        } catch (JSONException unused) {
        }
    }

    public final ArrayList G0() {
        int i5 = f14097U + 111;
        int i10 = i5 % 128;
        f14098V = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        ArrayList arrayList = this.f14099K;
        int i11 = i10 + 17;
        f14097U = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public final void I0(String str) {
        f14098V = (f14097U + 75) % 128;
        H0(str, this.L);
        int i5 = f14098V + 63;
        f14097U = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void J0(List list) {
        int i5 = f14097U + 97;
        f14098V = i5 % 128;
        int i10 = i5 % 2;
        M0(list, this.L);
        if (i10 == 0) {
            throw null;
        }
    }

    public final ArrayList K0() {
        int i5 = f14098V;
        ArrayList arrayList = this.L;
        int i10 = i5 + 15;
        f14097U = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
        }
        return arrayList;
    }

    public final void L0(EnumC0908aa enumC0908aa) {
        if (enumC0908aa != null) {
            int i5 = f14098V;
            this.f14104Q = enumC0908aa;
            f14097U = (i5 + 59) % 128;
        }
    }

    public final void N0(String str) {
        f14097U = (f14098V + 25) % 128;
        H0(str, this.f14099K);
        f14097U = (f14098V + 71) % 128;
    }

    public final void O0(List list) {
        f14098V = (f14097U + 121) % 128;
        M0(list, this.f14099K);
        f14097U = (f14098V + 49) % 128;
    }

    public final ArrayList P0() {
        int i5 = (f14098V + 15) % 128;
        f14097U = i5;
        ArrayList arrayList = this.f14102O;
        f14098V = (i5 + 123) % 128;
        return arrayList;
    }

    public final void Q0(List list) {
        int i5 = f14098V + 1;
        f14097U = i5 % 128;
        int i10 = i5 % 2;
        M0(list, this.f14101N);
        if (i10 != 0) {
            throw null;
        }
    }

    public final void R0(String str) {
        int i5 = f14097U + 95;
        f14098V = i5 % 128;
        int i10 = i5 % 2;
        H0(str, this.f14100M);
        if (i10 == 0) {
            int i11 = 30 / 0;
        }
    }

    public final ArrayList T0() {
        int i5 = f14098V + 77;
        f14097U = i5 % 128;
        int i10 = i5 % 2;
        ArrayList arrayList = this.f14100M;
        if (i10 != 0) {
            int i11 = 48 / 0;
        }
        return arrayList;
    }

    public final void U0(List list) {
        int i5 = f14098V + 21;
        f14097U = i5 % 128;
        int i10 = i5 % 2;
        M0(list, this.f14102O);
        if (i10 != 0) {
            throw null;
        }
        int i11 = f14097U + 97;
        f14098V = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public final void V0(String str) {
        int i5 = f14098V + 1;
        f14097U = i5 % 128;
        int i10 = i5 % 2;
        H0(str, this.f14101N);
        if (i10 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(Va.EnumC0908aa r4) {
        /*
            r3 = this;
            int r0 = Va.C0945d8.f14097U
            int r1 = r0 + 21
            int r2 = r1 % 128
            Va.C0945d8.f14098V = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L13
            r1 = 14
            int r1 = r1 / 0
            if (r4 == 0) goto L17
            goto L15
        L13:
            if (r4 == 0) goto L17
        L15:
            r3.f14103P = r4
        L17:
            int r0 = r0 + 125
            int r4 = r0 % 128
            Va.C0945d8.f14098V = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L22
            return
        L22:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0945d8.W0(Va.aa):void");
    }

    public final void X0(List list) {
        int i5 = f14098V + 43;
        f14097U = i5 % 128;
        int i10 = i5 % 2;
        M0(list, this.f14100M);
        if (i10 != 0) {
            throw null;
        }
    }

    public final void Y0(JSONObject jSONObject) {
        int i5 = f14097U + 9;
        f14098V = i5 % 128;
        int i10 = i5 % 2;
        this.f14105R = Ab.u(jSONObject);
        if (i10 == 0) {
            throw null;
        }
        int i11 = f14098V + 81;
        f14097U = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 35 / 0;
        }
    }

    public final ArrayList Z0() {
        int i5 = f14097U;
        int i10 = i5 + 105;
        f14098V = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ArrayList arrayList = this.f14101N;
        int i11 = i5 + 51;
        f14098V = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c2  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r30, java.lang.String r31, java.util.ArrayList r32, Va.Ra r33, Va.C1203x8 r34) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0945d8.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    public final void a1(String str) {
        f14097U = (f14098V + 125) % 128;
        H0(str, this.f14102O);
        int i5 = f14097U + 113;
        f14098V = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 97 / 0;
        }
    }

    public final JSONObject q0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            EnumC0908aa enumC0908aa = this.f14103P;
            if (enumC0908aa != null) {
                jSONObject.put(AbstractC1141sa.f14628t, enumC0908aa.b());
            }
            EnumC0908aa enumC0908aa2 = this.f14104Q;
            if (enumC0908aa2 != null) {
                jSONObject.put(AbstractC1141sa.f14629u, enumC0908aa2.b());
                f14097U = (f14098V + 105) % 128;
            }
            ArrayList arrayList = this.f14099K;
            if (arrayList.size() > 0) {
                jSONObject.put(AbstractC1141sa.f14631w, new JSONArray((Collection) arrayList));
            }
            ArrayList arrayList2 = this.L;
            if (arrayList2.size() > 0) {
                jSONObject.put(AbstractC1141sa.f14634z, new JSONArray((Collection) arrayList2));
            }
            ArrayList arrayList3 = this.f14100M;
            if (arrayList3.size() > 0) {
                jSONObject.put(AbstractC1141sa.f14581A, new JSONArray((Collection) arrayList3));
            }
            ArrayList arrayList4 = this.f14101N;
            if (arrayList4.size() > 0) {
                jSONObject.put(AbstractC1141sa.f14633y, new JSONArray((Collection) arrayList4));
            }
            ArrayList arrayList5 = this.f14102O;
            if (arrayList5.size() > 0) {
                jSONObject.put(AbstractC1141sa.f14632x, new JSONArray((Collection) arrayList5));
            }
            if (this.f14105R.length() > 0) {
                f14098V = (f14097U + 35) % 128;
                jSONObject.putOpt(AbstractC1141sa.f14630v, this.f14105R.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONObject r0() {
        int i5 = (f14098V + 67) % 128;
        f14097U = i5;
        JSONObject jSONObject = this.f14105R;
        int i10 = i5 + 41;
        f14098V = i10 % 128;
        if (i10 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean s0() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f14099K
            int r0 = r0.size()
            if (r0 > 0) goto L37
            int r0 = Va.C0945d8.f14098V
            int r0 = r0 + 103
            int r1 = r0 % 128
            Va.C0945d8.f14097U = r1
            int r0 = r0 % 2
            java.util.ArrayList r1 = r3.L
            r2 = 0
            if (r0 == 0) goto L21
            int r0 = r1.size()
            r1 = 26
            int r1 = r1 / r2
            if (r0 > 0) goto L37
            goto L27
        L21:
            int r0 = r1.size()
            if (r0 > 0) goto L37
        L27:
            int r0 = Va.C0945d8.f14097U
            int r0 = r0 + 29
            int r0 = r0 % 128
            Va.C0945d8.f14098V = r0
            java.util.ArrayList r0 = r3.f14102O
            int r0 = r0.size()
            if (r0 <= 0) goto L38
        L37:
            r2 = 1
        L38:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0945d8.s0():java.lang.Boolean");
    }

    public final String t0() {
        int i5 = f14098V + 111;
        f14097U = i5 % 128;
        if (i5 % 2 == 0) {
            return this.f14105R.optString(AbstractC1141sa.f14633y);
        }
        this.f14105R.optString(AbstractC1141sa.f14633y);
        throw null;
    }

    public final String u0() {
        int i5 = f14097U + 39;
        f14098V = i5 % 128;
        if (i5 % 2 == 0) {
            this.f14105R.optString(AbstractC1141sa.f14581A);
            throw null;
        }
        String strOptString = this.f14105R.optString(AbstractC1141sa.f14581A);
        int i10 = f14097U + 83;
        f14098V = i10 % 128;
        if (i10 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    public final String v0() {
        int i5 = f14098V + 19;
        f14097U = i5 % 128;
        if (i5 % 2 != 0) {
            this.f14105R.optString(AbstractC1141sa.f14632x);
            throw null;
        }
        String strOptString = this.f14105R.optString(AbstractC1141sa.f14632x);
        f14098V = (f14097U + 27) % 128;
        return strOptString;
    }

    public final void w0(String str) throws JSONException {
        f14098V = (f14097U + 47) % 128;
        try {
            this.f14105R.put(AbstractC1141sa.f14581A, str);
            f14097U = (f14098V + 121) % 128;
        } catch (JSONException unused) {
        }
    }

    public final void x0(String str) throws JSONException {
        int i5 = f14098V + 109;
        f14097U = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                this.f14105R.put(AbstractC1141sa.f14631w, str);
            } else {
                this.f14105R.put(AbstractC1141sa.f14631w, str);
                int i10 = 6 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    public final String y0() {
        int i5 = f14097U + 63;
        f14098V = i5 % 128;
        if (i5 % 2 == 0) {
            this.f14105R.optString(AbstractC1141sa.f14631w);
            throw null;
        }
        String strOptString = this.f14105R.optString(AbstractC1141sa.f14631w);
        f14098V = (f14097U + 3) % 128;
        return strOptString;
    }

    public final String z0() {
        f14098V = (f14097U + 15) % 128;
        String strOptString = this.f14105R.optString(AbstractC1141sa.f14634z);
        f14098V = (f14097U + 107) % 128;
        return strOptString;
    }
}
