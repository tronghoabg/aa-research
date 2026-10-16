package defpackage;

import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.Material3VersionPreference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class vdv implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vdv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, vew] */
    /* JADX WARN: Type inference failed for: r9v21, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r9v77, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r9v88, types: [java.lang.Object, xyc] */
    @Override // defpackage.xyc
    public final Object gu() throws PackageManager.NameNotFoundException {
        CharSequence applicationLabel;
        int iIntValue;
        switch (this.b) {
            case 0:
                zhc zhcVar = new zhc();
                ?? r9 = this.a;
                if (r9 == 0) {
                    zhcVar.p(new RuntimeException("App Check token provider is null."));
                    return zhcVar;
                }
                try {
                    r9.e(new ves(zhcVar));
                    return zhcVar;
                } catch (RemoteException e) {
                    zhcVar.p(e);
                    return zhcVar;
                }
            case 1:
                return vja.s((Context) ((kex) this.a).b);
            case 2:
                return ((Context) this.a).getPackageName();
            case 3:
                Context context = (Context) this.a;
                return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            case 4:
                return woy.al(((Bundle) this.a).getString("com.google.android.libraries.navigation.service.usage_server_url_override"));
            case 5:
                return (zgt) this.a.a();
            case 6:
                return Double.valueOf((String) ((vpq) this.a).a.gu());
            case 7:
                return this.a;
            case 8:
                return ((vsk) this.a).a();
            case 9:
                Object obj = this.a;
                int i = vug.a;
                long jCeil = vuf.f;
                if (jCeil == 0) {
                    synchronized (vuf.class) {
                        jCeil = vuf.f;
                        if (jCeil == 0) {
                            float f = 60.0f;
                            float fFloatValue = ((Float) vuf.l((Context) obj).d(Float.valueOf(60.0f))).floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                            jCeil = (long) Math.ceil(1.0E9d / f);
                            vuf.f = jCeil;
                        }
                    }
                }
                return Long.valueOf(jCeil);
            case 10:
                return (SharedPreferences) ((xxh) this.a).b();
            case 11:
                return Boolean.valueOf(adfs.a.gu().b((Context) this.a));
            case 12:
                return xxh.h(new wdc(((weu) this.a).a));
            case 13:
                long j = wid.a;
                return (UiModeManager) ((Context) this.a).getSystemService("uimode");
            case 14:
                Preference preference = (Preference) this.a;
                Context context2 = preference.j;
                TelecomManager telecomManager = (TelecomManager) context2.getSystemService("telecom");
                telecomManager.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(telecomManager.getDefaultDialerPackage());
                PackageManager packageManager = context2.getPackageManager();
                hashSet.addAll(qie.a(packageManager));
                StringBuilder sb = new StringBuilder();
                sb.append(context2.getString(R.string.settings_about_version_packages));
                sb.append("\n");
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    try {
                        if (!Material3VersionPreference.b.contains(str)) {
                            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                            sb.append((packageInfo.applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo)) == null) ? str : applicationLabel.toString());
                            sb.append(": ");
                            String str2 = packageInfo.versionName;
                            String strValueOf = String.valueOf(packageInfo.versionCode);
                            if (!TextUtils.isEmpty(str2)) {
                                strValueOf = str2 + " (" + strValueOf + ")";
                            }
                            sb.append(strValueOf);
                            sb.append("\n");
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        ((ype) ((ype) ((ype) Material3VersionPreference.a.h()).p(e2)).ai((char) 10043)).y("Package not found: %s", str);
                    }
                }
                sb.append("\n");
                Context context3 = preference.j;
                sb.append(context3.getString(R.string.settings_about_version_permissions));
                sb.append("\n");
                yno it2 = lgv.c().b().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    sb.append(((mdj) entry.getKey()).name().toLowerCase(Locale.getDefault()));
                    sb.append(": ");
                    sb.append(((Boolean) entry.getValue()).booleanValue() ? context3.getString(R.string.settings_about_version_on) : context3.getString(R.string.settings_about_version_off));
                    sb.append("\n");
                }
                return sb.toString();
            case 15:
                Object obj2 = this.a;
                bc activity = ((Fragment) obj2).getActivity();
                activity.getClass();
                return omc.b(activity, new pdn(obj2, 6), new wzf(obj2, 5), null, 0);
            case 16:
                return (xdx) ((xdy) this.a).b.get(0);
            case 17:
                ActivityManager activityManager = (ActivityManager) ((Context) this.a).getSystemService("activity");
                if (activityManager == null) {
                    return null;
                }
                return Integer.valueOf(activityManager.getMemoryClass());
            case 18:
                if (((Integer) ((zre) this.a).a.gu()) != null) {
                    int iIntValue2 = (int) (((r9.intValue() * 1024.0f) * 1024.0f) / addp.a.gu().a());
                    if (iIntValue2 > 1) {
                        return Integer.valueOf(iIntValue2);
                    }
                }
                return null;
            case 19:
                if (((Integer) ((zre) this.a).a.gu()) != null && (iIntValue = (int) (((r9.intValue() * 1024.0f) * 1024.0f) / 8.0f)) > 1) {
                    return Integer.valueOf(iIntValue);
                }
                return null;
            default:
                String str3 = zss.a;
                return zta.a.b((Context) this.a);
        }
    }
}
