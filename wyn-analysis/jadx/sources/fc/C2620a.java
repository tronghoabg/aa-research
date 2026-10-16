package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.wynauto.wyn.R;
import ff.AbstractC2641B;

/* renamed from: fc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2620a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35284a;

    public static Intent m(Context context) {
        Intent intentP = AbstractC2641B.p();
        intentP.setAction("com.meizu.safe.security.SHOW_APPSEC");
        intentP.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
        return intentP;
    }

    public static int n(Context context) throws NumberFormatException {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.meizu.safe", 0).versionName;
            Log.i("Meizu security center :", str);
        } catch (Exception unused) {
        }
        if (str.startsWith(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            return 1;
        }
        if (!str.startsWith("3")) {
            str.startsWith("4");
            return 5;
        }
        int i5 = Integer.parseInt(str.substring(2, 3));
        Log.i("Meizu security center :", "d: " + i5);
        if (i5 <= 4) {
            return 2;
        }
        return i5 < 7 ? 3 : 4;
    }

    @Override // fc.b
    public final Intent a(Context context) {
        switch (this.f35284a) {
            case 0:
                Intent intentP = AbstractC2641B.p();
                intentP.putExtra("showNotice", true);
                intentP.setComponent(new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.autostart.AutoStartActivity"));
                return intentP;
            case 1:
                return null;
            case 2:
                return m(context);
            default:
                Intent intentP2 = AbstractC2641B.p();
                intentP2.setComponent(new ComponentName("com.zte.heartyservice", "com.zte.heartyservice.autorun.AppAutoRunManager"));
                return intentP2;
        }
    }

    @Override // fc.b
    public final Intent b(Context context) throws NumberFormatException {
        switch (this.f35284a) {
            case 0:
                Intent intentP = AbstractC2641B.p();
                intentP.putExtra("showNotice", true);
                intentP.setComponent(new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.entry.FunctionActivity"));
                return intentP;
            case 1:
                return null;
            case 2:
                int iN = n(context);
                Intent intentP2 = AbstractC2641B.p();
                if (iN != 4 && iN != 5) {
                    return m(context);
                }
                intentP2.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.permission.NotificationActivity"));
                return intentP2;
            default:
                return null;
        }
    }

    @Override // fc.b
    public final Intent c(Context context) throws NumberFormatException {
        switch (this.f35284a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 24) {
                    if (!((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName())) {
                        Intent intentP = AbstractC2641B.p();
                        intentP.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                        intentP.setData(Uri.parse("package:" + context.getPackageName()));
                        return intentP;
                    }
                    Log.i(C2620a.class.getName(), "getActionDozeModeApp is already enable to ignore doze battery optimization");
                }
                return null;
            case 1:
                Intent intentP2 = AbstractC2641B.p();
                intentP2.setComponent(new ComponentName("com.htc.pitroad", " com.htc.pitroad.landingpage.activity.LandingPageActivity"));
                return intentP2;
            case 2:
                Intent intentP3 = AbstractC2641B.p();
                int iN = n(context);
                intentP3.setAction("com.meizu.power.PowerAppKilledNotification");
                if (AbstractC2641B.B(context, intentP3)) {
                    return intentP3;
                }
                Intent intentP4 = AbstractC2641B.p();
                if (iN == 1) {
                    intentP4.setClassName("com.meizu.safe", "com.meizu.safe.cleaner.RubbishCleanMainActivity");
                    return intentP4;
                }
                if (iN == 2) {
                    intentP4.setClassName("com.meizu.safe", "com.meizu.safe.powerui.AppPowerManagerActivity");
                    return intentP4;
                }
                if (iN != 4) {
                    return m(context);
                }
                intentP4.setClassName("com.meizu.safe", "com.meizu.safe.powerui.PowerAppPermissionActivity");
                return intentP4;
            default:
                Intent intentP5 = AbstractC2641B.p();
                intentP5.setComponent(new ComponentName("com.zte.heartyservice", "com.zte.heartyservice.setting.ClearAppSettingsActivity"));
                return intentP5;
        }
    }

    @Override // fc.b
    public final ic.c d() {
        switch (this.f35284a) {
            case 0:
                return ic.c.f36950h;
            case 1:
                return ic.c.f36951i;
            case 2:
                return ic.c.f36947e;
            default:
                return ic.c.f36952j;
        }
    }

    @Override // fc.b
    public final String e(Context context) throws NumberFormatException {
        String str;
        switch (this.f35284a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                StringBuilder sb2 = new StringBuilder("MeizuSecVersionMethod:");
                int iN = n(context);
                sb2.append(iN != 1 ? iN != 2 ? iN != 3 ? iN != 4 ? iN != 5 ? "null" : "SEC_4_1" : "SEC_3_7" : "SEC_3_6" : "SEC_3_4" : "SEC_2_2");
                try {
                    str = context.getPackageManager().getPackageInfo("com.meizu.safe", 0).versionName;
                } catch (PackageManager.NameNotFoundException e7) {
                    e7.printStackTrace();
                    str = "";
                }
                N0.a.r(sb2, "MeizuSecPackageVersion:", str, "com.meizu.safe.security.SHOW_APPSEC");
                sb2.append(AbstractC2641B.C(context, "com.meizu.safe.security.SHOW_APPSEC"));
                sb2.append("com.meizu.power.PowerAppKilledNotification");
                sb2.append(AbstractC2641B.C(context, "com.meizu.power.PowerAppKilledNotification"));
                sb2.append("com.meizu.safecom.meizu.safe.cleaner.RubbishCleanMainActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.meizu.safe", "com.meizu.safe.cleaner.RubbishCleanMainActivity")));
                sb2.append("com.meizu.safecom.meizu.safe.powerui.AppPowerManagerActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.meizu.safe", "com.meizu.safe.powerui.AppPowerManagerActivity")));
                sb2.append("com.meizu.safecom.meizu.safe.powerui.PowerAppPermissionActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.meizu.safe", "com.meizu.safe.powerui.PowerAppPermissionActivity")));
                sb2.append("com.meizu.safecom.meizu.safe.permission.NotificationActivity");
                sb2.append(AbstractC2641B.C(context, "com.meizu.power.PowerAppKilledNotification"));
                return sb2.toString();
            default:
                return null;
        }
    }

    @Override // fc.b
    public int f() {
        switch (this.f35284a) {
            case 0:
                return R.drawable.asus_autostart;
            default:
                return super.f();
        }
    }

    @Override // fc.b
    public int g() {
        switch (this.f35284a) {
            case 0:
                return R.drawable.asus_notification;
            default:
                return super.g();
        }
    }

    @Override // fc.b
    public int h() {
        switch (this.f35284a) {
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                return 0;
            default:
                return super.h();
        }
    }

    @Override // fc.b
    public final boolean i(Context context) {
        switch (this.f35284a) {
        }
        return true;
    }

    @Override // fc.b
    public final boolean j() {
        switch (this.f35284a) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // fc.b
    public final boolean k(Context context) {
        switch (this.f35284a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 24) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // fc.b
    public final boolean l() {
        switch (this.f35284a) {
            case 0:
                String str = Build.BRAND;
                ic.c cVar = ic.c.f36950h;
                if (str.equalsIgnoreCase(cVar.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar.toString())) {
                }
                break;
            case 1:
                String str2 = Build.BRAND;
                ic.c cVar2 = ic.c.f36951i;
                if (str2.equalsIgnoreCase(cVar2.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar2.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar2.toString())) {
                }
                break;
            case 2:
                String str3 = Build.BRAND;
                ic.c cVar3 = ic.c.f36947e;
                if (str3.equalsIgnoreCase(cVar3.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar3.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar3.toString())) {
                }
                break;
            default:
                String str4 = Build.BRAND;
                ic.c cVar4 = ic.c.f36952j;
                if (str4.equalsIgnoreCase(cVar4.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar4.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar4.toString())) {
                }
                break;
        }
        return true;
    }
}
