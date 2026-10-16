package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: classes2.dex */
final class rdi extends qwc {
    final /* synthetic */ zhc a;

    public rdi(zhc zhcVar) {
        this.a = zhcVar;
    }

    @Override // defpackage.qwd
    public final void e(BitmapTeleporter bitmapTeleporter) {
        zhc zhcVar = this.a;
        if (bitmapTeleporter == null) {
            zhcVar.o(new rbk(null, Status.c));
        } else {
            zhcVar.o(new rbk(bitmapTeleporter.a(), Status.a));
        }
    }
}
