package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4632K extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C4632K DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile Parser<C4632K> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C4630I action_;
    private int bitField0_;
    private X body_;
    private X title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        C4632K c4632k = new C4632K();
        DEFAULT_INSTANCE = c4632k;
        GeneratedMessageLite.registerDefaultInstance(C4632K.class, c4632k);
    }

    public static C4632K e() {
        return DEFAULT_INSTANCE;
    }

    public final C4630I b() {
        C4630I c4630i = this.action_;
        return c4630i == null ? C4630I.c() : c4630i;
    }

    public final String c() {
        return this.backgroundHexColor_;
    }

    public final X d() {
        X x5 = this.body_;
        return x5 == null ? X.b() : x5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4628G.f48438a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4632K();
            case 2:
                return new C4631J(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4632K> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4632K.class) {
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

    public final String f() {
        return this.imageUrl_;
    }

    public final X g() {
        X x5 = this.title_;
        return x5 == null ? X.b() : x5;
    }

    public final boolean h() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean i() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean j() {
        return (this.bitField0_ & 1) != 0;
    }
}
