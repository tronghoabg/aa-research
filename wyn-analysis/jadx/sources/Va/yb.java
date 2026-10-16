package Va;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class yb implements InterfaceC1129rb {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14817b = {659205437, 560191056, 2017656382, 178766946, 639343202, -1415064690, 562999288, -235066060, 1400637773, -1406106528, 2146955173, 950498675, 584990467, 1403111893, 1858124064, -1578880964, -2112822686, 1096100110};

    /* renamed from: c, reason: collision with root package name */
    public static int f14818c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14819d = 1;

    /* renamed from: a, reason: collision with root package name */
    public Object f14820a;

    public static String a(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14817b.clone();
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

    @Override // Va.InterfaceC1129rb
    public Object n(String str, JSONObject jSONObject) {
        int i5 = f14819d + 9;
        f14818c = i5 % 128;
        int i10 = i5 % 2;
        C0919b8 c0919b8 = (C0919b8) this.f14820a;
        try {
            if (i10 != 0) {
                jSONObject.optString(str);
                boolean z2 = jSONObject.opt(str) instanceof String;
                throw null;
            }
            String strOptString = jSONObject.optString(str);
            if (jSONObject.opt(str) instanceof String) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new int[]{-2091271667, -669131752}).intern());
                sb2.append(strOptString);
                sb2.append(a(-ExpandableListView.getPackedPositionChild(0L), new int[]{-2091271667, -669131752}).intern());
                strOptString = sb2.toString();
            }
            AbstractC1215y8 abstractC1215y8S = new C1114q8().s(AbstractC1049l8.c(C0919b8.g(c0919b8), strOptString, strOptString));
            int i11 = f14818c + 47;
            f14819d = i11 % 128;
            if (i11 % 2 != 0) {
                return abstractC1215y8S;
            }
            throw null;
        } catch (Throwable th) {
            String strG = C0919b8.g(c0919b8);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a(14 - KeyEvent.keyCodeFromString(""), new int[]{2077364327, -136366831, 1981161830, -1723167285, 1916011722, 343318407, 1159548129, -250824140}).intern());
            sb3.append(str);
            sb3.append(a(TextUtils.indexOf((CharSequence) "", '0') + 9, new int[]{1105779561, -995860232, 638393935, 481795143}).intern());
            sb3.append(jSONObject.optString(str));
            AbstractC0897a.f(strG, sb3.toString(), th);
            return null;
        }
    }
}
