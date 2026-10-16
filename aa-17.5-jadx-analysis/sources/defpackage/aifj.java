package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class aifj extends aiek {
    private final agba classDescriptor;
    private final List<agee> parameters;
    private final Collection<aigl> supertypes;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifj(agba agbaVar, List<? extends agee> list, Collection<aigl> collection, aiei aieiVar) {
        super(aieiVar);
        if (agbaVar == null) {
            $$$reportNull$$$0(0);
        }
        if (list == null) {
            $$$reportNull$$$0(1);
        }
        if (collection == null) {
            $$$reportNull$$$0(2);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(3);
        }
        this.classDescriptor = agbaVar;
        this.parameters = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.supertypes = DesugarCollections.unmodifiableCollection(collection);
    }

    @Override // defpackage.aifc
    protected Collection<aigl> computeSupertypes() {
        Collection<aigl> collection = this.supertypes;
        if (collection == null) {
            $$$reportNull$$$0(6);
        }
        return collection;
    }

    @Override // defpackage.aiek, defpackage.aifk, defpackage.aiid
    public agba getDeclarationDescriptor() {
        agba agbaVar = this.classDescriptor;
        if (agbaVar == null) {
            $$$reportNull$$$0(5);
        }
        return agbaVar;
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        List<agee> list = this.parameters;
        if (list == null) {
            $$$reportNull$$$0(4);
        }
        return list;
    }

    @Override // defpackage.aifc
    protected agec getSupertypeLoopChecker() {
        ageb agebVar = ageb.INSTANCE;
        if (agebVar == null) {
            $$$reportNull$$$0(7);
        }
        return agebVar;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        return ahst.getFqName(this.classDescriptor).asString();
    }
}
