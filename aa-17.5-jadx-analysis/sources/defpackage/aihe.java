package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aihe extends aiig {
    final /* synthetic */ List<aiid> $typeParameters;

    /* JADX WARN: Multi-variable type inference failed */
    public aihe(List<? extends aiid> list) {
        this.$typeParameters = list;
    }

    @Override // defpackage.aiig
    public aiin get(aiid aiidVar) {
        aiidVar.getClass();
        if (!this.$typeParameters.contains(aiidVar)) {
            return null;
        }
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        declarationDescriptor.getClass();
        return aijc.makeStarProjection((agee) declarationDescriptor);
    }
}
