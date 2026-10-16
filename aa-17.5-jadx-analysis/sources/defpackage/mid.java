package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.apps.auto.components.projectionstate.ProjectionStateService;

/* loaded from: classes.dex */
public final class mid implements lhg {
    public static final yph a = yph.c("GH.PrjctStateOwnr");
    public final Context c;
    public mib d;
    public boolean e;
    private boolean g;
    private final ServiceConnection f = new mic(this);
    public final mhy b = new mhx(this);

    public mid(Context context) {
        this.c = context.getApplicationContext();
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        Context context = this.c;
        this.g = context.bindService(new Intent().setClass(context, ProjectionStateService.class), this.f, 1);
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.e) {
            if (this.g) {
                this.g = false;
                this.c.unbindService(this.f);
            }
            this.e = false;
            this.c.sendBroadcast(new Intent("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED").addFlags(268435456));
        }
    }
}
