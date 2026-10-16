package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqr extends com.google.v.du<aqr, aqq> implements com.google.v.fj {
    public static final int COLLAPSED_FIELD_NUMBER = 1;
    public static final int CURRENT_ETA_FIELD_NUMBER = 2;
    private static final aqr DEFAULT_INSTANCE;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 3;
    public static final int NUM_PHOTOS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<aqr> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean collapsed_;
    private afx destinationCoordinates_;
    private long numPhotos_;
    private String currentEta_ = "";
    private String venueId_ = "";

    static {
        aqr aqrVar = new aqr();
        DEFAULT_INSTANCE = aqrVar;
        com.google.v.du.registerDefaultInstance(aqr.class, aqrVar);
    }

    private aqr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollapsed() {
        this.bitField0_ &= -2;
        this.collapsed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentEta() {
        this.currentEta_ = getDefaultInstance().getCurrentEta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumPhotos() {
        this.bitField0_ &= -5;
        this.numPhotos_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static aqr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.destinationCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static aqq newBuilder() {
        return (aqq) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqr parseDelimitedFrom(InputStream inputStream) {
        return (aqr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqr parseFrom(com.google.v.v vVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollapsed(boolean z) {
        this.bitField0_ |= 1;
        this.collapsed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentEta(String str) {
        Objects.requireNonNull(str);
        this.currentEta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentEtaBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.currentEta_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumPhotos(long j2) {
        this.bitField0_ |= 4;
        this.numPhotos_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဂ\u0002\u0005Ȉ", new Object[]{"bitField0_", "collapsed_", "currentEta_", "destinationCoordinates_", "numPhotos_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new aqr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCollapsed() {
        return this.collapsed_;
    }

    public String getCurrentEta() {
        return this.currentEta_;
    }

    public com.google.v.v getCurrentEtaBytes() {
        return com.google.v.v.s(this.currentEta_);
    }

    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getNumPhotos() {
        return this.numPhotos_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasCollapsed() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDestinationCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNumPhotos() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aqq newBuilder(aqr aqrVar) {
        return (aqq) DEFAULT_INSTANCE.createBuilder(aqrVar);
    }

    public static aqr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqr parseFrom(com.google.v.z zVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqr parseFrom(InputStream inputStream) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqr parseFrom(ByteBuffer byteBuffer) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqr parseFrom(byte[] bArr) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
