package androidx.navigation.serialization;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class InternalType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InternalType[] $VALUES;
    public static final InternalType INT = new InternalType("INT", 0);
    public static final InternalType INT_NULLABLE = new InternalType("INT_NULLABLE", 1);
    public static final InternalType BOOL = new InternalType("BOOL", 2);
    public static final InternalType BOOL_NULLABLE = new InternalType("BOOL_NULLABLE", 3);
    public static final InternalType DOUBLE = new InternalType("DOUBLE", 4);
    public static final InternalType DOUBLE_NULLABLE = new InternalType("DOUBLE_NULLABLE", 5);
    public static final InternalType FLOAT = new InternalType("FLOAT", 6);
    public static final InternalType FLOAT_NULLABLE = new InternalType("FLOAT_NULLABLE", 7);
    public static final InternalType LONG = new InternalType("LONG", 8);
    public static final InternalType LONG_NULLABLE = new InternalType("LONG_NULLABLE", 9);
    public static final InternalType STRING = new InternalType("STRING", 10);
    public static final InternalType STRING_NULLABLE = new InternalType("STRING_NULLABLE", 11);
    public static final InternalType INT_ARRAY = new InternalType("INT_ARRAY", 12);
    public static final InternalType BOOL_ARRAY = new InternalType("BOOL_ARRAY", 13);
    public static final InternalType DOUBLE_ARRAY = new InternalType("DOUBLE_ARRAY", 14);
    public static final InternalType FLOAT_ARRAY = new InternalType("FLOAT_ARRAY", 15);
    public static final InternalType LONG_ARRAY = new InternalType("LONG_ARRAY", 16);
    public static final InternalType ARRAY = new InternalType("ARRAY", 17);
    public static final InternalType LIST = new InternalType("LIST", 18);
    public static final InternalType ENUM = new InternalType("ENUM", 19);
    public static final InternalType ENUM_NULLABLE = new InternalType("ENUM_NULLABLE", 20);
    public static final InternalType UNKNOWN = new InternalType("UNKNOWN", 21);

    private static final /* synthetic */ InternalType[] $values() {
        return new InternalType[]{INT, INT_NULLABLE, BOOL, BOOL_NULLABLE, DOUBLE, DOUBLE_NULLABLE, FLOAT, FLOAT_NULLABLE, LONG, LONG_NULLABLE, STRING, STRING_NULLABLE, INT_ARRAY, BOOL_ARRAY, DOUBLE_ARRAY, FLOAT_ARRAY, LONG_ARRAY, ARRAY, LIST, ENUM, ENUM_NULLABLE, UNKNOWN};
    }

    static {
        InternalType[] internalTypeArr$values = $values();
        $VALUES = internalTypeArr$values;
        $ENTRIES = b.a(internalTypeArr$values);
    }

    private InternalType(String str, int i2) {
    }

    public static a<InternalType> getEntries() {
        return $ENTRIES;
    }

    public static InternalType valueOf(String str) {
        return (InternalType) Enum.valueOf(InternalType.class, str);
    }

    public static InternalType[] values() {
        return (InternalType[]) $VALUES.clone();
    }
}
