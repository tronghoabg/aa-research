package com.waze.jni.protos.view.bottom;

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
public final class BottomNotificationJni extends du<BottomNotificationJni, Builder> implements BottomNotificationJniOrBuilder {
    private static final BottomNotificationJni DEFAULT_INSTANCE;
    private static volatile fo<BottomNotificationJni> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.view.bottom.BottomNotificationJni$1, reason: invalid class name */
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
    public final class Builder extends dm<BottomNotificationJni, Builder> implements BottomNotificationJniOrBuilder {
        private Builder() {
            super(BottomNotificationJni.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum NearbyMessageType implements eg {
        UNKNOWN(0),
        WAZERS(1),
        REPORTS(2),
        POINTS(3),
        WALK_TO_CAR(4),
        UNRECOGNIZED(-1);

        public static final int POINTS_VALUE = 3;
        public static final int REPORTS_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        public static final int WALK_TO_CAR_VALUE = 4;
        public static final int WAZERS_VALUE = 1;
        private static final eh<NearbyMessageType> internalValueMap = new eh<NearbyMessageType>() { // from class: com.waze.jni.protos.view.bottom.BottomNotificationJni.NearbyMessageType.1
            @Override // com.google.v.eh
            public NearbyMessageType findValueByNumber(int i2) {
                return NearbyMessageType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class NearbyMessageTypeVerifier implements ei {
            static final ei INSTANCE = new NearbyMessageTypeVerifier();

            private NearbyMessageTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return NearbyMessageType.forNumber(i2) != null;
            }
        }

        NearbyMessageType(int i2) {
            this.value = i2;
        }

        public static NearbyMessageType forNumber(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return WAZERS;
            }
            if (i2 == 2) {
                return REPORTS;
            }
            if (i2 == 3) {
                return POINTS;
            }
            if (i2 != 4) {
                return null;
            }
            return WALK_TO_CAR;
        }

        public static eh<NearbyMessageType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return NearbyMessageTypeVerifier.INSTANCE;
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
        BottomNotificationJni bottomNotificationJni = new BottomNotificationJni();
        DEFAULT_INSTANCE = bottomNotificationJni;
        du.registerDefaultInstance(BottomNotificationJni.class, bottomNotificationJni);
    }

    private BottomNotificationJni() {
    }

    public static BottomNotificationJni getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BottomNotificationJni parseDelimitedFrom(InputStream inputStream) {
        return (BottomNotificationJni) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BottomNotificationJni parseFrom(v vVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<BottomNotificationJni> parser() {
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
            return new BottomNotificationJni();
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
        fo<BottomNotificationJni> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (BottomNotificationJni.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(BottomNotificationJni bottomNotificationJni) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(bottomNotificationJni);
    }

    public static BottomNotificationJni parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (BottomNotificationJni) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static BottomNotificationJni parseFrom(v vVar, de deVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static BottomNotificationJni parseFrom(z zVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static BottomNotificationJni parseFrom(z zVar, de deVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static BottomNotificationJni parseFrom(InputStream inputStream) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BottomNotificationJni parseFrom(InputStream inputStream, de deVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static BottomNotificationJni parseFrom(ByteBuffer byteBuffer) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BottomNotificationJni parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static BottomNotificationJni parseFrom(byte[] bArr) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BottomNotificationJni parseFrom(byte[] bArr, de deVar) {
        return (BottomNotificationJni) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
