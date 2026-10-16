package ka;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class Q0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final Q0 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile Parser<Q0> PARSER;
    private Internal.ProtobufList<Z0> filters_ = GeneratedMessageLite.emptyProtobufList();
    private int op_;

    static {
        Q0 q02 = new Q0();
        DEFAULT_INSTANCE = q02;
        GeneratedMessageLite.registerDefaultInstance(Q0.class, q02);
    }

    public static void b(Q0 q02, P0 p02) {
        q02.getClass();
        q02.op_ = p02.getNumber();
    }

    public static void c(Q0 q02, ArrayList arrayList) {
        Internal.ProtobufList<Z0> protobufList = q02.filters_;
        if (!protobufList.isModifiable()) {
            q02.filters_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) q02.filters_);
    }

    public static Q0 d() {
        return DEFAULT_INSTANCE;
    }

    public static O0 g() {
        return (O0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new Q0();
            case 2:
                return new O0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", Z0.class});
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

    public final Internal.ProtobufList e() {
        return this.filters_;
    }

    public final P0 f() {
        int i5 = this.op_;
        P0 p02 = i5 != 0 ? i5 != 1 ? i5 != 2 ? null : P0.OR : P0.AND : P0.OPERATOR_UNSPECIFIED;
        return p02 == null ? P0.UNRECOGNIZED : p02;
    }
}
