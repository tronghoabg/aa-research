package com.waze.jni.protos.planned_drive;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadPlannedDriveOptionsRequest extends du<LoadPlannedDriveOptionsRequest, Builder> implements LoadPlannedDriveOptionsRequestOrBuilder {
    public static final int DAYS_FROM_NOW_FIELD_NUMBER = 1;
    private static final LoadPlannedDriveOptionsRequest DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int ORIGIN_FIELD_NUMBER = 2;
    private static volatile fo<LoadPlannedDriveOptionsRequest> PARSER;
    private int bitField0_;
    private int daysFromNow_;
    private VenueData destination_;
    private Position.IntPosition origin_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest$1, reason: invalid class name */
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
        LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest = new LoadPlannedDriveOptionsRequest();
        DEFAULT_INSTANCE = loadPlannedDriveOptionsRequest;
        du.registerDefaultInstance(LoadPlannedDriveOptionsRequest.class, loadPlannedDriveOptionsRequest);
    }

    private LoadPlannedDriveOptionsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDaysFromNow() {
        this.daysFromNow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
        this.bitField0_ &= -2;
    }

    public static LoadPlannedDriveOptionsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(VenueData venueData) {
        Objects.requireNonNull(venueData);
        VenueData venueData2 = this.destination_;
        if (venueData2 != null && venueData2 != VenueData.getDefaultInstance()) {
            VenueData.Builder builderNewBuilder = VenueData.newBuilder(venueData2);
            builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
            venueData = builderNewBuilder.buildPartial();
        }
        this.destination_ = venueData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrigin(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.origin_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.origin_ = intPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LoadPlannedDriveOptionsRequest parseDelimitedFrom(InputStream inputStream) {
        return (LoadPlannedDriveOptionsRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(v vVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LoadPlannedDriveOptionsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDaysFromNow(int i2) {
        this.daysFromNow_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.destination_ = venueData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.origin_ = intPosition;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "daysFromNow_", "origin_", "destination_"});
        }
        if (iOrdinal == 3) {
            return new LoadPlannedDriveOptionsRequest();
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
        fo<LoadPlannedDriveOptionsRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LoadPlannedDriveOptionsRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
    public int getDaysFromNow() {
        return this.daysFromNow_;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
    public VenueData getDestination() {
        VenueData venueData = this.destination_;
        return venueData == null ? VenueData.getDefaultInstance() : venueData;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
    public Position.IntPosition getOrigin() {
        Position.IntPosition intPosition = this.origin_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
    public boolean hasDestination() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
    public boolean hasOrigin() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(loadPlannedDriveOptionsRequest);
    }

    public static LoadPlannedDriveOptionsRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LoadPlannedDriveOptionsRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(v vVar, de deVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(z zVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(z zVar, de deVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(InputStream inputStream) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(InputStream inputStream, de deVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(ByteBuffer byteBuffer) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<LoadPlannedDriveOptionsRequest, Builder> implements LoadPlannedDriveOptionsRequestOrBuilder {
        private Builder() {
            super(LoadPlannedDriveOptionsRequest.DEFAULT_INSTANCE);
        }

        public Builder clearDaysFromNow() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).clearDaysFromNow();
            return this;
        }

        public Builder clearDestination() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).clearDestination();
            return this;
        }

        public Builder clearOrigin() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).clearOrigin();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
        public int getDaysFromNow() {
            return ((LoadPlannedDriveOptionsRequest) this.instance).getDaysFromNow();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
        public VenueData getDestination() {
            return ((LoadPlannedDriveOptionsRequest) this.instance).getDestination();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
        public Position.IntPosition getOrigin() {
            return ((LoadPlannedDriveOptionsRequest) this.instance).getOrigin();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
        public boolean hasDestination() {
            return ((LoadPlannedDriveOptionsRequest) this.instance).hasDestination();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestOrBuilder
        public boolean hasOrigin() {
            return ((LoadPlannedDriveOptionsRequest) this.instance).hasOrigin();
        }

        public Builder mergeDestination(VenueData venueData) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).mergeDestination(venueData);
            return this;
        }

        public Builder mergeOrigin(Position.IntPosition intPosition) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).mergeOrigin(intPosition);
            return this;
        }

        public Builder setDaysFromNow(int i2) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).setDaysFromNow(i2);
            return this;
        }

        public Builder setDestination(VenueData.Builder builder) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).setDestination(builder.build());
            return this;
        }

        public Builder setOrigin(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).setOrigin(builder.build());
            return this;
        }

        public Builder setDestination(VenueData venueData) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).setDestination(venueData);
            return this;
        }

        public Builder setOrigin(Position.IntPosition intPosition) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsRequest) this.instance).setOrigin(intPosition);
            return this;
        }
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(byte[] bArr) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LoadPlannedDriveOptionsRequest parseFrom(byte[] bArr, de deVar) {
        return (LoadPlannedDriveOptionsRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
