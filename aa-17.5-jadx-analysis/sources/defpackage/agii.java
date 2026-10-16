package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class agii extends aggz implements agdm {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final agdn correspondingProperty;
    private agcj initialSignatureDescriptor;
    private boolean isDefault;
    private final boolean isExternal;
    private final boolean isInline;
    private final agaw kind;
    private final agcq modality;
    private agcc visibility;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agii(agcq agcqVar, agcc agccVar, agdn agdnVar, agfk agfkVar, ahnj ahnjVar, boolean z, boolean z2, boolean z3, agaw agawVar, agdx agdxVar) {
        super(agdnVar.getContainingDeclaration(), agfkVar, ahnjVar, agdxVar);
        if (agcqVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agdnVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(3);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        this.initialSignatureDescriptor = null;
        this.modality = agcqVar;
        this.visibility = agccVar;
        this.correspondingProperty = agdnVar;
        this.isDefault = z;
        this.isExternal = z2;
        this.isInline = z3;
        this.kind = agawVar;
    }

    @Override // defpackage.agax
    public agdm copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.agav
    public List<agdq> getContextReceiverParameters() {
        List<agdq> contextReceiverParameters = getCorrespondingProperty().getContextReceiverParameters();
        if (contextReceiverParameters == null) {
            $$$reportNull$$$0(14);
        }
        return contextReceiverParameters;
    }

    @Override // defpackage.agdm
    public agdn getCorrespondingProperty() {
        agdn agdnVar = this.correspondingProperty;
        if (agdnVar == null) {
            $$$reportNull$$$0(13);
        }
        return agdnVar;
    }

    @Override // defpackage.agav
    public agdq getDispatchReceiverParameter() {
        return getCorrespondingProperty().getDispatchReceiverParameter();
    }

    @Override // defpackage.agav
    public agdq getExtensionReceiverParameter() {
        return getCorrespondingProperty().getExtensionReceiverParameter();
    }

    @Override // defpackage.agcj
    public agcj getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    @Override // defpackage.agax
    public agaw getKind() {
        agaw agawVar = this.kind;
        if (agawVar == null) {
            $$$reportNull$$$0(6);
        }
        return agawVar;
    }

    @Override // defpackage.agco
    public agcq getModality() {
        agcq agcqVar = this.modality;
        if (agcqVar == null) {
            $$$reportNull$$$0(10);
        }
        return agcqVar;
    }

    @Override // defpackage.aggz, defpackage.aggy, defpackage.agbi
    public abstract agdm getOriginal();

    protected Collection<agdm> getOverriddenDescriptors(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (agdn agdnVar : getCorrespondingProperty().getOverriddenDescriptors()) {
            agbi getter = z ? agdnVar.getGetter() : agdnVar.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // defpackage.agav
    public List<agee> getTypeParameters() {
        List<agee> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(9);
        }
        return list;
    }

    @Override // defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        return null;
    }

    @Override // defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = this.visibility;
        if (agccVar == null) {
            $$$reportNull$$$0(11);
        }
        return agccVar;
    }

    @Override // defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return false;
    }

    @Override // defpackage.agdm
    public boolean isDefault() {
        return this.isDefault;
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return false;
    }

    @Override // defpackage.agco
    public boolean isExternal() {
        return this.isExternal;
    }

    @Override // defpackage.agcj
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return false;
    }

    @Override // defpackage.agcj
    public boolean isHiddenToOvercomeSignatureClash() {
        return false;
    }

    @Override // defpackage.agcj
    public boolean isInfix() {
        return false;
    }

    @Override // defpackage.agcj
    public boolean isInline() {
        return this.isInline;
    }

    @Override // defpackage.agcj
    public boolean isOperator() {
        return false;
    }

    @Override // defpackage.agcj
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.agcj
    public boolean isTailrec() {
        return false;
    }

    @Override // defpackage.agcj
    public agci<? extends agcj> newCopyBuilder() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setInitialSignatureDescriptor(agcj agcjVar) {
        this.initialSignatureDescriptor = agcjVar;
    }

    @Override // defpackage.agax
    public void setOverriddenDescriptors(Collection<? extends agax> collection) {
        if (collection == null) {
            $$$reportNull$$$0(16);
        }
    }

    public void setVisibility(agcc agccVar) {
        this.visibility = agccVar;
    }

    @Override // defpackage.agea
    public agcj substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(7);
        }
        return this;
    }
}
