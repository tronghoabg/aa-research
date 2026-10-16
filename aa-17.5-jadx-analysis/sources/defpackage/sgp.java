package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.carsetup.BinderParcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sgp implements sgn {
    public static final ypf a = ols.R("CAR.AUTH");
    public final xyc b = wub.L(new rhy(9));

    @Override // defpackage.sgn
    public final void a(Intent intent) {
        intent.putExtra("service_handshake", new BinderParcel(new sgo()));
    }

    @Override // defpackage.sgn
    public final boolean b(Context context, Intent intent) {
        scc scaVar;
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("service_handshake");
        if (binderParcel != null) {
            IBinder iBinder = binderParcel.a;
            if (iBinder == null) {
                scaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IServiceHandshake");
                scaVar = iInterfaceQueryLocalInterface instanceof scc ? (scc) iInterfaceQueryLocalInterface : new sca(iBinder);
            }
            if (scaVar != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    scaVar.a(new sce(this, context, atomicBoolean));
                    return atomicBoolean.get();
                } catch (RemoteException e) {
                    a.g().p(e).ai(8921).u("Not completing service handshake due to error.");
                }
            }
        }
        return false;
    }
}
