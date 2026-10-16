package ta;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ta.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4154c extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final C4154c DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile Parser<C4154c> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    static {
        C4154c c4154c = new C4154c();
        DEFAULT_INSTANCE = c4154c;
        GeneratedMessageLite.registerDefaultInstance(C4154c.class, c4154c);
    }

    public static void b(C4154c c4154c, String str) {
        c4154c.getClass();
        c4154c.campaignId_ = str;
    }

    public static void c(C4154c c4154c, long j8) {
        c4154c.impressionTimestampMillis_ = j8;
    }

    public static C4153b e() {
        return (C4153b) DEFAULT_INSTANCE.createBuilder();
    }

    public final String d() {
        return this.campaignId_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4152a.f45968a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4154c();
            case 2:
                return new C4153b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4154c> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4154c.class) {
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
