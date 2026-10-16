package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4638f extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C4638f DEFAULT_INSTANCE;
    public static final int FIREBASE_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<C4638f> PARSER;
    private int bitField0_;
    private String googleAppId_ = "";
    private String firebaseInstanceId_ = "";

    static {
        C4638f c4638f = new C4638f();
        DEFAULT_INSTANCE = c4638f;
        GeneratedMessageLite.registerDefaultInstance(C4638f.class, c4638f);
    }

    public static void b(C4638f c4638f, String str) {
        c4638f.getClass();
        str.getClass();
        c4638f.bitField0_ |= 1;
        c4638f.googleAppId_ = str;
    }

    public static void c(C4638f c4638f, String str) {
        c4638f.getClass();
        str.getClass();
        c4638f.bitField0_ |= 2;
        c4638f.firebaseInstanceId_ = str;
    }

    public static C4637e d() {
        return (C4637e) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4636d.f48447a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4638f();
            case 2:
                return new C4637e(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "googleAppId_", "firebaseInstanceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4638f> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4638f.class) {
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
