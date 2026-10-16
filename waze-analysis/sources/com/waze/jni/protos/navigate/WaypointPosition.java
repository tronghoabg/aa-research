package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WaypointPosition extends du<WaypointPosition, Builder> implements WaypointPositionOrBuilder {
    private static final WaypointPosition DEFAULT_INSTANCE;
    private static volatile fo<WaypointPosition> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    private int bitField0_;
    private Position.IntPosition position_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.WaypointPosition$1, reason: invalid class name */
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

    static {
        WaypointPosition waypointPosition = new WaypointPosition();
        DEFAULT_INSTANCE = waypointPosition;
        du.registerDefaultInstance(WaypointPosition.class, waypointPosition);
    }

    private WaypointPosition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    public static WaypointPosition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WaypointPosition parseDelimitedFrom(InputStream inputStream) {
        return (WaypointPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaypointPosition parseFrom(v vVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<WaypointPosition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "position_"});
        }
        if (iOrdinal == 3) {
            return new WaypointPosition();
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
        fo<WaypointPosition> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (WaypointPosition.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.WaypointPositionOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.WaypointPositionOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WaypointPosition waypointPosition) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(waypointPosition);
    }

    public static WaypointPosition parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (WaypointPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WaypointPosition parseFrom(v vVar, de deVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static WaypointPosition parseFrom(z zVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static WaypointPosition parseFrom(z zVar, de deVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static WaypointPosition parseFrom(InputStream inputStream) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaypointPosition parseFrom(InputStream inputStream, de deVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WaypointPosition parseFrom(ByteBuffer byteBuffer) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WaypointPosition parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<WaypointPosition, Builder> implements WaypointPositionOrBuilder {
        private Builder() {
            super(WaypointPosition.DEFAULT_INSTANCE);
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((WaypointPosition) this.instance).clearPosition();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.WaypointPositionOrBuilder
        public Position.IntPosition getPosition() {
            return ((WaypointPosition) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.navigate.WaypointPositionOrBuilder
        public boolean hasPosition() {
            return ((WaypointPosition) this.instance).hasPosition();
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((WaypointPosition) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((WaypointPosition) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((WaypointPosition) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static WaypointPosition parseFrom(byte[] bArr) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WaypointPosition parseFrom(byte[] bArr, de deVar) {
        return (WaypointPosition) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
