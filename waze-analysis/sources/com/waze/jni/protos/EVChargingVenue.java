package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EVChargingVenue extends du<EVChargingVenue, Builder> implements EVChargingVenueOrBuilder {
    private static final EVChargingVenue DEFAULT_INSTANCE;
    public static final int DIRECTIONS_FIELD_NUMBER = 2;
    public static final int EV_CONNECTOR_OVERVIEWS_FIELD_NUMBER = 1;
    private static volatile fo<EVChargingVenue> PARSER = null;
    public static final int PAYMENT_METHODS_FIELD_NUMBER = 3;
    public static final int RESTRICTED_ACCESS_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean restrictedAccess_;
    private eo<EVConnectorOverview> evConnectorOverviews_ = emptyProtobufList();
    private String directions_ = "";
    private eo<String> paymentMethods_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.EVChargingVenue$1, reason: invalid class name */
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
    public interface EVConnectorOrBuilder extends fj {
        String getTypeId();

        v getTypeIdBytes();

        boolean hasTypeId();
    }

    /* compiled from: WazeSource */
    public interface EVConnectorOverviewOrBuilder extends fj {
        int getAvailableCount();

        int getCount();

        EVConnector getEvConnector();

        float getMaxPowerKw();

        boolean hasAvailableCount();

        boolean hasCount();

        boolean hasEvConnector();

        boolean hasMaxPowerKw();
    }

    static {
        EVChargingVenue eVChargingVenue = new EVChargingVenue();
        DEFAULT_INSTANCE = eVChargingVenue;
        du.registerDefaultInstance(EVChargingVenue.class, eVChargingVenue);
    }

    private EVChargingVenue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvConnectorOverviews(Iterable<? extends EVConnectorOverview> iterable) {
        ensureEvConnectorOverviewsIsMutable();
        c.addAll(iterable, this.evConnectorOverviews_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaymentMethods(Iterable<String> iterable) {
        ensurePaymentMethodsIsMutable();
        c.addAll(iterable, this.paymentMethods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorOverviews(int i2, EVConnectorOverview eVConnectorOverview) {
        Objects.requireNonNull(eVConnectorOverview);
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.add(i2, eVConnectorOverview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentMethods(String str) {
        Objects.requireNonNull(str);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentMethodsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirections() {
        this.bitField0_ &= -2;
        this.directions_ = getDefaultInstance().getDirections();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorOverviews() {
        this.evConnectorOverviews_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaymentMethods() {
        this.paymentMethods_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedAccess() {
        this.bitField0_ &= -3;
        this.restrictedAccess_ = false;
    }

    private void ensureEvConnectorOverviewsIsMutable() {
        eo<EVConnectorOverview> eoVar = this.evConnectorOverviews_;
        if (eoVar.c()) {
            return;
        }
        this.evConnectorOverviews_ = du.mutableCopy(eoVar);
    }

    private void ensurePaymentMethodsIsMutable() {
        eo<String> eoVar = this.paymentMethods_;
        if (eoVar.c()) {
            return;
        }
        this.paymentMethods_ = du.mutableCopy(eoVar);
    }

    public static EVChargingVenue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EVChargingVenue parseDelimitedFrom(InputStream inputStream) {
        return (EVChargingVenue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EVChargingVenue parseFrom(v vVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EVChargingVenue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvConnectorOverviews(int i2) {
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirections(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.directions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.directions_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorOverviews(int i2, EVConnectorOverview eVConnectorOverview) {
        Objects.requireNonNull(eVConnectorOverview);
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.set(i2, eVConnectorOverview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaymentMethods(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedAccess(boolean z) {
        this.bitField0_ |= 2;
        this.restrictedAccess_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ለ\u0000\u0003Ț\u0004ဇ\u0001", new Object[]{"bitField0_", "evConnectorOverviews_", EVConnectorOverview.class, "directions_", "paymentMethods_", "restrictedAccess_"});
        }
        if (iOrdinal == 3) {
            return new EVChargingVenue();
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
        fo<EVChargingVenue> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EVChargingVenue.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public String getDirections() {
        return this.directions_;
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public v getDirectionsBytes() {
        return v.s(this.directions_);
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public EVConnectorOverview getEvConnectorOverviews(int i2) {
        return this.evConnectorOverviews_.get(i2);
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public int getEvConnectorOverviewsCount() {
        return this.evConnectorOverviews_.size();
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public List<EVConnectorOverview> getEvConnectorOverviewsList() {
        return this.evConnectorOverviews_;
    }

    public EVConnectorOverviewOrBuilder getEvConnectorOverviewsOrBuilder(int i2) {
        return this.evConnectorOverviews_.get(i2);
    }

    public List<? extends EVConnectorOverviewOrBuilder> getEvConnectorOverviewsOrBuilderList() {
        return this.evConnectorOverviews_;
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public String getPaymentMethods(int i2) {
        return this.paymentMethods_.get(i2);
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public v getPaymentMethodsBytes(int i2) {
        return v.s(this.paymentMethods_.get(i2));
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public int getPaymentMethodsCount() {
        return this.paymentMethods_.size();
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public List<String> getPaymentMethodsList() {
        return this.paymentMethods_;
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public boolean getRestrictedAccess() {
        return this.restrictedAccess_;
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public boolean hasDirections() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
    public boolean hasRestrictedAccess() {
        return (this.bitField0_ & 2) != 0;
    }

    /* compiled from: WazeSource */
    public final class EVConnector extends du<EVConnector, Builder> implements EVConnectorOrBuilder {
        private static final EVConnector DEFAULT_INSTANCE;
        private static volatile fo<EVConnector> PARSER = null;
        public static final int TYPE_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private String typeId_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<EVConnector, Builder> implements EVConnectorOrBuilder {
            private Builder() {
                super(EVConnector.DEFAULT_INSTANCE);
            }

            public Builder clearTypeId() {
                copyOnWrite();
                ((EVConnector) this.instance).clearTypeId();
                return this;
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOrBuilder
            public String getTypeId() {
                return ((EVConnector) this.instance).getTypeId();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOrBuilder
            public v getTypeIdBytes() {
                return ((EVConnector) this.instance).getTypeIdBytes();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOrBuilder
            public boolean hasTypeId() {
                return ((EVConnector) this.instance).hasTypeId();
            }

            public Builder setTypeId(String str) {
                copyOnWrite();
                ((EVConnector) this.instance).setTypeId(str);
                return this;
            }

            public Builder setTypeIdBytes(v vVar) {
                copyOnWrite();
                ((EVConnector) this.instance).setTypeIdBytes(vVar);
                return this;
            }
        }

        static {
            EVConnector eVConnector = new EVConnector();
            DEFAULT_INSTANCE = eVConnector;
            du.registerDefaultInstance(EVConnector.class, eVConnector);
        }

        private EVConnector() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeId() {
            this.bitField0_ &= -2;
            this.typeId_ = getDefaultInstance().getTypeId();
        }

        public static EVConnector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EVConnector parseDelimitedFrom(InputStream inputStream) {
            return (EVConnector) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EVConnector parseFrom(v vVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<EVConnector> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeId(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.typeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeIdBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.typeId_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "typeId_"});
            }
            if (iOrdinal == 3) {
                return new EVConnector();
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
            fo<EVConnector> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (EVConnector.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOrBuilder
        public String getTypeId() {
            return this.typeId_;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOrBuilder
        public v getTypeIdBytes() {
            return v.s(this.typeId_);
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOrBuilder
        public boolean hasTypeId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(EVConnector eVConnector) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eVConnector);
        }

        public static EVConnector parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (EVConnector) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static EVConnector parseFrom(v vVar, de deVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static EVConnector parseFrom(z zVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static EVConnector parseFrom(z zVar, de deVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static EVConnector parseFrom(InputStream inputStream) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EVConnector parseFrom(InputStream inputStream, de deVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static EVConnector parseFrom(ByteBuffer byteBuffer) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EVConnector parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static EVConnector parseFrom(byte[] bArr) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EVConnector parseFrom(byte[] bArr, de deVar) {
            return (EVConnector) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class EVConnectorOverview extends du<EVConnectorOverview, Builder> implements EVConnectorOverviewOrBuilder {
        public static final int AVAILABLE_COUNT_FIELD_NUMBER = 4;
        public static final int COUNT_FIELD_NUMBER = 2;
        private static final EVConnectorOverview DEFAULT_INSTANCE;
        public static final int EV_CONNECTOR_FIELD_NUMBER = 1;
        public static final int MAX_POWER_KW_FIELD_NUMBER = 3;
        private static volatile fo<EVConnectorOverview> PARSER;
        private int availableCount_;
        private int bitField0_;
        private int count_;
        private EVConnector evConnector_;
        private float maxPowerKw_;

        static {
            EVConnectorOverview eVConnectorOverview = new EVConnectorOverview();
            DEFAULT_INSTANCE = eVConnectorOverview;
            du.registerDefaultInstance(EVConnectorOverview.class, eVConnectorOverview);
        }

        private EVConnectorOverview() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvailableCount() {
            this.bitField0_ &= -9;
            this.availableCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvConnector() {
            this.evConnector_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxPowerKw() {
            this.bitField0_ &= -5;
            this.maxPowerKw_ = 0.0f;
        }

        public static EVConnectorOverview getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEvConnector(EVConnector eVConnector) {
            Objects.requireNonNull(eVConnector);
            EVConnector eVConnector2 = this.evConnector_;
            if (eVConnector2 != null && eVConnector2 != EVConnector.getDefaultInstance()) {
                EVConnector.Builder builderNewBuilder = EVConnector.newBuilder(eVConnector2);
                builderNewBuilder.mergeFrom((EVConnector.Builder) eVConnector);
                eVConnector = builderNewBuilder.buildPartial();
            }
            this.evConnector_ = eVConnector;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EVConnectorOverview parseDelimitedFrom(InputStream inputStream) {
            return (EVConnectorOverview) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EVConnectorOverview parseFrom(v vVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<EVConnectorOverview> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvailableCount(int i2) {
            this.bitField0_ |= 8;
            this.availableCount_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i2) {
            this.bitField0_ |= 2;
            this.count_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvConnector(EVConnector eVConnector) {
            Objects.requireNonNull(eVConnector);
            this.evConnector_ = eVConnector;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxPowerKw(float f2) {
            this.bitField0_ |= 4;
            this.maxPowerKw_ = f2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003", new Object[]{"bitField0_", "evConnector_", "count_", "maxPowerKw_", "availableCount_"});
            }
            if (iOrdinal == 3) {
                return new EVConnectorOverview();
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
            fo<EVConnectorOverview> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (EVConnectorOverview.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public int getAvailableCount() {
            return this.availableCount_;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public EVConnector getEvConnector() {
            EVConnector eVConnector = this.evConnector_;
            return eVConnector == null ? EVConnector.getDefaultInstance() : eVConnector;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public float getMaxPowerKw() {
            return this.maxPowerKw_;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public boolean hasAvailableCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public boolean hasEvConnector() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
        public boolean hasMaxPowerKw() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(EVConnectorOverview eVConnectorOverview) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eVConnectorOverview);
        }

        public static EVConnectorOverview parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (EVConnectorOverview) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static EVConnectorOverview parseFrom(v vVar, de deVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static EVConnectorOverview parseFrom(z zVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static EVConnectorOverview parseFrom(z zVar, de deVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static EVConnectorOverview parseFrom(InputStream inputStream) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EVConnectorOverview parseFrom(InputStream inputStream, de deVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static EVConnectorOverview parseFrom(ByteBuffer byteBuffer) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EVConnectorOverview parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<EVConnectorOverview, Builder> implements EVConnectorOverviewOrBuilder {
            private Builder() {
                super(EVConnectorOverview.DEFAULT_INSTANCE);
            }

            public Builder clearAvailableCount() {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).clearAvailableCount();
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).clearCount();
                return this;
            }

            public Builder clearEvConnector() {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).clearEvConnector();
                return this;
            }

            public Builder clearMaxPowerKw() {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).clearMaxPowerKw();
                return this;
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public int getAvailableCount() {
                return ((EVConnectorOverview) this.instance).getAvailableCount();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public int getCount() {
                return ((EVConnectorOverview) this.instance).getCount();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public EVConnector getEvConnector() {
                return ((EVConnectorOverview) this.instance).getEvConnector();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public float getMaxPowerKw() {
                return ((EVConnectorOverview) this.instance).getMaxPowerKw();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public boolean hasAvailableCount() {
                return ((EVConnectorOverview) this.instance).hasAvailableCount();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public boolean hasCount() {
                return ((EVConnectorOverview) this.instance).hasCount();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public boolean hasEvConnector() {
                return ((EVConnectorOverview) this.instance).hasEvConnector();
            }

            @Override // com.waze.jni.protos.EVChargingVenue.EVConnectorOverviewOrBuilder
            public boolean hasMaxPowerKw() {
                return ((EVConnectorOverview) this.instance).hasMaxPowerKw();
            }

            public Builder mergeEvConnector(EVConnector eVConnector) {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).mergeEvConnector(eVConnector);
                return this;
            }

            public Builder setAvailableCount(int i2) {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).setAvailableCount(i2);
                return this;
            }

            public Builder setCount(int i2) {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).setCount(i2);
                return this;
            }

            public Builder setEvConnector(EVConnector.Builder builder) {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).setEvConnector(builder.build());
                return this;
            }

            public Builder setMaxPowerKw(float f2) {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).setMaxPowerKw(f2);
                return this;
            }

            public Builder setEvConnector(EVConnector eVConnector) {
                copyOnWrite();
                ((EVConnectorOverview) this.instance).setEvConnector(eVConnector);
                return this;
            }
        }

        public static EVConnectorOverview parseFrom(byte[] bArr) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EVConnectorOverview parseFrom(byte[] bArr, de deVar) {
            return (EVConnectorOverview) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(EVChargingVenue eVChargingVenue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eVChargingVenue);
    }

    public static EVChargingVenue parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EVChargingVenue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EVChargingVenue parseFrom(v vVar, de deVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EVChargingVenue parseFrom(z zVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EVChargingVenue parseFrom(z zVar, de deVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorOverviews(EVConnectorOverview eVConnectorOverview) {
        Objects.requireNonNull(eVConnectorOverview);
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.add(eVConnectorOverview);
    }

    public static EVChargingVenue parseFrom(InputStream inputStream) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EVChargingVenue parseFrom(InputStream inputStream, de deVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EVChargingVenue parseFrom(ByteBuffer byteBuffer) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EVChargingVenue parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EVChargingVenue, Builder> implements EVChargingVenueOrBuilder {
        private Builder() {
            super(EVChargingVenue.DEFAULT_INSTANCE);
        }

        public Builder addAllEvConnectorOverviews(Iterable<? extends EVConnectorOverview> iterable) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addAllEvConnectorOverviews(iterable);
            return this;
        }

        public Builder addAllPaymentMethods(Iterable<String> iterable) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addAllPaymentMethods(iterable);
            return this;
        }

        public Builder addEvConnectorOverviews(int i2, EVConnectorOverview.Builder builder) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addEvConnectorOverviews(i2, builder.build());
            return this;
        }

        public Builder addPaymentMethods(String str) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addPaymentMethods(str);
            return this;
        }

        public Builder addPaymentMethodsBytes(v vVar) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addPaymentMethodsBytes(vVar);
            return this;
        }

        public Builder clearDirections() {
            copyOnWrite();
            ((EVChargingVenue) this.instance).clearDirections();
            return this;
        }

        public Builder clearEvConnectorOverviews() {
            copyOnWrite();
            ((EVChargingVenue) this.instance).clearEvConnectorOverviews();
            return this;
        }

        public Builder clearPaymentMethods() {
            copyOnWrite();
            ((EVChargingVenue) this.instance).clearPaymentMethods();
            return this;
        }

        public Builder clearRestrictedAccess() {
            copyOnWrite();
            ((EVChargingVenue) this.instance).clearRestrictedAccess();
            return this;
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public String getDirections() {
            return ((EVChargingVenue) this.instance).getDirections();
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public v getDirectionsBytes() {
            return ((EVChargingVenue) this.instance).getDirectionsBytes();
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public EVConnectorOverview getEvConnectorOverviews(int i2) {
            return ((EVChargingVenue) this.instance).getEvConnectorOverviews(i2);
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public int getEvConnectorOverviewsCount() {
            return ((EVChargingVenue) this.instance).getEvConnectorOverviewsCount();
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public List<EVConnectorOverview> getEvConnectorOverviewsList() {
            return DesugarCollections.unmodifiableList(((EVChargingVenue) this.instance).getEvConnectorOverviewsList());
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public String getPaymentMethods(int i2) {
            return ((EVChargingVenue) this.instance).getPaymentMethods(i2);
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public v getPaymentMethodsBytes(int i2) {
            return ((EVChargingVenue) this.instance).getPaymentMethodsBytes(i2);
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public int getPaymentMethodsCount() {
            return ((EVChargingVenue) this.instance).getPaymentMethodsCount();
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public List<String> getPaymentMethodsList() {
            return DesugarCollections.unmodifiableList(((EVChargingVenue) this.instance).getPaymentMethodsList());
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public boolean getRestrictedAccess() {
            return ((EVChargingVenue) this.instance).getRestrictedAccess();
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public boolean hasDirections() {
            return ((EVChargingVenue) this.instance).hasDirections();
        }

        @Override // com.waze.jni.protos.EVChargingVenueOrBuilder
        public boolean hasRestrictedAccess() {
            return ((EVChargingVenue) this.instance).hasRestrictedAccess();
        }

        public Builder removeEvConnectorOverviews(int i2) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).removeEvConnectorOverviews(i2);
            return this;
        }

        public Builder setDirections(String str) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).setDirections(str);
            return this;
        }

        public Builder setDirectionsBytes(v vVar) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).setDirectionsBytes(vVar);
            return this;
        }

        public Builder setEvConnectorOverviews(int i2, EVConnectorOverview.Builder builder) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).setEvConnectorOverviews(i2, builder.build());
            return this;
        }

        public Builder setPaymentMethods(int i2, String str) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).setPaymentMethods(i2, str);
            return this;
        }

        public Builder setRestrictedAccess(boolean z) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).setRestrictedAccess(z);
            return this;
        }

        public Builder addEvConnectorOverviews(int i2, EVConnectorOverview eVConnectorOverview) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addEvConnectorOverviews(i2, eVConnectorOverview);
            return this;
        }

        public Builder setEvConnectorOverviews(int i2, EVConnectorOverview eVConnectorOverview) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).setEvConnectorOverviews(i2, eVConnectorOverview);
            return this;
        }

        public Builder addEvConnectorOverviews(EVConnectorOverview.Builder builder) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addEvConnectorOverviews(builder.build());
            return this;
        }

        public Builder addEvConnectorOverviews(EVConnectorOverview eVConnectorOverview) {
            copyOnWrite();
            ((EVChargingVenue) this.instance).addEvConnectorOverviews(eVConnectorOverview);
            return this;
        }
    }

    public static EVChargingVenue parseFrom(byte[] bArr) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EVChargingVenue parseFrom(byte[] bArr, de deVar) {
        return (EVChargingVenue) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
