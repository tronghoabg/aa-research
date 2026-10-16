package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cu extends com.google.v.du<cu, ct> implements com.google.v.fj {
    private static final cu DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<cu> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    public static final int VENUE_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String venueId_ = "";
    private String entryPointName_ = "";
    private String venueName_ = "";

    static {
        cu cuVar = new cu();
        DEFAULT_INSTANCE = cuVar;
        com.google.v.du.registerDefaultInstance(cu.class, cuVar);
    }

    private cu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointName() {
        this.bitField0_ &= -3;
        this.entryPointName_ = getDefaultInstance().getEntryPointName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -2;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueName() {
        this.bitField0_ &= -5;
        this.venueName_ = getDefaultInstance().getVenueName();
    }

    public static cu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cu parseDelimitedFrom(InputStream inputStream) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(com.google.v.v vVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.entryPointName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointNameBytes(com.google.v.v vVar) {
        this.entryPointName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.venueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueNameBytes(com.google.v.v vVar) {
        this.venueName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "venueId_", "entryPointName_", "venueName_"});
        }
        if (iOrdinal == 3) {
            return new cu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ct(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getEntryPointName() {
        return this.entryPointName_;
    }

    public com.google.v.v getEntryPointNameBytes() {
        return com.google.v.v.s(this.entryPointName_);
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public String getVenueName() {
        return this.venueName_;
    }

    public com.google.v.v getVenueNameBytes() {
        return com.google.v.v.s(this.venueName_);
    }

    public boolean hasEntryPointName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenueName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ct newBuilder(cu cuVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cuVar);
    }

    public static cu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cu parseFrom(com.google.v.z zVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cu parseFrom(InputStream inputStream) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(ByteBuffer byteBuffer) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cu parseFrom(byte[] bArr) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
