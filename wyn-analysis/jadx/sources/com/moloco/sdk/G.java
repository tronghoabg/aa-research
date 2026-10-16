package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class G extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final G DEFAULT_INSTANCE;
    public static final int LOW_MEM_FIELD_NUMBER = 1;
    public static final int LOW_MEM_THRESHOLD_BYTES_FIELD_NUMBER = 2;
    private static volatile Parser<G> PARSER = null;
    public static final int TOTAL_MEM_BYTES_FIELD_NUMBER = 3;
    private int bitField0_;
    private long lowMemThresholdBytes_;
    private boolean lowMem_;
    private long totalMemBytes_;

    static {
        G g9 = new G();
        DEFAULT_INSTANCE = g9;
        GeneratedMessageLite.registerDefaultInstance(G.class, g9);
    }

    public static void a(G g9, boolean z2) {
        g9.bitField0_ |= 1;
        g9.lowMem_ = z2;
    }

    public static void b(G g9, long j8) {
        g9.bitField0_ |= 2;
        g9.lowMemThresholdBytes_ = j8;
    }

    public static void c(G g9, long j8) {
        g9.bitField0_ |= 4;
        g9.totalMemBytes_ = j8;
    }

    public static F e() {
        return (F) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new F(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "lowMem_", "lowMemThresholdBytes_", "totalMemBytes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<G> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (G.class) {
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
