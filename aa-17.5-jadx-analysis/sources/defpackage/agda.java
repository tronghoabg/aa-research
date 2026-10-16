package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class agda extends aggv {
    private final List<agee> declaredTypeParameters;
    private final boolean isInner;
    private final aifj typeConstructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agda(aiei aieiVar, agbi agbiVar, ahnj ahnjVar, boolean z, int i) {
        super(aieiVar, agbiVar, ahnjVar, agdx.NO_SOURCE, false);
        aieiVar.getClass();
        agbiVar.getClass();
        ahnjVar.getClass();
        this.isInner = z;
        afha afhaVarM = afpt.m(0, i);
        ArrayList arrayList = new ArrayList(woy.bp(afhaVarM, 10));
        afbk it = afhaVarM.iterator();
        while (((afgz) it).a) {
            int iA = it.a();
            arrayList.add(agiu.createWithDefaultBound(this, agfk.Companion.getEMPTY(), false, aijg.INVARIANT, ahnj.identifier("T" + iA), iA, aieiVar));
        }
        this.declaredTypeParameters = arrayList;
        this.typeConstructor = new aifj(this, agei.computeConstructorTypeParameters(this), woy.aO(ahvz.getModule(this).getBuiltIns().getAnyType()), aieiVar);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return agfk.Companion.getEMPTY();
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return null;
    }

    @Override // defpackage.agba
    public Collection<agaz> getConstructors() {
        return afbg.a;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        return this.declaredTypeParameters;
    }

    @Override // defpackage.agba
    public agbb getKind() {
        return agbb.CLASS;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        return agcq.FINAL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aghw
    public ahxd getUnsubstitutedMemberScope(aiju aijuVar) {
        aijuVar.getClass();
        return ahxd.INSTANCE;
    }

    @Override // defpackage.agba
    public agaz getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // defpackage.agba
    public agej<aigw> getValueClassRepresentation() {
        return null;
    }

    @Override // defpackage.agba, defpackage.agco, defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = agcb.PUBLIC;
        agccVar.getClass();
        return agccVar;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isCompanionObject() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isData() {
        return false;
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return false;
    }

    @Override // defpackage.aggv, defpackage.agco
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isFun() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.agbe
    public boolean isInner() {
        return this.isInner;
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.agba
    public ahxd getStaticScope() {
        return ahxd.INSTANCE;
    }

    @Override // defpackage.agbd
    public aifj getTypeConstructor() {
        return this.typeConstructor;
    }
}
