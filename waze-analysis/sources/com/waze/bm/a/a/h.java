package com.waze.bm.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends du<h, g> implements i {
    public static final int CANDIDATE_ORDINAL_ID_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int IS_ON_ROUTE_FIELD_NUMBER = 4;
    private static volatile fo<h> PARSER = null;
    public static final int REFERENCE_NAME_FIELD_NUMBER = 2;
    public static final int STREET_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isOnRoute_;
    private String candidateOrdinalId_ = "";
    private String referenceName_ = "";
    private String streetName_ = "";

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCandidateOrdinalId() {
        this.bitField0_ &= -2;
        this.candidateOrdinalId_ = getDefaultInstance().getCandidateOrdinalId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOnRoute() {
        this.bitField0_ &= -9;
        this.isOnRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferenceName() {
        this.bitField0_ &= -3;
        this.referenceName_ = getDefaultInstance().getReferenceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.bitField0_ &= -5;
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandidateOrdinalId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.candidateOrdinalId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandidateOrdinalIdBytes(com.google.v.v vVar) {
        this.candidateOrdinalId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnRoute(boolean z) {
        this.bitField0_ |= 8;
        this.isOnRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.referenceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceNameBytes(com.google.v.v vVar) {
        this.referenceName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(com.google.v.v vVar) {
        this.streetName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "candidateOrdinalId_", "referenceName_", "streetName_", "isOnRoute_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCandidateOrdinalId() {
        return this.candidateOrdinalId_;
    }

    public com.google.v.v getCandidateOrdinalIdBytes() {
        return com.google.v.v.s(this.candidateOrdinalId_);
    }

    public boolean getIsOnRoute() {
        return this.isOnRoute_;
    }

    public String getReferenceName() {
        return this.referenceName_;
    }

    public com.google.v.v getReferenceNameBytes() {
        return com.google.v.v.s(this.referenceName_);
    }

    public String getStreetName() {
        return this.streetName_;
    }

    public com.google.v.v getStreetNameBytes() {
        return com.google.v.v.s(this.streetName_);
    }

    public boolean hasCandidateOrdinalId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsOnRoute() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasReferenceName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStreetName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
