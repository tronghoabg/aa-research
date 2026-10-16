package r8;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: r8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3939c extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final C3939c DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile Parser<C3939c> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    static {
        C3939c c3939c = new C3939c();
        DEFAULT_INSTANCE = c3939c;
        GeneratedMessageLite.registerDefaultInstance(C3939c.class, c3939c);
    }

    public static void b(C3939c c3939c, String str) {
        c3939c.getClass();
        str.getClass();
        c3939c.appVersion_ = str;
    }

    public static void c(C3939c c3939c, String str) {
        c3939c.getClass();
        str.getClass();
        c3939c.timeZone_ = str;
    }

    public static void d(C3939c c3939c, String str) {
        c3939c.getClass();
        str.getClass();
        c3939c.platformVersion_ = str;
    }

    public static void e(C3939c c3939c, String str) {
        c3939c.getClass();
        str.getClass();
        c3939c.languageCode_ = str;
    }

    public static C3938b f() {
        return (C3938b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3937a.f44540a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3939c();
            case 2:
                return new C3938b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3939c> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3939c.class) {
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
