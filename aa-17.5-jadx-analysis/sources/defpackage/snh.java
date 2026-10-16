package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public abstract class snh extends snj {
    public final int a;
    public final Bundle b;
    final /* synthetic */ snp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snh(snp snpVar, int i, Bundle bundle) {
        super(snpVar, true);
        this.c = snpVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean b();

    @Override // defpackage.snj
    protected final /* bridge */ /* synthetic */ void c() {
        snp snpVar = this.c;
        int i = this.a;
        if (i != 0) {
            snpVar.G(1, null);
            Bundle bundle = this.b;
            a(new ConnectionResult(1, i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null, null));
        } else {
            if (b()) {
                return;
            }
            snpVar.G(1, null);
            a(new ConnectionResult(1, 8, null, null, null));
        }
    }
}
