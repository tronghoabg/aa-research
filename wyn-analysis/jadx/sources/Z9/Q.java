package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Q extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final Q DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile Parser<Q> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    static {
        Q q4 = new Q();
        DEFAULT_INSTANCE = q4;
        GeneratedMessageLite.registerDefaultInstance(Q.class, q4);
    }

    public static Q d() {
        return DEFAULT_INSTANCE;
    }

    public final C4632K b() {
        return this.messageDetailsCase_ == 1 ? (C4632K) this.messageDetails_ : C4632K.e();
    }

    public final O c() {
        return this.messageDetailsCase_ == 4 ? (O) this.messageDetails_ : O.d();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4628G.f48438a[methodToInvoke.ordinal()]) {
            case 1:
                return new Q();
            case 2:
                return new P(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", C4632K.class, V.class, T.class, O.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Q> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Q.class) {
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

    public final T e() {
        return this.messageDetailsCase_ == 3 ? (T) this.messageDetails_ : T.c();
    }

    public final int f() {
        int i5 = this.messageDetailsCase_;
        if (i5 == 0) {
            return 5;
        }
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                i10 = 3;
                if (i5 != 3) {
                    i10 = 4;
                    if (i5 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i10;
    }

    public final V g() {
        return this.messageDetailsCase_ == 2 ? (V) this.messageDetails_ : V.f();
    }
}
