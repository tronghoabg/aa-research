package androidx.datastore.preferences.protobuf;

import A.AbstractC0213f;
import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1400q {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1400q f18252b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1400q f18253c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1400q[] f18254d;

    /* renamed from: e, reason: collision with root package name */
    public static final Type[] f18255e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1400q[] f18256f;

    /* renamed from: a, reason: collision with root package name */
    public final int f18257a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1400q EF0;

    static {
        B b5 = B.DOUBLE;
        EnumC1400q enumC1400q = new EnumC1400q("DOUBLE", 0, 0, 1, b5);
        B b10 = B.FLOAT;
        EnumC1400q enumC1400q2 = new EnumC1400q("FLOAT", 1, 1, 1, b10);
        B b11 = B.LONG;
        EnumC1400q enumC1400q3 = new EnumC1400q("INT64", 2, 2, 1, b11);
        EnumC1400q enumC1400q4 = new EnumC1400q("UINT64", 3, 3, 1, b11);
        B b12 = B.INT;
        EnumC1400q enumC1400q5 = new EnumC1400q("INT32", 4, 4, 1, b12);
        EnumC1400q enumC1400q6 = new EnumC1400q("FIXED64", 5, 5, 1, b11);
        EnumC1400q enumC1400q7 = new EnumC1400q("FIXED32", 6, 6, 1, b12);
        B b13 = B.BOOLEAN;
        EnumC1400q enumC1400q8 = new EnumC1400q("BOOL", 7, 7, 1, b13);
        B b14 = B.STRING;
        EnumC1400q enumC1400q9 = new EnumC1400q("STRING", 8, 8, 1, b14);
        B b15 = B.MESSAGE;
        EnumC1400q enumC1400q10 = new EnumC1400q("MESSAGE", 9, 9, 1, b15);
        B b16 = B.BYTE_STRING;
        EnumC1400q enumC1400q11 = new EnumC1400q("BYTES", 10, 10, 1, b16);
        EnumC1400q enumC1400q12 = new EnumC1400q("UINT32", 11, 11, 1, b12);
        B b17 = B.ENUM;
        EnumC1400q enumC1400q13 = new EnumC1400q("ENUM", 12, 12, 1, b17);
        EnumC1400q enumC1400q14 = new EnumC1400q("SFIXED32", 13, 13, 1, b12);
        EnumC1400q enumC1400q15 = new EnumC1400q("SFIXED64", 14, 14, 1, b11);
        EnumC1400q enumC1400q16 = new EnumC1400q("SINT32", 15, 15, 1, b12);
        EnumC1400q enumC1400q17 = new EnumC1400q("SINT64", 16, 16, 1, b11);
        EnumC1400q enumC1400q18 = new EnumC1400q("GROUP", 17, 17, 1, b15);
        EnumC1400q enumC1400q19 = new EnumC1400q("DOUBLE_LIST", 18, 18, 2, b5);
        EnumC1400q enumC1400q20 = new EnumC1400q("FLOAT_LIST", 19, 19, 2, b10);
        EnumC1400q enumC1400q21 = new EnumC1400q("INT64_LIST", 20, 20, 2, b11);
        EnumC1400q enumC1400q22 = new EnumC1400q("UINT64_LIST", 21, 21, 2, b11);
        EnumC1400q enumC1400q23 = new EnumC1400q("INT32_LIST", 22, 22, 2, b12);
        EnumC1400q enumC1400q24 = new EnumC1400q("FIXED64_LIST", 23, 23, 2, b11);
        EnumC1400q enumC1400q25 = new EnumC1400q("FIXED32_LIST", 24, 24, 2, b12);
        EnumC1400q enumC1400q26 = new EnumC1400q("BOOL_LIST", 25, 25, 2, b13);
        EnumC1400q enumC1400q27 = new EnumC1400q("STRING_LIST", 26, 26, 2, b14);
        EnumC1400q enumC1400q28 = new EnumC1400q("MESSAGE_LIST", 27, 27, 2, b15);
        EnumC1400q enumC1400q29 = new EnumC1400q("BYTES_LIST", 28, 28, 2, b16);
        EnumC1400q enumC1400q30 = new EnumC1400q("UINT32_LIST", 29, 29, 2, b12);
        EnumC1400q enumC1400q31 = new EnumC1400q("ENUM_LIST", 30, 30, 2, b17);
        EnumC1400q enumC1400q32 = new EnumC1400q("SFIXED32_LIST", 31, 31, 2, b12);
        EnumC1400q enumC1400q33 = new EnumC1400q("SFIXED64_LIST", 32, 32, 2, b11);
        EnumC1400q enumC1400q34 = new EnumC1400q("SINT32_LIST", 33, 33, 2, b12);
        EnumC1400q enumC1400q35 = new EnumC1400q("SINT64_LIST", 34, 34, 2, b11);
        EnumC1400q enumC1400q36 = new EnumC1400q("DOUBLE_LIST_PACKED", 35, 35, 3, b5);
        f18252b = enumC1400q36;
        EnumC1400q enumC1400q37 = new EnumC1400q("FLOAT_LIST_PACKED", 36, 36, 3, b10);
        EnumC1400q enumC1400q38 = new EnumC1400q("INT64_LIST_PACKED", 37, 37, 3, b11);
        EnumC1400q enumC1400q39 = new EnumC1400q("UINT64_LIST_PACKED", 38, 38, 3, b11);
        EnumC1400q enumC1400q40 = new EnumC1400q("INT32_LIST_PACKED", 39, 39, 3, b12);
        EnumC1400q enumC1400q41 = new EnumC1400q("FIXED64_LIST_PACKED", 40, 40, 3, b11);
        EnumC1400q enumC1400q42 = new EnumC1400q("FIXED32_LIST_PACKED", 41, 41, 3, b12);
        EnumC1400q enumC1400q43 = new EnumC1400q("BOOL_LIST_PACKED", 42, 42, 3, b13);
        EnumC1400q enumC1400q44 = new EnumC1400q("UINT32_LIST_PACKED", 43, 43, 3, b12);
        EnumC1400q enumC1400q45 = new EnumC1400q("ENUM_LIST_PACKED", 44, 44, 3, b17);
        EnumC1400q enumC1400q46 = new EnumC1400q("SFIXED32_LIST_PACKED", 45, 45, 3, b12);
        EnumC1400q enumC1400q47 = new EnumC1400q("SFIXED64_LIST_PACKED", 46, 46, 3, b11);
        EnumC1400q enumC1400q48 = new EnumC1400q("SINT32_LIST_PACKED", 47, 47, 3, b12);
        EnumC1400q enumC1400q49 = new EnumC1400q("SINT64_LIST_PACKED", 48, 48, 3, b11);
        f18253c = enumC1400q49;
        f18256f = new EnumC1400q[]{enumC1400q, enumC1400q2, enumC1400q3, enumC1400q4, enumC1400q5, enumC1400q6, enumC1400q7, enumC1400q8, enumC1400q9, enumC1400q10, enumC1400q11, enumC1400q12, enumC1400q13, enumC1400q14, enumC1400q15, enumC1400q16, enumC1400q17, enumC1400q18, enumC1400q19, enumC1400q20, enumC1400q21, enumC1400q22, enumC1400q23, enumC1400q24, enumC1400q25, enumC1400q26, enumC1400q27, enumC1400q28, enumC1400q29, enumC1400q30, enumC1400q31, enumC1400q32, enumC1400q33, enumC1400q34, enumC1400q35, enumC1400q36, enumC1400q37, enumC1400q38, enumC1400q39, enumC1400q40, enumC1400q41, enumC1400q42, enumC1400q43, enumC1400q44, enumC1400q45, enumC1400q46, enumC1400q47, enumC1400q48, enumC1400q49, new EnumC1400q("GROUP_LIST", 49, 49, 2, b15), new EnumC1400q("MAP", 50, 50, 4, B.VOID)};
        f18255e = new Type[0];
        EnumC1400q[] enumC1400qArrValues = values();
        f18254d = new EnumC1400q[enumC1400qArrValues.length];
        for (EnumC1400q enumC1400q50 : enumC1400qArrValues) {
            f18254d[enumC1400q50.f18257a] = enumC1400q50;
        }
    }

    public EnumC1400q(String str, int i5, int i10, int i11, B b5) {
        this.f18257a = i10;
        int iF = AbstractC0213f.f(i11);
        if (iF == 1 || iF == 3) {
            b5.getClass();
        }
        if (i11 == 1) {
            b5.ordinal();
        }
    }

    public static EnumC1400q valueOf(String str) {
        return (EnumC1400q) Enum.valueOf(EnumC1400q.class, str);
    }

    public static EnumC1400q[] values() {
        return (EnumC1400q[]) f18256f.clone();
    }
}
