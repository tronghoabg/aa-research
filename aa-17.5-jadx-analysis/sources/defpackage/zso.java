package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class zso extends zsy {
    public final zu a;
    public final hqz b;

    public zso(zu zuVar, hqz hqzVar) {
        this.a = zuVar;
        this.b = hqzVar;
    }

    @Override // defpackage.zsy, defpackage.hqz
    public final void a(hqt hqtVar, hrc hrcVar) {
        String str = zsy.c;
        if (zrn.e(str, 3)) {
            Log.d(str, "REQUEST: " + zsy.e(hqtVar) + "\nERROR: " + zsy.d(hrcVar));
        }
        hqz hqzVar = this.b;
        hqtVar.e("post-error");
        ((hqm) hqzVar).a.execute(new hql(hqtVar, new scz(hrcVar), (Runnable) null, 0));
    }

    @Override // defpackage.zsy, defpackage.hqz
    public final void b(hqt hqtVar, scz sczVar) {
        String str = zsy.c;
        if (zrn.e(str, 3)) {
            Log.d(str, "REQUEST: " + zsy.e(hqtVar) + "\nRESPONSE: " + zsy.f(sczVar));
        }
        if (hqtVar.i && sczVar.d()) {
            this.a.c(hqtVar.c, sczVar);
        }
        ((hqm) this.b).c(hqtVar, sczVar, null);
    }
}
