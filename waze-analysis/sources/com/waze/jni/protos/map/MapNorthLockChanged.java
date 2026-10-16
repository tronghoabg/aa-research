package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapNorthLockChanged extends du<MapNorthLockChanged, Builder> implements MapNorthLockChangedOrBuilder {
    private static final MapNorthLockChanged DEFAULT_INSTANCE;
    public static final int NORTH_LOCK_FIELD_NUMBER = 1;
    private static volatile fo<MapNorthLockChanged> PARSER;
    private int northLock_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapNorthLockChanged$1, reason: invalid class name */
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
    public final class Builder extends dm<MapNorthLockChanged, Builder> implements MapNorthLockChangedOrBuilder {
        private Builder() {
            super(MapNorthLockChanged.DEFAULT_INSTANCE);
        }

        public Builder clearNorthLock() {
            copyOnWrite();
            ((MapNorthLockChanged) this.instance).clearNorthLock();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapNorthLockChangedOrBuilder
        public NorthLockBehavior getNorthLock() {
            return ((MapNorthLockChanged) this.instance).getNorthLock();
        }

        @Override // com.waze.jni.protos.map.MapNorthLockChangedOrBuilder
        public int getNorthLockValue() {
            return ((MapNorthLockChanged) this.instance).getNorthLockValue();
        }

        public Builder setNorthLock(NorthLockBehavior northLockBehavior) {
            copyOnWrite();
            ((MapNorthLockChanged) this.instance).setNorthLock(northLockBehavior);
            return this;
        }

        public Builder setNorthLockValue(int i2) {
            copyOnWrite();
            ((MapNorthLockChanged) this.instance).setNorthLockValue(i2);
            return this;
        }
    }

    static {
        MapNorthLockChanged mapNorthLockChanged = new MapNorthLockChanged();
        DEFAULT_INSTANCE = mapNorthLockChanged;
        du.registerDefaultInstance(MapNorthLockChanged.class, mapNorthLockChanged);
    }

    private MapNorthLockChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNorthLock() {
        this.northLock_ = 0;
    }

    public static MapNorthLockChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapNorthLockChanged parseDelimitedFrom(InputStream inputStream) {
        return (MapNorthLockChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapNorthLockChanged parseFrom(v vVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapNorthLockChanged> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNorthLock(NorthLockBehavior northLockBehavior) {
        this.northLock_ = northLockBehavior.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNorthLockValue(int i2) {
        this.northLock_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"northLock_"});
        }
        if (iOrdinal == 3) {
            return new MapNorthLockChanged();
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
        fo<MapNorthLockChanged> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapNorthLockChanged.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapNorthLockChangedOrBuilder
    public NorthLockBehavior getNorthLock() {
        NorthLockBehavior northLockBehaviorForNumber = NorthLockBehavior.forNumber(this.northLock_);
        return northLockBehaviorForNumber == null ? NorthLockBehavior.UNRECOGNIZED : northLockBehaviorForNumber;
    }

    @Override // com.waze.jni.protos.map.MapNorthLockChangedOrBuilder
    public int getNorthLockValue() {
        return this.northLock_;
    }

    public static Builder newBuilder(MapNorthLockChanged mapNorthLockChanged) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapNorthLockChanged);
    }

    public static MapNorthLockChanged parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapNorthLockChanged) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapNorthLockChanged parseFrom(v vVar, de deVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapNorthLockChanged parseFrom(z zVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapNorthLockChanged parseFrom(z zVar, de deVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapNorthLockChanged parseFrom(InputStream inputStream) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapNorthLockChanged parseFrom(InputStream inputStream, de deVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapNorthLockChanged parseFrom(ByteBuffer byteBuffer) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapNorthLockChanged parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MapNorthLockChanged parseFrom(byte[] bArr) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapNorthLockChanged parseFrom(byte[] bArr, de deVar) {
        return (MapNorthLockChanged) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
