package com.waze.jni.protos.map;

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
public final class MapMovementChanged extends du<MapMovementChanged, Builder> implements MapMovementChangedOrBuilder {
    private static final MapMovementChanged DEFAULT_INSTANCE;
    public static final int NEW_STATE_FIELD_NUMBER = 1;
    private static volatile fo<MapMovementChanged> PARSER;
    private int newState_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapMovementChanged$1, reason: invalid class name */
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
    public final class Builder extends dm<MapMovementChanged, Builder> implements MapMovementChangedOrBuilder {
        private Builder() {
            super(MapMovementChanged.DEFAULT_INSTANCE);
        }

        public Builder clearNewState() {
            copyOnWrite();
            ((MapMovementChanged) this.instance).clearNewState();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapMovementChangedOrBuilder
        public MapMovementState getNewState() {
            return ((MapMovementChanged) this.instance).getNewState();
        }

        @Override // com.waze.jni.protos.map.MapMovementChangedOrBuilder
        public int getNewStateValue() {
            return ((MapMovementChanged) this.instance).getNewStateValue();
        }

        public Builder setNewState(MapMovementState mapMovementState) {
            copyOnWrite();
            ((MapMovementChanged) this.instance).setNewState(mapMovementState);
            return this;
        }

        public Builder setNewStateValue(int i2) {
            copyOnWrite();
            ((MapMovementChanged) this.instance).setNewStateValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum MapMovementState implements eg {
        IDLE_AFTER_TOUCH(0),
        FOLLOWING_TOUCH(1),
        SETTLING_AFTER_TOUCH(2),
        ANIMATING_MOVEMENT(3),
        ANIMATING_MOVEMENT_TO_TARGET(4),
        FOCUSED_ON_TARGET(5),
        UNRECOGNIZED(-1);

        public static final int ANIMATING_MOVEMENT_TO_TARGET_VALUE = 4;
        public static final int ANIMATING_MOVEMENT_VALUE = 3;
        public static final int FOCUSED_ON_TARGET_VALUE = 5;
        public static final int FOLLOWING_TOUCH_VALUE = 1;
        public static final int IDLE_AFTER_TOUCH_VALUE = 0;
        public static final int SETTLING_AFTER_TOUCH_VALUE = 2;
        private static final eh<MapMovementState> internalValueMap = new eh<MapMovementState>() { // from class: com.waze.jni.protos.map.MapMovementChanged.MapMovementState.1
            @Override // com.google.v.eh
            public MapMovementState findValueByNumber(int i2) {
                return MapMovementState.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class MapMovementStateVerifier implements ei {
            static final ei INSTANCE = new MapMovementStateVerifier();

            private MapMovementStateVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return MapMovementState.forNumber(i2) != null;
            }
        }

        MapMovementState(int i2) {
            this.value = i2;
        }

        public static MapMovementState forNumber(int i2) {
            if (i2 == 0) {
                return IDLE_AFTER_TOUCH;
            }
            if (i2 == 1) {
                return FOLLOWING_TOUCH;
            }
            if (i2 == 2) {
                return SETTLING_AFTER_TOUCH;
            }
            if (i2 == 3) {
                return ANIMATING_MOVEMENT;
            }
            if (i2 == 4) {
                return ANIMATING_MOVEMENT_TO_TARGET;
            }
            if (i2 != 5) {
                return null;
            }
            return FOCUSED_ON_TARGET;
        }

        public static eh<MapMovementState> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return MapMovementStateVerifier.INSTANCE;
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
        MapMovementChanged mapMovementChanged = new MapMovementChanged();
        DEFAULT_INSTANCE = mapMovementChanged;
        du.registerDefaultInstance(MapMovementChanged.class, mapMovementChanged);
    }

    private MapMovementChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewState() {
        this.newState_ = 0;
    }

    public static MapMovementChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapMovementChanged parseDelimitedFrom(InputStream inputStream) {
        return (MapMovementChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapMovementChanged parseFrom(v vVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapMovementChanged> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewState(MapMovementState mapMovementState) {
        this.newState_ = mapMovementState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewStateValue(int i2) {
        this.newState_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"newState_"});
        }
        if (iOrdinal == 3) {
            return new MapMovementChanged();
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
        fo<MapMovementChanged> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapMovementChanged.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapMovementChangedOrBuilder
    public MapMovementState getNewState() {
        MapMovementState mapMovementStateForNumber = MapMovementState.forNumber(this.newState_);
        return mapMovementStateForNumber == null ? MapMovementState.UNRECOGNIZED : mapMovementStateForNumber;
    }

    @Override // com.waze.jni.protos.map.MapMovementChangedOrBuilder
    public int getNewStateValue() {
        return this.newState_;
    }

    public static Builder newBuilder(MapMovementChanged mapMovementChanged) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapMovementChanged);
    }

    public static MapMovementChanged parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapMovementChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapMovementChanged parseFrom(v vVar, de deVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapMovementChanged parseFrom(z zVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapMovementChanged parseFrom(z zVar, de deVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapMovementChanged parseFrom(InputStream inputStream) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapMovementChanged parseFrom(InputStream inputStream, de deVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapMovementChanged parseFrom(ByteBuffer byteBuffer) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapMovementChanged parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MapMovementChanged parseFrom(byte[] bArr) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapMovementChanged parseFrom(byte[] bArr, de deVar) {
        return (MapMovementChanged) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
