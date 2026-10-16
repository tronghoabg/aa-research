package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1877i extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1877i DEFAULT_INSTANCE;
    public static final int ES_FIELD_NUMBER = 1;
    private static volatile Parser<C1877i> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private ByteString es_;
    private ByteString payload_;

    static {
        C1877i c1877i = new C1877i();
        DEFAULT_INSTANCE = c1877i;
        GeneratedMessageLite.registerDefaultInstance(C1877i.class, c1877i);
    }

    public C1877i() {
        ByteString byteString = ByteString.EMPTY;
        this.es_ = byteString;
        this.payload_ = byteString;
    }

    public static void a(C1877i c1877i, ByteString byteString) {
        c1877i.getClass();
        byteString.getClass();
        c1877i.es_ = byteString;
    }

    public static void b(C1877i c1877i, ByteString byteString) {
        c1877i.getClass();
        byteString.getClass();
        c1877i.payload_ = byteString;
    }

    public static C1875h d() {
        return (C1875h) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1877i();
            case 2:
                return new C1875h(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"es_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1877i> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1877i.class) {
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
