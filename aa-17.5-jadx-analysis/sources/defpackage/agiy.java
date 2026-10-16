package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class agiy extends agiz implements agel {
    public static final agiv Companion = new agiv(null);
    private final boolean declaresDefaultValue;
    private final int index;
    private final boolean isCrossinline;
    private final boolean isNoinline;
    private final agel original;
    private final aigl varargElementType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agiy(agav agavVar, agel agelVar, int i, agfk agfkVar, ahnj ahnjVar, aigl aiglVar, boolean z, boolean z2, boolean z3, aigl aiglVar2, agdx agdxVar) {
        super(agavVar, agfkVar, ahnjVar, aiglVar, agdxVar);
        agavVar.getClass();
        agfkVar.getClass();
        ahnjVar.getClass();
        aiglVar.getClass();
        agdxVar.getClass();
        this.index = i;
        this.declaresDefaultValue = z;
        this.isCrossinline = z2;
        this.isNoinline = z3;
        this.varargElementType = aiglVar2;
        this.original = agelVar == null ? this : agelVar;
    }

    public static final agiy createWithDestructuringDeclarations(agav agavVar, agel agelVar, int i, agfk agfkVar, ahnj ahnjVar, aigl aiglVar, boolean z, boolean z2, boolean z3, aigl aiglVar2, agdx agdxVar, afdr<? extends List<? extends agem>> afdrVar) {
        return Companion.createWithDestructuringDeclarations(agavVar, agelVar, i, agfkVar, ahnjVar, aiglVar, z, z2, z3, aiglVar2, agdxVar, afdrVar);
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        agbkVar.getClass();
        return agbkVar.visitValueParameterDescriptor(this, d);
    }

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
        return new agiy(agavVar, null, i, annotations, ahnjVar, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, agdxVar);
    }

    @Override // defpackage.agel
    public boolean declaresDefaultValue() {
        if (!this.declaresDefaultValue) {
            return false;
        }
        agav containingDeclaration = getContainingDeclaration();
        containingDeclaration.getClass();
        return ((agax) containingDeclaration).getKind().isReal();
    }

    @Override // defpackage.agem
    public /* bridge */ /* synthetic */ ahuh getCompileTimeInitializer() {
        return (ahuh) m79getCompileTimeInitializer();
    }

    @Override // defpackage.aggz, defpackage.agbi
    public agav getContainingDeclaration() {
        agbi containingDeclaration = super.getContainingDeclaration();
        containingDeclaration.getClass();
        return (agav) containingDeclaration;
    }

    @Override // defpackage.agel
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.agiz, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agel getOriginal() {
        agel agelVar = this.original;
        return agelVar == this ? this : agelVar.getOriginal();
    }

    @Override // defpackage.agiz, defpackage.agav
    public Collection<agel> getOverriddenDescriptors() {
        Collection<? extends agav> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((agav) it.next()).getValueParameters().get(getIndex()));
        }
        return arrayList;
    }

    @Override // defpackage.agel
    public aigl getVarargElementType() {
        return this.varargElementType;
    }

    @Override // defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = agcb.LOCAL;
        agccVar.getClass();
        return agccVar;
    }

    @Override // defpackage.agel
    public boolean isCrossinline() {
        return this.isCrossinline;
    }

    @Override // defpackage.agem
    public /* bridge */ boolean isLateInit() {
        return false;
    }

    @Override // defpackage.agel
    public boolean isNoinline() {
        return this.isNoinline;
    }

    @Override // defpackage.agem
    public boolean isVar() {
        return false;
    }

    @Override // defpackage.agiz, defpackage.agea
    public agel substitute(aiiy aiiyVar) {
        aiiyVar.getClass();
        if (aiiyVar.isEmpty()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: getCompileTimeInitializer, reason: collision with other method in class */
    public Void m79getCompileTimeInitializer() {
        return null;
    }
}
