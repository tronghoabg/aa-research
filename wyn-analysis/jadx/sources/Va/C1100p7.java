package Va;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: Va.p7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1100p7 extends AbstractC0897a {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f14474A = {797893669, -129654297, 1328694585, -844638046, 272018886, 499355616, -1782812695, -323544516, 951103988, 164402079, 720967302, -1662926282, 507421653, -719118971, -1377044474, -1978897695, -967019884, -1616632234};

    /* renamed from: B, reason: collision with root package name */
    public static int f14475B = 0;

    /* renamed from: C, reason: collision with root package name */
    public static int f14476C = 1;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f14477y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ C1214y7 f14478z;

    public static String t(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14474A.clone();
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

    @Override // Va.AbstractC0897a
    public final void C(JSONObject jSONObject, View view, Vb vb2, Activity activity) {
        f14475B = (f14476C + 57) % 128;
        M(t(19 - TextUtils.indexOf((CharSequence) "", '0', 0), new int[]{1420922140, -1291994676, -1804502943, -1819155862, -1383974832, 2090661715, 1721694308, -678330104, 1799733033, 939715536}).intern(), jSONObject, view, vb2, activity);
        f14475B = (f14476C + 59) % 128;
    }

    @Override // Va.AbstractC0897a
    public final void D(JSONObject jSONObject, View view, Activity activity) {
        f14476C = (f14475B + 45) % 128;
        M(t(View.MeasureSpec.makeMeasureSpec(0, 0) + 11, new int[]{759918522, -2013881012, 758725621, 921637035, 344729405, -976580815}).intern(), jSONObject, view, null, activity);
        int i5 = f14476C + 35;
        f14475B = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 40 / 0;
        }
    }

    @Override // Va.AbstractC0897a
    public final void K(JSONObject jSONObject, View view, Activity activity) {
        int i5 = f14475B + 83;
        f14476C = i5 % 128;
        if (i5 % 2 == 0) {
            M(t(119 >> (Process.myTid() / 36), new int[]{354189052, -2111251030, -391662391, -1754159239, 1656513515, 2098796337}).intern(), jSONObject, view, null, activity);
        } else {
            M(t((Process.myTid() >> 22) + 11, new int[]{354189052, -2111251030, -391662391, -1754159239, 1656513515, 2098796337}).intern(), jSONObject, view, null, activity);
        }
        f14475B = (f14476C + 3) % 128;
    }

    public final void M(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t(Drawable.resolveOpacity(0, 0) + 15, new int[]{-394966916, 997166518, 509359631, 918240162, -13412473, -223311310, -221071911, 1048957571}).intern());
        sb2.append(str);
        C1214y7.s(this.f14478z, sb2.toString(), this.f14477y, false, Arrays.asList(jSONObject, view, obj, activity));
        int i5 = f14475B + 115;
        f14476C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void a(JSONObject jSONObject, View view, Activity activity) {
        f14475B = (f14476C + 53) % 128;
        M(t(8 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{-226545538, 2095782002, -984131835, -997814949}).intern(), jSONObject, view, null, activity);
        int i5 = f14475B + 65;
        f14476C = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 86 / 0;
        }
    }

    @Override // Va.AbstractC0897a
    public final void g(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Activity activity) {
        int i5 = f14476C + 121;
        f14475B = i5 % 128;
        if (i5 % 2 != 0) {
            M(t(9 >> (ViewConfiguration.getMinimumFlingVelocity() % 62), new int[]{-226545538, 2095782002, -1727207343, 409626914, -1366058482, -1548451407}).intern(), jSONObject, view, interfaceC0950e0, activity);
        } else {
            M(t(9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new int[]{-226545538, 2095782002, -1727207343, 409626914, -1366058482, -1548451407}).intern(), jSONObject, view, interfaceC0950e0, activity);
        }
        int i10 = f14476C + 67;
        f14475B = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void h(JSONObject jSONObject, View view, Object obj) {
        int i5 = f14476C + 77;
        f14475B = i5 % 128;
        int i10 = i5 % 2;
        D(jSONObject, view, (Activity) obj);
        if (i10 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void i(JSONObject jSONObject, View view, Activity activity) {
        int i5 = f14475B + 93;
        f14476C = i5 % 128;
        if (i5 % 2 == 0) {
            M(t(84 >>> (TypedValue.complexToFraction(1, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 2.0f ? 1 : (TypedValue.complexToFraction(1, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 2.0f ? 0 : -1)), new int[]{1943555526, 1771251122, -960699496, 611815510, 640645146, 1729154342}).intern(), jSONObject, view, null, activity);
        } else {
            M(t((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12, new int[]{1943555526, 1771251122, -960699496, 611815510, 640645146, 1729154342}).intern(), jSONObject, view, null, activity);
        }
        int i10 = f14475B + 45;
        f14476C = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void k(JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        f14475B = (f14476C + 29) % 128;
        a(jSONObject, view, (Activity) callback);
        f14475B = (f14476C + 123) % 128;
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void m(JSONObject jSONObject, Object obj, Object obj2) {
        f14476C = (f14475B + 67) % 128;
        i(jSONObject, (View) obj, (Activity) obj2);
        f14476C = (f14475B + 51) % 128;
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void n(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Object obj) {
        int i5 = f14475B + 103;
        f14476C = i5 % 128;
        int i10 = i5 % 2;
        y(jSONObject, view, interfaceC0950e0, (Activity) obj);
        if (i10 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void r(JSONObject jSONObject, View view, Object obj) {
        f14476C = (f14475B + 49) % 128;
        z(jSONObject, view, (Activity) obj);
        int i5 = f14475B + 61;
        f14476C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void s(JSONObject jSONObject, Object obj, InterfaceC0950e0 interfaceC0950e0, Object obj2) {
        int i5 = f14475B + 93;
        f14476C = i5 % 128;
        int i10 = i5 % 2;
        g(jSONObject, (View) obj, interfaceC0950e0, (Activity) obj2);
        if (i10 == 0) {
            throw null;
        }
        int i11 = f14476C + 33;
        f14475B = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void v(JSONObject jSONObject, View view, Object obj) {
        int i5 = f14476C + 91;
        f14475B = i5 % 128;
        int i10 = i5 % 2;
        K(jSONObject, view, (Activity) obj);
        if (i10 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void w(JSONObject jSONObject, View view, Vb vb2, Object obj) {
        int i5 = f14476C + 67;
        f14475B = i5 % 128;
        int i10 = i5 % 2;
        C(jSONObject, view, vb2, (Activity) obj);
        if (i10 != 0) {
            throw null;
        }
        f14475B = (f14476C + 41) % 128;
    }

    @Override // Va.AbstractC0897a
    public final void y(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Activity activity) {
        f14475B = (f14476C + 25) % 128;
        M(t((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, new int[]{-226545538, 2095782002, -1727207343, 409626914, -492986523, 498244027, 699517167, 1425143628}).intern(), jSONObject, view, interfaceC0950e0, activity);
        int i5 = f14476C + 41;
        f14475B = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void z(JSONObject jSONObject, View view, Activity activity) {
        int i5 = f14476C + 15;
        f14475B = i5 % 128;
        if (i5 % 2 != 0) {
            M(t(22 << Color.blue(0), new int[]{354189052, -2111251030, -391662391, -1754159239, 1635758796, 2088182675, 863286248, 1506006629}).intern(), jSONObject, view, null, activity);
        } else {
            M(t(Color.blue(0) + 16, new int[]{354189052, -2111251030, -391662391, -1754159239, 1635758796, 2088182675, 863286248, 1506006629}).intern(), jSONObject, view, null, activity);
        }
        int i10 = f14476C + 85;
        f14475B = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }
}
