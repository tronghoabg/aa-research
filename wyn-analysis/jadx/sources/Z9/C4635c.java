package z9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: z9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4635c extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final C4635c DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile Parser<C4635c> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private C4638f clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    static {
        C4635c c4635c = new C4635c();
        DEFAULT_INSTANCE = c4635c;
        GeneratedMessageLite.registerDefaultInstance(C4635c.class, c4635c);
    }

    public static void b(C4635c c4635c, long j8) {
        c4635c.bitField0_ |= 8;
        c4635c.clientTimestampMillis_ = j8;
    }

    public static void c(C4635c c4635c, EnumC4651t enumC4651t) {
        c4635c.getClass();
        c4635c.event_ = Integer.valueOf(enumC4651t.f48467a);
        c4635c.eventCase_ = 5;
    }

    public static void d(C4635c c4635c, r rVar) {
        c4635c.getClass();
        c4635c.event_ = Integer.valueOf(rVar.f48461a);
        c4635c.eventCase_ = 6;
    }

    public static void e(C4635c c4635c, Z z2) {
        c4635c.getClass();
        c4635c.event_ = Integer.valueOf(z2.f48445a);
        c4635c.eventCase_ = 7;
    }

    public static void f(C4635c c4635c, String str) {
        c4635c.getClass();
        str.getClass();
        c4635c.bitField0_ |= 1;
        c4635c.projectNumber_ = str;
    }

    public static void g(C4635c c4635c) {
        c4635c.getClass();
        c4635c.bitField0_ |= 16;
        c4635c.fiamSdkVersion_ = "21.0.1";
    }

    public static void h(C4635c c4635c, String str) {
        c4635c.getClass();
        c4635c.bitField0_ |= 2;
        c4635c.campaignId_ = str;
    }

    public static void i(C4635c c4635c, C4638f c4638f) {
        c4635c.getClass();
        c4638f.getClass();
        c4635c.clientApp_ = c4638f;
        c4635c.bitField0_ |= 4;
    }

    public static C4634b j() {
        return (C4634b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC4633a.f48446a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4635c();
            case 2:
                return new C4634b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", C4650s.f48462a, C4649q.f48455a, Y.f48439a, C4657z.f48469a, "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C4635c> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C4635c.class) {
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
