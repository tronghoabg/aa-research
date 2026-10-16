package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class afyw extends aggh {
    public static final afyu Companion = new afyu(null);
    private static final ahnd functionClassId = new ahnd(afyo.BUILT_INS_PACKAGE_FQ_NAME, ahnj.identifier("Function"));
    private static final ahnd kFunctionClassId = new ahnd(afyo.KOTLIN_REFLECT_FQ_NAME, ahnj.identifier("KFunction"));
    private final int arity;
    private final agdc containingDeclaration;
    private final afyy functionKind;
    private final afzh functionTypeKind;
    private final afyz memberScope;
    private final List<agee> parameters;
    private final aiei storageManager;
    private final afyv typeConstructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyw(aiei aieiVar, agdc agdcVar, afzh afzhVar, int i) {
        super(aieiVar, afzhVar.numberedClassName(i));
        aieiVar.getClass();
        agdcVar.getClass();
        afzhVar.getClass();
        this.storageManager = aieiVar;
        this.containingDeclaration = agdcVar;
        this.functionTypeKind = afzhVar;
        this.arity = i;
        this.typeConstructor = new afyv(this);
        this.memberScope = new afyz(aieiVar, this);
        ArrayList arrayList = new ArrayList();
        afha afhaVar = new afha(1, i);
        ArrayList arrayList2 = new ArrayList(woy.bp(afhaVar, 10));
        afbk it = afhaVar.iterator();
        while (((afgz) it).a) {
            int iA = it.a();
            _init_$typeParameter(arrayList, this, aijg.IN_VARIANCE, "P" + iA);
            arrayList2.add(afak.a);
        }
        _init_$typeParameter(arrayList, this, aijg.OUT_VARIANCE, "R");
        this.parameters = woy.cf(arrayList);
        this.functionKind = afyy.Companion.getFunctionClassKind(this.functionTypeKind);
    }

    private static final void _init_$typeParameter(ArrayList<agee> arrayList, afyw afywVar, aijg aijgVar, String str) {
        arrayList.add(agiu.createWithDefaultBound(afywVar, agfk.Companion.getEMPTY(), false, aijgVar, ahnj.identifier(str), arrayList.size(), afywVar.storageManager));
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return agfk.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.arity;
    }

    @Override // defpackage.agba
    public /* bridge */ /* synthetic */ agba getCompanionObjectDescriptor() {
        return null;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        return this.parameters;
    }

    public final afzh getFunctionTypeKind() {
        return this.functionTypeKind;
    }

    @Override // defpackage.agba
    public agbb getKind() {
        return agbb.INTERFACE;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        return agcq.ABSTRACT;
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return agdxVar;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        return this.typeConstructor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aghw
    public afyz getUnsubstitutedMemberScope(aiju aijuVar) {
        aijuVar.getClass();
        return this.memberScope;
    }

    @Override // defpackage.agba
    public /* bridge */ /* synthetic */ agaz getUnsubstitutedPrimaryConstructor() {
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

    @Override // defpackage.agco
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
        return false;
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return false;
    }

    public String toString() {
        String strAsString = getName().asString();
        strAsString.getClass();
        return strAsString;
    }

    /* renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public Void m65getCompanionObjectDescriptor() {
        return null;
    }

    /* renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public Void m66getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // defpackage.agba
    public List<agaz> getConstructors() {
        return afbe.a;
    }

    @Override // defpackage.agba, defpackage.agbj, defpackage.agbi
    public agdc getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // defpackage.agba
    public ahxd getStaticScope() {
        return ahxd.INSTANCE;
    }
}
