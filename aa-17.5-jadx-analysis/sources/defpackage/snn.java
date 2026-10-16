package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionThrottlingConfig;

/* loaded from: classes.dex */
public final class snn extends snh {
    public final IBinder g;
    final /* synthetic */ snp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snn(snp snpVar, int i, IBinder iBinder, Bundle bundle) {
        super(snpVar, i, bundle);
        this.h = snpVar;
        this.g = iBinder;
    }

    @Override // defpackage.snh
    protected final void a(ConnectionResult connectionResult) {
        wyd wydVar = this.h.s;
        if (wydVar != null) {
            wydVar.c(connectionResult);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, slz] */
    @Override // defpackage.snh
    protected final boolean b() throws RemoteException {
        ConnectionInfo connectionInfo;
        try {
            IBinder iBinder = this.g;
            if (iBinder == null) {
                throw new NullPointerException("null reference");
            }
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            snp snpVar = this.h;
            if (!snpVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + snpVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = snpVar.b(iBinder);
            if (iInterfaceB == null || !(snpVar.F(2, 4, iInterfaceB) || snpVar.F(3, 4, iInterfaceB))) {
                return false;
            }
            Bundle bundle = null;
            snpVar.l = null;
            ConnectionThrottlingConfig connectionThrottlingConfig = (!snpVar.C() || (connectionInfo = snpVar.n) == null) ? null : connectionInfo.e;
            if (connectionThrottlingConfig != null) {
                bundle = new Bundle();
                bundle.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", spu.k(connectionThrottlingConfig));
            }
            wyd wydVar = snpVar.t;
            if (wydVar == null) {
                return true;
            }
            wydVar.a.a(bundle);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
