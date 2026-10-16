package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* loaded from: classes2.dex */
final class sts extends stj {
    final /* synthetic */ ssz a;
    final /* synthetic */ nok b;

    public sts(nok nokVar, ssz sszVar) {
        this.b = nokVar;
        this.a = sszVar;
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
