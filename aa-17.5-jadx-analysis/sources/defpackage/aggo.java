package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aggo extends aggz implements aged {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aggo.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)};
    private final aiec constructors$delegate;
    private List<? extends agee> declaredTypeParametersImpl;
    private final aiei storageManager;
    private final aggn typeConstructor;
    private final agcc visibilityImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggo(aiei aieiVar, agbi agbiVar, agfk agfkVar, ahnj ahnjVar, agdx agdxVar, agcc agccVar) {
        super(agbiVar, agfkVar, ahnjVar, agdxVar);
        aieiVar.getClass();
        agbiVar.getClass();
        agfkVar.getClass();
        ahnjVar.getClass();
        agdxVar.getClass();
        agccVar.getClass();
        this.storageManager = aieiVar;
        this.visibilityImpl = agccVar;
        this.constructors$delegate = aieiVar.createLazyValue(new aggk(this));
        this.typeConstructor = new aggn(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw computeDefaultType$lambda$0(aggo aggoVar, aiju aijuVar) {
        agbd agbdVarRefineDescriptor = aijuVar.refineDescriptor(aggoVar);
        if (agbdVarRefineDescriptor != null) {
            return agbdVarRefineDescriptor.getDefaultType();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isInner$lambda$0(aggo aggoVar, aijf aijfVar) {
        aijfVar.getClass();
        boolean z = false;
        if (!aigr.isError(aijfVar)) {
            agbd declarationDescriptor = aijfVar.getConstructor().getDeclarationDescriptor();
            if ((declarationDescriptor instanceof agee) && !affa.f(((agee) declarationDescriptor).getContainingDeclaration(), aggoVar)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        agbkVar.getClass();
        return agbkVar.visitTypeAliasDescriptor(this, d);
    }

    protected final aigw computeDefaultType() {
        ahxe unsubstitutedMemberScope;
        agba classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            unsubstitutedMemberScope = ahxd.INSTANCE;
        }
        return aijc.makeUnsubstitutedType(this, unsubstitutedMemberScope, new aggm(this));
    }

    @Override // defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        List list = this.declaredTypeParametersImpl;
        if (list != null) {
            return list;
        }
        affa.d("declaredTypeParametersImpl");
        return null;
    }

    @Override // defpackage.agco
    public agcq getModality() {
        return agcq.FINAL;
    }

    protected final aiei getStorageManager() {
        return this.storageManager;
    }

    public final Collection<agiq> getTypeAliasConstructors() {
        agba classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return afbe.a;
        }
        Collection<agaz> constructors = classDescriptor.getConstructors();
        constructors.getClass();
        ArrayList arrayList = new ArrayList();
        for (agaz agazVar : constructors) {
            aiei aieiVar = this.storageManager;
            agis agisVar = agit.Companion;
            agazVar.getClass();
            agiq agiqVarCreateIfAvailable = agisVar.createIfAvailable(aieiVar, this, agazVar);
            if (agiqVarCreateIfAvailable != null) {
                arrayList.add(agiqVarCreateIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        return this.typeConstructor;
    }

    protected abstract List<agee> getTypeConstructorTypeParameters();

    @Override // defpackage.agco, defpackage.agbm
    public agcc getVisibility() {
        return this.visibilityImpl;
    }

    public final void initialize(List<? extends agee> list) {
        list.getClass();
        this.declaredTypeParametersImpl = list;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return false;
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return false;
    }

    @Override // defpackage.agco
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.agbe
    public boolean isInner() {
        return aijc.contains(getUnderlyingType(), new aggl(this));
    }

    @Override // defpackage.aggy
    public String toString() {
        return "typealias ".concat(String.valueOf(getName().asString()));
    }

    @Override // defpackage.aggz, defpackage.aggy, defpackage.agbi
    public aged getOriginal() {
        return this;
    }
}
