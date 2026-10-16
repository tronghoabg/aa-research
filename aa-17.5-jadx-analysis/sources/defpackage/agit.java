package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agit extends aghm implements agiq {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agit.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0)};
    public static final agis Companion = new agis(null);
    private final aiei storageManager;
    private final aged typeAliasDescriptor;
    private agaz underlyingConstructorDescriptor;
    private final aied withDispatchReceiver$delegate;

    private agit(aiei aieiVar, aged agedVar, agaz agazVar, agiq agiqVar, agfk agfkVar, agaw agawVar, agdx agdxVar) {
        super(agedVar, agiqVar, agfkVar, ahnm.INIT, agawVar, agdxVar);
        this.storageManager = aieiVar;
        this.typeAliasDescriptor = agedVar;
        setActual(getTypeAliasDescriptor().isActual());
        this.withDispatchReceiver$delegate = aieiVar.createNullableLazyValue(new agir(this, agazVar));
        this.underlyingConstructorDescriptor = agazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agit withDispatchReceiver_delegate$lambda$0(agit agitVar, agaz agazVar) {
        aiei aieiVar = agitVar.storageManager;
        aged typeAliasDescriptor = agitVar.getTypeAliasDescriptor();
        agfk annotations = agazVar.getAnnotations();
        agaw kind = agazVar.getKind();
        kind.getClass();
        agdx source = agitVar.getTypeAliasDescriptor().getSource();
        source.getClass();
        agit agitVar2 = new agit(aieiVar, typeAliasDescriptor, agazVar, agitVar, annotations, kind, source);
        aiiy typeSubstitutorForUnderlyingClass = Companion.getTypeSubstitutorForUnderlyingClass(agitVar.getTypeAliasDescriptor());
        if (typeSubstitutorForUnderlyingClass == null) {
            return null;
        }
        agdq dispatchReceiverParameter = agazVar.getDispatchReceiverParameter();
        agdq agdqVarSubstitute = dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(typeSubstitutorForUnderlyingClass) : null;
        List<agdq> contextReceiverParameters = agazVar.getContextReceiverParameters();
        contextReceiverParameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(contextReceiverParameters, 10));
        Iterator<T> it = contextReceiverParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((agdq) it.next()).substitute(typeSubstitutorForUnderlyingClass));
        }
        agitVar2.initialize(null, agdqVarSubstitute, arrayList, agitVar.getTypeAliasDescriptor().getDeclaredTypeParameters(), agitVar.getValueParameters(), agitVar.getReturnType(), agcq.FINAL, agitVar.getTypeAliasDescriptor().getVisibility());
        return agitVar2;
    }

    @Override // defpackage.aghm, defpackage.agax
    public agiq copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agbiVar.getClass();
        agcqVar.getClass();
        agccVar.getClass();
        agawVar.getClass();
        agci<? extends agcj> agciVarNewCopyBuilder = newCopyBuilder();
        agciVarNewCopyBuilder.setOwner(agbiVar);
        agciVarNewCopyBuilder.setModality(agcqVar);
        agciVarNewCopyBuilder.setVisibility(agccVar);
        agciVarNewCopyBuilder.setKind(agawVar);
        agciVarNewCopyBuilder.setCopyOverrides(z);
        agcj agcjVarBuild = agciVarNewCopyBuilder.build();
        agcjVarBuild.getClass();
        return (agiq) agcjVarBuild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aghm
    public agit createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        agbiVar.getClass();
        agawVar.getClass();
        agfkVar.getClass();
        agdxVar.getClass();
        return new agit(this.storageManager, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, agfkVar, agaw.DECLARATION, agdxVar);
    }

    @Override // defpackage.agbh
    public agba getConstructedClass() {
        agba constructedClass = getUnderlyingConstructorDescriptor().getConstructedClass();
        constructedClass.getClass();
        return constructedClass;
    }

    @Override // defpackage.aghm, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agiq getOriginal() {
        agcj original = super.getOriginal();
        original.getClass();
        return (agiq) original;
    }

    @Override // defpackage.aghm, defpackage.agav
    public aigl getReturnType() {
        aigl returnType = super.getReturnType();
        returnType.getClass();
        return returnType;
    }

    public aged getTypeAliasDescriptor() {
        return this.typeAliasDescriptor;
    }

    @Override // defpackage.agiq
    public agaz getUnderlyingConstructorDescriptor() {
        return this.underlyingConstructorDescriptor;
    }

    @Override // defpackage.agbh
    public boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    @Override // defpackage.aghm, defpackage.agcj, defpackage.agea
    public agiq substitute(aiiy aiiyVar) {
        aiiyVar.getClass();
        agcj agcjVarSubstitute = super.substitute(aiiyVar);
        agcjVarSubstitute.getClass();
        agit agitVar = (agit) agcjVarSubstitute;
        agaz agazVarSubstitute = getUnderlyingConstructorDescriptor().getOriginal().substitute(aiiy.create(agitVar.getReturnType()));
        if (agazVarSubstitute == null) {
            return null;
        }
        agitVar.underlyingConstructorDescriptor = agazVarSubstitute;
        return agitVar;
    }

    @Override // defpackage.aggz, defpackage.agbi
    public aged getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    public /* synthetic */ agit(aiei aieiVar, aged agedVar, agaz agazVar, agiq agiqVar, agfk agfkVar, agaw agawVar, agdx agdxVar, afeu afeuVar) {
        this(aieiVar, agedVar, agazVar, agiqVar, agfkVar, agawVar, agdxVar);
    }
}
