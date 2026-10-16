package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ff.AbstractC2641B;

/* loaded from: classes5.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final ComponentName[] f35286a = {new ComponentName("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"), new ComponentName("com.oneplus.security", "com.oneplus.security.autorun.AutorunMainActivity")};

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName[] f35287b = {new ComponentName("com.oneplus.security", "com.oneplus.security.highpowerapp.view.HighPowerAppActivity"), new ComponentName("com.oneplus.security", "com.oneplus.security.cleanbackground.view.ManageBackgroundAppListActivity")};

    @Override // fc.b
    public final Intent a(Context context) {
        for (ComponentName componentName : f35286a) {
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
        ComponentName[] componentNameArr = f35287b;
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
        return intentP == null ? ic.d.x(context.getPackageName()) : intentP;
    }

    @Override // fc.b
    public final ic.c d() {
        return ic.c.f36948f;
    }

    @Override // fc.b
    public final String e(Context context) {
        return null;
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
        c(context);
        return true;
    }

    @Override // fc.b
    public final boolean l() {
        String str = Build.BRAND;
        ic.c cVar = ic.c.f36948f;
        return str.equalsIgnoreCase(cVar.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar.toString());
    }
}
