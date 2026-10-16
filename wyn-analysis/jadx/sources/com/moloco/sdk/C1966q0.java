package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1966q0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AD_FREQUENCY_FIELD_NUMBER = 3;
    public static final int BID_FLOOR_FIELD_NUMBER = 4;
    private static final C1966q0 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 5;
    public static final int NATIVE_FIELD_NUMBER = 6;
    private static volatile Parser<C1966q0> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int adFrequency_;
    private float bidFloor_;
    private String id_ = "";
    private String name_ = "";
    private C1958p0 native_;
    private int type_;

    static {
        C1966q0 c1966q0 = new C1966q0();
        DEFAULT_INSTANCE = c1966q0;
        GeneratedMessageLite.registerDefaultInstance(C1966q0.class, c1966q0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1966q0();
            case 2:
                return new C1954n0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0001\u0005Ȉ\u0006\t", new Object[]{"id_", "type_", "adFrequency_", "bidFloor_", "name_", "native_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1966q0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1966q0.class) {
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
