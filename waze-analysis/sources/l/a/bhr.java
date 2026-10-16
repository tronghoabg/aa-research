package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhr extends com.google.v.du<bhr, bhq> implements com.google.v.fj {
    private static final bhr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bhr> PARSER = null;
    public static final int SURFACED_LOCATION_INFO_FIELD_NUMBER = 1;
    public static final int USER_COORDINATES_FIELD_NUMBER = 2;
    private int bitField0_;
    private bhn surfacedLocationInfo_;
    private afx userCoordinates_;

    static {
        bhr bhrVar = new bhr();
        DEFAULT_INSTANCE = bhrVar;
        com.google.v.du.registerDefaultInstance(bhr.class, bhrVar);
    }

    private bhr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfacedLocationInfo() {
        this.surfacedLocationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCoordinates() {
        this.userCoordinates_ = null;
        this.bitField0_ &= -3;
    }

    public static bhr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSurfacedLocationInfo(bhn bhnVar) {
        Objects.requireNonNull(bhnVar);
        bhn bhnVar2 = this.surfacedLocationInfo_;
        if (bhnVar2 != null && bhnVar2 != bhn.getDefaultInstance()) {
            bhm bhmVarNewBuilder = bhn.newBuilder(bhnVar2);
            bhmVarNewBuilder.mergeFrom((bhm) bhnVar);
            bhnVar = bhmVarNewBuilder.buildPartial();
        }
        this.surfacedLocationInfo_ = bhnVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.userCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.userCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static bhq newBuilder() {
        return (bhq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhr parseDelimitedFrom(InputStream inputStream) {
        return (bhr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhr parseFrom(com.google.v.v vVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfacedLocationInfo(bhn bhnVar) {
        Objects.requireNonNull(bhnVar);
        this.surfacedLocationInfo_ = bhnVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.userCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "surfacedLocationInfo_", "userCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new bhr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bhn getSurfacedLocationInfo() {
        bhn bhnVar = this.surfacedLocationInfo_;
        return bhnVar == null ? bhn.getDefaultInstance() : bhnVar;
    }

    public afx getUserCoordinates() {
        afx afxVar = this.userCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasSurfacedLocationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bhq newBuilder(bhr bhrVar) {
        return (bhq) DEFAULT_INSTANCE.createBuilder(bhrVar);
    }

    public static bhr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhr parseFrom(com.google.v.z zVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhr parseFrom(InputStream inputStream) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhr parseFrom(ByteBuffer byteBuffer) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhr parseFrom(byte[] bArr) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
