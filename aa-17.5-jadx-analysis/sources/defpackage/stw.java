package defpackage;

import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* loaded from: classes2.dex */
final class stw extends stj {
    final /* synthetic */ Object a;
    final /* synthetic */ nok b;

    public stw(Object obj, nok nokVar) {
        this.a = obj;
        this.b = nokVar;
    }

    @Override // defpackage.stk
    public final void e(FusedLocationProviderResult fusedLocationProviderResult, ApiMetadata apiMetadata) {
        oni.m(fusedLocationProviderResult.a, this.a, this.b, apiMetadata);
    }

    @Override // defpackage.stk
    public final void f() {
    }
}
