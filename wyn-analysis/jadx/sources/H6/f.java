package H6;

import A7.AbstractC0279p0;
import D6.C0395s;
import D6.P0;
import D6.o1;
import D6.v1;
import D6.w1;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzgax;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;
import x6.C4475f;
import x6.C4476g;
import x6.C4477h;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final zzgax f4939b = new zzgax(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final String f4940c = C4477h.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String f4941d = I6.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f4942e = y6.c.class.getName();

    /* renamed from: f, reason: collision with root package name */
    public static final String f4943f = y6.d.class.getName();

    /* renamed from: g, reason: collision with root package name */
    public static final String f4944g = C4475f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public float f4945a;

    public static final void a(Context context, String str, Bundle bundle, e eVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            d7.f.f34129b.getClass();
            int iA = d7.f.a(context);
            str = AbstractC0279p0.j(iA, ".261710000", new StringBuilder(String.valueOf(iA).length() + 10));
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        eVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int b(Context context, int i5) {
        return s(context.getResources().getDisplayMetrics(), i5);
    }

    public static final String c(Context context) {
        zzbix.zza(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || t()) {
            string = "emulator";
        }
        return d(string, "MD5");
    }

    public static String d(String str, String str2) {
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static ActivityManager.MemoryInfo i(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            l.f("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static String j(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Bundle bundle = C3773c.a(context).a(128, context.getPackageName()).metaData;
            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                return bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static AdSize k(Context context, int i5, int i10) {
        int iP = p(context, i10);
        if (iP == -1) {
            return AdSize.f26292n;
        }
        return new AdSize(i5, Math.max(Math.min(i5 > 655 ? Math.round((i5 / 728.0f) * 90.0f) : i5 > 632 ? 81 : i5 > 526 ? Math.round((i5 / 468.0f) * 60.0f) : i5 > 432 ? 68 : Math.round((i5 / 320.0f) * 50.0f), Math.min(90, Math.round(iP * 0.15f))), 50));
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzblg.zzd.zze());
    }

    public static int p(Context context, int i5) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i10 = configuration.orientation;
        if (i5 == 0) {
            i5 = i10;
        }
        return i5 == i10 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static P6.b q(o1 o1Var) {
        String str = o1Var.f2469a;
        EnumC4471b enumC4471bA = EnumC4471b.a(o1Var.f2470b);
        if (enumC4471bA == null) {
            return null;
        }
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder(14);
        v1 v1Var = o1Var.f2471c;
        List list = v1Var.f2508e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adRequest$Builder.w((String) it.next());
            }
        }
        P0 p02 = (P0) adRequest$Builder.f421a;
        p02.f2345b.putAll(v1Var.f2515m);
        Bundle bundle = v1Var.f2516n;
        for (String str2 : bundle.keySet()) {
            adRequest$Builder.t(str2, bundle.getString(str2));
        }
        p02.f2355m = v1Var.f2526x;
        String str3 = v1Var.f2514l;
        if (str3 != null) {
            adRequest$Builder.T(str3);
        }
        adRequest$Builder.U(v1Var.f2524v);
        adRequest$Builder.V(v1Var.f2518p);
        C4476g c4476g = new C4476g(adRequest$Builder);
        Q1.n nVar = new Q1.n(str, enumC4471bA);
        nVar.f9698d = c4476g;
        nVar.f9695a = o1Var.f2472d;
        return new P6.b(nVar);
    }

    public static o1 r(Context context, P6.b bVar) {
        boolean z2;
        int iIntValue;
        v1 v1VarA = w1.a(context, bVar.f9260c.f47736a);
        int iIntValue2 = 1;
        v1VarA.f2506c.putBoolean("is_sdk_preload", true);
        int iIntValue3 = bVar.f9261d;
        if (iIntValue3 <= 0) {
            int iOrdinal = bVar.a().ordinal();
            if (iOrdinal == 1) {
                iIntValue3 = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzal)).intValue();
            } else if (iOrdinal == 2) {
                iIntValue3 = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzam)).intValue();
            } else if (iOrdinal != 5) {
                iIntValue3 = 1;
            } else {
                iIntValue3 = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzak)).intValue();
            }
            z2 = true;
        } else {
            z2 = false;
        }
        int iOrdinal2 = bVar.a().ordinal();
        if (iOrdinal2 == 1) {
            iIntValue = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzai)).intValue();
        } else if (iOrdinal2 == 2) {
            iIntValue = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzaj)).intValue();
        } else if (iOrdinal2 != 5) {
            iIntValue = 1;
        } else {
            iIntValue = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzah)).intValue();
        }
        int iMax = Math.max(Math.min(iIntValue, 15), 1);
        int iOrdinal3 = bVar.a().ordinal();
        if (iOrdinal3 == 1) {
            iIntValue2 = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzao)).intValue();
        } else if (iOrdinal3 == 2) {
            iIntValue2 = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzap)).intValue();
        } else if (iOrdinal3 == 5) {
            iIntValue2 = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzan)).intValue();
        }
        return new o1(bVar.f9258a, bVar.a().f47731a, v1VarA, Math.max(Math.min(iIntValue3, iMax), Math.min(iIntValue2, iMax)), z2);
    }

    public static final int s(DisplayMetrics displayMetrics, int i5) {
        return (int) TypedValue.applyDimension(1, i5, displayMetrics);
    }

    public static final boolean t() {
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzna)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public final JSONArray e(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void f(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(l((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(e((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(n((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void g(String str, JSONObject jSONObject, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzu)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, m((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, l((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), e((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, e(Arrays.asList((Object[]) obj)));
            return;
        }
        int i5 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i5 < length) {
                    numArr2[i5] = Integer.valueOf(iArr[i5]);
                    i5++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, n(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i5 < length2) {
                    dArr3[i5] = Double.valueOf(dArr2[i5]);
                    i5++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, n(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i5 < length3) {
                    lArr2[i5] = Long.valueOf(jArr[i5]);
                    i5++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, n(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i5 < length4) {
                boolArr2[i5] = Boolean.valueOf(zArr[i5]);
                i5++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, n(boolArr));
    }

    public final int h(Context context, int i5) {
        if (this.f4945a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (this) {
                try {
                    if (this.f4945a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f4945a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i5 / this.f4945a);
    }

    public final JSONObject l(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                g(str, jSONObject, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e7) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e7.getMessage())));
        }
    }

    public final JSONObject m(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            g(str, jSONObject, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONArray n(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            f(jSONArray, obj);
        }
        return jSONArray;
    }
}
