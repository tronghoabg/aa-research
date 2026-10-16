package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aghh extends aggv {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final agfk annotations;
    private final aiec<Set<ahnj>> enumMemberNames;
    private final ahxe scope;
    private final aiid typeConstructor;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aghh(aiei aieiVar, agba agbaVar, aigl aiglVar, ahnj ahnjVar, aiec<Set<ahnj>> aiecVar, agfk agfkVar, agdx agdxVar) {
        super(aieiVar, agbaVar, ahnjVar, agdxVar, false);
        if (aieiVar == null) {
            $$$reportNull$$$0(6);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(7);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(8);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(9);
        }
        if (aiecVar == null) {
            $$$reportNull$$$0(10);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(11);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(12);
        }
        this.annotations = agfkVar;
        this.typeConstructor = new aifj(this, Collections.EMPTY_LIST, Collections.singleton(aiglVar), aieiVar);
        this.scope = new aghg(this, aieiVar);
        this.enumMemberNames = aiecVar;
    }

    public static aghh create(aiei aieiVar, agba agbaVar, ahnj ahnjVar, aiec<Set<ahnj>> aiecVar, agfk agfkVar, agdx agdxVar) {
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        if (aiecVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        return new aghh(aieiVar, agbaVar, agbaVar.getDefaultType(), ahnjVar, aiecVar, agfkVar, agdxVar);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        agfk agfkVar = this.annotations;
        if (agfkVar == null) {
            $$$reportNull$$$0(21);
        }
        return agfkVar;
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return null;
    }

    @Override // defpackage.agba
    public Collection<agaz> getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        return list;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        List<agee> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(22);
        }
        return list;
    }

    @Override // defpackage.agba
    public agbb getKind() {
        agbb agbbVar = agbb.ENUM_ENTRY;
        if (agbbVar == null) {
            $$$reportNull$$$0(18);
        }
        return agbbVar;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        agcq agcqVar = agcq.FINAL;
        if (agcqVar == null) {
            $$$reportNull$$$0(19);
        }
        return agcqVar;
    }

    @Override // defpackage.agba
    public ahxe getStaticScope() {
        ahxd ahxdVar = ahxd.INSTANCE;
        if (ahxdVar == null) {
            $$$reportNull$$$0(15);
        }
        return ahxdVar;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        aiid aiidVar = this.typeConstructor;
        if (aiidVar == null) {
            $$$reportNull$$$0(17);
        }
        return aiidVar;
    }

    @Override // defpackage.aghw
    public ahxe getUnsubstitutedMemberScope(aiju aijuVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(13);
        }
        ahxe ahxeVar = this.scope;
        if (ahxeVar == null) {
            $$$reportNull$$$0(14);
        }
        return ahxeVar;
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
        if (agccVar == null) {
            $$$reportNull$$$0(20);
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
        return false;
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return false;
    }

    public String toString() {
        ahnj name = getName();
        Objects.toString(name);
        return "enum entry ".concat(String.valueOf(name));
    }
}
