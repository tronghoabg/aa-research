package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class oc extends com.google.v.du<oc, oa> implements com.google.v.fj {
    public static final int AXLE_COUNT_FIELD_NUMBER = 8;
    private static final oc DEFAULT_INSTANCE;
    public static final int HAS_TRAILER_FIELD_NUMBER = 2;
    public static final int HAZARDOUS_GOODS_FIELD_NUMBER = 9;
    public static final int NUM_TRAILERS_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<oc> PARSER = null;
    public static final int TOLL_PASS_FIELD_NUMBER = 12;
    public static final int TRAILER_LENGTH_FIELD_NUMBER = 6;
    public static final int VEHICLE_EMISSIONS_CATEGORY_FIELD_NUMBER = 11;
    public static final int VEHICLE_HEIGHT_FIELD_NUMBER = 3;
    public static final int VEHICLE_LENGTH_FIELD_NUMBER = 5;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 10;
    public static final int VEHICLE_WEIGHT_FIELD_NUMBER = 1;
    public static final int VEHICLE_WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasTrailer_;
    private int hazardousGoodsMemoizedSerializedSize;
    private int tollPassMemoizedSerializedSize;
    private int vehicleEmissionsCategoryMemoizedSerializedSize;
    private int vehicleTypeMemoizedSerializedSize;
    private static final com.google.v.el<og> vehicleType_converter_ = new fn(14);
    private static final com.google.v.el<ob> hazardousGoods_converter_ = new fn(15);
    private static final com.google.v.el<od> vehicleEmissionsCategory_converter_ = new fn(16);
    private static final com.google.v.el<mm> tollPass_converter_ = new fn(17);
    private com.google.v.ek vehicleType_ = emptyIntList();
    private com.google.v.eo<ol> vehicleWeight_ = emptyProtobufList();
    private com.google.v.eo<cl> vehicleHeight_ = emptyProtobufList();
    private com.google.v.eo<cl> vehicleWidth_ = emptyProtobufList();
    private com.google.v.eo<cl> vehicleLength_ = emptyProtobufList();
    private com.google.v.eo<cl> trailerLength_ = emptyProtobufList();
    private com.google.v.eo<bm> numTrailers_ = emptyProtobufList();
    private com.google.v.eo<bm> axleCount_ = emptyProtobufList();
    private com.google.v.ek hazardousGoods_ = emptyIntList();
    private com.google.v.ek vehicleEmissionsCategory_ = emptyIntList();
    private com.google.v.ek tollPass_ = emptyIntList();

    static {
        oc ocVar = new oc();
        DEFAULT_INSTANCE = ocVar;
        com.google.v.du.registerDefaultInstance(oc.class, ocVar);
    }

    private oc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAxleCount(Iterable<? extends bm> iterable) {
        ensureAxleCountIsMutable();
        com.google.v.c.addAll(iterable, this.axleCount_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHazardousGoods(Iterable<? extends ob> iterable) {
        ensureHazardousGoodsIsMutable();
        Iterator<? extends ob> it = iterable.iterator();
        while (it.hasNext()) {
            this.hazardousGoods_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNumTrailers(Iterable<? extends bm> iterable) {
        ensureNumTrailersIsMutable();
        com.google.v.c.addAll(iterable, this.numTrailers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTollPass(Iterable<? extends mm> iterable) {
        ensureTollPassIsMutable();
        Iterator<? extends mm> it = iterable.iterator();
        while (it.hasNext()) {
            this.tollPass_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrailerLength(Iterable<? extends cl> iterable) {
        ensureTrailerLengthIsMutable();
        com.google.v.c.addAll(iterable, this.trailerLength_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleEmissionsCategory(Iterable<? extends od> iterable) {
        ensureVehicleEmissionsCategoryIsMutable();
        Iterator<? extends od> it = iterable.iterator();
        while (it.hasNext()) {
            this.vehicleEmissionsCategory_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleHeight(Iterable<? extends cl> iterable) {
        ensureVehicleHeightIsMutable();
        com.google.v.c.addAll(iterable, this.vehicleHeight_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleLength(Iterable<? extends cl> iterable) {
        ensureVehicleLengthIsMutable();
        com.google.v.c.addAll(iterable, this.vehicleLength_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleType(Iterable<? extends og> iterable) {
        ensureVehicleTypeIsMutable();
        Iterator<? extends og> it = iterable.iterator();
        while (it.hasNext()) {
            this.vehicleType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleWeight(Iterable<? extends ol> iterable) {
        ensureVehicleWeightIsMutable();
        com.google.v.c.addAll(iterable, this.vehicleWeight_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleWidth(Iterable<? extends cl> iterable) {
        ensureVehicleWidthIsMutable();
        com.google.v.c.addAll(iterable, this.vehicleWidth_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAxleCount(int i2, bm bmVar) {
        Objects.requireNonNull(bmVar);
        ensureAxleCountIsMutable();
        this.axleCount_.add(i2, bmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHazardousGoods(ob obVar) {
        Objects.requireNonNull(obVar);
        ensureHazardousGoodsIsMutable();
        this.hazardousGoods_.i(obVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumTrailers(int i2, bm bmVar) {
        Objects.requireNonNull(bmVar);
        ensureNumTrailersIsMutable();
        this.numTrailers_.add(i2, bmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTollPass(mm mmVar) {
        Objects.requireNonNull(mmVar);
        ensureTollPassIsMutable();
        this.tollPass_.i(mmVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrailerLength(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureTrailerLengthIsMutable();
        this.trailerLength_.add(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleEmissionsCategory(od odVar) {
        Objects.requireNonNull(odVar);
        ensureVehicleEmissionsCategoryIsMutable();
        this.vehicleEmissionsCategory_.i(odVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleHeight(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleHeightIsMutable();
        this.vehicleHeight_.add(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleLength(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleLengthIsMutable();
        this.vehicleLength_.add(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleType(og ogVar) {
        Objects.requireNonNull(ogVar);
        ensureVehicleTypeIsMutable();
        this.vehicleType_.i(ogVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleWeight(int i2, ol olVar) {
        Objects.requireNonNull(olVar);
        ensureVehicleWeightIsMutable();
        this.vehicleWeight_.add(i2, olVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleWidth(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleWidthIsMutable();
        this.vehicleWidth_.add(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAxleCount() {
        this.axleCount_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasTrailer() {
        this.bitField0_ &= -2;
        this.hasTrailer_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardousGoods() {
        this.hazardousGoods_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTrailers() {
        this.numTrailers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPass() {
        this.tollPass_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrailerLength() {
        this.trailerLength_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleEmissionsCategory() {
        this.vehicleEmissionsCategory_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleHeight() {
        this.vehicleHeight_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleLength() {
        this.vehicleLength_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.vehicleType_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleWeight() {
        this.vehicleWeight_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleWidth() {
        this.vehicleWidth_ = emptyProtobufList();
    }

    private void ensureAxleCountIsMutable() {
        com.google.v.eo<bm> eoVar = this.axleCount_;
        if (eoVar.c()) {
            return;
        }
        this.axleCount_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureHazardousGoodsIsMutable() {
        com.google.v.ek ekVar = this.hazardousGoods_;
        if (ekVar.c()) {
            return;
        }
        this.hazardousGoods_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureNumTrailersIsMutable() {
        com.google.v.eo<bm> eoVar = this.numTrailers_;
        if (eoVar.c()) {
            return;
        }
        this.numTrailers_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTollPassIsMutable() {
        com.google.v.ek ekVar = this.tollPass_;
        if (ekVar.c()) {
            return;
        }
        this.tollPass_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureTrailerLengthIsMutable() {
        com.google.v.eo<cl> eoVar = this.trailerLength_;
        if (eoVar.c()) {
            return;
        }
        this.trailerLength_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureVehicleEmissionsCategoryIsMutable() {
        com.google.v.ek ekVar = this.vehicleEmissionsCategory_;
        if (ekVar.c()) {
            return;
        }
        this.vehicleEmissionsCategory_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureVehicleHeightIsMutable() {
        com.google.v.eo<cl> eoVar = this.vehicleHeight_;
        if (eoVar.c()) {
            return;
        }
        this.vehicleHeight_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureVehicleLengthIsMutable() {
        com.google.v.eo<cl> eoVar = this.vehicleLength_;
        if (eoVar.c()) {
            return;
        }
        this.vehicleLength_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureVehicleTypeIsMutable() {
        com.google.v.ek ekVar = this.vehicleType_;
        if (ekVar.c()) {
            return;
        }
        this.vehicleType_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureVehicleWeightIsMutable() {
        com.google.v.eo<ol> eoVar = this.vehicleWeight_;
        if (eoVar.c()) {
            return;
        }
        this.vehicleWeight_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureVehicleWidthIsMutable() {
        com.google.v.eo<cl> eoVar = this.vehicleWidth_;
        if (eoVar.c()) {
            return;
        }
        this.vehicleWidth_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static oc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oa newBuilder() {
        return (oa) DEFAULT_INSTANCE.createBuilder();
    }

    public static oc parseDelimitedFrom(InputStream inputStream) {
        return (oc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oc parseFrom(com.google.v.v vVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAxleCount(int i2) {
        ensureAxleCountIsMutable();
        this.axleCount_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNumTrailers(int i2) {
        ensureNumTrailersIsMutable();
        this.numTrailers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrailerLength(int i2) {
        ensureTrailerLengthIsMutable();
        this.trailerLength_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVehicleHeight(int i2) {
        ensureVehicleHeightIsMutable();
        this.vehicleHeight_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVehicleLength(int i2) {
        ensureVehicleLengthIsMutable();
        this.vehicleLength_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVehicleWeight(int i2) {
        ensureVehicleWeightIsMutable();
        this.vehicleWeight_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVehicleWidth(int i2) {
        ensureVehicleWidthIsMutable();
        this.vehicleWidth_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAxleCount(int i2, bm bmVar) {
        Objects.requireNonNull(bmVar);
        ensureAxleCountIsMutable();
        this.axleCount_.set(i2, bmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasTrailer(boolean z) {
        this.bitField0_ |= 1;
        this.hasTrailer_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardousGoods(int i2, ob obVar) {
        Objects.requireNonNull(obVar);
        ensureHazardousGoodsIsMutable();
        this.hazardousGoods_.e(i2, obVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTrailers(int i2, bm bmVar) {
        Objects.requireNonNull(bmVar);
        ensureNumTrailersIsMutable();
        this.numTrailers_.set(i2, bmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPass(int i2, mm mmVar) {
        Objects.requireNonNull(mmVar);
        ensureTollPassIsMutable();
        this.tollPass_.e(i2, mmVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerLength(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureTrailerLengthIsMutable();
        this.trailerLength_.set(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleEmissionsCategory(int i2, od odVar) {
        Objects.requireNonNull(odVar);
        ensureVehicleEmissionsCategoryIsMutable();
        this.vehicleEmissionsCategory_.e(i2, odVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleHeight(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleHeightIsMutable();
        this.vehicleHeight_.set(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleLength(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleLengthIsMutable();
        this.vehicleLength_.set(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(int i2, og ogVar) {
        Objects.requireNonNull(ogVar);
        ensureVehicleTypeIsMutable();
        this.vehicleType_.e(i2, ogVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleWeight(int i2, ol olVar) {
        Objects.requireNonNull(olVar);
        ensureVehicleWeightIsMutable();
        this.vehicleWeight_.set(i2, olVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleWidth(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleWidthIsMutable();
        this.vehicleWidth_.set(i2, clVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u000b\u0000\u0001\u001b\u0002ဇ\u0000\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tࠬ\nࠬ\u000bࠬ\fࠬ", new Object[]{"bitField0_", "vehicleWeight_", ol.class, "hasTrailer_", "vehicleHeight_", cl.class, "vehicleWidth_", cl.class, "vehicleLength_", cl.class, "trailerLength_", cl.class, "numTrailers_", bm.class, "axleCount_", bm.class, "hazardousGoods_", lq.f12093f, "vehicleType_", lq.f12095h, "vehicleEmissionsCategory_", lq.f12094g, "tollPass_", lq.f12090c});
        }
        if (iOrdinal == 3) {
            return new oc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bm getAxleCount(int i2) {
        return this.axleCount_.get(i2);
    }

    public int getAxleCountCount() {
        return this.axleCount_.size();
    }

    public List<bm> getAxleCountList() {
        return this.axleCount_;
    }

    public bn getAxleCountOrBuilder(int i2) {
        return this.axleCount_.get(i2);
    }

    public List<? extends bn> getAxleCountOrBuilderList() {
        return this.axleCount_;
    }

    public boolean getHasTrailer() {
        return this.hasTrailer_;
    }

    public ob getHazardousGoods(int i2) {
        ob obVarA = ob.a(this.hazardousGoods_.d(i2));
        return obVarA == null ? ob.HAZARDOUS_GOODS_TYPE_UNSPECIFIED : obVarA;
    }

    public int getHazardousGoodsCount() {
        return this.hazardousGoods_.size();
    }

    public List<ob> getHazardousGoodsList() {
        return new com.google.v.em(this.hazardousGoods_, hazardousGoods_converter_);
    }

    public bm getNumTrailers(int i2) {
        return this.numTrailers_.get(i2);
    }

    public int getNumTrailersCount() {
        return this.numTrailers_.size();
    }

    public List<bm> getNumTrailersList() {
        return this.numTrailers_;
    }

    public bn getNumTrailersOrBuilder(int i2) {
        return this.numTrailers_.get(i2);
    }

    public List<? extends bn> getNumTrailersOrBuilderList() {
        return this.numTrailers_;
    }

    public mm getTollPass(int i2) {
        mm mmVarA = mm.a(this.tollPass_.d(i2));
        return mmVarA == null ? mm.TOLL_PASS_TYPE_UNSPECIFIED : mmVarA;
    }

    public int getTollPassCount() {
        return this.tollPass_.size();
    }

    public List<mm> getTollPassList() {
        return new com.google.v.em(this.tollPass_, tollPass_converter_);
    }

    public cl getTrailerLength(int i2) {
        return this.trailerLength_.get(i2);
    }

    public int getTrailerLengthCount() {
        return this.trailerLength_.size();
    }

    public List<cl> getTrailerLengthList() {
        return this.trailerLength_;
    }

    public cm getTrailerLengthOrBuilder(int i2) {
        return this.trailerLength_.get(i2);
    }

    public List<? extends cm> getTrailerLengthOrBuilderList() {
        return this.trailerLength_;
    }

    public od getVehicleEmissionsCategory(int i2) {
        od odVarA = od.a(this.vehicleEmissionsCategory_.d(i2));
        return odVarA == null ? od.VEHICLE_EMISSIONS_CATEGORY_UNSPECIFIED : odVarA;
    }

    public int getVehicleEmissionsCategoryCount() {
        return this.vehicleEmissionsCategory_.size();
    }

    public List<od> getVehicleEmissionsCategoryList() {
        return new com.google.v.em(this.vehicleEmissionsCategory_, vehicleEmissionsCategory_converter_);
    }

    public cl getVehicleHeight(int i2) {
        return this.vehicleHeight_.get(i2);
    }

    public int getVehicleHeightCount() {
        return this.vehicleHeight_.size();
    }

    public List<cl> getVehicleHeightList() {
        return this.vehicleHeight_;
    }

    public cm getVehicleHeightOrBuilder(int i2) {
        return this.vehicleHeight_.get(i2);
    }

    public List<? extends cm> getVehicleHeightOrBuilderList() {
        return this.vehicleHeight_;
    }

    public cl getVehicleLength(int i2) {
        return this.vehicleLength_.get(i2);
    }

    public int getVehicleLengthCount() {
        return this.vehicleLength_.size();
    }

    public List<cl> getVehicleLengthList() {
        return this.vehicleLength_;
    }

    public cm getVehicleLengthOrBuilder(int i2) {
        return this.vehicleLength_.get(i2);
    }

    public List<? extends cm> getVehicleLengthOrBuilderList() {
        return this.vehicleLength_;
    }

    public og getVehicleType(int i2) {
        og ogVarA = og.a(this.vehicleType_.d(i2));
        return ogVarA == null ? og.UNKNOWN : ogVarA;
    }

    public int getVehicleTypeCount() {
        return this.vehicleType_.size();
    }

    public List<og> getVehicleTypeList() {
        return new com.google.v.em(this.vehicleType_, vehicleType_converter_);
    }

    public ol getVehicleWeight(int i2) {
        return this.vehicleWeight_.get(i2);
    }

    public int getVehicleWeightCount() {
        return this.vehicleWeight_.size();
    }

    public List<ol> getVehicleWeightList() {
        return this.vehicleWeight_;
    }

    public om getVehicleWeightOrBuilder(int i2) {
        return this.vehicleWeight_.get(i2);
    }

    public List<? extends om> getVehicleWeightOrBuilderList() {
        return this.vehicleWeight_;
    }

    public cl getVehicleWidth(int i2) {
        return this.vehicleWidth_.get(i2);
    }

    public int getVehicleWidthCount() {
        return this.vehicleWidth_.size();
    }

    public List<cl> getVehicleWidthList() {
        return this.vehicleWidth_;
    }

    public cm getVehicleWidthOrBuilder(int i2) {
        return this.vehicleWidth_.get(i2);
    }

    public List<? extends cm> getVehicleWidthOrBuilderList() {
        return this.vehicleWidth_;
    }

    public boolean hasHasTrailer() {
        return (this.bitField0_ & 1) != 0;
    }

    public static oa newBuilder(oc ocVar) {
        return (oa) DEFAULT_INSTANCE.createBuilder(ocVar);
    }

    public static oc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oc parseFrom(com.google.v.z zVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAxleCount(bm bmVar) {
        Objects.requireNonNull(bmVar);
        ensureAxleCountIsMutable();
        this.axleCount_.add(bmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumTrailers(bm bmVar) {
        Objects.requireNonNull(bmVar);
        ensureNumTrailersIsMutable();
        this.numTrailers_.add(bmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrailerLength(cl clVar) {
        Objects.requireNonNull(clVar);
        ensureTrailerLengthIsMutable();
        this.trailerLength_.add(clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleHeight(cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleHeightIsMutable();
        this.vehicleHeight_.add(clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleLength(cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleLengthIsMutable();
        this.vehicleLength_.add(clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleWeight(ol olVar) {
        Objects.requireNonNull(olVar);
        ensureVehicleWeightIsMutable();
        this.vehicleWeight_.add(olVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleWidth(cl clVar) {
        Objects.requireNonNull(clVar);
        ensureVehicleWidthIsMutable();
        this.vehicleWidth_.add(clVar);
    }

    public static oc parseFrom(InputStream inputStream) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oc parseFrom(ByteBuffer byteBuffer) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oc parseFrom(byte[] bArr) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
