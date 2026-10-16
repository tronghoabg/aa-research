package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Z extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final Z DEFAULT_INSTANCE;
    public static final int MEDIA_CONFIG_FIELD_NUMBER = 1;
    private static volatile Parser<Z> PARSER;
    private Y mediaConfig_;

    static {
        Z z2 = new Z();
        DEFAULT_INSTANCE = z2;
        GeneratedMessageLite.registerDefaultInstance(Z.class, z2);
    }

    public static Z b() {
        return DEFAULT_INSTANCE;
    }

    public final Y c() {
        Y y10 = this.mediaConfig_;
        return y10 == null ? Y.b() : y10;
    }

    public final boolean d() {
        return this.mediaConfig_ != null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (S.f28323a[methodToInvoke.ordinal()]) {
            case 1:
                return new Z();
            case 2:
                return new W(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"mediaConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Z> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Z.class) {
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
