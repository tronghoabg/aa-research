package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1863c0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_CONFIG_FIELD_NUMBER = 1;
    public static final int COMMON_CONFIGS_FIELD_NUMBER = 3;
    private static final C1863c0 DEFAULT_INSTANCE;
    public static final int IOS_CONFIG_FIELD_NUMBER = 2;
    private static volatile Parser<C1863c0> PARSER;
    private int clientConfigsCase_ = 0;
    private Object clientConfigs_;
    private Z commonConfigs_;

    static {
        C1863c0 c1863c0 = new C1863c0();
        DEFAULT_INSTANCE = c1863c0;
        GeneratedMessageLite.registerDefaultInstance(C1863c0.class, c1863c0);
    }

    public static C1863c0 c() {
        return DEFAULT_INSTANCE;
    }

    public final Z b() {
        Z z2 = this.commonConfigs_;
        return z2 == null ? Z.b() : z2;
    }

    public final boolean d() {
        return this.commonConfigs_ != null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (S.f28323a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1863c0();
            case 2:
                return new V(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new Object[]{"clientConfigs_", "clientConfigsCase_", U.class, C1860b0.class, "commonConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1863c0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1863c0.class) {
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
