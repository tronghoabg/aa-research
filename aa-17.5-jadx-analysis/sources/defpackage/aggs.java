package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class aggs extends aifc {
    private final agec supertypeLoopChecker;
    final /* synthetic */ aggt this$0;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggs(aggt aggtVar, aiei aieiVar, agec agecVar) {
        super(aieiVar);
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        this.this$0 = aggtVar;
        this.supertypeLoopChecker = agecVar;
    }

    @Override // defpackage.aifc
    protected Collection<aigl> computeSupertypes() {
        List<aigl> listResolveUpperBounds = this.this$0.resolveUpperBounds();
        if (listResolveUpperBounds == null) {
            $$$reportNull$$$0(1);
        }
        return listResolveUpperBounds;
    }

    @Override // defpackage.aifc
    protected aigl defaultSupertypeIfEmpty() {
        return ailm.createErrorType(aill.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        afye builtIns = ahvz.getBuiltIns(this.this$0);
        if (builtIns == null) {
            $$$reportNull$$$0(4);
        }
        return builtIns;
    }

    @Override // defpackage.aifk, defpackage.aiid
    public agbd getDeclarationDescriptor() {
        aggt aggtVar = this.this$0;
        if (aggtVar == null) {
            $$$reportNull$$$0(3);
        }
        return aggtVar;
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        List<agee> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(2);
        }
        return list;
    }

    @Override // defpackage.aifc
    protected agec getSupertypeLoopChecker() {
        agec agecVar = this.supertypeLoopChecker;
        if (agecVar == null) {
            $$$reportNull$$$0(5);
        }
        return agecVar;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return true;
    }

    @Override // defpackage.aifk
    protected boolean isSameClassifier(agbd agbdVar) {
        if (agbdVar == null) {
            $$$reportNull$$$0(9);
        }
        if (agbdVar instanceof agee) {
            return ahsq.INSTANCE.areTypeParametersEquivalent(this.this$0, (agee) agbdVar, true);
        }
        return false;
    }

    @Override // defpackage.aifc
    protected List<aigl> processSupertypesWithoutCycles(List<aigl> list) {
        if (list == null) {
            $$$reportNull$$$0(7);
        }
        List<aigl> listProcessBoundsWithoutCycles = this.this$0.processBoundsWithoutCycles(list);
        if (listProcessBoundsWithoutCycles == null) {
            $$$reportNull$$$0(8);
        }
        return listProcessBoundsWithoutCycles;
    }

    @Override // defpackage.aifc
    protected void reportSupertypeLoopError(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(6);
        }
        this.this$0.mo92reportSupertypeLoopError(aiglVar);
    }

    public String toString() {
        return this.this$0.getName().toString();
    }
}
