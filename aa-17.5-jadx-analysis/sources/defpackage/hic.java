package defpackage;

import android.os.IBinder;
import androidx.car.app.constraints.IConstraintHost;

/* loaded from: classes2.dex */
public final class hic extends fud {
    private final IConstraintHost.Stub c;

    public hic(geu geuVar) {
        super(geuVar, "CarApp.H.Con");
        this.c = new hib(this);
    }

    @Override // defpackage.fuh
    public final /* bridge */ /* synthetic */ IBinder q() {
        g();
        return this.c;
    }
}
