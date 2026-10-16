package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aguy extends aggu implements agux {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Boolean hasStableParameterNames;
    private Boolean hasSynthesizedParameterNames;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aguy(agba agbaVar, aguy aguyVar, agfk agfkVar, boolean z, agaw agawVar, agdx agdxVar) {
        super(agbaVar, aguyVar, agfkVar, z, agawVar, agdxVar);
        if (agbaVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(3);
        }
        this.hasStableParameterNames = null;
        this.hasSynthesizedParameterNames = null;
    }

    public static aguy createJavaConstructor(agba agbaVar, agfk agfkVar, boolean z, agdx agdxVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(6);
        }
        return new aguy(agbaVar, null, agfkVar, z, agaw.DECLARATION, agdxVar);
    }

    protected aguy createDescriptor(agba agbaVar, aguy aguyVar, agaw agawVar, agdx agdxVar, agfk agfkVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(12);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(13);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(14);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(15);
        }
        return new aguy(agbaVar, aguyVar, agfkVar, this.isPrimary, agawVar, agdxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aggu, defpackage.aghm
    public aguy createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(9);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(10);
        }
        if (agawVar == agaw.DECLARATION || agawVar == agaw.SYNTHESIZED) {
            aguy aguyVarCreateDescriptor = createDescriptor((agba) agbiVar, (aguy) agcjVar, agawVar, agdxVar, agfkVar);
            aguyVarCreateDescriptor.setHasStableParameterNames(hasStableParameterNames());
            aguyVarCreateDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            return aguyVarCreateDescriptor;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + agbiVar + "\nkind: " + agawVar);
    }

    @Override // defpackage.agux
    public aguy enhance(aigl aiglVar, List<aigl> list, aigl aiglVar2, aezu<agau<?>, ?> aezuVar) {
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        if (aiglVar2 == null) {
            $$$reportNull$$$0(17);
        }
        aguy aguyVarCreateSubstitutedCopy = createSubstitutedCopy((agbi) getContainingDeclaration(), (agcj) null, getKind(), (ahnj) null, getAnnotations(), getSource());
        aguyVarCreateSubstitutedCopy.initialize(aiglVar == null ? null : ahss.createExtensionReceiverParameterForCallable(aguyVarCreateSubstitutedCopy, aiglVar, agfk.Companion.getEMPTY()), getDispatchReceiverParameter(), afbe.a, getTypeParameters(), agvh.copyValueParameters(list, getValueParameters(), aguyVarCreateSubstitutedCopy), aiglVar2, getModality(), getVisibility());
        if (aezuVar != null) {
            aguyVarCreateSubstitutedCopy.putInUserDataMap((agau) aezuVar.a, aezuVar.b);
        }
        return aguyVarCreateSubstitutedCopy;
    }

    @Override // defpackage.aghm
    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames.booleanValue();
    }

    @Override // defpackage.aghm, defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames.booleanValue();
    }

    @Override // defpackage.aghm
    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = Boolean.valueOf(z);
    }

    @Override // defpackage.aghm
    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = Boolean.valueOf(z);
    }

    @Override // defpackage.agux
    public /* bridge */ /* synthetic */ agux enhance(aigl aiglVar, List list, aigl aiglVar2, aezu aezuVar) {
        return enhance(aiglVar, (List<aigl>) list, aiglVar2, (aezu<agau<?>, ?>) aezuVar);
    }
}
