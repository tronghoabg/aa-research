package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3227d0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final C3227d0 DEFAULT_INSTANCE;
    private static volatile Parser<C3227d0> PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private C3273u unchangedNames_;

    static {
        C3227d0 c3227d0 = new C3227d0();
        DEFAULT_INSTANCE = c3227d0;
        GeneratedMessageLite.registerDefaultInstance(C3227d0.class, c3227d0);
    }

    public static C3227d0 c() {
        return DEFAULT_INSTANCE;
    }

    public final int b() {
        return this.count_;
    }

    public final int d() {
        return this.targetId_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3221b0.f39399a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3227d0();
            case 2:
                return new C3224c0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3227d0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3227d0.class) {
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

    public final C3273u e() {
        C3273u c3273u = this.unchangedNames_;
        return c3273u == null ? C3273u.c() : c3273u;
    }
}
