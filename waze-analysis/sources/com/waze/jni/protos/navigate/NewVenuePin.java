package com.waze.jni.protos.navigate;

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
public final class NewVenuePin extends du<NewVenuePin, Builder> implements NewVenuePinOrBuilder {
    private static final NewVenuePin DEFAULT_INSTANCE;
    private static volatile fo<NewVenuePin> PARSER = null;
    public static final int SHOW_INITIAL_POPUP_FIELD_NUMBER = 2;
    public static final int VENUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean showInitialPopup_;
    private VenueData venue_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NewVenuePin$1, reason: invalid class name */
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
        NewVenuePin newVenuePin = new NewVenuePin();
        DEFAULT_INSTANCE = newVenuePin;
        du.registerDefaultInstance(NewVenuePin.class, newVenuePin);
    }

    private NewVenuePin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowInitialPopup() {
        this.showInitialPopup_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -2;
    }

    public static NewVenuePin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(VenueData venueData) {
        Objects.requireNonNull(venueData);
        VenueData venueData2 = this.venue_;
        if (venueData2 != null && venueData2 != VenueData.getDefaultInstance()) {
            VenueData.Builder builderNewBuilder = VenueData.newBuilder(venueData2);
            builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
            venueData = builderNewBuilder.buildPartial();
        }
        this.venue_ = venueData;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NewVenuePin parseDelimitedFrom(InputStream inputStream) {
        return (NewVenuePin) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NewVenuePin parseFrom(v vVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NewVenuePin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowInitialPopup(boolean z) {
        this.showInitialPopup_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.venue_ = venueData;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new Object[]{"bitField0_", "venue_", "showInitialPopup_"});
        }
        if (iOrdinal == 3) {
            return new NewVenuePin();
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
        fo<NewVenuePin> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NewVenuePin.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NewVenuePinOrBuilder
    public boolean getShowInitialPopup() {
        return this.showInitialPopup_;
    }

    @Override // com.waze.jni.protos.navigate.NewVenuePinOrBuilder
    public VenueData getVenue() {
        VenueData venueData = this.venue_;
        return venueData == null ? VenueData.getDefaultInstance() : venueData;
    }

    @Override // com.waze.jni.protos.navigate.NewVenuePinOrBuilder
    public boolean hasVenue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NewVenuePin newVenuePin) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(newVenuePin);
    }

    public static NewVenuePin parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NewVenuePin) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NewVenuePin parseFrom(v vVar, de deVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NewVenuePin parseFrom(z zVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NewVenuePin parseFrom(z zVar, de deVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NewVenuePin parseFrom(InputStream inputStream) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NewVenuePin parseFrom(InputStream inputStream, de deVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NewVenuePin parseFrom(ByteBuffer byteBuffer) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NewVenuePin parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NewVenuePin, Builder> implements NewVenuePinOrBuilder {
        private Builder() {
            super(NewVenuePin.DEFAULT_INSTANCE);
        }

        public Builder clearShowInitialPopup() {
            copyOnWrite();
            ((NewVenuePin) this.instance).clearShowInitialPopup();
            return this;
        }

        public Builder clearVenue() {
            copyOnWrite();
            ((NewVenuePin) this.instance).clearVenue();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NewVenuePinOrBuilder
        public boolean getShowInitialPopup() {
            return ((NewVenuePin) this.instance).getShowInitialPopup();
        }

        @Override // com.waze.jni.protos.navigate.NewVenuePinOrBuilder
        public VenueData getVenue() {
            return ((NewVenuePin) this.instance).getVenue();
        }

        @Override // com.waze.jni.protos.navigate.NewVenuePinOrBuilder
        public boolean hasVenue() {
            return ((NewVenuePin) this.instance).hasVenue();
        }

        public Builder mergeVenue(VenueData venueData) {
            copyOnWrite();
            ((NewVenuePin) this.instance).mergeVenue(venueData);
            return this;
        }

        public Builder setShowInitialPopup(boolean z) {
            copyOnWrite();
            ((NewVenuePin) this.instance).setShowInitialPopup(z);
            return this;
        }

        public Builder setVenue(VenueData.Builder builder) {
            copyOnWrite();
            ((NewVenuePin) this.instance).setVenue(builder.build());
            return this;
        }

        public Builder setVenue(VenueData venueData) {
            copyOnWrite();
            ((NewVenuePin) this.instance).setVenue(venueData);
            return this;
        }
    }

    public static NewVenuePin parseFrom(byte[] bArr) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NewVenuePin parseFrom(byte[] bArr, de deVar) {
        return (NewVenuePin) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
