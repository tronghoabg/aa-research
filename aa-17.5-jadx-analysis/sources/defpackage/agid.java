package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agid extends aggv {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean isInner;
    private final agbb kind;
    private agcq modality;
    private final aiei storageManager;
    private final Collection<aigl> supertypes;
    private aiid typeConstructor;
    private List<agee> typeParameters;
    private agcc visibility;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agid(agbi agbiVar, agbb agbbVar, boolean z, boolean z2, ahnj ahnjVar, agdx agdxVar, aiei aieiVar) {
        super(aieiVar, agbiVar, ahnjVar, agdxVar, z2);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbbVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(4);
        }
        this.supertypes = new ArrayList();
        this.storageManager = aieiVar;
        this.kind = agbbVar;
        this.isInner = z;
    }

    public void createTypeConstructor() {
        this.typeConstructor = new aifj(this, this.typeParameters, this.supertypes, this.storageManager);
        Iterator<agaz> it = getConstructors().iterator();
        while (it.hasNext()) {
            ((aggu) it.next()).setReturnType(getDefaultType());
        }
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        agfk empty = agfk.Companion.getEMPTY();
        if (empty == null) {
            $$$reportNull$$$0(5);
        }
        return empty;
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return null;
    }

    @Override // defpackage.agba
    public Set<agaz> getConstructors() {
        Set<agaz> set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(13);
        }
        return set;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        List<agee> list = this.typeParameters;
        if (list == null) {
            $$$reportNull$$$0(15);
        }
        return list;
    }

    @Override // defpackage.agba
    public agbb getKind() {
        agbb agbbVar = this.kind;
        if (agbbVar == null) {
            $$$reportNull$$$0(8);
        }
        return agbbVar;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        agcq agcqVar = this.modality;
        if (agcqVar == null) {
            $$$reportNull$$$0(7);
        }
        return agcqVar;
    }

    @Override // defpackage.agba
    public ahxe getStaticScope() {
        ahxd ahxdVar = ahxd.INSTANCE;
        if (ahxdVar == null) {
            $$$reportNull$$$0(18);
        }
        return ahxdVar;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        aiid aiidVar = this.typeConstructor;
        if (aiidVar == null) {
            $$$reportNull$$$0(11);
        }
        return aiidVar;
    }

    @Override // defpackage.aghw
    public ahxe getUnsubstitutedMemberScope(aiju aijuVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(16);
        }
        ahxd ahxdVar = ahxd.INSTANCE;
        if (ahxdVar == null) {
            $$$reportNull$$$0(17);
        }
        return ahxdVar;
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
        agcc agccVar = this.visibility;
        if (agccVar == null) {
            $$$reportNull$$$0(10);
        }
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

    public void setModality(agcq agcqVar) {
        if (agcqVar == null) {
            $$$reportNull$$$0(6);
        }
        this.modality = agcqVar;
    }

    public void setTypeParameterDescriptors(List<agee> list) {
        if (list == null) {
            $$$reportNull$$$0(14);
        }
        if (this.typeParameters == null) {
            this.typeParameters = new ArrayList(list);
        } else {
            ahnj name = getName();
            Objects.toString(name);
            throw new IllegalStateException("Type parameters are already set for ".concat(String.valueOf(name)));
        }
    }

    public void setVisibility(agcc agccVar) {
        if (agccVar == null) {
            $$$reportNull$$$0(9);
        }
        this.visibility = agccVar;
    }

    public String toString() {
        return aggy.toString(this);
    }
}
