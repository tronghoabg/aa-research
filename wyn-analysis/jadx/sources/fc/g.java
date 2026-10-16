package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.wynauto.wyn.R;
import ff.AbstractC2641B;

/* loaded from: classes5.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final ComponentName[] f35292a = {new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity")};

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName[] f35293b = {new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity")};

    @Override // fc.b
    public final Intent a(Context context) {
        for (ComponentName componentName : f35292a) {
            if (AbstractC2641B.A(context, componentName)) {
                Intent intentP = AbstractC2641B.p();
                intentP.setComponent(componentName);
                return intentP;
            }
        }
        return null;
    }

    @Override // fc.b
    public final Intent b(Context context) {
        return null;
    }

    @Override // fc.b
    public final Intent c(Context context) {
        Intent intentP;
        ComponentName[] componentNameArr = f35293b;
        int length = componentNameArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                intentP = null;
                break;
            }
            ComponentName componentName = componentNameArr[i5];
            if (AbstractC2641B.A(context, componentName)) {
                intentP = AbstractC2641B.p();
                intentP.setComponent(componentName);
                break;
            }
            i5++;
        }
        return (intentP == null && i(context)) ? ic.d.x(context.getPackageName()) : intentP;
    }

    @Override // fc.b
    public final ic.c d() {
        return ic.c.f36943a;
    }

    @Override // fc.b
    public final String e(Context context) {
        return null;
    }

    @Override // fc.b
    public final int f() {
        return R.drawable.xiaomi;
    }

    @Override // fc.b
    public final int h() {
        return R.drawable.xiaomi;
    }

    @Override // fc.b
    public final boolean i(Context context) {
        return a(context) != null;
    }

    @Override // fc.b
    public final boolean j() {
        return false;
    }

    @Override // fc.b
    public final boolean k(Context context) {
        return c(context) != null;
    }

    @Override // fc.b
    public final boolean l() {
        String str = Build.BRAND;
        ic.c cVar = ic.c.f36943a;
        return str.equalsIgnoreCase(cVar.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar.toString());
    }
}
