package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class agiz extends aggz implements agem {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected aigl outType;

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
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agiz(agbi agbiVar, agfk agfkVar, ahnj ahnjVar, aigl aiglVar, agdx agdxVar) {
        super(agbiVar, agfkVar, ahnjVar, agdxVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(3);
        }
        this.outType = aiglVar;
    }

    public List<agdq> getContextReceiverParameters() {
        List<agdq> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(9);
        }
        return list;
    }

    public agdq getDispatchReceiverParameter() {
        return null;
    }

    public agdq getExtensionReceiverParameter() {
        return null;
    }

    public Collection<? extends agav> getOverriddenDescriptors() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(7);
        }
        return set;
    }

    public aigl getReturnType() {
        aigl type = getType();
        if (type == null) {
            $$$reportNull$$$0(10);
        }
        return type;
    }

    @Override // defpackage.agek
    public aigl getType() {
        aigl aiglVar = this.outType;
        if (aiglVar == null) {
            $$$reportNull$$$0(4);
        }
        return aiglVar;
    }

    public List<agee> getTypeParameters() {
        List<agee> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(8);
        }
        return list;
    }

    public <V> V getUserData(agau<V> agauVar) {
        return null;
    }

    @Override // defpackage.agav
    public List<agel> getValueParameters() {
        List<agel> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(6);
        }
        return list;
    }

    @Override // defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    public boolean isConst() {
        return false;
    }

    public void setOutType(aigl aiglVar) {
        this.outType = aiglVar;
    }

    public /* bridge */ /* synthetic */ agbj substitute(aiiy aiiyVar) {
        return substitute(aiiyVar);
    }

    @Override // defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agem getOriginal() {
        return this;
    }
}
