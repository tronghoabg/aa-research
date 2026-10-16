package com.waze.jni.protos;

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
public final class ConfigManagerJni extends du<ConfigManagerJni, Builder> implements ConfigManagerJniOrBuilder {
    private static final ConfigManagerJni DEFAULT_INSTANCE;
    private static volatile fo<ConfigManagerJni> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.ConfigManagerJni$1, reason: invalid class name */
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
    public final class Builder extends dm<ConfigManagerJni, Builder> implements ConfigManagerJniOrBuilder {
        private Builder() {
            super(ConfigManagerJni.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum CounterConfigs implements eg {
        RESIDENTIAL_CONFIRMATION(0),
        FRIENDS_TIP(2),
        UNRECOGNIZED(-1);

        public static final int FRIENDS_TIP_VALUE = 2;
        public static final int RESIDENTIAL_CONFIRMATION_VALUE = 0;
        private static final eh<CounterConfigs> internalValueMap = new eh<CounterConfigs>() { // from class: com.waze.jni.protos.ConfigManagerJni.CounterConfigs.1
            @Override // com.google.v.eh
            public CounterConfigs findValueByNumber(int i2) {
                return CounterConfigs.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class CounterConfigsVerifier implements ei {
            static final ei INSTANCE = new CounterConfigsVerifier();

            private CounterConfigsVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return CounterConfigs.forNumber(i2) != null;
            }
        }

        CounterConfigs(int i2) {
            this.value = i2;
        }

        public static CounterConfigs forNumber(int i2) {
            if (i2 == 0) {
                return RESIDENTIAL_CONFIRMATION;
            }
            if (i2 != 2) {
                return null;
            }
            return FRIENDS_TIP;
        }

        public static eh<CounterConfigs> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return CounterConfigsVerifier.INSTANCE;
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

    static {
        ConfigManagerJni configManagerJni = new ConfigManagerJni();
        DEFAULT_INSTANCE = configManagerJni;
        du.registerDefaultInstance(ConfigManagerJni.class, configManagerJni);
    }

    private ConfigManagerJni() {
    }

    public static ConfigManagerJni getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigManagerJni parseDelimitedFrom(InputStream inputStream) {
        return (ConfigManagerJni) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigManagerJni parseFrom(v vVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ConfigManagerJni> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ConfigManagerJni();
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
        fo<ConfigManagerJni> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ConfigManagerJni.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(ConfigManagerJni configManagerJni) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(configManagerJni);
    }

    public static ConfigManagerJni parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ConfigManagerJni) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ConfigManagerJni parseFrom(v vVar, de deVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ConfigManagerJni parseFrom(z zVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ConfigManagerJni parseFrom(z zVar, de deVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ConfigManagerJni parseFrom(InputStream inputStream) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigManagerJni parseFrom(InputStream inputStream, de deVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ConfigManagerJni parseFrom(ByteBuffer byteBuffer) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ConfigManagerJni parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ConfigManagerJni parseFrom(byte[] bArr) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigManagerJni parseFrom(byte[] bArr, de deVar) {
        return (ConfigManagerJni) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
