package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agvw implements agwa {
    private final agvu c;
    private final agbi containingDeclaration;
    private final aieb<agzx, agyq> resolve;
    private final Map<agzx, Integer> typeParameters;
    private final int typeParametersIndexOffset;

    public agvw(agvu agvuVar, agbi agbiVar, agzy agzyVar, int i) {
        agvuVar.getClass();
        agbiVar.getClass();
        agzyVar.getClass();
        this.c = agvuVar;
        this.containingDeclaration = agbiVar;
        this.typeParametersIndexOffset = i;
        this.typeParameters = aiow.mapToIndex(agzyVar.getTypeParameters());
        this.resolve = agvuVar.getStorageManager().createMemoizedFunctionWithNullableValues(new agvv(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agyq resolve$lambda$0(agvw agvwVar, agzx agzxVar) {
        agzxVar.getClass();
        Integer num = agvwVar.typeParameters.get(agzxVar);
        if (num == null) {
            return null;
        }
        return new agyq(agvk.copyWithNewDefaultTypeQualifiers(agvk.child(agvwVar.c, agvwVar), agvwVar.containingDeclaration.getAnnotations()), agzxVar, agvwVar.typeParametersIndexOffset + num.intValue(), agvwVar.containingDeclaration);
    }

    @Override // defpackage.agwa
    public agee resolveTypeParameter(agzx agzxVar) {
        agzxVar.getClass();
        agyq agyqVarInvoke = this.resolve.invoke(agzxVar);
        return agyqVarInvoke != null ? agyqVarInvoke : this.c.getTypeParameterResolver().resolveTypeParameter(agzxVar);
    }
}
