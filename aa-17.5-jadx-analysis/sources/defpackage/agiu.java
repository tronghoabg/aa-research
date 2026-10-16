package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agiu extends aggt {
    private boolean initialized;
    private final afec<aigl, Void> reportCycleError;
    private final List<aigl> upperBounds;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private agiu(agbi agbiVar, agfk agfkVar, boolean z, aijg aijgVar, ahnj ahnjVar, int i, agdx agdxVar, afec<aigl, Void> afecVar, agec agecVar, aiei aieiVar) {
        super(aieiVar, agbiVar, agfkVar, ahnjVar, aijgVar, z, i, agdxVar, agecVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(19);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(20);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(21);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(22);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(23);
        }
        if (agecVar == null) {
            $$$reportNull$$$0(24);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(25);
        }
        this.upperBounds = new ArrayList(1);
        this.initialized = false;
        this.reportCycleError = afecVar;
    }

    private void checkInitialized() {
        if (!this.initialized) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: ".concat(nameForAssertions()));
        }
    }

    private void checkUninitialized() {
        if (this.initialized) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: ".concat(nameForAssertions()));
        }
    }

    public static agiu createForFurtherModification(agbi agbiVar, agfk agfkVar, boolean z, aijg aijgVar, ahnj ahnjVar, int i, agdx agdxVar, afec<aigl, Void> afecVar, agec agecVar, aiei aieiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(12);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(13);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(14);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(15);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(16);
        }
        if (agecVar == null) {
            $$$reportNull$$$0(17);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(18);
        }
        return new agiu(agbiVar, agfkVar, z, aijgVar, ahnjVar, i, agdxVar, afecVar, agecVar, aieiVar);
    }

    public static agee createWithDefaultBound(agbi agbiVar, agfk agfkVar, boolean z, aijg aijgVar, ahnj ahnjVar, int i, aiei aieiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(2);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(4);
        }
        agiu agiuVarCreateForFurtherModification = createForFurtherModification(agbiVar, agfkVar, z, aijgVar, ahnjVar, i, agdx.NO_SOURCE, aieiVar);
        agiuVarCreateForFurtherModification.addUpperBound(ahvz.getBuiltIns(agbiVar).getDefaultBound());
        agiuVarCreateForFurtherModification.setInitialized();
        return agiuVarCreateForFurtherModification;
    }

    private void doAddUpperBound(aigl aiglVar) {
        if (aigr.isError(aiglVar)) {
            return;
        }
        this.upperBounds.add(aiglVar);
    }

    private String nameForAssertions() {
        return getName() + " declared in " + ahst.getFqName(getContainingDeclaration());
    }

    public void addUpperBound(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(26);
        }
        checkUninitialized();
        doAddUpperBound(aiglVar);
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @Override // defpackage.aggt
    /* renamed from: reportSupertypeLoopError */
    protected void mo92reportSupertypeLoopError(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(27);
        }
        afec<aigl, Void> afecVar = this.reportCycleError;
        if (afecVar == null) {
            return;
        }
        afecVar.invoke(aiglVar);
    }

    @Override // defpackage.aggt
    protected List<aigl> resolveUpperBounds() {
        checkInitialized();
        List<aigl> list = this.upperBounds;
        if (list == null) {
            $$$reportNull$$$0(28);
        }
        return list;
    }

    public void setInitialized() {
        checkUninitialized();
        this.initialized = true;
    }

    public static agiu createForFurtherModification(agbi agbiVar, agfk agfkVar, boolean z, aijg aijgVar, ahnj ahnjVar, int i, agdx agdxVar, aiei aieiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(6);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(7);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(8);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(9);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(10);
        }
        if (aieiVar == null) {
            $$$reportNull$$$0(11);
        }
        return createForFurtherModification(agbiVar, agfkVar, z, aijgVar, ahnjVar, i, agdxVar, null, ageb.INSTANCE, aieiVar);
    }
}
