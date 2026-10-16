package cb;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.adapters.ByteDanceMediationAdapter;
import com.applovin.shadow.okio.Path;
import com.bytedance.sdk.component.adexpress.dynamic.moa.bcc;
import com.bytedance.sdk.openadsdk.core.lz;
import com.bytedance.sdk.openadsdk.sy.oa.uef;
import com.google.android.gms.internal.ads.zzdzo;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzidu;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;
import n7.C3597b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1593a {
    public static int A(int i5, int i10, int i11) {
        int i12 = i5 / i10;
        return i12 + i12 + i11;
    }

    public static int B(int i5, int i10, int i11, int i12) {
        return zzidu.zzF(i5) + i10 + i11 + i12;
    }

    public static void C(String str, String str2, String str3) {
        zzeh.zzc(str3, str2.concat(String.valueOf(str)));
    }

    public static int a(int i5, int i10, int i11) {
        return zzidu.zzF(i5) + i10 + i11;
    }

    public static int b(int i5, int i10, int i11, int i12) {
        return ((i5 + i10) - i11) + i12;
    }

    public static int c(int i5, int i10, int i11, int i12, int i13) {
        return Math.max(((i5 * i10) / i11) + i12, i13);
    }

    public static /* synthetic */ int d(long j8) {
        int i5 = (int) j8;
        if (j8 == i5) {
            return i5;
        }
        throw new ArithmeticException();
    }

    public static y4 e(String str, long j8, TimeUnit timeUnit) {
        return y4.a(str, Long.valueOf(timeUnit.toMillis(j8)));
    }

    public static uef f(String str) {
        uef uefVar = new uef();
        uefVar.oa(str);
        return uefVar;
    }

    public static String g(int i5, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i5);
        sb2.append(str);
        String string = sb2.toString();
        AbstractC3340k.d(string, str2);
        return string;
    }

    public static String h(long j8, String str, String str2) {
        return str + j8 + str2;
    }

    public static String i(Path path, String str) {
        return str + path;
    }

    public static /* synthetic */ String j(CharSequence[] charSequenceArr) {
        StringBuilder sb2 = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb2.append(charSequenceArr[0]);
            for (int i5 = 1; i5 < charSequenceArr.length; i5++) {
                sb2.append((CharSequence) ",");
                sb2.append(charSequenceArr[i5]);
            }
        }
        return sb2.toString();
    }

    public static StringBuilder k(int i5, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i5);
        sb2.append(str4);
        return sb2;
    }

    public static HashMap l(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static JSONArray m(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static JSONObject n(String str, i5 i5Var) {
        return i5Var.a(str, new JSONObject());
    }

    public static void o(int i5, int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i5);
        sb2.append(str);
        sb2.append(i10);
        zzeh.zzc(str2, sb2.toString());
    }

    public static void p(int i5, lz.AnonymousClass1 anonymousClass1, String str, int i10, String str2) {
        anonymousClass1.put(Integer.valueOf(i5), str);
        anonymousClass1.put(Integer.valueOf(i10), str2);
    }

    public static void q(int i5, String str, String str2) {
        Log.e(str2, str + i5);
    }

    public static void r(MaxAdFormat maxAdFormat, StringBuilder sb2, String str) {
        sb2.append(maxAdFormat.getLabel());
        sb2.append(str);
    }

    public static void s(String str, String str2, o oVar, String str3) {
        oVar.a(str3, str + str2);
    }

    public static void t(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    public static void u(StringBuilder sb2, MaxAdListener maxAdListener, o oVar, String str) {
        sb2.append(maxAdListener);
        oVar.a(str, sb2.toString());
    }

    public static void v(StringBuilder sb2, String str, int i5, String str2) {
        sb2.append(str);
        sb2.append(i5);
        zzeh.zzc(str2, sb2.toString());
    }

    public static void w(StringBuilder sb2, String str, o oVar, String str2) {
        sb2.append(str);
        oVar.a(str2, sb2.toString());
    }

    public static void x(StringBuilder sb2, String str, ByteDanceMediationAdapter byteDanceMediationAdapter) {
        sb2.append(str);
        byteDanceMediationAdapter.log(sb2.toString());
    }

    public static void y(C3597b c3597b, zzdzo zzdzoVar, String str) {
        c3597b.getClass();
        zzdzoVar.zzf(str, System.currentTimeMillis());
    }

    public static boolean z(bcc bccVar, String str) {
        return TextUtils.equals(bccVar.zjm().oa(), str);
    }
}
