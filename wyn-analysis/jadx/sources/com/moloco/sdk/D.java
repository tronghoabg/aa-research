package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class D extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 4;
    private static final D DEFAULT_INSTANCE;
    public static final int INTERSTITIAL_FIELD_NUMBER = 1;
    public static final int MREC_FIELD_NUMBER = 3;
    public static final int NATIVE_FIELD_NUMBER = 5;
    private static volatile Parser<D> PARSER = null;
    public static final int REWARDED_FIELD_NUMBER = 2;
    private int banner_;
    private int interstitial_;
    private int mrec_;
    private int native_;
    private int rewarded_;

    static {
        D d3 = new D();
        DEFAULT_INSTANCE = d3;
        GeneratedMessageLite.registerDefaultInstance(D.class, d3);
    }

    public static void a(D d3, int i5) {
        d3.banner_ = i5;
    }

    public static void b(D d3, int i5) {
        d3.interstitial_ = i5;
    }

    public static void c(D d3, int i5) {
        d3.mrec_ = i5;
    }

    public static void d(D d3, int i5) {
        d3.native_ = i5;
    }

    public static void e(D d3, int i5) {
        d3.rewarded_ = i5;
    }

    public static C g() {
        return (C) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new C(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"interstitial_", "rewarded_", "mrec_", "banner_", "native_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<D> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (D.class) {
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
