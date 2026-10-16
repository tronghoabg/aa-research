package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class M extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final M DEFAULT_INSTANCE;
    private static volatile Parser<M> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonHexColor_ = "";
    private X text_;

    static {
        M m10 = new M();
        DEFAULT_INSTANCE = m10;
        GeneratedMessageLite.registerDefaultInstance(M.class, m10);
    }

    public static M c() {
        return DEFAULT_INSTANCE;
    }

    public final String b() {
        return this.buttonHexColor_;
    }

    public final X d() {
        X x5 = this.text_;
        return x5 == null ? X.b() : x5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4628G.f48438a[methodToInvoke.ordinal()]) {
            case 1:
                return new M();
            case 2:
                return new L(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<M> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (M.class) {
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

    public final boolean e() {
        return (this.bitField0_ & 1) != 0;
    }
}
