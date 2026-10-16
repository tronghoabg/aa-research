package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.List;

/* loaded from: classes.dex */
public final class sdl {
    public static final yph a = yph.c("CAR.FRX.CHECKS");
    public final rob b;
    private final Context c;
    private final sdk d;
    private final sdj e;
    private final String f = "com.google.android.projection.gearhead";

    public sdl(Context context, rob robVar, sdk sdkVar, sdj sdjVar) {
        this.c = context;
        this.b = robVar;
        this.d = sdkVar;
        this.e = sdjVar;
    }

    public static final void f(wyd wydVar, yzy yzyVar) {
        ((joi) wydVar.a).f.O.b(rrc.h(yxy.FRX, yzz.PREFLIGHT, yzyVar).l());
    }

    public final List a() {
        return this.e.e();
    }

    public final boolean b() {
        try {
            if (this.c.getPackageManager().getPackageInfo(this.f, 0).versionCode < 17629000) {
                return true;
            }
            return this.d.a();
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 8789)).u("Gearhead isn't installed; this check must be in the wrong position");
            return true;
        }
    }

    public final boolean c() {
        rob robVar = this.b;
        if (!robVar.a()) {
            return false;
        }
        CarInfoInternal carInfoInternal = (CarInfoInternal) robVar.a;
        return carInfoInternal.o && carInfoInternal.p;
    }

    public final boolean d() {
        return ((CarInfoInternal) this.b.a).c;
    }

    public final boolean e() {
        return (c() && d() && b() && a().isEmpty()) ? false : true;
    }
}
