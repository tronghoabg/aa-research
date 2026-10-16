package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final /* synthetic */ class aimb {
    public static final void a(aixx aixxVar, Throwable th) {
        CancellationException cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = aije.a("Channel was consumed, consumer had failed", th);
        }
        aixxVar.s(cancellationExceptionA);
    }

    public static /* synthetic */ aiic newTypeCheckerState$default(aimc aimcVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return aimcVar.newTypeCheckerState(z, z2, z3 & ((i & 4) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
    }
}
