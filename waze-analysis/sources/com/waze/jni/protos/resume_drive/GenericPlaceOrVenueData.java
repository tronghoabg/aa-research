package com.waze.jni.protos.resume_drive;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.GenericPlace;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlaceOrVenueData extends du<GenericPlaceOrVenueData, Builder> implements GenericPlaceOrVenueDataOrBuilder {
    private static final GenericPlaceOrVenueData DEFAULT_INSTANCE;
    private static volatile fo<GenericPlaceOrVenueData> PARSER = null;
    public static final int PLACE_FIELD_NUMBER = 1;
    public static final int VENUE_FIELD_NUMBER = 2;
    private int destinationCase_ = 0;
    private Object destination_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.resume_drive.GenericPlaceOrVenueData$1, reason: invalid class name */
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
    public enum DestinationCase {
        PLACE(1),
        VENUE(2),
        DESTINATION_NOT_SET(0);

        private final int value;

        DestinationCase(int i2) {
            this.value = i2;
        }

        public static DestinationCase forNumber(int i2) {
            if (i2 == 0) {
                return DESTINATION_NOT_SET;
            }
            if (i2 == 1) {
                return PLACE;
            }
            if (i2 != 2) {
                return null;
            }
            return VENUE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        GenericPlaceOrVenueData genericPlaceOrVenueData = new GenericPlaceOrVenueData();
        DEFAULT_INSTANCE = genericPlaceOrVenueData;
        du.registerDefaultInstance(GenericPlaceOrVenueData.class, genericPlaceOrVenueData);
    }

    private GenericPlaceOrVenueData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destinationCase_ = 0;
        this.destination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        if (this.destinationCase_ == 1) {
            this.destinationCase_ = 0;
            this.destination_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        if (this.destinationCase_ == 2) {
            this.destinationCase_ = 0;
            this.destination_ = null;
        }
    }

    public static GenericPlaceOrVenueData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlace(GenericPlace genericPlace) {
        Objects.requireNonNull(genericPlace);
        if (this.destinationCase_ == 1 && this.destination_ != GenericPlace.getDefaultInstance()) {
            GenericPlace.Builder builderNewBuilder = GenericPlace.newBuilder((GenericPlace) this.destination_);
            builderNewBuilder.mergeFrom((GenericPlace.Builder) genericPlace);
            genericPlace = builderNewBuilder.buildPartial();
        }
        this.destination_ = genericPlace;
        this.destinationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(VenueData venueData) {
        Objects.requireNonNull(venueData);
        if (this.destinationCase_ == 2 && this.destination_ != VenueData.getDefaultInstance()) {
            VenueData.Builder builderNewBuilder = VenueData.newBuilder((VenueData) this.destination_);
            builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
            venueData = builderNewBuilder.buildPartial();
        }
        this.destination_ = venueData;
        this.destinationCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenericPlaceOrVenueData parseDelimitedFrom(InputStream inputStream) {
        return (GenericPlaceOrVenueData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenericPlaceOrVenueData parseFrom(v vVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GenericPlaceOrVenueData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlace(GenericPlace genericPlace) {
        Objects.requireNonNull(genericPlace);
        this.destination_ = genericPlace;
        this.destinationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.destination_ = venueData;
        this.destinationCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"destination_", "destinationCase_", GenericPlace.class, VenueData.class});
        }
        if (iOrdinal == 3) {
            return new GenericPlaceOrVenueData();
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
        fo<GenericPlaceOrVenueData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GenericPlaceOrVenueData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
    public DestinationCase getDestinationCase() {
        return DestinationCase.forNumber(this.destinationCase_);
    }

    @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
    public GenericPlace getPlace() {
        return this.destinationCase_ == 1 ? (GenericPlace) this.destination_ : GenericPlace.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
    public VenueData getVenue() {
        return this.destinationCase_ == 2 ? (VenueData) this.destination_ : VenueData.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
    public boolean hasPlace() {
        return this.destinationCase_ == 1;
    }

    @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
    public boolean hasVenue() {
        return this.destinationCase_ == 2;
    }

    public static Builder newBuilder(GenericPlaceOrVenueData genericPlaceOrVenueData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(genericPlaceOrVenueData);
    }

    public static GenericPlaceOrVenueData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GenericPlaceOrVenueData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenericPlaceOrVenueData parseFrom(v vVar, de deVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GenericPlaceOrVenueData parseFrom(z zVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GenericPlaceOrVenueData parseFrom(z zVar, de deVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static GenericPlaceOrVenueData parseFrom(InputStream inputStream) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenericPlaceOrVenueData parseFrom(InputStream inputStream, de deVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenericPlaceOrVenueData parseFrom(ByteBuffer byteBuffer) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GenericPlaceOrVenueData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<GenericPlaceOrVenueData, Builder> implements GenericPlaceOrVenueDataOrBuilder {
        private Builder() {
            super(GenericPlaceOrVenueData.DEFAULT_INSTANCE);
        }

        public Builder clearDestination() {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).clearDestination();
            return this;
        }

        public Builder clearPlace() {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).clearPlace();
            return this;
        }

        public Builder clearVenue() {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).clearVenue();
            return this;
        }

        @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
        public DestinationCase getDestinationCase() {
            return ((GenericPlaceOrVenueData) this.instance).getDestinationCase();
        }

        @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
        public GenericPlace getPlace() {
            return ((GenericPlaceOrVenueData) this.instance).getPlace();
        }

        @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
        public VenueData getVenue() {
            return ((GenericPlaceOrVenueData) this.instance).getVenue();
        }

        @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
        public boolean hasPlace() {
            return ((GenericPlaceOrVenueData) this.instance).hasPlace();
        }

        @Override // com.waze.jni.protos.resume_drive.GenericPlaceOrVenueDataOrBuilder
        public boolean hasVenue() {
            return ((GenericPlaceOrVenueData) this.instance).hasVenue();
        }

        public Builder mergePlace(GenericPlace genericPlace) {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).mergePlace(genericPlace);
            return this;
        }

        public Builder mergeVenue(VenueData venueData) {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).mergeVenue(venueData);
            return this;
        }

        public Builder setPlace(GenericPlace.Builder builder) {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).setPlace(builder.build());
            return this;
        }

        public Builder setVenue(VenueData.Builder builder) {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).setVenue(builder.build());
            return this;
        }

        public Builder setPlace(GenericPlace genericPlace) {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).setPlace(genericPlace);
            return this;
        }

        public Builder setVenue(VenueData venueData) {
            copyOnWrite();
            ((GenericPlaceOrVenueData) this.instance).setVenue(venueData);
            return this;
        }
    }

    public static GenericPlaceOrVenueData parseFrom(byte[] bArr) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenericPlaceOrVenueData parseFrom(byte[] bArr, de deVar) {
        return (GenericPlaceOrVenueData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
