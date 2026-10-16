package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1872f0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1872f0 DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int LEVELPLAY_FIELD_NUMBER = 4;
    public static final int MAX_FIELD_NUMBER = 3;
    private static volatile Parser<C1872f0> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private Object platform_;
    private int platformCase_ = 0;
    private String sessionId_ = "";
    private String eventId_ = "";

    static {
        C1872f0 c1872f0 = new C1872f0();
        DEFAULT_INSTANCE = c1872f0;
        GeneratedMessageLite.registerDefaultInstance(C1872f0.class, c1872f0);
    }

    public static void a(C1872f0 c1872f0, String str) {
        c1872f0.getClass();
        str.getClass();
        c1872f0.eventId_ = str;
    }

    public static void b(C1872f0 c1872f0, C1950l0 c1950l0) {
        c1872f0.getClass();
        c1872f0.platform_ = c1950l0;
        c1872f0.platformCase_ = 3;
    }

    public static void c(C1872f0 c1872f0, String str) {
        c1872f0.getClass();
        str.getClass();
        c1872f0.sessionId_ = str;
    }

    public static C1869e0 e() {
        return (C1869e0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1866d0.f28482a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1872f0();
            case 2:
                return new C1869e0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000", new Object[]{"platform_", "platformCase_", "sessionId_", "eventId_", C1950l0.class, C1946j0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1872f0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1872f0.class) {
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

    public final String getEventId() {
        return this.eventId_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }
}
