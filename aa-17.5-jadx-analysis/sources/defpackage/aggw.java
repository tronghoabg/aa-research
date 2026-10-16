package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public class aggw extends aggv {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<agaz> constructors;
    private final agbb kind;
    private final agcq modality;
    private agaz primaryConstructor;
    private final aiid typeConstructor;
    private ahxe unsubstitutedMemberScope;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggw(agbi agbiVar, ahnj ahnjVar, agcq agcqVar, agbb agbbVar, Collection<aigl> collection, agdx agdxVar, boolean z, aiei aieiVar) {
        super(aieiVar, agbiVar, ahnjVar, agdxVar, z);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agbbVar == null) {
            $$$reportNull$$$0(3);
        }
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(6);
        }
        this.modality = agcqVar;
        this.kind = agbbVar;
        this.typeConstructor = new aifj(this, Collections.EMPTY_LIST, collection, aieiVar);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        agfk empty = agfk.Companion.getEMPTY();
        if (empty == null) {
            $$$reportNull$$$0(9);
        }
        return empty;
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return null;
    }

    @Override // defpackage.agba
    public Collection<agaz> getConstructors() {
        Set<agaz> set = this.constructors;
        if (set == null) {
            $$$reportNull$$$0(11);
        }
        return set;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        List<agee> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(18);
        }
        return list;
    }

    @Override // defpackage.agba
    public agbb getKind() {
        agbb agbbVar = this.kind;
        if (agbbVar == null) {
            $$$reportNull$$$0(15);
        }
        return agbbVar;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        agcq agcqVar = this.modality;
        if (agcqVar == null) {
            $$$reportNull$$$0(16);
        }
        return agcqVar;
    }

    @Override // defpackage.agba
    public ahxe getStaticScope() {
        ahxd ahxdVar = ahxd.INSTANCE;
        if (ahxdVar == null) {
            $$$reportNull$$$0(14);
        }
        return ahxdVar;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        aiid aiidVar = this.typeConstructor;
        if (aiidVar == null) {
            $$$reportNull$$$0(10);
        }
        return aiidVar;
    }

    @Override // defpackage.aghw
    public ahxe getUnsubstitutedMemberScope(aiju aijuVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(12);
        }
        ahxe ahxeVar = this.unsubstitutedMemberScope;
        if (ahxeVar == null) {
            $$$reportNull$$$0(13);
        }
        return ahxeVar;
    }

    @Override // defpackage.agba
    public agaz getUnsubstitutedPrimaryConstructor() {
        return this.primaryConstructor;
    }

    @Override // defpackage.agba
    public agej<aigw> getValueClassRepresentation() {
        return null;
    }

    @Override // defpackage.agba, defpackage.agco, defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = agcb.PUBLIC;
        if (agccVar == null) {
            $$$reportNull$$$0(17);
        }
        return agccVar;
    }

    public final void initialize(ahxe ahxeVar, Set<agaz> set, agaz agazVar) {
        if (ahxeVar == null) {
            $$$reportNull$$$0(7);
        }
        if (set == null) {
            $$$reportNull$$$0(8);
        }
        this.unsubstitutedMemberScope = ahxeVar;
        this.constructors = set;
        this.primaryConstructor = agazVar;
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
        return false;
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return false;
    }

    public String toString() {
        ahnj name = getName();
        Objects.toString(name);
        return "class ".concat(String.valueOf(name));
    }
}
