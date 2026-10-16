package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class km extends com.google.v.du<km, kk> implements com.google.v.fj {
    public static final int AGENCY_FIELD_NUMBER = 1;
    private static final km DEFAULT_INSTANCE;
    public static final int LABEL_BACKGROUND_COLOR_FIELD_NUMBER = 4;
    public static final int LABEL_TEXT_COLOR_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<km> PARSER = null;
    public static final int STATIONS_FIELD_NUMBER = 7;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int labelBackgroundColor_;
    private int labelTextColor_;
    private int vehicleType_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> agency_ = emptyProtobufList();
    private com.google.v.eo<bw> stations_ = emptyProtobufList();

    static {
        km kmVar = new km();
        DEFAULT_INSTANCE = kmVar;
        com.google.v.du.registerDefaultInstance(km.class, kmVar);
    }

    private km() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgency(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureAgencyIsMutable();
        this.agency_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAgency(Iterable<? extends bw> iterable) {
        ensureAgencyIsMutable();
        com.google.v.c.addAll(iterable, this.agency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStations(Iterable<? extends bw> iterable) {
        ensureStationsIsMutable();
        com.google.v.c.addAll(iterable, this.stations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStations(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureStationsIsMutable();
        this.stations_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgency() {
        this.agency_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelBackgroundColor() {
        this.bitField0_ &= -3;
        this.labelBackgroundColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelTextColor() {
        this.bitField0_ &= -5;
        this.labelTextColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStations() {
        this.stations_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.bitField0_ &= -2;
        this.vehicleType_ = 0;
    }

    private void ensureAgencyIsMutable() {
        com.google.v.eo<bw> eoVar = this.agency_;
        if (eoVar.c()) {
            return;
        }
        this.agency_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureStationsIsMutable() {
        com.google.v.eo<bw> eoVar = this.stations_;
        if (eoVar.c()) {
            return;
        }
        this.stations_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static km getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kk newBuilder() {
        return (kk) DEFAULT_INSTANCE.createBuilder();
    }

    public static km parseDelimitedFrom(InputStream inputStream) {
        return (km) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static km parseFrom(com.google.v.v vVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<km> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAgency(int i2) {
        ensureAgencyIsMutable();
        this.agency_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStations(int i2) {
        ensureStationsIsMutable();
        this.stations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgency(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureAgencyIsMutable();
        this.agency_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBackgroundColor(int i2) {
        this.bitField0_ |= 2;
        this.labelBackgroundColor_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelTextColor(int i2) {
        this.bitField0_ |= 4;
        this.labelTextColor_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStations(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureStationsIsMutable();
        this.stations_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(kl klVar) {
        this.vehicleType_ = klVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0002\u0001Л\u0003᠌\u0000\u0004ဆ\u0001\u0005ဆ\u0002\u0007Л", new Object[]{"bitField0_", "agency_", bw.class, "vehicleType_", ka.f11675e, "labelBackgroundColor_", "labelTextColor_", "stations_", bw.class});
            case 3:
                return new km();
            case 4:
                return new kk(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<km> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (km.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public bw getAgency(int i2) {
        return this.agency_.get(i2);
    }

    public int getAgencyCount() {
        return this.agency_.size();
    }

    public List<bw> getAgencyList() {
        return this.agency_;
    }

    public bx getAgencyOrBuilder(int i2) {
        return this.agency_.get(i2);
    }

    public List<? extends bx> getAgencyOrBuilderList() {
        return this.agency_;
    }

    public int getLabelBackgroundColor() {
        return this.labelBackgroundColor_;
    }

    public int getLabelTextColor() {
        return this.labelTextColor_;
    }

    public bw getStations(int i2) {
        return this.stations_.get(i2);
    }

    public int getStationsCount() {
        return this.stations_.size();
    }

    public List<bw> getStationsList() {
        return this.stations_;
    }

    public bx getStationsOrBuilder(int i2) {
        return this.stations_.get(i2);
    }

    public List<? extends bx> getStationsOrBuilderList() {
        return this.stations_;
    }

    public kl getVehicleType() {
        kl klVarA = kl.a(this.vehicleType_);
        return klVarA == null ? kl.VEHICLE_TYPE_ANY : klVarA;
    }

    public boolean hasLabelBackgroundColor() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLabelTextColor() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVehicleType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kk newBuilder(km kmVar) {
        return (kk) DEFAULT_INSTANCE.createBuilder(kmVar);
    }

    public static km parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (km) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static km parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static km parseFrom(com.google.v.z zVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static km parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgency(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureAgencyIsMutable();
        this.agency_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStations(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureStationsIsMutable();
        this.stations_.add(bwVar);
    }

    public static km parseFrom(InputStream inputStream) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static km parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static km parseFrom(ByteBuffer byteBuffer) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static km parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static km parseFrom(byte[] bArr) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static km parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
