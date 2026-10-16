package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class snm implements snk {
    final /* synthetic */ snp a;

    public snm(snp snpVar) {
        this.a = snpVar;
    }

    @Override // defpackage.snk
    public final void a(ConnectionResult connectionResult) {
        boolean zC = connectionResult.c();
        snp snpVar = this.a;
        if (zC) {
            snpVar.s(null, ((snw) snpVar).w);
            return;
        }
        wyd wydVar = snpVar.s;
        if (wydVar != null) {
            wydVar.c(connectionResult);
        }
    }
}
