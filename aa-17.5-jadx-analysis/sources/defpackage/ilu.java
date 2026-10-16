package defpackage;

import android.content.Context;
import android.os.IBinder;

/* loaded from: classes.dex */
final class ilu implements IBinder.DeathRecipient {
    final /* synthetic */ qwg a;
    final /* synthetic */ int b;
    final /* synthetic */ ima c;

    public ilu(ima imaVar, qwg qwgVar, int i) {
        this.a = qwgVar;
        this.b = i;
        this.c = imaVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ima imaVar = this.c;
        imaVar.aQ(this.a.asBinder());
        Context context = imaVar.k;
        yyv yyvVar = yyv.CAR_CONNECTION_LISTENER_BINDER_DIED;
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(this.b);
        String str = packagesForUid != null ? packagesForUid[0] : "unknown";
        ((ype) ((ype) ima.b.h()).ai((char) 375)).y("Binder died: %s", str);
        imaVar.O.i(yyvVar, yyw.CS_BINDER_DIED, str);
    }
}
