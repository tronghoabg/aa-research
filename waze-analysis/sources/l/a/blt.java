package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class blt extends com.google.v.du<blt, bls> implements com.google.v.fj {
    private static final blt DEFAULT_INSTANCE;
    public static final int DESTINATION_ICON_LOCATION_FIELD_NUMBER = 1;
    public static final int LABELS_LOCATIONS_FIELD_NUMBER = 4;
    public static final int ORIGIN_ICON_LOCATION_FIELD_NUMBER = 2;
    public static final int PARKING_ICON_LOCATION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<blt> PARSER;
    private int bitField0_;
    private iu destinationIconLocation_;
    private com.google.v.eo<iu> labelsLocations_ = emptyProtobufList();
    private iu originIconLocation_;
    private iu parkingIconLocation_;

    static {
        blt bltVar = new blt();
        DEFAULT_INSTANCE = bltVar;
        com.google.v.du.registerDefaultInstance(blt.class, bltVar);
    }

    private blt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabelsLocations(Iterable<? extends iu> iterable) {
        ensureLabelsLocationsIsMutable();
        com.google.v.c.addAll(iterable, this.labelsLocations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabelsLocations(int i2, iu iuVar) {
        Objects.requireNonNull(iuVar);
        ensureLabelsLocationsIsMutable();
        this.labelsLocations_.add(i2, iuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationIconLocation() {
        this.destinationIconLocation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelsLocations() {
        this.labelsLocations_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginIconLocation() {
        this.originIconLocation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingIconLocation() {
        this.parkingIconLocation_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureLabelsLocationsIsMutable() {
        com.google.v.eo<iu> eoVar = this.labelsLocations_;
        if (eoVar.c()) {
            return;
        }
        this.labelsLocations_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static blt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationIconLocation(iu iuVar) {
        Objects.requireNonNull(iuVar);
        iu iuVar2 = this.destinationIconLocation_;
        if (iuVar2 != null && iuVar2 != iu.getDefaultInstance()) {
            it itVarNewBuilder = iu.newBuilder(iuVar2);
            itVarNewBuilder.mergeFrom((it) iuVar);
            iuVar = itVarNewBuilder.buildPartial();
        }
        this.destinationIconLocation_ = iuVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOriginIconLocation(iu iuVar) {
        Objects.requireNonNull(iuVar);
        iu iuVar2 = this.originIconLocation_;
        if (iuVar2 != null && iuVar2 != iu.getDefaultInstance()) {
            it itVarNewBuilder = iu.newBuilder(iuVar2);
            itVarNewBuilder.mergeFrom((it) iuVar);
            iuVar = itVarNewBuilder.buildPartial();
        }
        this.originIconLocation_ = iuVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingIconLocation(iu iuVar) {
        Objects.requireNonNull(iuVar);
        iu iuVar2 = this.parkingIconLocation_;
        if (iuVar2 != null && iuVar2 != iu.getDefaultInstance()) {
            it itVarNewBuilder = iu.newBuilder(iuVar2);
            itVarNewBuilder.mergeFrom((it) iuVar);
            iuVar = itVarNewBuilder.buildPartial();
        }
        this.parkingIconLocation_ = iuVar;
        this.bitField0_ |= 4;
    }

    public static bls newBuilder() {
        return (bls) DEFAULT_INSTANCE.createBuilder();
    }

    public static blt parseDelimitedFrom(InputStream inputStream) {
        return (blt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blt parseFrom(com.google.v.v vVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<blt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabelsLocations(int i2) {
        ensureLabelsLocationsIsMutable();
        this.labelsLocations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationIconLocation(iu iuVar) {
        Objects.requireNonNull(iuVar);
        this.destinationIconLocation_ = iuVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelsLocations(int i2, iu iuVar) {
        Objects.requireNonNull(iuVar);
        ensureLabelsLocationsIsMutable();
        this.labelsLocations_.set(i2, iuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginIconLocation(iu iuVar) {
        Objects.requireNonNull(iuVar);
        this.originIconLocation_ = iuVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingIconLocation(iu iuVar) {
        Objects.requireNonNull(iuVar);
        this.parkingIconLocation_ = iuVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"bitField0_", "destinationIconLocation_", "originIconLocation_", "parkingIconLocation_", "labelsLocations_", iu.class});
        }
        if (iOrdinal == 3) {
            return new blt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bls(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<blt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (blt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public iu getDestinationIconLocation() {
        iu iuVar = this.destinationIconLocation_;
        return iuVar == null ? iu.getDefaultInstance() : iuVar;
    }

    public iu getLabelsLocations(int i2) {
        return this.labelsLocations_.get(i2);
    }

    public int getLabelsLocationsCount() {
        return this.labelsLocations_.size();
    }

    public List<iu> getLabelsLocationsList() {
        return this.labelsLocations_;
    }

    public iv getLabelsLocationsOrBuilder(int i2) {
        return this.labelsLocations_.get(i2);
    }

    public List<? extends iv> getLabelsLocationsOrBuilderList() {
        return this.labelsLocations_;
    }

    public iu getOriginIconLocation() {
        iu iuVar = this.originIconLocation_;
        return iuVar == null ? iu.getDefaultInstance() : iuVar;
    }

    public iu getParkingIconLocation() {
        iu iuVar = this.parkingIconLocation_;
        return iuVar == null ? iu.getDefaultInstance() : iuVar;
    }

    public boolean hasDestinationIconLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOriginIconLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParkingIconLocation() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bls newBuilder(blt bltVar) {
        return (bls) DEFAULT_INSTANCE.createBuilder(bltVar);
    }

    public static blt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static blt parseFrom(com.google.v.z zVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static blt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabelsLocations(iu iuVar) {
        Objects.requireNonNull(iuVar);
        ensureLabelsLocationsIsMutable();
        this.labelsLocations_.add(iuVar);
    }

    public static blt parseFrom(InputStream inputStream) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blt parseFrom(ByteBuffer byteBuffer) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static blt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static blt parseFrom(byte[] bArr) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static blt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (blt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
