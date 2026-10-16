package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class aiti extends aito {
    public final aisu a;

    public aiti(afck afckVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.bm(afckVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new aisu(false, aisy.a);
    }
}
