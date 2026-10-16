package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.b1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3222b1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3222b1 DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile Parser<C3222b1> PARSER;
    private int bitField0_;
    private int direction_;
    private W0 field_;

    static {
        C3222b1 c3222b1 = new C3222b1();
        DEFAULT_INSTANCE = c3222b1;
        GeneratedMessageLite.registerDefaultInstance(C3222b1.class, c3222b1);
    }

    public static void b(C3222b1 c3222b1, W0 w02) {
        c3222b1.getClass();
        w02.getClass();
        c3222b1.field_ = w02;
        c3222b1.bitField0_ |= 1;
    }

    public static void c(C3222b1 c3222b1, R0 r02) {
        c3222b1.getClass();
        c3222b1.direction_ = r02.getNumber();
    }

    public static C3219a1 f() {
        return (C3219a1) DEFAULT_INSTANCE.createBuilder();
    }

    public final R0 d() {
        int i5 = this.direction_;
        R0 r02 = i5 != 0 ? i5 != 1 ? i5 != 2 ? null : R0.DESCENDING : R0.ASCENDING : R0.DIRECTION_UNSPECIFIED;
        return r02 == null ? R0.UNRECOGNIZED : r02;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3222b1();
            case 2:
                return new C3219a1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3222b1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3222b1.class) {
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

    public final W0 e() {
        W0 w02 = this.field_;
        return w02 == null ? W0.c() : w02;
    }
}
