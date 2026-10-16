package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class aggj extends aggy implements agdq {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggj(agfk agfkVar, ahnj ahnjVar) {
        super(agfkVar, ahnjVar);
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitReceiverParameterDescriptor(this, d);
    }

    @Override // defpackage.agav
    public List<agdq> getContextReceiverParameters() {
        List<agdq> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(4);
        }
        return list;
    }

    @Override // defpackage.agav
    public agdq getDispatchReceiverParameter() {
        return null;
    }

    @Override // defpackage.agav
    public agdq getExtensionReceiverParameter() {
        return null;
    }

    @Override // defpackage.agav
    public Collection<? extends agav> getOverriddenDescriptors() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(8);
        }
        return set;
    }

    @Override // defpackage.agav
    public aigl getReturnType() {
        return getType();
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx agdxVar = agdx.NO_SOURCE;
        if (agdxVar == null) {
            $$$reportNull$$$0(11);
        }
        return agdxVar;
    }

    @Override // defpackage.agek
    public aigl getType() {
        aigl type = getValue().getType();
        if (type == null) {
            $$$reportNull$$$0(6);
        }
        return type;
    }

    @Override // defpackage.agav
    public List<agee> getTypeParameters() {
        List<agee> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        return list;
    }

    @Override // defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        return null;
    }

    @Override // defpackage.agav
    public List<agel> getValueParameters() {
        List<agel> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(7);
        }
        return list;
    }

    @Override // defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = agcb.LOCAL;
        if (agccVar == null) {
            $$$reportNull$$$0(9);
        }
        return agccVar;
    }

    @Override // defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override // defpackage.agea
    public agdq substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(3);
        }
        if (!aiiyVar.isEmpty()) {
            aigl aiglVarSubstitute = getContainingDeclaration() instanceof agba ? aiiyVar.substitute(getType(), aijg.OUT_VARIANCE) : aiiyVar.substitute(getType(), aijg.INVARIANT);
            if (aiglVarSubstitute == null) {
                return null;
            }
            if (aiglVarSubstitute != getType()) {
                return new agin(getContainingDeclaration(), new ahyc(aiglVarSubstitute), getAnnotations());
            }
        }
        return this;
    }

    @Override // defpackage.aggy, defpackage.agbi
    public agdk getOriginal() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggj(agfk agfkVar) {
        super(agfkVar, ahnm.THIS);
        if (agfkVar == null) {
            $$$reportNull$$$0(0);
        }
    }
}
