package defpackage;

import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class qos extends qoo {
    final /* synthetic */ nok a;

    public qos(nok nokVar) {
        this.a = nokVar;
    }

    @Override // defpackage.qoo
    public final void a(Status status, GetAccountsResponse getAccountsResponse) {
        qou.d(status, getAccountsResponse, this.a);
    }
}
