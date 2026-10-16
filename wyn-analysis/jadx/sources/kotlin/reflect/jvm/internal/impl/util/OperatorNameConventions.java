package kotlin.reflect.jvm.internal.impl.util;

import Bf.i;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2645F;
import ff.m;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.apache.tika.metadata.IPTC;
import org.jetbrains.annotations.NotNull;
import tg.b;

/* loaded from: classes5.dex */
public final class OperatorNameConventions {

    @NotNull
    public static final Set<Name> ALL_BINARY_OPERATION_NAMES;

    @NotNull
    public static final Name AND;

    @NotNull
    public static final Set<Name> ASSIGNMENT_OPERATIONS;

    @NotNull
    public static final Set<Name> BINARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> BITWISE_OPERATION_NAMES;

    @NotNull
    public static final Name COMPARE_TO;

    @NotNull
    public static final i COMPONENT_REGEX;

    @NotNull
    public static final Name CONTAINS;

    @NotNull
    public static final Name DEC;

    @NotNull
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS;

    @NotNull
    public static final Name DIV;

    @NotNull
    public static final Name DIV_ASSIGN;

    @NotNull
    public static final Name EQUALS;

    @NotNull
    public static final Name GET;

    @NotNull
    public static final Name GET_VALUE;

    @NotNull
    public static final Name HASH_CODE;

    @NotNull
    public static final Name HAS_NEXT;

    @NotNull
    public static final Name INC;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    @NotNull
    public static final Name INV;

    @NotNull
    public static final Name INVOKE;

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name MINUS;

    @NotNull
    public static final Name MINUS_ASSIGN;

    @NotNull
    public static final Name MOD;

    @NotNull
    public static final Name MOD_ASSIGN;

    @NotNull
    public static final Map<Name, Name> MOD_OPERATORS_REPLACEMENT;

    @NotNull
    public static final Name NEXT;

    @NotNull
    public static final Name NOT;

    @NotNull
    public static final Name OR;

    @NotNull
    public static final Name PLUS;

    @NotNull
    public static final Name PLUS_ASSIGN;

    @NotNull
    public static final Name PROVIDE_DELEGATE;

    @NotNull
    public static final Name RANGE_TO;

    @NotNull
    public static final Name RANGE_UNTIL;

    @NotNull
    public static final Name REM;

    @NotNull
    public static final Name REM_ASSIGN;

    @NotNull
    public static final Name SET;

    @NotNull
    public static final Name SET_VALUE;

    @NotNull
    public static final Name SHL;

    @NotNull
    public static final Name SHR;

    @NotNull
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> STATEMENT_LIKE_OPERATORS;

    @NotNull
    public static final Name TIMES;

    @NotNull
    public static final Name TIMES_ASSIGN;

    @NotNull
    public static final Name TO_STRING;

    @NotNull
    public static final Name UNARY_MINUS;

    @NotNull
    public static final Set<Name> UNARY_OPERATION_NAMES;

    @NotNull
    public static final Name UNARY_PLUS;

    @NotNull
    public static final Name USHR;

    @NotNull
    public static final Name XOR;

