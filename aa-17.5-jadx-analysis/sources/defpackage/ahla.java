package defpackage;

/* loaded from: classes3.dex */
public final class ahla {
    public static final ahkz<ahhb> CLASS_KIND;
    public static final ahkx DECLARES_DEFAULT_VALUE;
    public static final ahkx DEFINITELY_NOT_NULL_TYPE;
    public static final ahkx HAS_ANNOTATIONS;
    public static final ahkx HAS_CONSTANT;
    public static final ahkx HAS_ENUM_ENTRIES;
    public static final ahkx HAS_GETTER;
    public static final ahkx HAS_SETTER;
    public static final ahkx IS_CONST;
    public static final ahkx IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final ahkx IS_CROSSINLINE;
    public static final ahkx IS_DATA;
    public static final ahkx IS_DELEGATED;
    public static final ahkx IS_EXPECT_CLASS;
    public static final ahkx IS_EXPECT_FUNCTION;
    public static final ahkx IS_EXPECT_PROPERTY;
    public static final ahkx IS_EXTERNAL_ACCESSOR;
    public static final ahkx IS_EXTERNAL_CLASS;
    public static final ahkx IS_EXTERNAL_FUNCTION;
    public static final ahkx IS_EXTERNAL_PROPERTY;
    public static final ahkx IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final ahkx IS_FUN_INTERFACE;
    public static final ahkx IS_INFIX;
    public static final ahkx IS_INLINE;
    public static final ahkx IS_INLINE_ACCESSOR;
    public static final ahkx IS_INNER;
    public static final ahkx IS_LATEINIT;
    public static final ahkx IS_NEGATED;
    public static final ahkx IS_NOINLINE;
    public static final ahkx IS_NOT_DEFAULT;
    public static final ahkx IS_NULL_CHECK_PREDICATE;
    public static final ahkx IS_OPERATOR;
    public static final ahkx IS_SECONDARY;
    public static final ahkx IS_STATIC_FUNCTION;
    public static final ahkx IS_STATIC_PROPERTY;
    public static final ahkx IS_SUSPEND;
    public static final ahkx IS_TAILREC;
    public static final ahkx IS_UNSIGNED;
    public static final ahkx IS_VALUE_CLASS;
    public static final ahkx IS_VAR;
    public static final ahkz<ahih> MEMBER_KIND;
    public static final ahkz<ahij> MODALITY;
    public static final ahkz<ahjc> RETURN_VALUE_STATUS_CTOR;
    public static final ahkz<ahjc> RETURN_VALUE_STATUS_FUNCTION;
    public static final ahkz<ahjc> RETURN_VALUE_STATUS_PROPERTY;
    public static final ahkx SUSPEND_TYPE;
    public static final ahkz<ahkn> VISIBILITY;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahla.$$$reportNull$$$0(int):void");
    }

    static {
        ahkx ahkxVarBooleanFirst = ahkz.booleanFirst();
        SUSPEND_TYPE = ahkxVarBooleanFirst;
        DEFINITELY_NOT_NULL_TYPE = ahkz.booleanAfter(ahkxVarBooleanFirst);
        ahkx ahkxVarBooleanFirst2 = ahkz.booleanFirst();
        HAS_ANNOTATIONS = ahkxVarBooleanFirst2;
        ahkz<ahkn> ahkzVarAfter = ahkz.after(ahkxVarBooleanFirst2, ahkn.values());
        VISIBILITY = ahkzVarAfter;
        ahkz<ahij> ahkzVarAfter2 = ahkz.after(ahkzVarAfter, ahij.values());
        MODALITY = ahkzVarAfter2;
        ahkz<ahhb> ahkzVarAfter3 = ahkz.after(ahkzVarAfter2, ahhb.values());
        CLASS_KIND = ahkzVarAfter3;
        ahkx ahkxVarBooleanAfter = ahkz.booleanAfter(ahkzVarAfter3);
        IS_INNER = ahkxVarBooleanAfter;
        ahkx ahkxVarBooleanAfter2 = ahkz.booleanAfter(ahkxVarBooleanAfter);
        IS_DATA = ahkxVarBooleanAfter2;
        ahkx ahkxVarBooleanAfter3 = ahkz.booleanAfter(ahkxVarBooleanAfter2);
        IS_EXTERNAL_CLASS = ahkxVarBooleanAfter3;
        ahkx ahkxVarBooleanAfter4 = ahkz.booleanAfter(ahkxVarBooleanAfter3);
        IS_EXPECT_CLASS = ahkxVarBooleanAfter4;
        ahkx ahkxVarBooleanAfter5 = ahkz.booleanAfter(ahkxVarBooleanAfter4);
        IS_VALUE_CLASS = ahkxVarBooleanAfter5;
        ahkx ahkxVarBooleanAfter6 = ahkz.booleanAfter(ahkxVarBooleanAfter5);
        IS_FUN_INTERFACE = ahkxVarBooleanAfter6;
        HAS_ENUM_ENTRIES = ahkz.booleanAfter(ahkxVarBooleanAfter6);
        ahkx ahkxVarBooleanAfter7 = ahkz.booleanAfter(ahkzVarAfter);
        IS_SECONDARY = ahkxVarBooleanAfter7;
        ahkx ahkxVarBooleanAfter8 = ahkz.booleanAfter(ahkxVarBooleanAfter7);
        IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = ahkxVarBooleanAfter8;
        RETURN_VALUE_STATUS_CTOR = ahkz.after(ahkxVarBooleanAfter8, ahjc.values());
        ahkz<ahih> ahkzVarAfter4 = ahkz.after(ahkzVarAfter2, ahih.values());
        MEMBER_KIND = ahkzVarAfter4;
        ahkx ahkxVarBooleanAfter9 = ahkz.booleanAfter(ahkzVarAfter4);
        IS_OPERATOR = ahkxVarBooleanAfter9;
        ahkx ahkxVarBooleanAfter10 = ahkz.booleanAfter(ahkxVarBooleanAfter9);
        IS_INFIX = ahkxVarBooleanAfter10;
        ahkx ahkxVarBooleanAfter11 = ahkz.booleanAfter(ahkxVarBooleanAfter10);
        IS_INLINE = ahkxVarBooleanAfter11;
        ahkx ahkxVarBooleanAfter12 = ahkz.booleanAfter(ahkxVarBooleanAfter11);
        IS_TAILREC = ahkxVarBooleanAfter12;
        ahkx ahkxVarBooleanAfter13 = ahkz.booleanAfter(ahkxVarBooleanAfter12);
        IS_EXTERNAL_FUNCTION = ahkxVarBooleanAfter13;
        ahkx ahkxVarBooleanAfter14 = ahkz.booleanAfter(ahkxVarBooleanAfter13);
        IS_SUSPEND = ahkxVarBooleanAfter14;
        ahkx ahkxVarBooleanAfter15 = ahkz.booleanAfter(ahkxVarBooleanAfter14);
        IS_EXPECT_FUNCTION = ahkxVarBooleanAfter15;
        ahkx ahkxVarBooleanAfter16 = ahkz.booleanAfter(ahkxVarBooleanAfter15);
        IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = ahkxVarBooleanAfter16;
        ahkz<ahjc> ahkzVarAfter5 = ahkz.after(ahkxVarBooleanAfter16, ahjc.values());
        RETURN_VALUE_STATUS_FUNCTION = ahkzVarAfter5;
        IS_STATIC_FUNCTION = ahkz.booleanAfter(ahkzVarAfter5);
        ahkx ahkxVarBooleanAfter17 = ahkz.booleanAfter(ahkzVarAfter4);
        IS_VAR = ahkxVarBooleanAfter17;
        ahkx ahkxVarBooleanAfter18 = ahkz.booleanAfter(ahkxVarBooleanAfter17);
        HAS_GETTER = ahkxVarBooleanAfter18;
        ahkx ahkxVarBooleanAfter19 = ahkz.booleanAfter(ahkxVarBooleanAfter18);
        HAS_SETTER = ahkxVarBooleanAfter19;
        ahkx ahkxVarBooleanAfter20 = ahkz.booleanAfter(ahkxVarBooleanAfter19);
        IS_CONST = ahkxVarBooleanAfter20;
        ahkx ahkxVarBooleanAfter21 = ahkz.booleanAfter(ahkxVarBooleanAfter20);
        IS_LATEINIT = ahkxVarBooleanAfter21;
        ahkx ahkxVarBooleanAfter22 = ahkz.booleanAfter(ahkxVarBooleanAfter21);
        HAS_CONSTANT = ahkxVarBooleanAfter22;
        ahkx ahkxVarBooleanAfter23 = ahkz.booleanAfter(ahkxVarBooleanAfter22);
        IS_EXTERNAL_PROPERTY = ahkxVarBooleanAfter23;
        ahkx ahkxVarBooleanAfter24 = ahkz.booleanAfter(ahkxVarBooleanAfter23);
        IS_DELEGATED = ahkxVarBooleanAfter24;
        ahkx ahkxVarBooleanAfter25 = ahkz.booleanAfter(ahkxVarBooleanAfter24);
        IS_EXPECT_PROPERTY = ahkxVarBooleanAfter25;
        ahkz<ahjc> ahkzVarAfter6 = ahkz.after(ahkxVarBooleanAfter25, ahjc.values());
        RETURN_VALUE_STATUS_PROPERTY = ahkzVarAfter6;
        IS_STATIC_PROPERTY = ahkz.booleanAfter(ahkzVarAfter6);
        ahkx ahkxVarBooleanAfter26 = ahkz.booleanAfter(ahkxVarBooleanFirst2);
        DECLARES_DEFAULT_VALUE = ahkxVarBooleanAfter26;
        ahkx ahkxVarBooleanAfter27 = ahkz.booleanAfter(ahkxVarBooleanAfter26);
        IS_CROSSINLINE = ahkxVarBooleanAfter27;
        IS_NOINLINE = ahkz.booleanAfter(ahkxVarBooleanAfter27);
        ahkx ahkxVarBooleanAfter28 = ahkz.booleanAfter(ahkzVarAfter2);
        IS_NOT_DEFAULT = ahkxVarBooleanAfter28;
        ahkx ahkxVarBooleanAfter29 = ahkz.booleanAfter(ahkxVarBooleanAfter28);
        IS_EXTERNAL_ACCESSOR = ahkxVarBooleanAfter29;
        IS_INLINE_ACCESSOR = ahkz.booleanAfter(ahkxVarBooleanAfter29);
        ahkx ahkxVarBooleanFirst3 = ahkz.booleanFirst();
        IS_NEGATED = ahkxVarBooleanFirst3;
        IS_NULL_CHECK_PREDICATE = ahkz.booleanAfter(ahkxVarBooleanFirst3);
        IS_UNSIGNED = ahkz.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, ahkn ahknVar, ahij ahijVar, boolean z2, boolean z3, boolean z4) {
        if (ahknVar == null) {
            $$$reportNull$$$0(10);
        }
        if (ahijVar == null) {
            $$$reportNull$$$0(11);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | MODALITY.toFlags(ahijVar) | VISIBILITY.toFlags(ahknVar) | IS_NOT_DEFAULT.toFlags(Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(Boolean.valueOf(z4));
    }
}
