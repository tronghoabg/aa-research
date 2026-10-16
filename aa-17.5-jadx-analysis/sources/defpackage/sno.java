package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class sno extends snh {
    final /* synthetic */ snp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sno(snp snpVar, int i, Bundle bundle) {
        super(snpVar, i, bundle);
        this.g = snpVar;
    }

    @Override // defpackage.snh
    protected final void a(ConnectionResult connectionResult) {
        this.g.f.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.snh
    protected final boolean b() {
        this.g.f.a(ConnectionResult.a);
        return true;
    }
}
