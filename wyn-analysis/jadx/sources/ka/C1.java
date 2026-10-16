package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class C1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final C1 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile Parser<C1> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        C1 c12 = new C1();
        DEFAULT_INSTANCE = c12;
        GeneratedMessageLite.registerDefaultInstance(C1.class, c12);
    }

    public static void b(C1 c12, Timestamp timestamp) {
        c12.getClass();
        timestamp.getClass();
        c12.valueType_ = timestamp;
        c12.valueTypeCase_ = 10;
    }

    public static void c(String str, C1 c12) {
        c12.getClass();
        str.getClass();
        c12.valueTypeCase_ = 17;
        c12.valueType_ = str;
    }

    public static void d(C1 c12, ByteString byteString) {
        c12.getClass();
        byteString.getClass();
        c12.valueTypeCase_ = 18;
        c12.valueType_ = byteString;
    }

    public static void e(String str, C1 c12) {
        c12.getClass();
        str.getClass();
        c12.valueTypeCase_ = 5;
        c12.valueType_ = str;
    }

    public static void f(C1 c12, Ia.c cVar) {
        c12.getClass();
        cVar.getClass();
        c12.valueType_ = cVar;
        c12.valueTypeCase_ = 8;
    }

    public static void g(C3235g c3235g, C1 c12) {
        c12.getClass();
        c3235g.getClass();
        c12.valueType_ = c3235g;
        c12.valueTypeCase_ = 9;
    }

    public static void h(C1 c12, C3263p0 c3263p0) {
        c12.getClass();
        c3263p0.getClass();
        c12.valueType_ = c3263p0;
        c12.valueTypeCase_ = 6;
    }

    public static void i(C1 c12, NullValue nullValue) {
        c12.getClass();
        c12.valueType_ = Integer.valueOf(nullValue.getNumber());
        c12.valueTypeCase_ = 11;
    }

    public static void j(C1 c12, boolean z2) {
        c12.valueTypeCase_ = 1;
        c12.valueType_ = Boolean.valueOf(z2);
    }

    public static void k(C1 c12, long j8) {
        c12.valueTypeCase_ = 2;
        c12.valueType_ = Long.valueOf(j8);
    }

    public static void l(C1 c12, double d3) {
        c12.valueTypeCase_ = 3;
        c12.valueType_ = Double.valueOf(d3);
    }

    public static C1 p() {
        return DEFAULT_INSTANCE;
    }

    public static B1 w() {
        return (B1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (A1.f39341a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1();
            case 2:
                return new B1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C3263p0.class, Ia.c.class, C3235g.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final double getDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final String getStringValue() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public final C3235g m() {
        return this.valueTypeCase_ == 9 ? (C3235g) this.valueType_ : C3235g.e();
    }

    public final boolean n() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final ByteString o() {
        return this.valueTypeCase_ == 18 ? (ByteString) this.valueType_ : ByteString.EMPTY;
    }

    public final Ia.c q() {
        return this.valueTypeCase_ == 8 ? (Ia.c) this.valueType_ : Ia.c.d();
    }

    public final long r() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final C3263p0 s() {
        return this.valueTypeCase_ == 6 ? (C3263p0) this.valueType_ : C3263p0.c();
    }

    public final String t() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final Timestamp u() {
        return this.valueTypeCase_ == 10 ? (Timestamp) this.valueType_ : Timestamp.getDefaultInstance();
    }

    public final int v() {
        int i5 = this.valueTypeCase_;
        if (i5 == 0) {
            return 12;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 5) {
            return 8;
        }
        if (i5 == 6) {
            return 11;
        }
        if (i5 == 17) {
            return 6;
        }
        if (i5 == 18) {
            return 7;
        }
        switch (i5) {
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 5;
            case 11:
                return 1;
            default:
                return 0;
        }
    }
}
