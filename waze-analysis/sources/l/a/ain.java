package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ain extends com.google.v.du<ain, aii> implements com.google.v.fj {
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final ain DEFAULT_INSTANCE;
    public static final int OBJECT_COUNTS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ain> PARSER = null;
    public static final int ZOOM_LEVEL_FIELD_NUMBER = 2;
    private int bitField0_;
    private afx coordinates_;
    private com.google.v.eo<aik> objectCounts_ = emptyProtobufList();
    private float zoomLevel_;

    static {
        ain ainVar = new ain();
        DEFAULT_INSTANCE = ainVar;
        com.google.v.du.registerDefaultInstance(ain.class, ainVar);
    }

    private ain() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllObjectCounts(Iterable<? extends aik> iterable) {
        ensureObjectCountsIsMutable();
        com.google.v.c.addAll(iterable, this.objectCounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObjectCounts(int i2, aik aikVar) {
        Objects.requireNonNull(aikVar);
        ensureObjectCountsIsMutable();
        this.objectCounts_.add(i2, aikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjectCounts() {
        this.objectCounts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoomLevel() {
        this.bitField0_ &= -3;
        this.zoomLevel_ = 0.0f;
    }

    private void ensureObjectCountsIsMutable() {
        com.google.v.eo<aik> eoVar = this.objectCounts_;
        if (eoVar.c()) {
            return;
        }
        this.objectCounts_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ain getDefaultInstance() {
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

    public static aii newBuilder() {
        return (aii) DEFAULT_INSTANCE.createBuilder();
    }

    public static ain parseDelimitedFrom(InputStream inputStream) {
        return (ain) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ain parseFrom(com.google.v.v vVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ain> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeObjectCounts(int i2) {
        ensureObjectCountsIsMutable();
        this.objectCounts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjectCounts(int i2, aik aikVar) {
        Objects.requireNonNull(aikVar);
        ensureObjectCountsIsMutable();
        this.objectCounts_.set(i2, aikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoomLevel(float f2) {
        this.bitField0_ |= 2;
        this.zoomLevel_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003\u001b", new Object[]{"bitField0_", "coordinates_", "zoomLevel_", "objectCounts_", aik.class});
        }
        if (iOrdinal == 3) {
            return new ain();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aii(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ain> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ain.class) {
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

    public aik getObjectCounts(int i2) {
        return this.objectCounts_.get(i2);
    }

    public int getObjectCountsCount() {
        return this.objectCounts_.size();
    }

    public List<aik> getObjectCountsList() {
        return this.objectCounts_;
    }

    public ail getObjectCountsOrBuilder(int i2) {
        return this.objectCounts_.get(i2);
    }

    public List<? extends ail> getObjectCountsOrBuilderList() {
        return this.objectCounts_;
    }

    public float getZoomLevel() {
        return this.zoomLevel_;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasZoomLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aii newBuilder(ain ainVar) {
        return (aii) DEFAULT_INSTANCE.createBuilder(ainVar);
    }

    public static ain parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ain) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ain parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ain parseFrom(com.google.v.z zVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ain parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObjectCounts(aik aikVar) {
        Objects.requireNonNull(aikVar);
        ensureObjectCountsIsMutable();
        this.objectCounts_.add(aikVar);
    }

    public static ain parseFrom(InputStream inputStream) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ain parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ain parseFrom(ByteBuffer byteBuffer) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ain parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ain parseFrom(byte[] bArr) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ain parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ain) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
