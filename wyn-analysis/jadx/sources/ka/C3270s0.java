package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3270s0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3270s0 DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile Parser<C3270s0> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        C3270s0 c3270s0 = new C3270s0();
        DEFAULT_INSTANCE = c3270s0;
        GeneratedMessageLite.registerDefaultInstance(C3270s0.class, c3270s0);
    }

    public static void b(C3270s0 c3270s0, boolean z2) {
        c3270s0.conditionTypeCase_ = 1;
        c3270s0.conditionType_ = Boolean.valueOf(z2);
    }

    public static void c(C3270s0 c3270s0, Timestamp timestamp) {
        c3270s0.getClass();
        timestamp.getClass();
        c3270s0.conditionType_ = timestamp;
        c3270s0.conditionTypeCase_ = 2;
    }

    public static C3270s0 e() {
        return DEFAULT_INSTANCE;
    }

    public static C3268r0 h() {
        return (C3268r0) DEFAULT_INSTANCE.createBuilder();
    }

    public final int d() {
        int i5 = this.conditionTypeCase_;
        if (i5 == 0) {
            return 3;
        }
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                return 0;
            }
        }
        return i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3266q0.f39427a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3270s0();
            case 2:
                return new C3268r0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3270s0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3270s0.class) {
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

    public final boolean f() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public final Timestamp g() {
        return this.conditionTypeCase_ == 2 ? (Timestamp) this.conditionType_ : Timestamp.getDefaultInstance();
    }
}
