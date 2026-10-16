package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public class agvf extends agik implements agux {
    private aigl inType;
    private final boolean isStaticFinal;
    private final aezu<agau<?>, ?> singleUserData;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected agvf(agbi agbiVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, ahnj ahnjVar, agdx agdxVar, agdn agdnVar, agaw agawVar, boolean z2, aezu<agau<?>, ?> aezuVar) {
        super(agbiVar, agdnVar, agfkVar, agcqVar, agccVar, z, ahnjVar, agawVar, agdxVar, false, false, false, false, false, false);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(3);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(6);
        }
        this.inType = null;
        this.isStaticFinal = z2;
        this.singleUserData = aezuVar;
    }

    public static agvf create(agbi agbiVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, ahnj ahnjVar, agdx agdxVar, boolean z2) {
        if (agbiVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(9);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(10);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(11);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(12);
        }
        return new agvf(agbiVar, agfkVar, agcqVar, agccVar, z, ahnjVar, agdxVar, null, agaw.DECLARATION, z2, null);
    }

    @Override // defpackage.agik
    protected agik createSubstitutedCopy(agbi agbiVar, agcq agcqVar, agcc agccVar, agdn agdnVar, agaw agawVar, ahnj ahnjVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(13);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(14);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(15);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(16);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(17);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(18);
        }
        return new agvf(agbiVar, getAnnotations(), agcqVar, agccVar, isVar(), ahnjVar, agdxVar, agdnVar, agawVar, this.isStaticFinal, this.singleUserData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agux
    public agux enhance(aigl aiglVar, List<aigl> list, aigl aiglVar2, aezu<agau<?>, ?> aezuVar) {
        agil agilVar;
        agim agimVar;
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        if (aiglVar2 == null) {
            $$$reportNull$$$0(20);
        }
        agdn original = getOriginal() == this ? null : getOriginal();
        agvf agvfVar = new agvf(getContainingDeclaration(), getAnnotations(), getModality(), getVisibility(), isVar(), getName(), getSource(), original, getKind(), this.isStaticFinal, aezuVar);
        agil getter = getGetter();
        if (getter != null) {
            agil agilVar2 = new agil(agvfVar, getter.getAnnotations(), getter.getModality(), getter.getVisibility(), getter.isDefault(), getter.isExternal(), getter.isInline(), getKind(), original == null ? null : original.getGetter(), getter.getSource());
            agilVar2.setInitialSignatureDescriptor(getter.getInitialSignatureDescriptor());
            agilVar2.initialize(aiglVar2);
            agilVar = agilVar2;
        } else {
            agilVar = null;
        }
        agdp setter = getSetter();
        if (setter != null) {
            agimVar = new agim(agvfVar, setter.getAnnotations(), setter.getModality(), setter.getVisibility(), setter.isDefault(), setter.isExternal(), setter.isInline(), getKind(), original == null ? null : original.getSetter(), setter.getSource());
            agimVar.setInitialSignatureDescriptor(agimVar.getInitialSignatureDescriptor());
            agimVar.initialize(setter.getValueParameters().get(0));
        } else {
            agimVar = null;
        }
        agvfVar.initialize(agilVar, agimVar, getBackingField(), getDelegateField());
        agvfVar.setSetterProjectedOut(isSetterProjectedOut());
        afdr<aied<ahuh<?>>> afdrVar = this.compileTimeInitializerFactory;
        if (afdrVar != null) {
            agvfVar.setCompileTimeInitializer(this.compileTimeInitializer, afdrVar);
        }
        agvfVar.setOverriddenDescriptors(getOverriddenDescriptors());
        agvfVar.setType(aiglVar2, getTypeParameters(), getDispatchReceiverParameter(), aiglVar != null ? ahss.createExtensionReceiverParameterForCallable(this, aiglVar, agfk.Companion.getEMPTY()) : null, afbe.a);
        return agvfVar;
    }

    @Override // defpackage.agik, defpackage.agiz, defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        aezu<agau<?>, ?> aezuVar = this.singleUserData;
        if (aezuVar == null || !((agau) aezuVar.a).equals(agauVar)) {
            return null;
        }
        return (V) this.singleUserData.b;
    }

    @Override // defpackage.agiz, defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override // defpackage.agik, defpackage.agiz, defpackage.agem
    public boolean isConst() {
        boolean z = this.isStaticFinal;
        aigl type = getType();
        if (z && agbf.canBeUsedForConstVal(type)) {
            return !ahdc.hasEnhancedNullability(type) || afye.isString(type);
        }
        return false;
    }

    @Override // defpackage.agik
    public void setInType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(22);
        }
        this.inType = aiglVar;
    }
}
