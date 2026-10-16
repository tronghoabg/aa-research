package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gw extends com.google.v.du<gw, gv> implements com.google.v.fj {
    public static final int AREA_ENTER_COORDINATES_FIELD_NUMBER = 1;
    private static final gw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gw> PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 2;
    private afx areaEnterCoordinates_;
    private int bitField0_;
    private long segmentId_;

    static {
        gw gwVar = new gw();
        DEFAULT_INSTANCE = gwVar;
        com.google.v.du.registerDefaultInstance(gw.class, gwVar);
    }

    private gw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaEnterCoordinates() {
        this.areaEnterCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.bitField0_ &= -3;
        this.segmentId_ = 0L;
    }

    public static gw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAreaEnterCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.areaEnterCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.areaEnterCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static gv newBuilder() {
        return (gv) DEFAULT_INSTANCE.createBuilder();
    }

    public static gw parseDelimitedFrom(InputStream inputStream) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(com.google.v.v vVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaEnterCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.areaEnterCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(long j2) {
        this.bitField0_ |= 2;
        this.segmentId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "areaEnterCoordinates_", "segmentId_"});
        }
        if (iOrdinal == 3) {
            return new gw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getAreaEnterCoordinates() {
        afx afxVar = this.areaEnterCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getSegmentId() {
        return this.segmentId_;
    }

    public boolean hasAreaEnterCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gv newBuilder(gw gwVar) {
        return (gv) DEFAULT_INSTANCE.createBuilder(gwVar);
    }

    public static gw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gw parseFrom(com.google.v.z zVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gw parseFrom(InputStream inputStream) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(ByteBuffer byteBuffer) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gw parseFrom(byte[] bArr) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
