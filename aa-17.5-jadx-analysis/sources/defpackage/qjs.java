package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qjs implements mkd {
    public static final yph a = yph.c("GH.SharedServiceClient");
    public mka b;
    public final IBinder c = new Binder();
    private mkg d;

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        Context context = mki.a.c;
        woy.Z(this.d == null);
        mkg mkgVarA = ((mkf) mki.a.i(mkf.class)).a(context, new qjq(this));
        this.d = mkgVarA;
        mkgVarA.a();
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        mka mkaVar = this.b;
        if (mkaVar != null) {
            try {
                mkaVar.g(this.c);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7415)).u("Error stopping shared service");
            }
        }
        mkg mkgVar = this.d;
        mkgVar.getClass();
        mkgVar.b();
        this.d = null;
    }
}
