package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ff.AbstractC2641B;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final ComponentName[] f35288a = {new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity"), new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity"), new ComponentName("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity"), new ComponentName("com.color.safecenter", "com.color.safecenter.permission.startup.StartupAppListActivity"), new ComponentName("com.color.safecenter", "com.color.safecenter.startupapp.StartupAppListActivity")};

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName[] f35289b = {new ComponentName("com.color.oppoguardelfr", "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"), new ComponentName("com.color.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity")};

    @Override // fc.b
    public final Intent a(Context context) {
        for (ComponentName componentName : f35288a) {
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
        for (ComponentName componentName : f35289b) {
            if (AbstractC2641B.A(context, componentName)) {
                Intent intentP = AbstractC2641B.p();
                intentP.setComponent(componentName);
                return intentP;
            }
        }
        return null;
    }

    @Override // fc.b
    public final ic.c d() {
        return ic.c.f36945c;
    }

    @Override // fc.b
    public final String e(Context context) {
        return null;
    }

    @Override // fc.b
    public final int f() {
        return 0;
    }

    @Override // fc.b
    public final int h() {
        return 0;
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
        ic.c cVar = ic.c.f36945c;
        return str.equalsIgnoreCase(cVar.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar.toString());
    }
}
