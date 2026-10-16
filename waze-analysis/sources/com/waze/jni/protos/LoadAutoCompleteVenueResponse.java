package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.places.Place;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadAutoCompleteVenueResponse extends du<LoadAutoCompleteVenueResponse, Builder> implements LoadAutoCompleteVenueResponseOrBuilder {
    private static final LoadAutoCompleteVenueResponse DEFAULT_INSTANCE;
    private static volatile fo<LoadAutoCompleteVenueResponse> PARSER = null;
    public static final int PLACE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Place place_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.LoadAutoCompleteVenueResponse$1, reason: invalid class name */
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
        LoadAutoCompleteVenueResponse loadAutoCompleteVenueResponse = new LoadAutoCompleteVenueResponse();
        DEFAULT_INSTANCE = loadAutoCompleteVenueResponse;
        du.registerDefaultInstance(LoadAutoCompleteVenueResponse.class, loadAutoCompleteVenueResponse);
    }

    private LoadAutoCompleteVenueResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        this.place_ = null;
        this.bitField0_ &= -2;
    }

    public static LoadAutoCompleteVenueResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlace(Place place) {
        Objects.requireNonNull(place);
        Place place2 = this.place_;
        if (place2 != null && place2 != Place.getDefaultInstance()) {
            Place.Builder builderNewBuilder = Place.newBuilder(place2);
            builderNewBuilder.mergeFrom((Place.Builder) place);
            place = builderNewBuilder.buildPartial();
        }
        this.place_ = place;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LoadAutoCompleteVenueResponse parseDelimitedFrom(InputStream inputStream) {
        return (LoadAutoCompleteVenueResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(v vVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LoadAutoCompleteVenueResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlace(Place place) {
        Objects.requireNonNull(place);
        this.place_ = place;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "place_"});
        }
        if (iOrdinal == 3) {
            return new LoadAutoCompleteVenueResponse();
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
        fo<LoadAutoCompleteVenueResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LoadAutoCompleteVenueResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueResponseOrBuilder
    public Place getPlace() {
        Place place = this.place_;
        return place == null ? Place.getDefaultInstance() : place;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueResponseOrBuilder
    public boolean hasPlace() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(LoadAutoCompleteVenueResponse loadAutoCompleteVenueResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(loadAutoCompleteVenueResponse);
    }

    public static LoadAutoCompleteVenueResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LoadAutoCompleteVenueResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(v vVar, de deVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(z zVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(z zVar, de deVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(InputStream inputStream) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(InputStream inputStream, de deVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(ByteBuffer byteBuffer) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<LoadAutoCompleteVenueResponse, Builder> implements LoadAutoCompleteVenueResponseOrBuilder {
        private Builder() {
            super(LoadAutoCompleteVenueResponse.DEFAULT_INSTANCE);
        }

        public Builder clearPlace() {
            copyOnWrite();
            ((LoadAutoCompleteVenueResponse) this.instance).clearPlace();
            return this;
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueResponseOrBuilder
        public Place getPlace() {
            return ((LoadAutoCompleteVenueResponse) this.instance).getPlace();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueResponseOrBuilder
        public boolean hasPlace() {
            return ((LoadAutoCompleteVenueResponse) this.instance).hasPlace();
        }

        public Builder mergePlace(Place place) {
            copyOnWrite();
            ((LoadAutoCompleteVenueResponse) this.instance).mergePlace(place);
            return this;
        }

        public Builder setPlace(Place.Builder builder) {
            copyOnWrite();
            ((LoadAutoCompleteVenueResponse) this.instance).setPlace(builder.build());
            return this;
        }

        public Builder setPlace(Place place) {
            copyOnWrite();
            ((LoadAutoCompleteVenueResponse) this.instance).setPlace(place);
            return this;
        }
    }

    public static LoadAutoCompleteVenueResponse parseFrom(byte[] bArr) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LoadAutoCompleteVenueResponse parseFrom(byte[] bArr, de deVar) {
        return (LoadAutoCompleteVenueResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
