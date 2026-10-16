package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class agil extends agii implements agdo {
    private final agdo original;
    private aigl returnType;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agil(agdn agdnVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, boolean z2, boolean z3, agaw agawVar, agdo agdoVar, agdx agdxVar) {
        super(agcqVar, agccVar, agdnVar, agfkVar, ahnj.special("<get-" + agdnVar.getName() + ">"), z, z2, z3, agawVar, agdxVar);
        if (agdnVar == null) {
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
        if (agawVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        this.original = agdoVar == null ? this : agdoVar;
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitPropertyGetterDescriptor(this, d);
    }

    @Override // defpackage.agii, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agdo getOriginal() {
        agdo agdoVar = this.original;
        if (agdoVar == null) {
            $$$reportNull$$$0(8);
        }
        return agdoVar;
    }

    @Override // defpackage.agcj, defpackage.agax, defpackage.agav
    public Collection<? extends agdo> getOverriddenDescriptors() {
        return super.getOverriddenDescriptors(true);
    }

    @Override // defpackage.agav
    public aigl getReturnType() {
        return this.returnType;
    }

    @Override // defpackage.agav
    public List<agel> getValueParameters() {
        List<agel> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(7);
        }
        return list;
    }

    public void initialize(aigl aiglVar) {
        if (aiglVar == null) {
            aiglVar = getCorrespondingProperty().getType();
        }
        this.returnType = aiglVar;
    }
}
