package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class agio extends aghm implements agdv {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected agio(agbi agbiVar, agdv agdvVar, agfk agfkVar, ahnj ahnjVar, agaw agawVar, agdx agdxVar) {
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
    }

    public static agio create(agbi agbiVar, agfk agfkVar, ahnj ahnjVar, agaw agawVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(6);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(9);
        }
        return new agio(agbiVar, null, agfkVar, ahnjVar, agawVar, agdxVar);
    }

    @Override // defpackage.aghm, defpackage.agax
    public agdv copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agdv agdvVar = (agdv) super.copy(agbiVar, agcqVar, agccVar, agawVar, z);
        if (agdvVar == null) {
            $$$reportNull$$$0(29);
        }
        return agdvVar;
    }

    @Override // defpackage.aghm
    protected aghm createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(25);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(26);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(27);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(28);
        }
        agdv agdvVar = (agdv) agcjVar;
        if (ahnjVar == null) {
            ahnjVar = getName();
        }
        return new agio(agbiVar, agdvVar, agfkVar, ahnjVar, agawVar, agdxVar);
    }

    @Override // defpackage.aghm, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agdv getOriginal() {
        agdv agdvVar = (agdv) super.getOriginal();
        if (agdvVar == null) {
            $$$reportNull$$$0(24);
        }
        return agdvVar;
    }

    @Override // defpackage.aghm
    public agio initialize(agdq agdqVar, agdq agdqVar2, List<agdq> list, List<? extends agee> list2, List<agel> list3, aigl aiglVar, agcq agcqVar, agcc agccVar) {
        if (list == null) {
            $$$reportNull$$$0(14);
        }
        if (list2 == null) {
            $$$reportNull$$$0(15);
        }
        if (list3 == null) {
            $$$reportNull$$$0(16);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(17);
        }
        agio agioVarInitialize = initialize(agdqVar, agdqVar2, list, list2, list3, aiglVar, agcqVar, agccVar, null);
        if (agioVarInitialize == null) {
            $$$reportNull$$$0(18);
        }
        return agioVarInitialize;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public agci<? extends agdv> newCopyBuilder() {
        agci agciVarNewCopyBuilder = super.newCopyBuilder();
        if (agciVarNewCopyBuilder == null) {
            $$$reportNull$$$0(30);
        }
        return agciVarNewCopyBuilder;
    }

    @Override // defpackage.aghm
    public /* bridge */ /* synthetic */ aghm initialize(agdq agdqVar, agdq agdqVar2, List list, List list2, List list3, aigl aiglVar, agcq agcqVar, agcc agccVar) {
        return initialize(agdqVar, agdqVar2, (List<agdq>) list, (List<? extends agee>) list2, (List<agel>) list3, aiglVar, agcqVar, agccVar);
    }

    public agio initialize(agdq agdqVar, agdq agdqVar2, List<agdq> list, List<? extends agee> list2, List<agel> list3, aigl aiglVar, agcq agcqVar, agcc agccVar, Map<? extends agau<?>, ?> map) {
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        if (list2 == null) {
            $$$reportNull$$$0(20);
        }
        if (list3 == null) {
            $$$reportNull$$$0(21);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(22);
        }
        super.initialize(agdqVar, agdqVar2, list, list2, list3, aiglVar, agcqVar, agccVar);
        if (map != null && !map.isEmpty()) {
            this.userDataMap = new LinkedHashMap(map);
        }
        return this;
    }
}
