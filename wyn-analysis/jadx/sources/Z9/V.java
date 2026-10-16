package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class V extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final V DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile Parser<V> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private M actionButton_;
    private C4630I action_;
    private int bitField0_;
    private X body_;
    private X title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        V v2 = new V();
        DEFAULT_INSTANCE = v2;
        GeneratedMessageLite.registerDefaultInstance(V.class, v2);
    }

    public static V f() {
        return DEFAULT_INSTANCE;
    }

    public final C4630I b() {
        C4630I c4630i = this.action_;
        return c4630i == null ? C4630I.c() : c4630i;
    }

    public final M c() {
        M m10 = this.actionButton_;
        return m10 == null ? M.c() : m10;
    }

    public final String d() {
        return this.backgroundHexColor_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4628G.f48438a[methodToInvoke.ordinal()]) {
            case 1:
                return new V();
            case 2:
                return new U(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<V> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (V.class) {
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

    public final X e() {
        X x5 = this.body_;
        return x5 == null ? X.b() : x5;
    }

    public final String g() {
        return this.imageUrl_;
    }

    public final X h() {
        X x5 = this.title_;
        return x5 == null ? X.b() : x5;
    }

    public final boolean i() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean j() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean k() {
        return (this.bitField0_ & 1) != 0;
    }
}
