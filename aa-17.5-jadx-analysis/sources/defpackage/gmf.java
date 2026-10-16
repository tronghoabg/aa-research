package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import androidx.car.app.ICarApp;

/* loaded from: classes2.dex */
final class gmf implements ServiceConnection {
    final /* synthetic */ gmg a;
    private boolean b;

    public gmf(gmg gmgVar) {
        this.a = gmgVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        gks.c("CarApp.H", "App binding died: %s", componentName.flattenToShortString());
        gmg gmgVar = this.a;
        Handler handler = gmgVar.b;
        handler.removeMessages(2);
        gmgVar.f(glx.a);
        gmgVar.e();
        gmgVar.g.B().a(11);
        if (gmgVar.a) {
            handler.sendMessageDelayed(handler.obtainMessage(2), 500L);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        gdp gdpVar = new gdp();
        gdpVar.b = "Null binding from app";
        this.a.h(new gdq(gdpVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = 0;
        gks.c("CarApp.H", "App service connected: %s", componentName.flattenToShortString());
        gmg gmgVar = this.a;
        gmgVar.f.d(gnr.b(32, componentName));
        glf glfVar = gmgVar.n;
        if (glfVar != null) {
            glfVar.a();
        }
        this.b = true;
        gmgVar.e();
        gmgVar.h = ICarApp.Stub.asInterface(iBinder);
        gmgVar.g.t().c(new glz(gmgVar, i), gnk.b, new gma(this, gmgVar.h, i));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gks.c("CarApp.H", "App service disconnected: %s", componentName.flattenToShortString());
        gmg gmgVar = this.a;
        gmgVar.f.d(gnr.b(33, componentName));
        if (!this.b || !gmgVar.a) {
            gdp gdpVar = new gdp();
            gdpVar.b = "The app has crashed multiple times";
            gmgVar.h(new gdq(gdpVar));
        } else {
            this.b = false;
            gmgVar.f(glx.b);
            gmgVar.e();
            gmgVar.g.B().a(11);
        }
    }
}
