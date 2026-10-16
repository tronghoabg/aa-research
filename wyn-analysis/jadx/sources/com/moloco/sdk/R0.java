package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class R0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNTS_FIELD_NUMBER = 1;
    private static final R0 DEFAULT_INSTANCE;
    public static final int DURATIONS_FIELD_NUMBER = 2;
    private static volatile Parser<R0> PARSER;
    private Internal.ProtobufList<O0> counts_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Q0> durations_ = GeneratedMessageLite.emptyProtobufList();

    static {
        R0 r02 = new R0();
        DEFAULT_INSTANCE = r02;
        GeneratedMessageLite.registerDefaultInstance(R0.class, r02);
    }

    public static void a(R0 r02, ArrayList arrayList) {
        Internal.ProtobufList<O0> protobufList = r02.counts_;
        if (!protobufList.isModifiable()) {
            r02.counts_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) r02.counts_);
    }

    public static void b(R0 r02, ArrayList arrayList) {
        Internal.ProtobufList<Q0> protobufList = r02.durations_;
        if (!protobufList.isModifiable()) {
            r02.durations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) r02.durations_);
    }

    public static M0 d() {
        return (M0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new R0();
            case 2:
                return new M0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"counts_", O0.class, "durations_", Q0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<R0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (R0.class) {
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
