package defpackage;

import android.os.HandlerThread;

/* loaded from: classes2.dex */
final class prp extends HandlerThread implements psa {
    private final psb a;

    public prp(psb psbVar) {
        super(psbVar.M, psbVar.b());
        this.a = psbVar;
    }

    @Override // defpackage.psa
    public final psb a() {
        return this.a;
    }
}
