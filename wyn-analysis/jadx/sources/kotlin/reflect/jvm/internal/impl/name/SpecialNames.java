package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class SpecialNames {

    @NotNull
    public static final Name ANONYMOUS;

    @NotNull
    public static final Name ARRAY;

    @NotNull
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;

    @NotNull
    public static final Name DESTRUCT;

    @NotNull
    public static final Name ENUM_GET_ENTRIES;

    @NotNull
    public static final Name IMPLICIT_SET_PARAMETER;

    @NotNull
    public static final Name INIT;

    @NotNull
    public static final SpecialNames INSTANCE = new SpecialNames();

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name LOCAL;

    @NotNull
    public static final Name NO_NAME_PROVIDED;

    @NotNull
    public static final Name RECEIVER;

    @NotNull
    public static final Name ROOT_PACKAGE;

    @NotNull
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;

    @NotNull
    public static final Name THIS;

    @NotNull
    public static final Name UNARY;

    @NotNull
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    static {
        Name nameSpecial = Name.special("<no name provided>");
        AbstractC3340k.d(nameSpecial, "special(...)");
        NO_NAME_PROVIDED = nameSpecial;
        Name nameSpecial2 = Name.special("<root package>");
        AbstractC3340k.d(nameSpecial2, "special(...)");
        ROOT_PACKAGE = nameSpecial2;
        Name nameIdentifier = Name.identifier("Companion");
        AbstractC3340k.d(nameIdentifier, "identifier(...)");
        DEFAULT_NAME_FOR_COMPANION_OBJECT = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        AbstractC3340k.d(nameIdentifier2, "identifier(...)");
        SAFE_IDENTIFIER_FOR_NO_NAME = nameIdentifier2;
        Name nameSpecial3 = Name.special("<anonymous>");
        AbstractC3340k.d(nameSpecial3, "special(...)");
        ANONYMOUS = nameSpecial3;
        Name nameSpecial4 = Name.special("<unary>");
        AbstractC3340k.d(nameSpecial4, "special(...)");
        UNARY = nameSpecial4;
        Name nameSpecial5 = Name.special("<this>");
        AbstractC3340k.d(nameSpecial5, "special(...)");
        THIS = nameSpecial5;
        Name nameSpecial6 = Name.special("<init>");
        AbstractC3340k.d(nameSpecial6, "special(...)");
        INIT = nameSpecial6;
        Name nameSpecial7 = Name.special("<iterator>");
        AbstractC3340k.d(nameSpecial7, "special(...)");
        ITERATOR = nameSpecial7;
        Name nameSpecial8 = Name.special("<destruct>");
        AbstractC3340k.d(nameSpecial8, "special(...)");
        DESTRUCT = nameSpecial8;
        Name nameSpecial9 = Name.special("<local>");
        AbstractC3340k.d(nameSpecial9, "special(...)");
        LOCAL = nameSpecial9;
        Name nameSpecial10 = Name.special("<unused var>");
        AbstractC3340k.d(nameSpecial10, "special(...)");
        UNDERSCORE_FOR_UNUSED_VAR = nameSpecial10;
        Name nameSpecial11 = Name.special("<set-?>");
        AbstractC3340k.d(nameSpecial11, "special(...)");
        IMPLICIT_SET_PARAMETER = nameSpecial11;
        Name nameSpecial12 = Name.special("<array>");
        AbstractC3340k.d(nameSpecial12, "special(...)");
        ARRAY = nameSpecial12;
        Name nameSpecial13 = Name.special("<receiver>");
        AbstractC3340k.d(nameSpecial13, "special(...)");
        RECEIVER = nameSpecial13;
        Name nameSpecial14 = Name.special("<get-entries>");
        AbstractC3340k.d(nameSpecial14, "special(...)");
        ENUM_GET_ENTRIES = nameSpecial14;
    }

    private SpecialNames() {
    }

    @NotNull
    public static final Name safeIdentifier(@Nullable Name name) {
        return (name == null || name.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name;
    }

    public final boolean isSafeIdentifier(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        String strAsString = name.asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        return strAsString.length() > 0 && !name.isSpecial();
    }
}
