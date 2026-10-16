package defpackage;

import androidx.car.app.SessionInfo;

/* loaded from: classes3.dex */
public abstract class tlq extends qg {
    public static final yob c = yob.c("com/google/android/libraries/car/remote/apps/template/RemoteScreenService");

    @Override // defpackage.qg
    public final qz c(SessionInfo sessionInfo) {
        return new tlp(sessionInfo, this);
    }

    @Override // defpackage.qg
    public final yk d() {
        yk ykVar = yk.a;
        ykVar.getClass();
        return ykVar;
    }

    protected abstract tlm e(String str, qz qzVar);
}
