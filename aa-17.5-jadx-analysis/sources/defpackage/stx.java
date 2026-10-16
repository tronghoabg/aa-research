package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* loaded from: classes2.dex */
public final class stx extends stj {
    final /* synthetic */ stc a;
    final /* synthetic */ nok b;

    public stx(nok nokVar, stc stcVar) {
        this.b = nokVar;
        this.a = stcVar;
    }

    @Override // defpackage.stk
    public final void e(FusedLocationProviderResult fusedLocationProviderResult, ApiMetadata apiMetadata) {
        oni.m(fusedLocationProviderResult.a, null, this.b, apiMetadata);
    }

    @Override // defpackage.stk
    public final void f() throws RemoteException {
        this.a.e();
    }
}
