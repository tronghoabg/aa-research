package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.wynauto.wyn.R;
import ff.AbstractC2641B;

/* loaded from: classes5.dex */
public final class f extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final ComponentName[] f35290a = {new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity"), new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"), new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity")};

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName[] f35291b = {new ComponentName("com.vivo.abe", "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity")};

    @Override // fc.b
    public final Intent a(Context context) {
        for (ComponentName componentName : f35290a) {
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
        for (ComponentName componentName : f35291b) {
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
        return ic.c.k;
    }

    @Override // fc.b
    public final String e(Context context) {
        return null;
    }

    @Override // fc.b
    public final int f() {
        return R.drawable.vivo_auto_start;
    }

    @Override // fc.b
    public final int h() {
        return R.drawable.vivo_power_save;
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
        ic.c cVar = ic.c.k;
        return str.equalsIgnoreCase(cVar.toString()) || Build.MANUFACTURER.equalsIgnoreCase(cVar.toString()) || Build.FINGERPRINT.toLowerCase().contains(cVar.toString());
    }
}
