package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4630I extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final C4630I DEFAULT_INSTANCE;
    private static volatile Parser<C4630I> PARSER;
    private String actionUrl_ = "";

    static {
        C4630I c4630i = new C4630I();
        DEFAULT_INSTANCE = c4630i;
        GeneratedMessageLite.registerDefaultInstance(C4630I.class, c4630i);
    }

    public static C4630I c() {
        return DEFAULT_INSTANCE;
    }

    public final String b() {
        return this.actionUrl_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4628G.f48438a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4630I();
            case 2:
                return new C4629H(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4630I> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4630I.class) {
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
