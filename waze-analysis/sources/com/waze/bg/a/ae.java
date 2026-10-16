package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes6.dex */
public final class ae extends com.google.v.du<ae, ad> implements fj {
    public static final int CREATION_TIME_MILLIS_FIELD_NUMBER = 2;
    private static final ae DEFAULT_INSTANCE;
    public static final int LENGTH_METERS_FIELD_NUMBER = 1;
    private static volatile fo<ae> PARSER;
    private int bitField0_;
    private long creationTimeMillis_;
    private long lengthMeters_;

    static {
        ae aeVar = new ae();
        DEFAULT_INSTANCE = aeVar;
        com.google.v.du.registerDefaultInstance(ae.class, aeVar);
    }

    private ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTimeMillis() {
        this.bitField0_ &= -3;
        this.creationTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -2;
        this.lengthMeters_ = 0L;
    }

    public static ae getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ad newBuilder() {
        return (ad) DEFAULT_INSTANCE.createBuilder();
    }

    public static ae parseDelimitedFrom(InputStream inputStream) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(com.google.v.v vVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ae> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTimeMillis(long j2) {
        this.bitField0_ |= 2;
        this.creationTimeMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(long j2) {
        this.bitField0_ |= 1;
        this.lengthMeters_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "lengthMeters_", "creationTimeMillis_"});
        }
        if (iOrdinal == 3) {
            return new ae();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ad(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ae> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ae.class) {
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

    public boolean hasCreationTimeMillis() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLengthMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ad newBuilder(ae aeVar) {
        return (ad) DEFAULT_INSTANCE.createBuilder(aeVar);
    }

    public static ae parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ae parseFrom(com.google.v.z zVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ae parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ae parseFrom(InputStream inputStream) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(ByteBuffer byteBuffer) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ae parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ae parseFrom(byte[] bArr) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ae parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ae) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