    static {
        Name nameIdentifier = Name.identifier("getValue");
        AbstractC3340k.d(nameIdentifier, "identifier(...)");
        GET_VALUE = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("setValue");
        AbstractC3340k.d(nameIdentifier2, "identifier(...)");
        SET_VALUE = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("provideDelegate");
        AbstractC3340k.d(nameIdentifier3, "identifier(...)");
        PROVIDE_DELEGATE = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("equals");
        AbstractC3340k.d(nameIdentifier4, "identifier(...)");
        EQUALS = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("hashCode");
        AbstractC3340k.d(nameIdentifier5, "identifier(...)");
        HASH_CODE = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("compareTo");
        AbstractC3340k.d(nameIdentifier6, "identifier(...)");
        COMPARE_TO = nameIdentifier6;
        Name nameIdentifier7 = Name.identifier("contains");
        AbstractC3340k.d(nameIdentifier7, "identifier(...)");
        CONTAINS = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("invoke");
        AbstractC3340k.d(nameIdentifier8, "identifier(...)");
        INVOKE = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("iterator");
        AbstractC3340k.d(nameIdentifier9, "identifier(...)");
        ITERATOR = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("get");
        AbstractC3340k.d(nameIdentifier10, "identifier(...)");
        GET = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("set");
        AbstractC3340k.d(nameIdentifier11, "identifier(...)");
        SET = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("next");
        AbstractC3340k.d(nameIdentifier12, "identifier(...)");
        NEXT = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("hasNext");
        AbstractC3340k.d(nameIdentifier13, "identifier(...)");
        HAS_NEXT = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("toString");
        AbstractC3340k.d(nameIdentifier14, "identifier(...)");
        TO_STRING = nameIdentifier14;
        COMPONENT_REGEX = new i("component\\d+");
        Name nameIdentifier15 = Name.identifier("and");
        AbstractC3340k.d(nameIdentifier15, "identifier(...)");
        AND = nameIdentifier15;
        Name nameIdentifier16 = Name.identifier("or");
        AbstractC3340k.d(nameIdentifier16, "identifier(...)");
        OR = nameIdentifier16;
        Name nameIdentifier17 = Name.identifier("xor");
        AbstractC3340k.d(nameIdentifier17, "identifier(...)");
        XOR = nameIdentifier17;
        Name nameIdentifier18 = Name.identifier("inv");
        AbstractC3340k.d(nameIdentifier18, "identifier(...)");
        INV = nameIdentifier18;
        Name nameIdentifier19 = Name.identifier("shl");
        AbstractC3340k.d(nameIdentifier19, "identifier(...)");
        SHL = nameIdentifier19;
        Name nameIdentifier20 = Name.identifier("shr");
        AbstractC3340k.d(nameIdentifier20, "identifier(...)");
        SHR = nameIdentifier20;
        Name nameIdentifier21 = Name.identifier("ushr");
        AbstractC3340k.d(nameIdentifier21, "identifier(...)");
        USHR = nameIdentifier21;
        Name nameIdentifier22 = Name.identifier("inc");
        AbstractC3340k.d(nameIdentifier22, "identifier(...)");
        INC = nameIdentifier22;
        Name nameIdentifier23 = Name.identifier("dec");
        AbstractC3340k.d(nameIdentifier23, "identifier(...)");
        DEC = nameIdentifier23;
        Name nameIdentifier24 = Name.identifier(IPTC.PREFIX_PLUS);
        AbstractC3340k.d(nameIdentifier24, "identifier(...)");
        PLUS = nameIdentifier24;
        Name nameIdentifier25 = Name.identifier("minus");
        AbstractC3340k.d(nameIdentifier25, "identifier(...)");
        MINUS = nameIdentifier25;
        Name nameIdentifier26 = Name.identifier("not");
        AbstractC3340k.d(nameIdentifier26, "identifier(...)");
        NOT = nameIdentifier26;
        Name nameIdentifier27 = Name.identifier("unaryMinus");
        AbstractC3340k.d(nameIdentifier27, "identifier(...)");
        UNARY_MINUS = nameIdentifier27;
        Name nameIdentifier28 = Name.identifier("unaryPlus");
        AbstractC3340k.d(nameIdentifier28, "identifier(...)");
        UNARY_PLUS = nameIdentifier28;
        Name nameIdentifier29 = Name.identifier("times");
        AbstractC3340k.d(nameIdentifier29, "identifier(...)");
        TIMES = nameIdentifier29;
        Name nameIdentifier30 = Name.identifier("div");
        AbstractC3340k.d(nameIdentifier30, "identifier(...)");
        DIV = nameIdentifier30;
        Name nameIdentifier31 = Name.identifier("mod");
        AbstractC3340k.d(nameIdentifier31, "identifier(...)");
        MOD = nameIdentifier31;
        Name nameIdentifier32 = Name.identifier("rem");
        AbstractC3340k.d(nameIdentifier32, "identifier(...)");
        REM = nameIdentifier32;
        Name nameIdentifier33 = Name.identifier("rangeTo");
        AbstractC3340k.d(nameIdentifier33, "identifier(...)");
        RANGE_TO = nameIdentifier33;
        Name nameIdentifier34 = Name.identifier("rangeUntil");
        AbstractC3340k.d(nameIdentifier34, "identifier(...)");
        RANGE_UNTIL = nameIdentifier34;
        Name nameIdentifier35 = Name.identifier("timesAssign");
        AbstractC3340k.d(nameIdentifier35, "identifier(...)");
        TIMES_ASSIGN = nameIdentifier35;
        Name nameIdentifier36 = Name.identifier("divAssign");
        AbstractC3340k.d(nameIdentifier36, "identifier(...)");
        DIV_ASSIGN = nameIdentifier36;
        Name nameIdentifier37 = Name.identifier("modAssign");
        AbstractC3340k.d(nameIdentifier37, "identifier(...)");
        MOD_ASSIGN = nameIdentifier37;
        Name nameIdentifier38 = Name.identifier("remAssign");
        AbstractC3340k.d(nameIdentifier38, "identifier(...)");
        REM_ASSIGN = nameIdentifier38;
        Name nameIdentifier39 = Name.identifier("plusAssign");
        AbstractC3340k.d(nameIdentifier39, "identifier(...)");
        PLUS_ASSIGN = nameIdentifier39;
        Name nameIdentifier40 = Name.identifier("minusAssign");
        AbstractC3340k.d(nameIdentifier40, "identifier(...)");
        MINUS_ASSIGN = nameIdentifier40;
        UNARY_OPERATION_NAMES = m.P0(new Name[]{nameIdentifier22, nameIdentifier23, nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18});
        SIMPLE_UNARY_OPERATION_NAMES = m.P0(new Name[]{nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18});
        Set<Name> setP0 = m.P0(new Name[]{nameIdentifier29, nameIdentifier24, nameIdentifier25, nameIdentifier30, nameIdentifier31, nameIdentifier32, nameIdentifier33, nameIdentifier34});
        BINARY_OPERATION_NAMES = setP0;
        Set<Name> setP02 = m.P0(new Name[]{nameIdentifier15, nameIdentifier16, nameIdentifier17, nameIdentifier18, nameIdentifier19, nameIdentifier20, nameIdentifier21});
        BITWISE_OPERATION_NAMES = setP02;
        ALL_BINARY_OPERATION_NAMES = AbstractC2645F.Z(AbstractC2645F.Z(setP0, setP02), m.P0(new Name[]{nameIdentifier4, nameIdentifier7, nameIdentifier6}));
        Set<Name> setP03 = m.P0(new Name[]{nameIdentifier35, nameIdentifier36, nameIdentifier37, nameIdentifier38, nameIdentifier39, nameIdentifier40});
        ASSIGNMENT_OPERATIONS = setP03;
        DELEGATED_PROPERTY_OPERATORS = m.P0(new Name[]{nameIdentifier, nameIdentifier2, nameIdentifier3});
        MOD_OPERATORS_REPLACEMENT = AbstractC2640A.R(new C2527k(nameIdentifier31, nameIdentifier32), new C2527k(nameIdentifier37, nameIdentifier38));
        STATEMENT_LIKE_OPERATORS = AbstractC2645F.Z(b.P(nameIdentifier11), setP03);
    }

    private OperatorNameConventions() {
    }
}
