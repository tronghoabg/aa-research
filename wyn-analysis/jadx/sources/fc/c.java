package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.wynauto.wyn.R;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35285a;

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(android.content.Context r10) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "manager info = "
            r1 = 3
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 5
            r4 = 4
            r5 = 1
            r6 = 2
            r7 = 0
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.Exception -> L67
            java.lang.String r8 = "com.huawei.systemmanager"
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r8, r7)     // Catch: java.lang.Exception -> L67
            java.lang.Class<fc.c> r8 = fc.c.class
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Exception -> L67
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            r9.<init>(r0)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Exception -> L67
            r9.append(r0)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Exception -> L67
            android.util.Log.i(r8, r0)     // Catch: java.lang.Exception -> L67
            java.lang.String r10 = r10.versionName     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = "\\."
            java.lang.String[] r10 = r10.split(r0)     // Catch: java.lang.Exception -> L67
            int r0 = r10.length     // Catch: java.lang.Exception -> L67
            if (r0 < r6) goto L82
            r0 = r10[r7]     // Catch: java.lang.Exception -> L67
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L67
            if (r0 != r3) goto L42
            r0 = r2
            goto L83
        L42:
            r0 = r10[r7]     // Catch: java.lang.Exception -> L67
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L67
            if (r0 != r4) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            r0.<init>()     // Catch: java.lang.Exception -> L67
            r8 = r10[r7]     // Catch: java.lang.Exception -> L67
            r0.append(r8)     // Catch: java.lang.Exception -> L67
            r8 = r10[r5]     // Catch: java.lang.Exception -> L67
            r0.append(r8)     // Catch: java.lang.Exception -> L67
            r8 = r10[r6]     // Catch: java.lang.Exception -> L67
            r0.append(r8)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L67
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L67
            goto L83
        L67:
            r10 = move-exception
            r0 = r7
            goto L92
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            r0.<init>()     // Catch: java.lang.Exception -> L67
            r8 = r10[r7]     // Catch: java.lang.Exception -> L67
            r0.append(r8)     // Catch: java.lang.Exception -> L67
            r8 = r10[r5]     // Catch: java.lang.Exception -> L67
            r0.append(r8)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L67
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L67
            goto L83
        L82:
            r0 = r7
        L83:
            int r8 = r10.length     // Catch: java.lang.Exception -> L91
            if (r8 < r1) goto L95
            r10 = r10[r6]     // Catch: java.lang.Exception -> L91
            java.lang.String r10 = r10.substring(r7, r5)     // Catch: java.lang.Exception -> L91
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L91
            goto L96
        L91:
            r10 = move-exception
        L92:
            r10.printStackTrace()
        L95:
            r10 = r7
        L96:
            r8 = 330(0x14a, float:4.62E-43)
            if (r0 < r8) goto Lb4
            r5 = 6
            if (r0 < r2) goto L9f
        L9d:
            r3 = r5
            goto Lb8
        L9f:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto La4
            goto Lb8
        La4:
            r2 = 331(0x14b, float:4.64E-43)
            if (r0 < r2) goto Laa
            r3 = r4
            goto Lb8
        Laa:
            if (r10 == r5) goto Lb2
            if (r10 == r4) goto Lb2
            if (r10 != r6) goto Lb1
            goto Lb2
        Lb1:
            r1 = r6
        Lb2:
            r3 = r1
            goto Lb8
        Lb4:
            if (r0 == 0) goto Lb7
            goto L9d
        Lb7:
            r3 = r7
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.c.m(android.content.Context):int");
    }

    @Override // fc.b
    public final Intent a(Context context) throws PackageManager.NameNotFoundException, NumberFormatException {
        ComponentName componentName;
        switch (this.f35285a) {
            case 0:
                Intent intentP = AbstractC2641B.p();
                intentP.setAction("huawei.intent.action.HSM_BOOTAPP_MANAGER");
                if (!AbstractC2641B.B(context, intentP)) {
                    intentP = AbstractC2641B.p();
                    int iM = m(context);
                    ArrayList arrayList = new ArrayList();
                    if (iM == 4 || iM == 5) {
                        arrayList.add(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"));
                    } else if (iM == 6) {
                        arrayList.add(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                        arrayList.add(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"));
                    } else {
                        arrayList.add(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity"));
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            componentName = (ComponentName) it.next();
                            Intent intent = new Intent();
                            intent.setComponent(componentName);
                            if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
                            }
                        } else {
                            componentName = null;
                        }
                    }
                    intentP.setComponent(componentName);
                }
                return intentP;
            case 1:
                Intent intentP2 = AbstractC2641B.p();
                intentP2.setComponent(new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity"));
                return intentP2;
            default:
                Intent intentP3 = AbstractC2641B.p();
                intentP3.setComponent(new ComponentName("com.samsung.memorymanager", "com.samsung.memorymanager.RamActivity"));
                return intentP3;
        }
    }

    @Override // fc.b
    public final Intent b(Context context) {
        switch (this.f35285a) {
            case 0:
                Intent intentP = AbstractC2641B.p();
                intentP.setAction("huawei.intent.action.NOTIFICATIONMANAGER");
                return intentP;
            case 1:
                return null;
            default:
                AbstractC2641B.p().setAction("com.samsung.android.sm.ACTION_SM_NOTIFICATION_SETTING");
                return null;
        }
    }

    @Override // fc.b
    public final Intent c(Context context) {
        switch (this.f35285a) {
            case 0:
                Intent intentP = AbstractC2641B.p();
                intentP.setAction("huawei.intent.action.HSM_PROTECTED_APPS");
                return intentP;
            case 1:
                Intent intentP2 = AbstractC2641B.p();
                intentP2.setComponent(new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.BackgroundAppManageActivity"));
                return intentP2;
            default:
                Intent intentP3 = AbstractC2641B.p();
                intentP3.setAction("com.samsung.android.sm.ACTION_BATTERY");
                if (AbstractC2641B.B(context, intentP3)) {
                    return intentP3;
                }
                Intent intentP4 = AbstractC2641B.p();
                intentP4.setComponent(new ComponentName("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity"));
                if (AbstractC2641B.B(context, intentP4)) {
                    return intentP4;
                }
                intentP4.setComponent(new ComponentName("com.samsung.android.sm_cn", "com.samsung.android.sm.ui.battery.BatteryActivity"));
                if (AbstractC2641B.B(context, intentP4)) {
                    return intentP4;
                }
                intentP4.setComponent(new ComponentName("com.samsung.android.sm", "com.samsung.android.sm.ui.battery.BatteryActivity"));
                if (AbstractC2641B.B(context, intentP4)) {
                    return intentP4;
                }
                return null;
        }
    }

    @Override // fc.b
    public final ic.c d() {
        switch (this.f35285a) {
            case 0:
                return ic.c.f36946d;
            case 1:
                return ic.c.f36949g;
            default:
                return ic.c.f36944b;
        }
    }

    @Override // fc.b
    public final String e(Context context) {
        String str;
        switch (this.f35285a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("ROM_VERSION");
                sb2.append(ic.d.z());
                sb2.append("HuaweiSystemManagerVersionMethod:");
                sb2.append(m(context));
                try {
                    str = context.getPackageManager().getPackageInfo("com.huawei.systemmanager", 0).versionName;
                } catch (PackageManager.NameNotFoundException e7) {
                    e7.printStackTrace();
                    str = "";
                }
                N0.a.r(sb2, "HuaweiSystemManagerPackageVersion:", str, "huawei.intent.action.HSM_BOOTAPP_MANAGER");
                sb2.append(AbstractC2641B.C(context, "huawei.intent.action.HSM_BOOTAPP_MANAGER"));
                sb2.append("huawei.intent.action.HSM_PROTECTED_APPS");
                sb2.append(AbstractC2641B.C(context, "huawei.intent.action.HSM_PROTECTED_APPS"));
                sb2.append("huawei.intent.action.NOTIFICATIONMANAGER");
                sb2.append(AbstractC2641B.C(context, "huawei.intent.action.NOTIFICATIONMANAGER"));
                sb2.append("com.huawei.systemmanagercom.huawei.systemmanager.optimize.bootstart.BootStartActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity")));
                sb2.append("com.huawei.systemmanagercom.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity")));
                sb2.append("com.huawei.systemmanagercom.huawei.permissionmanager.ui.MainActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity")));
                sb2.append("com.huawei.systemmanagercom.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity");
                sb2.append(AbstractC2641B.A(context, new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity")));
                return sb2.toString();
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override // fc.b
    public int f() {
        switch (this.f35285a) {
            case 0:
                return R.drawable.huawei_autostart;
            default:
                return super.f();
        }
    }

    @Override // fc.b
    public final int h() {
        switch (this.f35285a) {
            case 0:
                return R.drawable.huawei_powersaving;
            case 1:
                return 0;
            default:
                return R.drawable.samsung;
        }
    }

    @Override // fc.b
    public final boolean i(Context context) {
        switch (this.f35285a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // fc.b
    public final boolean j() {
        switch (this.f35285a) {
        }
        return false;
    }

    @Override // fc.b
    public final boolean k(Context context) {
        switch (this.f35285a) {
        }
        return true;
    }

    @Override // fc.b
    public final boolean l() {
        switch (this.f35285a) {
            case 0:
                if (!"EmotionUI_2.3".equalsIgnoreCase(ic.d.z()) && !Build.DISPLAY.toLowerCase().contains("emui2.3") && !"EMUI 2.3".equalsIgnoreCase(ic.d.z()) && !"EmotionUI_3.0".equalsIgnoreCase(ic.d.z()) && !"EmotionUI_3.0.1".equalsIgnoreCase(ic.d.z()) && !"EmotionUI_3.1".equalsIgnoreCase(ic.d.z()) && !"EmotionUI_4.1".equalsIgnoreCase(ic.d.z())) {
                    String str = Build.BRAND;
                    ic.c cVar = ic.c.f36946d;
                    if (str.equalsIgnoreCase(cVar.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar.toString())) {
                    }
                }
                break;
            case 1:
                String str2 = Build.BRAND;
                ic.c cVar2 = ic.c.f36949g;
                if (str2.equalsIgnoreCase(cVar2.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar2.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar2.toString())) {
                }
                break;
            default:
                String str3 = Build.BRAND;
                ic.c cVar3 = ic.c.f36944b;
                if (str3.equalsIgnoreCase(cVar3.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar3.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar3.toString())) {
                }
                break;
        }
        return true;
    }
}
