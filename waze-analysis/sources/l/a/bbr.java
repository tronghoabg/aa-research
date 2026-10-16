package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbr extends com.google.v.du<bbr, bbp> implements com.google.v.fj {
    private static final bbr DEFAULT_INSTANCE;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 3;
    public static final int DEST_VENUE_ID_FIELD_NUMBER = 2;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bbr> PARSER = null;
    public static final int USER_CURRENT_COORDINATES_FIELD_NUMBER = 4;
    private int bitField0_;
    private String destVenueId_ = "";
    private afx destinationCoordinates_;
    private int method_;
    private afx userCurrentCoordinates_;

    static {
        bbr bbrVar = new bbr();
        DEFAULT_INSTANCE = bbrVar;
        com.google.v.du.registerDefaultInstance(bbr.class, bbrVar);
    }

    private bbr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestVenueId() {
        this.destVenueId_ = getDefaultInstance().getDestVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCurrentCoordinates() {
        this.userCurrentCoordinates_ = null;
        this.bitField0_ &= -3;
    }

    public static bbr getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserCurrentCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.userCurrentCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.userCurrentCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static bbp newBuilder() {
        return (bbp) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbr parseDelimitedFrom(InputStream inputStream) {
        return (bbr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbr parseFrom(com.google.v.v vVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestVenueId(String str) {
        Objects.requireNonNull(str);
        this.destVenueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.destVenueId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(bbq bbqVar) {
        this.method_ = bbqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodValue(int i2) {
        this.method_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCurrentCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.userCurrentCoordinates_ = afxVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "method_", "destVenueId_", "destinationCoordinates_", "userCurrentCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new bbr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDestVenueId() {
        return this.destVenueId_;
    }

    public com.google.v.v getDestVenueIdBytes() {
        return com.google.v.v.s(this.destVenueId_);
    }

    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public bbq getMethod() {
        int i2 = this.method_;
        bbq bbqVar = i2 != 0 ? i2 != 1 ? null : bbq.MANUAL : bbq.METHOD_UNSPECIFIED;
        return bbqVar == null ? bbq.UNRECOGNIZED : bbqVar;
    }

    public int getMethodValue() {
        return this.method_;
    }

    public afx getUserCurrentCoordinates() {
        afx afxVar = this.userCurrentCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasDestinationCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserCurrentCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bbp newBuilder(bbr bbrVar) {
        return (bbp) DEFAULT_INSTANCE.createBuilder(bbrVar);
    }

    public static bbr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbr parseFrom(com.google.v.z zVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbr parseFrom(InputStream inputStream) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbr parseFrom(ByteBuffer byteBuffer) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbr parseFrom(byte[] bArr) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
