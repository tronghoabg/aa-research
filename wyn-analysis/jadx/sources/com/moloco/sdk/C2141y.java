package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2141y extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C2141y DEFAULT_INSTANCE;
    public static final int DSIZE_BYTES_FIELD_NUMBER = 1;
    private static volatile Parser<C2141y> PARSER;
    private int bitField0_;
    private long dsizeBytes_;

    static {
        C2141y c2141y = new C2141y();
        DEFAULT_INSTANCE = c2141y;
        GeneratedMessageLite.registerDefaultInstance(C2141y.class, c2141y);
    }

    public static void a(C2141y c2141y, long j8) {
        c2141y.bitField0_ |= 1;
        c2141y.dsizeBytes_ = j8;
    }

    public static C1978x c() {
        return (C1978x) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C2141y();
            case 2:
                return new C1978x(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"bitField0_", "dsizeBytes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C2141y> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C2141y.class) {
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
}
