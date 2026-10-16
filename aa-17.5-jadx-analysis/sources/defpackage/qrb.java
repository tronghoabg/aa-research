package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class qrb implements Callable {
    final /* synthetic */ qrg a;

    public qrb(qrg qrgVar) {
        this.a = qrgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        yop yopVarAi = qrg.a.l().ai(7675);
        qrg qrgVar = this.a;
        yopVarAi.w("getInitializationStatus on main thread returns %d", qrgVar.b);
        return Integer.valueOf(qrgVar.b);
    }
}
