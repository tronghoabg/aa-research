package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jb extends com.google.v.du<jb, ja> implements com.google.v.fj {
    public static final int BASE_GAIA_ID_FIELD_NUMBER = 1;
    public static final int CLAIMED_GAIA_ID_FIELD_NUMBER = 3;
    private static final jb DEFAULT_INSTANCE;
    public static final int GAIA_ID_FOR_DISPLAY_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<jb> PARSER;
    private long baseGaiaId_;
    private int bitField0_;
    private long claimedGaiaId_;
    private long gaiaIdForDisplay_;

    static {
        jb jbVar = new jb();
        DEFAULT_INSTANCE = jbVar;
        com.google.v.du.registerDefaultInstance(jb.class, jbVar);
    }

    private jb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseGaiaId() {
        this.bitField0_ &= -2;
        this.baseGaiaId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClaimedGaiaId() {
        this.bitField0_ &= -5;
        this.claimedGaiaId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaiaIdForDisplay() {
        this.bitField0_ &= -3;
        this.gaiaIdForDisplay_ = 0L;
    }

    public static jb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ja newBuilder() {
        return (ja) DEFAULT_INSTANCE.createBuilder();
    }

    public static jb parseDelimitedFrom(InputStream inputStream) {
        return (jb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jb parseFrom(com.google.v.v vVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseGaiaId(long j2) {
        this.bitField0_ |= 1;
        this.baseGaiaId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClaimedGaiaId(long j2) {
        this.bitField0_ |= 4;
        this.claimedGaiaId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaiaIdForDisplay(long j2) {
        this.bitField0_ |= 2;
        this.gaiaIdForDisplay_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "baseGaiaId_", "gaiaIdForDisplay_", "claimedGaiaId_"});
        }
        if (iOrdinal == 3) {
            return new jb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ja(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBaseGaiaId() {
        return this.baseGaiaId_;
    }

    public long getClaimedGaiaId() {
        return this.claimedGaiaId_;
    }

    public long getGaiaIdForDisplay() {
        return this.gaiaIdForDisplay_;
    }

    public boolean hasBaseGaiaId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClaimedGaiaId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGaiaIdForDisplay() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ja newBuilder(jb jbVar) {
        return (ja) DEFAULT_INSTANCE.createBuilder(jbVar);
    }

    public static jb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jb parseFrom(com.google.v.z zVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jb parseFrom(InputStream inputStream) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jb parseFrom(ByteBuffer byteBuffer) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jb parseFrom(byte[] bArr) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
