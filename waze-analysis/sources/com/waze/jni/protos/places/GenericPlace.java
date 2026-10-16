package com.waze.jni.protos.places;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.places.EventPlace;
import com.waze.jni.protos.places.FavoritePlace;
import com.waze.jni.protos.places.Place;
import com.waze.jni.protos.places.RecentPlace;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlace extends du<GenericPlace, Builder> implements GenericPlaceOrBuilder {
    private static final GenericPlace DEFAULT_INSTANCE;
    public static final int EVENTPLACE_FIELD_NUMBER = 4;
    public static final int FAVORITEPLACE_FIELD_NUMBER = 2;
    private static volatile fo<GenericPlace> PARSER = null;
    public static final int RECENTPLACE_FIELD_NUMBER = 3;
    public static final int WAZEADDRESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int placeCase_ = 0;
    private Object place_;
    private Place wazeAddress_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.GenericPlace$1, reason: invalid class name */
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
    public enum PlaceCase {
        FAVORITEPLACE(2),
        RECENTPLACE(3),
        EVENTPLACE(4),
        PLACE_NOT_SET(0);

        private final int value;

        PlaceCase(int i2) {
            this.value = i2;
        }

        public static PlaceCase forNumber(int i2) {
            if (i2 == 0) {
                return PLACE_NOT_SET;
            }
            if (i2 == 2) {
                return FAVORITEPLACE;
            }
            if (i2 == 3) {
                return RECENTPLACE;
            }
            if (i2 != 4) {
                return null;
            }
            return EVENTPLACE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        GenericPlace genericPlace = new GenericPlace();
        DEFAULT_INSTANCE = genericPlace;
        du.registerDefaultInstance(GenericPlace.class, genericPlace);
    }

    private GenericPlace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventPlace() {
        if (this.placeCase_ == 4) {
            this.placeCase_ = 0;
            this.place_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoritePlace() {
        if (this.placeCase_ == 2) {
            this.placeCase_ = 0;
            this.place_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        this.placeCase_ = 0;
        this.place_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecentPlace() {
        if (this.placeCase_ == 3) {
            this.placeCase_ = 0;
            this.place_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAddress() {
        this.wazeAddress_ = null;
        this.bitField0_ &= -2;
    }

    public static GenericPlace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventPlace(EventPlace eventPlace) {
        Objects.requireNonNull(eventPlace);
        if (this.placeCase_ == 4 && this.place_ != EventPlace.getDefaultInstance()) {
            EventPlace.Builder builderNewBuilder = EventPlace.newBuilder((EventPlace) this.place_);
            builderNewBuilder.mergeFrom((EventPlace.Builder) eventPlace);
            eventPlace = builderNewBuilder.buildPartial();
        }
        this.place_ = eventPlace;
        this.placeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoritePlace(FavoritePlace favoritePlace) {
        Objects.requireNonNull(favoritePlace);
        if (this.placeCase_ == 2 && this.place_ != FavoritePlace.getDefaultInstance()) {
            FavoritePlace.Builder builderNewBuilder = FavoritePlace.newBuilder((FavoritePlace) this.place_);
            builderNewBuilder.mergeFrom((FavoritePlace.Builder) favoritePlace);
            favoritePlace = builderNewBuilder.buildPartial();
        }
        this.place_ = favoritePlace;
        this.placeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRecentPlace(RecentPlace recentPlace) {
        Objects.requireNonNull(recentPlace);
        if (this.placeCase_ == 3 && this.place_ != RecentPlace.getDefaultInstance()) {
            RecentPlace.Builder builderNewBuilder = RecentPlace.newBuilder((RecentPlace) this.place_);
            builderNewBuilder.mergeFrom((RecentPlace.Builder) recentPlace);
            recentPlace = builderNewBuilder.buildPartial();
        }
        this.place_ = recentPlace;
        this.placeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazeAddress(Place place) {
        Objects.requireNonNull(place);
        Place place2 = this.wazeAddress_;
        if (place2 != null && place2 != Place.getDefaultInstance()) {
            Place.Builder builderNewBuilder = Place.newBuilder(place2);
            builderNewBuilder.mergeFrom((Place.Builder) place);
            place = builderNewBuilder.buildPartial();
        }
        this.wazeAddress_ = place;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenericPlace parseDelimitedFrom(InputStream inputStream) {
        return (GenericPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenericPlace parseFrom(v vVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GenericPlace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventPlace(EventPlace eventPlace) {
        Objects.requireNonNull(eventPlace);
        this.place_ = eventPlace;
        this.placeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoritePlace(FavoritePlace favoritePlace) {
        Objects.requireNonNull(favoritePlace);
        this.place_ = favoritePlace;
        this.placeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecentPlace(RecentPlace recentPlace) {
        Objects.requireNonNull(recentPlace);
        this.place_ = recentPlace;
        this.placeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAddress(Place place) {
        Objects.requireNonNull(place);
        this.wazeAddress_ = place;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"place_", "placeCase_", "bitField0_", "wazeAddress_", FavoritePlace.class, RecentPlace.class, EventPlace.class});
        }
        if (iOrdinal == 3) {
            return new GenericPlace();
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
        fo<GenericPlace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GenericPlace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public EventPlace getEventPlace() {
        return this.placeCase_ == 4 ? (EventPlace) this.place_ : EventPlace.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public FavoritePlace getFavoritePlace() {
        return this.placeCase_ == 2 ? (FavoritePlace) this.place_ : FavoritePlace.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public PlaceCase getPlaceCase() {
        return PlaceCase.forNumber(this.placeCase_);
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public RecentPlace getRecentPlace() {
        return this.placeCase_ == 3 ? (RecentPlace) this.place_ : RecentPlace.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public Place getWazeAddress() {
        Place place = this.wazeAddress_;
        return place == null ? Place.getDefaultInstance() : place;
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public boolean hasEventPlace() {
        return this.placeCase_ == 4;
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public boolean hasFavoritePlace() {
        return this.placeCase_ == 2;
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public boolean hasRecentPlace() {
        return this.placeCase_ == 3;
    }

    @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
    public boolean hasWazeAddress() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(GenericPlace genericPlace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(genericPlace);
    }

    public static GenericPlace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GenericPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenericPlace parseFrom(v vVar, de deVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GenericPlace parseFrom(z zVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GenericPlace parseFrom(z zVar, de deVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static GenericPlace parseFrom(InputStream inputStream) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenericPlace parseFrom(InputStream inputStream, de deVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenericPlace parseFrom(ByteBuffer byteBuffer) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GenericPlace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<GenericPlace, Builder> implements GenericPlaceOrBuilder {
        private Builder() {
            super(GenericPlace.DEFAULT_INSTANCE);
        }

        public Builder clearEventPlace() {
            copyOnWrite();
            ((GenericPlace) this.instance).clearEventPlace();
            return this;
        }

        public Builder clearFavoritePlace() {
            copyOnWrite();
            ((GenericPlace) this.instance).clearFavoritePlace();
            return this;
        }

        public Builder clearPlace() {
            copyOnWrite();
            ((GenericPlace) this.instance).clearPlace();
            return this;
        }

        public Builder clearRecentPlace() {
            copyOnWrite();
            ((GenericPlace) this.instance).clearRecentPlace();
            return this;
        }

        public Builder clearWazeAddress() {
            copyOnWrite();
            ((GenericPlace) this.instance).clearWazeAddress();
            return this;
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public EventPlace getEventPlace() {
            return ((GenericPlace) this.instance).getEventPlace();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public FavoritePlace getFavoritePlace() {
            return ((GenericPlace) this.instance).getFavoritePlace();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public PlaceCase getPlaceCase() {
            return ((GenericPlace) this.instance).getPlaceCase();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public RecentPlace getRecentPlace() {
            return ((GenericPlace) this.instance).getRecentPlace();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public Place getWazeAddress() {
            return ((GenericPlace) this.instance).getWazeAddress();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public boolean hasEventPlace() {
            return ((GenericPlace) this.instance).hasEventPlace();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public boolean hasFavoritePlace() {
            return ((GenericPlace) this.instance).hasFavoritePlace();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public boolean hasRecentPlace() {
            return ((GenericPlace) this.instance).hasRecentPlace();
        }

        @Override // com.waze.jni.protos.places.GenericPlaceOrBuilder
        public boolean hasWazeAddress() {
            return ((GenericPlace) this.instance).hasWazeAddress();
        }

        public Builder mergeEventPlace(EventPlace eventPlace) {
            copyOnWrite();
            ((GenericPlace) this.instance).mergeEventPlace(eventPlace);
            return this;
        }

        public Builder mergeFavoritePlace(FavoritePlace favoritePlace) {
            copyOnWrite();
            ((GenericPlace) this.instance).mergeFavoritePlace(favoritePlace);
            return this;
        }

        public Builder mergeRecentPlace(RecentPlace recentPlace) {
            copyOnWrite();
            ((GenericPlace) this.instance).mergeRecentPlace(recentPlace);
            return this;
        }

        public Builder mergeWazeAddress(Place place) {
            copyOnWrite();
            ((GenericPlace) this.instance).mergeWazeAddress(place);
            return this;
        }

        public Builder setEventPlace(EventPlace.Builder builder) {
            copyOnWrite();
            ((GenericPlace) this.instance).setEventPlace(builder.build());
            return this;
        }

        public Builder setFavoritePlace(FavoritePlace.Builder builder) {
            copyOnWrite();
            ((GenericPlace) this.instance).setFavoritePlace(builder.build());
            return this;
        }

        public Builder setRecentPlace(RecentPlace.Builder builder) {
            copyOnWrite();
            ((GenericPlace) this.instance).setRecentPlace(builder.build());
            return this;
        }

        public Builder setWazeAddress(Place.Builder builder) {
            copyOnWrite();
            ((GenericPlace) this.instance).setWazeAddress(builder.build());
            return this;
        }

        public Builder setEventPlace(EventPlace eventPlace) {
            copyOnWrite();
            ((GenericPlace) this.instance).setEventPlace(eventPlace);
            return this;
        }

        public Builder setFavoritePlace(FavoritePlace favoritePlace) {
            copyOnWrite();
            ((GenericPlace) this.instance).setFavoritePlace(favoritePlace);
            return this;
        }

        public Builder setRecentPlace(RecentPlace recentPlace) {
            copyOnWrite();
            ((GenericPlace) this.instance).setRecentPlace(recentPlace);
            return this;
        }

        public Builder setWazeAddress(Place place) {
            copyOnWrite();
            ((GenericPlace) this.instance).setWazeAddress(place);
            return this;
        }
    }

    public static GenericPlace parseFrom(byte[] bArr) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenericPlace parseFrom(byte[] bArr, de deVar) {
        return (GenericPlace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
