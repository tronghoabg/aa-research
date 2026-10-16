package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3252l1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3252l1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile Parser<C3252l1> PARSER;
    private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3252l1 c3252l1 = new C3252l1();
        DEFAULT_INSTANCE = c3252l1;
        GeneratedMessageLite.registerDefaultInstance(C3252l1.class, c3252l1);
    }

    public static void b(C3252l1 c3252l1, String str) {
        c3252l1.getClass();
        str.getClass();
        Internal.ProtobufList<String> protobufList = c3252l1.documents_;
        if (!protobufList.isModifiable()) {
            c3252l1.documents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3252l1.documents_.add(str);
    }

    public static C3252l1 c() {
        return DEFAULT_INSTANCE;
    }

    public static C3249k1 f() {
        return (C3249k1) DEFAULT_INSTANCE.createBuilder();
    }

    public final String d() {
        return this.documents_.get(0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3243i1.f39420a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3252l1();
            case 2:
                return new C3249k1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3252l1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3252l1.class) {
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

    public final int e() {
        return this.documents_.size();
    }
}
