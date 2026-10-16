package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahua {
    /* JADX INFO: Access modifiers changed from: private */
    public static final aiin createCapturedIfNeeded(aiin aiinVar, agee ageeVar) {
        if (ageeVar == null || aiinVar.getProjectionKind() == aijg.INVARIANT) {
            return aiinVar;
        }
        if (ageeVar.getVariance() != aiinVar.getProjectionKind()) {
            return new aiip(createCapturedType(aiinVar));
        }
        if (!aiinVar.isStarProjection()) {
            return new aiip(aiinVar.getType());
        }
        aiei aieiVar = aidz.NO_LOCKS;
        aieiVar.getClass();
        return new aiip(new aigt(aieiVar, new ahty(aiinVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl createCapturedIfNeeded$lambda$0(aiin aiinVar) {
        aigl type = aiinVar.getType();
        type.getClass();
        return type;
    }

    public static final aigl createCapturedType(aiin aiinVar) {
        aiinVar.getClass();
        return new ahtv(aiinVar, null, false, null, 14, null);
    }

    public static final boolean isCaptured(aigl aiglVar) {
        aiglVar.getClass();
        return aiglVar.getConstructor() instanceof ahtw;
    }

    public static final aiit wrapWithCapturingSubstitution(aiit aiitVar, boolean z) {
        aiitVar.getClass();
        if (!(aiitVar instanceof aigf)) {
            return new ahtz(aiitVar, z);
        }
        aigf aigfVar = (aigf) aiitVar;
        agee[] parameters = aigfVar.getParameters();
        aiin[] arguments = aigfVar.getArguments();
        agee[] parameters2 = aigfVar.getParameters();
        arguments.getClass();
        parameters2.getClass();
        int iMin = Math.min(arguments.length, parameters2.length);
        ArrayList<aezu> arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new aezu(arguments[i], parameters2[i]));
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        for (aezu aezuVar : arrayList) {
            arrayList2.add(createCapturedIfNeeded((aiin) aezuVar.a, (agee) aezuVar.b));
        }
        return new aigf(parameters, (aiin[]) arrayList2.toArray(new aiin[0]), z);
    }
}
