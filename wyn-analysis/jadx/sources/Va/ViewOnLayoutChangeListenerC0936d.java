package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: Va.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0936d extends Pb implements View.OnLayoutChangeListener, InterfaceC0987gb {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f14084n = {1878297906, -1226617177, -571530587, 1016795243, 455023386, 371462824, 472464473, -1011257313, 1551789801, -1371825369, 2065371415, -2118655947, -918875199, 1621952738, 141078768, -744116610, 2096663244, -203981541};

    /* renamed from: o, reason: collision with root package name */
    public static int f14085o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f14086p = 1;
    public Class k;

    /* renamed from: l, reason: collision with root package name */
    public WeakHashMap f14087l;

    /* renamed from: m, reason: collision with root package name */
    public C0923c f14088m;

    public static View D(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f14085o = (f14086p + 77) % 128;
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            f14086p = (f14085o + 53) % 128;
            View childAt = viewGroup.getChildAt(i5);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View viewD = D(childAt, cls);
            if (viewD != null) {
                f14086p = (f14085o + 87) % 128;
                return viewD;
            }
        }
        return null;
    }

    public static View F(View view, String str) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i5 = (f14085o + 101) % 128;
        f14086p = i5;
        ViewGroup viewGroup = (ViewGroup) view;
        f14085o = (i5 + 79) % 128;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getClass().getName().startsWith(str)) {
                f14085o = (f14086p + 97) % 128;
                return childAt;
            }
            View viewF = F(childAt, str);
            if (viewF != null) {
                return viewF;
            }
        }
        return null;
    }

    public static String G(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14084n.clone();
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

    @Override // Va.Pb
    public final Lb A() {
        int i5 = f14085o;
        int i10 = i5 + 67;
        f14086p = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i11 = i5 + 41;
        f14086p = i11 % 128;
        if (i11 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // Va.Pb
    public final void B(Object obj, ArrayList arrayList) {
        ArrayList arrayList2;
        String strD;
        ArrayList arrayList3;
        Class<WebView> cls;
        boolean z2;
        boolean z10;
        List list;
        int i5 = f14085o;
        f14086p = (i5 + 21) % 128;
        View view = (View) obj;
        int i10 = i5 + 125;
        f14086p = i10 % 128;
        if (i10 % 2 == 0) {
            strD = C0923c.d(this.f14088m);
            arrayList3 = this.f14088m.k;
            cls = WebView.class;
            z2 = true;
            z10 = false;
            list = null;
            arrayList2 = arrayList;
        } else {
            arrayList2 = arrayList;
            strD = C0923c.d(this.f14088m);
            arrayList3 = this.f14088m.k;
            cls = WebView.class;
            z2 = true;
            z10 = false;
            list = null;
        }
        Bb.d(view, cls, strD, z2, z10, list, arrayList3, arrayList2);
        int i11 = (f14085o + 117) % 128;
        f14086p = i11;
        f14085o = (i11 + 93) % 128;
    }

    @Override // Va.Pb
    public final ViewOnLayoutChangeListenerC0910b C() {
        ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = new ViewOnLayoutChangeListenerC0910b(0);
        f14085o = (f14086p + 107) % 128;
        return viewOnLayoutChangeListenerC0910b;
    }

    public final void E(View view) {
        int i5 = f14085o + 91;
        f14086p = i5 % 128;
        int i10 = i5 % 2;
        WeakHashMap weakHashMap = this.f14087l;
        if (i10 == 0) {
            weakHashMap.containsKey(view);
            throw null;
        }
        if (weakHashMap.containsKey(view)) {
            return;
        }
        weakHashMap.put(view, Boolean.TRUE);
        x(Integer.toHexString(view.hashCode()), new JSONObject(), view);
        f14086p = (f14085o + 41) % 128;
    }

    @Override // Va.InterfaceC0987gb
    public final void a(View view) {
        f14086p = (f14085o + 83) % 128;
        View viewD = D(view, this.k);
        if (viewD != null) {
            int i5 = f14085o + 65;
            f14086p = i5 % 128;
            if (i5 % 2 != 0) {
                E(viewD);
                return;
            } else {
                E(viewD);
                throw null;
            }
        }
        if (TextUtils.isEmpty(C0923c.b(this.f14088m))) {
            return;
        }
        f14085o = (f14086p + 111) % 128;
        View viewF = F(view, C0923c.b(this.f14088m));
        if (viewF != null) {
            f14085o = (f14086p + 15) % 128;
            viewF.addOnLayoutChangeListener(this);
            f14086p = (f14085o + 53) % 128;
        }
    }

    @Override // Va.InterfaceC0987gb
    public final void c(View view) {
        View viewD = D(view, this.k);
        if (viewD != null) {
            f14085o = (f14086p + 67) % 128;
            if (this.f14087l.remove(viewD) != null) {
                y(view);
            }
        }
        int i5 = f14086p + 121;
        f14085o = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 32 / 0;
        }
    }

    @Override // Va.Mb
    public final void j(JSONObject jSONObject) {
        C0923c c0923c = new C0923c();
        String strOptString = jSONObject.optString(C0923c.c(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "猏獸齰ᠠ\u0ad6㺞浸䱫䨽룋뺾烺\ue893⍤ﰡ曣骩\uf16c⸷ᓽ䒿䝇怇싆\uf6beᕅ").intern());
        int i5 = (C0923c.f14048p + 87) % 128;
        C0923c.f14047o = i5;
        c0923c.f14050m = strOptString;
        C0923c.f14048p = (i5 + 65) % 128;
        String strOptString2 = jSONObject.optString(C0923c.c(ViewConfiguration.getScrollBarFadeDuration() >> 16, "\udc43\udc35ꊞ凡셄釸傓熉ϭ獈\uf778뭉䟀ẩ뗵굎㗎").intern());
        int i10 = C0923c.f14048p + 43;
        C0923c.f14047o = i10 % 128;
        if (i10 % 2 != 0) {
            c0923c.f14049l = strOptString2;
            throw null;
        }
        c0923c.f14049l = strOptString2;
        String strOptString3 = jSONObject.optString(C0923c.a(ImageFormat.getBitsPerPixel(0) + 27612, "\uf045鮏⟱돁強\ueb06睁ʡ꺈㫱웫刮︔詌ᖦꆘ").intern());
        int i11 = (C0923c.f14047o + 109) % 128;
        C0923c.f14048p = i11;
        c0923c.f14051n = strOptString3;
        int i12 = i11 + 97;
        C0923c.f14047o = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        c0923c.f13580a = jSONObject.optString(C0923c.c(1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "ᰉᱣ\uecb8ઃᎂ冸ậ㾵墵ꆀ갫榗螚傯").intern());
        c0923c.f13582c = false;
        c0923c.f13585f = !TextUtils.isEmpty(jSONObject.optString(C0923c.c(TextUtils.getTrimmedLength(""), "ᰉᱣ\uecb8ઃᎂ冸ậ㾵墵ꆀ갫榗螚傯").intern())) || jSONObject.optBoolean(C0923c.a(36251 - (ViewConfiguration.getScrollBarSize() >> 8), "\uf040緝\ueb66墳옼㑐ꇁ⽡鲈\u0a31硸\ue5f0匘삏両뱔").intern()) || jSONObject.optBoolean(C0923c.a(TextUtils.lastIndexOf("", '0', 0) + 10428, "\uf040\ud8fdꄦ詓劼㯰Д\ued40떟黉朖すᢲ\ue126쩦銥篫䐪").intern());
        c0923c.f13586g = jSONObject.optBoolean(C0923c.a(36251 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\uf040緝\ueb66墳옼㑐ꇁ⽡鲈\u0a31硸\ue5f0匘삏両뱔").intern());
        c0923c.f13587h = jSONObject.optBoolean(C0923c.c(KeyEvent.keyCodeFromString(""), "\uf5f5\uf580䵜अ쇯롵뽓鹑嬚珃꾜믐湏\uf14c").intern());
        c0923c.f13581b = TextUtils.isEmpty(jSONObject.optString(C0923c.a(63977 - (ViewConfiguration.getTouchSlop() >> 8), "\uf040ম\u038bᷞ៣ᇝ⬥┃㼅").intern())) ? null : Arrays.asList(jSONObject.optString(C0923c.a(63977 - Drawable.resolveOpacity(0, 0), "\uf040ম\u038bᷞ៣ᇝ⬥┃㼅").intern()).split(C0923c.c((-16777216) - Color.rgb(0, 0, 0), "ᥰᥜ뢪ꄿ䳿").intern()));
        c0923c.f13583d = jSONObject.optBoolean(C0923c.a(4001 - Color.blue(0), "\uf040\uffe7\uef12\ude9c컐빦궒鴡赞糮氖宮䯍").intern(), true);
        c0923c.f13584e = false;
        c0923c.f13588i = jSONObject.optBoolean(C0923c.c(ViewConfiguration.getPressedStateDuration() >> 16, "캃컮갾ퟤ뱞茒帳缵藬็煴왐唺ဵ㏫큎✊숽\ue1f3ꉗ蘿").intern());
        c0923c.f13589j = jSONObject.optBoolean(C0923c.c(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "얢엋캈歍즹蠴㲽ᶛ㥚箍췁뎌带").intern());
        ArrayList arrayListI = Ab.i(jSONObject.optJSONArray(C0923c.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5172, "\uf043\ue46f\ud836쳛ꂊ钞襨紙凊䖐㦤\u2e76ȴ").intern()));
        if (arrayListI != null) {
            c0923c.k = arrayListI;
        }
        this.f13616j = c0923c;
        this.f14088m = c0923c;
        try {
            int i13 = C0923c.f14048p;
            String str = c0923c.f14049l;
            C0923c.f14047o = (i13 + 111) % 128;
            this.k = Class.forName(str);
            int i14 = (f14085o + 67) % 128;
            f14086p = i14;
            f14085o = (i14 + 67) % 128;
            Za.n().p(this);
            int i15 = f14085o + 39;
            f14086p = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
        } catch (ClassNotFoundException e7) {
            String strIntern = G((-16777197) - Color.rgb(0, 0, 0), new int[]{-309412633, 1023172094, -1533480888, -2100515236, 1488542177, 233447488, -1862095654, -1463384731, 1230305435, -672575845}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(G(TextUtils.indexOf("", "", 0) + 31, new int[]{-422206219, 667418301, 912841165, -1719601002, -1609181823, 1311551507, -53925952, 251638534, -1307013793, -106614965, -213606665, 1263136232, 1218919679, 1240503722, 1840365755, -424065269}).intern());
            int i16 = C0923c.f14048p;
            String str2 = c0923c.f14049l;
            C0923c.f14047o = (i16 + 111) % 128;
            sb2.append(str2);
            sb2.append(G(1 - ((byte) KeyEvent.getModifierMetaStateMask()), new int[]{-1481431655, -1418800040}).intern());
            sb2.append(e7.getLocalizedMessage());
            Ab.b(strIntern, sb2.toString());
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        f14086p = (f14085o + 41) % 128;
        try {
            View viewD = D(view, this.k);
            if (viewD != null) {
                int i17 = f14086p + 13;
                f14085o = i17 % 128;
                if (i17 % 2 == 0) {
                    E(viewD);
                    view.removeOnLayoutChangeListener(this);
                } else {
                    E(viewD);
                    view.removeOnLayoutChangeListener(this);
                    throw null;
                }
            }
        } catch (Throwable th) {
            Ab.a0(G(19 - TextUtils.getOffsetAfter("", 0), new int[]{-309412633, 1023172094, -1533480888, -2100515236, 1488542177, 233447488, -1862095654, -1463384731, 1230305435, -672575845}).intern(), G((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 22, new int[]{-422206219, 667418301, 290068697, 310897032, 335302059, -2120590982, -1758788593, 753314242, -1439532795, 1016528876, -553894967, 224949978}).intern(), th, false);
        }
    }

    @Override // Va.Pb
    public final View t(Object obj) {
        int i5 = f14086p;
        f14085o = (i5 + 79) % 128;
        View view = (View) obj;
        int i10 = (i5 + 101) % 128;
        f14085o = i10;
        int i11 = i10 + 73;
        f14086p = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 12 / 0;
        }
        return view;
    }
}
