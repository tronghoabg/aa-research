package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes4.dex */
public final class O0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final O0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<O0> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 3;
    private int count_;
    private String name_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        O0 o02 = new O0();
        DEFAULT_INSTANCE = o02;
        GeneratedMessageLite.registerDefaultInstance(O0.class, o02);
    }

    public static void a(O0 o02, List list) {
        Internal.ProtobufList<String> protobufList = o02.tags_;
        if (!protobufList.isModifiable()) {
            o02.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) o02.tags_);
    }

    public static void b(O0 o02, int i5) {
        o02.count_ = i5;
    }

    public static void c(O0 o02, String str) {
        o02.getClass();
        str.getClass();
        o02.name_ = str;
    }

    public static N0 e() {
        return (N0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new O0();
            case 2:
                return new N0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"name_", "count_", "tags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<O0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (O0.class) {
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
