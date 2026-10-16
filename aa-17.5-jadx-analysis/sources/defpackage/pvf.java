package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pvf implements pxc {
    private final ackk a;
    private final Executor b;

    public pvf(ackk ackkVar, Executor executor) {
        this.a = ackkVar;
        this.b = executor;
    }

    @Override // defpackage.pxc
    public final pxb a(abow abowVar, pwh pwhVar, pwp pwpVar) {
        return new pve(abowVar, pwpVar, this.a, pwhVar, this.b);
    }

    @Override // defpackage.pxc
    public final /* synthetic */ void b() {
    }
}
