package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class aiji {
    public static final Executor a(aitu aituVar) {
        Executor executorE;
        aiuz aiuzVar = aituVar instanceof aiuz ? (aiuz) aituVar : null;
        return (aiuzVar == null || (executorE = aiuzVar.e()) == null) ? new aiul(aituVar) : executorE;
    }

    public static final aitu b(Executor executor) {
        aitu aituVar;
        aiul aiulVar = executor instanceof aiul ? (aiul) executor : null;
        return (aiulVar == null || (aituVar = aiulVar.a) == null) ? new aiva(executor) : aituVar;
    }

    public static final aiic createClassicTypeCheckerState(boolean z, boolean z2, aimg aimgVar, aijs aijsVar, aiju aijuVar) {
        aimgVar.getClass();
        aijsVar.getClass();
        aijuVar.getClass();
        return new aiic(z, z2, false, true, aimgVar, aijsVar, aijuVar);
    }

    public static /* synthetic */ aiic createClassicTypeCheckerState$default(boolean z, boolean z2, aimg aimgVar, aijs aijsVar, aiju aijuVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aimgVar = aikj.INSTANCE;
        }
        if ((i & 8) != 0) {
            aijsVar = aijq.INSTANCE;
        }
        if ((i & 16) != 0) {
            aijuVar = aijt.INSTANCE;
        }
        return createClassicTypeCheckerState(z, z2 | (!((i & 2) == 0)), aimgVar, aijsVar, aijuVar);
    }
}
