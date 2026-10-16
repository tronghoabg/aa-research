package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class G0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final G0 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 5;
    public static final int MAX_SESSION_LEN_FIELD_NUMBER = 6;
    private static volatile Parser<G0> PARSER = null;
    public static final int RAW_IMP_URL_FIELD_NUMBER = 2;
    public static final int RETRY_COUNT_FIELD_NUMBER = 4;
    public static final int SESSION_EXP_FIELD_NUMBER = 3;
    public static final int SUPPORTED_NETWORKS_FIELD_NUMBER = 8;
    public static final int UPLOAD_INTERVAL_FIELD_NUMBER = 7;
    private static final Internal.ListAdapter.Converter<Integer, J0> supportedNetworks_converter_ = new E0();
    private boolean enabled_;
    private int maxBatchSize_;
    private int maxSessionLen_;
    private int retryCount_;
    private int sessionExp_;
    private int supportedNetworksMemoizedSerializedSize;
    private int uploadInterval_;
    private String rawImpUrl_ = "";
    private Internal.IntList supportedNetworks_ = GeneratedMessageLite.emptyIntList();

    static {
        G0 g02 = new G0();
        DEFAULT_INSTANCE = g02;
        GeneratedMessageLite.registerDefaultInstance(G0.class, g02);
    }

    public static G0 b() {
        return DEFAULT_INSTANCE;
    }

    public final int c() {
        return this.maxSessionLen_;
    }

    public final String d() {
        return this.rawImpUrl_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new G0();
            case 2:
                return new F0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b,", new Object[]{"enabled_", "rawImpUrl_", "sessionExp_", "retryCount_", "maxBatchSize_", "maxSessionLen_", "uploadInterval_", "supportedNetworks_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<G0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (G0.class) {
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

    public final int e() {
        return this.sessionExp_;
    }

    public final Internal.ListAdapter f() {
        return new Internal.ListAdapter(this.supportedNetworks_, supportedNetworks_converter_);
    }

    public final int g() {
        return this.uploadInterval_;
    }

    public final boolean getEnabled() {
        return this.enabled_;
    }

    public final int getMaxBatchSize() {
        return this.maxBatchSize_;
    }
}
