package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class J extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final J DEFAULT_INSTANCE;
    public static final int MCC_FIELD_NUMBER = 3;
    public static final int MNC_FIELD_NUMBER = 4;
    private static volatile Parser<J> PARSER = null;
    public static final int RESTRICTED_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int mcc_;
    private int mnc_;
    private boolean restricted_;
    private int type_;

    static {
        J j8 = new J();
        DEFAULT_INSTANCE = j8;
        GeneratedMessageLite.registerDefaultInstance(J.class, j8);
    }

    public static void a(J j8, int i5) {
        j8.bitField0_ |= 4;
        j8.mcc_ = i5;
    }

    public static void b(J j8, int i5) {
        j8.bitField0_ |= 8;
        j8.mnc_ = i5;
    }

    public static void c(J j8, boolean z2) {
        j8.bitField0_ |= 2;
        j8.restricted_ = z2;
    }

    public static void d(J j8, I i5) {
        j8.getClass();
        j8.type_ = i5.getNumber();
        j8.bitField0_ |= 1;
    }

    public static H f() {
        return (H) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new H(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "type_", "restricted_", "mcc_", "mnc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<J> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (J.class) {
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
