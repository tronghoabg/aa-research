package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ds extends com.google.v.du<ds, dr> implements fj {
    public static final int CREATION_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final ds DEFAULT_INSTANCE;
    public static final int LENGTH_METERS_FIELD_NUMBER = 2;
    private static volatile fo<ds> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long creationTimeMillis_;
    private long lengthMeters_;
    private int type_;

    static {
        ds dsVar = new ds();
        DEFAULT_INSTANCE = dsVar;
        com.google.v.du.registerDefaultInstance(ds.class, dsVar);
    }

    private ds() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTimeMillis() {
        this.bitField0_ &= -5;
        this.creationTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -3;
        this.lengthMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dr newBuilder() {
        return (dr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ds parseDelimitedFrom(InputStream inputStream) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(com.google.v.v vVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ds> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTimeMillis(long j2) {
        this.bitField0_ |= 4;
        this.creationTimeMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(long j2) {
        this.bitField0_ |= 2;
        this.lengthMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bs bsVar) {
        this.type_ = bsVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "type_", o.m, "lengthMeters_", "creationTimeMillis_"});
        }
        if (iOrdinal == 3) {
            return new ds();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ds> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ds.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCreationTimeMillis() {
        return this.creationTimeMillis_;
    }

    public long getLengthMeters() {
        return this.lengthMeters_;
    }

    public bs getType() {
        bs bsVarA = bs.a(this.type_);
        return bsVarA == null ? bs.CRASH_PRONE_UNSPECIFIED : bsVarA;
    }

    public boolean hasCreationTimeMillis() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLengthMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dr newBuilder(ds dsVar) {
        return (dr) DEFAULT_INSTANCE.createBuilder(dsVar);
    }

    public static ds parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ds parseFrom(com.google.v.z zVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ds parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ds parseFrom(InputStream inputStream) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(ByteBuffer byteBuffer) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ds parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ds parseFrom(byte[] bArr) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ds parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
