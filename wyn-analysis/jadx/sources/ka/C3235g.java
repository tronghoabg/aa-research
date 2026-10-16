package ka;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.util.List;

/* renamed from: ka.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3235g extends GeneratedMessageLite implements InterfaceC3238h {
    private static final C3235g DEFAULT_INSTANCE;
    private static volatile Parser<C3235g> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<C1> values_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3235g c3235g = new C3235g();
        DEFAULT_INSTANCE = c3235g;
        GeneratedMessageLite.registerDefaultInstance(C3235g.class, c3235g);
    }

    public static void b(C3235g c3235g, C1 c12) {
        c3235g.getClass();
        c12.getClass();
        Internal.ProtobufList<C1> protobufList = c3235g.values_;
        if (!protobufList.isModifiable()) {
            c3235g.values_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3235g.values_.add(c12);
    }

    public static void c(C3235g c3235g, List list) {
        Internal.ProtobufList<C1> protobufList = c3235g.values_;
        if (!protobufList.isModifiable()) {
            c3235g.values_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) c3235g.values_);
    }

    public static void d(C3235g c3235g, int i5) {
        Internal.ProtobufList<C1> protobufList = c3235g.values_;
        if (!protobufList.isModifiable()) {
            c3235g.values_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3235g.values_.remove(i5);
    }

    public static C3235g e() {
        return DEFAULT_INSTANCE;
    }

    public static C3232f g() {
        return (C3232f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3229e.f39400a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3235g();
            case 2:
                return new C3232f(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3235g> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3235g.class) {
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

    public final C1 f(int i5) {
        return this.values_.get(i5);
    }

    public final int getValuesCount() {
        return this.values_.size();
    }

    @Override // ka.InterfaceC3238h
    public final List getValuesList() {
        return this.values_;
    }
}
