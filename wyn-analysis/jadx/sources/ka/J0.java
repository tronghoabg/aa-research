package ka;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class J0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final J0 DEFAULT_INSTANCE;
    private static volatile Parser<J0> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private Internal.ProtobufList<H0> aggregations_ = GeneratedMessageLite.emptyProtobufList();

    static {
        J0 j02 = new J0();
        DEFAULT_INSTANCE = j02;
        GeneratedMessageLite.registerDefaultInstance(J0.class, j02);
    }

    public static void b(J0 j02, C3240h1 c3240h1) {
        j02.getClass();
        c3240h1.getClass();
        j02.queryType_ = c3240h1;
        j02.queryTypeCase_ = 1;
    }

    public static void c(J0 j02, ArrayList arrayList) {
        Internal.ProtobufList<H0> protobufList = j02.aggregations_;
        if (!protobufList.isModifiable()) {
            j02.aggregations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) j02.aggregations_);
    }

    public static I0 d() {
        return (I0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3284z0.f39442a[methodToInvoke.ordinal()]) {
            case 1:
                return new J0();
            case 2:
                return new I0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", C3240h1.class, "aggregations_", H0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<J0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (J0.class) {
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
