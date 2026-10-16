package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aggh extends aghw {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final aiec<aigw> defaultType;
    private final ahnj name;
    private final aiec<agdq> thisAsReceiverParameter;
    private final aiec<ahxe> unsubstitutedInnerClassesScope;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public aggh(aiei aieiVar, ahnj ahnjVar) {
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(1);
        }
        this.name = ahnjVar;
        this.defaultType = aieiVar.createLazyValue(new agge(this));
        this.unsubstitutedInnerClassesScope = aieiVar.createLazyValue(new aggf(this));
        this.thisAsReceiverParameter = aieiVar.createLazyValue(new aggg(this));
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitClassDescriptor(this, d);
    }

    @Override // defpackage.agba
    public List<agdq> getContextReceivers() {
        List<agdq> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(6);
        }
        return list;
    }

    @Override // defpackage.agba, defpackage.agbd
    public aigw getDefaultType() {
        aigw aigwVarInvoke = this.defaultType.invoke();
        if (aigwVarInvoke == null) {
            $$$reportNull$$$0(20);
        }
        return aigwVarInvoke;
    }

    @Override // defpackage.aghw
    public ahxe getMemberScope(aiit aiitVar, aiju aijuVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(10);
        }
        if (aijuVar == null) {
            $$$reportNull$$$0(11);
        }
        if (!aiitVar.isEmpty()) {
            return new ahxo(getUnsubstitutedMemberScope(aijuVar), aiiy.create(aiitVar));
        }
        ahxe unsubstitutedMemberScope = getUnsubstitutedMemberScope(aijuVar);
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // defpackage.agcw
    public ahnj getName() {
        ahnj ahnjVar = this.name;
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        return ahnjVar;
    }

    @Override // defpackage.agba
    public agdq getThisAsReceiverParameter() {
        agdq agdqVarInvoke = this.thisAsReceiverParameter.invoke();
        if (agdqVarInvoke == null) {
            $$$reportNull$$$0(5);
        }
        return agdqVarInvoke;
    }

    @Override // defpackage.agba
    public ahxe getUnsubstitutedInnerClassesScope() {
        ahxe ahxeVarInvoke = this.unsubstitutedInnerClassesScope.invoke();
        if (ahxeVarInvoke == null) {
            $$$reportNull$$$0(4);
        }
        return ahxeVarInvoke;
    }

    @Override // defpackage.agba
    public ahxe getUnsubstitutedMemberScope() {
        ahxe unsubstitutedMemberScope = getUnsubstitutedMemberScope(ahvz.getKotlinTypeRefiner(ahst.getContainingModule(this)));
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(17);
        }
        return unsubstitutedMemberScope;
    }

    @Override // defpackage.agea
    public agba substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(18);
        }
        return aiiyVar.isEmpty() ? this : new aghu(this, aiiyVar);
    }

    @Override // defpackage.aghw, defpackage.agbi
    public agba getOriginal() {
        return this;
    }

    @Override // defpackage.agba
    public ahxe getMemberScope(aiit aiitVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(15);
        }
        ahxe memberScope = getMemberScope(aiitVar, ahvz.getKotlinTypeRefiner(ahst.getContainingModule(this)));
        if (memberScope == null) {
            $$$reportNull$$$0(16);
        }
        return memberScope;
    }
}
