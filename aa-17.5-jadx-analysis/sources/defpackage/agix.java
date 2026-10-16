package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agix extends agiy {
    private final aezr destructuringVariables$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agix(agav agavVar, agel agelVar, int i, agfk agfkVar, ahnj ahnjVar, aigl aiglVar, boolean z, boolean z2, boolean z3, aigl aiglVar2, agdx agdxVar, afdr<? extends List<? extends agem>> afdrVar) {
        super(agavVar, agelVar, i, agfkVar, ahnjVar, aiglVar, z, z2, z3, aiglVar2, agdxVar);
        agavVar.getClass();
        agfkVar.getClass();
        ahnjVar.getClass();
        aiglVar.getClass();
        agdxVar.getClass();
        afdrVar.getClass();
        this.destructuringVariables$delegate = woy.dG(afdrVar);
    }

    @Override // defpackage.agiy, defpackage.agel
    public agel copy(agav agavVar, ahnj ahnjVar, int i) {
        agavVar.getClass();
        ahnjVar.getClass();
        agfk annotations = getAnnotations();
        annotations.getClass();
        aigl type = getType();
        type.getClass();
        boolean zDeclaresDefaultValue = declaresDefaultValue();
        boolean zIsCrossinline = isCrossinline();
        boolean zIsNoinline = isNoinline();
        aigl varargElementType = getVarargElementType();
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return new agix(agavVar, null, i, annotations, ahnjVar, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, agdxVar, new agiw(this));
    }

    public final List<agem> getDestructuringVariables() {
        return (List) this.destructuringVariables$delegate.a();
    }
}
