package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahma {
    public static final defpackage.ahlz<defpackage.ahib> CLASS_KIND;
    public static final defpackage.ahlx DECLARES_DEFAULT_VALUE;
    public static final defpackage.ahlx DEFINITELY_NOT_NULL_TYPE;
    public static final defpackage.ahlx HAS_ANNOTATIONS;
    public static final defpackage.ahlx HAS_CONSTANT;
    public static final defpackage.ahlx HAS_ENUM_ENTRIES;
    public static final defpackage.ahlx HAS_GETTER;
    public static final defpackage.ahlx HAS_SETTER;
    public static final defpackage.ahlx IS_CONST;
    public static final defpackage.ahlx IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final defpackage.ahlx IS_CROSSINLINE;
    public static final defpackage.ahlx IS_DATA;
    public static final defpackage.ahlx IS_DELEGATED;
    public static final defpackage.ahlx IS_EXPECT_CLASS;
    public static final defpackage.ahlx IS_EXPECT_FUNCTION;
    public static final defpackage.ahlx IS_EXPECT_PROPERTY;
    public static final defpackage.ahlx IS_EXTERNAL_ACCESSOR;
    public static final defpackage.ahlx IS_EXTERNAL_CLASS;
    public static final defpackage.ahlx IS_EXTERNAL_FUNCTION;
    public static final defpackage.ahlx IS_EXTERNAL_PROPERTY;
    public static final defpackage.ahlx IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final defpackage.ahlx IS_FUN_INTERFACE;
    public static final defpackage.ahlx IS_INFIX;
    public static final defpackage.ahlx IS_INLINE;
    public static final defpackage.ahlx IS_INLINE_ACCESSOR;
    public static final defpackage.ahlx IS_INNER;
    public static final defpackage.ahlx IS_LATEINIT;
    public static final defpackage.ahlx IS_NEGATED;
    public static final defpackage.ahlx IS_NOINLINE;
    public static final defpackage.ahlx IS_NOT_DEFAULT;
    public static final defpackage.ahlx IS_NULL_CHECK_PREDICATE;
    public static final defpackage.ahlx IS_OPERATOR;
    public static final defpackage.ahlx IS_SECONDARY;
    public static final defpackage.ahlx IS_STATIC_FUNCTION;
    public static final defpackage.ahlx IS_STATIC_PROPERTY;
    public static final defpackage.ahlx IS_SUSPEND;
    public static final defpackage.ahlx IS_TAILREC;
    public static final defpackage.ahlx IS_UNSIGNED;
    public static final defpackage.ahlx IS_VALUE_CLASS;
    public static final defpackage.ahlx IS_VAR;
    public static final defpackage.ahlz<defpackage.ahjh> MEMBER_KIND;
    public static final defpackage.ahlz<defpackage.ahjj> MODALITY;
    public static final defpackage.ahlz<defpackage.ahkc> RETURN_VALUE_STATUS_CTOR;
    public static final defpackage.ahlz<defpackage.ahkc> RETURN_VALUE_STATUS_FUNCTION;
    public static final defpackage.ahlz<defpackage.ahkc> RETURN_VALUE_STATUS_PROPERTY;
    public static final defpackage.ahlx SUSPEND_TYPE;
    public static final defpackage.ahlz<defpackage.ahln> VISIBILITY;

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "modality";
        } else if (i == 2) {
            objArr[0] = "kind";
        } else if (i == 5) {
            objArr[0] = "modality";
        } else if (i == 6) {
            objArr[0] = "memberKind";
        } else if (i == 8) {
            objArr[0] = "modality";
        } else if (i == 9) {
            objArr[0] = "memberKind";
        } else if (i != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        defpackage.ahlx ahlxVarBooleanFirst = defpackage.ahlz.booleanFirst();
        SUSPEND_TYPE = ahlxVarBooleanFirst;
        DEFINITELY_NOT_NULL_TYPE = defpackage.ahlz.booleanAfter(ahlxVarBooleanFirst);
        defpackage.ahlx ahlxVarBooleanFirst2 = defpackage.ahlz.booleanFirst();
        HAS_ANNOTATIONS = ahlxVarBooleanFirst2;
        defpackage.ahlz<defpackage.ahln> ahlzVarAfter = defpackage.ahlz.after(ahlxVarBooleanFirst2, defpackage.ahln.values());
        VISIBILITY = ahlzVarAfter;
        defpackage.ahlz<defpackage.ahjj> ahlzVarAfter2 = defpackage.ahlz.after(ahlzVarAfter, defpackage.ahjj.values());
        MODALITY = ahlzVarAfter2;
        defpackage.ahlz<defpackage.ahib> ahlzVarAfter3 = defpackage.ahlz.after(ahlzVarAfter2, defpackage.ahib.values());
        CLASS_KIND = ahlzVarAfter3;
        defpackage.ahlx ahlxVarBooleanAfter = defpackage.ahlz.booleanAfter(ahlzVarAfter3);
        IS_INNER = ahlxVarBooleanAfter;
        defpackage.ahlx ahlxVarBooleanAfter2 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter);
        IS_DATA = ahlxVarBooleanAfter2;
        defpackage.ahlx ahlxVarBooleanAfter3 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter2);
        IS_EXTERNAL_CLASS = ahlxVarBooleanAfter3;
        defpackage.ahlx ahlxVarBooleanAfter4 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter3);
        IS_EXPECT_CLASS = ahlxVarBooleanAfter4;
        defpackage.ahlx ahlxVarBooleanAfter5 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter4);
        IS_VALUE_CLASS = ahlxVarBooleanAfter5;
        defpackage.ahlx ahlxVarBooleanAfter6 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter5);
        IS_FUN_INTERFACE = ahlxVarBooleanAfter6;
        HAS_ENUM_ENTRIES = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter6);
        defpackage.ahlx ahlxVarBooleanAfter7 = defpackage.ahlz.booleanAfter(ahlzVarAfter);
        IS_SECONDARY = ahlxVarBooleanAfter7;
        defpackage.ahlx ahlxVarBooleanAfter8 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter7);
        IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = ahlxVarBooleanAfter8;
        RETURN_VALUE_STATUS_CTOR = defpackage.ahlz.after(ahlxVarBooleanAfter8, defpackage.ahkc.values());
        defpackage.ahlz<defpackage.ahjh> ahlzVarAfter4 = defpackage.ahlz.after(ahlzVarAfter2, defpackage.ahjh.values());
        MEMBER_KIND = ahlzVarAfter4;
        defpackage.ahlx ahlxVarBooleanAfter9 = defpackage.ahlz.booleanAfter(ahlzVarAfter4);
        IS_OPERATOR = ahlxVarBooleanAfter9;
        defpackage.ahlx ahlxVarBooleanAfter10 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter9);
        IS_INFIX = ahlxVarBooleanAfter10;
        defpackage.ahlx ahlxVarBooleanAfter11 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter10);
        IS_INLINE = ahlxVarBooleanAfter11;
        defpackage.ahlx ahlxVarBooleanAfter12 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter11);
        IS_TAILREC = ahlxVarBooleanAfter12;
        defpackage.ahlx ahlxVarBooleanAfter13 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter12);
        IS_EXTERNAL_FUNCTION = ahlxVarBooleanAfter13;
        defpackage.ahlx ahlxVarBooleanAfter14 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter13);
        IS_SUSPEND = ahlxVarBooleanAfter14;
        defpackage.ahlx ahlxVarBooleanAfter15 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter14);
        IS_EXPECT_FUNCTION = ahlxVarBooleanAfter15;
        defpackage.ahlx ahlxVarBooleanAfter16 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter15);
        IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = ahlxVarBooleanAfter16;
        defpackage.ahlz<defpackage.ahkc> ahlzVarAfter5 = defpackage.ahlz.after(ahlxVarBooleanAfter16, defpackage.ahkc.values());
        RETURN_VALUE_STATUS_FUNCTION = ahlzVarAfter5;
        IS_STATIC_FUNCTION = defpackage.ahlz.booleanAfter(ahlzVarAfter5);
        defpackage.ahlx ahlxVarBooleanAfter17 = defpackage.ahlz.booleanAfter(ahlzVarAfter4);
        IS_VAR = ahlxVarBooleanAfter17;
        defpackage.ahlx ahlxVarBooleanAfter18 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter17);
        HAS_GETTER = ahlxVarBooleanAfter18;
        defpackage.ahlx ahlxVarBooleanAfter19 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter18);
        HAS_SETTER = ahlxVarBooleanAfter19;
        defpackage.ahlx ahlxVarBooleanAfter20 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter19);
        IS_CONST = ahlxVarBooleanAfter20;
        defpackage.ahlx ahlxVarBooleanAfter21 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter20);
        IS_LATEINIT = ahlxVarBooleanAfter21;
        defpackage.ahlx ahlxVarBooleanAfter22 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter21);
        HAS_CONSTANT = ahlxVarBooleanAfter22;
        defpackage.ahlx ahlxVarBooleanAfter23 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter22);
        IS_EXTERNAL_PROPERTY = ahlxVarBooleanAfter23;
        defpackage.ahlx ahlxVarBooleanAfter24 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter23);
        IS_DELEGATED = ahlxVarBooleanAfter24;
        defpackage.ahlx ahlxVarBooleanAfter25 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter24);
        IS_EXPECT_PROPERTY = ahlxVarBooleanAfter25;
        defpackage.ahlz<defpackage.ahkc> ahlzVarAfter6 = defpackage.ahlz.after(ahlxVarBooleanAfter25, defpackage.ahkc.values());
        RETURN_VALUE_STATUS_PROPERTY = ahlzVarAfter6;
        IS_STATIC_PROPERTY = defpackage.ahlz.booleanAfter(ahlzVarAfter6);
        defpackage.ahlx ahlxVarBooleanAfter26 = defpackage.ahlz.booleanAfter(ahlxVarBooleanFirst2);
        DECLARES_DEFAULT_VALUE = ahlxVarBooleanAfter26;
        defpackage.ahlx ahlxVarBooleanAfter27 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter26);
        IS_CROSSINLINE = ahlxVarBooleanAfter27;
        IS_NOINLINE = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter27);
        defpackage.ahlx ahlxVarBooleanAfter28 = defpackage.ahlz.booleanAfter(ahlzVarAfter2);
        IS_NOT_DEFAULT = ahlxVarBooleanAfter28;
        defpackage.ahlx ahlxVarBooleanAfter29 = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter28);
        IS_EXTERNAL_ACCESSOR = ahlxVarBooleanAfter29;
        IS_INLINE_ACCESSOR = defpackage.ahlz.booleanAfter(ahlxVarBooleanAfter29);
        defpackage.ahlx ahlxVarBooleanFirst3 = defpackage.ahlz.booleanFirst();
        IS_NEGATED = ahlxVarBooleanFirst3;
        IS_NULL_CHECK_PREDICATE = defpackage.ahlz.booleanAfter(ahlxVarBooleanFirst3);
        IS_UNSIGNED = defpackage.ahlz.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, defpackage.ahln ahlnVar, defpackage.ahjj ahjjVar, boolean z2, boolean z3, boolean z4) {
        if (ahlnVar == null) {
            $$$reportNull$$$0(10);
        }
        if (ahjjVar == null) {
            $$$reportNull$$$0(11);
        }
        return HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(z)) | MODALITY.toFlags(ahjjVar) | VISIBILITY.toFlags(ahlnVar) | IS_NOT_DEFAULT.toFlags(java.lang.Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(java.lang.Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(java.lang.Boolean.valueOf(z4));
    }
}
