package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public abstract class rlz extends Service {
    public rmi b;
    public InputConnection c;
    public boolean d;
    public rmb f;
    public final rme e = new rme(this);
    public final Handler a = new sss();

    public final void a() {
        if (omc.c("CAR.CLIENT.IME", 3)) {
            rrd.a("CAR.CLIENT.IME", null, "onEndInput");
        }
        this.d = false;
        rmb rmbVar = this.f;
        if (rmbVar != null) {
            rmbVar.a = false;
            this.f = null;
        }
        b();
        this.c = null;
    }

    protected abstract void b();

    public abstract void c(EditorInfo editorInfo, CarRegionId carRegionId);

    public abstract void d();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if ("com.google.android.gms.car.BIND_CAR_INPUT".equals(intent.getAction())) {
            return this.e;
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.removeCallbacksAndMessages(null);
    }
}
