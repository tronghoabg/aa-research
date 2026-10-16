package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1873g extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_FIELD_NUMBER = 1;
    public static final int CLIENT_TOKEN_CONFIGS_FIELD_NUMBER = 3;
    private static final C1873g DEFAULT_INSTANCE;
    private static volatile Parser<C1873g> PARSER = null;
    public static final int PK_FIELD_NUMBER = 2;
    private C1871f clientTokenConfigs_;
    private String bidToken_ = "";
    private String pk_ = "";

    static {
        C1873g c1873g = new C1873g();
        DEFAULT_INSTANCE = c1873g;
        GeneratedMessageLite.registerDefaultInstance(C1873g.class, c1873g);
    }

    public static C1873g f(byte[] bArr) {
        return (C1873g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final String b() {
        return this.bidToken_;
    }

    public final C1871f c() {
        C1871f c1871f = this.clientTokenConfigs_;
        return c1871f == null ? C1871f.b() : c1871f;
    }

    public final String d() {
        return this.pk_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1873g();
            case 2:
                return new C1865d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"bidToken_", "pk_", "clientTokenConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1873g> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1873g.class) {
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

    public final boolean e() {
        return this.clientTokenConfigs_ != null;
    }
}
