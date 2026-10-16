package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class O extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final O DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile Parser<O> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private X body_;
    private M primaryActionButton_;
    private C4630I primaryAction_;
    private M secondaryActionButton_;
    private C4630I secondaryAction_;
    private X title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        O o7 = new O();
        DEFAULT_INSTANCE = o7;
        GeneratedMessageLite.registerDefaultInstance(O.class, o7);
    }

    public static O d() {
        return DEFAULT_INSTANCE;
    }

    public final String b() {
        return this.backgroundHexColor_;
    }

    public final X c() {
        X x5 = this.body_;
        return x5 == null ? X.b() : x5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4628G.f48438a[methodToInvoke.ordinal()]) {
            case 1:
                return new O();
            case 2:
                return new N(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<O> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (O.class) {
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

    public final String e() {
        return this.landscapeImageUrl_;
    }

    public final String f() {
        return this.portraitImageUrl_;
    }

    public final C4630I g() {
        C4630I c4630i = this.primaryAction_;
        return c4630i == null ? C4630I.c() : c4630i;
    }

    public final M h() {
        M m10 = this.primaryActionButton_;
        return m10 == null ? M.c() : m10;
    }

    public final C4630I i() {
        C4630I c4630i = this.secondaryAction_;
        return c4630i == null ? C4630I.c() : c4630i;
    }

    public final M j() {
        M m10 = this.secondaryActionButton_;
        return m10 == null ? M.c() : m10;
    }

    public final X k() {
        X x5 = this.title_;
        return x5 == null ? X.b() : x5;
    }

    public final boolean l() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean m() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean n() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean o() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }
}
