package defpackage;

import android.content.ComponentName;
import androidx.car.app.AppInfo;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class ggl implements gnp {
    private static final yob c = yob.c("com/android/car/libraries/apphost/config/HostConfig");
    public int a;
    public AppInfo b;
    private final ComponentName d;

    public ggl(ComponentName componentName) {
        int i = yl.a;
        this.a = 1;
        this.b = null;
        this.d = componentName;
    }

    public abstract int a();

    public abstract int b();

    public final int c() {
        if (this.b == null) {
            ((ynz) ((ynz) c.h().o(ypi.a, "CarApp.H")).ai(35)).w("mAppInfo null, returning default mNegotiatedApi %s", this.a);
        }
        return this.a;
    }

    public final int d(AppInfo appInfo) throws ggm {
        this.b = appInfo;
        int minCarAppApiLevel = appInfo.getMinCarAppApiLevel();
        int latestCarAppApiLevel = this.b.getLatestCarAppApiLevel();
        int iB = b();
        int iA = a();
        yob yobVar = c;
        yop yopVarF = yobVar.f();
        yos yosVar = ypi.a;
        ynz ynzVar = (ynz) ((ynz) ((ynz) yopVarF.o(yosVar, "CarApp.H")).l(5, TimeUnit.SECONDS)).ai(37);
        ComponentName componentName = this.d;
        ynzVar.S("App: [%s] app info: [%s] Host min api: [%d]  Host max api: [%d]", componentName.flattenToShortString(), this.b, Integer.valueOf(iB), Integer.valueOf(iA));
        if (minCarAppApiLevel > iA) {
            throw new ggm(2, a.bB(iA, minCarAppApiLevel, "App required min API level [", "] is higher than the host's max API level [", "]"));
        }
        if (iB > latestCarAppApiLevel) {
            throw new ggm(1, a.bB(latestCarAppApiLevel, iB, "Host required min API level [", "] is higher than the app's max API level [", "]"));
        }
        this.a = Math.min(latestCarAppApiLevel, iA);
        ((ynz) ((ynz) ((ynz) yobVar.e().o(yosVar, "CarApp.H")).l(5, TimeUnit.SECONDS)).ai(38)).K("App: [%s], Host negotiated api: [%d]", componentName.flattenToShortString(), this.a);
        return this.a;
    }

    public final void e(gnf gnfVar) {
        ((ynz) ((ynz) c.h().o(ypi.a, "CarApp.H")).ai(36)).R("App Max API: [%s], Host Max API: [%s], Negotiated api: [%s]", gnfVar.a(this.b == null ? 0 : r0.getLatestCarAppApiLevel()), gnfVar.a(a()), gnfVar.a(c()));
    }

    @Override // defpackage.gnp
    public final void p(PrintWriter printWriter) {
        throw null;
    }
}
