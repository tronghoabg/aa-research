package Va;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class La extends Ba {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13515f = {-701378621, 51127220, -1854204131, -457603715, -356722085, -895065645, -1976854722, 2081268625, 1664203258, -945108597, -171207155, -1975572851, -141354845, -890066747, 234644505, -1916329099, 1898763983, 1399092860};

    /* renamed from: g, reason: collision with root package name */
    public static int f13516g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13517h = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1092p f13519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0935cb f13520e;

    public La(C0935cb c0935cb, int i5, C1092p c1092p) {
        this.f13520e = c0935cb;
        this.f13518c = i5;
        this.f13519d = c1092p;
    }

    public static String d(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13515f.clone();
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

    @Override // Va.Ba
    public final void a(Throwable th) {
        super.a(th);
        C1169v c1169v = new C1169v(17);
        c1169v.f14690d = this;
        Cb.g(c1169v);
        f13516g = (f13517h + 1) % 128;
    }

    @Override // Va.Ba
    public final void c() throws JSONException {
        ArrayList arrayList = new ArrayList();
        C0935cb c0935cb = this.f13520e;
        Ra raO = C0935cb.o(c0935cb);
        String strU = C0935cb.u(c0935cb, d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, new int[]{-1156032747, 1931588609}).intern());
        raO.getClass();
        int i5 = Ra.f13661d + 73;
        Ra.f13660c = i5 % 128;
        int i10 = i5 % 2;
        int i11 = this.f13518c;
        C1013ib c1013ib = (C1013ib) raO.f13665a;
        if (i10 != 0) {
            c1013ib.b(i11, strU);
            throw null;
        }
        for (String str : c1013ib.b(i11, strU).values()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.add(new Sa(jSONObject.getJSONObject(d((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 7, new int[]{-1049145586, 1722662073, -1358650678, -365617964}).intern()), jSONObject.optString(d((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, new int[]{1992483484, -1010810066}).intern())));
                f13516g = (f13517h + 31) % 128;
            } catch (Exception unused) {
                String strI = C0935cb.i(c0935cb);
                String strIntern = d(KeyEvent.keyCodeFromString("") + 12, new int[]{969310401, -1198912187, -146951497, -1642809952, 2012184290, 1578198339}).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d(45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new int[]{-909729276, 1091674575, 96175690, -1294665438, -1427081089, -524714779, -1339859938, -280476030, 816289866, -1936470675, 877408850, 1586393204, -1962440324, -812414851, 1677493388, 1604959400, -619281872, -1070346633, -544346021, -362669896, 399858423, 271027824}).intern());
                sb2.append(str);
                Ab.n(strI, strIntern, sb2.toString(), true);
            }
        }
        C1206y c1206y = new C1206y(18);
        c1206y.f14799e = this;
        c1206y.f14798d = arrayList;
        Cb.g(c1206y);
        f13517h = (f13516g + 61) % 128;
    }
}
