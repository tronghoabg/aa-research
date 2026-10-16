package defpackage;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class afyi {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afyi[] $VALUES;
    public static final afyi BOOLEAN = new afyi("BOOLEAN", 0, "Boolean");
    public static final afyi BYTE;
    public static final afyi CHAR;
    public static final afyh Companion;
    public static final afyi DOUBLE;
    public static final afyi FLOAT;
    public static final afyi INT;
    public static final afyi LONG;
    public static final Set<afyi> NUMBER_TYPES;
    public static final afyi SHORT;
    private final ahnj arrayTypeName;
    private final ahnj typeName;
    private final aezr typeFqName$delegate = woy.dH(2, new afyf(this));
    private final aezr arrayTypeFqName$delegate = woy.dH(2, new afyg(this));

    private static final /* synthetic */ afyi[] $values() {
        return new afyi[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        afyi afyiVar = new afyi("CHAR", 1, "Char");
        CHAR = afyiVar;
        afyi afyiVar2 = new afyi("BYTE", 2, "Byte");
        BYTE = afyiVar2;
        afyi afyiVar3 = new afyi("SHORT", 3, "Short");
        SHORT = afyiVar3;
        afyi afyiVar4 = new afyi("INT", 4, "Int");
        INT = afyiVar4;
        afyi afyiVar5 = new afyi("FLOAT", 5, "Float");
        FLOAT = afyiVar5;
        afyi afyiVar6 = new afyi("LONG", 6, "Long");
        LONG = afyiVar6;
        afyi afyiVar7 = new afyi("DOUBLE", 7, "Double");
        DOUBLE = afyiVar7;
        afyi[] afyiVarArr$values = $values();
        $VALUES = afyiVarArr$values;
        $ENTRIES = affa.p(afyiVarArr$values);
        Companion = new afyh(null);
        NUMBER_TYPES = woy.di(new afyi[]{afyiVar, afyiVar2, afyiVar3, afyiVar4, afyiVar5, afyiVar6, afyiVar7});
    }

    private afyi(String str, int i, String str2) {
        this.typeName = ahnj.identifier(str2);
        this.arrayTypeName = ahnj.identifier(String.valueOf(str2).concat("Array"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnf arrayTypeFqName_delegate$lambda$0(afyi afyiVar) {
        return afyo.BUILT_INS_PACKAGE_FQ_NAME.child(afyiVar.arrayTypeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnf typeFqName_delegate$lambda$0(afyi afyiVar) {
        return afyo.BUILT_INS_PACKAGE_FQ_NAME.child(afyiVar.typeName);
    }

    public static afyi valueOf(String str) {
        return (afyi) Enum.valueOf(afyi.class, str);
    }

    public static afyi[] values() {
        return (afyi[]) $VALUES.clone();
    }

    public final ahnf getArrayTypeFqName() {
        return (ahnf) this.arrayTypeFqName$delegate.a();
    }

    public final ahnj getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final ahnf getTypeFqName() {
        return (ahnf) this.typeFqName$delegate.a();
    }

    public final ahnj getTypeName() {
        return this.typeName;
    }
}
