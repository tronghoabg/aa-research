package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3273u extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C3273u DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile Parser<C3273u> PARSER;
    private int bitField0_;
    private r bits_;
    private int hashCount_;

    static {
        C3273u c3273u = new C3273u();
        DEFAULT_INSTANCE = c3273u;
        GeneratedMessageLite.registerDefaultInstance(C3273u.class, c3273u);
    }

    public static C3273u c() {
        return DEFAULT_INSTANCE;
    }

    public final r b() {
        r rVar = this.bits_;
        return rVar == null ? r.c() : rVar;
    }

    public final int d() {
        return this.hashCount_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3269s.f39436a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3273u();
            case 2:
                return new C3271t(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3273u> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3273u.class) {
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

    public final boolean e() {
        return (this.bitField0_ & 1) != 0;
    }
}
