package com.waze.jni.protos.copilot.data;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnalyticsSource extends du<AnalyticsSource, Builder> implements AnalyticsSourceOrBuilder {
    private static final AnalyticsSource DEFAULT_INSTANCE;
    private static volatile fo<AnalyticsSource> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int source_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.copilot.data.AnalyticsSource$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public enum AssetChangeSource implements eg {
        UNDEFINED(0),
        SYSTEM(1),
        PREVIOUS(2),
        DEFAULT_RANDOM(3),
        SETTINGS(4),
        DEEPLINK(5),
        COPILOT(6),
        COPILOT_MARKETPLACE(7),
        UNRECOGNIZED(-1);

        public static final int COPILOT_MARKETPLACE_VALUE = 7;
        public static final int COPILOT_VALUE = 6;
        public static final int DEEPLINK_VALUE = 5;
        public static final int DEFAULT_RANDOM_VALUE = 3;
        public static final int PREVIOUS_VALUE = 2;
        public static final int SETTINGS_VALUE = 4;
        public static final int SYSTEM_VALUE = 1;
        public static final int UNDEFINED_VALUE = 0;
        private static final eh<AssetChangeSource> internalValueMap = new eh<AssetChangeSource>() { // from class: com.waze.jni.protos.copilot.data.AnalyticsSource.AssetChangeSource.1
            @Override // com.google.v.eh
            public AssetChangeSource findValueByNumber(int i2) {
                return AssetChangeSource.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AssetChangeSourceVerifier implements ei {
            static final ei INSTANCE = new AssetChangeSourceVerifier();

            private AssetChangeSourceVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AssetChangeSource.forNumber(i2) != null;
            }
        }

        AssetChangeSource(int i2) {
            this.value = i2;
        }

        public static AssetChangeSource forNumber(int i2) {
            switch (i2) {
                case 0:
                    return UNDEFINED;
                case 1:
                    return SYSTEM;
                case 2:
                    return PREVIOUS;
                case 3:
                    return DEFAULT_RANDOM;
                case 4:
                    return SETTINGS;
                case 5:
                    return DEEPLINK;
                case 6:
                    return COPILOT;
                case 7:
                    return COPILOT_MARKETPLACE;
                default:
                    return null;
            }
        }

        public static eh<AssetChangeSource> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AssetChangeSourceVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<AnalyticsSource, Builder> implements AnalyticsSourceOrBuilder {
        private Builder() {
            super(AnalyticsSource.DEFAULT_INSTANCE);
        }

        public Builder clearSource() {
            copyOnWrite();
            ((AnalyticsSource) this.instance).clearSource();
            return this;
        }

        @Override // com.waze.jni.protos.copilot.data.AnalyticsSourceOrBuilder
        public AssetChangeSource getSource() {
            return ((AnalyticsSource) this.instance).getSource();
        }

        @Override // com.waze.jni.protos.copilot.data.AnalyticsSourceOrBuilder
        public int getSourceValue() {
            return ((AnalyticsSource) this.instance).getSourceValue();
        }

        public Builder setSource(AssetChangeSource assetChangeSource) {
            copyOnWrite();
            ((AnalyticsSource) this.instance).setSource(assetChangeSource);
            return this;
        }

        public Builder setSourceValue(int i2) {
            copyOnWrite();
            ((AnalyticsSource) this.instance).setSourceValue(i2);
            return this;
        }
    }

    static {
        AnalyticsSource analyticsSource = new AnalyticsSource();
        DEFAULT_INSTANCE = analyticsSource;
        du.registerDefaultInstance(AnalyticsSource.class, analyticsSource);
    }

    private AnalyticsSource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static AnalyticsSource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AnalyticsSource parseDelimitedFrom(InputStream inputStream) {
        return (AnalyticsSource) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticsSource parseFrom(v vVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AnalyticsSource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(AssetChangeSource assetChangeSource) {
        this.source_ = assetChangeSource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"source_"});
        }
        if (iOrdinal == 3) {
            return new AnalyticsSource();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<AnalyticsSource> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AnalyticsSource.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.copilot.data.AnalyticsSourceOrBuilder
    public AssetChangeSource getSource() {
        AssetChangeSource assetChangeSourceForNumber = AssetChangeSource.forNumber(this.source_);
        return assetChangeSourceForNumber == null ? AssetChangeSource.UNRECOGNIZED : assetChangeSourceForNumber;
    }

    @Override // com.waze.jni.protos.copilot.data.AnalyticsSourceOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    public static Builder newBuilder(AnalyticsSource analyticsSource) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(analyticsSource);
    }

    public static AnalyticsSource parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AnalyticsSource) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AnalyticsSource parseFrom(v vVar, de deVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AnalyticsSource parseFrom(z zVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AnalyticsSource parseFrom(z zVar, de deVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AnalyticsSource parseFrom(InputStream inputStream) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticsSource parseFrom(InputStream inputStream, de deVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AnalyticsSource parseFrom(ByteBuffer byteBuffer) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AnalyticsSource parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AnalyticsSource parseFrom(byte[] bArr) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnalyticsSource parseFrom(byte[] bArr, de deVar) {
        return (AnalyticsSource) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
