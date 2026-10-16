package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1968s extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BATTERY_STATUS_FIELD_NUMBER = 2;
    private static final C1968s DEFAULT_INSTANCE;
    public static final int LOW_POW_MODE_FIELD_NUMBER = 3;
    public static final int MAX_BATTERY_LEVEL_FIELD_NUMBER = 1;
    private static volatile Parser<C1968s> PARSER;
    private int batteryStatus_;
    private int bitField0_;
    private boolean lowPowMode_;
    private int maxBatteryLevel_;

    static {
        C1968s c1968s = new C1968s();
        DEFAULT_INSTANCE = c1968s;
        GeneratedMessageLite.registerDefaultInstance(C1968s.class, c1968s);
    }

    public static void a(C1968s c1968s, EnumC1965q enumC1965q) {
        c1968s.getClass();
        c1968s.batteryStatus_ = enumC1965q.getNumber();
        c1968s.bitField0_ |= 2;
    }

    public static void b(C1968s c1968s, boolean z2) {
        c1968s.bitField0_ |= 4;
        c1968s.lowPowMode_ = z2;
    }

    public static void c(C1968s c1968s, int i5) {
        c1968s.bitField0_ |= 1;
        c1968s.maxBatteryLevel_ = i5;
    }

    public static r e() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1968s();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "maxBatteryLevel_", "batteryStatus_", "lowPowMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1968s> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1968s.class) {
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
