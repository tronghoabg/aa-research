package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eb;
import com.google.v.ec;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteWaypoint extends du<RouteWaypoint, Builder> implements RouteWaypointOrBuilder {
    public static final int COORDINATE_FIELD_NUMBER = 4;
    private static final RouteWaypoint DEFAULT_INSTANCE;
    public static final int DISTANCETOWAYPOINTMETERS_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<RouteWaypoint> PARSER = null;
    public static final int SECONDSTOWAYPOINT_FIELD_NUMBER = 3;
    private int bitField0_;
    private Position.IntPosition coordinate_;
    private ec distanceToWaypointMeters_;
    private int id_;
    private ec secondsToWaypoint_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RouteWaypoint$1, reason: invalid class name */
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
        RouteWaypoint routeWaypoint = new RouteWaypoint();
        DEFAULT_INSTANCE = routeWaypoint;
        du.registerDefaultInstance(RouteWaypoint.class, routeWaypoint);
    }

    private RouteWaypoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToWaypointMeters() {
        this.distanceToWaypointMeters_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsToWaypoint() {
        this.secondsToWaypoint_ = null;
        this.bitField0_ &= -3;
    }

    public static RouteWaypoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.coordinate_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.coordinate_ = intPosition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDistanceToWaypointMeters(ec ecVar) {
        Objects.requireNonNull(ecVar);
        ec ecVar2 = this.distanceToWaypointMeters_;
        if (ecVar2 != null && ecVar2 != ec.getDefaultInstance()) {
            eb ebVarNewBuilder = ec.newBuilder(ecVar2);
            ebVarNewBuilder.mergeFrom((eb) ecVar);
            ecVar = ebVarNewBuilder.buildPartial();
        }
        this.distanceToWaypointMeters_ = ecVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecondsToWaypoint(ec ecVar) {
        Objects.requireNonNull(ecVar);
        ec ecVar2 = this.secondsToWaypoint_;
        if (ecVar2 != null && ecVar2 != ec.getDefaultInstance()) {
            eb ebVarNewBuilder = ec.newBuilder(ecVar2);
            ebVarNewBuilder.mergeFrom((eb) ecVar);
            ecVar = ebVarNewBuilder.buildPartial();
        }
        this.secondsToWaypoint_ = ecVar;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RouteWaypoint parseDelimitedFrom(InputStream inputStream) {
        return (RouteWaypoint) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteWaypoint parseFrom(v vVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RouteWaypoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.coordinate_ = intPosition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToWaypointMeters(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.distanceToWaypointMeters_ = ecVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsToWaypoint(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.secondsToWaypoint_ = ecVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "id_", "distanceToWaypointMeters_", "secondsToWaypoint_", "coordinate_"});
        }
        if (iOrdinal == 3) {
            return new RouteWaypoint();
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
        fo<RouteWaypoint> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RouteWaypoint.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public Position.IntPosition getCoordinate() {
        Position.IntPosition intPosition = this.coordinate_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public ec getDistanceToWaypointMeters() {
        ec ecVar = this.distanceToWaypointMeters_;
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public ec getSecondsToWaypoint() {
        ec ecVar = this.secondsToWaypoint_;
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public boolean hasCoordinate() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public boolean hasDistanceToWaypointMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
    public boolean hasSecondsToWaypoint() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(RouteWaypoint routeWaypoint) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routeWaypoint);
    }

    public static RouteWaypoint parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RouteWaypoint) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteWaypoint parseFrom(v vVar, de deVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RouteWaypoint parseFrom(z zVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RouteWaypoint parseFrom(z zVar, de deVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RouteWaypoint parseFrom(InputStream inputStream) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RouteWaypoint parseFrom(InputStream inputStream, de deVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RouteWaypoint parseFrom(ByteBuffer byteBuffer) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RouteWaypoint parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<RouteWaypoint, Builder> implements RouteWaypointOrBuilder {
        private Builder() {
            super(RouteWaypoint.DEFAULT_INSTANCE);
        }

        public Builder clearCoordinate() {
            copyOnWrite();
            ((RouteWaypoint) this.instance).clearCoordinate();
            return this;
        }

        public Builder clearDistanceToWaypointMeters() {
            copyOnWrite();
            ((RouteWaypoint) this.instance).clearDistanceToWaypointMeters();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((RouteWaypoint) this.instance).clearId();
            return this;
        }

        public Builder clearSecondsToWaypoint() {
            copyOnWrite();
            ((RouteWaypoint) this.instance).clearSecondsToWaypoint();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public Position.IntPosition getCoordinate() {
            return ((RouteWaypoint) this.instance).getCoordinate();
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public ec getDistanceToWaypointMeters() {
            return ((RouteWaypoint) this.instance).getDistanceToWaypointMeters();
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public int getId() {
            return ((RouteWaypoint) this.instance).getId();
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public ec getSecondsToWaypoint() {
            return ((RouteWaypoint) this.instance).getSecondsToWaypoint();
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public boolean hasCoordinate() {
            return ((RouteWaypoint) this.instance).hasCoordinate();
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public boolean hasDistanceToWaypointMeters() {
            return ((RouteWaypoint) this.instance).hasDistanceToWaypointMeters();
        }

        @Override // com.waze.jni.protos.navigate.RouteWaypointOrBuilder
        public boolean hasSecondsToWaypoint() {
            return ((RouteWaypoint) this.instance).hasSecondsToWaypoint();
        }

        public Builder mergeCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).mergeCoordinate(intPosition);
            return this;
        }

        public Builder mergeDistanceToWaypointMeters(ec ecVar) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).mergeDistanceToWaypointMeters(ecVar);
            return this;
        }

        public Builder mergeSecondsToWaypoint(ec ecVar) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).mergeSecondsToWaypoint(ecVar);
            return this;
        }

        public Builder setCoordinate(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setCoordinate(builder.build());
            return this;
        }

        public Builder setDistanceToWaypointMeters(eb ebVar) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setDistanceToWaypointMeters(ebVar.build());
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setId(i2);
            return this;
        }

        public Builder setSecondsToWaypoint(eb ebVar) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setSecondsToWaypoint(ebVar.build());
            return this;
        }

        public Builder setCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setCoordinate(intPosition);
            return this;
        }

        public Builder setDistanceToWaypointMeters(ec ecVar) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setDistanceToWaypointMeters(ecVar);
            return this;
        }

        public Builder setSecondsToWaypoint(ec ecVar) {
            copyOnWrite();
            ((RouteWaypoint) this.instance).setSecondsToWaypoint(ecVar);
            return this;
        }
    }

    public static RouteWaypoint parseFrom(byte[] bArr) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RouteWaypoint parseFrom(byte[] bArr, de deVar) {
        return (RouteWaypoint) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
