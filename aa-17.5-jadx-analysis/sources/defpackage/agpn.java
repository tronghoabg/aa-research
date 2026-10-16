package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agpn {
    public static final String getClassName(ahld ahldVar, int i) {
        ahldVar.getClass();
        String qualifiedClassName = ahldVar.getQualifiedClassName(i);
        if (!ahldVar.isLocalClassName(i)) {
            return qualifiedClassName;
        }
        return "." + qualifiedClassName;
    }

    public static final agms readAnnotation(ahgx ahgxVar, ahld ahldVar) {
        ahgxVar.getClass();
        ahldVar.getClass();
        String className = getClassName(ahldVar, ahgxVar.getId());
        List<ahgv> argumentList = ahgxVar.getArgumentList();
        argumentList.getClass();
        ArrayList arrayList = new ArrayList();
        for (ahgv ahgvVar : argumentList) {
            ahgu value = ahgvVar.getValue();
            value.getClass();
            agnp annotationArgument = readAnnotationArgument(value, ahldVar);
            aezu aezuVar = annotationArgument != null ? new aezu(ahldVar.getString(ahgvVar.getNameId()), annotationArgument) : null;
            if (aezuVar != null) {
                arrayList.add(aezuVar);
            }
        }
        return new agms(className, woy.bc(arrayList));
    }

    public static final agnp readAnnotationArgument(ahgu ahguVar, ahld ahldVar) {
        ahguVar.getClass();
        ahldVar.getClass();
        if (ahla.IS_UNSIGNED.get(ahguVar.getFlags()).booleanValue()) {
            ahgt type = ahguVar.getType();
            if (type != null) {
                int iOrdinal = type.ordinal();
                if (iOrdinal == 0) {
                    return new agnl((byte) ahguVar.getIntValue(), null);
                }
                if (iOrdinal == 2) {
                    return new agno((short) ahguVar.getIntValue(), null);
                }
                if (iOrdinal == 3) {
                    return new agnm((int) ahguVar.getIntValue(), null);
                }
                if (iOrdinal == 4) {
                    return new agnn(ahguVar.getIntValue(), null);
                }
            }
            ahgt type2 = ahguVar.getType();
            Objects.toString(type2);
            throw new IllegalStateException("Cannot read value of unsigned type: ".concat(String.valueOf(type2)));
        }
        ahgt type3 = ahguVar.getType();
        if (type3 == null) {
            return null;
        }
        switch (type3) {
            case BYTE:
                return new agmy((byte) ahguVar.getIntValue());
            case CHAR:
                return new agmz((char) ahguVar.getIntValue());
            case SHORT:
                return new agnj((short) ahguVar.getIntValue());
            case INT:
                return new agne((int) ahguVar.getIntValue());
            case LONG:
                return new agni(ahguVar.getIntValue());
            case FLOAT:
                return new agnd(ahguVar.getFloatValue());
            case DOUBLE:
                return new agnb(ahguVar.getDoubleValue());
            case BOOLEAN:
                return new agmx(ahguVar.getIntValue() != 0);
            case STRING:
                return new agnk(ahldVar.getString(ahguVar.getStringValue()));
            case CLASS:
                String className = getClassName(ahldVar, ahguVar.getClassId());
                return ahguVar.getArrayDimensionCount() == 0 ? new agnf(className) : new agmu(className, ahguVar.getArrayDimensionCount());
            case ENUM:
                return new agnc(getClassName(ahldVar, ahguVar.getClassId()), ahldVar.getString(ahguVar.getEnumValueId()));
            case ANNOTATION:
                ahgx annotation = ahguVar.getAnnotation();
                annotation.getClass();
                return new agmt(readAnnotation(annotation, ahldVar));
            case ARRAY:
                List<ahgu> arrayElementList = ahguVar.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ahgu ahguVar2 : arrayElementList) {
                    ahguVar2.getClass();
                    agnp annotationArgument = readAnnotationArgument(ahguVar2, ahldVar);
                    if (annotationArgument != null) {
                        arrayList.add(annotationArgument);
                    }
                }
                return new agmv(arrayList);
            default:
                throw new aezs();
        }
    }
}
