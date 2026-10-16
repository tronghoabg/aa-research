package defpackage;

import android.app.PendingIntent;
import android.content.Intent;

/* loaded from: classes2.dex */
final class mnu extends mnz {
    final /* synthetic */ Intent a;
    final /* synthetic */ PendingIntent b;

    public mnu(Intent intent, PendingIntent pendingIntent) {
        this.a = intent;
        this.b = pendingIntent;
    }

    @Override // defpackage.mnz
    public final /* bridge */ /* synthetic */ void a(moa moaVar) {
        mlq.f().a(this.a, this.b);
    }
}
