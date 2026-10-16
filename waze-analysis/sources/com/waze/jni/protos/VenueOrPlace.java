package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Place;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueOrPlace extends du<VenueOrPlace, Builder> implements VenueOrPlaceOrBuilder {
    private static final VenueOrPlace DEFAULT_INSTANCE;
    public static final int FAVORITE_FIELD_NUMBER = 2;
    private static volatile fo<VenueOrPlace> PARSER = null;
    public static final int PLACE_FIELD_NUMBER = 3;
    public static final int VENUE_FIELD_NUMBER = 1;
    private int endpointCase_ = 0;
    private Object endpoint_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.VenueOrPlace$1, reason: invalid class name */
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
    public enum EndpointCase {
        VENUE(1),
        FAVORITE(2),
        PLACE(3),
        ENDPOINT_NOT_SET(0);

        private final int value;

        EndpointCase(int i2) {
            this.value = i2;
        }

        public static EndpointCase forNumber(int i2) {
            if (i2 == 0) {
                return ENDPOINT_NOT_SET;
            }
            if (i2 == 1) {
                return VENUE;
            }
            if (i2 == 2) {
                return FAVORITE;
            }
            if (i2 != 3) {
                return null;
            }
            return PLACE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        VenueOrPlace venueOrPlace = new VenueOrPlace();
        DEFAULT_INSTANCE = venueOrPlace;
        du.registerDefaultInstance(VenueOrPlace.class, venueOrPlace);
    }

    private VenueOrPlace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoint() {
        this.endpointCase_ = 0;
        this.endpoint_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorite() {
        if (this.endpointCase_ == 2) {
            this.endpointCase_ = 0;
            this.endpoint_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        if (this.endpointCase_ == 3) {
            this.endpointCase_ = 0;
            this.endpoint_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        if (this.endpointCase_ == 1) {
            this.endpointCase_ = 0;
            this.endpoint_ = null;
        }
    }

    public static VenueOrPlace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavorite(Favorite favorite) {
        Objects.requireNonNull(favorite);
        if (this.endpointCase_ == 2 && this.endpoint_ != Favorite.getDefaultInstance()) {
            Favorite.Builder builderNewBuilder = Favorite.newBuilder((Favorite) this.endpoint_);
            builderNewBuilder.mergeFrom((Favorite.Builder) favorite);
            favorite = builderNewBuilder.buildPartial();
        }
        this.endpoint_ = favorite;
        this.endpointCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlace(Place place) {
        Objects.requireNonNull(place);
        if (this.endpointCase_ == 3 && this.endpoint_ != Place.getDefaultInstance()) {
            Place.Builder builderNewBuilder = Place.newBuilder((Place) this.endpoint_);
            builderNewBuilder.mergeFrom((Place.Builder) place);
            place = builderNewBuilder.buildPartial();
        }
        this.endpoint_ = place;
        this.endpointCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(VenueData venueData) {
        Objects.requireNonNull(venueData);
        if (this.endpointCase_ == 1 && this.endpoint_ != VenueData.getDefaultInstance()) {
            VenueData.Builder builderNewBuilder = VenueData.newBuilder((VenueData) this.endpoint_);
            builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
            venueData = builderNewBuilder.buildPartial();
        }
        this.endpoint_ = venueData;
        this.endpointCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VenueOrPlace parseDelimitedFrom(InputStream inputStream) {
        return (VenueOrPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueOrPlace parseFrom(v vVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VenueOrPlace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavorite(Favorite favorite) {
        Objects.requireNonNull(favorite);
        this.endpoint_ = favorite;
        this.endpointCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlace(Place place) {
        Objects.requireNonNull(place);
        this.endpoint_ = place;
        this.endpointCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.endpoint_ = venueData;
        this.endpointCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"endpoint_", "endpointCase_", VenueData.class, Favorite.class, Place.class});
        }
        if (iOrdinal == 3) {
            return new VenueOrPlace();
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
        fo<VenueOrPlace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VenueOrPlace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public EndpointCase getEndpointCase() {
        return EndpointCase.forNumber(this.endpointCase_);
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public Favorite getFavorite() {
        return this.endpointCase_ == 2 ? (Favorite) this.endpoint_ : Favorite.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public Place getPlace() {
        return this.endpointCase_ == 3 ? (Place) this.endpoint_ : Place.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public VenueData getVenue() {
        return this.endpointCase_ == 1 ? (VenueData) this.endpoint_ : VenueData.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public boolean hasFavorite() {
        return this.endpointCase_ == 2;
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public boolean hasPlace() {
        return this.endpointCase_ == 3;
    }

    @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
    public boolean hasVenue() {
        return this.endpointCase_ == 1;
    }

    public static Builder newBuilder(VenueOrPlace venueOrPlace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(venueOrPlace);
    }

    public static VenueOrPlace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VenueOrPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueOrPlace parseFrom(v vVar, de deVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VenueOrPlace parseFrom(z zVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VenueOrPlace parseFrom(z zVar, de deVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VenueOrPlace parseFrom(InputStream inputStream) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueOrPlace parseFrom(InputStream inputStream, de deVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueOrPlace parseFrom(ByteBuffer byteBuffer) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VenueOrPlace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<VenueOrPlace, Builder> implements VenueOrPlaceOrBuilder {
        private Builder() {
            super(VenueOrPlace.DEFAULT_INSTANCE);
        }

        public Builder clearEndpoint() {
            copyOnWrite();
            ((VenueOrPlace) this.instance).clearEndpoint();
            return this;
        }

        public Builder clearFavorite() {
            copyOnWrite();
            ((VenueOrPlace) this.instance).clearFavorite();
            return this;
        }

        public Builder clearPlace() {
            copyOnWrite();
            ((VenueOrPlace) this.instance).clearPlace();
            return this;
        }

        public Builder clearVenue() {
            copyOnWrite();
            ((VenueOrPlace) this.instance).clearVenue();
            return this;
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public EndpointCase getEndpointCase() {
            return ((VenueOrPlace) this.instance).getEndpointCase();
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public Favorite getFavorite() {
            return ((VenueOrPlace) this.instance).getFavorite();
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public Place getPlace() {
            return ((VenueOrPlace) this.instance).getPlace();
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public VenueData getVenue() {
            return ((VenueOrPlace) this.instance).getVenue();
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public boolean hasFavorite() {
            return ((VenueOrPlace) this.instance).hasFavorite();
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public boolean hasPlace() {
            return ((VenueOrPlace) this.instance).hasPlace();
        }

        @Override // com.waze.jni.protos.VenueOrPlaceOrBuilder
        public boolean hasVenue() {
            return ((VenueOrPlace) this.instance).hasVenue();
        }

        public Builder mergeFavorite(Favorite favorite) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).mergeFavorite(favorite);
            return this;
        }

        public Builder mergePlace(Place place) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).mergePlace(place);
            return this;
        }

        public Builder mergeVenue(VenueData venueData) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).mergeVenue(venueData);
            return this;
        }

        public Builder setFavorite(Favorite.Builder builder) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).setFavorite(builder.build());
            return this;
        }

        public Builder setPlace(Place.Builder builder) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).setPlace(builder.build());
            return this;
        }

        public Builder setVenue(VenueData.Builder builder) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).setVenue(builder.build());
            return this;
        }

        public Builder setFavorite(Favorite favorite) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).setFavorite(favorite);
            return this;
        }

        public Builder setPlace(Place place) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).setPlace(place);
            return this;
        }

        public Builder setVenue(VenueData venueData) {
            copyOnWrite();
            ((VenueOrPlace) this.instance).setVenue(venueData);
            return this;
        }
    }

    public static VenueOrPlace parseFrom(byte[] bArr) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VenueOrPlace parseFrom(byte[] bArr, de deVar) {
        return (VenueOrPlace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
