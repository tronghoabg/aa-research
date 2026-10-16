package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1957p extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1957p DEFAULT_INSTANCE;
    public static final int MUTE_SWITCH_FIELD_NUMBER = 1;
    private static volatile Parser<C1957p> PARSER = null;
    public static final int VOL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int muteSwitch_;
    private int vol_;

    static {
        C1957p c1957p = new C1957p();
        DEFAULT_INSTANCE = c1957p;
        GeneratedMessageLite.registerDefaultInstance(C1957p.class, c1957p);
    }

    public static void a(C1957p c1957p, EnumC1955o enumC1955o) {
        c1957p.getClass();
        c1957p.muteSwitch_ = enumC1955o.getNumber();
        c1957p.bitField0_ |= 1;
    }

    public static void b(C1957p c1957p, int i5) {
        c1957p.bitField0_ |= 2;
        c1957p.vol_ = i5;
    }

    public static C1953n d() {
        return (C1953n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1957p();
            case 2:
                return new C1953n(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "muteSwitch_", "vol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1957p> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1957p.class) {
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
