package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4654w extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C4654w DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile Parser<C4654w> PARSER;
    private String experimentId_ = "";

    static {
        C4654w c4654w = new C4654w();
        DEFAULT_INSTANCE = c4654w;
        GeneratedMessageLite.registerDefaultInstance(C4654w.class, c4654w);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4652u.f48468a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4654w();
            case 2:
                return new C4653v(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4654w> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4654w.class) {
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
