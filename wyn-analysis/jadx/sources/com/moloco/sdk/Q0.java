package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes4.dex */
public final class Q0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final Q0 DEFAULT_INSTANCE;
    public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Q0> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 3;
    private long elapsedTimeMillis_;
    private String name_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Q0 q02 = new Q0();
        DEFAULT_INSTANCE = q02;
        GeneratedMessageLite.registerDefaultInstance(Q0.class, q02);
    }

    public static void a(Q0 q02, List list) {
        Internal.ProtobufList<String> protobufList = q02.tags_;
        if (!protobufList.isModifiable()) {
            q02.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) q02.tags_);
    }

    public static void b(Q0 q02, long j8) {
        q02.elapsedTimeMillis_ = j8;
    }

    public static void c(Q0 q02, String str) {
        q02.getClass();
        str.getClass();
        q02.name_ = str;
    }

    public static P0 e() {
        return (P0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new Q0();
            case 2:
                return new P0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new Object[]{"name_", "elapsedTimeMillis_", "tags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Q0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Q0.class) {
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
