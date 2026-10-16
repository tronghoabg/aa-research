package ka;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes4.dex */
public final class D extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final D DEFAULT_INSTANCE;
    private static volatile Parser<D> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private Internal.ProtobufList<C1> values_ = GeneratedMessageLite.emptyProtobufList();

    static {
        D d3 = new D();
        DEFAULT_INSTANCE = d3;
        GeneratedMessageLite.registerDefaultInstance(D.class, d3);
    }

    public static void b(D d3, Iterable iterable) {
        Internal.ProtobufList<C1> protobufList = d3.values_;
        if (!protobufList.isModifiable()) {
            d3.values_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) d3.values_);
    }

    public static void c(D d3, boolean z2) {
        d3.before_ = z2;
    }

    public static D e() {
        return DEFAULT_INSTANCE;
    }

    public static C3216C f() {
        return (C3216C) DEFAULT_INSTANCE.createBuilder();
    }

    public final boolean d() {
        return this.before_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3215B.f39342a[methodToInvoke.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new C3216C(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", C1.class, "before_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<D> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (D.class) {
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

    public final List getValuesList() {
        return this.values_;
    }
}
