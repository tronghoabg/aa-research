package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class zuf extends ContentObserver {
    final /* synthetic */ zug a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuf(zug zugVar, Handler handler) {
        super(handler);
        this.a = zugVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        zug zugVar = this.a;
        zuh zuhVar = zugVar.g;
        if (zuhVar.f()) {
            if (zuhVar.e()) {
                zugVar.c.N();
            }
            zwl zwlVar = zugVar.c;
            ztc ztcVarD = zwlVar.d();
            if (ztcVarD != null && ztcVarD.a) {
                ztcVarD.a();
                zwlVar.M();
                zugVar.d.b(false);
                zugVar.e.i(false);
            }
            zugVar.f.c();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, Uri.EMPTY);
    }
}
