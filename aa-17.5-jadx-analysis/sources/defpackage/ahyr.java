package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahyr {
    private final afec<ahyp, agba> classes;
    private final ahyv components;
    public static final ahyq Companion = new ahyq(null);
    private static final Set<ahnd> BLACK_LIST = woy.aO(ahnd.Companion.topLevel(afyn.cloneable.toSafe()));

    public ahyr(ahyv ahyvVar) {
        ahyvVar.getClass();
        this.components = ahyvVar;
        this.classes = ahyvVar.getStorageManager().createMemoizedFunctionWithNullableValues(new ahyo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba classes$lambda$0(ahyr ahyrVar, ahyp ahypVar) {
        ahypVar.getClass();
        return ahyrVar.createClass(ahypVar);
    }

    private final agba createClass(ahyp ahypVar) {
        ahym classData;
        Object next;
        ahyy ahyyVarCreateContext;
        ahyv ahyvVar = this.components;
        ahnd classId = ahypVar.getClassId();
        Iterator<agfy> it = ahyvVar.getFictitiousClassDescriptorFactories().iterator();
        while (it.hasNext()) {
            agba agbaVarCreateClass = it.next().createClass(classId);
            if (agbaVarCreateClass != null) {
                return agbaVarCreateClass;
            }
        }
        if (!BLACK_LIST.contains(classId) && ((classData = ahypVar.getClassData()) != null || (classData = this.components.getClassDataFinder().findClassData(classId)) != null)) {
            ahld ahldVarComponent1 = classData.component1();
            ahhc ahhcVarComponent2 = classData.component2();
            ahkv ahkvVarComponent3 = classData.component3();
            agdx agdxVarComponent4 = classData.component4();
            ahnd outerClassId = classId.getOuterClassId();
            if (outerClassId != null) {
                agba agbaVarDeserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
                aibt aibtVar = agbaVarDeserializeClass$default instanceof aibt ? (aibt) agbaVarDeserializeClass$default : null;
                if (aibtVar != null && aibtVar.hasNestedClass$org_jetbrains_kotlin_deserialization(classId.getShortClassName())) {
                    ahyyVarCreateContext = aibtVar.getC();
                    return new aibt(ahyyVarCreateContext, ahhcVarComponent2, ahldVarComponent1, ahkvVarComponent3, agdxVarComponent4);
                }
            } else {
                Iterator<T> it2 = agdh.packageFragments(this.components.getPackageFragmentProvider(), classId.getPackageFqName()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    agdc agdcVar = (agdc) next;
                    if (!(agdcVar instanceof ahza) || ((ahza) agdcVar).hasTopLevelClass(classId.getShortClassName())) {
                        break;
                    }
                }
                agdc agdcVar2 = (agdc) next;
                if (agdcVar2 != null) {
                    ahyv ahyvVar2 = this.components;
                    ahjy typeTable = ahhcVarComponent2.getTypeTable();
                    typeTable.getClass();
                    ahlh ahlhVar = new ahlh(typeTable);
                    ahlm ahlmVar = ahln.Companion;
                    ahkl versionRequirementTable = ahhcVarComponent2.getVersionRequirementTable();
                    versionRequirementTable.getClass();
                    ahyyVarCreateContext = ahyvVar2.createContext(agdcVar2, ahldVarComponent1, ahlhVar, ahlmVar.create(versionRequirementTable), ahkvVarComponent3, null);
                    ahkvVarComponent3 = ahkvVarComponent3;
                    return new aibt(ahyyVarCreateContext, ahhcVarComponent2, ahldVarComponent1, ahkvVarComponent3, agdxVarComponent4);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ agba deserializeClass$default(ahyr ahyrVar, ahnd ahndVar, ahym ahymVar, int i, Object obj) {
        if ((i & 2) != 0) {
            ahymVar = null;
        }
        return ahyrVar.deserializeClass(ahndVar, ahymVar);
    }

    public final agba deserializeClass(ahnd ahndVar, ahym ahymVar) {
        ahndVar.getClass();
        return this.classes.invoke(new ahyp(ahndVar, ahymVar));
    }
}
