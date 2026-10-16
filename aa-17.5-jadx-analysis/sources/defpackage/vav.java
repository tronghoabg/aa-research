package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class vav implements zge {
    final /* synthetic */ zgp a;
    final /* synthetic */ nok b;
    final /* synthetic */ erb c;

    public vav(nok nokVar, zgp zgpVar, erb erbVar) {
        this.b = nokVar;
        this.a = zgpVar;
        this.c = erbVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            ((swe) ((erb) this.c.a).a).q(null);
            return;
        }
        boolean z = th instanceof Exception;
        nok nokVar = this.b;
        if (z) {
            nokVar.b((Exception) th);
        } else {
            nokVar.b(new ExecutionException(th));
        }
    }

    @Override // defpackage.zge
    public final void b(Object obj) {
        this.b.c(obj);
    }
}
