package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Y extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final Y DEFAULT_INSTANCE;
    public static final int MIN_STREAMING_PLAYABLE_DURATION_ON_TIMEOUT_SECS_FIELD_NUMBER = 2;
    private static volatile Parser<Y> PARSER = null;
    public static final int STREAMING_CHUNK_SIZE_KILOBYTES_FIELD_NUMBER = 1;
    private int bitField0_;
    private double minStreamingPlayableDurationOnTimeoutSecs_;
    private long streamingChunkSizeKilobytes_;

    static {
        Y y10 = new Y();
        DEFAULT_INSTANCE = y10;
        GeneratedMessageLite.registerDefaultInstance(Y.class, y10);
    }

    public static Y b() {
        return DEFAULT_INSTANCE;
    }

    public final double c() {
        return this.minStreamingPlayableDurationOnTimeoutSecs_;
    }

    public final long d() {
        return this.streamingChunkSizeKilobytes_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (S.f28323a[methodToInvoke.ordinal()]) {
            case 1:
                return new Y();
            case 2:
                return new X(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001", new Object[]{"bitField0_", "streamingChunkSizeKilobytes_", "minStreamingPlayableDurationOnTimeoutSecs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Y> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Y.class) {
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
