package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3247k extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C3247k DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile Parser<C3247k> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private Q mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3247k c3247k = new C3247k();
        DEFAULT_INSTANCE = c3247k;
        GeneratedMessageLite.registerDefaultInstance(C3247k.class, c3247k);
    }

    public static void b(C3247k c3247k, String str) {
        c3247k.getClass();
        str.getClass();
        c3247k.database_ = str;
    }

    public static void c(C3247k c3247k, String str) {
        c3247k.getClass();
        str.getClass();
        Internal.ProtobufList<String> protobufList = c3247k.documents_;
        if (!protobufList.isModifiable()) {
            c3247k.documents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3247k.documents_.add(str);
    }

    public static C3247k d() {
        return DEFAULT_INSTANCE;
    }

    public static C3244j e() {
        return (C3244j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3241i.f39419a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3247k();
            case 2:
                return new C3244j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", z1.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3247k> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3247k.class) {
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
