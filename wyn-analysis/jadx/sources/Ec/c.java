package ec;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public class c implements InterfaceC3885b, InterfaceC3964a, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public Context f34638a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f34639b;

    /* renamed from: c, reason: collision with root package name */
    public C4281r f34640c;

    /* renamed from: d, reason: collision with root package name */
    public String f34641d;

    /* renamed from: e, reason: collision with root package name */
    public String f34642e;

    /* renamed from: f, reason: collision with root package name */
    public String f34643f;

    /* renamed from: g, reason: collision with root package name */
    public String f34644g;

    public final boolean a() {
        WeakReference weakReference = new WeakReference(this.f34638a);
        if (weakReference.get() != null ? PreferenceManager.getDefaultSharedPreferences((Context) weakReference.get()).contains("IS_MAN_AUTO_START_ACCEPTED") : false) {
            return ((Boolean) AbstractC4345a.w(this.f34638a, "IS_MAN_AUTO_START_ACCEPTED")).booleanValue();
        }
        boolean z2 = !gc.b.z(this.f34638a, 1);
        AbstractC4345a.J(this.f34638a, "IS_MAN_AUTO_START_ACCEPTED", Boolean.valueOf(z2));
        return z2;
    }

    public final boolean b() {
        WeakReference weakReference = new WeakReference(this.f34638a);
        if (weakReference.get() != null ? PreferenceManager.getDefaultSharedPreferences((Context) weakReference.get()).contains("IS_MAN_BATTERY_OPTIMIZATION_ACCEPTED") : false) {
            return ((Boolean) AbstractC4345a.w(this.f34638a, "IS_MAN_BATTERY_OPTIMIZATION_ACCEPTED")).booleanValue();
        }
        boolean z2 = !gc.b.z(this.f34638a, 3);
        AbstractC4345a.J(this.f34638a, "IS_MAN_BATTERY_OPTIMIZATION_ACCEPTED", Boolean.valueOf(z2));
        return z2;
    }

    public final void c() {
        if (tg.b.G(this.f34638a)) {
            Log.i("BO:DisableOptimization", "Battery optimization is already disabled");
            return;
        }
        Context context = this.f34638a;
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + context.getApplicationContext().getPackageName()));
        intent.setFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getApplicationContext().getPackageName(), null));
        }
        this.f34638a.startActivity(intent);
    }

    public final void d(boolean z2) {
        tg.b.R(this.f34639b, 3, this.f34643f, this.f34644g, new b(this, z2, 2), new b(this, z2, 3));
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        Activity activity = (Activity) ((s1) interfaceC3965b).f43896a;
        this.f34639b = activity;
        this.f34638a = activity.getApplicationContext();
        this.f34640c.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f34640c = new C4281r(c3884a.f44188c, "in.jvapps.disable_battery_optimization");
        this.f34638a = c3884a.f44186a;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f34639b = null;
        this.f34640c.b(null);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f34639b = null;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Object obj;
        String str = c4278o.f46759a;
        str.getClass();
        obj = c4278o.f46760b;
        switch (str) {
            case "isAutoStartEnabled":
                ((g) interfaceC4280q).a(Boolean.valueOf(a()));
                break;
            case "isBatteryOptimizationDisabled":
                ((g) interfaceC4280q).a(Boolean.valueOf(tg.b.G(this.f34638a)));
                break;
            case "showEnableAutoStart":
                try {
                    List list = (List) obj;
                    if (list == null) {
                        Log.e("BO:DisableOptimization", "Unable to request enableAutoStart. Arguments are null");
                        ((g) interfaceC4280q).a(Boolean.FALSE);
                        break;
                    } else {
                        this.f34641d = String.valueOf(list.get(0));
                        String strValueOf = String.valueOf(list.get(1));
                        this.f34642e = strValueOf;
                        tg.b.R(this.f34639b, 1, this.f34641d, strValueOf, new C2510a(this), new C2510a(this));
                        ((g) interfaceC4280q).a(Boolean.TRUE);
                        break;
                    }
                } catch (Exception e7) {
                    Log.e("BO:DisableOptimization", "Exception in showEnableAutoStart. " + e7.toString());
                    ((g) interfaceC4280q).a(Boolean.FALSE);
                    return;
                }
            case "disableAllOptimizations":
                try {
                    List list2 = (List) obj;
                    if (list2 == null) {
                        Log.e("BO:DisableOptimization", "Unable to request disable all optimizations. Arguments are null");
                        ((g) interfaceC4280q).a(Boolean.FALSE);
                        break;
                    } else {
                        this.f34641d = String.valueOf(list2.get(0));
                        this.f34642e = String.valueOf(list2.get(1));
                        this.f34643f = String.valueOf(list2.get(2));
                        this.f34644g = String.valueOf(list2.get(3));
                        boolean zB = b();
                        if (!a()) {
                            tg.b.R(this.f34639b, 1, this.f34641d, this.f34642e, new b(this, zB, 0), new b(this, zB, 1));
                        } else if (zB) {
                            c();
                        } else {
                            d(true);
                        }
                        ((g) interfaceC4280q).a(Boolean.TRUE);
                        break;
                    }
                } catch (Exception e10) {
                    Log.e("BO:DisableOptimization", "Exception in disableAllOptimizations. " + e10.toString());
                    ((g) interfaceC4280q).a(Boolean.FALSE);
                    return;
                }
            case "isAllOptimizationsDisabled":
                ((g) interfaceC4280q).a(Boolean.valueOf(a() && tg.b.G(this.f34638a) && b()));
                break;
            case "isManBatteryOptimizationDisabled":
                ((g) interfaceC4280q).a(Boolean.valueOf(b()));
                break;
            case "showDisableBatteryOptimization":
                try {
                    c();
                    ((g) interfaceC4280q).a(Boolean.TRUE);
                    break;
                } catch (Exception e11) {
                    Log.e("BO:DisableOptimization", "Exception in showDisableBatteryOptimization. " + e11.toString());
                    ((g) interfaceC4280q).a(Boolean.FALSE);
                    return;
                }
            case "showDisableManBatteryOptimization":
                try {
                    List list3 = (List) obj;
                    if (list3 == null) {
                        Log.e("BO:DisableOptimization", "Unable to request disable manufacturer battery optimization. Arguments are null");
                        ((g) interfaceC4280q).a(Boolean.FALSE);
                        break;
                    } else {
                        this.f34643f = String.valueOf(list3.get(0));
                        this.f34644g = String.valueOf(list3.get(1));
                        d(false);
                        ((g) interfaceC4280q).a(Boolean.TRUE);
                        break;
                    }
                } catch (Exception e12) {
                    Log.e("BO:DisableOptimization", "Exception in showDisableManBatteryOptimization. " + e12.toString());
                    ((g) interfaceC4280q).a(Boolean.FALSE);
                    return;
                }
            default:
                ((g) interfaceC4280q).c();
                break;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        this.f34639b = (Activity) ((s1) interfaceC3965b).f43896a;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
    }
}
