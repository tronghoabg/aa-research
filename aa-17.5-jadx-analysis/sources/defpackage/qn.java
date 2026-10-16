package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.navigation.NavigationManager;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes2.dex */
public final class qn extends ContextWrapper {
    public final qr a;
    public final ept b;
    public VirtualDisplay c;
    public int d;
    public final bii e;
    public final ajdr f;

    protected qn(final ept eptVar, final qr qrVar) {
        super(null);
        ajdr ajdrVar = new ajdr(null, null, null);
        this.f = ajdrVar;
        this.c = null;
        final int i = 0;
        this.d = 0;
        this.a = qrVar;
        ajdrVar.h(AppManager.class, CloudRecognizerProtocolStrings.APP, new sh() { // from class: qi
            @Override // defpackage.sh
            public final sg a() {
                ept eptVar2 = eptVar;
                eptVar2.getClass();
                return new AppManager(this.a, qrVar, eptVar2);
            }
        });
        final int i2 = 1;
        ajdrVar.h(NavigationManager.class, "navigation", new sh() { // from class: ql
            @Override // defpackage.sh
            public final sg a() {
                int i3 = i2;
                if (i3 == 0) {
                    return rl.a((qn) eptVar);
                }
                Object obj = eptVar;
                if (i3 != 1) {
                    obj.getClass();
                    return new xu((ept) obj);
                }
                obj.getClass();
                return new NavigationManager((ept) obj);
            }
        });
        ajdrVar.h(qx.class, "screen", new sh() { // from class: qk
            @Override // defpackage.sh
            public final sg a() {
                int i3 = i2;
                if (i3 == 0) {
                    return re.a((qn) this, (qr) eptVar);
                }
                Object obj = eptVar;
                if (i3 == 1) {
                    return new qx((qn) this, (ept) obj);
                }
                obj.getClass();
                return new sl((qr) this, (ept) obj);
            }
        });
        ajdrVar.h(rc.class, "constraints", new qj());
        ajdrVar.h(rm.class, "hardware", new sh() { // from class: qk
            @Override // defpackage.sh
            public final sg a() {
                int i3 = i;
                if (i3 == 0) {
                    return re.a((qn) this, (qr) qrVar);
                }
                Object obj = qrVar;
                if (i3 == 1) {
                    return new qx((qn) this, (ept) obj);
                }
                obj.getClass();
                return new sl((qr) this, (ept) obj);
            }
        });
        ajdrVar.h(si.class, null, new sh() { // from class: ql
            @Override // defpackage.sh
            public final sg a() {
                int i3 = i;
                if (i3 == 0) {
                    return rl.a((qn) this);
                }
                Object obj = this;
                if (i3 != 1) {
                    obj.getClass();
                    return new xu((ept) obj);
                }
                obj.getClass();
                return new NavigationManager((ept) obj);
            }
        });
        final int i3 = 2;
        ajdrVar.h(xu.class, "suggestion", new sh() { // from class: ql
            @Override // defpackage.sh
            public final sg a() {
                int i32 = i3;
                if (i32 == 0) {
                    return rl.a((qn) eptVar);
                }
                Object obj = eptVar;
                if (i32 != 1) {
                    obj.getClass();
                    return new xu((ept) obj);
                }
                obj.getClass();
                return new NavigationManager((ept) obj);
            }
        });
        ajdrVar.h(sl.class, "media_playback", new sh() { // from class: qk
            @Override // defpackage.sh
            public final sg a() {
                int i32 = i3;
                if (i32 == 0) {
                    return re.a((qn) qrVar, (qr) eptVar);
                }
                Object obj = eptVar;
                if (i32 == 1) {
                    return new qx((qn) qrVar, (ept) obj);
                }
                obj.getClass();
                return new sl((qr) qrVar, (ept) obj);
            }
        });
        this.e = new bii(new lh(this, 8, null));
        this.b = eptVar;
        eptVar.c(new qm(this, qrVar));
    }

    public final Object a(Class cls) {
        return this.f.g(cls);
    }

    public final void b(Context context, Configuration configuration) {
        yj.a();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            systemService.getClass();
            VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
            this.c = virtualDisplayCreateVirtualDisplay;
            attachBaseContext(context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay()).createConfigurationContext(configuration));
        }
        d(configuration);
    }

    public final void c() {
        this.a.c("car", "finish", new qh(0));
    }

    public final void d(Configuration configuration) {
        yj.a();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        configuration.getClass();
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
