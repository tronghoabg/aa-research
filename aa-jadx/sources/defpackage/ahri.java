package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public class ahri {
    private static final /* synthetic */ defpackage.ahri[] $VALUES;
    public static final defpackage.ahri BOOL;
    public static final defpackage.ahri BYTES;
    public static final defpackage.ahri DOUBLE;
    public static final defpackage.ahri ENUM;
    public static final defpackage.ahri FIXED32;
    public static final defpackage.ahri FIXED64;
    public static final defpackage.ahri FLOAT;
    public static final defpackage.ahri GROUP;
    public static final defpackage.ahri INT32;
    public static final defpackage.ahri INT64;
    public static final defpackage.ahri MESSAGE;
    public static final defpackage.ahri SFIXED32;
    public static final defpackage.ahri SFIXED64;
    public static final defpackage.ahri SINT32;
    public static final defpackage.ahri SINT64;
    public static final defpackage.ahri STRING;
    public static final defpackage.ahri UINT32;
    public static final defpackage.ahri UINT64;
    private final defpackage.ahrj javaType;
    private final int wireType;

    static {
        defpackage.ahri ahriVar = new defpackage.ahri("DOUBLE", 0, defpackage.ahrj.DOUBLE, 1);
        DOUBLE = ahriVar;
        defpackage.ahri ahriVar2 = new defpackage.ahri("FLOAT", 1, defpackage.ahrj.FLOAT, 5);
        FLOAT = ahriVar2;
        final int i = 2;
        defpackage.ahri ahriVar3 = new defpackage.ahri("INT64", 2, defpackage.ahrj.LONG, 0);
        INT64 = ahriVar3;
        final int i2 = 3;
        defpackage.ahri ahriVar4 = new defpackage.ahri("UINT64", 3, defpackage.ahrj.LONG, 0);
        UINT64 = ahriVar4;
        defpackage.ahri ahriVar5 = new defpackage.ahri("INT32", 4, defpackage.ahrj.INT, 0);
        INT32 = ahriVar5;
        defpackage.ahri ahriVar6 = new defpackage.ahri("FIXED64", 5, defpackage.ahrj.LONG, 1);
        FIXED64 = ahriVar6;
        defpackage.ahri ahriVar7 = new defpackage.ahri("FIXED32", 6, defpackage.ahrj.INT, 5);
        FIXED32 = ahriVar7;
        defpackage.ahri ahriVar8 = new defpackage.ahri("BOOL", 7, defpackage.ahrj.BOOLEAN, 0);
        BOOL = ahriVar8;
        final defpackage.ahrj ahrjVar = defpackage.ahrj.STRING;
        final java.lang.String str = "STRING";
        final int i3 = 8;
        defpackage.ahri ahriVar9 = new defpackage.ahri(str, i3, ahrjVar, i) { // from class: ahre
            @Override // defpackage.ahri
            public boolean isPackable() {
                return false;
            }
        };
        STRING = ahriVar9;
        final defpackage.ahrj ahrjVar2 = defpackage.ahrj.MESSAGE;
        final java.lang.String str2 = "GROUP";
        final int i4 = 9;
        defpackage.ahri ahriVar10 = new defpackage.ahri(str2, i4, ahrjVar2, i2) { // from class: ahrf
            @Override // defpackage.ahri
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = ahriVar10;
        final defpackage.ahrj ahrjVar3 = defpackage.ahrj.MESSAGE;
        final java.lang.String str3 = "MESSAGE";
        final int i5 = 10;
        defpackage.ahri ahriVar11 = new defpackage.ahri(str3, i5, ahrjVar3, i) { // from class: ahrg
            @Override // defpackage.ahri
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = ahriVar11;
        final defpackage.ahrj ahrjVar4 = defpackage.ahrj.BYTE_STRING;
        final java.lang.String str4 = "BYTES";
        final int i6 = 11;
        defpackage.ahri ahriVar12 = new defpackage.ahri(str4, i6, ahrjVar4, i) { // from class: ahrh
            @Override // defpackage.ahri
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = ahriVar12;
        defpackage.ahri ahriVar13 = new defpackage.ahri("UINT32", 12, defpackage.ahrj.INT, 0);
        UINT32 = ahriVar13;
        defpackage.ahri ahriVar14 = new defpackage.ahri("ENUM", 13, defpackage.ahrj.ENUM, 0);
        ENUM = ahriVar14;
        defpackage.ahri ahriVar15 = new defpackage.ahri("SFIXED32", 14, defpackage.ahrj.INT, 5);
        SFIXED32 = ahriVar15;
        defpackage.ahri ahriVar16 = new defpackage.ahri("SFIXED64", 15, defpackage.ahrj.LONG, 1);
        SFIXED64 = ahriVar16;
        defpackage.ahri ahriVar17 = new defpackage.ahri("SINT32", 16, defpackage.ahrj.INT, 0);
        SINT32 = ahriVar17;
        defpackage.ahri ahriVar18 = new defpackage.ahri("SINT64", 17, defpackage.ahrj.LONG, 0);
        SINT64 = ahriVar18;
        $VALUES = new defpackage.ahri[]{ahriVar, ahriVar2, ahriVar3, ahriVar4, ahriVar5, ahriVar6, ahriVar7, ahriVar8, ahriVar9, ahriVar10, ahriVar11, ahriVar12, ahriVar13, ahriVar14, ahriVar15, ahriVar16, ahriVar17, ahriVar18};
    }

    private ahri(java.lang.String str, int i, defpackage.ahrj ahrjVar, int i2) {
        super(str, i);
        this.javaType = ahrjVar;
        this.wireType = i2;
    }

    public static defpackage.ahri valueOf(java.lang.String str) {
        return (defpackage.ahri) java.lang.Enum.valueOf(defpackage.ahri.class, str);
    }

    public static defpackage.ahri[] values() {
        return (defpackage.ahri[]) $VALUES.clone();
    }

    public defpackage.ahrj getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }
}
