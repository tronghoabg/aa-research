package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class ahqi {
    private static final /* synthetic */ ahqi[] $VALUES;
    public static final ahqi BOOL;
    public static final ahqi BYTES;
    public static final ahqi DOUBLE;
    public static final ahqi ENUM;
    public static final ahqi FIXED32;
    public static final ahqi FIXED64;
    public static final ahqi FLOAT;
    public static final ahqi GROUP;
    public static final ahqi INT32;
    public static final ahqi INT64;
    public static final ahqi MESSAGE;
    public static final ahqi SFIXED32;
    public static final ahqi SFIXED64;
    public static final ahqi SINT32;
    public static final ahqi SINT64;
    public static final ahqi STRING;
    public static final ahqi UINT32;
    public static final ahqi UINT64;
    private final ahqj javaType;
    private final int wireType;

    static {
        ahqi ahqiVar = new ahqi("DOUBLE", 0, ahqj.DOUBLE, 1);
        DOUBLE = ahqiVar;
        ahqi ahqiVar2 = new ahqi("FLOAT", 1, ahqj.FLOAT, 5);
        FLOAT = ahqiVar2;
        final int i = 2;
        ahqi ahqiVar3 = new ahqi("INT64", 2, ahqj.LONG, 0);
        INT64 = ahqiVar3;
        final int i2 = 3;
        ahqi ahqiVar4 = new ahqi("UINT64", 3, ahqj.LONG, 0);
        UINT64 = ahqiVar4;
        ahqi ahqiVar5 = new ahqi("INT32", 4, ahqj.INT, 0);
        INT32 = ahqiVar5;
        ahqi ahqiVar6 = new ahqi("FIXED64", 5, ahqj.LONG, 1);
        FIXED64 = ahqiVar6;
        ahqi ahqiVar7 = new ahqi("FIXED32", 6, ahqj.INT, 5);
        FIXED32 = ahqiVar7;
        ahqi ahqiVar8 = new ahqi("BOOL", 7, ahqj.BOOLEAN, 0);
        BOOL = ahqiVar8;
        final ahqj ahqjVar = ahqj.STRING;
        final String str = "STRING";
        final int i3 = 8;
        ahqi ahqiVar9 = new ahqi(str, i3, ahqjVar, i) { // from class: ahqe
            @Override // defpackage.ahqi
            public boolean isPackable() {
                return false;
            }
        };
        STRING = ahqiVar9;
        final ahqj ahqjVar2 = ahqj.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        ahqi ahqiVar10 = new ahqi(str2, i4, ahqjVar2, i2) { // from class: ahqf
            @Override // defpackage.ahqi
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = ahqiVar10;
        final ahqj ahqjVar3 = ahqj.MESSAGE;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        ahqi ahqiVar11 = new ahqi(str3, i5, ahqjVar3, i) { // from class: ahqg
            @Override // defpackage.ahqi
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = ahqiVar11;
        final ahqj ahqjVar4 = ahqj.BYTE_STRING;
        final String str4 = "BYTES";
        final int i6 = 11;
        ahqi ahqiVar12 = new ahqi(str4, i6, ahqjVar4, i) { // from class: ahqh
            @Override // defpackage.ahqi
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = ahqiVar12;
        ahqi ahqiVar13 = new ahqi("UINT32", 12, ahqj.INT, 0);
        UINT32 = ahqiVar13;
        ahqi ahqiVar14 = new ahqi("ENUM", 13, ahqj.ENUM, 0);
        ENUM = ahqiVar14;
        ahqi ahqiVar15 = new ahqi("SFIXED32", 14, ahqj.INT, 5);
        SFIXED32 = ahqiVar15;
        ahqi ahqiVar16 = new ahqi("SFIXED64", 15, ahqj.LONG, 1);
        SFIXED64 = ahqiVar16;
        ahqi ahqiVar17 = new ahqi("SINT32", 16, ahqj.INT, 0);
        SINT32 = ahqiVar17;
        ahqi ahqiVar18 = new ahqi("SINT64", 17, ahqj.LONG, 0);
        SINT64 = ahqiVar18;
        $VALUES = new ahqi[]{ahqiVar, ahqiVar2, ahqiVar3, ahqiVar4, ahqiVar5, ahqiVar6, ahqiVar7, ahqiVar8, ahqiVar9, ahqiVar10, ahqiVar11, ahqiVar12, ahqiVar13, ahqiVar14, ahqiVar15, ahqiVar16, ahqiVar17, ahqiVar18};
    }

    private ahqi(String str, int i, ahqj ahqjVar, int i2) {
        this.javaType = ahqjVar;
        this.wireType = i2;
    }

    public static ahqi valueOf(String str) {
        return (ahqi) Enum.valueOf(ahqi.class, str);
    }

    public static ahqi[] values() {
        return (ahqi[]) $VALUES.clone();
    }

    public ahqj getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }
}
