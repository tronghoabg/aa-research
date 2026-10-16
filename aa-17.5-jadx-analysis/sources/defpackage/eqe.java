package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes2.dex */
public class eqe extends Service implements eqa {
    private final gjt a = new gjt(this);

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return (ept) this.a.b;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.p();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.q();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.r();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.s();
        super.onStart(intent, i);
    }
}
