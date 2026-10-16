package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class tdx implements zge {
    private final tdw a;

    public tdx(tdw tdwVar) {
        this.a = tdwVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        th.getClass();
        if (!(th instanceof CancellationException)) {
            throw new IllegalStateException("Unexpected exception while evaluating future", th);
        }
    }

    @Override // defpackage.zge
    public final void b(Object obj) {
        this.a.a(obj);
    }
}
