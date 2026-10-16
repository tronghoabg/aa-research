package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ahxe {
    BOOLEAN(defpackage.afzi.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(defpackage.afzi.CHAR, "char", "C", "java.lang.Character"),
    BYTE(defpackage.afzi.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(defpackage.afzi.SHORT, "short", "S", "java.lang.Short"),
    INT(defpackage.afzi.INT, "int", "I", "java.lang.Integer"),
    FLOAT(defpackage.afzi.FLOAT, "float", "F", "java.lang.Float"),
    LONG(defpackage.afzi.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(defpackage.afzi.DOUBLE, "double", "D", "java.lang.Double");

    private final java.lang.String desc;
    private final java.lang.String name;
    private final defpackage.afzi primitiveType;
    private final defpackage.ahof wrapperFqName;
    private static final java.util.Map<java.lang.String, defpackage.ahxe> TYPE_BY_NAME = new java.util.HashMap();
    private static final java.util.Map<defpackage.afzi, defpackage.ahxe> TYPE_BY_PRIMITIVE_TYPE = new java.util.EnumMap(defpackage.afzi.class);
    private static final java.util.Map<java.lang.String, defpackage.ahxe> TYPE_BY_DESC = new java.util.HashMap();
    private static final java.util.Set<java.lang.String> WRAPPER_CLASS_INTERNAL_NAMES = new java.util.HashSet();
    private static final java.util.Map<java.lang.String, java.lang.String> OWNER_TO_BOXING_METHOD_DESCRIPTOR = new java.util.HashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    static {
        for (defpackage.ahxe ahxeVar : values()) {
            TYPE_BY_NAME.put(ahxeVar.getJavaKeywordName(), ahxeVar);
            TYPE_BY_PRIMITIVE_TYPE.put(ahxeVar.getPrimitiveType(), ahxeVar);
            TYPE_BY_DESC.put(ahxeVar.getDesc(), ahxeVar);
            java.lang.String strReplace = ahxeVar.wrapperFqName.asString().replace('.', '/');
            WRAPPER_CLASS_INTERNAL_NAMES.add(strReplace);
            OWNER_TO_BOXING_METHOD_DESCRIPTOR.put(strReplace, "(" + ahxeVar.desc + ")L" + strReplace + ";");
        }
    }

    ahxe(defpackage.afzi afziVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (afziVar == null) {
            $$$reportNull$$$0(8);
        }
        if (str == null) {
            $$$reportNull$$$0(9);
        }
        if (str2 == null) {
            $$$reportNull$$$0(10);
        }
        if (str3 == null) {
            $$$reportNull$$$0(11);
        }
        this.primitiveType = afziVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new defpackage.ahof(str3);
    }

    public static defpackage.ahxe get(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        defpackage.ahxe ahxeVar = TYPE_BY_NAME.get(str);
        if (ahxeVar != null) {
            return ahxeVar;
        }
        throw new java.lang.AssertionError("Non-primitive type name passed: ".concat(java.lang.String.valueOf(str)));
    }

    public java.lang.String getDesc() {
        java.lang.String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(14);
        }
        return str;
    }

    public java.lang.String getJavaKeywordName() {
        java.lang.String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        return str;
    }

    public defpackage.afzi getPrimitiveType() {
        defpackage.afzi afziVar = this.primitiveType;
        if (afziVar == null) {
            $$$reportNull$$$0(12);
        }
        return afziVar;
    }

    public defpackage.ahof getWrapperFqName() {
        defpackage.ahof ahofVar = this.wrapperFqName;
        if (ahofVar == null) {
            $$$reportNull$$$0(15);
        }
        return ahofVar;
    }

    public static defpackage.ahxe get(defpackage.afzi afziVar) {
        if (afziVar == null) {
            $$$reportNull$$$0(5);
        }
        defpackage.ahxe ahxeVar = TYPE_BY_PRIMITIVE_TYPE.get(afziVar);
        if (ahxeVar == null) {
            $$$reportNull$$$0(6);
        }
        return ahxeVar;
    }
}
