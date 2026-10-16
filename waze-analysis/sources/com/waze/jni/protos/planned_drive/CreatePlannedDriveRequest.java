package com.waze.jni.protos.planned_drive;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.VenueData;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CreatePlannedDriveRequest extends du<CreatePlannedDriveRequest, Builder> implements CreatePlannedDriveRequestOrBuilder {
    private static final CreatePlannedDriveRequest DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 1;
    private static volatile fo<CreatePlannedDriveRequest> PARSER = null;
    public static final int START_TIME_SEC_FIELD_NUMBER = 3;
    private int bitField0_;
    private VenueData destination_;
    private VenueData origin_;
    private long startTimeSec_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest$1, reason: invalid class name */
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
        CreatePlannedDriveRequest createPlannedDriveRequest = new CreatePlannedDriveRequest();
        DEFAULT_INSTANCE = createPlannedDriveRequest;
        du.registerDefaultInstance(CreatePlannedDriveRequest.class, createPlannedDriveRequest);
    }

    private CreatePlannedDriveRequest() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeSec() {
        this.startTimeSec_ = 0L;
    }

    public static CreatePlannedDriveRequest getDefaultInstance() {
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
    public void mergeOrigin(VenueData venueData) {
        Objects.requireNonNull(venueData);
        VenueData venueData2 = this.origin_;
        if (venueData2 != null && venueData2 != VenueData.getDefaultInstance()) {
            VenueData.Builder builderNewBuilder = VenueData.newBuilder(venueData2);
            builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
            venueData = builderNewBuilder.buildPartial();
        }
        this.origin_ = venueData;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreatePlannedDriveRequest parseDelimitedFrom(InputStream inputStream) {
        return (CreatePlannedDriveRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreatePlannedDriveRequest parseFrom(v vVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CreatePlannedDriveRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.destination_ = venueData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.origin_ = venueData;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeSec(long j2) {
        this.startTimeSec_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0002", new Object[]{"bitField0_", "origin_", "destination_", "startTimeSec_"});
        }
        if (iOrdinal == 3) {
            return new CreatePlannedDriveRequest();
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
        fo<CreatePlannedDriveRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CreatePlannedDriveRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
    public VenueData getDestination() {
        VenueData venueData = this.destination_;
        return venueData == null ? VenueData.getDefaultInstance() : venueData;
    }

    @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
    public VenueData getOrigin() {
        VenueData venueData = this.origin_;
        return venueData == null ? VenueData.getDefaultInstance() : venueData;
    }

    @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
    public long getStartTimeSec() {
        return this.startTimeSec_;
    }

    @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
    public boolean hasDestination() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
    public boolean hasOrigin() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(CreatePlannedDriveRequest createPlannedDriveRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createPlannedDriveRequest);
    }

    public static CreatePlannedDriveRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CreatePlannedDriveRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CreatePlannedDriveRequest parseFrom(v vVar, de deVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CreatePlannedDriveRequest parseFrom(z zVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CreatePlannedDriveRequest parseFrom(z zVar, de deVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CreatePlannedDriveRequest parseFrom(InputStream inputStream) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreatePlannedDriveRequest parseFrom(InputStream inputStream, de deVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CreatePlannedDriveRequest parseFrom(ByteBuffer byteBuffer) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CreatePlannedDriveRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<CreatePlannedDriveRequest, Builder> implements CreatePlannedDriveRequestOrBuilder {
        private Builder() {
            super(CreatePlannedDriveRequest.DEFAULT_INSTANCE);
        }

        public Builder clearDestination() {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).clearDestination();
            return this;
        }

        public Builder clearOrigin() {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).clearOrigin();
            return this;
        }

        public Builder clearStartTimeSec() {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).clearStartTimeSec();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
        public VenueData getDestination() {
            return ((CreatePlannedDriveRequest) this.instance).getDestination();
        }

        @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
        public VenueData getOrigin() {
            return ((CreatePlannedDriveRequest) this.instance).getOrigin();
        }

        @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
        public long getStartTimeSec() {
            return ((CreatePlannedDriveRequest) this.instance).getStartTimeSec();
        }

        @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
        public boolean hasDestination() {
            return ((CreatePlannedDriveRequest) this.instance).hasDestination();
        }

        @Override // com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestOrBuilder
        public boolean hasOrigin() {
            return ((CreatePlannedDriveRequest) this.instance).hasOrigin();
        }

        public Builder mergeDestination(VenueData venueData) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).mergeDestination(venueData);
            return this;
        }

        public Builder mergeOrigin(VenueData venueData) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).mergeOrigin(venueData);
            return this;
        }

        public Builder setDestination(VenueData.Builder builder) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).setDestination(builder.build());
            return this;
        }

        public Builder setOrigin(VenueData.Builder builder) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).setOrigin(builder.build());
            return this;
        }

        public Builder setStartTimeSec(long j2) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).setStartTimeSec(j2);
            return this;
        }

        public Builder setDestination(VenueData venueData) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).setDestination(venueData);
            return this;
        }

        public Builder setOrigin(VenueData venueData) {
            copyOnWrite();
            ((CreatePlannedDriveRequest) this.instance).setOrigin(venueData);
            return this;
        }
    }

    public static CreatePlannedDriveRequest parseFrom(byte[] bArr) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreatePlannedDriveRequest parseFrom(byte[] bArr, de deVar) {
        return (CreatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
