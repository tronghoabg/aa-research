package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1951m extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1951m DEFAULT_INSTANCE;
    public static final int DNT_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<C1951m> PARSER;
    private int bitField0_;
    private boolean dnt_;
    private String id_ = "";

    static {
        C1951m c1951m = new C1951m();
        DEFAULT_INSTANCE = c1951m;
        GeneratedMessageLite.registerDefaultInstance(C1951m.class, c1951m);
    }

    public static void a(C1951m c1951m, boolean z2) {
        c1951m.bitField0_ |= 2;
        c1951m.dnt_ = z2;
    }

    public static void b(C1951m c1951m, String str) {
        c1951m.getClass();
        c1951m.bitField0_ |= 1;
        c1951m.id_ = str;
    }

    public static C1949l d() {
        return (C1949l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1951m();
            case 2:
                return new C1949l(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "id_", "dnt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1951m> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1951m.class) {
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
