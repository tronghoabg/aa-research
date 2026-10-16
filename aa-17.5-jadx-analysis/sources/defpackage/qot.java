package defpackage;

import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class qot extends qoo {
    final /* synthetic */ GetTokenRequest a;
    final /* synthetic */ nok b;

    public qot(GetTokenRequest getTokenRequest, nok nokVar) {
        this.a = getTokenRequest;
        this.b = nokVar;
    }

    @Override // defpackage.qoo
    public final void b(Status status, GetTokenResponse getTokenResponse) {
        boolean z = this.a.n;
        nok nokVar = this.b;
        if (z) {
            qou.c(status, getTokenResponse, nokVar);
        } else {
            qou.d(status, getTokenResponse, nokVar);
        }
    }

    @Override // defpackage.qoo
    public final void c(Status status, GetTokenResponse getTokenResponse) {
        boolean z = this.a.n;
        nok nokVar = this.b;
        if (z) {
            qou.c(status, getTokenResponse, nokVar);
        } else {
            qou.d(status, getTokenResponse, nokVar);
        }
    }
}
