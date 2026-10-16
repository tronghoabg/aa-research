package com.waze.jni.protos.alerters;

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
public final class ZoneAlertData extends du<ZoneAlertData, Builder> implements ZoneAlertDataOrBuilder {
    private static final ZoneAlertData DEFAULT_INSTANCE;
    private static volatile fo<ZoneAlertData> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int ZONE_PERCENT_FIELD_NUMBER = 2;
    private int state_;
    private int zonePercent_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.alerters.ZoneAlertData$1, reason: invalid class name */
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
    public final class Builder extends dm<ZoneAlertData, Builder> implements ZoneAlertDataOrBuilder {
        private Builder() {
            super(ZoneAlertData.DEFAULT_INSTANCE);
        }

        public Builder clearState() {
            copyOnWrite();
            ((ZoneAlertData) this.instance).clearState();
            return this;
        }

        public Builder clearZonePercent() {
            copyOnWrite();
            ((ZoneAlertData) this.instance).clearZonePercent();
            return this;
        }

        @Override // com.waze.jni.protos.alerters.ZoneAlertDataOrBuilder
        public State getState() {
            return ((ZoneAlertData) this.instance).getState();
        }

        @Override // com.waze.jni.protos.alerters.ZoneAlertDataOrBuilder
        public int getStateValue() {
            return ((ZoneAlertData) this.instance).getStateValue();
        }

        @Override // com.waze.jni.protos.alerters.ZoneAlertDataOrBuilder
        public int getZonePercent() {
            return ((ZoneAlertData) this.instance).getZonePercent();
        }

        public Builder setState(State state) {
            copyOnWrite();
            ((ZoneAlertData) this.instance).setState(state);
            return this;
        }

        public Builder setStateValue(int i2) {
            copyOnWrite();
            ((ZoneAlertData) this.instance).setStateValue(i2);
            return this;
        }

        public Builder setZonePercent(int i2) {
            copyOnWrite();
            ((ZoneAlertData) this.instance).setZonePercent(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum State implements eg {
        BeforeZone(0),
        InZone(1),
        LeftZone(2),
        UNRECOGNIZED(-1);

        public static final int BeforeZone_VALUE = 0;
        public static final int InZone_VALUE = 1;
        public static final int LeftZone_VALUE = 2;
        private static final eh<State> internalValueMap = new eh<State>() { // from class: com.waze.jni.protos.alerters.ZoneAlertData.State.1
            @Override // com.google.v.eh
            public State findValueByNumber(int i2) {
                return State.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class StateVerifier implements ei {
            static final ei INSTANCE = new StateVerifier();

            private StateVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return State.forNumber(i2) != null;
            }
        }

        State(int i2) {
            this.value = i2;
        }

        public static State forNumber(int i2) {
            if (i2 == 0) {
                return BeforeZone;
            }
            if (i2 == 1) {
                return InZone;
            }
            if (i2 != 2) {
                return null;
            }
            return LeftZone;
        }

        public static eh<State> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return StateVerifier.INSTANCE;
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
        ZoneAlertData zoneAlertData = new ZoneAlertData();
        DEFAULT_INSTANCE = zoneAlertData;
        du.registerDefaultInstance(ZoneAlertData.class, zoneAlertData);
    }

    private ZoneAlertData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZonePercent() {
        this.zonePercent_ = 0;
    }

    public static ZoneAlertData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ZoneAlertData parseDelimitedFrom(InputStream inputStream) {
        return (ZoneAlertData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ZoneAlertData parseFrom(v vVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ZoneAlertData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        this.state_ = state.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i2) {
        this.state_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZonePercent(int i2) {
        this.zonePercent_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"state_", "zonePercent_"});
        }
        if (iOrdinal == 3) {
            return new ZoneAlertData();
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
        fo<ZoneAlertData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ZoneAlertData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.alerters.ZoneAlertDataOrBuilder
    public State getState() {
        State stateForNumber = State.forNumber(this.state_);
        return stateForNumber == null ? State.UNRECOGNIZED : stateForNumber;
    }

    @Override // com.waze.jni.protos.alerters.ZoneAlertDataOrBuilder
    public int getStateValue() {
        return this.state_;
    }

    @Override // com.waze.jni.protos.alerters.ZoneAlertDataOrBuilder
    public int getZonePercent() {
        return this.zonePercent_;
    }

    public static Builder newBuilder(ZoneAlertData zoneAlertData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(zoneAlertData);
    }

    public static ZoneAlertData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ZoneAlertData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ZoneAlertData parseFrom(v vVar, de deVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ZoneAlertData parseFrom(z zVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ZoneAlertData parseFrom(z zVar, de deVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ZoneAlertData parseFrom(InputStream inputStream) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ZoneAlertData parseFrom(InputStream inputStream, de deVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ZoneAlertData parseFrom(ByteBuffer byteBuffer) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ZoneAlertData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ZoneAlertData parseFrom(byte[] bArr) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ZoneAlertData parseFrom(byte[] bArr, de deVar) {
        return (ZoneAlertData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
