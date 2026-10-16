package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gs extends com.google.v.du<gs, gr> implements com.google.v.fj {
    public static final int BEST_FIELD_NUMBER = 1;
    private static final gs DEFAULT_INSTANCE;
    public static final int NATURAL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<gs> PARSER = null;
    public static final int PREFERRED_FIELD_NUMBER = 3;
    private boolean best_;
    private int bitField0_;
    private boolean natural_;
    private boolean preferred_;

    static {
        gs gsVar = new gs();
        DEFAULT_INSTANCE = gsVar;
        com.google.v.du.registerDefaultInstance(gs.class, gsVar);
    }

    private gs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBest() {
        this.bitField0_ &= -2;
        this.best_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNatural() {
        this.bitField0_ &= -3;
        this.natural_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferred() {
        this.bitField0_ &= -5;
        this.preferred_ = false;
    }

    public static gs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gr newBuilder() {
        return (gr) DEFAULT_INSTANCE.createBuilder();
    }

    public static gs parseDelimitedFrom(InputStream inputStream) {
        return (gs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gs parseFrom(com.google.v.v vVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBest(boolean z) {
        this.bitField0_ |= 1;
        this.best_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNatural(boolean z) {
        this.bitField0_ |= 2;
        this.natural_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferred(boolean z) {
        this.bitField0_ |= 4;
        this.preferred_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "best_", "natural_", "preferred_"});
        }
        if (iOrdinal == 3) {
            return new gs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBest() {
        return this.best_;
    }

    public boolean getNatural() {
        return this.natural_;
    }

    public boolean getPreferred() {
        return this.preferred_;
    }

    public boolean hasBest() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNatural() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPreferred() {
        return (this.bitField0_ & 4) != 0;
    }

    public static gr newBuilder(gs gsVar) {
        return (gr) DEFAULT_INSTANCE.createBuilder(gsVar);
    }

    public static gs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gs parseFrom(com.google.v.z zVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gs parseFrom(InputStream inputStream) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gs parseFrom(ByteBuffer byteBuffer) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gs parseFrom(byte[] bArr) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
