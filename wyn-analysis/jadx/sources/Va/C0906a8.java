package Va;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.a8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0906a8 extends AbstractC1104pb implements Q6 {

    /* renamed from: Q, reason: collision with root package name */
    public static final char[] f13971Q = {301, 299, 314, 263, 298, 316, 312, 303, 313, 271, 282, 319, 310, 266, 283, 306, 268, 308, 295, 281, 309, 315, 297, 302, 300, 272, 267, 230, 318, 307, 237};

    /* renamed from: R, reason: collision with root package name */
    public static int f13972R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static int f13973S = 1;

    /* renamed from: K, reason: collision with root package name */
    public String f13974K;
    public W9 L;

    /* renamed from: M, reason: collision with root package name */
    public String f13975M;

    /* renamed from: N, reason: collision with root package name */
    public String f13976N;

    /* renamed from: O, reason: collision with root package name */
    public final JSONObject f13977O = new JSONObject();

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f13978P = new ArrayList();

    public static String o(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 13209)) ^ ((c11 >>> 5) + 6230)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 21660) ^ ((c12 + i11) ^ ((c12 << 4) + 46934))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String v0(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13971Q;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 198);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c5  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r22, java.lang.String r23, java.util.ArrayList r24, Va.Ra r25, Va.C1203x8 r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0906a8.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    public final JSONObject q0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f13974K;
            if (str != null) {
                int i5 = (f13972R + 95) % 128;
                f13973S = i5;
                if (this.L != null) {
                    int i10 = i5 + 63;
                    f13972R = i10 % 128;
                    if (i10 % 2 != 0) {
                        jSONObject.putOpt(AbstractC1141sa.f14621m, str);
                        jSONObject.putOpt(AbstractC1141sa.f14622n, Integer.valueOf(this.L.b()));
                        int i11 = 73 / 0;
                    } else {
                        jSONObject.putOpt(AbstractC1141sa.f14621m, str);
                        jSONObject.putOpt(AbstractC1141sa.f14622n, Integer.valueOf(this.L.b()));
                    }
                }
            }
            jSONObject.putOpt(AbstractC1141sa.f14624p, this.f13975M);
            jSONObject.putOpt(AbstractC1141sa.f14625q, this.f13976N);
            ArrayList arrayList = this.f13978P;
            if (arrayList.size() > 0) {
                jSONObject.putOpt(AbstractC1141sa.f14631w, new JSONArray((Collection) arrayList));
            }
            JSONObject jSONObject2 = this.f13977O;
            if (jSONObject2.length() > 0) {
                f13972R = (f13973S + 77) % 128;
                jSONObject.putOpt(AbstractC1141sa.f14623o, jSONObject2.toString());
            }
            f13973S = (f13972R + 103) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean r0() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f13974K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L2d
            java.lang.String r0 = r2.f13975M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2d
            int r0 = Va.C0906a8.f13973S
            int r0 = r0 + 107
            int r0 = r0 % 128
            Va.C0906a8.f13972R = r0
            java.lang.String r0 = r2.f13976N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2d
            java.util.ArrayList r0 = r2.f13978P
            int r0 = r0.size()
            if (r0 <= 0) goto L2b
            goto L2d
        L2b:
            r1 = 0
            goto L35
        L2d:
            int r0 = Va.C0906a8.f13973S
            int r0 = r0 + 45
            int r0 = r0 % 128
            Va.C0906a8.f13972R = r0
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0906a8.r0():java.lang.Boolean");
    }

    public final String s0() {
        int i5 = f13973S + 121;
        f13972R = i5 % 128;
        int i10 = i5 % 2;
        JSONObject jSONObject = this.f13977O;
        if (i10 != 0) {
            jSONObject.optString(AbstractC1141sa.f14631w);
            throw null;
        }
        String strOptString = jSONObject.optString(AbstractC1141sa.f14631w);
        int i11 = f13972R + 11;
        f13973S = i11 % 128;
        if (i11 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    public final String t0() {
        int i5 = f13973S + 53;
        f13972R = i5 % 128;
        int i10 = i5 % 2;
        JSONObject jSONObject = this.f13977O;
        if (i10 != 0) {
            jSONObject.optString(AbstractC1141sa.f14625q);
            throw null;
        }
        String strOptString = jSONObject.optString(AbstractC1141sa.f14625q);
        int i11 = f13973S + 9;
        f13972R = i11 % 128;
        if (i11 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    public final void u0(String str) throws JSONException {
        int i5 = f13973S + 45;
        f13972R = i5 % 128;
        int i10 = i5 % 2;
        JSONObject jSONObject = this.f13977O;
        try {
            if (i10 != 0) {
                jSONObject.put(AbstractC1141sa.f14624p, str);
                throw null;
            }
            jSONObject.put(AbstractC1141sa.f14624p, str);
            int i11 = f13972R + 29;
            f13973S = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public final void w0(List list) {
        int i5 = f13973S + 67;
        f13972R = i5 % 128;
        if (i5 % 2 != 0) {
            list.iterator();
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i10 = f13973S + 65;
            f13972R = i10 % 128;
            if (i10 % 2 != 0) {
                x0((String) it.next());
                int i11 = 18 / 0;
            } else {
                x0((String) it.next());
            }
            f13973S = (f13972R + 81) % 128;
        }
    }

    public final void x0(String str) {
        if (!(!TextUtils.isEmpty(str))) {
            return;
        }
        f13973S = (f13972R + 121) % 128;
        ArrayList arrayList = this.f13978P;
        if (arrayList.contains(str)) {
            return;
        }
        f13972R = (f13973S + 43) % 128;
        arrayList.add(str);
        f13973S = (f13972R + 97) % 128;
    }
}
