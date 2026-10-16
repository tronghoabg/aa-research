package Va;

import A7.C0237b0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.y7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1214y7 {
    public static final char[] k = {380, 399, 407, 409, 414, 363, 398, 374, 403, 413, 408, 412, 344, 395, 406, 420, 345, 397, 416, 419, 400, 410, 368, 415, 330, 376, 384, 417, 365, 404, 378, 418, 372, 382, 371, 367, 343, 396, 401};

    /* renamed from: l, reason: collision with root package name */
    public static int f14802l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f14803m = 1;

    /* renamed from: a, reason: collision with root package name */
    public C0999ha f14804a;

    /* renamed from: b, reason: collision with root package name */
    public C1203x8 f14805b;

    /* renamed from: c, reason: collision with root package name */
    public Z7 f14806c;

    /* renamed from: d, reason: collision with root package name */
    public Z0 f14807d;

    /* renamed from: e, reason: collision with root package name */
    public Ra f14808e;

    /* renamed from: f, reason: collision with root package name */
    public C1177v7 f14809f;

    /* renamed from: g, reason: collision with root package name */
    public C0237b0 f14810g;

    /* renamed from: h, reason: collision with root package name */
    public B7 f14811h;

    /* renamed from: i, reason: collision with root package name */
    public JSONObject f14812i;

    /* renamed from: j, reason: collision with root package name */
    public C0921ba f14813j;

    public static String A(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 129);
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static JSONObject B(C1214y7 c1214y7, Activity activity) throws JSONException {
        f14803m = (f14802l + 53) % 128;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC1141sa.f14606a, c1214y7.u().j());
            jSONObject.put(AbstractC1141sa.f14600U, c1214y7.u().n());
            jSONObject.put(AbstractC1141sa.f14601V, c1214y7.u().g());
            jSONObject.put(A("\ufffe\n\u0002\ufffe\u0000\u0011￫", ExpandableListView.getPackedPositionGroup(0L) + 7, 227 - ExpandableListView.getPackedPositionChild(0L), KeyEvent.normalizeMetaState(0) + 3, false).intern(), activity.getClass().getName());
        } catch (JSONException unused) {
            Ab.x(v((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), v(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0085\u0092\u0082\u009e¦\u0084\u0099\u008b\u0084\u008a\u009e\u0099\u0085\u0092\u008e\u0099§\u008b\u0089\u0085\u008e\u0082\u008c\u0092\u0099\u008c\u0084\u008c\u008c¤").intern());
        }
        f14802l = (f14803m + 71) % 128;
        return jSONObject;
    }

    public static /* synthetic */ void C(C1151t7 c1151t7, boolean z2) {
        f14802l = (f14803m + 109) % 128;
        i(c1151t7, z2);
        int i5 = f14803m + 119;
        f14802l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static boolean D(Activity activity, List list) {
        int i5 = f14802l + 99;
        f14803m = i5 % 128;
        if (i5 % 2 == 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            return true;
        }
        f14802l = (f14803m + 9) % 128;
        if (list.contains(activity.getClass().getName())) {
            return true;
        }
        int i10 = f14802l + 117;
        f14803m = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
        return false;
    }

    public static void i(AbstractC1205xa abstractC1205xa, boolean z2) {
        int i5 = f14802l + 109;
        f14803m = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                throw null;
            }
            if (!z2) {
                Cb.e(abstractC1205xa);
                return;
            }
            C1169v c1169v = new C1169v(16);
            c1169v.f14690d = abstractC1205xa;
            Cb.c(c1169v);
            int i10 = f14803m + 11;
            f14802l = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ boolean k(Activity activity, List list) {
        int i5 = f14803m + 109;
        f14802l = i5 % 128;
        if (i5 % 2 == 0) {
            return D(activity, list);
        }
        D(activity, list);
        throw null;
    }

    public static boolean l(String str) {
        f14803m = (f14802l + 113) % 128;
        boolean zEndsWith = str.endsWith(v(127 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u008a\u008a\u008e\u008f\u0092\u008d").intern());
        f14803m = (f14802l + 73) % 128;
        return zEndsWith;
    }

    public static C1138s7 n(C1100p7 c1100p7, C1100p7 c1100p72) {
        int i5 = f14802l;
        int i10 = i5 + 57;
        f14803m = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        C1138s7 c1138s7 = new C1138s7(10);
        c1138s7.f14569y = c1100p72;
        c1138s7.f14570z = c1100p7;
        f14803m = (i5 + 101) % 128;
        return c1138s7;
    }

    public static /* synthetic */ void s(C1214y7 c1214y7, String str, boolean z2, boolean z10, List list) {
        int i5 = f14803m + 21;
        f14802l = i5 % 128;
        int i10 = i5 % 2;
        c1214y7.j(str, z2, z10, list);
        if (i10 != 0) {
            throw null;
        }
        int i11 = f14802l + 39;
        f14803m = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static String v(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = k;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 298);
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

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC1141sa.f14606a, u().j());
            jSONObject.put(AbstractC1141sa.f14601V, u().g());
            jSONObject.put(AbstractC1141sa.f14600U, u().n());
        } catch (JSONException e7) {
            String strIntern = v((ViewConfiguration.getTapTimeout() >> 16) + 127, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A("ￂ\uffe7\u0014\u0014\u0011\u0014ￂ\u0005\u0014\u0007\u0003\u0016\u000b\u0010\tￂ\u0007\u0018\u0007\u0010\u0016ￂ\f\u0015\u0011\u0010ￜ", TextUtils.getCapsMode("", 0, 0) + 27, 223 - ExpandableListView.getPackedPositionGroup(0L), 1 - View.resolveSize(0, 0), false).intern());
            sb2.append(e7.getLocalizedMessage());
            Ab.x(strIntern, sb2.toString());
        }
        f14803m = (f14802l + 85) % 128;
        return jSONObject;
    }

    public final Ra b() {
        int i5 = f14802l + 47;
        f14803m = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f14808e;
        }
        throw null;
    }

    public final Z0 c() {
        int i5 = f14803m + 15;
        int i10 = i5 % 128;
        f14802l = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        f14803m = (i10 + 31) % 128;
        return this.f14807d;
    }

    public final Z7 d() {
        int i5 = (f14803m + 75) % 128;
        f14802l = i5;
        int i10 = i5 + 13;
        f14803m = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f14806c;
        }
        throw null;
    }

    public final C1203x8 e() {
        int i5 = (f14803m + 45) % 128;
        f14802l = i5;
        f14803m = (i5 + 91) % 128;
        return this.f14805b;
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u().o());
        sb2.append(v(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0091").intern());
        sb2.append(h().b());
        String string = sb2.toString();
        f14803m = (f14802l + 37) % 128;
        return string;
    }

    public final C1074n7 g(boolean z2) {
        C1074n7 c1074n7 = new C1074n7();
        c1074n7.L = this;
        c1074n7.f14423K = z2;
        int i5 = f14802l + 101;
        f14803m = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 50 / 0;
        }
        return c1074n7;
    }

    public final C0999ha h() {
        int i5 = f14803m + 87;
        f14802l = i5 % 128;
        if (i5 % 2 == 0) {
            return this.f14804a;
        }
        throw null;
    }

    public final void j(String str, boolean z2, boolean z10, List list) {
        C0932c8 c0932c8;
        C0999ha c0999ha = this.f14804a;
        try {
            c0999ha.getClass();
            C0999ha c0999ha2 = c0999ha;
            do {
                C0984g8 c0984g8 = (C0984g8) c0999ha2.f14263a;
                C0984g8.f14188i = (C0984g8.f14189j + 33) % 128;
                c0932c8 = (C0932c8) c0984g8.f14195f.get(str);
                if (c0932c8 != null) {
                    break;
                } else {
                    c0999ha2 = (C0999ha) c0999ha2.f14264b;
                }
            } while (c0999ha2 != null);
            if (c0932c8 != null) {
                String strB = c0932c8.b();
                C1126r8 c1126r8F = c0999ha.f(c0932c8.b());
                if (c1126r8F == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A("\u0002\u000f\u0005\r\n\u000f\b\uffc1\u0006\u0017\u0006\u000f\u0015\uffc1￦\u0013\u0013\u0010\u0013\uffc1\t", 21 - Color.argb(0, 0, 0, 0), 224 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetBefore("", 0) + 14, false).intern());
                    sb2.append(str);
                    new C1036k8(this, strB, sb2.toString()).d(f());
                    return;
                }
                int i5 = f14802l + 111;
                f14803m = i5 % 128;
                if (i5 % 2 == 0) {
                    c0932c8.c();
                    throw null;
                }
                if (z2 == c0932c8.c()) {
                    C0932c8.f14063d = (((C0932c8.f14063d + 121) % 128) + 109) % 128;
                    if (z10 == c0932c8.f14065b) {
                        int i10 = f14803m + 11;
                        f14802l = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 73 / 0;
                            if (Kb.u().t()) {
                                AbstractC0897a.J(f(), str);
                            }
                        } else if (Kb.u().t()) {
                            AbstractC0897a.J(f(), str);
                        }
                        c1126r8F.c(this.f14805b, this, list);
                    }
                }
            }
        } catch (Throwable th) {
            String strF = f();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(A("\u0002\u000f\u0005\r\n\u000f\b\uffc1\u0006\u0017\u0006\u000f\u0015\uffc1￦\u0013\u0013\u0010\u0013\uffc1\t", ExpandableListView.getPackedPositionChild(0L) + 22, 225 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - Color.blue(0), false).intern());
            sb3.append(str);
            AbstractC0897a.f(strF, sb3.toString(), th);
        }
    }

    public final C1113q7 m(boolean z2) {
        C1113q7 c1113q7 = new C1113q7(9);
        c1113q7.f14527z = this;
        c1113q7.f14526y = z2;
        int i5 = f14802l + 69;
        f14803m = i5 % 128;
        if (i5 % 2 != 0) {
            return c1113q7;
        }
        throw null;
    }

    public final void o(String str, JSONObject jSONObject) throws JSONException {
        boolean zEquals = str.equals(A("\ufff9￼\ufff7￼\u0001\u000b\b\u0004\ufff9\u0011�￼", 12 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0') + 234, 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), false).intern());
        B7 b72 = this.f14811h;
        if (zEquals) {
            C0963f0 c0963f0A = b72.a();
            c0963f0A.getClass();
            C0963f0.f14147g = (C0963f0.f14148h + 45) % 128;
            int iOptInt = jSONObject.optInt(AbstractC1141sa.f14612d);
            Eb eb2 = c0963f0A.f14149a;
            if (eb2 != null) {
                int i5 = C0963f0.f14148h + 19;
                C0963f0.f14147g = i5 % 128;
                if (i5 % 2 != 0) {
                    eb2.adDisplayed(jSONObject.optString(AbstractC1141sa.f14606a), ISAdQualityAdType.fromInt(iOptInt));
                    throw null;
                }
                eb2.adDisplayed(jSONObject.optString(AbstractC1141sa.f14606a), ISAdQualityAdType.fromInt(iOptInt));
            }
        } else if (str.equals(A("\ufff9�\u0006\t\r\uffff\ufffe\ufffb\ufffe", ((byte) KeyEvent.getModifierMetaStateMask()) + 10, (ViewConfiguration.getWindowTouchSlop() >> 8) + 231, Drawable.resolveOpacity(0, 0) + 7, false).intern())) {
            int i10 = f14803m + 91;
            f14802l = i10 % 128;
            if (i10 % 2 != 0) {
                b72.a().d(jSONObject);
                throw null;
            }
            b72.a().d(jSONObject);
        }
        int i11 = f14802l + 57;
        f14803m = i11 % 128;
        if (i11 % 2 == 0) {
            Ab.g0(a(), jSONObject);
            throw null;
        }
        JSONObject jSONObjectA = a();
        Ab.g0(jSONObjectA, jSONObject);
        int i12 = f14803m + 37;
        f14802l = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        JSONObject jSONObjectU = Ab.u(jSONObjectA);
        if (str.equals(AbstractC1141sa.f14594O)) {
            f14803m = (f14802l + 51) % 128;
            C0963f0 c0963f0A2 = b72.a();
            c0963f0A2.getClass();
            C0963f0.f14148h = (C0963f0.f14147g + 19) % 128;
            c0963f0A2.f(C0963f0.g((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 1847458203, (-10) - KeyEvent.keyCodeFromString(""), (-1541941282) - (Process.myPid() >> 22), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), jSONObjectU);
            C0963f0.f14148h = (C0963f0.f14147g + 3) % 128;
            return;
        }
        if (str.equals(AbstractC1141sa.f14595P)) {
            C0963f0 c0963f0A3 = b72.a();
            c0963f0A3.getClass();
            C0963f0.f14148h = (C0963f0.f14147g + 35) % 128;
            c0963f0A3.f(C0963f0.i("࠲㭉戭婦ࢉꗞᴟ脸\uf6ad嚯\ue555\uf235", TextUtils.lastIndexOf("", '0') + 12).intern(), jSONObjectU);
            int i13 = C0963f0.f14147g + 109;
            C0963f0.f14148h = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (str.equals(AbstractC1141sa.f14593N)) {
            int i14 = f14802l + 7;
            f14803m = i14 % 128;
            if (i14 % 2 != 0) {
                b72.a().h(jSONObjectU);
                return;
            } else {
                b72.a().h(jSONObjectU);
                throw null;
            }
        }
        if (str.equals(AbstractC1141sa.f14592M)) {
            f14802l = (f14803m + 7) % 128;
            C0963f0 c0963f0A4 = b72.a();
            c0963f0A4.getClass();
            C0963f0.f14147g = (C0963f0.f14148h + 85) % 128;
            c0963f0A4.f(C0963f0.i("࠲㭉戭婦쪑踹稧飞ᧆ폠", 10 - Color.argb(0, 0, 0, 0)).intern(), jSONObjectU);
            int i15 = C0963f0.f14148h + 113;
            C0963f0.f14147g = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 47 / 0;
                return;
            }
            return;
        }
        if (str.equals(AbstractC1141sa.f14596Q)) {
            int i17 = f14802l + 43;
            f14803m = i17 % 128;
            if (i17 % 2 != 0) {
                b72.a().b(jSONObjectU);
                return;
            } else {
                b72.a().b(jSONObjectU);
                throw null;
            }
        }
        if (!(!str.equals(AbstractC1141sa.f14598S))) {
            C0963f0 c0963f0A5 = b72.a();
            c0963f0A5.getClass();
            C0963f0.f14147g = (C0963f0.f14148h + 25) % 128;
            c0963f0A5.f(C0963f0.i("࠲㭉戭婦粶㎲Ầ爬淈겋ࢉꗞꙴ毒\uef0c⊩", View.MeasureSpec.getSize(0) + 15).intern(), jSONObjectU);
            C0963f0.f14147g = (C0963f0.f14148h + 89) % 128;
            return;
        }
        if (!str.equals(AbstractC1141sa.f14597R)) {
            b72.a().f(str, jSONObject);
            return;
        }
        int i18 = f14803m + 121;
        f14802l = i18 % 128;
        if (i18 % 2 == 0) {
            b72.a().a(jSONObjectU);
        } else {
            b72.a().a(jSONObjectU);
            throw null;
        }
    }

    public final C1100p7 p(boolean z2) {
        C1100p7 c1100p7 = new C1100p7(10);
        c1100p7.f14478z = this;
        c1100p7.f14477y = z2;
        f14803m = (f14802l + 105) % 128;
        return c1100p7;
    }

    public final C1126r8 q(String str) {
        int i5 = f14803m;
        f14802l = (i5 + 7) % 128;
        if (str == null) {
            return null;
        }
        int i10 = i5 + 5;
        f14802l = i10 % 128;
        if (i10 % 2 == 0) {
            return h().f(str);
        }
        int i11 = 57 / 0;
        return h().f(str);
    }

    public final ArrayList r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (l(str)) {
                String strW = w(str);
                if (strW != null) {
                    arrayList.add(strW);
                    f14802l = (f14803m + 59) % 128;
                }
            } else {
                arrayList.add(str);
                f14803m = (f14802l + 23) % 128;
            }
        }
        int i5 = f14803m + 81;
        f14802l = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 66 / 0;
        }
        return arrayList;
    }

    public final void t(String str, List list) {
        C1164u7 c1164u7 = new C1164u7(0);
        c1164u7.f14663f = this;
        c1164u7.f14661d = str;
        c1164u7.f14662e = list;
        Cb.j(c1164u7);
        C1164u7 c1164u72 = new C1164u7(2);
        c1164u72.f14663f = this;
        c1164u72.f14661d = str;
        c1164u72.f14662e = list;
        Cb.g(c1164u72);
        C1164u7 c1164u73 = new C1164u7(1);
        c1164u73.f14663f = this;
        c1164u73.f14661d = str;
        c1164u73.f14662e = list;
        i(c1164u73, true);
        int i5 = f14802l + 105;
        f14803m = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 55 / 0;
        }
    }

    public final B7 u() {
        int i5 = (f14803m + 83) % 128;
        f14802l = i5;
        int i10 = i5 + 123;
        f14803m = i10 % 128;
        int i11 = i10 % 2;
        B7 b72 = this.f14811h;
        if (i11 == 0) {
            int i12 = 73 / 0;
        }
        return b72;
    }

    public final String w(String str) {
        Class clsS0;
        int i5 = f14802l + 23;
        f14803m = i5 % 128;
        if (i5 % 2 == 0) {
            clsS0 = c().s0(AbstractC1104pb.j0(str, v(42 / (ViewConfiguration.getDoubleTapTimeout() << 97), "\u008a\u008a\u008e\u008f\u0092\u008d").intern()));
            if (clsS0 == null) {
                return null;
            }
        } else {
            clsS0 = c().s0(AbstractC1104pb.j0(str, v((ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u008a\u008a\u008e\u008f\u0092\u008d").intern()));
            if (clsS0 == null) {
                return null;
            }
        }
        f14803m = (f14802l + 3) % 128;
        return clsS0.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0132 A[PHI: r4
  0x0132: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v11 java.lang.Object) binds: [B:40:0x0130, B:37:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b A[PHI: r4
  0x019b: PHI (r4v7 java.lang.Object) = (r4v3 java.lang.Object), (r4v11 java.lang.Object) binds: [B:40:0x0130, B:37:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject x(org.json.JSONObject r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1214y7.x(org.json.JSONObject):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r11, Va.C0997h8 r12) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1214y7.y(java.lang.String, Va.h8):void");
    }

    public final Context z() {
        f14803m = (f14802l + 75) % 128;
        B7 b7U = u();
        b7U.getClass();
        int i5 = (B7.f13229i + 13) % 128;
        B7.f13228h = i5;
        int i10 = i5 + 109;
        B7.f13229i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        f14803m = (f14802l + 95) % 128;
        return b7U.f13234e;
    }
}
