package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes2.dex */
public final class fmk implements fmt {
    public final ConnectivityManager a;

    public fmk(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.fmt
    public final aiyk a(fja fjaVar) {
        fjaVar.getClass();
        return new aiyd(new fmj(fjaVar, this, null));
    }

    @Override // defpackage.fmt
    public final boolean b(fod fodVar) {
        return (fodVar.j.a() == null && fodVar.j.j == 1) ? false : true;
    }

    @Override // defpackage.fmt
    public final boolean c(fod fodVar) {
        if (b(fodVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
