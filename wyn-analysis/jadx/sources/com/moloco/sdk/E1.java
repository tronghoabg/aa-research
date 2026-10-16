package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class E1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 3;
    public static final int APP_BACKGROUNDING_INTERACTION_FIELD_NUMBER = 103;
    public static final int APP_FIELD_NUMBER = 5;
    public static final int APP_FOREGROUNDING_INTERACTION_FIELD_NUMBER = 102;
    public static final int CLICK_INTERACTION_FIELD_NUMBER = 101;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 2;
    private static final E1 DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int IMP_INTERACTION_FIELD_NUMBER = 100;
    public static final int MREF_FIELD_NUMBER = 1;
    public static final int NETWORK_FIELD_NUMBER = 6;
    private static volatile Parser<E1> PARSER = null;
    public static final int SDK_FIELD_NUMBER = 7;
    private f1 app_;
    private long clientTimestamp_;
    private s1 device_;
    private Object infoExt_;
    private z1 network_;
    private w1 sdk_;
    private int infoExtCase_ = 0;
    private String mref_ = "";
    private String advertisingId_ = "";

    static {
        E1 e12 = new E1();
        DEFAULT_INSTANCE = e12;
        GeneratedMessageLite.registerDefaultInstance(E1.class, e12);
    }

    public static void a(E1 e12, String str) {
        e12.getClass();
        e12.advertisingId_ = str;
    }

    public static void b(E1 e12, f1 f1Var) {
        e12.getClass();
        f1Var.getClass();
        e12.app_ = f1Var;
    }

    public static void c(E1 e12, h1 h1Var) {
        e12.getClass();
        h1Var.getClass();
        e12.infoExt_ = h1Var;
        e12.infoExtCase_ = 103;
    }

    public static void d(E1 e12, j1 j1Var) {
        e12.getClass();
        j1Var.getClass();
        e12.infoExt_ = j1Var;
        e12.infoExtCase_ = 102;
    }

    public static void e(E1 e12, p1 p1Var) {
        e12.getClass();
        p1Var.getClass();
        e12.infoExt_ = p1Var;
        e12.infoExtCase_ = 101;
    }

    public static void f(E1 e12, long j8) {
        e12.clientTimestamp_ = j8;
    }

    public static void g(E1 e12, s1 s1Var) {
        e12.getClass();
        s1Var.getClass();
        e12.device_ = s1Var;
    }

    public static void h(E1 e12, u1 u1Var) {
        e12.getClass();
        u1Var.getClass();
        e12.infoExt_ = u1Var;
        e12.infoExtCase_ = 100;
    }

    public static void i(E1 e12, String str) {
        e12.getClass();
        str.getClass();
        e12.mref_ = str;
    }

    public static void j(E1 e12, z1 z1Var) {
        e12.getClass();
        z1Var.getClass();
        e12.network_ = z1Var;
    }

    public static void k(E1 e12, w1 w1Var) {
        e12.getClass();
        w1Var.getClass();
        e12.sdk_ = w1Var;
    }

    public static k1 m() {
        return (k1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new E1();
            case 2:
                return new k1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001g\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\td<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"infoExt_", "infoExtCase_", "mref_", "clientTimestamp_", "advertisingId_", "device_", "app_", "network_", "sdk_", u1.class, p1.class, j1.class, h1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<E1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (E1.class) {
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
