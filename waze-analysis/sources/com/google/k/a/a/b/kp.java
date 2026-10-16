package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kp extends com.google.v.du<kp, ko> implements kq {
    public static final int AGENCY_FIELD_NUMBER = 1;
    private static final kp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kp> PARSER = null;
    public static final int STATION_CODE_FIELD_NUMBER = 2;
    private bw agency_;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String stationCode_ = "";

    static {
        kp kpVar = new kp();
        DEFAULT_INSTANCE = kpVar;
        com.google.v.du.registerDefaultInstance(kp.class, kpVar);
    }

    private kp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgency() {
        this.agency_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStationCode() {
        this.bitField0_ &= -3;
        this.stationCode_ = getDefaultInstance().getStationCode();
    }

    public static kp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgency(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.agency_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.agency_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static ko newBuilder() {
        return (ko) DEFAULT_INSTANCE.createBuilder();
    }

    public static kp parseDelimitedFrom(InputStream inputStream) {
        return (kp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kp parseFrom(com.google.v.v vVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgency(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.agency_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStationCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.stationCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStationCodeBytes(com.google.v.v vVar) {
        this.stationCode_ = vVar.u();
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "agency_", "stationCode_"});
            case 3:
                return new kp();
            case 4:
                return new ko(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<kp> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (kp.class) {
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

    public bw getAgency() {
        bw bwVar = this.agency_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public String getStationCode() {
        return this.stationCode_;
    }

    public com.google.v.v getStationCodeBytes() {
        return com.google.v.v.s(this.stationCode_);
    }

    public boolean hasAgency() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStationCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ko newBuilder(kp kpVar) {
        return (ko) DEFAULT_INSTANCE.createBuilder(kpVar);
    }

    public static kp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kp parseFrom(com.google.v.z zVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kp parseFrom(InputStream inputStream) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kp parseFrom(ByteBuffer byteBuffer) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kp parseFrom(byte[] bArr) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
