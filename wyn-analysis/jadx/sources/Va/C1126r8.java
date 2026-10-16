package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: Va.r8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1126r8 {

    /* renamed from: f, reason: collision with root package name */
    public static int f14550f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f14551g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final String f14552a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f14553b;

    /* renamed from: c, reason: collision with root package name */
    public final V8 f14554c;

    /* renamed from: d, reason: collision with root package name */
    public final C1126r8 f14555d;

    /* renamed from: e, reason: collision with root package name */
    public int f14556e = -1;

    public C1126r8(String str, String str2, String str3, JSONObject jSONObject, C1126r8 c1126r8) {
        this.f14552a = AbstractC1152t8.a(str3);
        this.f14555d = c1126r8;
        ArrayList arrayListD0 = Ab.d0(jSONObject.optJSONArray(d(Drawable.resolveOpacity(0, 0), "쇽앍\uf21b䓼솜₯㥜\uf43f").intern()), new C1038ka(28));
        String[] strArr = new String[arrayListD0.size()];
        this.f14553b = strArr;
        arrayListD0.toArray(strArr);
        try {
            this.f14554c = new C1114q8().k(AbstractC1049l8.c(str, str3, jSONObject.optString(d((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "蛝沰ã䲴蚿襏쮧ﱽ").intern())));
        } catch (C1191w8 e7) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d(TextUtils.indexOf("", "", 0, 0), "\udd10ƀ\u0ec7琌\udd55\ue462얕쓓䬢穰濗㊝\uf1e2Ꮳ癩ꥒᾷ꧰荊ܙ葤㽸⪈緘㉰핷").intern());
            sb2.append(this.f14552a);
            sb2.append(d(ViewConfiguration.getScrollBarFadeDuration() >> 16, "\ue97fﶩ噝片\ue958᠙鴜슃缟蘕㝔㓙얚\uef99").intern());
            sb2.append(a() + e7.f14735a);
            sb2.append(d(ExpandableListView.getPackedPositionChild(0L) + 1, "␥㠾鷈\udefc␟\udd8e").intern());
            sb2.append(e7.getMessage());
            new C1023j8(str, str2, str3, a(), sb2.toString(), e7).d(str);
        } catch (Throwable th) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(d(ViewConfiguration.getPressedStateDuration() >> 16, "\udd10ƀ\u0ec7琌\udd55\ue462얕쓓䬢穰濗㊝\uf1e2Ꮳ癩ꥒᾷ꧰荊ܙ葤㽸⪈緘㉰핷").intern());
            sb3.append(this.f14552a);
            sb3.append(b((char) (57368 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "羖\ue1fbᢍꓠ", "\ueb41\uea2d\uda4a", (-1914569857) - Color.argb(0, 0, 0, 0)).intern());
            sb3.append(th.getMessage());
            String string = sb3.toString();
            AbstractC0897a.x(str, string, th, new C1023j8(str, str2, str3, a(), string, null));
        }
    }

    public static String b(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 51722);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static String d(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-6254109003083881072L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-6254109003083881072L)));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final int a() {
        int iA;
        if (this.f14556e == -1) {
            f14550f = (f14551g + 77) % 128;
            C1126r8 c1126r8 = this.f14555d;
            if (c1126r8 == null) {
                this.f14556e = 1;
            } else {
                int iA2 = c1126r8.a();
                V8 v82 = c1126r8.f14554c;
                if (v82 != null) {
                    f14550f = (f14551g + 95) % 128;
                    iA = v82.a();
                } else {
                    f14551g = (f14550f + 61) % 128;
                    iA = 1;
                }
                this.f14556e = iA2 + iA + 1;
            }
        }
        int i5 = this.f14556e;
        int i10 = f14550f + 111;
        f14551g = i10 % 128;
        if (i10 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.C1139s8 c(Va.C1203x8 r12, Va.C1214y7 r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1126r8.c(Va.x8, Va.y7, java.util.List):Va.s8");
    }

    public final String toString() throws UnsupportedEncodingException {
        String strIntern;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(KeyEvent.keyCodeFromString(""), "癓ጃ\ue4dc殛瘵\uf6e6⾒\udb48\ue067梺藓ⴅ嫳").intern());
        sb2.append(this.f14552a);
        sb2.append(d(ViewConfiguration.getScrollBarSize() >> 8, "櫢튺\u0557傞櫊").intern());
        String strIntern2 = b((char) (53965 - KeyEvent.getDeadChar(0, 0)), "亃탽췁巒", "೪迨", Color.argb(0, 0, 0, 0)).intern();
        if (strIntern2 == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb3 = new StringBuilder();
        String[] strArr = this.f14553b;
        if (strArr.length > 0) {
            sb3.append((CharSequence) strArr[0]);
            for (int i5 = 1; i5 < strArr.length; i5++) {
                sb3.append((CharSequence) strIntern2);
                sb3.append((CharSequence) strArr[i5]);
            }
        }
        sb2.append(sb3.toString());
        sb2.append(b((char) (TextUtils.lastIndexOf("", '0') + 8250), "塵谯㥓䀠", "眕任", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
        V8 v82 = this.f14554c;
        if (v82 != null) {
            f14551g = (f14550f + 103) % 128;
            strIntern = v82.toString();
            f14550f = (f14551g + 1) % 128;
        } else {
            strIntern = d(KeyEvent.normalizeMetaState(0), "Ꮦ邨掔쥓Ꭽ甘\ua8c9").intern();
        }
        sb2.append(strIntern);
        return sb2.toString();
    }
}
