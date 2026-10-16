package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4643k extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C4643k DEFAULT_INSTANCE;
    private static volatile Parser<C4643k> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        C4643k c4643k = new C4643k();
        DEFAULT_INSTANCE = c4643k;
        GeneratedMessageLite.registerDefaultInstance(C4643k.class, c4643k);
    }

    public static C4643k b() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4639g.f48448a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4643k();
            case 2:
                return new C4642j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4643k> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4643k.class) {
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

    public final int getValue() {
        return this.value_;
    }
}
