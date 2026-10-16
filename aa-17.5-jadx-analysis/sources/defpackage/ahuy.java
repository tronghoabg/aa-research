package defpackage;

/* loaded from: classes3.dex */
public final class ahuy {
    private ahuy() {
    }

    public final ahuh<?> create(aigl aiglVar) {
        aiglVar.getClass();
        if (aigr.isError(aiglVar)) {
            return null;
        }
        int i = 0;
        aigl type = aiglVar;
        while (afye.isArray(type)) {
            type = ((aiin) woy.bN(type.getArguments())).getType();
            type.getClass();
            i++;
        }
        agbd declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agba) {
            ahnd classId = ahvz.getClassId(declarationDescriptor);
            return classId == null ? new ahvc(new ahuz(aiglVar)) : new ahvc(classId, i);
        }
        if (declarationDescriptor instanceof agee) {
            return new ahvc(ahnd.Companion.topLevel(afyn.any.toSafe()), 0);
        }
        return null;
    }

    public /* synthetic */ ahuy(afeu afeuVar) {
        this();
    }
}
