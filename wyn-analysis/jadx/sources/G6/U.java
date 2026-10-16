package G6;

import A7.AbstractC0279p0;
import A7.CallableC0305y0;
import A7.V1;
import D6.C0392q;
import D6.C0395s;
import Va.M6;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.android.gms.internal.ads.zzcks;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzcnd;
import com.google.android.gms.internal.ads.zzdwt;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzfkn;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzgtf;
import com.google.android.gms.internal.ads.zzgug;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzinp;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import k1.InterfaceC3136x;
import n7.AbstractC3598c;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;
import p9.C3778C;

/* loaded from: classes3.dex */
public final class U {

    /* renamed from: l, reason: collision with root package name */
    public static final M f4562l = new M(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public String f4569g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f4570h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4563a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f4564b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f4565c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4566d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4567e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4568f = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f4571i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4572j = false;
    public final ExecutorService k = Executors.newSingleThreadExecutor();

    public static final String A(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (str == null) {
            C6.n.f1857D.f1868h.zzh(new Exception("null afmaVersion"), "AdUtil.getUserAgent");
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzh)).booleanValue()) {
                return N();
            }
            str = H6.a.V().f4927a;
        }
        String strN = null;
        try {
            if (B8.e.f1611c == null) {
                B8.e.f1611c = new B8.e();
            }
            B8.e eVar = B8.e.f1611c;
            if (TextUtils.isEmpty(eVar.f1613b)) {
                int i5 = d7.i.f34135e;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                eVar.f1613b = (String) S3.f.R(context, new CallableC0305y0(contextCreatePackageContext, false, context, 5));
            }
            strN = eVar.f1613b;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strN)) {
            strN = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N();
        }
        String strT = M6.t(new StringBuilder(String.valueOf(strN).length() + 10 + String.valueOf(str).length()), strN, " (Mobile; ", str);
        try {
            if (C3773c.a(context).e()) {
                StringBuilder sb2 = new StringBuilder(strT.length() + 4);
                sb2.append(strT);
                sb2.append(";aia");
                strT = sb2.toString();
            }
        } catch (Exception e7) {
            C6.n.f1857D.f1868h.zzh(e7, "AdUtil.getUserAgent");
        }
        return strT.concat(")");
    }

    public static ArrayList H() {
        zzbio zzbioVar = zzbix.zza;
        List listZzf = C0395s.f2489e.f2490a.zzf();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzf.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzgug.zza(zzgtf.zzd(',')).zzf((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    L.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static S I(Context context) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33) {
            if (i5 >= 24) {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                return new S(locale.getLanguage(), locale.getCountry());
            }
            Locale locale2 = context.getResources().getConfiguration().locale;
            return new S(locale2.getLanguage(), locale2.getCountry());
        }
        S s10 = new S(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager localeManagerD = T.d(context.getSystemService(T.o()));
            if (localeManagerD == null || localeManagerD.getSystemLocales().isEmpty()) {
                return s10;
            }
            Locale locale3 = localeManagerD.getSystemLocales().get(0);
            return new S(locale3.getLanguage(), locale3.getCountry());
        } catch (Throwable th) {
            C6.n.f1857D.f1868h.zzh(th, "AdUtil.getSystemDefaultLocale");
            return s10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean K(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.U.K(android.view.View):boolean");
    }

    public static final void L(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String M(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return x(y(context));
    }

    public static final String N() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(StringUtils.SPACE);
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String O() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : M6.t(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, StringUtils.SPACE, str2);
    }

    public static final HashMap P(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i5);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long Q(View view) {
        float f10;
        float fMin = Float.MAX_VALUE;
        do {
            boolean z2 = view instanceof View;
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!z2) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fMin >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = fMin;
        }
        return Math.round(f10 * 100.0f);
    }

    public static final int a(View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof InterfaceC3136x) {
                return 4;
            }
            zzbio zzbioVar = zzbix.zzjo;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                String str = (String) c0395s.f2492c.zzd(zzbix.zzjp);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final A b(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                int i5 = L.f4523b;
                H6.l.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof A ? (A) iInterfaceQueryLocalInterface : new C0561z(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        } catch (Exception e7) {
            C6.n.f1857D.f1868h.zzh(e7, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        Context contextZza = zzcbu.zza(context);
        return C3773c.a(contextZza).f2782a.getPackageManager().checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        try {
            if (AbstractC3598c.f40929h == null) {
                AbstractC3598c.f40929h = Boolean.valueOf(AbstractC3598c.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return AbstractC3598c.f40929h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean e(String str) {
        if (!H6.i.c()) {
            return false;
        }
        zzbio zzbioVar = zzbix.zzgm;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) c0395s.f2492c.zzd(zzbix.zzgo);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzgn);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i5 = L.f4523b;
            H6.l.d("Error loading class.", th);
            C6.n.f1857D.f1868h.zzh(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        try {
            Bundle bundleY = y(context);
            String string = bundleY.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(x(bundleY))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void j(int i5, View view) {
        String str;
        int i10;
        int iHeight;
        int iWidth;
        String str2;
        String str3;
        String strZza;
        zzfkn zzfknVarZzC;
        zzfkq zzfkqVarZzaC;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdwt) {
                childAt = ((zzdwt) childAt).getChildAt(0);
            }
            if (childAt instanceof NativeAdView) {
                str = "NATIVE";
                i10 = 1;
            } else {
                str = "UNKNOWN";
                i10 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            U u10 = C6.n.f1857D.f1863c;
            long jQ = Q(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str4 = "none";
            if (!(childAt instanceof zzcmi) || (zzfkqVarZzaC = ((zzcmi) childAt).zzaC()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = zzfkqVarZzaC.zzb;
                int iHashCode = childAt.hashCode();
                str2 = str;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(iHashCode).length());
                sb2.append(str3);
                sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb2.append(iHashCode);
                childAt.setContentDescription(sb2.toString());
            }
            if (!(childAt instanceof zzcks) || (zzfknVarZzC = ((zzcks) childAt).zzC()) == null) {
                strZza = str2;
            } else {
                strZza = zzfkn.zza(zzfknVarZzC.zzb);
                i10 = zzfknVarZzC.zze;
                str4 = zzfknVarZzC.zzE;
            }
            Locale locale = Locale.US;
            String str5 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str3 + ", format=" + strZza + ", impType=" + i10 + ", class=" + childAt.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jQ + ", state=" + Integer.toString(i5, 2) + ">";
            int i13 = L.f4523b;
            H6.l.e(str5);
        } catch (Exception e7) {
            int i14 = L.f4523b;
            H6.l.d("Failure getting view location.", e7);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        V v2 = C6.n.f1857D.f1866f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, zzfkn zzfknVar, zzdzt zzdztVar) {
        zzdzs zzdzsVarZza = zzdztVar.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "can_show");
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        zzdzsVarZza.zzc("foreground", true != g(context) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
        zzdzsVarZza.zzc("fg_al", true == nVar.f1867g.zzf() ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
        if (zzfknVar != null) {
            List list = zzfknVar.zzt;
            if (!list.isEmpty()) {
                zzdzsVarZza.zzc("ancn", (String) list.get(0));
            }
            zzdzsVarZza.zzc("ad_format", zzfkn.zza(zzfknVar.zzb));
        }
        zzdzsVarZza.zzd();
    }

    public static final boolean m(zzfkn zzfknVar) {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpj)).booleanValue() && zzfknVar != null && zzfknVar.zze == 4;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            String strConcat = "Could not parse value:".concat(e7.toString());
            int i5 = L.f4523b;
            H6.l.f(strConcat);
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzx)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i5 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i5);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i5);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i5, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i5 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        C0392q c0392q = C0392q.f2477g;
        return new int[]{c0392q.f2478a.h(activity, iArr[0]), c0392q.f2478a.h(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z2 = C6.n.f1857D.f1863c.f4567e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view);
        long jQ = Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z2)) {
            zzbio zzbioVar = zzbix.zzcc;
            C0395s c0395s = C0395s.f2489e;
            if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                zzbio zzbioVar2 = zzbix.zzmj;
                if (!((Boolean) c0395s.f2492c.zzd(zzbioVar2)).booleanValue() || jQ >= ((Integer) r6.zzd(zzbix.zzml)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmG)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e7) {
            int i5 = L.f4523b;
            H6.l.g("", e7);
            C6.n.f1857D.f1868h.zzh(e7, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            L(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 26);
            sb2.append("Opening ");
            sb2.append(string);
            sb2.append(" in a new browser.");
            String string2 = sb2.toString();
            int i5 = L.f4523b;
            H6.l.a(string2);
        } catch (ActivityNotFoundException e7) {
            int i10 = L.f4523b;
            H6.l.d("No browser is found.", e7);
        }
    }

    public static int u(int i5) {
        if (i5 >= 5000) {
            return i5;
        }
        if (i5 <= 0) {
            return 60000;
        }
        String strO = AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 86), "HTTP timeout too low: ", i5, " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i10 = L.f4523b;
        H6.l.f(strO);
        return 60000;
    }

    public static final void v(Context context, Intent intent, zzdzt zzdztVar, String str) {
        zzbio zzbioVar = zzbix.zzoO;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || !(context instanceof zzcnd)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) c0395s.f2492c.zzd(zzbix.zzoQ))) {
                    ((zzcnd) context).zza(intent, 236);
                    if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzoP)).booleanValue() || zzdztVar == null) {
                        return;
                    }
                    zzdzs zzdzsVarZza = zzdztVar.zza();
                    zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "hila");
                    zzdzsVarZza.zzc("gqi", zzgui.zza(str));
                    zzdzsVarZza.zzf();
                    return;
                }
            }
            s(context, intent);
        } catch (ActivityNotFoundException e7) {
            e = e7;
            int i5 = L.f4523b;
            H6.l.d("Error occurred while starting activity for result", e);
            C6.n.f1857D.f1868h.zzh(e, "AdUtil.startActivityForResult");
            s(context, intent);
        } catch (SecurityException e10) {
            e = e10;
            int i52 = L.f4523b;
            H6.l.d("Error occurred while starting activity for result", e);
            C6.n.f1857D.f1868h.zzh(e, "AdUtil.startActivityForResult");
            s(context, intent);
        } catch (Exception e11) {
            int i10 = L.f4523b;
            H6.l.d("Error occurred while starting activity for result", e11);
            C6.n.f1857D.f1868h.zzh(e11, "AdUtil.startActivityForResult");
            s(context, intent);
        }
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static Bundle y(Context context) {
        try {
            return C3773c.a(context).a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
            L.l("Error getting metadata", e7);
            return null;
        }
    }

    public static final void z(C3778C c3778c, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i5 = bundle.getInt("h", -1);
        Intent intent = (Intent) c3778c.f43324c;
        if (i5 >= 0) {
            if (i5 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i5);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i10 = bundle.getInt("cbp", -1);
        if (i10 < 0 || i10 > 2) {
            return;
        }
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
    }

    public final void B(Context context, String str, HttpURLConnection httpURLConnection, int i5) {
        int iU = u(i5);
        String strO = AbstractC0279p0.o(new StringBuilder(String.valueOf(iU).length() + 28), "HTTP timeout: ", iU, " milliseconds.");
        int i10 = L.f4523b;
        H6.l.e(strO);
        httpURLConnection.setConnectTimeout(iU);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iU);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void C(Context context) {
        if (this.f4571i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbix.zza(context);
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new V1(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new V1(this), intentFilter, 4);
        }
        this.f4571i = true;
    }

    public final void D(Context context) {
        if (this.f4572j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbix.zza(context);
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new Q(0), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new Q(0), intentFilter, 4);
        }
        this.f4572j = true;
    }

    public final String E(Context context, String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmS)).booleanValue()) {
            if (this.f4570h != null) {
                return this.f4570h;
            }
            String strA = A(context, str);
            if (str != null) {
                this.f4570h = strA;
            }
            return strA;
        }
        synchronized (this.f4568f) {
            try {
                String str2 = this.f4569g;
                if (str2 != null) {
                    return str2;
                }
                String strA2 = A(context, str);
                if (str != null) {
                    this.f4569g = strA2;
                }
                return strA2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F(String str) {
        return w(str, this.f4563a, (String) C0395s.f2489e.f2492c.zzd(zzbix.zzaV));
    }

    public final boolean G(String str) {
        return w(str, this.f4564b, (String) C0395s.f2489e.f2492c.zzd(zzbix.zzaW));
    }

    public final int J(Context context, Uri uri, Bundle bundle) {
        if (context == null) {
            L.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        zzbio zzbioVar = zzbix.zzfI;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbiv zzbivVar = c0395s.f2492c;
        if (zBooleanValue) {
            C3778C c3778c = new C3778C(C6.n.f1857D.f1873n.zzb());
            z(c3778c, bundle);
            u.k kVarB = c3778c.b();
            if (((Boolean) zzbivVar.zzd(zzbix.zzfW)).booleanValue()) {
                H6.f fVar = C0392q.f2477g.f2478a;
                if (H6.f.t()) {
                    return 5;
                }
            }
            kVarB.f46072a.setPackage(zzinp.zza(context));
            kVarB.a(context, uri);
            return 5;
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzfG)).booleanValue()) {
            zzbjy zzbjyVar = new zzbjy();
            zzbjyVar.zzd(new S3.i(this, zzbjyVar, bundle, context, uri));
            zzbjyVar.zze((Activity) context);
            return 5;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        intent2.addFlags(268435456);
        context.startActivity(intent2);
        return 9;
    }
}
