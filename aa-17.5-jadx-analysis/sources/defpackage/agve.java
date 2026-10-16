package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agve extends agio implements agux {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean isForRecordComponent;
    private agvd parameterNamesStatus;
    public static final agau<agel> ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER = new agvb();
    public static final agau<Boolean> HAS_ERASED_VALUE_PARAMETERS = new agvc();

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected agve(agbi agbiVar, agdv agdvVar, agfk agfkVar, ahnj ahnjVar, agaw agawVar, agdx agdxVar, boolean z) {
        super(agbiVar, agdvVar, agfkVar, ahnjVar, agawVar, agdxVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(4);
        }
        this.parameterNamesStatus = null;
        this.isForRecordComponent = z;
    }

    public static agve createJavaMethod(agbi agbiVar, agfk agfkVar, ahnj ahnjVar, agdx agdxVar, boolean z) {
        if (agbiVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(6);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(8);
        }
        return new agve(agbiVar, null, agfkVar, ahnjVar, agaw.DECLARATION, agdxVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agio, defpackage.aghm
    public agve createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(14);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(15);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(16);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(17);
        }
        agdv agdvVar = (agdv) agcjVar;
        if (ahnjVar == null) {
            ahnjVar = getName();
        }
        agve agveVar = new agve(agbiVar, agdvVar, agfkVar, ahnjVar, agawVar, agdxVar, this.isForRecordComponent);
        agveVar.setParameterNamesStatus(hasStableParameterNames(), hasSynthesizedParameterNames());
        return agveVar;
    }

    @Override // defpackage.agux
    public agve enhance(aigl aiglVar, List<aigl> list, aigl aiglVar2, aezu<agau<?>, ?> aezuVar) {
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        if (aiglVar2 == null) {
            $$$reportNull$$$0(20);
        }
        List<agel> listCopyValueParameters = agvh.copyValueParameters(list, getValueParameters(), this);
        agdq agdqVarCreateExtensionReceiverParameterForCallable = aiglVar == null ? null : ahss.createExtensionReceiverParameterForCallable(this, aiglVar, agfk.Companion.getEMPTY());
        agci<? extends agcj> agciVarNewCopyBuilder = newCopyBuilder();
        agciVarNewCopyBuilder.setValueParameters(listCopyValueParameters);
        agciVarNewCopyBuilder.setReturnType(aiglVar2);
        agciVarNewCopyBuilder.setExtensionReceiverParameter(agdqVarCreateExtensionReceiverParameterForCallable);
        agciVarNewCopyBuilder.setDropOriginalInContainingParts();
        agciVarNewCopyBuilder.setPreserveSourceElement();
        agve agveVar = (agve) agciVarNewCopyBuilder.build();
        if (aezuVar != null) {
            agveVar.putInUserDataMap((agau) aezuVar.a, aezuVar.b);
        }
        if (agveVar == null) {
            $$$reportNull$$$0(21);
        }
        return agveVar;
    }

    @Override // defpackage.aghm
    public boolean hasStableParameterNames() {
        return this.parameterNamesStatus.isStable;
    }

    @Override // defpackage.aghm, defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return this.parameterNamesStatus.isSynthesized;
    }

    @Override // defpackage.agio
    public agio initialize(agdq agdqVar, agdq agdqVar2, List<agdq> list, List<? extends agee> list2, List<agel> list3, aigl aiglVar, agcq agcqVar, agcc agccVar, Map<? extends agau<?>, ?> map) {
        if (list == null) {
            $$$reportNull$$$0(9);
        }
        if (list2 == null) {
            $$$reportNull$$$0(10);
        }
        if (list3 == null) {
            $$$reportNull$$$0(11);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(12);
        }
        super.initialize(agdqVar, agdqVar2, list, list2, list3, aiglVar, agcqVar, agccVar, map);
        setOperator(aioe.INSTANCE.check(this).isSuccess());
        return this;
    }

    public void setParameterNamesStatus(boolean z, boolean z2) {
        this.parameterNamesStatus = agvd.get(z, z2);
    }

    @Override // defpackage.agux
    public /* bridge */ /* synthetic */ agux enhance(aigl aiglVar, List list, aigl aiglVar2, aezu aezuVar) {
        return enhance(aiglVar, (List<aigl>) list, aiglVar2, (aezu<agau<?>, ?>) aezuVar);
    }
}
