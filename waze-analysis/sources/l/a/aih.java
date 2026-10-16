package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aih extends com.google.v.du<aih, aid> implements com.google.v.fj {
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final aih DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_JUNCTION_METERS_FIELD_NUMBER = 2;
    public static final int MAP_HEIGHT_PIXELS_FIELD_NUMBER = 3;
    public static final int MAP_WIDTH_PIXELS_FIELD_NUMBER = 4;
    public static final int OBJECTS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<aih> PARSER;
    private int bitField0_;
    private afx coordinates_;
    private long distanceToJunctionMeters_;
    private long mapHeightPixels_;
    private long mapWidthPixels_;
    private com.google.v.eo<aif> objects_ = emptyProtobufList();

    static {
        aih aihVar = new aih();
        DEFAULT_INSTANCE = aihVar;
        com.google.v.du.registerDefaultInstance(aih.class, aihVar);
    }

    private aih() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllObjects(Iterable<? extends aif> iterable) {
        ensureObjectsIsMutable();
        com.google.v.c.addAll(iterable, this.objects_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObjects(int i2, aif aifVar) {
        Objects.requireNonNull(aifVar);
        ensureObjectsIsMutable();
        this.objects_.add(i2, aifVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToJunctionMeters() {
        this.bitField0_ &= -3;
        this.distanceToJunctionMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapHeightPixels() {
        this.bitField0_ &= -5;
        this.mapHeightPixels_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapWidthPixels() {
        this.bitField0_ &= -9;
        this.mapWidthPixels_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjects() {
        this.objects_ = emptyProtobufList();
    }

    private void ensureObjectsIsMutable() {
        com.google.v.eo<aif> eoVar = this.objects_;
        if (eoVar.c()) {
            return;
        }
        this.objects_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static aih getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.coordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.coordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static aid newBuilder() {
        return (aid) DEFAULT_INSTANCE.createBuilder();
    }

    public static aih parseDelimitedFrom(InputStream inputStream) {
        return (aih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aih parseFrom(com.google.v.v vVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aih> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeObjects(int i2) {
        ensureObjectsIsMutable();
        this.objects_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToJunctionMeters(long j2) {
        this.bitField0_ |= 2;
        this.distanceToJunctionMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapHeightPixels(long j2) {
        this.bitField0_ |= 4;
        this.mapHeightPixels_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapWidthPixels(long j2) {
        this.bitField0_ |= 8;
        this.mapWidthPixels_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjects(int i2, aif aifVar) {
        Objects.requireNonNull(aifVar);
        ensureObjectsIsMutable();
        this.objects_.set(i2, aifVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"bitField0_", "coordinates_", "distanceToJunctionMeters_", "mapHeightPixels_", "mapWidthPixels_", "objects_", aif.class});
        }
        if (iOrdinal == 3) {
            return new aih();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aid(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aih> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aih.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getDistanceToJunctionMeters() {
        return this.distanceToJunctionMeters_;
    }

    public long getMapHeightPixels() {
        return this.mapHeightPixels_;
    }

    public long getMapWidthPixels() {
        return this.mapWidthPixels_;
    }

    public aif getObjects(int i2) {
        return this.objects_.get(i2);
    }

    public int getObjectsCount() {
        return this.objects_.size();
    }

    public List<aif> getObjectsList() {
        return this.objects_;
    }

    public aig getObjectsOrBuilder(int i2) {
        return this.objects_.get(i2);
    }

    public List<? extends aig> getObjectsOrBuilderList() {
        return this.objects_;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceToJunctionMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMapHeightPixels() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMapWidthPixels() {
        return (this.bitField0_ & 8) != 0;
    }

    public static aid newBuilder(aih aihVar) {
        return (aid) DEFAULT_INSTANCE.createBuilder(aihVar);
    }

    public static aih parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aih parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aih parseFrom(com.google.v.z zVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aih parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObjects(aif aifVar) {
        Objects.requireNonNull(aifVar);
        ensureObjectsIsMutable();
        this.objects_.add(aifVar);
    }

    public static aih parseFrom(InputStream inputStream) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aih parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aih parseFrom(ByteBuffer byteBuffer) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aih parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aih parseFrom(byte[] bArr) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aih parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
