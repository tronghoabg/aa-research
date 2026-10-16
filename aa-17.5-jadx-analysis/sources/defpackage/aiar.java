package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aiar extends ahyd {
    public static final aiar INSTANCE = new aiar();

    /* JADX WARN: Illegal instructions before constructor call */
    private aiar() {
        ahog ahogVarExtensionRegistryLite = ahgl.ExtensionRegistryLite(aiaq.INSTANCE);
        ahop<ahim, Integer> ahopVar = ahkr.packageFqName;
        ahopVar.getClass();
        ahop<ahhi, List<ahgx>> ahopVar2 = ahkr.constructorAnnotation;
        ahopVar2.getClass();
        ahop<ahhc, List<ahgx>> ahopVar3 = ahkr.classAnnotation;
        ahopVar3.getClass();
        ahop<ahif, List<ahgx>> ahopVar4 = ahkr.functionAnnotation;
        ahopVar4.getClass();
        ahop<ahis, List<ahgx>> ahopVar5 = ahkr.propertyAnnotation;
        ahopVar5.getClass();
        ahop<ahis, List<ahgx>> ahopVar6 = ahkr.propertyGetterAnnotation;
        ahopVar6.getClass();
        ahop<ahis, List<ahgx>> ahopVar7 = ahkr.propertySetterAnnotation;
        ahopVar7.getClass();
        ahop<ahhx, List<ahgx>> ahopVar8 = ahkr.enumEntryAnnotation;
        ahopVar8.getClass();
        ahop<ahis, ahgu> ahopVar9 = ahkr.compileTimeValue;
        ahopVar9.getClass();
        ahop<ahkb, List<ahgx>> ahopVar10 = ahkr.parameterAnnotation;
        ahopVar10.getClass();
        ahop<ahjn, List<ahgx>> ahopVar11 = ahkr.typeAnnotation;
        ahopVar11.getClass();
        ahop<ahjv, List<ahgx>> ahopVar12 = ahkr.typeParameterAnnotation;
        ahopVar12.getClass();
        super(ahogVarExtensionRegistryLite, ahopVar, ahopVar2, ahopVar3, ahopVar4, null, ahopVar5, ahopVar6, ahopVar7, null, null, null, ahopVar8, ahopVar9, ahopVar10, ahopVar11, ahopVar12);
    }

    private final String shortName(ahnf ahnfVar) {
        if (ahnfVar.isRoot()) {
            return "default-package";
        }
        String strAsString = ahnfVar.shortName().asString();
        strAsString.getClass();
        return strAsString;
    }

    public final String getBuiltInsFileName(ahnf ahnfVar) {
        ahnfVar.getClass();
        return String.valueOf(shortName(ahnfVar)).concat(".kotlin_builtins");
    }

    public final String getBuiltInsFilePath(ahnf ahnfVar) {
        ahnfVar.getClass();
        return afyh.I(ahnfVar.asString(), '.', '/') + '/' + getBuiltInsFileName(ahnfVar);
    }
}
