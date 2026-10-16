package com.waze.jni.protos.places;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eb;
import com.google.v.ec;
import com.google.v.fo;
import com.google.v.n;
import com.google.v.o;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Address;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Place extends du<Place, Builder> implements PlaceOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 3;
    public static final int CREATED_TIME_SEC_FIELD_NUMBER = 10;
    public static final int DB_ID_FIELD_NUMBER = 8;
    private static final Place DEFAULT_INSTANCE;
    public static final int INTERNAL_ID_FIELD_NUMBER = 7;
    public static final int IS_RESIDENTIAL_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<Place> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 5;
    public static final int UPDATED_TIME_SEC_FIELD_NUMBER = 11;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 6;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    private Address address_;
    private int bitField0_;
    private long createdTimeSec_;
    private ec dbId_;
    private o isResidential_;
    private Position.IntPosition position_;
    private long updatedTimeSec_;
    private String name_ = "";
    private String venueId_ = "";
    private String routingContext_ = "";
    private String venueContext_ = "";
    private String internalId_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.Place$1, reason: invalid class name */
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
        Place place = new Place();
        DEFAULT_INSTANCE = place;
        du.registerDefaultInstance(Place.class, place);
    }

    private Place() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedTimeSec() {
        this.createdTimeSec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDbId() {
        this.dbId_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalId() {
        this.internalId_ = getDefaultInstance().getInternalId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsResidential() {
        this.isResidential_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedTimeSec() {
        this.updatedTimeSec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static Place getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddress(Address address) {
        Objects.requireNonNull(address);
        Address address2 = this.address_;
        if (address2 != null && address2 != Address.getDefaultInstance()) {
            Address.Builder builderNewBuilder = Address.newBuilder(address2);
            builderNewBuilder.mergeFrom((Address.Builder) address);
            address = builderNewBuilder.buildPartial();
        }
        this.address_ = address;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDbId(ec ecVar) {
        Objects.requireNonNull(ecVar);
        ec ecVar2 = this.dbId_;
        if (ecVar2 != null && ecVar2 != ec.getDefaultInstance()) {
            eb ebVarNewBuilder = ec.newBuilder(ecVar2);
            ebVarNewBuilder.mergeFrom((eb) ecVar);
            ecVar = ebVarNewBuilder.buildPartial();
        }
        this.dbId_ = ecVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIsResidential(o oVar) {
        Objects.requireNonNull(oVar);
        o oVar2 = this.isResidential_;
        if (oVar2 != null && oVar2 != o.getDefaultInstance()) {
            n nVarNewBuilder = o.newBuilder(oVar2);
            nVarNewBuilder.mergeFrom((n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.isResidential_ = oVar;
        this.bitField0_ |= 8;
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

    public static Place parseDelimitedFrom(InputStream inputStream) {
        return (Place) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Place parseFrom(v vVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Place> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(Address address) {
        Objects.requireNonNull(address);
        this.address_ = address;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedTimeSec(long j2) {
        this.createdTimeSec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDbId(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.dbId_ = ecVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalId(String str) {
        Objects.requireNonNull(str);
        this.internalId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.internalId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsResidential(o oVar) {
        Objects.requireNonNull(oVar);
        this.isResidential_ = oVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routingContext_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedTimeSec(long j2) {
        this.updatedTimeSec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueContext_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0002\tဉ\u0003\n\u0002\u000b\u0002", new Object[]{"bitField0_", "name_", "position_", "address_", "venueId_", "routingContext_", "venueContext_", "internalId_", "dbId_", "isResidential_", "createdTimeSec_", "updatedTimeSec_"});
        }
        if (iOrdinal == 3) {
            return new Place();
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
        fo<Place> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Place.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public Address getAddress() {
        Address address = this.address_;
        return address == null ? Address.getDefaultInstance() : address;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public long getCreatedTimeSec() {
        return this.createdTimeSec_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public ec getDbId() {
        ec ecVar = this.dbId_;
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public String getInternalId() {
        return this.internalId_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public v getInternalIdBytes() {
        return v.s(this.internalId_);
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public o getIsResidential() {
        o oVar = this.isResidential_;
        return oVar == null ? o.getDefaultInstance() : oVar;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public String getRoutingContext() {
        return this.routingContext_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public v getRoutingContextBytes() {
        return v.s(this.routingContext_);
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public long getUpdatedTimeSec() {
        return this.updatedTimeSec_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public String getVenueContext() {
        return this.venueContext_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public v getVenueContextBytes() {
        return v.s(this.venueContext_);
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public String getVenueId() {
        return this.venueId_;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public v getVenueIdBytes() {
        return v.s(this.venueId_);
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public boolean hasAddress() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public boolean hasDbId() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public boolean hasIsResidential() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.places.PlaceOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Place place) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(place);
    }

    public static Place parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Place) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Place parseFrom(v vVar, de deVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Place parseFrom(z zVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Place parseFrom(z zVar, de deVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Place parseFrom(InputStream inputStream) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Place parseFrom(InputStream inputStream, de deVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Place parseFrom(ByteBuffer byteBuffer) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Place parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Place, Builder> implements PlaceOrBuilder {
        private Builder() {
            super(Place.DEFAULT_INSTANCE);
        }

        public Builder clearAddress() {
            copyOnWrite();
            ((Place) this.instance).clearAddress();
            return this;
        }

        public Builder clearCreatedTimeSec() {
            copyOnWrite();
            ((Place) this.instance).clearCreatedTimeSec();
            return this;
        }

        public Builder clearDbId() {
            copyOnWrite();
            ((Place) this.instance).clearDbId();
            return this;
        }

        public Builder clearInternalId() {
            copyOnWrite();
            ((Place) this.instance).clearInternalId();
            return this;
        }

        public Builder clearIsResidential() {
            copyOnWrite();
            ((Place) this.instance).clearIsResidential();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Place) this.instance).clearName();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((Place) this.instance).clearPosition();
            return this;
        }

        public Builder clearRoutingContext() {
            copyOnWrite();
            ((Place) this.instance).clearRoutingContext();
            return this;
        }

        public Builder clearUpdatedTimeSec() {
            copyOnWrite();
            ((Place) this.instance).clearUpdatedTimeSec();
            return this;
        }

        public Builder clearVenueContext() {
            copyOnWrite();
            ((Place) this.instance).clearVenueContext();
            return this;
        }

        public Builder clearVenueId() {
            copyOnWrite();
            ((Place) this.instance).clearVenueId();
            return this;
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public Address getAddress() {
            return ((Place) this.instance).getAddress();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public long getCreatedTimeSec() {
            return ((Place) this.instance).getCreatedTimeSec();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public ec getDbId() {
            return ((Place) this.instance).getDbId();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public String getInternalId() {
            return ((Place) this.instance).getInternalId();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public v getInternalIdBytes() {
            return ((Place) this.instance).getInternalIdBytes();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public o getIsResidential() {
            return ((Place) this.instance).getIsResidential();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public String getName() {
            return ((Place) this.instance).getName();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public v getNameBytes() {
            return ((Place) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public Position.IntPosition getPosition() {
            return ((Place) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public String getRoutingContext() {
            return ((Place) this.instance).getRoutingContext();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public v getRoutingContextBytes() {
            return ((Place) this.instance).getRoutingContextBytes();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public long getUpdatedTimeSec() {
            return ((Place) this.instance).getUpdatedTimeSec();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public String getVenueContext() {
            return ((Place) this.instance).getVenueContext();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public v getVenueContextBytes() {
            return ((Place) this.instance).getVenueContextBytes();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public String getVenueId() {
            return ((Place) this.instance).getVenueId();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public v getVenueIdBytes() {
            return ((Place) this.instance).getVenueIdBytes();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public boolean hasAddress() {
            return ((Place) this.instance).hasAddress();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public boolean hasDbId() {
            return ((Place) this.instance).hasDbId();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public boolean hasIsResidential() {
            return ((Place) this.instance).hasIsResidential();
        }

        @Override // com.waze.jni.protos.places.PlaceOrBuilder
        public boolean hasPosition() {
            return ((Place) this.instance).hasPosition();
        }

        public Builder mergeAddress(Address address) {
            copyOnWrite();
            ((Place) this.instance).mergeAddress(address);
            return this;
        }

        public Builder mergeDbId(ec ecVar) {
            copyOnWrite();
            ((Place) this.instance).mergeDbId(ecVar);
            return this;
        }

        public Builder mergeIsResidential(o oVar) {
            copyOnWrite();
            ((Place) this.instance).mergeIsResidential(oVar);
            return this;
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((Place) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAddress(Address.Builder builder) {
            copyOnWrite();
            ((Place) this.instance).setAddress(builder.build());
            return this;
        }

        public Builder setCreatedTimeSec(long j2) {
            copyOnWrite();
            ((Place) this.instance).setCreatedTimeSec(j2);
            return this;
        }

        public Builder setDbId(eb ebVar) {
            copyOnWrite();
            ((Place) this.instance).setDbId(ebVar.build());
            return this;
        }

        public Builder setInternalId(String str) {
            copyOnWrite();
            ((Place) this.instance).setInternalId(str);
            return this;
        }

        public Builder setInternalIdBytes(v vVar) {
            copyOnWrite();
            ((Place) this.instance).setInternalIdBytes(vVar);
            return this;
        }

        public Builder setIsResidential(n nVar) {
            copyOnWrite();
            ((Place) this.instance).setIsResidential(nVar.build());
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Place) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((Place) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((Place) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setRoutingContext(String str) {
            copyOnWrite();
            ((Place) this.instance).setRoutingContext(str);
            return this;
        }

        public Builder setRoutingContextBytes(v vVar) {
            copyOnWrite();
            ((Place) this.instance).setRoutingContextBytes(vVar);
            return this;
        }

        public Builder setUpdatedTimeSec(long j2) {
            copyOnWrite();
            ((Place) this.instance).setUpdatedTimeSec(j2);
            return this;
        }

        public Builder setVenueContext(String str) {
            copyOnWrite();
            ((Place) this.instance).setVenueContext(str);
            return this;
        }

        public Builder setVenueContextBytes(v vVar) {
            copyOnWrite();
            ((Place) this.instance).setVenueContextBytes(vVar);
            return this;
        }

        public Builder setVenueId(String str) {
            copyOnWrite();
            ((Place) this.instance).setVenueId(str);
            return this;
        }

        public Builder setVenueIdBytes(v vVar) {
            copyOnWrite();
            ((Place) this.instance).setVenueIdBytes(vVar);
            return this;
        }

        public Builder setAddress(Address address) {
            copyOnWrite();
            ((Place) this.instance).setAddress(address);
            return this;
        }

        public Builder setDbId(ec ecVar) {
            copyOnWrite();
            ((Place) this.instance).setDbId(ecVar);
            return this;
        }

        public Builder setIsResidential(o oVar) {
            copyOnWrite();
            ((Place) this.instance).setIsResidential(oVar);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((Place) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static Place parseFrom(byte[] bArr) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Place parseFrom(byte[] bArr, de deVar) {
        return (Place) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
