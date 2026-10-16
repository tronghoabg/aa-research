package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends com.google.v.du<n, m> implements fj {
    public static final int CAPPING_HOURS_FIELD_NUMBER = 2;
    private static final n DEFAULT_INSTANCE;
    public static final int MAX_APPEARANCES_BEFORE_CAPPING_FIELD_NUMBER = 1;
    private static volatile fo<n> PARSER;
    private int bitField0_;
    private int cappingHours_;
    private int maxAppearancesBeforeCapping_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.v.du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCappingHours() {
        this.bitField0_ &= -3;
        this.cappingHours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAppearancesBeforeCapping() {
        this.bitField0_ &= -2;
        this.maxAppearancesBeforeCapping_ = 0;
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(com.google.v.v vVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCappingHours(int i2) {
        this.bitField0_ |= 2;
        this.cappingHours_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAppearancesBeforeCapping(int i2) {
        this.bitField0_ |= 1;
        this.maxAppearancesBeforeCapping_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "maxAppearancesBeforeCapping_", "cappingHours_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCappingHours() {
        return this.cappingHours_;
    }

    public int getMaxAppearancesBeforeCapping() {
        return this.maxAppearancesBeforeCapping_;
    }

    public boolean hasCappingHours() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMaxAppearancesBeforeCapping() {
        return (this.bitField0_ & 1) != 0;
    }

    public static m newBuilder(n nVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(com.google.v.z zVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
